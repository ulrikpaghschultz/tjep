/**
 */
package dk.sdu.mmmi.tjep.tJ.impl;

import dk.sdu.mmmi.tjep.tJ.Clazz;
import dk.sdu.mmmi.tjep.tJ.Member;
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
 * An implementation of the model object '<em><b>Clazz</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.sdu.mmmi.tjep.tJ.impl.ClazzImpl#getVariant <em>Variant</em>}</li>
 *   <li>{@link dk.sdu.mmmi.tjep.tJ.impl.ClazzImpl#getBase <em>Base</em>}</li>
 *   <li>{@link dk.sdu.mmmi.tjep.tJ.impl.ClazzImpl#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClazzImpl extends TypeImpl implements Clazz
{
  /**
   * The default value of the '{@link #getVariant() <em>Variant</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariant()
   * @generated
   * @ordered
   */
  protected static final int VARIANT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getVariant() <em>Variant</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariant()
   * @generated
   * @ordered
   */
  protected int variant = VARIANT_EDEFAULT;

  /**
   * The cached value of the '{@link #getBase() <em>Base</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBase()
   * @generated
   * @ordered
   */
  protected Clazz base;

  /**
   * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMembers()
   * @generated
   * @ordered
   */
  protected EList<Member> members;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClazzImpl()
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
    return TJPackage.Literals.CLAZZ;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getVariant()
  {
    return variant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariant(int newVariant)
  {
    int oldVariant = variant;
    variant = newVariant;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TJPackage.CLAZZ__VARIANT, oldVariant, variant));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Clazz getBase()
  {
    if (base != null && base.eIsProxy())
    {
      InternalEObject oldBase = (InternalEObject)base;
      base = (Clazz)eResolveProxy(oldBase);
      if (base != oldBase)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TJPackage.CLAZZ__BASE, oldBase, base));
      }
    }
    return base;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Clazz basicGetBase()
  {
    return base;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBase(Clazz newBase)
  {
    Clazz oldBase = base;
    base = newBase;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TJPackage.CLAZZ__BASE, oldBase, base));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Member> getMembers()
  {
    if (members == null)
    {
      members = new EObjectContainmentEList<Member>(Member.class, this, TJPackage.CLAZZ__MEMBERS);
    }
    return members;
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
      case TJPackage.CLAZZ__MEMBERS:
        return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
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
      case TJPackage.CLAZZ__VARIANT:
        return getVariant();
      case TJPackage.CLAZZ__BASE:
        if (resolve) return getBase();
        return basicGetBase();
      case TJPackage.CLAZZ__MEMBERS:
        return getMembers();
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
      case TJPackage.CLAZZ__VARIANT:
        setVariant((Integer)newValue);
        return;
      case TJPackage.CLAZZ__BASE:
        setBase((Clazz)newValue);
        return;
      case TJPackage.CLAZZ__MEMBERS:
        getMembers().clear();
        getMembers().addAll((Collection<? extends Member>)newValue);
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
      case TJPackage.CLAZZ__VARIANT:
        setVariant(VARIANT_EDEFAULT);
        return;
      case TJPackage.CLAZZ__BASE:
        setBase((Clazz)null);
        return;
      case TJPackage.CLAZZ__MEMBERS:
        getMembers().clear();
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
      case TJPackage.CLAZZ__VARIANT:
        return variant != VARIANT_EDEFAULT;
      case TJPackage.CLAZZ__BASE:
        return base != null;
      case TJPackage.CLAZZ__MEMBERS:
        return members != null && !members.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (variant: ");
    result.append(variant);
    result.append(')');
    return result.toString();
  }

} //ClazzImpl
