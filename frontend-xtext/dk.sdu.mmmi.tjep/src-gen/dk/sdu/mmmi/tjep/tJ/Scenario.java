/**
 */
package dk.sdu.mmmi.tjep.tJ;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.sdu.mmmi.tjep.tJ.Scenario#getName <em>Name</em>}</li>
 *   <li>{@link dk.sdu.mmmi.tjep.tJ.Scenario#getTarget <em>Target</em>}</li>
 *   <li>{@link dk.sdu.mmmi.tjep.tJ.Scenario#getAssertion <em>Assertion</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.sdu.mmmi.tjep.tJ.TJPackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends EObject
{
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
   * @see dk.sdu.mmmi.tjep.tJ.TJPackage#getScenario_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.tjep.tJ.Scenario#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' containment reference list.
   * The list contents are of type {@link dk.sdu.mmmi.tjep.tJ.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' containment reference list.
   * @see dk.sdu.mmmi.tjep.tJ.TJPackage#getScenario_Target()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getTarget();

  /**
   * Returns the value of the '<em><b>Assertion</b></em>' containment reference list.
   * The list contents are of type {@link dk.sdu.mmmi.tjep.tJ.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assertion</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assertion</em>' containment reference list.
   * @see dk.sdu.mmmi.tjep.tJ.TJPackage#getScenario_Assertion()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getAssertion();

} // Scenario
