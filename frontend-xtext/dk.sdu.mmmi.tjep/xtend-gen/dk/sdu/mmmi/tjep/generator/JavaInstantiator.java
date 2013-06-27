package dk.sdu.mmmi.tjep.generator;

import com.google.common.base.Objects;
import dk.sdu.mmmi.tjep.tJ.AnnotatedExpr;
import dk.sdu.mmmi.tjep.tJ.BT;
import dk.sdu.mmmi.tjep.tJ.BinOp;
import dk.sdu.mmmi.tjep.tJ.Clazz;
import dk.sdu.mmmi.tjep.tJ.Condition;
import dk.sdu.mmmi.tjep.tJ.Constant;
import dk.sdu.mmmi.tjep.tJ.Constructor;
import dk.sdu.mmmi.tjep.tJ.Dynamic;
import dk.sdu.mmmi.tjep.tJ.DynamicValue;
import dk.sdu.mmmi.tjep.tJ.Expr;
import dk.sdu.mmmi.tjep.tJ.Field;
import dk.sdu.mmmi.tjep.tJ.FieldAssign;
import dk.sdu.mmmi.tjep.tJ.Instantiation;
import dk.sdu.mmmi.tjep.tJ.LiftExp;
import dk.sdu.mmmi.tjep.tJ.LocalAssign;
import dk.sdu.mmmi.tjep.tJ.Member;
import dk.sdu.mmmi.tjep.tJ.Method;
import dk.sdu.mmmi.tjep.tJ.MethodCall;
import dk.sdu.mmmi.tjep.tJ.ObjectOp;
import dk.sdu.mmmi.tjep.tJ.Parameter;
import dk.sdu.mmmi.tjep.tJ.Primitive;
import dk.sdu.mmmi.tjep.tJ.Program;
import dk.sdu.mmmi.tjep.tJ.Return;
import dk.sdu.mmmi.tjep.tJ.Scenario;
import dk.sdu.mmmi.tjep.tJ.SingleExpr;
import dk.sdu.mmmi.tjep.tJ.Statement;
import dk.sdu.mmmi.tjep.tJ.Static;
import dk.sdu.mmmi.tjep.tJ.This;
import dk.sdu.mmmi.tjep.tJ.Type;
import dk.sdu.mmmi.tjep.tJ.VarDecl;
import dk.sdu.mmmi.tjep.tJ.VarRef;
import dk.sdu.mmmi.tjep.tJ.While;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;

