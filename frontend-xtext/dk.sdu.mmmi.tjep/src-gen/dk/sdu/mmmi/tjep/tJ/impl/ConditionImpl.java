/**
 */
package dk.sdu.mmmi.tjep.tJ.impl;

import dk.sdu.mmmi.tjep.tJ.Condition;
import dk.sdu.mmmi.tjep.tJ.Expr;
import dk.sdu.mmmi.tjep.tJ.Statement;
import dk.sdu.mmmi.tjep.tJ.TJPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.sdu.mmmi.tjep.tJ.impl.ConditionImpl#getCond <em>Cond</em>}</li>
 *   <li>{@link dk.sdu.mmmi.tjep.tJ.impl.ConditionImpl#getThenBody <em>Then Body</em>}</li>
 *   <li>{@link dk.sdu.mmmi.tjep.tJ.impl.ConditionImpl#getElseBody <em>Else Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionImpl extends StatementImpl implements Condition
{
  /**
   * The cached value of the '{@link #getCond() <em>Cond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCond()
   * @generated
   * @ordered
   */
  protected Expr cond;

  /**
   * The cached value of the '{@link #getThenBody() <em>Then Body</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThenBody()
   * @generated
   * @ordered
   */
  protected EList<Statement> thenBody;

  /**
   * The cached value of the '{@link #getElseBody() <em>Else Body</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElseBody()
   * @generated
   * @ordered
   */
  protected EList<Statement> elseBody;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConditionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TJPackage.Literals.CONDITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getCond()
  {
    return cond;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCond(Expr newCond, NotificationChain msgs)
  {
    Expr oldCond = cond;
    cond = newCond;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TJPackage.CONDITION__COND, oldCond, newCond);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCond(Expr newCond)
  {
    if (newCond != cond)
    {
      NotificationChain msgs = null;
      if (cond != null)
        msgs = ((InternalEObject)cond).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TJPackage.CONDITION__COND, null, msgs);
      if (newCond != null)
        msgs = ((InternalEObject)newCond).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TJPackage.CONDITION__COND, null, msgs);
      msgs = basicSetCond(newCond, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TJPackage.CONDITION__COND, newCond, newCond));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Statement> getThenBody()
  {
    if (thenBody == null)
    {
      thenBody = new EObjectContainmentEList<Statement>(Statement.class, this, TJPackage.CONDITION__THEN_BODY);
    }
    return thenBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Statement> getElseBody()
  {
    if (elseBody == null)
    {
      elseBody = new EObjectContainmentEList<Statement>(Statement.class, this, TJPackage.CONDITION__ELSE_BODY);
    }
    return elseBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TJPackage.CONDITION__COND:
        return basicSetCond(null, msgs);
      case TJPackage.CONDITION__THEN_BODY:
        return ((InternalEList<?>)getThenBody()).basicRemove(otherEnd, msgs);
      case TJPackage.CONDITION__ELSE_BODY:
        return ((InternalEList<?>)getElseBody()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case TJPackage.CONDITION__COND:
        return getCond();
      case TJPackage.CONDITION__THEN_BODY:
        return getThenBody();
      case TJPackage.CONDITION__ELSE_BODY:
        return getElseBody();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TJPackage.CONDITION__COND:
        setCond((Expr)newValue);
        return;
      case TJPackage.CONDITION__THEN_BODY:
        getThenBody().clear();
        getThenBody().addAll((Collection<? extends Statement>)newValue);
        return;
      case TJPackage.CONDITION__ELSE_BODY:
        getElseBody().clear();
        getElseBody().addAll((Collection<? extends Statement>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case TJPackage.CONDITION__COND:
        setCond((Expr)null);
        return;
      case TJPackage.CONDITION__THEN_BODY:
        getThenBody().clear();
        return;
      case TJPackage.CONDITION__ELSE_BODY:
        getElseBody().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case TJPackage.CONDITION__COND:
        return cond != null;
      case TJPackage.CONDITION__THEN_BODY:
        return thenBody != null && !thenBody.isEmpty();
      case TJPackage.CONDITION__ELSE_BODY:
        return elseBody != null && !elseBody.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ConditionImpl
