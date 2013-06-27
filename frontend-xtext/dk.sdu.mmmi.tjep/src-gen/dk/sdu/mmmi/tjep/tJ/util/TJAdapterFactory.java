/**
 */
package dk.sdu.mmmi.tjep.tJ.util;

import dk.sdu.mmmi.tjep.tJ.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see dk.sdu.mmmi.tjep.tJ.TJPackage
 * @generated
 */
public class TJAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static TJPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TJAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = TJPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TJSwitch<Adapter> modelSwitch =
    new TJSwitch<Adapter>()
    {
      @Override
      public Adapter caseProgram(Program object)
      {
        return createProgramAdapter();
      }
      @Override
      public Adapter caseScenario(Scenario object)
      {
        return createScenarioAdapter();
      }
      @Override
      public Adapter caseBT(BT object)
      {
        return createBTAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter casePrimitive(Primitive object)
      {
        return createPrimitiveAdapter();
      }
      @Override
      public Adapter caseClazz(Clazz object)
      {
        return createClazzAdapter();
      }
      @Override
      public Adapter caseMember(Member object)
      {
        return createMemberAdapter();
      }
      @Override
      public Adapter caseField(Field object)
      {
        return createFieldAdapter();
      }
      @Override
      public Adapter caseMethod(Method object)
      {
        return createMethodAdapter();
      }
      @Override
      public Adapter caseParameter(Parameter object)
      {
        return createParameterAdapter();
      }
      @Override
      public Adapter caseConstructor(Constructor object)
      {
        return createConstructorAdapter();
      }
      @Override
      public Adapter caseStatement(Statement object)
      {
        return createStatementAdapter();
      }
      @Override
      public Adapter caseVarDecl(VarDecl object)
      {
        return createVarDeclAdapter();
      }
      @Override
      public Adapter caseLocalAssign(LocalAssign object)
      {
        return createLocalAssignAdapter();
      }
      @Override
      public Adapter caseFieldAssign(FieldAssign object)
      {
        return createFieldAssignAdapter();
      }
      @Override
      public Adapter caseCondition(Condition object)
      {
        return createConditionAdapter();
      }
      @Override
      public Adapter caseWhile(While object)
      {
        return createWhileAdapter();
      }
      @Override
      public Adapter caseReturn(Return object)
      {
        return createReturnAdapter();
      }
      @Override
      public Adapter caseSingleExpr(SingleExpr object)
      {
        return createSingleExprAdapter();
      }
      @Override
      public Adapter caseExpr(Expr object)
      {
        return createExprAdapter();
      }
      @Override
      public Adapter caseLiftExp(LiftExp object)
      {
        return createLiftExpAdapter();
      }
      @Override
      public Adapter caseAnnotatedExpr(AnnotatedExpr object)
      {
        return createAnnotatedExprAdapter();
      }
      @Override
      public Adapter caseObjectOp(ObjectOp object)
      {
        return createObjectOpAdapter();
      }
      @Override
      public Adapter caseInstantiation(Instantiation object)
      {
        return createInstantiationAdapter();
      }
      @Override
      public Adapter caseArithExp(ArithExp object)
      {
        return createArithExpAdapter();
      }
      @Override
      public Adapter caseAddition(Addition object)
      {
        return createAdditionAdapter();
      }
      @Override
      public Adapter caseMultiplication(Multiplication object)
      {
        return createMultiplicationAdapter();
      }
      @Override
      public Adapter caseBaseExp(BaseExp object)
      {
        return createBaseExpAdapter();
      }
      @Override
      public Adapter caseVarRef(VarRef object)
      {
        return createVarRefAdapter();
      }
      @Override
      public Adapter caseConstant(Constant object)
      {
        return createConstantAdapter();
      }
      @Override
      public Adapter caseDynamicValue(DynamicValue object)
      {
        return createDynamicValueAdapter();
      }
      @Override
      public Adapter caseStatic(Static object)
      {
        return createStaticAdapter();
      }
      @Override
      public Adapter caseDynamic(Dynamic object)
      {
        return createDynamicAdapter();
      }
      @Override
      public Adapter caseThis(This object)
      {
        return createThisAdapter();
      }
      @Override
      public Adapter caseMethodCall(MethodCall object)
      {
        return createMethodCallAdapter();
      }
      @Override
      public Adapter caseBinOp(BinOp object)
      {
        return createBinOpAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.tjep.tJ.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.tjep.tJ.Program
   * @generated
   */
  public Adapter createProgramAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.tjep.tJ.Scenario <em>Scenario</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.tjep.tJ.Scenario
   * @generated
   */
  public Adapter createScenarioAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.tjep.tJ.BT <em>BT</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.tjep.tJ.BT
   * @generated
   */
  public Adapter createBTAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.tjep.tJ.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.tjep.tJ.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.tjep.tJ.Primitive <em>Primitive</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.tjep.tJ.Primitive
   * @generated
   */
  public Adapter createPrimitiveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.tjep.tJ.Clazz <em>Clazz</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.tjep.tJ.Clazz
   * @generated
   */
  public Adapter createClazzAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.tjep.tJ.Member <em>Member</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.tjep.tJ.Member
   * @generated
   */
  public Adapter createMemberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.tjep.tJ.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.tjep.tJ.Field
   * @generated
   */
  public Adapter createFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.tjep.tJ.Method <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.tjep.tJ.Method
   * @generated
   */
  public Adapter createMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.tjep.tJ.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.tjep.tJ.Parameter
   * @generated
   */
  public Adapter createParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.tjep.tJ.Constructor <em>Constructor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.tjep.tJ.Constructor
   * @generated
   */
  public Adapter createConstructorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.tjep.tJ.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.tjep.tJ.Statement
   * @generated
   */
  public Adapter createStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.tjep.tJ.VarDecl <em>Var Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.tjep.tJ.VarDecl
   * @generated
   */
  public Adapter createVarDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.tjep.tJ.LocalAssign <em>Local Assign</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.tjep.tJ.LocalAssign
   * @generated
   */
  public Adapter createLocalAssignAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.tjep.tJ.FieldAssign <em>Field Assign</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.tjep.tJ.FieldAssign
   * @generated
   */
  public Adapter createFieldAssignAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.tjep.tJ.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.tjep.tJ.Condition
   * @generated
   */
  public Adapter createConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.tjep.tJ.While <em>While</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.tjep.tJ.While
   * @generated
   */
  public Adapter createWhileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.tjep.tJ.Return <em>Return</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.tjep.tJ.Return
   * @generated
   */
  public Adapter createReturnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.tjep.tJ.SingleExpr <em>Single Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.tjep.tJ.SingleExpr
   * @generated
   */
  public Adapter createSingleExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.tjep.tJ.Expr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.tjep.tJ.Expr
   * @generated
   */
  public Adapter createExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.tjep.tJ.LiftExp <em>Lift Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.tjep.tJ.LiftExp
   * @generated
   */
  public Adapter createLiftExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.tjep.tJ.AnnotatedExpr <em>Annotated Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.tjep.tJ.AnnotatedExpr
   * @generated
   */
  public Adapter createAnnotatedExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.tjep.tJ.ObjectOp <em>Object Op</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.tjep.tJ.ObjectOp
   * @generated
   */
  public Adapter createObjectOpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.tjep.tJ.Instantiation <em>Instantiation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.tjep.tJ.Instantiation
   * @generated
   */
  public Adapter createInstantiationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.tjep.tJ.ArithExp <em>Arith Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.tjep.tJ.ArithExp
   * @generated
   */
  public Adapter createArithExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.tjep.tJ.Addition <em>Addition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.tjep.tJ.Addition
   * @generated
   */
  public Adapter createAdditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.tjep.tJ.Multiplication <em>Multiplication</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.tjep.tJ.Multiplication
   * @generated
   */
  public Adapter createMultiplicationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.tjep.tJ.BaseExp <em>Base Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.tjep.tJ.BaseExp
   * @generated
   */
  public Adapter createBaseExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.tjep.tJ.VarRef <em>Var Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.tjep.tJ.VarRef
   * @generated
   */
  public Adapter createVarRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.tjep.tJ.Constant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.tjep.tJ.Constant
   * @generated
   */
  public Adapter createConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.tjep.tJ.DynamicValue <em>Dynamic Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.tjep.tJ.DynamicValue
   * @generated
   */
  public Adapter createDynamicValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.tjep.tJ.Static <em>Static</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.tjep.tJ.Static
   * @generated
   */
  public Adapter createStaticAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.tjep.tJ.Dynamic <em>Dynamic</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.tjep.tJ.Dynamic
   * @generated
   */
  public Adapter createDynamicAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.tjep.tJ.This <em>This</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.tjep.tJ.This
   * @generated
   */
  public Adapter createThisAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.tjep.tJ.MethodCall <em>Method Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.tjep.tJ.MethodCall
   * @generated
   */
  public Adapter createMethodCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dk.sdu.mmmi.tjep.tJ.BinOp <em>Bin Op</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dk.sdu.mmmi.tjep.tJ.BinOp
   * @generated
   */
  public Adapter createBinOpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //TJAdapterFactory
