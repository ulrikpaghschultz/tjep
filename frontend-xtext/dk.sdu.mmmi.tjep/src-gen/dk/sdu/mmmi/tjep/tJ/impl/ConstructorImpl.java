/**
 */
package dk.sdu.mmmi.tjep.tJ.impl;

import dk.sdu.mmmi.tjep.tJ.Clazz;
import dk.sdu.mmmi.tjep.tJ.Constructor;
import dk.sdu.mmmi.tjep.tJ.Parameter;
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
 * An implementation of the model object '<em><b>Constructor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.sdu.mmmi.tjep.tJ.impl.ConstructorImpl#getClazz <em>Clazz</em>}</li>
 *   <li>{@link dk.sdu.mmmi.tjep.tJ.impl.ConstructorImpl#getParams <em>Params</em>}</li>
 *   <li>{@link dk.sdu.mmmi.tjep.tJ.impl.ConstructorImpl#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstructorImpl extends MemberImpl implements Constructor
{
  /**
   * The cached value of the '{@link #getClazz() <em>Clazz</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClazz()
   * @generated
   * @ordered
   */
  protected Clazz clazz;

  /**
   * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected EList<Parameter> params;

  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected EList<Statement> body;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConstructorImpl()
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
    return TJPackage.Literals.CONSTRUCTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Clazz getClazz()
  {
    if (clazz != null && clazz.eIsProxy())
    {
      InternalEObject oldClazz = (InternalEObject)clazz;
      clazz = (Clazz)eResolveProxy(oldClazz);
      if (clazz != oldClazz)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TJPackage.CONSTRUCTOR__CLAZZ, oldClazz, clazz));
      }
    }
    return clazz;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Clazz basicGetClazz()
  {
    return clazz;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClazz(Clazz newClazz)
  {
    Clazz oldClazz = clazz;
    clazz = newClazz;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TJPackage.CONSTRUCTOR__CLAZZ, oldClazz, clazz));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Parameter> getParams()
  {
    if (params == null)
    {
      params = new EObjectContainmentEList<Parameter>(Parameter.class, this, TJPackage.CONSTRUCTOR__PARAMS);
    }
    return params;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Statement> getBody()
  {
    if (body == null)
    {
      body = new EObjectContainmentEList<Statement>(Statement.class, this, TJPackage.CONSTRUCTOR__BODY);
    }
    return body;
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
      case TJPackage.CONSTRUCTOR__PARAMS:
        return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
      case TJPackage.CONSTRUCTOR__BODY:
        return ((InternalEList<?>)getBody()).basicRemove(otherEnd, msgs);
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
      case TJPackage.CONSTRUCTOR__CLAZZ:
        if (resolve) return getClazz();
        return basicGetClazz();
      case TJPackage.CONSTRUCTOR__PARAMS:
        return getParams();
      case TJPackage.CONSTRUCTOR__BODY:
        return getBody();
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
      case TJPackage.CONSTRUCTOR__CLAZZ:
        setClazz((Clazz)newValue);
        return;
      case TJPackage.CONSTRUCTOR__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends Parameter>)newValue);
        return;
      case TJPackage.CONSTRUCTOR__BODY:
        getBody().clear();
        getBody().addAll((Collection<? extends Statement>)newValue);
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
      case TJPackage.CONSTRUCTOR__CLAZZ:
        setClazz((Clazz)null);
        return;
      case TJPackage.CONSTRUCTOR__PARAMS:
        getParams().clear();
        return;
      case TJPackage.CONSTRUCTOR__BODY:
        getBody().clear();
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
      case TJPackage.CONSTRUCTOR__CLAZZ:
        return clazz != null;
      case TJPackage.CONSTRUCTOR__PARAMS:
        return params != null && !params.isEmpty();
      case TJPackage.CONSTRUCTOR__BODY:
        return body != null && !body.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ConstructorImpl
