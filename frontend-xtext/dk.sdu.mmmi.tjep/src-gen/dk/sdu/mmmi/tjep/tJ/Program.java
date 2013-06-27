/**
 */
package dk.sdu.mmmi.tjep.tJ;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.sdu.mmmi.tjep.tJ.Program#getPkgname <em>Pkgname</em>}</li>
 *   <li>{@link dk.sdu.mmmi.tjep.tJ.Program#getScenarios <em>Scenarios</em>}</li>
 *   <li>{@link dk.sdu.mmmi.tjep.tJ.Program#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.sdu.mmmi.tjep.tJ.TJPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject
{
  /**
   * Returns the value of the '<em><b>Pkgname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pkgname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pkgname</em>' attribute.
   * @see #setPkgname(String)
   * @see dk.sdu.mmmi.tjep.tJ.TJPackage#getProgram_Pkgname()
   * @model
   * @generated
   */
  String getPkgname();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.tjep.tJ.Program#getPkgname <em>Pkgname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pkgname</em>' attribute.
   * @see #getPkgname()
   * @generated
   */
  void setPkgname(String value);

  /**
   * Returns the value of the '<em><b>Scenarios</b></em>' containment reference list.
   * The list contents are of type {@link dk.sdu.mmmi.tjep.tJ.Scenario}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scenarios</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scenarios</em>' containment reference list.
   * @see dk.sdu.mmmi.tjep.tJ.TJPackage#getProgram_Scenarios()
   * @model containment="true"
   * @generated
   */
  EList<Scenario> getScenarios();

  /**
   * Returns the value of the '<em><b>Types</b></em>' containment reference list.
   * The list contents are of type {@link dk.sdu.mmmi.tjep.tJ.Type}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Types</em>' containment reference list.
   * @see dk.sdu.mmmi.tjep.tJ.TJPackage#getProgram_Types()
   * @model containment="true"
   * @generated
   */
  EList<Type> getTypes();

} // Program
