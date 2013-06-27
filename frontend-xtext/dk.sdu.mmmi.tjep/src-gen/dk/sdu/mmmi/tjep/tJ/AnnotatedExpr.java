/**
 */
package dk.sdu.mmmi.tjep.tJ;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotated Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.sdu.mmmi.tjep.tJ.AnnotatedExpr#getBt <em>Bt</em>}</li>
 *   <li>{@link dk.sdu.mmmi.tjep.tJ.AnnotatedExpr#getExp <em>Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.sdu.mmmi.tjep.tJ.TJPackage#getAnnotatedExpr()
 * @model
 * @generated
 */
public interface AnnotatedExpr extends Expr
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
   * @see dk.sdu.mmmi.tjep.tJ.TJPackage#getAnnotatedExpr_Bt()
   * @model containment="true"
   * @generated
   */
  BT getBt();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.tjep.tJ.AnnotatedExpr#getBt <em>Bt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bt</em>' containment reference.
   * @see #getBt()
   * @generated
   */
  void setBt(BT value);

  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference.
   * @see #setExp(EObject)
   * @see dk.sdu.mmmi.tjep.tJ.TJPackage#getAnnotatedExpr_Exp()
   * @model containment="true"
   * @generated
   */
  EObject getExp();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.tjep.tJ.AnnotatedExpr#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(EObject value);

} // AnnotatedExpr
