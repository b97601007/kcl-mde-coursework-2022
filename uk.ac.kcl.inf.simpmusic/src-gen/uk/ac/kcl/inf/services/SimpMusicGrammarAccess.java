/*
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.inf.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class SimpMusicGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class SimpleMusicElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.SimpMusic.SimpleMusic");
		private final Assignment cNotesAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNotesNoteParserRuleCall_0 = (RuleCall)cNotesAssignment.eContents().get(0);
		
		//SimpleMusic:
		//    notes += Note*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//notes += Note*
		public Assignment getNotesAssignment() { return cNotesAssignment; }
		
		//Note
		public RuleCall getNotesNoteParserRuleCall_0() { return cNotesNoteParserRuleCall_0; }
	}
	public class NoteElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.SimpMusic.Note");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSolfegeParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cSleepParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cSolfegeWithModificationParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cLoopNoteParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//Note:
		//    Solfege |
		//    Sleep |
		//    SolfegeWithModification |
		//    LoopNote
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Solfege |
		//Sleep |
		//SolfegeWithModification |
		//LoopNote
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Solfege
		public RuleCall getSolfegeParserRuleCall_0() { return cSolfegeParserRuleCall_0; }
		
		//Sleep
		public RuleCall getSleepParserRuleCall_1() { return cSleepParserRuleCall_1; }
		
		//SolfegeWithModification
		public RuleCall getSolfegeWithModificationParserRuleCall_2() { return cSolfegeWithModificationParserRuleCall_2; }
		
		//LoopNote
		public RuleCall getLoopNoteParserRuleCall_3() { return cLoopNoteParserRuleCall_3; }
	}
	public class LoopNoteElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.SimpMusic.LoopNote");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cCountAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cCountINTTerminalRuleCall_0_0 = (RuleCall)cCountAssignment_0.eContents().get(0);
		private final Keyword cTimesKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cDoKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNotesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNotesNoteParserRuleCall_3_0 = (RuleCall)cNotesAssignment_3.eContents().get(0);
		private final Keyword cEndKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//LoopNote:
		//    count = INT "times" "do"
		//        notes += Note*
		//    "end"
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//count = INT "times" "do"
		//    notes += Note*
		//"end"
		public Group getGroup() { return cGroup; }
		
		//count = INT
		public Assignment getCountAssignment_0() { return cCountAssignment_0; }
		
		//INT
		public RuleCall getCountINTTerminalRuleCall_0_0() { return cCountINTTerminalRuleCall_0_0; }
		
		//"times"
		public Keyword getTimesKeyword_1() { return cTimesKeyword_1; }
		
		//"do"
		public Keyword getDoKeyword_2() { return cDoKeyword_2; }
		
		//notes += Note*
		public Assignment getNotesAssignment_3() { return cNotesAssignment_3; }
		
		//Note
		public RuleCall getNotesNoteParserRuleCall_3_0() { return cNotesNoteParserRuleCall_3_0; }
		
		//"end"
		public Keyword getEndKeyword_4() { return cEndKeyword_4; }
	}
	public class SolfegeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.SimpMusic.Solfege");
		private final Assignment cNoteAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNoteSolfaEnumRuleCall_0 = (RuleCall)cNoteAssignment.eContents().get(0);
		
		//Solfege:
		//    note = Solfa
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//note = Solfa
		public Assignment getNoteAssignment() { return cNoteAssignment; }
		
		//Solfa
		public RuleCall getNoteSolfaEnumRuleCall_0() { return cNoteSolfaEnumRuleCall_0; }
	}
	public class SleepElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.SimpMusic.Sleep");
		private final Assignment cNoteAssignment = (Assignment)rule.eContents().get(1);
		private final Keyword cNoteHyphenMinusKeyword_0 = (Keyword)cNoteAssignment.eContents().get(0);
		
		//Sleep:
		//    note = "-"
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//note = "-"
		public Assignment getNoteAssignment() { return cNoteAssignment; }
		
		//"-"
		public Keyword getNoteHyphenMinusKeyword_0() { return cNoteHyphenMinusKeyword_0; }
	}
	public class SolfegeWithModificationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.SimpMusic.SolfegeWithModification");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNoteAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNoteSolfegeParserRuleCall_0_0 = (RuleCall)cNoteAssignment_0.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cModsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cModsModificationParserRuleCall_2_0 = (RuleCall)cModsAssignment_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//SolfegeWithModification:
		//    note = Solfege "(" mods += Modification+ ")"
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//note = Solfege "(" mods += Modification+ ")"
		public Group getGroup() { return cGroup; }
		
		//note = Solfege
		public Assignment getNoteAssignment_0() { return cNoteAssignment_0; }
		
		//Solfege
		public RuleCall getNoteSolfegeParserRuleCall_0_0() { return cNoteSolfegeParserRuleCall_0_0; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//mods += Modification+
		public Assignment getModsAssignment_2() { return cModsAssignment_2; }
		
		//Modification
		public RuleCall getModsModificationParserRuleCall_2_0() { return cModsModificationParserRuleCall_2_0; }
		
		//")"
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}
	public class ModificationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.SimpMusic.Modification");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cAmplitudeParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cTimbreParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cToneParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Modification:
		//    Amplitude | Timbre | Tone
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Amplitude | Timbre | Tone
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Amplitude
		public RuleCall getAmplitudeParserRuleCall_0() { return cAmplitudeParserRuleCall_0; }
		
		//Timbre
		public RuleCall getTimbreParserRuleCall_1() { return cTimbreParserRuleCall_1; }
		
		//Tone
		public RuleCall getToneParserRuleCall_2() { return cToneParserRuleCall_2; }
	}
	public class AmplitudeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.SimpMusic.Amplitude");
		private final Assignment cAmpAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cAmpAmpTypeEnumRuleCall_0 = (RuleCall)cAmpAssignment.eContents().get(0);
		
		//Amplitude:
		//    amp = AmpType
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//amp = AmpType
		public Assignment getAmpAssignment() { return cAmpAssignment; }
		
		//AmpType
		public RuleCall getAmpAmpTypeEnumRuleCall_0() { return cAmpAmpTypeEnumRuleCall_0; }
	}
	public class TimbreElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.SimpMusic.Timbre");
		private final Assignment cTimbreAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cTimbreTimbreTypeEnumRuleCall_0 = (RuleCall)cTimbreAssignment.eContents().get(0);
		
		//Timbre:
		//    timbre = TimbreType
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//timbre = TimbreType
		public Assignment getTimbreAssignment() { return cTimbreAssignment; }
		
		//TimbreType
		public RuleCall getTimbreTimbreTypeEnumRuleCall_0() { return cTimbreTimbreTypeEnumRuleCall_0; }
	}
	public class ToneElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.SimpMusic.Tone");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cToneAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cToneToneTypeEnumRuleCall_0_0 = (RuleCall)cToneAssignment_0.eContents().get(0);
		private final Assignment cValAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValINTTerminalRuleCall_1_0 = (RuleCall)cValAssignment_1.eContents().get(0);
		
		//Tone:
		//    tone=ToneType(val = INT)
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//tone=ToneType(val = INT)
		public Group getGroup() { return cGroup; }
		
		//tone=ToneType
		public Assignment getToneAssignment_0() { return cToneAssignment_0; }
		
		//ToneType
		public RuleCall getToneToneTypeEnumRuleCall_0_0() { return cToneToneTypeEnumRuleCall_0_0; }
		
		//(val = INT)
		public Assignment getValAssignment_1() { return cValAssignment_1; }
		
		//INT
		public RuleCall getValINTTerminalRuleCall_1_0() { return cValINTTerminalRuleCall_1_0; }
	}
	
	public class SolfaElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.SimpMusic.Solfa");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cDoEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cDoDoKeyword_0_0 = (Keyword)cDoEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cReEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cReReKeyword_1_0 = (Keyword)cReEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cMiEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cMiMiKeyword_2_0 = (Keyword)cMiEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cFaEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cFaFaKeyword_3_0 = (Keyword)cFaEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cSolEnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cSolSolKeyword_4_0 = (Keyword)cSolEnumLiteralDeclaration_4.eContents().get(0);
		private final EnumLiteralDeclaration cLaEnumLiteralDeclaration_5 = (EnumLiteralDeclaration)cAlternatives.eContents().get(5);
		private final Keyword cLaLaKeyword_5_0 = (Keyword)cLaEnumLiteralDeclaration_5.eContents().get(0);
		private final EnumLiteralDeclaration cSiEnumLiteralDeclaration_6 = (EnumLiteralDeclaration)cAlternatives.eContents().get(6);
		private final Keyword cSiSiKeyword_6_0 = (Keyword)cSiEnumLiteralDeclaration_6.eContents().get(0);
		
		//enum Solfa:
		//    Do |
		//    Re |
		//    Mi |
		//    Fa |
		//    Sol |
		//    La |
		//    Si
		//;
		public EnumRule getRule() { return rule; }
		
		//Do |
		//Re |
		//Mi |
		//Fa |
		//Sol |
		//La |
		//Si
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Do
		public EnumLiteralDeclaration getDoEnumLiteralDeclaration_0() { return cDoEnumLiteralDeclaration_0; }
		
		public Keyword getDoDoKeyword_0_0() { return cDoDoKeyword_0_0; }
		
		//Re
		public EnumLiteralDeclaration getReEnumLiteralDeclaration_1() { return cReEnumLiteralDeclaration_1; }
		
		public Keyword getReReKeyword_1_0() { return cReReKeyword_1_0; }
		
		//Mi
		public EnumLiteralDeclaration getMiEnumLiteralDeclaration_2() { return cMiEnumLiteralDeclaration_2; }
		
		public Keyword getMiMiKeyword_2_0() { return cMiMiKeyword_2_0; }
		
		//Fa
		public EnumLiteralDeclaration getFaEnumLiteralDeclaration_3() { return cFaEnumLiteralDeclaration_3; }
		
		public Keyword getFaFaKeyword_3_0() { return cFaFaKeyword_3_0; }
		
		//Sol
		public EnumLiteralDeclaration getSolEnumLiteralDeclaration_4() { return cSolEnumLiteralDeclaration_4; }
		
		public Keyword getSolSolKeyword_4_0() { return cSolSolKeyword_4_0; }
		
		//La
		public EnumLiteralDeclaration getLaEnumLiteralDeclaration_5() { return cLaEnumLiteralDeclaration_5; }
		
		public Keyword getLaLaKeyword_5_0() { return cLaLaKeyword_5_0; }
		
		//Si
		public EnumLiteralDeclaration getSiEnumLiteralDeclaration_6() { return cSiEnumLiteralDeclaration_6; }
		
		public Keyword getSiSiKeyword_6_0() { return cSiSiKeyword_6_0; }
	}
	public class AmpTypeElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.SimpMusic.AmpType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cWeakEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cWeakGreaterThanSignKeyword_0_0 = (Keyword)cWeakEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cStrongEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cStrongLessThanSignKeyword_1_0 = (Keyword)cStrongEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum AmpType:
		//    weak = ">" |
		//    strong = "<"
		//;
		public EnumRule getRule() { return rule; }
		
		//weak = ">" |
		//strong = "<"
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//weak = ">"
		public EnumLiteralDeclaration getWeakEnumLiteralDeclaration_0() { return cWeakEnumLiteralDeclaration_0; }
		
		//">"
		public Keyword getWeakGreaterThanSignKeyword_0_0() { return cWeakGreaterThanSignKeyword_0_0; }
		
		//strong = "<"
		public EnumLiteralDeclaration getStrongEnumLiteralDeclaration_1() { return cStrongEnumLiteralDeclaration_1; }
		
		//"<"
		public Keyword getStrongLessThanSignKeyword_1_0() { return cStrongLessThanSignKeyword_1_0; }
	}
	public class TimbreTypeElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.SimpMusic.TimbreType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cSharpEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cSharpSharpKeyword_0_0 = (Keyword)cSharpEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cFlatEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cFlatFlatKeyword_1_0 = (Keyword)cFlatEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum TimbreType:
		//    sharp |
		//    flat
		//;
		public EnumRule getRule() { return rule; }
		
		//sharp |
		//flat
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//sharp
		public EnumLiteralDeclaration getSharpEnumLiteralDeclaration_0() { return cSharpEnumLiteralDeclaration_0; }
		
		public Keyword getSharpSharpKeyword_0_0() { return cSharpSharpKeyword_0_0; }
		
		//flat
		public EnumLiteralDeclaration getFlatEnumLiteralDeclaration_1() { return cFlatEnumLiteralDeclaration_1; }
		
		public Keyword getFlatFlatKeyword_1_0() { return cFlatFlatKeyword_1_0; }
	}
	public class ToneTypeElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.SimpMusic.ToneType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cHighEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cHighPlusSignKeyword_0_0 = (Keyword)cHighEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cSubEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cSubHyphenMinusKeyword_1_0 = (Keyword)cSubEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum ToneType:
		//    high = "+" |
		//    sub = "-"
		//;
		public EnumRule getRule() { return rule; }
		
		//high = "+" |
		//sub = "-"
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//high = "+"
		public EnumLiteralDeclaration getHighEnumLiteralDeclaration_0() { return cHighEnumLiteralDeclaration_0; }
		
		//"+"
		public Keyword getHighPlusSignKeyword_0_0() { return cHighPlusSignKeyword_0_0; }
		
		//sub = "-"
		public EnumLiteralDeclaration getSubEnumLiteralDeclaration_1() { return cSubEnumLiteralDeclaration_1; }
		
		//"-"
		public Keyword getSubHyphenMinusKeyword_1_0() { return cSubHyphenMinusKeyword_1_0; }
	}
	
	private final SimpleMusicElements pSimpleMusic;
	private final NoteElements pNote;
	private final LoopNoteElements pLoopNote;
	private final SolfegeElements pSolfege;
	private final SolfaElements eSolfa;
	private final SleepElements pSleep;
	private final SolfegeWithModificationElements pSolfegeWithModification;
	private final ModificationElements pModification;
	private final AmplitudeElements pAmplitude;
	private final AmpTypeElements eAmpType;
	private final TimbreElements pTimbre;
	private final TimbreTypeElements eTimbreType;
	private final ToneElements pTone;
	private final ToneTypeElements eToneType;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public SimpMusicGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pSimpleMusic = new SimpleMusicElements();
		this.pNote = new NoteElements();
		this.pLoopNote = new LoopNoteElements();
		this.pSolfege = new SolfegeElements();
		this.eSolfa = new SolfaElements();
		this.pSleep = new SleepElements();
		this.pSolfegeWithModification = new SolfegeWithModificationElements();
		this.pModification = new ModificationElements();
		this.pAmplitude = new AmplitudeElements();
		this.eAmpType = new AmpTypeElements();
		this.pTimbre = new TimbreElements();
		this.eTimbreType = new TimbreTypeElements();
		this.pTone = new ToneElements();
		this.eToneType = new ToneTypeElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("uk.ac.kcl.inf.SimpMusic".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//SimpleMusic:
	//    notes += Note*
	//;
	public SimpleMusicElements getSimpleMusicAccess() {
		return pSimpleMusic;
	}
	
	public ParserRule getSimpleMusicRule() {
		return getSimpleMusicAccess().getRule();
	}
	
	//Note:
	//    Solfege |
	//    Sleep |
	//    SolfegeWithModification |
	//    LoopNote
	//;
	public NoteElements getNoteAccess() {
		return pNote;
	}
	
	public ParserRule getNoteRule() {
		return getNoteAccess().getRule();
	}
	
	//LoopNote:
	//    count = INT "times" "do"
	//        notes += Note*
	//    "end"
	//;
	public LoopNoteElements getLoopNoteAccess() {
		return pLoopNote;
	}
	
	public ParserRule getLoopNoteRule() {
		return getLoopNoteAccess().getRule();
	}
	
	//Solfege:
	//    note = Solfa
	//;
	public SolfegeElements getSolfegeAccess() {
		return pSolfege;
	}
	
	public ParserRule getSolfegeRule() {
		return getSolfegeAccess().getRule();
	}
	
	//enum Solfa:
	//    Do |
	//    Re |
	//    Mi |
	//    Fa |
	//    Sol |
	//    La |
	//    Si
	//;
	public SolfaElements getSolfaAccess() {
		return eSolfa;
	}
	
	public EnumRule getSolfaRule() {
		return getSolfaAccess().getRule();
	}
	
	//Sleep:
	//    note = "-"
	//;
	public SleepElements getSleepAccess() {
		return pSleep;
	}
	
	public ParserRule getSleepRule() {
		return getSleepAccess().getRule();
	}
	
	//SolfegeWithModification:
	//    note = Solfege "(" mods += Modification+ ")"
	//;
	public SolfegeWithModificationElements getSolfegeWithModificationAccess() {
		return pSolfegeWithModification;
	}
	
	public ParserRule getSolfegeWithModificationRule() {
		return getSolfegeWithModificationAccess().getRule();
	}
	
	//Modification:
	//    Amplitude | Timbre | Tone
	//;
	public ModificationElements getModificationAccess() {
		return pModification;
	}
	
	public ParserRule getModificationRule() {
		return getModificationAccess().getRule();
	}
	
	//Amplitude:
	//    amp = AmpType
	//;
	public AmplitudeElements getAmplitudeAccess() {
		return pAmplitude;
	}
	
	public ParserRule getAmplitudeRule() {
		return getAmplitudeAccess().getRule();
	}
	
	//enum AmpType:
	//    weak = ">" |
	//    strong = "<"
	//;
	public AmpTypeElements getAmpTypeAccess() {
		return eAmpType;
	}
	
	public EnumRule getAmpTypeRule() {
		return getAmpTypeAccess().getRule();
	}
	
	//Timbre:
	//    timbre = TimbreType
	//;
	public TimbreElements getTimbreAccess() {
		return pTimbre;
	}
	
	public ParserRule getTimbreRule() {
		return getTimbreAccess().getRule();
	}
	
	//enum TimbreType:
	//    sharp |
	//    flat
	//;
	public TimbreTypeElements getTimbreTypeAccess() {
		return eTimbreType;
	}
	
	public EnumRule getTimbreTypeRule() {
		return getTimbreTypeAccess().getRule();
	}
	
	//Tone:
	//    tone=ToneType(val = INT)
	//;
	public ToneElements getToneAccess() {
		return pTone;
	}
	
	public ParserRule getToneRule() {
		return getToneAccess().getRule();
	}
	
	//enum ToneType:
	//    high = "+" |
	//    sub = "-"
	//;
	public ToneTypeElements getToneTypeAccess() {
		return eToneType;
	}
	
	public EnumRule getToneTypeRule() {
		return getToneTypeAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
