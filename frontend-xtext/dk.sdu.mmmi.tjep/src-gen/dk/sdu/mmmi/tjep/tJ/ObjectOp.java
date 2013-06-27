/**
 */
package dk.sdu.mmmi.tjep.tJ;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Op</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.sdu.mmmi.tjep.tJ.ObjectOp#getObject <em>Object</em>}</li>
 *   <li>{@link dk.sdu.mmmi.tjep.tJ.ObjectOp#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link dk.sdu.mmmi.tjep.tJ.ObjectOp#getName <em>Name</em>}</li>
 *   <li>{@link dk.sdu.mmmi.tjep.tJ.ObjectOp#getVariant <em>Variant</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.sdu.mmmi.tjep.tJ.TJPackage#getObjectOp()
 * @model
 * @generated
 */
public interface ObjectOp extends EObject
{
  /**
   * Returns the value of the '<em><b>Object</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object</em>' attribute.
   * @see #setObject(String)
   * @see dk.sdu.mmmi.tjep.tJ.TJPackage#getObjectOp_Object()
   * @model
   * @generated
   */
  String getObject();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.tjep.tJ.ObjectOp#getObject <em>Object</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object</em>' attribute.
   * @see #getObject()
   * @generated
   */
  void setObject(String value);

  /**
   * Returns the value of the '<em><b>Qualifier</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Qualifier</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qualifier</em>' reference.
   * @see #setQualifier(Clazz)
   * @see dk.sdu.mmmi.tjep.tJ.TJPackage#getObjectOp_Qualifier()
   * @model
   * @generated
   */
  Clazz getQualifier();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.tjep.tJ.ObjectOp#getQualifier <em>Qualifier</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Qualifier</em>' reference.
   * @see #getQualifier()
   * @generated
   */
  void setQualifier(Clazz value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see dk.sdu.mmmi.tjep.tJ.TJPackage#getObjectOp_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.tjep.tJ.ObjectOp#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Variant</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variant</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variant</em>' attribute.
   * @see #setVariant(int)
   * @see dk.sdu.mmmi.tjep.tJ.TJPackage#getObjectOp_Variant()
   * @model
   * @generated
   */
  int getVariant();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.tjep.tJ.ObjectOp#getVariant <em>Variant</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variant</em>' attribute.
   * @see #getVariant()
   * @generated
   */
  void setVariant(int value);

} // ObjectOp
