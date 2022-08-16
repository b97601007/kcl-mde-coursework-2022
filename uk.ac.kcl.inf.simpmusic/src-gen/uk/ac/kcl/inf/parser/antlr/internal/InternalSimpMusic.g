/*
 * generated by Xtext 2.25.0
 */
grammar InternalSimpMusic;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package uk.ac.kcl.inf.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package uk.ac.kcl.inf.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uk.ac.kcl.inf.services.SimpMusicGrammarAccess;

}

@parser::members {

 	private SimpMusicGrammarAccess grammarAccess;

    public InternalSimpMusicParser(TokenStream input, SimpMusicGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "SimpleMusic";
   	}

   	@Override
   	protected SimpMusicGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleSimpleMusic
entryRuleSimpleMusic returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSimpleMusicRule()); }
	iv_ruleSimpleMusic=ruleSimpleMusic
	{ $current=$iv_ruleSimpleMusic.current; }
	EOF;

// Rule SimpleMusic
ruleSimpleMusic returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getSimpleMusicAccess().getNotesNoteParserRuleCall_0());
			}
			lv_notes_0_0=ruleNote
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getSimpleMusicRule());
				}
				add(
					$current,
					"notes",
					lv_notes_0_0,
					"uk.ac.kcl.inf.SimpMusic.Note");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleNote
entryRuleNote returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNoteRule()); }
	iv_ruleNote=ruleNote
	{ $current=$iv_ruleNote.current; }
	EOF;

// Rule Note
ruleNote returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getNoteAccess().getSolfegeParserRuleCall_0());
		}
		this_Solfege_0=ruleSolfege
		{
			$current = $this_Solfege_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getNoteAccess().getSleepParserRuleCall_1());
		}
		this_Sleep_1=ruleSleep
		{
			$current = $this_Sleep_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getNoteAccess().getSolfegeWithModificationParserRuleCall_2());
		}
		this_SolfegeWithModification_2=ruleSolfegeWithModification
		{
			$current = $this_SolfegeWithModification_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getNoteAccess().getLoopNoteParserRuleCall_3());
		}
		this_LoopNote_3=ruleLoopNote
		{
			$current = $this_LoopNote_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleLoopNote
entryRuleLoopNote returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLoopNoteRule()); }
	iv_ruleLoopNote=ruleLoopNote
	{ $current=$iv_ruleLoopNote.current; }
	EOF;

// Rule LoopNote
ruleLoopNote returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_count_0_0=RULE_INT
				{
					newLeafNode(lv_count_0_0, grammarAccess.getLoopNoteAccess().getCountINTTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getLoopNoteRule());
					}
					setWithLastConsumed(
						$current,
						"count",
						lv_count_0_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_1='times'
		{
			newLeafNode(otherlv_1, grammarAccess.getLoopNoteAccess().getTimesKeyword_1());
		}
		otherlv_2='do'
		{
			newLeafNode(otherlv_2, grammarAccess.getLoopNoteAccess().getDoKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getLoopNoteAccess().getNotesNoteParserRuleCall_3_0());
				}
				lv_notes_3_0=ruleNote
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLoopNoteRule());
					}
					add(
						$current,
						"notes",
						lv_notes_3_0,
						"uk.ac.kcl.inf.SimpMusic.Note");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='end'
		{
			newLeafNode(otherlv_4, grammarAccess.getLoopNoteAccess().getEndKeyword_4());
		}
	)
;

// Entry rule entryRuleSolfege
entryRuleSolfege returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSolfegeRule()); }
	iv_ruleSolfege=ruleSolfege
	{ $current=$iv_ruleSolfege.current; }
	EOF;

// Rule Solfege
ruleSolfege returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getSolfegeAccess().getNoteSolfaEnumRuleCall_0());
			}
			lv_note_0_0=ruleSolfa
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getSolfegeRule());
				}
				set(
					$current,
					"note",
					lv_note_0_0,
					"uk.ac.kcl.inf.SimpMusic.Solfa");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleSleep
entryRuleSleep returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSleepRule()); }
	iv_ruleSleep=ruleSleep
	{ $current=$iv_ruleSleep.current; }
	EOF;

// Rule Sleep
ruleSleep returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_note_0_0='-'
			{
				newLeafNode(lv_note_0_0, grammarAccess.getSleepAccess().getNoteHyphenMinusKeyword_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getSleepRule());
				}
				setWithLastConsumed($current, "note", lv_note_0_0, "-");
			}
		)
	)
;

// Entry rule entryRuleSolfegeWithModification
entryRuleSolfegeWithModification returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSolfegeWithModificationRule()); }
	iv_ruleSolfegeWithModification=ruleSolfegeWithModification
	{ $current=$iv_ruleSolfegeWithModification.current; }
	EOF;

