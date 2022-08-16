/*
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.inf.validation

import java.util.List
import org.eclipse.xtext.validation.Check
import uk.ac.kcl.inf.simpMusic.Amplitude
import uk.ac.kcl.inf.simpMusic.LoopNote
import uk.ac.kcl.inf.simpMusic.Note
import uk.ac.kcl.inf.simpMusic.SimpMusicPackage
import uk.ac.kcl.inf.simpMusic.SimpleMusic
import uk.ac.kcl.inf.simpMusic.Sleep
import uk.ac.kcl.inf.simpMusic.Solfege
import uk.ac.kcl.inf.simpMusic.SolfegeWithModification
import uk.ac.kcl.inf.simpMusic.Timbre
import uk.ac.kcl.inf.simpMusic.Tone
import uk.ac.kcl.inf.simpMusic.ToneType

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class SimpMusicValidator extends AbstractSimpMusicValidator {

	public static val INVALID_TONE = "uk.ac.kcl.inf.SimpMusic.INVALID_VARIABLE_NAME"

	public static val INVALID_LOOP_COUNT = "uk.ac.kcl.inf.SimpMusic.INVALID_LOOP_COUNT"

	public static val INVALID_MOD_COUNTS = "uk.ac.kcl.inf.SimpMusic.INVALID_MOD_COUNTS"

	public static val MAY_NOT_COMPLETE = "uk.ac.kcl.inf.SimpMusic.valMAY_NOT_COMPLETE"

	var totalPulsesCount = 0

	@Check
	def checkMaximumAndMinimumValueOfTone(Tone tone) {

		val toneType = tone.tone
		val toneValue = tone.^val

		if (toneType === ToneType.HIGH && toneValue > 9) {
			warning("The modification of tune should not be greater than 9", tone, SimpMusicPackage.Literals.TONE__VAL,
				INVALID_TONE)
		} else if (toneType === ToneType.SUB && toneValue > 4) { // basic=4, minumim=0 -> toneValue-4 cannot be less than 0
			warning("The modification of tune should not be less than -4", tone, SimpMusicPackage.Literals.TONE__VAL,
				INVALID_TONE)
		}
	}

	@Check
	def checkLoopValue(LoopNote note) {
		if (note.count <= 0) {
			warning("Loop count must be greater than 0", note, SimpMusicPackage.Literals.LOOP_NOTE__COUNT,
				INVALID_LOOP_COUNT)
		}
	}

	@Check
	def checkModificationCounts(SolfegeWithModification swm) {

		if (swm.eAllContents.filter(Amplitude).size > 1) {
			swm.eAllContents.filter(Amplitude).forEach [ element |
				warning("amount of Amplitude should not be more than 1", element,
					SimpMusicPackage.Literals.AMPLITUDE__AMP, INVALID_MOD_COUNTS)
			]
		}
		if (swm.eAllContents.filter(Timbre).size > 1) {
			swm.eAllContents.filter(Timbre).forEach [ element |
				warning("amount of Timbre should not be more than 1", element, SimpMusicPackage.Literals.TIMBRE__TIMBRE,
					INVALID_MOD_COUNTS)
			]
		}
		if (swm.eAllContents.filter(Tone).size > 1) {
			swm.eAllContents.filter(Tone).forEach [ element |
				warning("amount of Tone should not be more than 1", element, SimpMusicPackage.Literals.TONE__TONE,
					INVALID_MOD_COUNTS)
			]
		}

	}

	// data flow analysis
	@Check(NORMAL)
	def checkTotalBeats(SimpleMusic sm) {
		totalPulsesCount = 0
		if (!sm.notes.checkAlwaysMultiple2or3) {
			warning("The song may not be completed (wrong number of beats)", sm,
				SimpMusicPackage.Literals.SIMPLE_MUSIC__NOTES, MAY_NOT_COMPLETE)
		}
	}

	private def checkAlwaysMultiple2or3(List<Note> notes) {
		notes.fold(true) [ prev, stmt |
			stmt.addBeatsAndCheck
		]
	}

	private dispatch def boolean addBeatsAndCheck(Note note) {
		totalPulsesCount.checkMultiple2or3
	}

	private dispatch def boolean addBeatsAndCheck(Solfege note) {
		totalPulsesCount++
		totalPulsesCount.checkMultiple2or3
	}

	private dispatch def boolean addBeatsAndCheck(Sleep note) {
		totalPulsesCount++
		totalPulsesCount.checkMultiple2or3
	}

	private dispatch def boolean addBeatsAndCheck(SolfegeWithModification note) {
		totalPulsesCount++
		totalPulsesCount.checkMultiple2or3
	}

	private dispatch def boolean addBeatsAndCheck(LoopNote note) {
		var result = true;
		for (var i = 0; i < note.count; i++) {
			result = note.notes.checkAlwaysMultiple2or3
		}
		result
	}

	private def checkMultiple2or3(int number) {
		number % 2 == 0 || number % 3 == 0
	}

}
