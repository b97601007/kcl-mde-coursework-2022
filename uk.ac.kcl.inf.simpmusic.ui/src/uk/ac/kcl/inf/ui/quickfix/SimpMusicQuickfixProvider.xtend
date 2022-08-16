/*
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.inf.ui.quickfix

import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider
import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.xtext.validation.Issue
import uk.ac.kcl.inf.simpMusic.LoopNote
import uk.ac.kcl.inf.simpMusic.Tone
import uk.ac.kcl.inf.simpMusic.ToneType
import uk.ac.kcl.inf.validation.SimpMusicValidator

/**
 * Custom quickfixes.
 * 
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#quick-fixes
 */
class SimpMusicQuickfixProvider extends DefaultQuickfixProvider {

	@Fix(SimpMusicValidator.INVALID_TONE)
	def resetTone(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.acceptMulti(issue, 'reset it to max/min value', 'Reset the tone to acceptable max/min value', null) [ element |
			val tone = element as Tone
			if (tone.tone === ToneType.HIGH) {
				tone.^val = 13
			} else {
				tone.^val = 4
			}
		]
	}

	@Fix(SimpMusicValidator.INVALID_LOOP_COUNT)
	def resetLoopCount(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.acceptMulti(issue, 'minimum loop count: 1', 'Reset the loop count to minimum value', null) [ element |
			val loopNote = element as LoopNote
			loopNote.count = 1
		]
	}

}
