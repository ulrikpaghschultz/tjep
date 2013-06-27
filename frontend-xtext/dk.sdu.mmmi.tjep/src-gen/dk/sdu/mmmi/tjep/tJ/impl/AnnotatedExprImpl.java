/**
 */
package dk.sdu.mmmi.tjep.tJ.impl;

import dk.sdu.mmmi.tjep.tJ.AnnotatedExpr;
import dk.sdu.mmmi.tjep.tJ.BT;
import dk.sdu.mmmi.tjep.tJ.TJPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotated Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.sdu.mmmi.tjep.tJ.impl.AnnotatedExprImpl#getBt <em>Bt</em>}</li>
 *   <li>{@link dk.sdu.mmmi.tjep.tJ.impl.AnnotatedExprImpl#getExp <em>Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnnotatedExprImpl extends ExprImpl implements AnnotatedExpr
{
  /**
   * The cached value of the '{@link #getBt() <em>Bt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBt()
   * @generated
   * @ordered
   */
  protected BT bt;

  /**
   * The cached value of the '{@link #getExp() <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExp()
   * @generated
   * @ordered
   */
  protected EObject exp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AnnotatedExprImpl()
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
    return TJPackage.Literals.ANNOTATED_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BT getBt()
  {
    return bt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBt(BT newBt, NotificationChain msgs)
  {
    BT oldBt = bt;
    bt = newBt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TJPackage.ANNOTATED_EXPR__BT, oldBt, newBt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBt(BT newBt)
  {
    if (newBt != bt)
    {
      NotificationChain msgs = null;
      if (bt != null)
        msgs = ((InternalEObject)bt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TJPackage.ANNOTATED_EXPR__BT, null, msgs);
      if (newBt != null)
        msgs = ((InternalEObject)newBt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TJPackage.ANNOTATED_EXPR__BT, null, msgs);
      msgs = basicSetBt(newBt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TJPackage.ANNOTATED_EXPR__BT, newBt, newBt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getExp()
  {
    return exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExp(EObject newExp, NotificationChain msgs)
  {
    EObject oldExp = exp;
    exp = newExp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TJPackage.ANNOTATED_EXPR__EXP, oldExp, newExp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExp(EObject newExp)
  {
    if (newExp != exp)
    {
      NotificationChain msgs = null;
      if (exp != null)
        msgs = ((InternalEObject)exp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TJPackage.ANNOTATED_EXPR__EXP, null, msgs);
      if (newExp != null)
        msgs = ((InternalEObject)newExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TJPackage.ANNOTATED_EXPR__EXP, null, msgs);
      msgs = basicSetExp(newExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TJPackage.ANNOTATED_EXPR__EXP, newExp, newExp));
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
      case TJPackage.ANNOTATED_EXPR__BT:
        return basicSetBt(null, msgs);
      case TJPackage.ANNOTATED_EXPR__EXP:
        return basicSetExp(null, msgs);
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
      case TJPackage.ANNOTATED_EXPR__BT:
        return getBt();
      case TJPackage.ANNOTATED_EXPR__EXP:
        return getExp();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TJPackage.ANNOTATED_EXPR__BT:
        setBt((BT)newValue);
        return;
      case TJPackage.ANNOTATED_EXPR__EXP:
        setExp((EObject)newValue);
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
      case TJPackage.ANNOTATED_EXPR__BT:
        setBt((BT)null);
        return;
      case TJPackage.ANNOTATED_EXPR__EXP:
        setExp((EObject)null);
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
      case TJPackage.ANNOTATED_EXPR__BT:
        return bt != null;
      case TJPackage.ANNOTATED_EXPR__EXP:
        return exp != null;
    }
    return super.eIsSet(featureID);
  }

} //AnnotatedExprImpl
