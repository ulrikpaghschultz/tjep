/**
 */
package dk.sdu.mmmi.tjep.tJ;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.sdu.mmmi.tjep.tJ.MethodCall#getTarget <em>Target</em>}</li>
 *   <li>{@link dk.sdu.mmmi.tjep.tJ.MethodCall#getArgument <em>Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.sdu.mmmi.tjep.tJ.TJPackage#getMethodCall()
 * @model
 * @generated
 */
public interface MethodCall extends ObjectOp
{
  /**
   * Returns the value of the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' containment reference.
   * @see #setTarget(ObjectOp)
   * @see dk.sdu.mmmi.tjep.tJ.TJPackage#getMethodCall_Target()
   * @model containment="true"
   * @generated
   */
  ObjectOp getTarget();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.tjep.tJ.MethodCall#getTarget <em>Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' containment reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(ObjectOp value);

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
   * @see dk.sdu.mmmi.tjep.tJ.TJPackage#getMethodCall_Argument()
   * @model containment="true"
   * @generated
   */
  EList<Expr> getArgument();

} // MethodCall
