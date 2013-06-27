/**
 */
package dk.sdu.mmmi.tjep.tJ;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.sdu.mmmi.tjep.tJ.Member#getBt <em>Bt</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.sdu.mmmi.tjep.tJ.TJPackage#getMember()
 * @model
 * @generated
 */
public interface Member extends EObject
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
   * @see dk.sdu.mmmi.tjep.tJ.TJPackage#getMember_Bt()
   * @model containment="true"
   * @generated
   */
  BT getBt();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.tjep.tJ.Member#getBt <em>Bt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bt</em>' containment reference.
   * @see #getBt()
   * @generated
   */
  void setBt(BT value);

} // Member
