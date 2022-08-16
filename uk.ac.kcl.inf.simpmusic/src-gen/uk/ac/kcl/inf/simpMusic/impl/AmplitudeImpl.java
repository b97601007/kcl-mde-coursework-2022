/**
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.inf.simpMusic.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.inf.simpMusic.AmpType;
import uk.ac.kcl.inf.simpMusic.Amplitude;
import uk.ac.kcl.inf.simpMusic.SimpMusicPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Amplitude</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.simpMusic.impl.AmplitudeImpl#getAmp <em>Amp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AmplitudeImpl extends ModificationImpl implements Amplitude
{
  /**
   * The default value of the '{@link #getAmp() <em>Amp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAmp()
   * @generated
   * @ordered
   */
  protected static final AmpType AMP_EDEFAULT = AmpType.WEAK;

  /**
   * The cached value of the '{@link #getAmp() <em>Amp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAmp()
   * @generated
   * @ordered
   */
  protected AmpType amp = AMP_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AmplitudeImpl()
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
    return SimpMusicPackage.Literals.AMPLITUDE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AmpType getAmp()
  {
    return amp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAmp(AmpType newAmp)
  {
    AmpType oldAmp = amp;
    amp = newAmp == null ? AMP_EDEFAULT : newAmp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpMusicPackage.AMPLITUDE__AMP, oldAmp, amp));
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
      case SimpMusicPackage.AMPLITUDE__AMP:
        return getAmp();
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
      case SimpMusicPackage.AMPLITUDE__AMP:
        setAmp((AmpType)newValue);
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
      case SimpMusicPackage.AMPLITUDE__AMP:
        setAmp(AMP_EDEFAULT);
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
      case SimpMusicPackage.AMPLITUDE__AMP:
        return amp != AMP_EDEFAULT;
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
    result.append(" (amp: ");
    result.append(amp);
    result.append(')');
    return result.toString();
  }

} //AmplitudeImpl