/**
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.inf.simpMusic;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solfege</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.simpMusic.Solfege#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.simpMusic.SimpMusicPackage#getSolfege()
 * @model
 * @generated
 */
public interface Solfege extends Note
{
  /**
   * Returns the value of the '<em><b>Note</b></em>' attribute.
   * The literals are from the enumeration {@link uk.ac.kcl.inf.simpMusic.Solfa}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Note</em>' attribute.
   * @see uk.ac.kcl.inf.simpMusic.Solfa
   * @see #setNote(Solfa)
   * @see uk.ac.kcl.inf.simpMusic.SimpMusicPackage#getSolfege_Note()
   * @model
   * @generated
   */
  Solfa getNote();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.simpMusic.Solfege#getNote <em>Note</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Note</em>' attribute.
   * @see uk.ac.kcl.inf.simpMusic.Solfa
   * @see #getNote()
   * @generated
   */
  void setNote(Solfa value);

} // Solfege