// Rule SolfegeWithModification
ruleSolfegeWithModification returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getSolfegeWithModificationAccess().getNoteSolfegeParserRuleCall_0_0());
				}
				lv_note_0_0=ruleSolfege
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSolfegeWithModificationRule());
					}
					set(
						$current,
						"note",
						lv_note_0_0,
						"uk.ac.kcl.inf.SimpMusic.Solfege");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getSolfegeWithModificationAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSolfegeWithModificationAccess().getModsModificationParserRuleCall_2_0());
				}
				lv_mods_2_0=ruleModification
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSolfegeWithModificationRule());
					}
					add(
						$current,
						"mods",
						lv_mods_2_0,
						"uk.ac.kcl.inf.SimpMusic.Modification");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_3=')'
		{
			newLeafNode(otherlv_3, grammarAccess.getSolfegeWithModificationAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleModification
entryRuleModification returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModificationRule()); }
	iv_ruleModification=ruleModification
	{ $current=$iv_ruleModification.current; }
	EOF;

// Rule Modification
ruleModification returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getModificationAccess().getAmplitudeParserRuleCall_0());
		}
		this_Amplitude_0=ruleAmplitude
		{
			$current = $this_Amplitude_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getModificationAccess().getTimbreParserRuleCall_1());
		}
		this_Timbre_1=ruleTimbre
		{
			$current = $this_Timbre_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getModificationAccess().getToneParserRuleCall_2());
		}
		this_Tone_2=ruleTone
		{
			$current = $this_Tone_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleAmplitude
entryRuleAmplitude returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAmplitudeRule()); }
	iv_ruleAmplitude=ruleAmplitude
	{ $current=$iv_ruleAmplitude.current; }
	EOF;

// Rule Amplitude
ruleAmplitude returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getAmplitudeAccess().getAmpAmpTypeEnumRuleCall_0());
			}
			lv_amp_0_0=ruleAmpType
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getAmplitudeRule());
				}
				set(
					$current,
					"amp",
					lv_amp_0_0,
					"uk.ac.kcl.inf.SimpMusic.AmpType");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleTimbre
entryRuleTimbre returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTimbreRule()); }
	iv_ruleTimbre=ruleTimbre
	{ $current=$iv_ruleTimbre.current; }
	EOF;

// Rule Timbre
ruleTimbre returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getTimbreAccess().getTimbreTimbreTypeEnumRuleCall_0());
			}
			lv_timbre_0_0=ruleTimbreType
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getTimbreRule());
				}
				set(
					$current,
					"timbre",
					lv_timbre_0_0,
					"uk.ac.kcl.inf.SimpMusic.TimbreType");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleTone
entryRuleTone returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getToneRule()); }
	iv_ruleTone=ruleTone
	{ $current=$iv_ruleTone.current; }
	EOF;

// Rule Tone
ruleTone returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getToneAccess().getToneToneTypeEnumRuleCall_0_0());
				}
				lv_tone_0_0=ruleToneType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getToneRule());
					}
					set(
						$current,
						"tone",
						lv_tone_0_0,
						"uk.ac.kcl.inf.SimpMusic.ToneType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_val_1_0=RULE_INT
				{
					newLeafNode(lv_val_1_0, grammarAccess.getToneAccess().getValINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getToneRule());
					}
					setWithLastConsumed(
						$current,
						"val",
						lv_val_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

// Rule Solfa
ruleSolfa returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='Do'
			{
				$current = grammarAccess.getSolfaAccess().getDoEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getSolfaAccess().getDoEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='Re'
			{
				$current = grammarAccess.getSolfaAccess().getReEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getSolfaAccess().getReEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='Mi'
			{
				$current = grammarAccess.getSolfaAccess().getMiEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getSolfaAccess().getMiEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='Fa'
			{
				$current = grammarAccess.getSolfaAccess().getFaEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getSolfaAccess().getFaEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='Sol'
			{
				$current = grammarAccess.getSolfaAccess().getSolEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getSolfaAccess().getSolEnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='La'
			{
				$current = grammarAccess.getSolfaAccess().getLaEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getSolfaAccess().getLaEnumLiteralDeclaration_5());
			}
		)
		    |
		(
			enumLiteral_6='Si'
			{
				$current = grammarAccess.getSolfaAccess().getSiEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_6, grammarAccess.getSolfaAccess().getSiEnumLiteralDeclaration_6());
			}
		)
	)
;

// Rule AmpType
ruleAmpType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='>'
			{
				$current = grammarAccess.getAmpTypeAccess().getWeakEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getAmpTypeAccess().getWeakEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='<'
			{
				$current = grammarAccess.getAmpTypeAccess().getStrongEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getAmpTypeAccess().getStrongEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule TimbreType
ruleTimbreType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='sharp'
			{
				$current = grammarAccess.getTimbreTypeAccess().getSharpEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getTimbreTypeAccess().getSharpEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='flat'
			{
				$current = grammarAccess.getTimbreTypeAccess().getFlatEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getTimbreTypeAccess().getFlatEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule ToneType
ruleToneType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='+'
			{
				$current = grammarAccess.getToneTypeAccess().getHighEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getToneTypeAccess().getHighEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='-'
			{
				$current = grammarAccess.getToneTypeAccess().getSubEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getToneTypeAccess().getSubEnumLiteralDeclaration_1());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;