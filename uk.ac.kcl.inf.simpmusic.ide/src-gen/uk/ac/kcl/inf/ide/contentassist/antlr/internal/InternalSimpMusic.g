/*
 * generated by Xtext 2.25.0
 */
grammar InternalSimpMusic;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package uk.ac.kcl.inf.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package uk.ac.kcl.inf.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import uk.ac.kcl.inf.services.SimpMusicGrammarAccess;

}
@parser::members {
	private SimpMusicGrammarAccess grammarAccess;

	public void setGrammarAccess(SimpMusicGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleSimpleMusic
entryRuleSimpleMusic
:
{ before(grammarAccess.getSimpleMusicRule()); }
	 ruleSimpleMusic
{ after(grammarAccess.getSimpleMusicRule()); } 
	 EOF 
;

// Rule SimpleMusic
ruleSimpleMusic 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSimpleMusicAccess().getNotesAssignment()); }
		(rule__SimpleMusic__NotesAssignment)*
		{ after(grammarAccess.getSimpleMusicAccess().getNotesAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNote
entryRuleNote
:
{ before(grammarAccess.getNoteRule()); }
	 ruleNote
{ after(grammarAccess.getNoteRule()); } 
	 EOF 
;

// Rule Note
ruleNote 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNoteAccess().getAlternatives()); }
		(rule__Note__Alternatives)
		{ after(grammarAccess.getNoteAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleLoopNote
entryRuleLoopNote
:
{ before(grammarAccess.getLoopNoteRule()); }
	 ruleLoopNote
{ after(grammarAccess.getLoopNoteRule()); } 
	 EOF 
;

// Rule LoopNote
ruleLoopNote 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getLoopNoteAccess().getGroup()); }
		(rule__LoopNote__Group__0)
		{ after(grammarAccess.getLoopNoteAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSolfege
entryRuleSolfege
:
{ before(grammarAccess.getSolfegeRule()); }
	 ruleSolfege
{ after(grammarAccess.getSolfegeRule()); } 
	 EOF 
;

// Rule Solfege
ruleSolfege 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSolfegeAccess().getNoteAssignment()); }
		(rule__Solfege__NoteAssignment)
		{ after(grammarAccess.getSolfegeAccess().getNoteAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSleep
entryRuleSleep
:
{ before(grammarAccess.getSleepRule()); }
	 ruleSleep
{ after(grammarAccess.getSleepRule()); } 
	 EOF 
;

// Rule Sleep
ruleSleep 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSleepAccess().getNoteAssignment()); }
		(rule__Sleep__NoteAssignment)
		{ after(grammarAccess.getSleepAccess().getNoteAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSolfegeWithModification
entryRuleSolfegeWithModification
:
{ before(grammarAccess.getSolfegeWithModificationRule()); }
	 ruleSolfegeWithModification
{ after(grammarAccess.getSolfegeWithModificationRule()); } 
	 EOF 
;

// Rule SolfegeWithModification
ruleSolfegeWithModification 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSolfegeWithModificationAccess().getGroup()); }
		(rule__SolfegeWithModification__Group__0)
		{ after(grammarAccess.getSolfegeWithModificationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleModification
entryRuleModification
:
{ before(grammarAccess.getModificationRule()); }
	 ruleModification
{ after(grammarAccess.getModificationRule()); } 
	 EOF 
;

// Rule Modification
ruleModification 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModificationAccess().getAlternatives()); }
		(rule__Modification__Alternatives)
		{ after(grammarAccess.getModificationAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAmplitude
entryRuleAmplitude
:
{ before(grammarAccess.getAmplitudeRule()); }
	 ruleAmplitude
{ after(grammarAccess.getAmplitudeRule()); } 
	 EOF 
;

// Rule Amplitude
ruleAmplitude 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAmplitudeAccess().getAmpAssignment()); }
		(rule__Amplitude__AmpAssignment)
		{ after(grammarAccess.getAmplitudeAccess().getAmpAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTimbre
entryRuleTimbre
:
{ before(grammarAccess.getTimbreRule()); }
	 ruleTimbre
{ after(grammarAccess.getTimbreRule()); } 
	 EOF 
;

// Rule Timbre
ruleTimbre 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTimbreAccess().getTimbreAssignment()); }
		(rule__Timbre__TimbreAssignment)
		{ after(grammarAccess.getTimbreAccess().getTimbreAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTone
entryRuleTone
:
{ before(grammarAccess.getToneRule()); }
	 ruleTone
{ after(grammarAccess.getToneRule()); } 
	 EOF 
;

// Rule Tone
ruleTone 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getToneAccess().getGroup()); }
		(rule__Tone__Group__0)
		{ after(grammarAccess.getToneAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule Solfa
ruleSolfa
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSolfaAccess().getAlternatives()); }
		(rule__Solfa__Alternatives)
		{ after(grammarAccess.getSolfaAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule AmpType
ruleAmpType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAmpTypeAccess().getAlternatives()); }
		(rule__AmpType__Alternatives)
		{ after(grammarAccess.getAmpTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule TimbreType
ruleTimbreType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimbreTypeAccess().getAlternatives()); }
		(rule__TimbreType__Alternatives)
		{ after(grammarAccess.getTimbreTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule ToneType
ruleToneType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getToneTypeAccess().getAlternatives()); }
		(rule__ToneType__Alternatives)
		{ after(grammarAccess.getToneTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Note__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNoteAccess().getSolfegeParserRuleCall_0()); }
		ruleSolfege
		{ after(grammarAccess.getNoteAccess().getSolfegeParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getNoteAccess().getSleepParserRuleCall_1()); }
		ruleSleep
		{ after(grammarAccess.getNoteAccess().getSleepParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getNoteAccess().getSolfegeWithModificationParserRuleCall_2()); }
		ruleSolfegeWithModification
		{ after(grammarAccess.getNoteAccess().getSolfegeWithModificationParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getNoteAccess().getLoopNoteParserRuleCall_3()); }
		ruleLoopNote
		{ after(grammarAccess.getNoteAccess().getLoopNoteParserRuleCall_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Modification__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModificationAccess().getAmplitudeParserRuleCall_0()); }
		ruleAmplitude
		{ after(grammarAccess.getModificationAccess().getAmplitudeParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getModificationAccess().getTimbreParserRuleCall_1()); }
		ruleTimbre
		{ after(grammarAccess.getModificationAccess().getTimbreParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getModificationAccess().getToneParserRuleCall_2()); }
		ruleTone
		{ after(grammarAccess.getModificationAccess().getToneParserRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Solfa__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSolfaAccess().getDoEnumLiteralDeclaration_0()); }
		('Do')
		{ after(grammarAccess.getSolfaAccess().getDoEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getSolfaAccess().getReEnumLiteralDeclaration_1()); }
		('Re')
		{ after(grammarAccess.getSolfaAccess().getReEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getSolfaAccess().getMiEnumLiteralDeclaration_2()); }
		('Mi')
		{ after(grammarAccess.getSolfaAccess().getMiEnumLiteralDeclaration_2()); }
	)
	|
	(
		{ before(grammarAccess.getSolfaAccess().getFaEnumLiteralDeclaration_3()); }
		('Fa')
		{ after(grammarAccess.getSolfaAccess().getFaEnumLiteralDeclaration_3()); }
	)
	|
	(
		{ before(grammarAccess.getSolfaAccess().getSolEnumLiteralDeclaration_4()); }
		('Sol')
		{ after(grammarAccess.getSolfaAccess().getSolEnumLiteralDeclaration_4()); }
	)
	|
	(
		{ before(grammarAccess.getSolfaAccess().getLaEnumLiteralDeclaration_5()); }
		('La')
		{ after(grammarAccess.getSolfaAccess().getLaEnumLiteralDeclaration_5()); }
	)
	|
	(
		{ before(grammarAccess.getSolfaAccess().getSiEnumLiteralDeclaration_6()); }
		('Si')
		{ after(grammarAccess.getSolfaAccess().getSiEnumLiteralDeclaration_6()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AmpType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAmpTypeAccess().getWeakEnumLiteralDeclaration_0()); }
		('>')
		{ after(grammarAccess.getAmpTypeAccess().getWeakEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getAmpTypeAccess().getStrongEnumLiteralDeclaration_1()); }
		('<')
		{ after(grammarAccess.getAmpTypeAccess().getStrongEnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TimbreType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimbreTypeAccess().getSharpEnumLiteralDeclaration_0()); }
		('sharp')
		{ after(grammarAccess.getTimbreTypeAccess().getSharpEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getTimbreTypeAccess().getFlatEnumLiteralDeclaration_1()); }
		('flat')
		{ after(grammarAccess.getTimbreTypeAccess().getFlatEnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ToneType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getToneTypeAccess().getHighEnumLiteralDeclaration_0()); }
		('+')
		{ after(grammarAccess.getToneTypeAccess().getHighEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getToneTypeAccess().getSubEnumLiteralDeclaration_1()); }
		('-')
		{ after(grammarAccess.getToneTypeAccess().getSubEnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LoopNote__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LoopNote__Group__0__Impl
	rule__LoopNote__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__LoopNote__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLoopNoteAccess().getCountAssignment_0()); }
	(rule__LoopNote__CountAssignment_0)
	{ after(grammarAccess.getLoopNoteAccess().getCountAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LoopNote__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LoopNote__Group__1__Impl
	rule__LoopNote__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__LoopNote__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLoopNoteAccess().getTimesKeyword_1()); }
	'times'
	{ after(grammarAccess.getLoopNoteAccess().getTimesKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LoopNote__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LoopNote__Group__2__Impl
	rule__LoopNote__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__LoopNote__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLoopNoteAccess().getDoKeyword_2()); }
	'do'
	{ after(grammarAccess.getLoopNoteAccess().getDoKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LoopNote__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LoopNote__Group__3__Impl
	rule__LoopNote__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__LoopNote__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLoopNoteAccess().getNotesAssignment_3()); }
	(rule__LoopNote__NotesAssignment_3)*
	{ after(grammarAccess.getLoopNoteAccess().getNotesAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LoopNote__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LoopNote__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__LoopNote__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLoopNoteAccess().getEndKeyword_4()); }
	'end'
	{ after(grammarAccess.getLoopNoteAccess().getEndKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SolfegeWithModification__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SolfegeWithModification__Group__0__Impl
	rule__SolfegeWithModification__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SolfegeWithModification__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSolfegeWithModificationAccess().getNoteAssignment_0()); }
	(rule__SolfegeWithModification__NoteAssignment_0)
	{ after(grammarAccess.getSolfegeWithModificationAccess().getNoteAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SolfegeWithModification__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SolfegeWithModification__Group__1__Impl
	rule__SolfegeWithModification__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SolfegeWithModification__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSolfegeWithModificationAccess().getLeftParenthesisKeyword_1()); }
	'('
	{ after(grammarAccess.getSolfegeWithModificationAccess().getLeftParenthesisKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SolfegeWithModification__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SolfegeWithModification__Group__2__Impl
	rule__SolfegeWithModification__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SolfegeWithModification__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getSolfegeWithModificationAccess().getModsAssignment_2()); }
		(rule__SolfegeWithModification__ModsAssignment_2)
		{ after(grammarAccess.getSolfegeWithModificationAccess().getModsAssignment_2()); }
	)
	(
		{ before(grammarAccess.getSolfegeWithModificationAccess().getModsAssignment_2()); }
		(rule__SolfegeWithModification__ModsAssignment_2)*
		{ after(grammarAccess.getSolfegeWithModificationAccess().getModsAssignment_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SolfegeWithModification__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SolfegeWithModification__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SolfegeWithModification__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSolfegeWithModificationAccess().getRightParenthesisKeyword_3()); }
	')'
	{ after(grammarAccess.getSolfegeWithModificationAccess().getRightParenthesisKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Tone__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Tone__Group__0__Impl
	rule__Tone__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Tone__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getToneAccess().getToneAssignment_0()); }
	(rule__Tone__ToneAssignment_0)
	{ after(grammarAccess.getToneAccess().getToneAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Tone__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Tone__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Tone__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getToneAccess().getValAssignment_1()); }
	(rule__Tone__ValAssignment_1)
	{ after(grammarAccess.getToneAccess().getValAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SimpleMusic__NotesAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSimpleMusicAccess().getNotesNoteParserRuleCall_0()); }
		ruleNote
		{ after(grammarAccess.getSimpleMusicAccess().getNotesNoteParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LoopNote__CountAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLoopNoteAccess().getCountINTTerminalRuleCall_0_0()); }
		RULE_INT
		{ after(grammarAccess.getLoopNoteAccess().getCountINTTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LoopNote__NotesAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLoopNoteAccess().getNotesNoteParserRuleCall_3_0()); }
		ruleNote
		{ after(grammarAccess.getLoopNoteAccess().getNotesNoteParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Solfege__NoteAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSolfegeAccess().getNoteSolfaEnumRuleCall_0()); }
		ruleSolfa
		{ after(grammarAccess.getSolfegeAccess().getNoteSolfaEnumRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Sleep__NoteAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSleepAccess().getNoteHyphenMinusKeyword_0()); }
		(
			{ before(grammarAccess.getSleepAccess().getNoteHyphenMinusKeyword_0()); }
			'-'
			{ after(grammarAccess.getSleepAccess().getNoteHyphenMinusKeyword_0()); }
		)
		{ after(grammarAccess.getSleepAccess().getNoteHyphenMinusKeyword_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SolfegeWithModification__NoteAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSolfegeWithModificationAccess().getNoteSolfegeParserRuleCall_0_0()); }
		ruleSolfege
		{ after(grammarAccess.getSolfegeWithModificationAccess().getNoteSolfegeParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SolfegeWithModification__ModsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSolfegeWithModificationAccess().getModsModificationParserRuleCall_2_0()); }
		ruleModification
		{ after(grammarAccess.getSolfegeWithModificationAccess().getModsModificationParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Amplitude__AmpAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAmplitudeAccess().getAmpAmpTypeEnumRuleCall_0()); }
		ruleAmpType
		{ after(grammarAccess.getAmplitudeAccess().getAmpAmpTypeEnumRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Timbre__TimbreAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTimbreAccess().getTimbreTimbreTypeEnumRuleCall_0()); }
		ruleTimbreType
		{ after(grammarAccess.getTimbreAccess().getTimbreTimbreTypeEnumRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Tone__ToneAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getToneAccess().getToneToneTypeEnumRuleCall_0_0()); }
		ruleToneType
		{ after(grammarAccess.getToneAccess().getToneToneTypeEnumRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Tone__ValAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getToneAccess().getValINTTerminalRuleCall_1_0()); }
		RULE_INT
		{ after(grammarAccess.getToneAccess().getValINTTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
