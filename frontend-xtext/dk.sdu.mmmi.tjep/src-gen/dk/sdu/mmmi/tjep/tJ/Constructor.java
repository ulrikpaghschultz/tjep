/**
 */
package dk.sdu.mmmi.tjep.tJ;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constructor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.sdu.mmmi.tjep.tJ.Constructor#getClazz <em>Clazz</em>}</li>
 *   <li>{@link dk.sdu.mmmi.tjep.tJ.Constructor#getParams <em>Params</em>}</li>
 *   <li>{@link dk.sdu.mmmi.tjep.tJ.Constructor#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.sdu.mmmi.tjep.tJ.TJPackage#getConstructor()
 * @model
 * @generated
 */
public interface Constructor extends Member
{
  /**
   * Returns the value of the '<em><b>Clazz</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Clazz</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Clazz</em>' reference.
   * @see #setClazz(Clazz)
   * @see dk.sdu.mmmi.tjep.tJ.TJPackage#getConstructor_Clazz()
   * @model
   * @generated
   */
  Clazz getClazz();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.tjep.tJ.Constructor#getClazz <em>Clazz</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Clazz</em>' reference.
   * @see #getClazz()
   * @generated
   */
  void setClazz(Clazz value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link dk.sdu.mmmi.tjep.tJ.Parameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see dk.sdu.mmmi.tjep.tJ.TJPackage#getConstructor_Params()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getParams();

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference list.
   * The list contents are of type {@link dk.sdu.mmmi.tjep.tJ.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference list.
   * @see dk.sdu.mmmi.tjep.tJ.TJPackage#getConstructor_Body()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getBody();

} // Constructor
