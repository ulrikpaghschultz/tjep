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
import dk.sdu.mmmi.tjep.tJ.SingleExpr;
import dk.sdu.mmmi.tjep.tJ.Statement;
import dk.sdu.mmmi.tjep.tJ.Static;
import dk.sdu.mmmi.tjep.tJ.This;
import dk.sdu.mmmi.tjep.tJ.Type;
import dk.sdu.mmmi.tjep.tJ.VarDecl;
import dk.sdu.mmmi.tjep.tJ.VarRef;
import dk.sdu.mmmi.tjep.tJ.While;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class Printer {
  protected CharSequence _output(final Program p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _pkgname = p.getPkgname();
    _builder.append(_pkgname, "");
    _builder.newLineIfNotEmpty();
    {
      EList<Type> _types = p.getTypes();
      for(final Type t : _types) {
        _builder.append("  \t");
        CharSequence _output = this.output(t);
        _builder.append(_output, "  	");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _outputBT(final Static b) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("S");
    return _builder;
  }
  
  protected CharSequence _outputBT(final Dynamic b) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("D");
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
        _builder.append(":");
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
        _builder.append(":");
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
      }
    }
    return _builder;
  }
  
  protected CharSequence _output(final Primitive p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("primitive ");
    String _name = p.getName();
    _builder.append(_name, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _output(final Clazz c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("class ");
    String _name = c.getName();
    _builder.append(_name, "");
    _builder.append(" extends ");
    Clazz _base = c.getBase();
    String _name_1 = _base.getName();
    _builder.append(_name_1, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    {
      EList<Member> _members = c.getMembers();
      for(final Member m : _members) {
        _builder.append("\t");
        CharSequence _output = this.output(m);
        _builder.append(_output, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _output(final Field f) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _outputBT = this.outputBT(f);
    _builder.append(_outputBT, "");
    {
      boolean _isFinal = f.isFinal();
      if (_isFinal) {
        _builder.append("final ");
      }
    }
    Type _type = f.getType();
    String _name = _type.getName();
    _builder.append(_name, "");
    _builder.append(" ");
    String _name_1 = f.getName();
    _builder.append(_name_1, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _output(final Method m) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _outputBT = this.outputBT(m);
    _builder.append(_outputBT, "");
    Type _type = m.getType();
    String _name = _type.getName();
    _builder.append(_name, "");
    _builder.append(" ");
    String _name_1 = m.getName();
    _builder.append(_name_1, "");
    _builder.append("(");
    {
      EList<Parameter> _params = m.getParams();
      boolean _hasElements = false;
      for(final Parameter p : _params) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "");
        }
        CharSequence _output = this.output(p);
        _builder.append(_output, "");
      }
    }
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    {
      EList<Statement> _body = m.getBody();
      for(final Statement s : _body) {
        _builder.append("\t");
        CharSequence _output_1 = this.output(s);
        _builder.append(_output_1, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _output(final Constructor c) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _outputBT = this.outputBT(c);
    _builder.append(_outputBT, "");
    Clazz _clazz = c.getClazz();
    String _name = _clazz.getName();
    _builder.append(_name, "");
    _builder.append("(");
    {
      EList<Parameter> _params = c.getParams();
      boolean _hasElements = false;
      for(final Parameter p : _params) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "");
        }
        CharSequence _output = this.output(p);
        _builder.append(_output, "");
      }
    }
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    {
      EList<Statement> _body = c.getBody();
      for(final Statement s : _body) {
        _builder.append("\t");
        CharSequence _output_1 = this.output(s);
        _builder.append(_output_1, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _output(final VarDecl v) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _outputBT = this.outputBT(v);
    _builder.append(_outputBT, "");
    Type _type = v.getType();
    String _name = _type.getName();
    _builder.append(_name, "");
    _builder.append(" ");
    String _name_1 = v.getName();
    _builder.append(_name_1, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _output(final LocalAssign a) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _outputBT = this.outputBT(a);
    _builder.append(_outputBT, "");
    String _name = a.getName();
    _builder.append(_name, "");
    _builder.append(" = ");
    Expr _rhs = a.getRhs();
    CharSequence _output = this.output(_rhs);
    _builder.append(_output, "");
    _builder.append(";\t\t");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _output(final FieldAssign a) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _outputBT = this.outputBT(a);
    _builder.append(_outputBT, "");
    {
      String _object = a.getObject();
      boolean _equals = Objects.equal(_object, null);
      if (_equals) {
        _builder.append("this");
      } else {
        String _object_1 = a.getObject();
        _builder.append(_object_1, "");
      }
    }
    String _name = a.getName();
    _builder.append(_name, "");
    _builder.append(" = ");
    Expr _rhs = a.getRhs();
    CharSequence _output = this.output(_rhs);
    _builder.append(_output, "");
    _builder.append(";\t\t");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _output(final Condition c) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _outputBT = this.outputBT(c);
    _builder.append(_outputBT, "");
    _builder.append("if(");
    Expr _cond = c.getCond();
    CharSequence _output = this.output(_cond);
    _builder.append(_output, "");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    {
      EList<Statement> _thenBody = c.getThenBody();
      for(final Statement s : _thenBody) {
        _builder.append("\t");
        CharSequence _output_1 = this.output(s);
        _builder.append(_output_1, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("} else {");
    _builder.newLine();
    {
      EList<Statement> _elseBody = c.getElseBody();
      for(final Statement s_1 : _elseBody) {
        _builder.append("\t");
        CharSequence _output_2 = this.output(s_1);
        _builder.append(_output_2, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _output(final While w) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _outputBT = this.outputBT(w);
    _builder.append(_outputBT, "");
    _builder.append("while(");
    Expr _cond = w.getCond();
    CharSequence _output = this.output(_cond);
    _builder.append(_output, "");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    {
      EList<Statement> _body = w.getBody();
      for(final Statement s : _body) {
        _builder.append("\t");
        CharSequence _output_1 = this.output(s);
        _builder.append(_output_1, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _output(final Return r) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _outputBT = this.outputBT(r);
    _builder.append(_outputBT, "");
    _builder.append("return ");
    Expr _exp = r.getExp();
    CharSequence _output = this.output(_exp);
    _builder.append(_output, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _output(final SingleExpr s) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _outputBT = this.outputBT(s);
    _builder.append(_outputBT, "");
    Expr _exp = s.getExp();
    CharSequence _output = this.output(_exp);
    _builder.append(_output, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _output(final AnnotatedExpr x) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _outputBT = this.outputBT(x);
    _builder.append(_outputBT, "");
    _builder.append(" ");
    EObject _exp = x.getExp();
    CharSequence _output = this.output(_exp);
    _builder.append(_output, "");
    return _builder;
  }
  
  protected CharSequence _output(final This t) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("this");
    return _builder;
  }
  
  protected CharSequence _output(final LiftExp e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("lift ");
    Expr _exp = e.getExp();
    CharSequence _output = this.output(_exp);
    _builder.append(_output, "");
    return _builder;
  }
  
  protected CharSequence _output(final MethodCall c) {
    StringConcatenation _builder = new StringConcatenation();
    ObjectOp _target = c.getTarget();
    CharSequence _output = this.output(_target);
    _builder.append(_output, "");
    EList<Expr> _argument = c.getArgument();
    CharSequence _output_1 = this.output(_argument);
    _builder.append(_output_1, "");
    return _builder;
  }
  
  protected CharSequence _output(final ObjectOp o) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _object = o.getObject();
      boolean _notEquals = (!Objects.equal(_object, null));
      if (_notEquals) {
        String _object_1 = o.getObject();
        _builder.append(_object_1, "");
      } else {
        _builder.append("this");
      }
    }
    _builder.append(".");
    String _name = o.getName();
    _builder.append(_name, "");
    return _builder;
  }
  
  protected CharSequence _output(final EList<Expr> args) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _notEquals = (!Objects.equal(args, null));
      if (_notEquals) {
        {
          boolean _hasElements = false;
          for(final Expr a : args) {
            if (!_hasElements) {
              _hasElements = true;
              _builder.append("(", "");
            } else {
              _builder.appendImmediate(",", "");
            }
            CharSequence _output = this.output(a);
            _builder.append(_output, "");
          }
          if (_hasElements) {
            _builder.append(")", "");
          }
        }
      }
    }
    return _builder;
  }
  
  protected CharSequence _output(final Parameter p) {
    StringConcatenation _builder = new StringConcatenation();
    {
      BT _bt = p.getBt();
      boolean _notEquals = (!Objects.equal(_bt, null));
      if (_notEquals) {
        BT _bt_1 = p.getBt();
        CharSequence _outputBT = this.outputBT(_bt_1);
        _builder.append(_outputBT, "");
        _builder.append(": ");
      }
    }
    Type _type = p.getType();
    String _name = _type.getName();
    _builder.append(_name, "");
    _builder.append(" ");
    String _name_1 = p.getName();
    _builder.append(_name_1, "");
    return _builder;
  }
  
  protected CharSequence _output(final Instantiation i) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _outputBT = this.outputBT(i);
    _builder.append(_outputBT, "");
    _builder.append("new ");
    Clazz _type = i.getType();
    String _name = _type.getName();
    _builder.append(_name, "");
    EList<Expr> _argument = i.getArgument();
    CharSequence _output = this.output(_argument);
    _builder.append(_output, "");
    return _builder;
  }
  
  protected CharSequence _output(final BinOp b) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EObject _rhs = b.getRhs();
      boolean _equals = Objects.equal(_rhs, null);
      if (_equals) {
        EObject _lhs = b.getLhs();
        CharSequence _output = this.output(_lhs);
        _builder.append(_output, "");
      } else {
        _builder.append("(");
        EObject _lhs_1 = b.getLhs();
        CharSequence _output_1 = this.output(_lhs_1);
        _builder.append(_output_1, "");
        String _op = b.getOp();
        _builder.append(_op, "");
        EObject _rhs_1 = b.getRhs();
        CharSequence _output_2 = this.output(_rhs_1);
        _builder.append(_output_2, "");
        _builder.append(")");
      }
    }
    return _builder;
  }
  
  protected CharSequence _output(final Constant c) {
    StringConcatenation _builder = new StringConcatenation();
    int _value = c.getValue();
    _builder.append(_value, "");
    return _builder;
  }
  
  protected CharSequence _output(final VarRef v) {
    StringConcatenation _builder = new StringConcatenation();
    {
      BT _bt = v.getBt();
      boolean _notEquals = (!Objects.equal(_bt, null));
      if (_notEquals) {
        BT _bt_1 = v.getBt();
        CharSequence _output = this.output(_bt_1);
        _builder.append(_output, "");
      }
    }
    String _name = v.getName();
    _builder.append(_name, "");
    return _builder;
  }
  
  protected CharSequence _output(final DynamicValue d) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("dynamic(");
    Type _type = d.getType();
    String _name = _type.getName();
    _builder.append(_name, "");
    _builder.append(")");
    return _builder;
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
    } else if (b instanceof MethodCall) {
      return _output((MethodCall)b);
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
    } else if (b instanceof Instantiation) {
      return _output((Instantiation)b);
    } else if (b instanceof ObjectOp) {
      return _output((ObjectOp)b);
    } else if (b instanceof Parameter) {
      return _output((Parameter)b);
    } else if (b instanceof Program) {
      return _output((Program)b);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(b).toString());
    }
  }
  
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
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(e).toString());
    }
  }
}
