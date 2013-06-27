/**
 */
package dk.sdu.mmmi.tjep.tJ;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bin Op</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.sdu.mmmi.tjep.tJ.BinOp#getLhs <em>Lhs</em>}</li>
 *   <li>{@link dk.sdu.mmmi.tjep.tJ.BinOp#getOp <em>Op</em>}</li>
 *   <li>{@link dk.sdu.mmmi.tjep.tJ.BinOp#getRhs <em>Rhs</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.sdu.mmmi.tjep.tJ.TJPackage#getBinOp()
 * @model
 * @generated
 */
public interface BinOp extends ArithExp, Addition, Multiplication
{
  /**
   * Returns the value of the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lhs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lhs</em>' containment reference.
   * @see #setLhs(EObject)
   * @see dk.sdu.mmmi.tjep.tJ.TJPackage#getBinOp_Lhs()
   * @model containment="true"
   * @generated
   */
  EObject getLhs();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.tjep.tJ.BinOp#getLhs <em>Lhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lhs</em>' containment reference.
   * @see #getLhs()
   * @generated
   */
  void setLhs(EObject value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see dk.sdu.mmmi.tjep.tJ.TJPackage#getBinOp_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.tjep.tJ.BinOp#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rhs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rhs</em>' containment reference.
   * @see #setRhs(EObject)
   * @see dk.sdu.mmmi.tjep.tJ.TJPackage#getBinOp_Rhs()
   * @model containment="true"
   * @generated
   */
  EObject getRhs();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.tjep.tJ.BinOp#getRhs <em>Rhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rhs</em>' containment reference.
   * @see #getRhs()
   * @generated
   */
  void setRhs(EObject value);

} // BinOp
