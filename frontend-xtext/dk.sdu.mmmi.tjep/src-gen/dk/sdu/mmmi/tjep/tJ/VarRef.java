/**
 */
package dk.sdu.mmmi.tjep.tJ;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.sdu.mmmi.tjep.tJ.VarRef#getBt <em>Bt</em>}</li>
 *   <li>{@link dk.sdu.mmmi.tjep.tJ.VarRef#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.sdu.mmmi.tjep.tJ.TJPackage#getVarRef()
 * @model
 * @generated
 */
public interface VarRef extends BaseExp
{
  /**
   * Returns the value of the '<em><b>Bt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bt</em>' containment reference.
   * @see #setBt(BT)
   * @see dk.sdu.mmmi.tjep.tJ.TJPackage#getVarRef_Bt()
   * @model containment="true"
   * @generated
   */
  BT getBt();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.tjep.tJ.VarRef#getBt <em>Bt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bt</em>' containment reference.
   * @see #getBt()
   * @generated
   */
  void setBt(BT value);

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
   * @see dk.sdu.mmmi.tjep.tJ.TJPackage#getVarRef_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.tjep.tJ.VarRef#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // VarRef