@SuppressWarnings("all")
public class JavaInstantiator {
  public CharSequence output(final Program p, final Scenario s) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _pkgname = p.getPkgname();
    _builder.append(_pkgname, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("import dk.sdu.mmmi.tjep.BT;");
    _builder.newLine();
    _builder.append("import dk.sdu.mmmi.tjep.Scenario;");
    _builder.newLine();
    _builder.append("import dk.sdu.mmmi.tjep.ast.*;");
    _builder.newLine();
    _builder.append("public class ");
    String _name = s.getName();
    _builder.append(_name, "");
    _builder.append(" extends Scenario {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("public TStatement[] getScenario() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return new TStatement[] {");
    _builder.newLine();
    {
      EList<Statement> _target = s.getTarget();
      boolean _hasElements = false;
      for(final Statement stmt : _target) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "			");
        }
        _builder.append("\t\t\t");
        CharSequence _output = this.output(stmt);
        _builder.append(_output, "			");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("};");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    {
      EList<Statement> _assertion = s.getAssertion();
      int _size = _assertion.size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        _builder.append("\t");
        _builder.append("public TStatement[] getAssertion() {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return new TStatement[] {");
        _builder.newLine();
        {
          EList<Statement> _assertion_1 = s.getAssertion();
          boolean _hasElements_1 = false;
          for(final Statement stmt_1 : _assertion_1) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate(",", "			");
            }
            _builder.append("\t");
            _builder.append("\t\t");
            CharSequence _output_1 = this.output(stmt_1);
            _builder.append(_output_1, "			");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("};");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("public Program getProgram() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return new Program(\"");
    String _name_1 = s.getName();
    _builder.append(_name_1, "		");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("this.getScenario(),");
    _builder.newLine();
    _builder.append("new TType[] {");
    _builder.newLine();
    {
      EList<Type> _types = p.getTypes();
      boolean _hasElements_2 = false;
      for(final Type t : _types) {
        if (!_hasElements_2) {
          _hasElements_2 = true;
        } else {
          _builder.appendImmediate(",", "");
        }
        CharSequence _output_2 = this.output(t);
        _builder.append(_output_2, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("});");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _outputBT(final Static b) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("BT.S");
    return _builder;
  }
  
  protected CharSequence _outputBT(final Dynamic b) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("BT.D");
    return _builder;
  }
  
  protected CharSequence _outputBT(final Void b) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("BT.Bot");
    return _builder;
  }
  
  protected CharSequence _outputBT(final Member m) {
    StringConcatenation _builder = new StringConcatenation();
    {
      BT _bt = m.getBt();
      boolean _notEquals = (!Objects.equal(_bt, null));
      if (_notEquals) {
        BT _bt_1 = m.getBt();
        CharSequence _outputBT = this.outputBT(_bt_1);
        _builder.append(_outputBT, "");
      } else {
        _builder.append("BT.Bot");
      }
    }
    return _builder;
  }
  
  protected CharSequence _outputBT(final Statement s) {
    StringConcatenation _builder = new StringConcatenation();
    {
      BT _bt = s.getBt();
      boolean _notEquals = (!Objects.equal(_bt, null));
      if (_notEquals) {
        BT _bt_1 = s.getBt();
        CharSequence _outputBT = this.outputBT(_bt_1);
        _builder.append(_outputBT, "");
      } else {
        _builder.append("BT.Bot");
      }
    }
    return _builder;
  }
  
  protected CharSequence _outputBT(final AnnotatedExpr e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      BT _bt = e.getBt();
      boolean _notEquals = (!Objects.equal(_bt, null));
      if (_notEquals) {
        BT _bt_1 = e.getBt();
        CharSequence _outputBT = this.outputBT(_bt_1);
        _builder.append(_outputBT, "");
      } else {
        _builder.append("BT.Bot");
      }
    }
    return _builder;
  }
  
  protected CharSequence _output(final Primitive p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("new TPrimitiveType(\"");
    String _name = p.getName();
    _builder.append(_name, "");
    _builder.append("\")");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _output(final Clazz c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("new TClass(\"");
    String _name = c.getName();
    _builder.append(_name, "");
    _builder.append("\",\"");
    Clazz _base = c.getBase();
    String _name_1 = _base.getName();
    _builder.append(_name_1, "");
    _builder.append("\",new TMember[] {");
    _builder.newLineIfNotEmpty();
    {
      EList<Member> _members = c.getMembers();
      boolean _hasElements = false;
      for(final Member m : _members) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "	");
        }
        _builder.append("\t");
        CharSequence _output = this.output(m);
        _builder.append(_output, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("})");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _output(final Field f) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("new TField(");
    CharSequence _outputBT = this.outputBT(f);
    _builder.append(_outputBT, "");
    _builder.append(",");
    {
      boolean _isFinal = f.isFinal();
      if (_isFinal) {
        _builder.append("true");
      } else {
        _builder.append("false");
      }
    }
    _builder.append(",\"");
    Type _type = f.getType();
    String _name = _type.getName();
    _builder.append(_name, "");
    _builder.append("\",\"");
    String _name_1 = f.getName();
    _builder.append(_name_1, "");
    _builder.append("\")");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _output(final Method m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("new TMethod(");
    CharSequence _outputBT = this.outputBT(m);
    _builder.append(_outputBT, "");
    _builder.append(",\"");
    Type _type = m.getType();
    String _name = _type.getName();
    _builder.append(_name, "");
    _builder.append("\",\"");
    String _name_1 = m.getName();
    _builder.append(_name_1, "");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("new TParameter[] { ");
    {
      EList<Parameter> _params = m.getParams();
      boolean _hasElements = false;
      for(final Parameter p : _params) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "	");
        }
        CharSequence _output = this.output(p);
        _builder.append(_output, "	");
      }
    }
    _builder.append(" },");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("new TStatement[] {");
    _builder.newLine();
    {
      EList<Statement> _body = m.getBody();
      boolean _hasElements_1 = false;
      for(final Statement s : _body) {
        if (!_hasElements_1) {
          _hasElements_1 = true;
        } else {
          _builder.appendImmediate(",", "  			");
        }
        _builder.append("  \t\t\t");
        CharSequence _output_1 = this.output(s);
        _builder.append(_output_1, "  			");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("})");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _output(final Constructor c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("new TConstructor(");
    CharSequence _outputBT = this.outputBT(c);
    _builder.append(_outputBT, "");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("new TParameter[] { ");
    {
      EList<Parameter> _params = c.getParams();
      boolean _hasElements = false;
      for(final Parameter p : _params) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "	");
        }
        CharSequence _output = this.output(p);
        _builder.append(_output, "	");
      }
    }
    _builder.append(" },");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("new TStatement[] {");
    _builder.newLine();
    {
      EList<Statement> _body = c.getBody();
      for(final Statement s : _body) {
        _builder.append("\t\t");
        CharSequence _output_1 = this.output(s);
        _builder.append(_output_1, "		");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("})");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _output(final Parameter p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("new TParameter(");
    BT _bt = p.getBt();
    CharSequence _outputBT = this.outputBT(_bt);
    _builder.append(_outputBT, "");
    _builder.append(",\"");
    Type _type = p.getType();
    String _name = _type.getName();
    _builder.append(_name, "");
    _builder.append("\",\"");
    String _name_1 = p.getName();
    _builder.append(_name_1, "");
    _builder.append("\")");
    return _builder;
  }
  
  protected CharSequence _output(final VarDecl v) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("new TVarDecl(");
    CharSequence _outputBT = this.outputBT(v);
    _builder.append(_outputBT, "");
    _builder.append(",\"");
    Type _type = v.getType();
    String _name = _type.getName();
    _builder.append(_name, "");
    _builder.append("\",\"");
    String _name_1 = v.getName();
    _builder.append(_name_1, "");
    _builder.append("\")");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _output(final LocalAssign a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("new TLocalAssign(");
    CharSequence _outputBT = this.outputBT(a);
    _builder.append(_outputBT, "");
    _builder.append(",\"");
    String _name = a.getName();
    _builder.append(_name, "");
    _builder.append("\",");
    Expr _rhs = a.getRhs();
    CharSequence _output = this.output(_rhs);
    _builder.append(_output, "");
    _builder.append(")\t\t");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _output(final FieldAssign a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("new TFieldAssign(");
    CharSequence _outputBT = this.outputBT(a);
    _builder.append(_outputBT, "");
    _builder.append(",");
    {
      String _object = a.getObject();
      boolean _equals = Objects.equal(_object, null);
      if (_equals) {
        _builder.append("new TThis()");
      } else {
        _builder.append("\"");
        String _object_1 = a.getObject();
        _builder.append(_object_1, "");
        _builder.append("\"");
      }
    }
    _builder.append(",\"");
    String _name = a.getName();
    _builder.append(_name, "");
    _builder.append("\",");
    Expr _rhs = a.getRhs();
    CharSequence _output = this.output(_rhs);
    _builder.append(_output, "");
    _builder.append(")\t\t");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _output(final Condition c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("new TConditional(");
    CharSequence _outputBT = this.outputBT(c);
    _builder.append(_outputBT, "");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    Expr _cond = c.getCond();
    CharSequence _output = this.output(_cond);
    _builder.append(_output, "	");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("new TStatement[] {");
    _builder.newLine();
    {
      EList<Statement> _thenBody = c.getThenBody();
      boolean _hasElements = false;
      for(final Statement s : _thenBody) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "		");
        }
        _builder.append("\t\t");
        CharSequence _output_1 = this.output(s);
        _builder.append(_output_1, "		");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("}, new TStatement[] {");
    _builder.newLine();
    {
      EList<Statement> _elseBody = c.getElseBody();
      boolean _hasElements_1 = false;
      for(final Statement s_1 : _elseBody) {
        if (!_hasElements_1) {
          _hasElements_1 = true;
        } else {
          _builder.appendImmediate(",", "		");
        }
        _builder.append("\t\t");
        CharSequence _output_2 = this.output(s_1);
        _builder.append(_output_2, "		");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("})");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _output(final While w) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("new TWhile(");
    CharSequence _outputBT = this.outputBT(w);
    _builder.append(_outputBT, "");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    Expr _cond = w.getCond();
    CharSequence _output = this.output(_cond);
    _builder.append(_output, "	");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("new TStatement[] {");
    _builder.newLine();
    {
      EList<Statement> _body = w.getBody();
      boolean _hasElements = false;
      for(final Statement s : _body) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "		");
        }
        _builder.append("\t\t");
        CharSequence _output_1 = this.output(s);
        _builder.append(_output_1, "		");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("})");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _output(final Return r) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("new TReturn(");
    CharSequence _outputBT = this.outputBT(r);
    _builder.append(_outputBT, "");
    _builder.append(",");
    Expr _exp = r.getExp();
    CharSequence _output = this.output(_exp);
    _builder.append(_output, "");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _output(final SingleExpr s) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("new TSingleExp(");
    CharSequence _outputBT = this.outputBT(s);
    _builder.append(_outputBT, "");
    _builder.append(",");
    Expr _exp = s.getExp();
    CharSequence _output = this.output(_exp);
    _builder.append(_output, "");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _output(final LiftExp e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("new TLift(");
    Expr _exp = e.getExp();
    CharSequence _output = this.output(_exp);
    _builder.append(_output, "");
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _output(final This e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("new TThis(");
    CharSequence _outputBT = this.outputBT(e);
    _builder.append(_outputBT, "");
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _output(final AnnotatedExpr e) {
    BT _bt = e.getBt();
    return this.outputAE(e, _bt);
  }
  
  protected CharSequence _outputAE(final MethodCall c, final BT b) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("new TCall(");
    CharSequence _outputBT = this.outputBT(b);
    _builder.append(_outputBT, "");
    _builder.append(",");
    ObjectOp _target = c.getTarget();
    CharSequence _outputCall = this.outputCall(_target, b);
    _builder.append(_outputCall, "");
    _builder.append(",");
    EList<Expr> _argument = c.getArgument();
    CharSequence _output = this.output(_argument);
    _builder.append(_output, "");
    _builder.append(")");
    return _builder;
  }
  
  public CharSequence outputCall(final ObjectOp o, final BT b) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Clazz _qualifier = o.getQualifier();
      boolean _notEquals = (!Objects.equal(_qualifier, null));
      if (_notEquals) {
        _builder.append("\"");
        Clazz _qualifier_1 = o.getQualifier();
        String _name = _qualifier_1.getName();
        _builder.append(_name, "");
        _builder.append("\"");
      } else {
        _builder.append("null");
      }
    }
    _builder.append(",");
    {
      String _object = o.getObject();
      boolean _notEquals_1 = (!Objects.equal(_object, null));
      if (_notEquals_1) {
        _builder.append("\"");
        String _object_1 = o.getObject();
        _builder.append(_object_1, "");
        _builder.append("\"");
      } else {
        _builder.append("new TThis()");
      }
    }
    _builder.append(",\"");
    String _name_1 = o.getName();
    _builder.append(_name_1, "");
    _builder.append("\"");
    return _builder;
  }
  
  protected CharSequence _outputAE(final ObjectOp o, final BT b) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("new TFieldRef(");
    CharSequence _outputBT = this.outputBT(b);
    _builder.append(_outputBT, "");
    _builder.append(",");
    {
      String _object = o.getObject();
      boolean _notEquals = (!Objects.equal(_object, null));
      if (_notEquals) {
        _builder.append("\"");
        String _object_1 = o.getObject();
        _builder.append(_object_1, "");
        _builder.append("\"");
      } else {
        _builder.append("new TThis(");
        CharSequence _outputBT_1 = this.outputBT(b);
        _builder.append(_outputBT_1, "");
        _builder.append(")");
      }
    }
    _builder.append(",\"");
    String _name = o.getName();
    _builder.append(_name, "");
    _builder.append("\")");
    return _builder;
  }
  
  protected CharSequence _outputAE(final Instantiation i, final BT b) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("new TNew(");
    CharSequence _outputBT = this.outputBT(b);
    _builder.append(_outputBT, "");
    _builder.append(",\"");
    Clazz _type = i.getType();
    String _name = _type.getName();
    _builder.append(_name, "");
    _builder.append("\",");
    EList<Expr> _argument = i.getArgument();
    CharSequence _output = this.output(_argument);
    _builder.append(_output, "");
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _outputAE(final AnnotatedExpr e, final BT b) {
    EObject _exp = e.getExp();
    BT _bt = e.getBt();
    return this.outputAE(_exp, _bt);
  }
  
  protected CharSequence _output(final EList<Expr> args) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("new TExp[] { ");
    {
      boolean _hasElements = false;
      for(final Expr a : args) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "");
        }
        CharSequence _output = this.output(a);
        _builder.append(_output, "");
      }
    }
    _builder.append("}");
    return _builder;
  }
  
  protected CharSequence _output(final BinOp b) {
    EObject _rhs = b.getRhs();
    boolean _equals = Objects.equal(_rhs, null);
    if (_equals) {
      String _op = b.getOp();
      boolean _equals_1 = Objects.equal(_op, null);
      if (_equals_1) {
        EObject _lhs = b.getLhs();
        return this.output(_lhs);
      } else {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("new TUnaryOp(");
        String _op_1 = b.getOp();
        String _operatorBT = this.operatorBT(_op_1);
        _builder.append(_operatorBT, "");
        _builder.append(",\"");
        String _op_2 = b.getOp();
        String _removeBT = this.removeBT(_op_2);
        _builder.append(_removeBT, "");
        _builder.append("\",");
        EObject _lhs_1 = b.getLhs();
        CharSequence _output = this.output(_lhs_1);
        _builder.append(_output, "");
        _builder.append(")");
        return _builder;
      }
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("new TBinOp(");
      String _op_3 = b.getOp();
      String _operatorBT_1 = this.operatorBT(_op_3);
      _builder_1.append(_operatorBT_1, "");
      _builder_1.append(",");
      EObject _lhs_2 = b.getLhs();
      CharSequence _output_1 = this.output(_lhs_2);
      _builder_1.append(_output_1, "");
      _builder_1.append(",\"");
      String _op_4 = b.getOp();
      String _removeBT_1 = this.removeBT(_op_4);
      _builder_1.append(_removeBT_1, "");
      _builder_1.append("\",");
      EObject _rhs_1 = b.getRhs();
      CharSequence _output_2 = this.output(_rhs_1);
      _builder_1.append(_output_2, "");
      _builder_1.append(")");
      return _builder_1;
    }
  }
  
  protected CharSequence _output(final Constant c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("new TConstant(");
    int _value = c.getValue();
    _builder.append(_value, "");
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _output(final VarRef v) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("new TVarRef(");
    BT _bt = v.getBt();
    CharSequence _outputBT = this.outputBT(_bt);
    _builder.append(_outputBT, "");
    _builder.append(",\"");
    String _name = v.getName();
    _builder.append(_name, "");
    _builder.append("\")");
    return _builder;
  }
  
  protected CharSequence _output(final DynamicValue d) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("new DynamicValue(\"");
    Type _type = d.getType();
    String _name = _type.getName();
    _builder.append(_name, "");
    _builder.append("\",\"");
    String _name_1 = d.getName();
    _builder.append(_name_1, "");
    _builder.append("\")");
    return _builder;
  }
  
