package dk.sdu.mmmi.tjep.ast;

import dk.sdu.mmmi.tjep.BT;
import dk.sdu.mmmi.tjep.Env;

public class TBinOp extends TExp {

	BT bt;
	TExp left, right;
	String op;
	
	public TBinOp(BT bt, TExp left, String op, TExp right) {
		super();
		this.bt = bt;
		this.left = left;
		this.right = right;
		this.op = op;
	}

	@Override
	public TExp eval(Env env) {
		TExp left1 = left.eval(env);
		TExp right1 = right.eval(env);
		if(bt==BT.S)
			return new NumericValue(applyOperator(op,left1,right1));
		else
			return new TBinOp(BT.Top, left1.residualize(), op, right1.residualize());
	}
	
	private int applyOperator(String op, TExp left, TExp right) {
		if(!(left instanceof NumericValue)) throw new Error("Left binop arg not value: "+left);
		if(!(right instanceof NumericValue)) throw new Error("Right binop arg not value: "+left);
		int x = ((NumericValue)left).value;
		int y = ((NumericValue)right).value;
		switch(op.charAt(0)) {
		case '+': return x+y;
		case '-': return x-y;
		case '*': return x*y;
		case '/': return x/y;
		case '<': return x<y ? 1 : 0;
		case '>': return x>y ? 1 : 0;
		case '=': return x==y ? 1 : 0;
		default: throw new Error("Unknown operator: "+op);
		}
	}

	@Override
	public String toString() {
		return "(" + left + bt+asString(op) + right + ")";
	}

	private String asString(String op) {
		if(bt==BT.S)
			return "/*S*/"+op;
		else
			return op;
	}
	
	// Auto-generated

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bt == null) ? 0 : bt.hashCode());
		result = prime * result + ((left == null) ? 0 : left.hashCode());
		result = prime * result + ((op == null) ? 0 : op.hashCode());
		result = prime * result + ((right == null) ? 0 : right.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TBinOp other = (TBinOp) obj;
		if (bt == null) {
			if (other.bt != null)
				return false;
		} else if (!bt.equals(other.bt))
			return false;
		if (left == null) {
			if (other.left != null)
				return false;
		} else if (!left.equals(other.left))
			return false;
		if (op == null) {
			if (other.op != null)
				return false;
		} else if (!op.equals(other.op))
			return false;
		if (right == null) {
			if (other.right != null)
				return false;
		} else if (!right.equals(other.right))
			return false;
		return true;
	}
	
}
