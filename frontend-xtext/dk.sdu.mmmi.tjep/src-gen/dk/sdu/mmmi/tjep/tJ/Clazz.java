/**
 */
package dk.sdu.mmmi.tjep.tJ;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clazz</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.sdu.mmmi.tjep.tJ.Clazz#getVariant <em>Variant</em>}</li>
 *   <li>{@link dk.sdu.mmmi.tjep.tJ.Clazz#getBase <em>Base</em>}</li>
 *   <li>{@link dk.sdu.mmmi.tjep.tJ.Clazz#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.sdu.mmmi.tjep.tJ.TJPackage#getClazz()
 * @model
 * @generated
 */
public interface Clazz extends Type
{
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
   * @see dk.sdu.mmmi.tjep.tJ.TJPackage#getClazz_Variant()
   * @model
   * @generated
   */
  int getVariant();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.tjep.tJ.Clazz#getVariant <em>Variant</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variant</em>' attribute.
   * @see #getVariant()
   * @generated
   */
  void setVariant(int value);

  /**
   * Returns the value of the '<em><b>Base</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Base</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base</em>' reference.
   * @see #setBase(Clazz)
   * @see dk.sdu.mmmi.tjep.tJ.TJPackage#getClazz_Base()
   * @model
   * @generated
   */
  Clazz getBase();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.tjep.tJ.Clazz#getBase <em>Base</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base</em>' reference.
   * @see #getBase()
   * @generated
   */
  void setBase(Clazz value);

  /**
   * Returns the value of the '<em><b>Members</b></em>' containment reference list.
   * The list contents are of type {@link dk.sdu.mmmi.tjep.tJ.Member}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Members</em>' containment reference list.
   * @see dk.sdu.mmmi.tjep.tJ.TJPackage#getClazz_Members()
   * @model containment="true"
   * @generated
   */
  EList<Member> getMembers();

} // Clazz
