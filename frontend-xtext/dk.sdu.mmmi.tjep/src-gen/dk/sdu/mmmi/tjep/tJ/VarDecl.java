/**
 */
package dk.sdu.mmmi.tjep.tJ;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.sdu.mmmi.tjep.tJ.VarDecl#getType <em>Type</em>}</li>
 *   <li>{@link dk.sdu.mmmi.tjep.tJ.VarDecl#getVariant <em>Variant</em>}</li>
 *   <li>{@link dk.sdu.mmmi.tjep.tJ.VarDecl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.sdu.mmmi.tjep.tJ.TJPackage#getVarDecl()
 * @model
 * @generated
 */
public interface VarDecl extends Statement
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(Type)
   * @see dk.sdu.mmmi.tjep.tJ.TJPackage#getVarDecl_Type()
   * @model
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.tjep.tJ.VarDecl#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

  /**
   * Returns the value of the '<em><b>Variant</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variant</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variant</em>' attribute.
   * @see #setVariant(int)
   * @see dk.sdu.mmmi.tjep.tJ.TJPackage#getVarDecl_Variant()
   * @model
   * @generated
   */
  int getVariant();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.tjep.tJ.VarDecl#getVariant <em>Variant</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variant</em>' attribute.
   * @see #getVariant()
   * @generated
   */
  void setVariant(int value);

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
   * @see dk.sdu.mmmi.tjep.tJ.TJPackage#getVarDecl_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.tjep.tJ.VarDecl#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // VarDecl
