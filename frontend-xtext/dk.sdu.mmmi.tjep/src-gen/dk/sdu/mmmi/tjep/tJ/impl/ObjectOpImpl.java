/**
 */
package dk.sdu.mmmi.tjep.tJ.impl;

import dk.sdu.mmmi.tjep.tJ.Clazz;
import dk.sdu.mmmi.tjep.tJ.ObjectOp;
import dk.sdu.mmmi.tjep.tJ.TJPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Op</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.sdu.mmmi.tjep.tJ.impl.ObjectOpImpl#getObject <em>Object</em>}</li>
 *   <li>{@link dk.sdu.mmmi.tjep.tJ.impl.ObjectOpImpl#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link dk.sdu.mmmi.tjep.tJ.impl.ObjectOpImpl#getName <em>Name</em>}</li>
 *   <li>{@link dk.sdu.mmmi.tjep.tJ.impl.ObjectOpImpl#getVariant <em>Variant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectOpImpl extends MinimalEObjectImpl.Container implements ObjectOp
{
  /**
   * The default value of the '{@link #getObject() <em>Object</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObject()
   * @generated
   * @ordered
   */
  protected static final String OBJECT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getObject() <em>Object</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObject()
   * @generated
   * @ordered
   */
  protected String object = OBJECT_EDEFAULT;

  /**
   * The cached value of the '{@link #getQualifier() <em>Qualifier</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQualifier()
   * @generated
   * @ordered
   */
  protected Clazz qualifier;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ObjectOpImpl()
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
    return TJPackage.Literals.OBJECT_OP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getObject()
  {
    return object;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObject(String newObject)
  {
    String oldObject = object;
    object = newObject;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TJPackage.OBJECT_OP__OBJECT, oldObject, object));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Clazz getQualifier()
  {
    if (qualifier != null && qualifier.eIsProxy())
    {
      InternalEObject oldQualifier = (InternalEObject)qualifier;
      qualifier = (Clazz)eResolveProxy(oldQualifier);
      if (qualifier != oldQualifier)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TJPackage.OBJECT_OP__QUALIFIER, oldQualifier, qualifier));
      }
    }
    return qualifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Clazz basicGetQualifier()
  {
    return qualifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQualifier(Clazz newQualifier)
  {
    Clazz oldQualifier = qualifier;
    qualifier = newQualifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TJPackage.OBJECT_OP__QUALIFIER, oldQualifier, qualifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TJPackage.OBJECT_OP__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TJPackage.OBJECT_OP__VARIANT, oldVariant, variant));
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
      case TJPackage.OBJECT_OP__OBJECT:
        return getObject();
      case TJPackage.OBJECT_OP__QUALIFIER:
        if (resolve) return getQualifier();
        return basicGetQualifier();
      case TJPackage.OBJECT_OP__NAME:
        return getName();
      case TJPackage.OBJECT_OP__VARIANT:
        return getVariant();
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
      case TJPackage.OBJECT_OP__OBJECT:
        setObject((String)newValue);
        return;
      case TJPackage.OBJECT_OP__QUALIFIER:
        setQualifier((Clazz)newValue);
        return;
      case TJPackage.OBJECT_OP__NAME:
        setName((String)newValue);
        return;
      case TJPackage.OBJECT_OP__VARIANT:
        setVariant((Integer)newValue);
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
      case TJPackage.OBJECT_OP__OBJECT:
        setObject(OBJECT_EDEFAULT);
        return;
      case TJPackage.OBJECT_OP__QUALIFIER:
        setQualifier((Clazz)null);
        return;
      case TJPackage.OBJECT_OP__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TJPackage.OBJECT_OP__VARIANT:
        setVariant(VARIANT_EDEFAULT);
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
      case TJPackage.OBJECT_OP__OBJECT:
        return OBJECT_EDEFAULT == null ? object != null : !OBJECT_EDEFAULT.equals(object);
      case TJPackage.OBJECT_OP__QUALIFIER:
        return qualifier != null;
      case TJPackage.OBJECT_OP__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TJPackage.OBJECT_OP__VARIANT:
        return variant != VARIANT_EDEFAULT;
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
    result.append(" (object: ");
    result.append(object);
    result.append(", name: ");
    result.append(name);
    result.append(", variant: ");
    result.append(variant);
    result.append(')');
    return result.toString();
  }

} //ObjectOpImpl
