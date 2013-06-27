/**
 */
package dk.sdu.mmmi.tjep.tJ;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.sdu.mmmi.tjep.tJ.Condition#getCond <em>Cond</em>}</li>
 *   <li>{@link dk.sdu.mmmi.tjep.tJ.Condition#getThenBody <em>Then Body</em>}</li>
 *   <li>{@link dk.sdu.mmmi.tjep.tJ.Condition#getElseBody <em>Else Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.sdu.mmmi.tjep.tJ.TJPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends Statement
{
  /**
   * Returns the value of the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cond</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cond</em>' containment reference.
   * @see #setCond(Expr)
   * @see dk.sdu.mmmi.tjep.tJ.TJPackage#getCondition_Cond()
   * @model containment="true"
   * @generated
   */
  Expr getCond();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.tjep.tJ.Condition#getCond <em>Cond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cond</em>' containment reference.
   * @see #getCond()
   * @generated
   */
  void setCond(Expr value);

  /**
   * Returns the value of the '<em><b>Then Body</b></em>' containment reference list.
   * The list contents are of type {@link dk.sdu.mmmi.tjep.tJ.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then Body</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then Body</em>' containment reference list.
   * @see dk.sdu.mmmi.tjep.tJ.TJPackage#getCondition_ThenBody()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getThenBody();

  /**
   * Returns the value of the '<em><b>Else Body</b></em>' containment reference list.
   * The list contents are of type {@link dk.sdu.mmmi.tjep.tJ.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else Body</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else Body</em>' containment reference list.
   * @see dk.sdu.mmmi.tjep.tJ.TJPackage#getCondition_ElseBody()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getElseBody();

} // Condition
