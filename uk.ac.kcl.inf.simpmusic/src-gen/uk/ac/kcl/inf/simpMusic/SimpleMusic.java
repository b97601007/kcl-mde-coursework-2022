/**
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.inf.simpMusic;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Music</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.simpMusic.SimpleMusic#getNotes <em>Notes</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.simpMusic.SimpMusicPackage#getSimpleMusic()
 * @model
 * @generated
 */
public interface SimpleMusic extends EObject
{
  /**
   * Returns the value of the '<em><b>Notes</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.kcl.inf.simpMusic.Note}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Notes</em>' containment reference list.
   * @see uk.ac.kcl.inf.simpMusic.SimpMusicPackage#getSimpleMusic_Notes()
   * @model containment="true"
   * @generated
   */
  EList<Note> getNotes();

} // SimpleMusic