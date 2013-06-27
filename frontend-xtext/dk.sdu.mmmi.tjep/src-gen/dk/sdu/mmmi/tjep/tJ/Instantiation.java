/**
 */
package dk.sdu.mmmi.tjep.tJ;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instantiation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.sdu.mmmi.tjep.tJ.Instantiation#getType <em>Type</em>}</li>
 *   <li>{@link dk.sdu.mmmi.tjep.tJ.Instantiation#getVariant <em>Variant</em>}</li>
 *   <li>{@link dk.sdu.mmmi.tjep.tJ.Instantiation#getArgument <em>Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.sdu.mmmi.tjep.tJ.TJPackage#getInstantiation()
 * @model
 * @generated
 */
public interface Instantiation extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(Clazz)
   * @see dk.sdu.mmmi.tjep.tJ.TJPackage#getInstantiation_Type()
   * @model
   * @generated
   */
  Clazz getType();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.tjep.tJ.Instantiation#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(Clazz value);

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
   * @see dk.sdu.mmmi.tjep.tJ.TJPackage#getInstantiation_Variant()
   * @model
   * @generated
   */
  int getVariant();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.tjep.tJ.Instantiation#getVariant <em>Variant</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variant</em>' attribute.
   * @see #getVariant()
   * @generated
   */
  void setVariant(int value);

  /**
   * Returns the value of the '<em><b>Argument</b></em>' containment reference list.
   * The list contents are of type {@link dk.sdu.mmmi.tjep.tJ.Expr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Argument</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Argument</em>' containment reference list.
   * @see dk.sdu.mmmi.tjep.tJ.TJPackage#getInstantiation_Argument()
   * @model containment="true"
   * @generated
   */
  EList<Expr> getArgument();

} // Instantiation
