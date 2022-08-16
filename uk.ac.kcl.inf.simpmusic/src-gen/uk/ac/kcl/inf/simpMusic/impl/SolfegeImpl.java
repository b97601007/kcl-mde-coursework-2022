/**
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.inf.simpMusic.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.inf.simpMusic.SimpMusicPackage;
import uk.ac.kcl.inf.simpMusic.Solfa;
import uk.ac.kcl.inf.simpMusic.Solfege;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Solfege</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.simpMusic.impl.SolfegeImpl#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SolfegeImpl extends NoteImpl implements Solfege
{
  /**
   * The default value of the '{@link #getNote() <em>Note</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNote()
   * @generated
   * @ordered
   */
  protected static final Solfa NOTE_EDEFAULT = Solfa.DO;

  /**
   * The cached value of the '{@link #getNote() <em>Note</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNote()
   * @generated
   * @ordered
   */
  protected Solfa note = NOTE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SolfegeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SimpMusicPackage.Literals.SOLFEGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Solfa getNote()
  {
    return note;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNote(Solfa newNote)
  {
    Solfa oldNote = note;
    note = newNote == null ? NOTE_EDEFAULT : newNote;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpMusicPackage.SOLFEGE__NOTE, oldNote, note));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SimpMusicPackage.SOLFEGE__NOTE:
        return getNote();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SimpMusicPackage.SOLFEGE__NOTE:
        setNote((Solfa)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SimpMusicPackage.SOLFEGE__NOTE:
        setNote(NOTE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SimpMusicPackage.SOLFEGE__NOTE:
        return note != NOTE_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (note: ");
    result.append(note);
    result.append(')');
    return result.toString();
  }

} //SolfegeImpl
