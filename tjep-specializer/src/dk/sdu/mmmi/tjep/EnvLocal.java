package dk.sdu.mmmi.tjep;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import dk.sdu.mmmi.tjep.ast.ObjectValue;
import dk.sdu.mmmi.tjep.ast.TExp;
import dk.sdu.mmmi.tjep.ast.TParameter;
import dk.sdu.mmmi.tjep.ast.Value;

public class EnvLocal {

	private Env env;
	private EnvLocal enclosing;
	private boolean lexicalNesting = false;
	private Map<String,Value> locals = new HashMap<String,Value>();
	private Stack<Map<String,Value>> saved = new Stack<Map<String, Value>>();
	private ObjectValue self;
	private Value returnValue;
	
	// Create initial local environment, always empty
	public EnvLocal(Env env) {
		this.env = env;
	}
	
	// Create nested local environment
	public EnvLocal(Env env, EnvLocal enclosing, ObjectValue newSelf) {
		this.env = env;
		this.enclosing = enclosing;
		if(newSelf==null) {
			lexicalNesting = true;
			self = enclosing.self;
		} else {
			lexicalNesting = false;
			self = newSelf;
		}
	}

	public Value lookupLocalVar(String name) {
		if(locals.containsKey(name)) return locals.get(name);
		if(enclosing==null) throw new Error("Local variable not found: "+name);
		return enclosing.lookupLocalVar(name);
	}

	public ObjectValue lookupLocalVarAsObject(String name) {
		Value val = lookupLocalVar(name);
		if(!(val instanceof ObjectValue)) throw new Error("Expected object value but got: "+val);
		return (ObjectValue)val;
	}

	public Env createLocalScope(ObjectValue self, TParameter[] parameters, TExp[] args) {
		Env newEnv = env.nestedLocal(self);
		if(parameters.length!=args.length) throw new Error("Inconsistent parameter binding");
		for(int i=0; i<parameters.length; i++) {
			if(parameters[i].getBT()==BT.S) {
				if(!(args[i] instanceof Value)) throw new Error("Illegal binding of static parameter to dynamic argument: "+parameters[i].getVarName()+" to "+args[i]);
				newEnv.local().updateLocalVariable(parameters[i].getVarName(),(Value)args[i]);
			}
		}
		return newEnv;
	}

	public void updateLocalVariable(String name, Value value) {
		locals.put(name, value);
	}

	public void setReturnValue(Value val) {
		returnValue = val;
	}

	public Value getReturnValueMaybe() {
		return returnValue;
	}

	public void addLocalVariable(String typeName, String name) {
		; // Currently a no-op, should be remembered and used to check types
	}

	public ObjectValue getSelf() {
		if(self==null) throw new Error("No self defined in scope");
		return this.self;
	}

	@SuppressWarnings("unchecked")
	public void save() {
		saved.push((Map<String, Value>) ((HashMap<String,Value>)locals).clone());
	}

	public void restore(boolean erase) {
		if(saved.empty())
			throw new Error("Attempting to resotre un-saved local state");
		locals = saved.peek();
		if(erase) saved.pop();
	}

}
