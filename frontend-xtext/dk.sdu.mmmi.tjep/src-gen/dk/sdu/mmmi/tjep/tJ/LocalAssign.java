/**
 */
package dk.sdu.mmmi.tjep.tJ;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Assign</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.sdu.mmmi.tjep.tJ.LocalAssign#getName <em>Name</em>}</li>
 *   <li>{@link dk.sdu.mmmi.tjep.tJ.LocalAssign#getRhs <em>Rhs</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.sdu.mmmi.tjep.tJ.TJPackage#getLocalAssign()
 * @model
 * @generated
 */
public interface LocalAssign extends Statement
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
   * @see dk.sdu.mmmi.tjep.tJ.TJPackage#getLocalAssign_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.tjep.tJ.LocalAssign#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rhs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rhs</em>' containment reference.
   * @see #setRhs(Expr)
   * @see dk.sdu.mmmi.tjep.tJ.TJPackage#getLocalAssign_Rhs()
   * @model containment="true"
   * @generated
   */
  Expr getRhs();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.tjep.tJ.LocalAssign#getRhs <em>Rhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rhs</em>' containment reference.
   * @see #getRhs()
   * @generated
   */
  void setRhs(Expr value);

} // LocalAssign
