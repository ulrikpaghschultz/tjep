/**
 */
package dk.sdu.mmmi.tjep.tJ;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dk.sdu.mmmi.tjep.tJ.TJFactory
 * @model kind="package"
 * @generated
 */
public interface TJPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "tJ";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.sdu.dk/mmmi/tjep/TJ";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "tJ";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TJPackage eINSTANCE = dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl.init();

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.tjep.tJ.impl.ProgramImpl <em>Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.tjep.tJ.impl.ProgramImpl
   * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getProgram()
   * @generated
   */
  int PROGRAM = 0;

  /**
   * The feature id for the '<em><b>Pkgname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__PKGNAME = 0;

  /**
   * The feature id for the '<em><b>Scenarios</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__SCENARIOS = 1;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__TYPES = 2;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.tjep.tJ.impl.ScenarioImpl <em>Scenario</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.tjep.tJ.impl.ScenarioImpl
   * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getScenario()
   * @generated
   */
  int SCENARIO = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO__NAME = 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO__TARGET = 1;

  /**
   * The feature id for the '<em><b>Assertion</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO__ASSERTION = 2;

  /**
   * The number of structural features of the '<em>Scenario</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.tjep.tJ.impl.BTImpl <em>BT</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.tjep.tJ.impl.BTImpl
   * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getBT()
   * @generated
   */
  int BT = 2;

  /**
   * The number of structural features of the '<em>BT</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.tjep.tJ.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.tjep.tJ.impl.TypeImpl
   * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getType()
   * @generated
   */
  int TYPE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NAME = 0;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.tjep.tJ.impl.PrimitiveImpl <em>Primitive</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.tjep.tJ.impl.PrimitiveImpl
   * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getPrimitive()
   * @generated
   */
  int PRIMITIVE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE__NAME = TYPE__NAME;

  /**
   * The number of structural features of the '<em>Primitive</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.tjep.tJ.impl.ClazzImpl <em>Clazz</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.tjep.tJ.impl.ClazzImpl
   * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getClazz()
   * @generated
   */
  int CLAZZ = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAZZ__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Variant</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAZZ__VARIANT = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Base</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAZZ__BASE = TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAZZ__MEMBERS = TYPE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Clazz</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAZZ_FEATURE_COUNT = TYPE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.tjep.tJ.impl.MemberImpl <em>Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.tjep.tJ.impl.MemberImpl
   * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getMember()
   * @generated
   */
  int MEMBER = 6;

  /**
   * The feature id for the '<em><b>Bt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER__BT = 0;

  /**
   * The number of structural features of the '<em>Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.tjep.tJ.impl.FieldImpl <em>Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.tjep.tJ.impl.FieldImpl
   * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getField()
   * @generated
   */
  int FIELD = 7;

  /**
   * The feature id for the '<em><b>Bt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__BT = MEMBER__BT;

  /**
   * The feature id for the '<em><b>Final</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__FINAL = MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__TYPE = MEMBER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__NAME = MEMBER_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.tjep.tJ.impl.MethodImpl <em>Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.tjep.tJ.impl.MethodImpl
   * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getMethod()
   * @generated
   */
  int METHOD = 8;

  /**
   * The feature id for the '<em><b>Bt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__BT = MEMBER__BT;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__TYPE = MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__NAME = MEMBER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Variant</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__VARIANT = MEMBER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__PARAMS = MEMBER_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__BODY = MEMBER_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.tjep.tJ.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.tjep.tJ.impl.ParameterImpl
   * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 9;

  /**
   * The feature id for the '<em><b>Bt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__BT = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__TYPE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NAME = 2;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.tjep.tJ.impl.ConstructorImpl <em>Constructor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.tjep.tJ.impl.ConstructorImpl
   * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getConstructor()
   * @generated
   */
  int CONSTRUCTOR = 10;

  /**
   * The feature id for the '<em><b>Bt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__BT = MEMBER__BT;

  /**
   * The feature id for the '<em><b>Clazz</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__CLAZZ = MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__PARAMS = MEMBER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__BODY = MEMBER_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Constructor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.tjep.tJ.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.tjep.tJ.impl.StatementImpl
   * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 11;

  /**
   * The feature id for the '<em><b>Bt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__BT = 0;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.tjep.tJ.impl.VarDeclImpl <em>Var Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.tjep.tJ.impl.VarDeclImpl
   * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getVarDecl()
   * @generated
   */
  int VAR_DECL = 12;

  /**
   * The feature id for the '<em><b>Bt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECL__BT = STATEMENT__BT;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECL__TYPE = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Variant</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECL__VARIANT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECL__NAME = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Var Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECL_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.tjep.tJ.impl.LocalAssignImpl <em>Local Assign</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.tjep.tJ.impl.LocalAssignImpl
   * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getLocalAssign()
   * @generated
   */
  int LOCAL_ASSIGN = 13;

  /**
   * The feature id for the '<em><b>Bt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_ASSIGN__BT = STATEMENT__BT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_ASSIGN__NAME = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_ASSIGN__RHS = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Local Assign</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_ASSIGN_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.tjep.tJ.impl.FieldAssignImpl <em>Field Assign</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.tjep.tJ.impl.FieldAssignImpl
   * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getFieldAssign()
   * @generated
   */
  int FIELD_ASSIGN = 14;

  /**
   * The feature id for the '<em><b>Bt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_ASSIGN__BT = STATEMENT__BT;

  /**
   * The feature id for the '<em><b>Object</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_ASSIGN__OBJECT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_ASSIGN__NAME = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_ASSIGN__RHS = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Field Assign</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_ASSIGN_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.tjep.tJ.impl.ConditionImpl <em>Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.tjep.tJ.impl.ConditionImpl
   * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getCondition()
   * @generated
   */
  int CONDITION = 15;

  /**
   * The feature id for the '<em><b>Bt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__BT = STATEMENT__BT;

  /**
   * The feature id for the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__COND = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Then Body</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__THEN_BODY = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Else Body</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__ELSE_BODY = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.tjep.tJ.impl.WhileImpl <em>While</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.tjep.tJ.impl.WhileImpl
   * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getWhile()
   * @generated
   */
  int WHILE = 16;

  /**
   * The feature id for the '<em><b>Bt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE__BT = STATEMENT__BT;

  /**
   * The feature id for the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE__COND = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE__BODY = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>While</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.tjep.tJ.impl.ReturnImpl <em>Return</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.tjep.tJ.impl.ReturnImpl
   * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getReturn()
   * @generated
   */
  int RETURN = 17;

  /**
   * The feature id for the '<em><b>Bt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN__BT = STATEMENT__BT;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN__EXP = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Return</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.tjep.tJ.impl.SingleExprImpl <em>Single Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.tjep.tJ.impl.SingleExprImpl
   * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getSingleExpr()
   * @generated
   */
  int SINGLE_EXPR = 18;

  /**
   * The feature id for the '<em><b>Bt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_EXPR__BT = STATEMENT__BT;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_EXPR__EXP = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Single Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_EXPR_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.tjep.tJ.impl.MultiplicationImpl <em>Multiplication</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.tjep.tJ.impl.MultiplicationImpl
   * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getMultiplication()
   * @generated
   */
  int MULTIPLICATION = 26;

  /**
   * The number of structural features of the '<em>Multiplication</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.tjep.tJ.impl.ExprImpl <em>Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.tjep.tJ.impl.ExprImpl
   * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getExpr()
   * @generated
   */
  int EXPR = 19;

  /**
   * The number of structural features of the '<em>Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_FEATURE_COUNT = MULTIPLICATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.tjep.tJ.impl.LiftExpImpl <em>Lift Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.tjep.tJ.impl.LiftExpImpl
   * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getLiftExp()
   * @generated
   */
  int LIFT_EXP = 20;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIFT_EXP__EXP = EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Lift Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIFT_EXP_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.tjep.tJ.impl.AnnotatedExprImpl <em>Annotated Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.tjep.tJ.impl.AnnotatedExprImpl
   * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getAnnotatedExpr()
   * @generated
   */
  int ANNOTATED_EXPR = 21;

  /**
   * The feature id for the '<em><b>Bt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATED_EXPR__BT = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATED_EXPR__EXP = EXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Annotated Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATED_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.tjep.tJ.impl.ObjectOpImpl <em>Object Op</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.tjep.tJ.impl.ObjectOpImpl
   * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getObjectOp()
   * @generated
   */
  int OBJECT_OP = 22;

  /**
   * The feature id for the '<em><b>Object</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_OP__OBJECT = 0;

  /**
   * The feature id for the '<em><b>Qualifier</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_OP__QUALIFIER = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_OP__NAME = 2;

  /**
   * The feature id for the '<em><b>Variant</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_OP__VARIANT = 3;

  /**
   * The number of structural features of the '<em>Object Op</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_OP_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.tjep.tJ.impl.InstantiationImpl <em>Instantiation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.tjep.tJ.impl.InstantiationImpl
   * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getInstantiation()
   * @generated
   */
  int INSTANTIATION = 23;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANTIATION__TYPE = 0;

  /**
   * The feature id for the '<em><b>Variant</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANTIATION__VARIANT = 1;

  /**
   * The feature id for the '<em><b>Argument</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANTIATION__ARGUMENT = 2;

  /**
   * The number of structural features of the '<em>Instantiation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANTIATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.tjep.tJ.impl.ArithExpImpl <em>Arith Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.tjep.tJ.impl.ArithExpImpl
   * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getArithExp()
   * @generated
   */
  int ARITH_EXP = 24;

  /**
   * The number of structural features of the '<em>Arith Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARITH_EXP_FEATURE_COUNT = EXPR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.tjep.tJ.impl.AdditionImpl <em>Addition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.tjep.tJ.impl.AdditionImpl
   * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getAddition()
   * @generated
   */
  int ADDITION = 25;

  /**
   * The number of structural features of the '<em>Addition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.tjep.tJ.impl.BaseExpImpl <em>Base Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.tjep.tJ.impl.BaseExpImpl
   * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getBaseExp()
   * @generated
   */
  int BASE_EXP = 27;

  /**
   * The number of structural features of the '<em>Base Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_EXP_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.tjep.tJ.impl.VarRefImpl <em>Var Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.tjep.tJ.impl.VarRefImpl
   * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getVarRef()
   * @generated
   */
  int VAR_REF = 28;

  /**
   * The feature id for the '<em><b>Bt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_REF__BT = BASE_EXP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_REF__NAME = BASE_EXP_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Var Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_REF_FEATURE_COUNT = BASE_EXP_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.tjep.tJ.impl.ConstantImpl <em>Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.tjep.tJ.impl.ConstantImpl
   * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getConstant()
   * @generated
   */
  int CONSTANT = 29;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__VALUE = BASE_EXP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_FEATURE_COUNT = BASE_EXP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.tjep.tJ.impl.DynamicValueImpl <em>Dynamic Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.tjep.tJ.impl.DynamicValueImpl
   * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getDynamicValue()
   * @generated
   */
  int DYNAMIC_VALUE = 30;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_VALUE__TYPE = BASE_EXP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_VALUE__NAME = BASE_EXP_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Dynamic Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_VALUE_FEATURE_COUNT = BASE_EXP_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.tjep.tJ.impl.StaticImpl <em>Static</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.tjep.tJ.impl.StaticImpl
   * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getStatic()
   * @generated
   */
  int STATIC = 31;

  /**
   * The number of structural features of the '<em>Static</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_FEATURE_COUNT = BT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.tjep.tJ.impl.DynamicImpl <em>Dynamic</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.tjep.tJ.impl.DynamicImpl
   * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getDynamic()
   * @generated
   */
  int DYNAMIC = 32;

  /**
   * The number of structural features of the '<em>Dynamic</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_FEATURE_COUNT = BT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.tjep.tJ.impl.ThisImpl <em>This</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.tjep.tJ.impl.ThisImpl
   * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getThis()
   * @generated
   */
  int THIS = 33;

  /**
   * The feature id for the '<em><b>Bt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THIS__BT = ANNOTATED_EXPR__BT;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THIS__EXP = ANNOTATED_EXPR__EXP;

  /**
   * The number of structural features of the '<em>This</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THIS_FEATURE_COUNT = ANNOTATED_EXPR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.tjep.tJ.impl.MethodCallImpl <em>Method Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.tjep.tJ.impl.MethodCallImpl
   * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getMethodCall()
   * @generated
   */
  int METHOD_CALL = 34;

  /**
   * The feature id for the '<em><b>Object</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_CALL__OBJECT = OBJECT_OP__OBJECT;

  /**
   * The feature id for the '<em><b>Qualifier</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_CALL__QUALIFIER = OBJECT_OP__QUALIFIER;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_CALL__NAME = OBJECT_OP__NAME;

  /**
   * The feature id for the '<em><b>Variant</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_CALL__VARIANT = OBJECT_OP__VARIANT;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_CALL__TARGET = OBJECT_OP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Argument</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_CALL__ARGUMENT = OBJECT_OP_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Method Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_CALL_FEATURE_COUNT = OBJECT_OP_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.tjep.tJ.impl.BinOpImpl <em>Bin Op</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.tjep.tJ.impl.BinOpImpl
   * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getBinOp()
   * @generated
   */
  int BIN_OP = 35;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIN_OP__LHS = ARITH_EXP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIN_OP__OP = ARITH_EXP_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIN_OP__RHS = ARITH_EXP_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Bin Op</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIN_OP_FEATURE_COUNT = ARITH_EXP_FEATURE_COUNT + 3;


  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.tjep.tJ.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Program</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.Program
   * @generated
   */
  EClass getProgram();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.tjep.tJ.Program#getPkgname <em>Pkgname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pkgname</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.Program#getPkgname()
   * @see #getProgram()
   * @generated
   */
  EAttribute getProgram_Pkgname();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.tjep.tJ.Program#getScenarios <em>Scenarios</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Scenarios</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.Program#getScenarios()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Scenarios();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.tjep.tJ.Program#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Types</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.Program#getTypes()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Types();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.tjep.tJ.Scenario <em>Scenario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scenario</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.Scenario
   * @generated
   */
  EClass getScenario();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.tjep.tJ.Scenario#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.Scenario#getName()
   * @see #getScenario()
   * @generated
   */
  EAttribute getScenario_Name();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.tjep.tJ.Scenario#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Target</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.Scenario#getTarget()
   * @see #getScenario()
   * @generated
   */
  EReference getScenario_Target();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.tjep.tJ.Scenario#getAssertion <em>Assertion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Assertion</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.Scenario#getAssertion()
   * @see #getScenario()
   * @generated
   */
  EReference getScenario_Assertion();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.tjep.tJ.BT <em>BT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BT</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.BT
   * @generated
   */
  EClass getBT();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.tjep.tJ.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.tjep.tJ.Type#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.Type#getName()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Name();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.tjep.tJ.Primitive <em>Primitive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primitive</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.Primitive
   * @generated
   */
  EClass getPrimitive();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.tjep.tJ.Clazz <em>Clazz</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Clazz</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.Clazz
   * @generated
   */
  EClass getClazz();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.tjep.tJ.Clazz#getVariant <em>Variant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variant</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.Clazz#getVariant()
   * @see #getClazz()
   * @generated
   */
  EAttribute getClazz_Variant();

  /**
   * Returns the meta object for the reference '{@link dk.sdu.mmmi.tjep.tJ.Clazz#getBase <em>Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Base</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.Clazz#getBase()
   * @see #getClazz()
   * @generated
   */
  EReference getClazz_Base();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.tjep.tJ.Clazz#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.Clazz#getMembers()
   * @see #getClazz()
   * @generated
   */
  EReference getClazz_Members();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.tjep.tJ.Member <em>Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Member</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.Member
   * @generated
   */
  EClass getMember();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.tjep.tJ.Member#getBt <em>Bt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bt</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.Member#getBt()
   * @see #getMember()
   * @generated
   */
  EReference getMember_Bt();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.tjep.tJ.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.Field
   * @generated
   */
  EClass getField();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.tjep.tJ.Field#isFinal <em>Final</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Final</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.Field#isFinal()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Final();

  /**
   * Returns the meta object for the reference '{@link dk.sdu.mmmi.tjep.tJ.Field#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.Field#getType()
   * @see #getField()
   * @generated
   */
  EReference getField_Type();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.tjep.tJ.Field#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.Field#getName()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Name();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.tjep.tJ.Method <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.Method
   * @generated
   */
  EClass getMethod();

  /**
   * Returns the meta object for the reference '{@link dk.sdu.mmmi.tjep.tJ.Method#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.Method#getType()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Type();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.tjep.tJ.Method#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.Method#getName()
   * @see #getMethod()
   * @generated
   */
  EAttribute getMethod_Name();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.tjep.tJ.Method#getVariant <em>Variant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variant</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.Method#getVariant()
   * @see #getMethod()
   * @generated
   */
  EAttribute getMethod_Variant();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.tjep.tJ.Method#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.Method#getParams()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Params();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.tjep.tJ.Method#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Body</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.Method#getBody()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Body();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.tjep.tJ.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.tjep.tJ.Parameter#getBt <em>Bt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bt</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.Parameter#getBt()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Bt();

  /**
   * Returns the meta object for the reference '{@link dk.sdu.mmmi.tjep.tJ.Parameter#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.Parameter#getType()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Type();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.tjep.tJ.Parameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.Parameter#getName()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Name();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.tjep.tJ.Constructor <em>Constructor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constructor</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.Constructor
   * @generated
   */
  EClass getConstructor();

  /**
   * Returns the meta object for the reference '{@link dk.sdu.mmmi.tjep.tJ.Constructor#getClazz <em>Clazz</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Clazz</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.Constructor#getClazz()
   * @see #getConstructor()
   * @generated
   */
  EReference getConstructor_Clazz();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.tjep.tJ.Constructor#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.Constructor#getParams()
   * @see #getConstructor()
   * @generated
   */
  EReference getConstructor_Params();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.tjep.tJ.Constructor#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Body</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.Constructor#getBody()
   * @see #getConstructor()
   * @generated
   */
  EReference getConstructor_Body();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.tjep.tJ.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.tjep.tJ.Statement#getBt <em>Bt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bt</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.Statement#getBt()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_Bt();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.tjep.tJ.VarDecl <em>Var Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var Decl</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.VarDecl
   * @generated
   */
  EClass getVarDecl();

  /**
   * Returns the meta object for the reference '{@link dk.sdu.mmmi.tjep.tJ.VarDecl#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.VarDecl#getType()
   * @see #getVarDecl()
   * @generated
   */
  EReference getVarDecl_Type();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.tjep.tJ.VarDecl#getVariant <em>Variant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variant</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.VarDecl#getVariant()
   * @see #getVarDecl()
   * @generated
   */
  EAttribute getVarDecl_Variant();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.tjep.tJ.VarDecl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.VarDecl#getName()
   * @see #getVarDecl()
   * @generated
   */
  EAttribute getVarDecl_Name();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.tjep.tJ.LocalAssign <em>Local Assign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Assign</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.LocalAssign
   * @generated
   */
  EClass getLocalAssign();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.tjep.tJ.LocalAssign#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.LocalAssign#getName()
   * @see #getLocalAssign()
   * @generated
   */
  EAttribute getLocalAssign_Name();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.tjep.tJ.LocalAssign#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rhs</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.LocalAssign#getRhs()
   * @see #getLocalAssign()
   * @generated
   */
  EReference getLocalAssign_Rhs();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.tjep.tJ.FieldAssign <em>Field Assign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field Assign</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.FieldAssign
   * @generated
   */
  EClass getFieldAssign();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.tjep.tJ.FieldAssign#getObject <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Object</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.FieldAssign#getObject()
   * @see #getFieldAssign()
   * @generated
   */
  EAttribute getFieldAssign_Object();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.tjep.tJ.FieldAssign#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.FieldAssign#getName()
   * @see #getFieldAssign()
   * @generated
   */
  EAttribute getFieldAssign_Name();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.tjep.tJ.FieldAssign#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rhs</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.FieldAssign#getRhs()
   * @see #getFieldAssign()
   * @generated
   */
  EReference getFieldAssign_Rhs();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.tjep.tJ.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.Condition
   * @generated
   */
  EClass getCondition();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.tjep.tJ.Condition#getCond <em>Cond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cond</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.Condition#getCond()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_Cond();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.tjep.tJ.Condition#getThenBody <em>Then Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Then Body</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.Condition#getThenBody()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_ThenBody();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.tjep.tJ.Condition#getElseBody <em>Else Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Else Body</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.Condition#getElseBody()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_ElseBody();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.tjep.tJ.While <em>While</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>While</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.While
   * @generated
   */
  EClass getWhile();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.tjep.tJ.While#getCond <em>Cond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cond</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.While#getCond()
   * @see #getWhile()
   * @generated
   */
  EReference getWhile_Cond();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.tjep.tJ.While#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Body</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.While#getBody()
   * @see #getWhile()
   * @generated
   */
  EReference getWhile_Body();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.tjep.tJ.Return <em>Return</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Return</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.Return
   * @generated
   */
  EClass getReturn();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.tjep.tJ.Return#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.Return#getExp()
   * @see #getReturn()
   * @generated
   */
  EReference getReturn_Exp();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.tjep.tJ.SingleExpr <em>Single Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Single Expr</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.SingleExpr
   * @generated
   */
  EClass getSingleExpr();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.tjep.tJ.SingleExpr#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.SingleExpr#getExp()
   * @see #getSingleExpr()
   * @generated
   */
  EReference getSingleExpr_Exp();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.tjep.tJ.Expr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.Expr
   * @generated
   */
  EClass getExpr();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.tjep.tJ.LiftExp <em>Lift Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lift Exp</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.LiftExp
   * @generated
   */
  EClass getLiftExp();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.tjep.tJ.LiftExp#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.LiftExp#getExp()
   * @see #getLiftExp()
   * @generated
   */
  EReference getLiftExp_Exp();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.tjep.tJ.AnnotatedExpr <em>Annotated Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotated Expr</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.AnnotatedExpr
   * @generated
   */
  EClass getAnnotatedExpr();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.tjep.tJ.AnnotatedExpr#getBt <em>Bt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bt</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.AnnotatedExpr#getBt()
   * @see #getAnnotatedExpr()
   * @generated
   */
  EReference getAnnotatedExpr_Bt();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.tjep.tJ.AnnotatedExpr#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.AnnotatedExpr#getExp()
   * @see #getAnnotatedExpr()
   * @generated
   */
  EReference getAnnotatedExpr_Exp();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.tjep.tJ.ObjectOp <em>Object Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Op</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.ObjectOp
   * @generated
   */
  EClass getObjectOp();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.tjep.tJ.ObjectOp#getObject <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Object</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.ObjectOp#getObject()
   * @see #getObjectOp()
   * @generated
   */
  EAttribute getObjectOp_Object();

  /**
   * Returns the meta object for the reference '{@link dk.sdu.mmmi.tjep.tJ.ObjectOp#getQualifier <em>Qualifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Qualifier</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.ObjectOp#getQualifier()
   * @see #getObjectOp()
   * @generated
   */
  EReference getObjectOp_Qualifier();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.tjep.tJ.ObjectOp#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.ObjectOp#getName()
   * @see #getObjectOp()
   * @generated
   */
  EAttribute getObjectOp_Name();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.tjep.tJ.ObjectOp#getVariant <em>Variant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variant</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.ObjectOp#getVariant()
   * @see #getObjectOp()
   * @generated
   */
  EAttribute getObjectOp_Variant();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.tjep.tJ.Instantiation <em>Instantiation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instantiation</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.Instantiation
   * @generated
   */
  EClass getInstantiation();

  /**
   * Returns the meta object for the reference '{@link dk.sdu.mmmi.tjep.tJ.Instantiation#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.Instantiation#getType()
   * @see #getInstantiation()
   * @generated
   */
  EReference getInstantiation_Type();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.tjep.tJ.Instantiation#getVariant <em>Variant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variant</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.Instantiation#getVariant()
   * @see #getInstantiation()
   * @generated
   */
  EAttribute getInstantiation_Variant();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.tjep.tJ.Instantiation#getArgument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Argument</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.Instantiation#getArgument()
   * @see #getInstantiation()
   * @generated
   */
  EReference getInstantiation_Argument();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.tjep.tJ.ArithExp <em>Arith Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Arith Exp</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.ArithExp
   * @generated
   */
  EClass getArithExp();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.tjep.tJ.Addition <em>Addition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Addition</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.Addition
   * @generated
   */
  EClass getAddition();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.tjep.tJ.Multiplication <em>Multiplication</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiplication</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.Multiplication
   * @generated
   */
  EClass getMultiplication();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.tjep.tJ.BaseExp <em>Base Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Base Exp</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.BaseExp
   * @generated
   */
  EClass getBaseExp();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.tjep.tJ.VarRef <em>Var Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var Ref</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.VarRef
   * @generated
   */
  EClass getVarRef();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.tjep.tJ.VarRef#getBt <em>Bt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bt</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.VarRef#getBt()
   * @see #getVarRef()
   * @generated
   */
  EReference getVarRef_Bt();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.tjep.tJ.VarRef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.VarRef#getName()
   * @see #getVarRef()
   * @generated
   */
  EAttribute getVarRef_Name();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.tjep.tJ.Constant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.Constant
   * @generated
   */
  EClass getConstant();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.tjep.tJ.Constant#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.Constant#getValue()
   * @see #getConstant()
   * @generated
   */
  EAttribute getConstant_Value();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.tjep.tJ.DynamicValue <em>Dynamic Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dynamic Value</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.DynamicValue
   * @generated
   */
  EClass getDynamicValue();

  /**
   * Returns the meta object for the reference '{@link dk.sdu.mmmi.tjep.tJ.DynamicValue#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.DynamicValue#getType()
   * @see #getDynamicValue()
   * @generated
   */
  EReference getDynamicValue_Type();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.tjep.tJ.DynamicValue#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.DynamicValue#getName()
   * @see #getDynamicValue()
   * @generated
   */
  EAttribute getDynamicValue_Name();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.tjep.tJ.Static <em>Static</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Static</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.Static
   * @generated
   */
  EClass getStatic();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.tjep.tJ.Dynamic <em>Dynamic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dynamic</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.Dynamic
   * @generated
   */
  EClass getDynamic();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.tjep.tJ.This <em>This</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>This</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.This
   * @generated
   */
  EClass getThis();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.tjep.tJ.MethodCall <em>Method Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method Call</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.MethodCall
   * @generated
   */
  EClass getMethodCall();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.tjep.tJ.MethodCall#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.MethodCall#getTarget()
   * @see #getMethodCall()
   * @generated
   */
  EReference getMethodCall_Target();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.tjep.tJ.MethodCall#getArgument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Argument</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.MethodCall#getArgument()
   * @see #getMethodCall()
   * @generated
   */
  EReference getMethodCall_Argument();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.tjep.tJ.BinOp <em>Bin Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bin Op</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.BinOp
   * @generated
   */
  EClass getBinOp();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.tjep.tJ.BinOp#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lhs</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.BinOp#getLhs()
   * @see #getBinOp()
   * @generated
   */
  EReference getBinOp_Lhs();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.tjep.tJ.BinOp#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.BinOp#getOp()
   * @see #getBinOp()
   * @generated
   */
  EAttribute getBinOp_Op();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.tjep.tJ.BinOp#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rhs</em>'.
   * @see dk.sdu.mmmi.tjep.tJ.BinOp#getRhs()
   * @see #getBinOp()
   * @generated
   */
  EReference getBinOp_Rhs();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  TJFactory getTJFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.tjep.tJ.impl.ProgramImpl <em>Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.tjep.tJ.impl.ProgramImpl
     * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getProgram()
     * @generated
     */
    EClass PROGRAM = eINSTANCE.getProgram();

    /**
     * The meta object literal for the '<em><b>Pkgname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROGRAM__PKGNAME = eINSTANCE.getProgram_Pkgname();

    /**
     * The meta object literal for the '<em><b>Scenarios</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__SCENARIOS = eINSTANCE.getProgram_Scenarios();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__TYPES = eINSTANCE.getProgram_Types();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.tjep.tJ.impl.ScenarioImpl <em>Scenario</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.tjep.tJ.impl.ScenarioImpl
     * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getScenario()
     * @generated
     */
    EClass SCENARIO = eINSTANCE.getScenario();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCENARIO__NAME = eINSTANCE.getScenario_Name();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCENARIO__TARGET = eINSTANCE.getScenario_Target();

    /**
     * The meta object literal for the '<em><b>Assertion</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCENARIO__ASSERTION = eINSTANCE.getScenario_Assertion();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.tjep.tJ.impl.BTImpl <em>BT</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.tjep.tJ.impl.BTImpl
     * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getBT()
     * @generated
     */
    EClass BT = eINSTANCE.getBT();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.tjep.tJ.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.tjep.tJ.impl.TypeImpl
     * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__NAME = eINSTANCE.getType_Name();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.tjep.tJ.impl.PrimitiveImpl <em>Primitive</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.tjep.tJ.impl.PrimitiveImpl
     * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getPrimitive()
     * @generated
     */
    EClass PRIMITIVE = eINSTANCE.getPrimitive();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.tjep.tJ.impl.ClazzImpl <em>Clazz</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.tjep.tJ.impl.ClazzImpl
     * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getClazz()
     * @generated
     */
    EClass CLAZZ = eINSTANCE.getClazz();

    /**
     * The meta object literal for the '<em><b>Variant</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLAZZ__VARIANT = eINSTANCE.getClazz_Variant();

    /**
     * The meta object literal for the '<em><b>Base</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLAZZ__BASE = eINSTANCE.getClazz_Base();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLAZZ__MEMBERS = eINSTANCE.getClazz_Members();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.tjep.tJ.impl.MemberImpl <em>Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.tjep.tJ.impl.MemberImpl
     * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getMember()
     * @generated
     */
    EClass MEMBER = eINSTANCE.getMember();

    /**
     * The meta object literal for the '<em><b>Bt</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEMBER__BT = eINSTANCE.getMember_Bt();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.tjep.tJ.impl.FieldImpl <em>Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.tjep.tJ.impl.FieldImpl
     * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getField()
     * @generated
     */
    EClass FIELD = eINSTANCE.getField();

    /**
     * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__FINAL = eINSTANCE.getField_Final();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD__TYPE = eINSTANCE.getField_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__NAME = eINSTANCE.getField_Name();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.tjep.tJ.impl.MethodImpl <em>Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.tjep.tJ.impl.MethodImpl
     * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getMethod()
     * @generated
     */
    EClass METHOD = eINSTANCE.getMethod();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__TYPE = eINSTANCE.getMethod_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD__NAME = eINSTANCE.getMethod_Name();

    /**
     * The meta object literal for the '<em><b>Variant</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD__VARIANT = eINSTANCE.getMethod_Variant();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__PARAMS = eINSTANCE.getMethod_Params();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__BODY = eINSTANCE.getMethod_Body();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.tjep.tJ.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.tjep.tJ.impl.ParameterImpl
     * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Bt</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__BT = eINSTANCE.getParameter_Bt();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__TYPE = eINSTANCE.getParameter_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.tjep.tJ.impl.ConstructorImpl <em>Constructor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.tjep.tJ.impl.ConstructorImpl
     * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getConstructor()
     * @generated
     */
    EClass CONSTRUCTOR = eINSTANCE.getConstructor();

    /**
     * The meta object literal for the '<em><b>Clazz</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRUCTOR__CLAZZ = eINSTANCE.getConstructor_Clazz();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRUCTOR__PARAMS = eINSTANCE.getConstructor_Params();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRUCTOR__BODY = eINSTANCE.getConstructor_Body();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.tjep.tJ.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.tjep.tJ.impl.StatementImpl
     * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '<em><b>Bt</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__BT = eINSTANCE.getStatement_Bt();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.tjep.tJ.impl.VarDeclImpl <em>Var Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.tjep.tJ.impl.VarDeclImpl
     * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getVarDecl()
     * @generated
     */
    EClass VAR_DECL = eINSTANCE.getVarDecl();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR_DECL__TYPE = eINSTANCE.getVarDecl_Type();

    /**
     * The meta object literal for the '<em><b>Variant</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAR_DECL__VARIANT = eINSTANCE.getVarDecl_Variant();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAR_DECL__NAME = eINSTANCE.getVarDecl_Name();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.tjep.tJ.impl.LocalAssignImpl <em>Local Assign</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.tjep.tJ.impl.LocalAssignImpl
     * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getLocalAssign()
     * @generated
     */
    EClass LOCAL_ASSIGN = eINSTANCE.getLocalAssign();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCAL_ASSIGN__NAME = eINSTANCE.getLocalAssign_Name();

    /**
     * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_ASSIGN__RHS = eINSTANCE.getLocalAssign_Rhs();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.tjep.tJ.impl.FieldAssignImpl <em>Field Assign</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.tjep.tJ.impl.FieldAssignImpl
     * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getFieldAssign()
     * @generated
     */
    EClass FIELD_ASSIGN = eINSTANCE.getFieldAssign();

    /**
     * The meta object literal for the '<em><b>Object</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_ASSIGN__OBJECT = eINSTANCE.getFieldAssign_Object();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_ASSIGN__NAME = eINSTANCE.getFieldAssign_Name();

    /**
     * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD_ASSIGN__RHS = eINSTANCE.getFieldAssign_Rhs();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.tjep.tJ.impl.ConditionImpl <em>Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.tjep.tJ.impl.ConditionImpl
     * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getCondition()
     * @generated
     */
    EClass CONDITION = eINSTANCE.getCondition();

    /**
     * The meta object literal for the '<em><b>Cond</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__COND = eINSTANCE.getCondition_Cond();

    /**
     * The meta object literal for the '<em><b>Then Body</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__THEN_BODY = eINSTANCE.getCondition_ThenBody();

    /**
     * The meta object literal for the '<em><b>Else Body</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__ELSE_BODY = eINSTANCE.getCondition_ElseBody();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.tjep.tJ.impl.WhileImpl <em>While</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.tjep.tJ.impl.WhileImpl
     * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getWhile()
     * @generated
     */
    EClass WHILE = eINSTANCE.getWhile();

    /**
     * The meta object literal for the '<em><b>Cond</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE__COND = eINSTANCE.getWhile_Cond();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE__BODY = eINSTANCE.getWhile_Body();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.tjep.tJ.impl.ReturnImpl <em>Return</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.tjep.tJ.impl.ReturnImpl
     * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getReturn()
     * @generated
     */
    EClass RETURN = eINSTANCE.getReturn();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RETURN__EXP = eINSTANCE.getReturn_Exp();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.tjep.tJ.impl.SingleExprImpl <em>Single Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.tjep.tJ.impl.SingleExprImpl
     * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getSingleExpr()
     * @generated
     */
    EClass SINGLE_EXPR = eINSTANCE.getSingleExpr();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SINGLE_EXPR__EXP = eINSTANCE.getSingleExpr_Exp();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.tjep.tJ.impl.ExprImpl <em>Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.tjep.tJ.impl.ExprImpl
     * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getExpr()
     * @generated
     */
    EClass EXPR = eINSTANCE.getExpr();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.tjep.tJ.impl.LiftExpImpl <em>Lift Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.tjep.tJ.impl.LiftExpImpl
     * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getLiftExp()
     * @generated
     */
    EClass LIFT_EXP = eINSTANCE.getLiftExp();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIFT_EXP__EXP = eINSTANCE.getLiftExp_Exp();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.tjep.tJ.impl.AnnotatedExprImpl <em>Annotated Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.tjep.tJ.impl.AnnotatedExprImpl
     * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getAnnotatedExpr()
     * @generated
     */
    EClass ANNOTATED_EXPR = eINSTANCE.getAnnotatedExpr();

    /**
     * The meta object literal for the '<em><b>Bt</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATED_EXPR__BT = eINSTANCE.getAnnotatedExpr_Bt();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATED_EXPR__EXP = eINSTANCE.getAnnotatedExpr_Exp();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.tjep.tJ.impl.ObjectOpImpl <em>Object Op</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.tjep.tJ.impl.ObjectOpImpl
     * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getObjectOp()
     * @generated
     */
    EClass OBJECT_OP = eINSTANCE.getObjectOp();

    /**
     * The meta object literal for the '<em><b>Object</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJECT_OP__OBJECT = eINSTANCE.getObjectOp_Object();

    /**
     * The meta object literal for the '<em><b>Qualifier</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_OP__QUALIFIER = eINSTANCE.getObjectOp_Qualifier();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJECT_OP__NAME = eINSTANCE.getObjectOp_Name();

    /**
     * The meta object literal for the '<em><b>Variant</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJECT_OP__VARIANT = eINSTANCE.getObjectOp_Variant();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.tjep.tJ.impl.InstantiationImpl <em>Instantiation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.tjep.tJ.impl.InstantiationImpl
     * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getInstantiation()
     * @generated
     */
    EClass INSTANTIATION = eINSTANCE.getInstantiation();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANTIATION__TYPE = eINSTANCE.getInstantiation_Type();

    /**
     * The meta object literal for the '<em><b>Variant</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTANTIATION__VARIANT = eINSTANCE.getInstantiation_Variant();

    /**
     * The meta object literal for the '<em><b>Argument</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANTIATION__ARGUMENT = eINSTANCE.getInstantiation_Argument();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.tjep.tJ.impl.ArithExpImpl <em>Arith Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.tjep.tJ.impl.ArithExpImpl
     * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getArithExp()
     * @generated
     */
    EClass ARITH_EXP = eINSTANCE.getArithExp();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.tjep.tJ.impl.AdditionImpl <em>Addition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.tjep.tJ.impl.AdditionImpl
     * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getAddition()
     * @generated
     */
    EClass ADDITION = eINSTANCE.getAddition();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.tjep.tJ.impl.MultiplicationImpl <em>Multiplication</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.tjep.tJ.impl.MultiplicationImpl
     * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getMultiplication()
     * @generated
     */
    EClass MULTIPLICATION = eINSTANCE.getMultiplication();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.tjep.tJ.impl.BaseExpImpl <em>Base Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.tjep.tJ.impl.BaseExpImpl
     * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getBaseExp()
     * @generated
     */
    EClass BASE_EXP = eINSTANCE.getBaseExp();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.tjep.tJ.impl.VarRefImpl <em>Var Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.tjep.tJ.impl.VarRefImpl
     * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getVarRef()
     * @generated
     */
    EClass VAR_REF = eINSTANCE.getVarRef();

    /**
     * The meta object literal for the '<em><b>Bt</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR_REF__BT = eINSTANCE.getVarRef_Bt();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAR_REF__NAME = eINSTANCE.getVarRef_Name();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.tjep.tJ.impl.ConstantImpl <em>Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.tjep.tJ.impl.ConstantImpl
     * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getConstant()
     * @generated
     */
    EClass CONSTANT = eINSTANCE.getConstant();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT__VALUE = eINSTANCE.getConstant_Value();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.tjep.tJ.impl.DynamicValueImpl <em>Dynamic Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.tjep.tJ.impl.DynamicValueImpl
     * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getDynamicValue()
     * @generated
     */
    EClass DYNAMIC_VALUE = eINSTANCE.getDynamicValue();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DYNAMIC_VALUE__TYPE = eINSTANCE.getDynamicValue_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DYNAMIC_VALUE__NAME = eINSTANCE.getDynamicValue_Name();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.tjep.tJ.impl.StaticImpl <em>Static</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.tjep.tJ.impl.StaticImpl
     * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getStatic()
     * @generated
     */
    EClass STATIC = eINSTANCE.getStatic();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.tjep.tJ.impl.DynamicImpl <em>Dynamic</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.tjep.tJ.impl.DynamicImpl
     * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getDynamic()
     * @generated
     */
    EClass DYNAMIC = eINSTANCE.getDynamic();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.tjep.tJ.impl.ThisImpl <em>This</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.tjep.tJ.impl.ThisImpl
     * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getThis()
     * @generated
     */
    EClass THIS = eINSTANCE.getThis();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.tjep.tJ.impl.MethodCallImpl <em>Method Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.tjep.tJ.impl.MethodCallImpl
     * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getMethodCall()
     * @generated
     */
    EClass METHOD_CALL = eINSTANCE.getMethodCall();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_CALL__TARGET = eINSTANCE.getMethodCall_Target();

    /**
     * The meta object literal for the '<em><b>Argument</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_CALL__ARGUMENT = eINSTANCE.getMethodCall_Argument();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.tjep.tJ.impl.BinOpImpl <em>Bin Op</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.tjep.tJ.impl.BinOpImpl
     * @see dk.sdu.mmmi.tjep.tJ.impl.TJPackageImpl#getBinOp()
     * @generated
     */
    EClass BIN_OP = eINSTANCE.getBinOp();

    /**
     * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BIN_OP__LHS = eINSTANCE.getBinOp_Lhs();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BIN_OP__OP = eINSTANCE.getBinOp_Op();

    /**
     * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BIN_OP__RHS = eINSTANCE.getBinOp_Rhs();

  }

} //TJPackage