  public String operatorBT(final String op) {
    try {
      boolean _and = false;
      boolean _startsWith = op.startsWith("$");
      if (!_startsWith) {
        _and = false;
      } else {
        String _substring = op.substring(1);
        boolean _contains = this.operators.contains(_substring);
        _and = (_startsWith && _contains);
      }
      if (_and) {
        return "BT.S";
      } else {
        boolean _and_1 = false;
        boolean _startsWith_1 = op.startsWith("?");
        if (!_startsWith_1) {
          _and_1 = false;
        } else {
          String _substring_1 = op.substring(1);
          boolean _contains_1 = this.operators.contains(_substring_1);
          _and_1 = (_startsWith_1 && _contains_1);
        }
        if (_and_1) {
          return "BT.D";
        } else {
          boolean _contains_2 = this.operators.contains(op);
          if (_contains_2) {
            return "BT.Bot";
          } else {
            Error _error = new Error("Unhandled operator");
            throw _error;
          }
        }
      }
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public String removeBT(final String op) {
    String _xifexpression = null;
    boolean _or = false;
    boolean _startsWith = op.startsWith("$");
    if (_startsWith) {
      _or = true;
    } else {
      boolean _startsWith_1 = op.startsWith("?");
      _or = (_startsWith || _startsWith_1);
    }
    if (_or) {
      String _substring = op.substring(1);
      _xifexpression = _substring;
    } else {
      _xifexpression = op;
    }
    return _xifexpression;
  }
  
  private List<String> operators = new Function0<List<String>>() {
    public List<String> apply() {
      ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList("<", ">", "==", "+", "-", "*", "/");
      return _newArrayList;
    }
  }.apply();
  
  public CharSequence outputBT(final EObject e) {
    if (e instanceof AnnotatedExpr) {
      return _outputBT((AnnotatedExpr)e);
    } else if (e instanceof Dynamic) {
      return _outputBT((Dynamic)e);
    } else if (e instanceof Static) {
      return _outputBT((Static)e);
    } else if (e instanceof Member) {
      return _outputBT((Member)e);
    } else if (e instanceof Statement) {
      return _outputBT((Statement)e);
    } else if (e == null) {
      return _outputBT((Void)null);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(e).toString());
    }
  }
  
  public CharSequence output(final Object b) {
    if (b instanceof BinOp) {
      return _output((BinOp)b);
    } else if (b instanceof This) {
      return _output((This)b);
    } else if (b instanceof AnnotatedExpr) {
      return _output((AnnotatedExpr)b);
    } else if (b instanceof LiftExp) {
      return _output((LiftExp)b);
    } else if (b instanceof Clazz) {
      return _output((Clazz)b);
    } else if (b instanceof Condition) {
      return _output((Condition)b);
    } else if (b instanceof Constant) {
      return _output((Constant)b);
    } else if (b instanceof Constructor) {
      return _output((Constructor)b);
    } else if (b instanceof DynamicValue) {
      return _output((DynamicValue)b);
    } else if (b instanceof Field) {
      return _output((Field)b);
    } else if (b instanceof FieldAssign) {
      return _output((FieldAssign)b);
    } else if (b instanceof LocalAssign) {
      return _output((LocalAssign)b);
    } else if (b instanceof Method) {
      return _output((Method)b);
    } else if (b instanceof Primitive) {
      return _output((Primitive)b);
    } else if (b instanceof Return) {
      return _output((Return)b);
    } else if (b instanceof SingleExpr) {
      return _output((SingleExpr)b);
    } else if (b instanceof VarDecl) {
      return _output((VarDecl)b);
    } else if (b instanceof VarRef) {
      return _output((VarRef)b);
    } else if (b instanceof While) {
      return _output((While)b);
    } else if (b instanceof EList) {
      return _output((EList<Expr>)b);
    } else if (b instanceof Parameter) {
      return _output((Parameter)b);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(b).toString());
    }
  }
  
  public CharSequence outputAE(final EObject e, final BT b) {
    if (e instanceof AnnotatedExpr) {
      return _outputAE((AnnotatedExpr)e, b);
    } else if (e instanceof MethodCall) {
      return _outputAE((MethodCall)e, b);
    } else if (e instanceof Instantiation) {
      return _outputAE((Instantiation)e, b);
    } else if (e instanceof ObjectOp) {
      return _outputAE((ObjectOp)e, b);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(e, b).toString());
    }
  }
}
