/**
 */
package dk.sdu.mmmi.tjep.tJ;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.sdu.mmmi.tjep.tJ.Constant#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.sdu.mmmi.tjep.tJ.TJPackage#getConstant()
 * @model
 * @generated
 */
public interface Constant extends BaseExp
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see dk.sdu.mmmi.tjep.tJ.TJPackage#getConstant_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.tjep.tJ.Constant#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

} // Constant
