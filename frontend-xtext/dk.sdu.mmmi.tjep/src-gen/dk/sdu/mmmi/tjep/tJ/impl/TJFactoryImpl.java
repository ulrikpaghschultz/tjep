/**
 */
package dk.sdu.mmmi.tjep.tJ.impl;

import dk.sdu.mmmi.tjep.tJ.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TJFactoryImpl extends EFactoryImpl implements TJFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TJFactory init()
  {
    try
    {
      TJFactory theTJFactory = (TJFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.sdu.dk/mmmi/tjep/TJ"); 
      if (theTJFactory != null)
      {
        return theTJFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TJFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TJFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case TJPackage.PROGRAM: return createProgram();
      case TJPackage.SCENARIO: return createScenario();
      case TJPackage.BT: return createBT();
      case TJPackage.TYPE: return createType();
      case TJPackage.PRIMITIVE: return createPrimitive();
      case TJPackage.CLAZZ: return createClazz();
      case TJPackage.MEMBER: return createMember();
      case TJPackage.FIELD: return createField();
      case TJPackage.METHOD: return createMethod();
      case TJPackage.PARAMETER: return createParameter();
      case TJPackage.CONSTRUCTOR: return createConstructor();
      case TJPackage.STATEMENT: return createStatement();
      case TJPackage.VAR_DECL: return createVarDecl();
      case TJPackage.LOCAL_ASSIGN: return createLocalAssign();
      case TJPackage.FIELD_ASSIGN: return createFieldAssign();
      case TJPackage.CONDITION: return createCondition();
      case TJPackage.WHILE: return createWhile();
      case TJPackage.RETURN: return createReturn();
      case TJPackage.SINGLE_EXPR: return createSingleExpr();
      case TJPackage.EXPR: return createExpr();
      case TJPackage.LIFT_EXP: return createLiftExp();
      case TJPackage.ANNOTATED_EXPR: return createAnnotatedExpr();
      case TJPackage.OBJECT_OP: return createObjectOp();
      case TJPackage.INSTANTIATION: return createInstantiation();
      case TJPackage.ARITH_EXP: return createArithExp();
      case TJPackage.ADDITION: return createAddition();
      case TJPackage.MULTIPLICATION: return createMultiplication();
      case TJPackage.BASE_EXP: return createBaseExp();
      case TJPackage.VAR_REF: return createVarRef();
      case TJPackage.CONSTANT: return createConstant();
      case TJPackage.DYNAMIC_VALUE: return createDynamicValue();
      case TJPackage.STATIC: return createStatic();
      case TJPackage.DYNAMIC: return createDynamic();
      case TJPackage.THIS: return createThis();
      case TJPackage.METHOD_CALL: return createMethodCall();
      case TJPackage.BIN_OP: return createBinOp();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Program createProgram()
  {
    ProgramImpl program = new ProgramImpl();
    return program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Scenario createScenario()
  {
    ScenarioImpl scenario = new ScenarioImpl();
    return scenario;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BT createBT()
  {
    BTImpl bt = new BTImpl();
    return bt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Primitive createPrimitive()
  {
    PrimitiveImpl primitive = new PrimitiveImpl();
    return primitive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Clazz createClazz()
  {
    ClazzImpl clazz = new ClazzImpl();
    return clazz;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Member createMember()
  {
    MemberImpl member = new MemberImpl();
    return member;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Field createField()
  {
    FieldImpl field = new FieldImpl();
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Method createMethod()
  {
    MethodImpl method = new MethodImpl();
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constructor createConstructor()
  {
    ConstructorImpl constructor = new ConstructorImpl();
    return constructor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarDecl createVarDecl()
  {
    VarDeclImpl varDecl = new VarDeclImpl();
    return varDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalAssign createLocalAssign()
  {
    LocalAssignImpl localAssign = new LocalAssignImpl();
    return localAssign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldAssign createFieldAssign()
  {
    FieldAssignImpl fieldAssign = new FieldAssignImpl();
    return fieldAssign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition createCondition()
  {
    ConditionImpl condition = new ConditionImpl();
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public While createWhile()
  {
    WhileImpl while_ = new WhileImpl();
    return while_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Return createReturn()
  {
    ReturnImpl return_ = new ReturnImpl();
    return return_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SingleExpr createSingleExpr()
  {
    SingleExprImpl singleExpr = new SingleExprImpl();
    return singleExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr createExpr()
  {
    ExprImpl expr = new ExprImpl();
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiftExp createLiftExp()
  {
    LiftExpImpl liftExp = new LiftExpImpl();
    return liftExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotatedExpr createAnnotatedExpr()
  {
    AnnotatedExprImpl annotatedExpr = new AnnotatedExprImpl();
    return annotatedExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectOp createObjectOp()
  {
    ObjectOpImpl objectOp = new ObjectOpImpl();
    return objectOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instantiation createInstantiation()
  {
    InstantiationImpl instantiation = new InstantiationImpl();
    return instantiation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArithExp createArithExp()
  {
    ArithExpImpl arithExp = new ArithExpImpl();
    return arithExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Addition createAddition()
  {
    AdditionImpl addition = new AdditionImpl();
    return addition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Multiplication createMultiplication()
  {
    MultiplicationImpl multiplication = new MultiplicationImpl();
    return multiplication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BaseExp createBaseExp()
  {
    BaseExpImpl baseExp = new BaseExpImpl();
    return baseExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarRef createVarRef()
  {
    VarRefImpl varRef = new VarRefImpl();
    return varRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constant createConstant()
  {
    ConstantImpl constant = new ConstantImpl();
    return constant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DynamicValue createDynamicValue()
  {
    DynamicValueImpl dynamicValue = new DynamicValueImpl();
    return dynamicValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Static createStatic()
  {
    StaticImpl static_ = new StaticImpl();
    return static_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public dk.sdu.mmmi.tjep.tJ.Dynamic createDynamic()
  {
    DynamicImpl dynamic = new DynamicImpl();
    return dynamic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public This createThis()
  {
    ThisImpl this_ = new ThisImpl();
    return this_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodCall createMethodCall()
  {
    MethodCallImpl methodCall = new MethodCallImpl();
    return methodCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinOp createBinOp()
  {
    BinOpImpl binOp = new BinOpImpl();
    return binOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TJPackage getTJPackage()
  {
    return (TJPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static TJPackage getPackage()
  {
    return TJPackage.eINSTANCE;
  }

} //TJFactoryImpl
