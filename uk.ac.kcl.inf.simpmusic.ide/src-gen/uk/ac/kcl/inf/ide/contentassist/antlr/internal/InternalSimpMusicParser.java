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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSimpMusicParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Do'", "'Re'", "'Mi'", "'Fa'", "'Sol'", "'La'", "'Si'", "'>'", "'<'", "'sharp'", "'flat'", "'+'", "'-'", "'times'", "'do'", "'end'", "'('", "')'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSimpMusicParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSimpMusicParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSimpMusicParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSimpMusic.g"; }


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



    // $ANTLR start "entryRuleSimpleMusic"
    // InternalSimpMusic.g:53:1: entryRuleSimpleMusic : ruleSimpleMusic EOF ;
    public final void entryRuleSimpleMusic() throws RecognitionException {
        try {
            // InternalSimpMusic.g:54:1: ( ruleSimpleMusic EOF )
            // InternalSimpMusic.g:55:1: ruleSimpleMusic EOF
            {
             before(grammarAccess.getSimpleMusicRule()); 
            pushFollow(FOLLOW_1);
            ruleSimpleMusic();

            state._fsp--;

             after(grammarAccess.getSimpleMusicRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSimpleMusic"


    // $ANTLR start "ruleSimpleMusic"
    // InternalSimpMusic.g:62:1: ruleSimpleMusic : ( ( rule__SimpleMusic__NotesAssignment )* ) ;
    public final void ruleSimpleMusic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpMusic.g:66:2: ( ( ( rule__SimpleMusic__NotesAssignment )* ) )
            // InternalSimpMusic.g:67:2: ( ( rule__SimpleMusic__NotesAssignment )* )
            {
            // InternalSimpMusic.g:67:2: ( ( rule__SimpleMusic__NotesAssignment )* )
            // InternalSimpMusic.g:68:3: ( rule__SimpleMusic__NotesAssignment )*
            {
             before(grammarAccess.getSimpleMusicAccess().getNotesAssignment()); 
            // InternalSimpMusic.g:69:3: ( rule__SimpleMusic__NotesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_INT||(LA1_0>=11 && LA1_0<=17)||LA1_0==23) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSimpMusic.g:69:4: rule__SimpleMusic__NotesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__SimpleMusic__NotesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getSimpleMusicAccess().getNotesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleMusic"


    // $ANTLR start "entryRuleNote"
    // InternalSimpMusic.g:78:1: entryRuleNote : ruleNote EOF ;
    public final void entryRuleNote() throws RecognitionException {
        try {
            // InternalSimpMusic.g:79:1: ( ruleNote EOF )
            // InternalSimpMusic.g:80:1: ruleNote EOF
            {
             before(grammarAccess.getNoteRule()); 
            pushFollow(FOLLOW_1);
            ruleNote();

            state._fsp--;

             after(grammarAccess.getNoteRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNote"


    // $ANTLR start "ruleNote"
    // InternalSimpMusic.g:87:1: ruleNote : ( ( rule__Note__Alternatives ) ) ;
    public final void ruleNote() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpMusic.g:91:2: ( ( ( rule__Note__Alternatives ) ) )
            // InternalSimpMusic.g:92:2: ( ( rule__Note__Alternatives ) )
            {
            // InternalSimpMusic.g:92:2: ( ( rule__Note__Alternatives ) )
            // InternalSimpMusic.g:93:3: ( rule__Note__Alternatives )
            {
             before(grammarAccess.getNoteAccess().getAlternatives()); 
            // InternalSimpMusic.g:94:3: ( rule__Note__Alternatives )
            // InternalSimpMusic.g:94:4: rule__Note__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Note__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNoteAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNote"


    // $ANTLR start "entryRuleLoopNote"
    // InternalSimpMusic.g:103:1: entryRuleLoopNote : ruleLoopNote EOF ;
    public final void entryRuleLoopNote() throws RecognitionException {
        try {
            // InternalSimpMusic.g:104:1: ( ruleLoopNote EOF )
            // InternalSimpMusic.g:105:1: ruleLoopNote EOF
            {
             before(grammarAccess.getLoopNoteRule()); 
            pushFollow(FOLLOW_1);
            ruleLoopNote();

            state._fsp--;

             after(grammarAccess.getLoopNoteRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLoopNote"


    // $ANTLR start "ruleLoopNote"
    // InternalSimpMusic.g:112:1: ruleLoopNote : ( ( rule__LoopNote__Group__0 ) ) ;
    public final void ruleLoopNote() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpMusic.g:116:2: ( ( ( rule__LoopNote__Group__0 ) ) )
            // InternalSimpMusic.g:117:2: ( ( rule__LoopNote__Group__0 ) )
            {
            // InternalSimpMusic.g:117:2: ( ( rule__LoopNote__Group__0 ) )
            // InternalSimpMusic.g:118:3: ( rule__LoopNote__Group__0 )
            {
             before(grammarAccess.getLoopNoteAccess().getGroup()); 
            // InternalSimpMusic.g:119:3: ( rule__LoopNote__Group__0 )
            // InternalSimpMusic.g:119:4: rule__LoopNote__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LoopNote__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLoopNoteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLoopNote"


    // $ANTLR start "entryRuleSolfege"
    // InternalSimpMusic.g:128:1: entryRuleSolfege : ruleSolfege EOF ;
    public final void entryRuleSolfege() throws RecognitionException {
        try {
            // InternalSimpMusic.g:129:1: ( ruleSolfege EOF )
            // InternalSimpMusic.g:130:1: ruleSolfege EOF
            {
             before(grammarAccess.getSolfegeRule()); 
            pushFollow(FOLLOW_1);
            ruleSolfege();

            state._fsp--;

             after(grammarAccess.getSolfegeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSolfege"


    // $ANTLR start "ruleSolfege"
    // InternalSimpMusic.g:137:1: ruleSolfege : ( ( rule__Solfege__NoteAssignment ) ) ;
    public final void ruleSolfege() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpMusic.g:141:2: ( ( ( rule__Solfege__NoteAssignment ) ) )
            // InternalSimpMusic.g:142:2: ( ( rule__Solfege__NoteAssignment ) )
            {
            // InternalSimpMusic.g:142:2: ( ( rule__Solfege__NoteAssignment ) )
            // InternalSimpMusic.g:143:3: ( rule__Solfege__NoteAssignment )
            {
             before(grammarAccess.getSolfegeAccess().getNoteAssignment()); 
            // InternalSimpMusic.g:144:3: ( rule__Solfege__NoteAssignment )
            // InternalSimpMusic.g:144:4: rule__Solfege__NoteAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Solfege__NoteAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSolfegeAccess().getNoteAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSolfege"


    // $ANTLR start "entryRuleSleep"
    // InternalSimpMusic.g:153:1: entryRuleSleep : ruleSleep EOF ;
    public final void entryRuleSleep() throws RecognitionException {
        try {
            // InternalSimpMusic.g:154:1: ( ruleSleep EOF )
            // InternalSimpMusic.g:155:1: ruleSleep EOF
            {
             before(grammarAccess.getSleepRule()); 
            pushFollow(FOLLOW_1);
            ruleSleep();

            state._fsp--;

             after(grammarAccess.getSleepRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSleep"


    // $ANTLR start "ruleSleep"
    // InternalSimpMusic.g:162:1: ruleSleep : ( ( rule__Sleep__NoteAssignment ) ) ;
    public final void ruleSleep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpMusic.g:166:2: ( ( ( rule__Sleep__NoteAssignment ) ) )
            // InternalSimpMusic.g:167:2: ( ( rule__Sleep__NoteAssignment ) )
            {
            // InternalSimpMusic.g:167:2: ( ( rule__Sleep__NoteAssignment ) )
            // InternalSimpMusic.g:168:3: ( rule__Sleep__NoteAssignment )
            {
             before(grammarAccess.getSleepAccess().getNoteAssignment()); 
            // InternalSimpMusic.g:169:3: ( rule__Sleep__NoteAssignment )
            // InternalSimpMusic.g:169:4: rule__Sleep__NoteAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Sleep__NoteAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSleepAccess().getNoteAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSleep"


    // $ANTLR start "entryRuleSolfegeWithModification"
    // InternalSimpMusic.g:178:1: entryRuleSolfegeWithModification : ruleSolfegeWithModification EOF ;
    public final void entryRuleSolfegeWithModification() throws RecognitionException {
        try {
            // InternalSimpMusic.g:179:1: ( ruleSolfegeWithModification EOF )
            // InternalSimpMusic.g:180:1: ruleSolfegeWithModification EOF
            {
             before(grammarAccess.getSolfegeWithModificationRule()); 
            pushFollow(FOLLOW_1);
            ruleSolfegeWithModification();

            state._fsp--;

             after(grammarAccess.getSolfegeWithModificationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSolfegeWithModification"


    // $ANTLR start "ruleSolfegeWithModification"
    // InternalSimpMusic.g:187:1: ruleSolfegeWithModification : ( ( rule__SolfegeWithModification__Group__0 ) ) ;
    public final void ruleSolfegeWithModification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpMusic.g:191:2: ( ( ( rule__SolfegeWithModification__Group__0 ) ) )
            // InternalSimpMusic.g:192:2: ( ( rule__SolfegeWithModification__Group__0 ) )
            {
            // InternalSimpMusic.g:192:2: ( ( rule__SolfegeWithModification__Group__0 ) )
            // InternalSimpMusic.g:193:3: ( rule__SolfegeWithModification__Group__0 )
            {
             before(grammarAccess.getSolfegeWithModificationAccess().getGroup()); 
            // InternalSimpMusic.g:194:3: ( rule__SolfegeWithModification__Group__0 )
            // InternalSimpMusic.g:194:4: rule__SolfegeWithModification__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SolfegeWithModification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSolfegeWithModificationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSolfegeWithModification"


    // $ANTLR start "entryRuleModification"
    // InternalSimpMusic.g:203:1: entryRuleModification : ruleModification EOF ;
    public final void entryRuleModification() throws RecognitionException {
        try {
            // InternalSimpMusic.g:204:1: ( ruleModification EOF )
            // InternalSimpMusic.g:205:1: ruleModification EOF
            {
             before(grammarAccess.getModificationRule()); 
            pushFollow(FOLLOW_1);
            ruleModification();

            state._fsp--;

             after(grammarAccess.getModificationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModification"


    // $ANTLR start "ruleModification"
    // InternalSimpMusic.g:212:1: ruleModification : ( ( rule__Modification__Alternatives ) ) ;
    public final void ruleModification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpMusic.g:216:2: ( ( ( rule__Modification__Alternatives ) ) )
            // InternalSimpMusic.g:217:2: ( ( rule__Modification__Alternatives ) )
            {
            // InternalSimpMusic.g:217:2: ( ( rule__Modification__Alternatives ) )
            // InternalSimpMusic.g:218:3: ( rule__Modification__Alternatives )
            {
             before(grammarAccess.getModificationAccess().getAlternatives()); 
            // InternalSimpMusic.g:219:3: ( rule__Modification__Alternatives )
            // InternalSimpMusic.g:219:4: rule__Modification__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Modification__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getModificationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModification"


    // $ANTLR start "entryRuleAmplitude"
    // InternalSimpMusic.g:228:1: entryRuleAmplitude : ruleAmplitude EOF ;
    public final void entryRuleAmplitude() throws RecognitionException {
        try {
            // InternalSimpMusic.g:229:1: ( ruleAmplitude EOF )
            // InternalSimpMusic.g:230:1: ruleAmplitude EOF
            {
             before(grammarAccess.getAmplitudeRule()); 
            pushFollow(FOLLOW_1);
            ruleAmplitude();

            state._fsp--;

             after(grammarAccess.getAmplitudeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAmplitude"


    // $ANTLR start "ruleAmplitude"
    // InternalSimpMusic.g:237:1: ruleAmplitude : ( ( rule__Amplitude__AmpAssignment ) ) ;
    public final void ruleAmplitude() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpMusic.g:241:2: ( ( ( rule__Amplitude__AmpAssignment ) ) )
            // InternalSimpMusic.g:242:2: ( ( rule__Amplitude__AmpAssignment ) )
            {
            // InternalSimpMusic.g:242:2: ( ( rule__Amplitude__AmpAssignment ) )
            // InternalSimpMusic.g:243:3: ( rule__Amplitude__AmpAssignment )
            {
             before(grammarAccess.getAmplitudeAccess().getAmpAssignment()); 
            // InternalSimpMusic.g:244:3: ( rule__Amplitude__AmpAssignment )
            // InternalSimpMusic.g:244:4: rule__Amplitude__AmpAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Amplitude__AmpAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAmplitudeAccess().getAmpAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAmplitude"


    // $ANTLR start "entryRuleTimbre"
    // InternalSimpMusic.g:253:1: entryRuleTimbre : ruleTimbre EOF ;
    public final void entryRuleTimbre() throws RecognitionException {
        try {
            // InternalSimpMusic.g:254:1: ( ruleTimbre EOF )
            // InternalSimpMusic.g:255:1: ruleTimbre EOF
            {
             before(grammarAccess.getTimbreRule()); 
            pushFollow(FOLLOW_1);
            ruleTimbre();

            state._fsp--;

             after(grammarAccess.getTimbreRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTimbre"


    // $ANTLR start "ruleTimbre"
    // InternalSimpMusic.g:262:1: ruleTimbre : ( ( rule__Timbre__TimbreAssignment ) ) ;
    public final void ruleTimbre() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpMusic.g:266:2: ( ( ( rule__Timbre__TimbreAssignment ) ) )
            // InternalSimpMusic.g:267:2: ( ( rule__Timbre__TimbreAssignment ) )
            {
            // InternalSimpMusic.g:267:2: ( ( rule__Timbre__TimbreAssignment ) )
            // InternalSimpMusic.g:268:3: ( rule__Timbre__TimbreAssignment )
            {
             before(grammarAccess.getTimbreAccess().getTimbreAssignment()); 
            // InternalSimpMusic.g:269:3: ( rule__Timbre__TimbreAssignment )
            // InternalSimpMusic.g:269:4: rule__Timbre__TimbreAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Timbre__TimbreAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTimbreAccess().getTimbreAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimbre"


    // $ANTLR start "entryRuleTone"
    // InternalSimpMusic.g:278:1: entryRuleTone : ruleTone EOF ;
    public final void entryRuleTone() throws RecognitionException {
        try {
            // InternalSimpMusic.g:279:1: ( ruleTone EOF )
            // InternalSimpMusic.g:280:1: ruleTone EOF
            {
             before(grammarAccess.getToneRule()); 
            pushFollow(FOLLOW_1);
            ruleTone();

            state._fsp--;

             after(grammarAccess.getToneRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTone"


    // $ANTLR start "ruleTone"
    // InternalSimpMusic.g:287:1: ruleTone : ( ( rule__Tone__Group__0 ) ) ;
    public final void ruleTone() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpMusic.g:291:2: ( ( ( rule__Tone__Group__0 ) ) )
            // InternalSimpMusic.g:292:2: ( ( rule__Tone__Group__0 ) )
            {
            // InternalSimpMusic.g:292:2: ( ( rule__Tone__Group__0 ) )
            // InternalSimpMusic.g:293:3: ( rule__Tone__Group__0 )
            {
             before(grammarAccess.getToneAccess().getGroup()); 
            // InternalSimpMusic.g:294:3: ( rule__Tone__Group__0 )
            // InternalSimpMusic.g:294:4: rule__Tone__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Tone__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getToneAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTone"


    // $ANTLR start "ruleSolfa"
    // InternalSimpMusic.g:303:1: ruleSolfa : ( ( rule__Solfa__Alternatives ) ) ;
    public final void ruleSolfa() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpMusic.g:307:1: ( ( ( rule__Solfa__Alternatives ) ) )
            // InternalSimpMusic.g:308:2: ( ( rule__Solfa__Alternatives ) )
            {
            // InternalSimpMusic.g:308:2: ( ( rule__Solfa__Alternatives ) )
            // InternalSimpMusic.g:309:3: ( rule__Solfa__Alternatives )
            {
             before(grammarAccess.getSolfaAccess().getAlternatives()); 
            // InternalSimpMusic.g:310:3: ( rule__Solfa__Alternatives )
            // InternalSimpMusic.g:310:4: rule__Solfa__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Solfa__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSolfaAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSolfa"


    // $ANTLR start "ruleAmpType"
    // InternalSimpMusic.g:319:1: ruleAmpType : ( ( rule__AmpType__Alternatives ) ) ;
    public final void ruleAmpType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpMusic.g:323:1: ( ( ( rule__AmpType__Alternatives ) ) )
            // InternalSimpMusic.g:324:2: ( ( rule__AmpType__Alternatives ) )
            {
            // InternalSimpMusic.g:324:2: ( ( rule__AmpType__Alternatives ) )
            // InternalSimpMusic.g:325:3: ( rule__AmpType__Alternatives )
            {
             before(grammarAccess.getAmpTypeAccess().getAlternatives()); 
            // InternalSimpMusic.g:326:3: ( rule__AmpType__Alternatives )
            // InternalSimpMusic.g:326:4: rule__AmpType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AmpType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAmpTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAmpType"


    // $ANTLR start "ruleTimbreType"
    // InternalSimpMusic.g:335:1: ruleTimbreType : ( ( rule__TimbreType__Alternatives ) ) ;
    public final void ruleTimbreType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpMusic.g:339:1: ( ( ( rule__TimbreType__Alternatives ) ) )
            // InternalSimpMusic.g:340:2: ( ( rule__TimbreType__Alternatives ) )
            {
            // InternalSimpMusic.g:340:2: ( ( rule__TimbreType__Alternatives ) )
            // InternalSimpMusic.g:341:3: ( rule__TimbreType__Alternatives )
            {
             before(grammarAccess.getTimbreTypeAccess().getAlternatives()); 
            // InternalSimpMusic.g:342:3: ( rule__TimbreType__Alternatives )
            // InternalSimpMusic.g:342:4: rule__TimbreType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TimbreType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTimbreTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimbreType"


    // $ANTLR start "ruleToneType"
    // InternalSimpMusic.g:351:1: ruleToneType : ( ( rule__ToneType__Alternatives ) ) ;
    public final void ruleToneType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpMusic.g:355:1: ( ( ( rule__ToneType__Alternatives ) ) )
            // InternalSimpMusic.g:356:2: ( ( rule__ToneType__Alternatives ) )
            {
            // InternalSimpMusic.g:356:2: ( ( rule__ToneType__Alternatives ) )
            // InternalSimpMusic.g:357:3: ( rule__ToneType__Alternatives )
            {
             before(grammarAccess.getToneTypeAccess().getAlternatives()); 
            // InternalSimpMusic.g:358:3: ( rule__ToneType__Alternatives )
            // InternalSimpMusic.g:358:4: rule__ToneType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ToneType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getToneTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleToneType"


    // $ANTLR start "rule__Note__Alternatives"
    // InternalSimpMusic.g:366:1: rule__Note__Alternatives : ( ( ruleSolfege ) | ( ruleSleep ) | ( ruleSolfegeWithModification ) | ( ruleLoopNote ) );
    public final void rule__Note__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpMusic.g:370:1: ( ( ruleSolfege ) | ( ruleSleep ) | ( ruleSolfegeWithModification ) | ( ruleLoopNote ) )
            int alt2=4;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalSimpMusic.g:371:2: ( ruleSolfege )
                    {
                    // InternalSimpMusic.g:371:2: ( ruleSolfege )
                    // InternalSimpMusic.g:372:3: ruleSolfege
                    {
                     before(grammarAccess.getNoteAccess().getSolfegeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSolfege();

                    state._fsp--;

                     after(grammarAccess.getNoteAccess().getSolfegeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSimpMusic.g:377:2: ( ruleSleep )
                    {
                    // InternalSimpMusic.g:377:2: ( ruleSleep )
                    // InternalSimpMusic.g:378:3: ruleSleep
                    {
                     before(grammarAccess.getNoteAccess().getSleepParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSleep();

                    state._fsp--;

                     after(grammarAccess.getNoteAccess().getSleepParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSimpMusic.g:383:2: ( ruleSolfegeWithModification )
                    {
                    // InternalSimpMusic.g:383:2: ( ruleSolfegeWithModification )
                    // InternalSimpMusic.g:384:3: ruleSolfegeWithModification
                    {
                     before(grammarAccess.getNoteAccess().getSolfegeWithModificationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSolfegeWithModification();

                    state._fsp--;

                     after(grammarAccess.getNoteAccess().getSolfegeWithModificationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSimpMusic.g:389:2: ( ruleLoopNote )
                    {
                    // InternalSimpMusic.g:389:2: ( ruleLoopNote )
                    // InternalSimpMusic.g:390:3: ruleLoopNote
                    {
                     before(grammarAccess.getNoteAccess().getLoopNoteParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleLoopNote();

                    state._fsp--;

                     after(grammarAccess.getNoteAccess().getLoopNoteParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Alternatives"


    // $ANTLR start "rule__Modification__Alternatives"
    // InternalSimpMusic.g:399:1: rule__Modification__Alternatives : ( ( ruleAmplitude ) | ( ruleTimbre ) | ( ruleTone ) );
    public final void rule__Modification__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpMusic.g:403:1: ( ( ruleAmplitude ) | ( ruleTimbre ) | ( ruleTone ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 18:
            case 19:
                {
                alt3=1;
                }
                break;
            case 20:
            case 21:
                {
                alt3=2;
                }
                break;
            case 22:
            case 23:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSimpMusic.g:404:2: ( ruleAmplitude )
                    {
                    // InternalSimpMusic.g:404:2: ( ruleAmplitude )
                    // InternalSimpMusic.g:405:3: ruleAmplitude
                    {
                     before(grammarAccess.getModificationAccess().getAmplitudeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAmplitude();

                    state._fsp--;

                     after(grammarAccess.getModificationAccess().getAmplitudeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSimpMusic.g:410:2: ( ruleTimbre )
                    {
                    // InternalSimpMusic.g:410:2: ( ruleTimbre )
                    // InternalSimpMusic.g:411:3: ruleTimbre
                    {
                     before(grammarAccess.getModificationAccess().getTimbreParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTimbre();

                    state._fsp--;

                     after(grammarAccess.getModificationAccess().getTimbreParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSimpMusic.g:416:2: ( ruleTone )
                    {
                    // InternalSimpMusic.g:416:2: ( ruleTone )
                    // InternalSimpMusic.g:417:3: ruleTone
                    {
                     before(grammarAccess.getModificationAccess().getToneParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleTone();

                    state._fsp--;

                     after(grammarAccess.getModificationAccess().getToneParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modification__Alternatives"


    // $ANTLR start "rule__Solfa__Alternatives"
    // InternalSimpMusic.g:426:1: rule__Solfa__Alternatives : ( ( ( 'Do' ) ) | ( ( 'Re' ) ) | ( ( 'Mi' ) ) | ( ( 'Fa' ) ) | ( ( 'Sol' ) ) | ( ( 'La' ) ) | ( ( 'Si' ) ) );
    public final void rule__Solfa__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpMusic.g:430:1: ( ( ( 'Do' ) ) | ( ( 'Re' ) ) | ( ( 'Mi' ) ) | ( ( 'Fa' ) ) | ( ( 'Sol' ) ) | ( ( 'La' ) ) | ( ( 'Si' ) ) )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            case 14:
                {
                alt4=4;
                }
                break;
            case 15:
                {
                alt4=5;
                }
                break;
            case 16:
                {
                alt4=6;
                }
                break;
            case 17:
                {
                alt4=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalSimpMusic.g:431:2: ( ( 'Do' ) )
                    {
                    // InternalSimpMusic.g:431:2: ( ( 'Do' ) )
                    // InternalSimpMusic.g:432:3: ( 'Do' )
                    {
                     before(grammarAccess.getSolfaAccess().getDoEnumLiteralDeclaration_0()); 
                    // InternalSimpMusic.g:433:3: ( 'Do' )
                    // InternalSimpMusic.g:433:4: 'Do'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getSolfaAccess().getDoEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSimpMusic.g:437:2: ( ( 'Re' ) )
                    {
                    // InternalSimpMusic.g:437:2: ( ( 'Re' ) )
                    // InternalSimpMusic.g:438:3: ( 'Re' )
                    {
                     before(grammarAccess.getSolfaAccess().getReEnumLiteralDeclaration_1()); 
                    // InternalSimpMusic.g:439:3: ( 'Re' )
                    // InternalSimpMusic.g:439:4: 'Re'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getSolfaAccess().getReEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSimpMusic.g:443:2: ( ( 'Mi' ) )
                    {
                    // InternalSimpMusic.g:443:2: ( ( 'Mi' ) )
                    // InternalSimpMusic.g:444:3: ( 'Mi' )
                    {
                     before(grammarAccess.getSolfaAccess().getMiEnumLiteralDeclaration_2()); 
                    // InternalSimpMusic.g:445:3: ( 'Mi' )
                    // InternalSimpMusic.g:445:4: 'Mi'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getSolfaAccess().getMiEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSimpMusic.g:449:2: ( ( 'Fa' ) )
                    {
                    // InternalSimpMusic.g:449:2: ( ( 'Fa' ) )
                    // InternalSimpMusic.g:450:3: ( 'Fa' )
                    {
                     before(grammarAccess.getSolfaAccess().getFaEnumLiteralDeclaration_3()); 
                    // InternalSimpMusic.g:451:3: ( 'Fa' )
                    // InternalSimpMusic.g:451:4: 'Fa'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getSolfaAccess().getFaEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSimpMusic.g:455:2: ( ( 'Sol' ) )
                    {
                    // InternalSimpMusic.g:455:2: ( ( 'Sol' ) )
                    // InternalSimpMusic.g:456:3: ( 'Sol' )
                    {
                     before(grammarAccess.getSolfaAccess().getSolEnumLiteralDeclaration_4()); 
                    // InternalSimpMusic.g:457:3: ( 'Sol' )
                    // InternalSimpMusic.g:457:4: 'Sol'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getSolfaAccess().getSolEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSimpMusic.g:461:2: ( ( 'La' ) )
                    {
                    // InternalSimpMusic.g:461:2: ( ( 'La' ) )
                    // InternalSimpMusic.g:462:3: ( 'La' )
                    {
                     before(grammarAccess.getSolfaAccess().getLaEnumLiteralDeclaration_5()); 
                    // InternalSimpMusic.g:463:3: ( 'La' )
                    // InternalSimpMusic.g:463:4: 'La'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getSolfaAccess().getLaEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSimpMusic.g:467:2: ( ( 'Si' ) )
                    {
                    // InternalSimpMusic.g:467:2: ( ( 'Si' ) )
                    // InternalSimpMusic.g:468:3: ( 'Si' )
                    {
                     before(grammarAccess.getSolfaAccess().getSiEnumLiteralDeclaration_6()); 
                    // InternalSimpMusic.g:469:3: ( 'Si' )
                    // InternalSimpMusic.g:469:4: 'Si'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getSolfaAccess().getSiEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Solfa__Alternatives"


    // $ANTLR start "rule__AmpType__Alternatives"
    // InternalSimpMusic.g:477:1: rule__AmpType__Alternatives : ( ( ( '>' ) ) | ( ( '<' ) ) );
    public final void rule__AmpType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpMusic.g:481:1: ( ( ( '>' ) ) | ( ( '<' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            else if ( (LA5_0==19) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSimpMusic.g:482:2: ( ( '>' ) )
                    {
                    // InternalSimpMusic.g:482:2: ( ( '>' ) )
                    // InternalSimpMusic.g:483:3: ( '>' )
                    {
                     before(grammarAccess.getAmpTypeAccess().getWeakEnumLiteralDeclaration_0()); 
                    // InternalSimpMusic.g:484:3: ( '>' )
                    // InternalSimpMusic.g:484:4: '>'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getAmpTypeAccess().getWeakEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSimpMusic.g:488:2: ( ( '<' ) )
                    {
                    // InternalSimpMusic.g:488:2: ( ( '<' ) )
                    // InternalSimpMusic.g:489:3: ( '<' )
                    {
                     before(grammarAccess.getAmpTypeAccess().getStrongEnumLiteralDeclaration_1()); 
                    // InternalSimpMusic.g:490:3: ( '<' )
                    // InternalSimpMusic.g:490:4: '<'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getAmpTypeAccess().getStrongEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmpType__Alternatives"


    // $ANTLR start "rule__TimbreType__Alternatives"
    // InternalSimpMusic.g:498:1: rule__TimbreType__Alternatives : ( ( ( 'sharp' ) ) | ( ( 'flat' ) ) );
    public final void rule__TimbreType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpMusic.g:502:1: ( ( ( 'sharp' ) ) | ( ( 'flat' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            else if ( (LA6_0==21) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSimpMusic.g:503:2: ( ( 'sharp' ) )
                    {
                    // InternalSimpMusic.g:503:2: ( ( 'sharp' ) )
                    // InternalSimpMusic.g:504:3: ( 'sharp' )
                    {
                     before(grammarAccess.getTimbreTypeAccess().getSharpEnumLiteralDeclaration_0()); 
                    // InternalSimpMusic.g:505:3: ( 'sharp' )
                    // InternalSimpMusic.g:505:4: 'sharp'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimbreTypeAccess().getSharpEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSimpMusic.g:509:2: ( ( 'flat' ) )
                    {
                    // InternalSimpMusic.g:509:2: ( ( 'flat' ) )
                    // InternalSimpMusic.g:510:3: ( 'flat' )
                    {
                     before(grammarAccess.getTimbreTypeAccess().getFlatEnumLiteralDeclaration_1()); 
                    // InternalSimpMusic.g:511:3: ( 'flat' )
                    // InternalSimpMusic.g:511:4: 'flat'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimbreTypeAccess().getFlatEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimbreType__Alternatives"


    // $ANTLR start "rule__ToneType__Alternatives"
    // InternalSimpMusic.g:519:1: rule__ToneType__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__ToneType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpMusic.g:523:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            else if ( (LA7_0==23) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalSimpMusic.g:524:2: ( ( '+' ) )
                    {
                    // InternalSimpMusic.g:524:2: ( ( '+' ) )
                    // InternalSimpMusic.g:525:3: ( '+' )
                    {
                     before(grammarAccess.getToneTypeAccess().getHighEnumLiteralDeclaration_0()); 
                    // InternalSimpMusic.g:526:3: ( '+' )
                    // InternalSimpMusic.g:526:4: '+'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getToneTypeAccess().getHighEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSimpMusic.g:530:2: ( ( '-' ) )
                    {
                    // InternalSimpMusic.g:530:2: ( ( '-' ) )
                    // InternalSimpMusic.g:531:3: ( '-' )
                    {
                     before(grammarAccess.getToneTypeAccess().getSubEnumLiteralDeclaration_1()); 
                    // InternalSimpMusic.g:532:3: ( '-' )
                    // InternalSimpMusic.g:532:4: '-'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getToneTypeAccess().getSubEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ToneType__Alternatives"


    // $ANTLR start "rule__LoopNote__Group__0"
    // InternalSimpMusic.g:540:1: rule__LoopNote__Group__0 : rule__LoopNote__Group__0__Impl rule__LoopNote__Group__1 ;
    public final void rule__LoopNote__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpMusic.g:544:1: ( rule__LoopNote__Group__0__Impl rule__LoopNote__Group__1 )
            // InternalSimpMusic.g:545:2: rule__LoopNote__Group__0__Impl rule__LoopNote__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__LoopNote__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoopNote__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopNote__Group__0"


    // $ANTLR start "rule__LoopNote__Group__0__Impl"
    // InternalSimpMusic.g:552:1: rule__LoopNote__Group__0__Impl : ( ( rule__LoopNote__CountAssignment_0 ) ) ;
    public final void rule__LoopNote__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpMusic.g:556:1: ( ( ( rule__LoopNote__CountAssignment_0 ) ) )
            // InternalSimpMusic.g:557:1: ( ( rule__LoopNote__CountAssignment_0 ) )
            {
            // InternalSimpMusic.g:557:1: ( ( rule__LoopNote__CountAssignment_0 ) )
            // InternalSimpMusic.g:558:2: ( rule__LoopNote__CountAssignment_0 )
            {
             before(grammarAccess.getLoopNoteAccess().getCountAssignment_0()); 
            // InternalSimpMusic.g:559:2: ( rule__LoopNote__CountAssignment_0 )
            // InternalSimpMusic.g:559:3: rule__LoopNote__CountAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__LoopNote__CountAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLoopNoteAccess().getCountAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopNote__Group__0__Impl"


    // $ANTLR start "rule__LoopNote__Group__1"
    // InternalSimpMusic.g:567:1: rule__LoopNote__Group__1 : rule__LoopNote__Group__1__Impl rule__LoopNote__Group__2 ;
    public final void rule__LoopNote__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpMusic.g:571:1: ( rule__LoopNote__Group__1__Impl rule__LoopNote__Group__2 )
            // InternalSimpMusic.g:572:2: rule__LoopNote__Group__1__Impl rule__LoopNote__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__LoopNote__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoopNote__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopNote__Group__1"


    // $ANTLR start "rule__LoopNote__Group__1__Impl"
    // InternalSimpMusic.g:579:1: rule__LoopNote__Group__1__Impl : ( 'times' ) ;
    public final void rule__LoopNote__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpMusic.g:583:1: ( ( 'times' ) )
            // InternalSimpMusic.g:584:1: ( 'times' )
            {
            // InternalSimpMusic.g:584:1: ( 'times' )
            // InternalSimpMusic.g:585:2: 'times'
            {
             before(grammarAccess.getLoopNoteAccess().getTimesKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getLoopNoteAccess().getTimesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopNote__Group__1__Impl"


    // $ANTLR start "rule__LoopNote__Group__2"
    // InternalSimpMusic.g:594:1: rule__LoopNote__Group__2 : rule__LoopNote__Group__2__Impl rule__LoopNote__Group__3 ;
    public final void rule__LoopNote__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpMusic.g:598:1: ( rule__LoopNote__Group__2__Impl rule__LoopNote__Group__3 )
            // InternalSimpMusic.g:599:2: rule__LoopNote__Group__2__Impl rule__LoopNote__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__LoopNote__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoopNote__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopNote__Group__2"


    // $ANTLR start "rule__LoopNote__Group__2__Impl"
    // InternalSimpMusic.g:606:1: rule__LoopNote__Group__2__Impl : ( 'do' ) ;
    public final void rule__LoopNote__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpMusic.g:610:1: ( ( 'do' ) )
            // InternalSimpMusic.g:611:1: ( 'do' )
            {
            // InternalSimpMusic.g:611:1: ( 'do' )
            // InternalSimpMusic.g:612:2: 'do'
            {
             before(grammarAccess.getLoopNoteAccess().getDoKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getLoopNoteAccess().getDoKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopNote__Group__2__Impl"


    // $ANTLR start "rule__LoopNote__Group__3"
    // InternalSimpMusic.g:621:1: rule__LoopNote__Group__3 : rule__LoopNote__Group__3__Impl rule__LoopNote__Group__4 ;
    public final void rule__LoopNote__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpMusic.g:625:1: ( rule__LoopNote__Group__3__Impl rule__LoopNote__Group__4 )
            // InternalSimpMusic.g:626:2: rule__LoopNote__Group__3__Impl rule__LoopNote__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__LoopNote__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoopNote__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopNote__Group__3"


    // $ANTLR start "rule__LoopNote__Group__3__Impl"
    // InternalSimpMusic.g:633:1: rule__LoopNote__Group__3__Impl : ( ( rule__LoopNote__NotesAssignment_3 )* ) ;
    public final void rule__LoopNote__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpMusic.g:637:1: ( ( ( rule__LoopNote__NotesAssignment_3 )* ) )
            // InternalSimpMusic.g:638:1: ( ( rule__LoopNote__NotesAssignment_3 )* )
            {
            // InternalSimpMusic.g:638:1: ( ( rule__LoopNote__NotesAssignment_3 )* )
            // InternalSimpMusic.g:639:2: ( rule__LoopNote__NotesAssignment_3 )*
            {
             before(grammarAccess.getLoopNoteAccess().getNotesAssignment_3()); 
            // InternalSimpMusic.g:640:2: ( rule__LoopNote__NotesAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_INT||(LA8_0>=11 && LA8_0<=17)||LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSimpMusic.g:640:3: rule__LoopNote__NotesAssignment_3
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__LoopNote__NotesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getLoopNoteAccess().getNotesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopNote__Group__3__Impl"


    // $ANTLR start "rule__LoopNote__Group__4"
    // InternalSimpMusic.g:648:1: rule__LoopNote__Group__4 : rule__LoopNote__Group__4__Impl ;
    public final void rule__LoopNote__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpMusic.g:652:1: ( rule__LoopNote__Group__4__Impl )
            // InternalSimpMusic.g:653:2: rule__LoopNote__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LoopNote__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopNote__Group__4"


    // $ANTLR start "rule__LoopNote__Group__4__Impl"
    // InternalSimpMusic.g:659:1: rule__LoopNote__Group__4__Impl : ( 'end' ) ;
    public final void rule__LoopNote__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpMusic.g:663:1: ( ( 'end' ) )
            // InternalSimpMusic.g:664:1: ( 'end' )
            {
            // InternalSimpMusic.g:664:1: ( 'end' )
            // InternalSimpMusic.g:665:2: 'end'
            {
             before(grammarAccess.getLoopNoteAccess().getEndKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getLoopNoteAccess().getEndKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopNote__Group__4__Impl"


    // $ANTLR start "rule__SolfegeWithModification__Group__0"
    // InternalSimpMusic.g:675:1: rule__SolfegeWithModification__Group__0 : rule__SolfegeWithModification__Group__0__Impl rule__SolfegeWithModification__Group__1 ;
    public final void rule__SolfegeWithModification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpMusic.g:679:1: ( rule__SolfegeWithModification__Group__0__Impl rule__SolfegeWithModification__Group__1 )
            // InternalSimpMusic.g:680:2: rule__SolfegeWithModification__Group__0__Impl rule__SolfegeWithModification__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__SolfegeWithModification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SolfegeWithModification__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolfegeWithModification__Group__0"


    // $ANTLR start "rule__SolfegeWithModification__Group__0__Impl"
    // InternalSimpMusic.g:687:1: rule__SolfegeWithModification__Group__0__Impl : ( ( rule__SolfegeWithModification__NoteAssignment_0 ) ) ;
    public final void rule__SolfegeWithModification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpMusic.g:691:1: ( ( ( rule__SolfegeWithModification__NoteAssignment_0 ) ) )
            // InternalSimpMusic.g:692:1: ( ( rule__SolfegeWithModification__NoteAssignment_0 ) )
            {
            // InternalSimpMusic.g:692:1: ( ( rule__SolfegeWithModification__NoteAssignment_0 ) )
            // InternalSimpMusic.g:693:2: ( rule__SolfegeWithModification__NoteAssignment_0 )
            {
             before(grammarAccess.getSolfegeWithModificationAccess().getNoteAssignment_0()); 
            // InternalSimpMusic.g:694:2: ( rule__SolfegeWithModification__NoteAssignment_0 )
            // InternalSimpMusic.g:694:3: rule__SolfegeWithModification__NoteAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SolfegeWithModification__NoteAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSolfegeWithModificationAccess().getNoteAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolfegeWithModification__Group__0__Impl"


    // $ANTLR start "rule__SolfegeWithModification__Group__1"
    // InternalSimpMusic.g:702:1: rule__SolfegeWithModification__Group__1 : rule__SolfegeWithModification__Group__1__Impl rule__SolfegeWithModification__Group__2 ;
    public final void rule__SolfegeWithModification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpMusic.g:706:1: ( rule__SolfegeWithModification__Group__1__Impl rule__SolfegeWithModification__Group__2 )
            // InternalSimpMusic.g:707:2: rule__SolfegeWithModification__Group__1__Impl rule__SolfegeWithModification__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__SolfegeWithModification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SolfegeWithModification__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolfegeWithModification__Group__1"


    // $ANTLR start "rule__SolfegeWithModification__Group__1__Impl"
    // InternalSimpMusic.g:714:1: rule__SolfegeWithModification__Group__1__Impl : ( '(' ) ;
    public final void rule__SolfegeWithModification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpMusic.g:718:1: ( ( '(' ) )
            // InternalSimpMusic.g:719:1: ( '(' )
            {
            // InternalSimpMusic.g:719:1: ( '(' )
            // InternalSimpMusic.g:720:2: '('
            {
             before(grammarAccess.getSolfegeWithModificationAccess().getLeftParenthesisKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSolfegeWithModificationAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolfegeWithModification__Group__1__Impl"


    // $ANTLR start "rule__SolfegeWithModification__Group__2"
    // InternalSimpMusic.g:729:1: rule__SolfegeWithModification__Group__2 : rule__SolfegeWithModification__Group__2__Impl rule__SolfegeWithModification__Group__3 ;
    public final void rule__SolfegeWithModification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpMusic.g:733:1: ( rule__SolfegeWithModification__Group__2__Impl rule__SolfegeWithModification__Group__3 )
            // InternalSimpMusic.g:734:2: rule__SolfegeWithModification__Group__2__Impl rule__SolfegeWithModification__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__SolfegeWithModification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SolfegeWithModification__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolfegeWithModification__Group__2"


    // $ANTLR start "rule__SolfegeWithModification__Group__2__Impl"
    // InternalSimpMusic.g:741:1: rule__SolfegeWithModification__Group__2__Impl : ( ( ( rule__SolfegeWithModification__ModsAssignment_2 ) ) ( ( rule__SolfegeWithModification__ModsAssignment_2 )* ) ) ;
    public final void rule__SolfegeWithModification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpMusic.g:745:1: ( ( ( ( rule__SolfegeWithModification__ModsAssignment_2 ) ) ( ( rule__SolfegeWithModification__ModsAssignment_2 )* ) ) )
            // InternalSimpMusic.g:746:1: ( ( ( rule__SolfegeWithModification__ModsAssignment_2 ) ) ( ( rule__SolfegeWithModification__ModsAssignment_2 )* ) )
            {
            // InternalSimpMusic.g:746:1: ( ( ( rule__SolfegeWithModification__ModsAssignment_2 ) ) ( ( rule__SolfegeWithModification__ModsAssignment_2 )* ) )
            // InternalSimpMusic.g:747:2: ( ( rule__SolfegeWithModification__ModsAssignment_2 ) ) ( ( rule__SolfegeWithModification__ModsAssignment_2 )* )
            {
            // InternalSimpMusic.g:747:2: ( ( rule__SolfegeWithModification__ModsAssignment_2 ) )
            // InternalSimpMusic.g:748:3: ( rule__SolfegeWithModification__ModsAssignment_2 )
            {
             before(grammarAccess.getSolfegeWithModificationAccess().getModsAssignment_2()); 
            // InternalSimpMusic.g:749:3: ( rule__SolfegeWithModification__ModsAssignment_2 )
            // InternalSimpMusic.g:749:4: rule__SolfegeWithModification__ModsAssignment_2
            {
            pushFollow(FOLLOW_10);
            rule__SolfegeWithModification__ModsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSolfegeWithModificationAccess().getModsAssignment_2()); 

            }

            // InternalSimpMusic.g:752:2: ( ( rule__SolfegeWithModification__ModsAssignment_2 )* )
            // InternalSimpMusic.g:753:3: ( rule__SolfegeWithModification__ModsAssignment_2 )*
            {
             before(grammarAccess.getSolfegeWithModificationAccess().getModsAssignment_2()); 
            // InternalSimpMusic.g:754:3: ( rule__SolfegeWithModification__ModsAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=18 && LA9_0<=23)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSimpMusic.g:754:4: rule__SolfegeWithModification__ModsAssignment_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__SolfegeWithModification__ModsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getSolfegeWithModificationAccess().getModsAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolfegeWithModification__Group__2__Impl"


    // $ANTLR start "rule__SolfegeWithModification__Group__3"
    // InternalSimpMusic.g:763:1: rule__SolfegeWithModification__Group__3 : rule__SolfegeWithModification__Group__3__Impl ;
    public final void rule__SolfegeWithModification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpMusic.g:767:1: ( rule__SolfegeWithModification__Group__3__Impl )
            // InternalSimpMusic.g:768:2: rule__SolfegeWithModification__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SolfegeWithModification__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolfegeWithModification__Group__3"


    // $ANTLR start "rule__SolfegeWithModification__Group__3__Impl"
    // InternalSimpMusic.g:774:1: rule__SolfegeWithModification__Group__3__Impl : ( ')' ) ;
    public final void rule__SolfegeWithModification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpMusic.g:778:1: ( ( ')' ) )
            // InternalSimpMusic.g:779:1: ( ')' )
            {
            // InternalSimpMusic.g:779:1: ( ')' )
            // InternalSimpMusic.g:780:2: ')'
            {
             before(grammarAccess.getSolfegeWithModificationAccess().getRightParenthesisKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSolfegeWithModificationAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolfegeWithModification__Group__3__Impl"


    // $ANTLR start "rule__Tone__Group__0"
    // InternalSimpMusic.g:790:1: rule__Tone__Group__0 : rule__Tone__Group__0__Impl rule__Tone__Group__1 ;
    public final void rule__Tone__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpMusic.g:794:1: ( rule__Tone__Group__0__Impl rule__Tone__Group__1 )
            // InternalSimpMusic.g:795:2: rule__Tone__Group__0__Impl rule__Tone__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Tone__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tone__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tone__Group__0"


    // $ANTLR start "rule__Tone__Group__0__Impl"
    // InternalSimpMusic.g:802:1: rule__Tone__Group__0__Impl : ( ( rule__Tone__ToneAssignment_0 ) ) ;
    public final void rule__Tone__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpMusic.g:806:1: ( ( ( rule__Tone__ToneAssignment_0 ) ) )
            // InternalSimpMusic.g:807:1: ( ( rule__Tone__ToneAssignment_0 ) )
            {
            // InternalSimpMusic.g:807:1: ( ( rule__Tone__ToneAssignment_0 ) )
            // InternalSimpMusic.g:808:2: ( rule__Tone__ToneAssignment_0 )
            {
             before(grammarAccess.getToneAccess().getToneAssignment_0()); 
            // InternalSimpMusic.g:809:2: ( rule__Tone__ToneAssignment_0 )
            // InternalSimpMusic.g:809:3: rule__Tone__ToneAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Tone__ToneAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getToneAccess().getToneAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tone__Group__0__Impl"


    // $ANTLR start "rule__Tone__Group__1"
    // InternalSimpMusic.g:817:1: rule__Tone__Group__1 : rule__Tone__Group__1__Impl ;
    public final void rule__Tone__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpMusic.g:821:1: ( rule__Tone__Group__1__Impl )
            // InternalSimpMusic.g:822:2: rule__Tone__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tone__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tone__Group__1"


    // $ANTLR start "rule__Tone__Group__1__Impl"
    // InternalSimpMusic.g:828:1: rule__Tone__Group__1__Impl : ( ( rule__Tone__ValAssignment_1 ) ) ;
    public final void rule__Tone__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpMusic.g:832:1: ( ( ( rule__Tone__ValAssignment_1 ) ) )
            // InternalSimpMusic.g:833:1: ( ( rule__Tone__ValAssignment_1 ) )
            {
            // InternalSimpMusic.g:833:1: ( ( rule__Tone__ValAssignment_1 ) )
            // InternalSimpMusic.g:834:2: ( rule__Tone__ValAssignment_1 )
            {
             before(grammarAccess.getToneAccess().getValAssignment_1()); 
            // InternalSimpMusic.g:835:2: ( rule__Tone__ValAssignment_1 )
            // InternalSimpMusic.g:835:3: rule__Tone__ValAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Tone__ValAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getToneAccess().getValAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tone__Group__1__Impl"


    // $ANTLR start "rule__SimpleMusic__NotesAssignment"
    // InternalSimpMusic.g:844:1: rule__SimpleMusic__NotesAssignment : ( ruleNote ) ;
    public final void rule__SimpleMusic__NotesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpMusic.g:848:1: ( ( ruleNote ) )
            // InternalSimpMusic.g:849:2: ( ruleNote )
            {
            // InternalSimpMusic.g:849:2: ( ruleNote )
            // InternalSimpMusic.g:850:3: ruleNote
            {
             before(grammarAccess.getSimpleMusicAccess().getNotesNoteParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleNote();

            state._fsp--;

             after(grammarAccess.getSimpleMusicAccess().getNotesNoteParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleMusic__NotesAssignment"


    // $ANTLR start "rule__LoopNote__CountAssignment_0"
    // InternalSimpMusic.g:859:1: rule__LoopNote__CountAssignment_0 : ( RULE_INT ) ;
    public final void rule__LoopNote__CountAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpMusic.g:863:1: ( ( RULE_INT ) )
            // InternalSimpMusic.g:864:2: ( RULE_INT )
            {
            // InternalSimpMusic.g:864:2: ( RULE_INT )
            // InternalSimpMusic.g:865:3: RULE_INT
            {
             before(grammarAccess.getLoopNoteAccess().getCountINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLoopNoteAccess().getCountINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopNote__CountAssignment_0"


    // $ANTLR start "rule__LoopNote__NotesAssignment_3"
    // InternalSimpMusic.g:874:1: rule__LoopNote__NotesAssignment_3 : ( ruleNote ) ;
    public final void rule__LoopNote__NotesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpMusic.g:878:1: ( ( ruleNote ) )
            // InternalSimpMusic.g:879:2: ( ruleNote )
            {
            // InternalSimpMusic.g:879:2: ( ruleNote )
            // InternalSimpMusic.g:880:3: ruleNote
            {
             before(grammarAccess.getLoopNoteAccess().getNotesNoteParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleNote();

            state._fsp--;

             after(grammarAccess.getLoopNoteAccess().getNotesNoteParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopNote__NotesAssignment_3"


    // $ANTLR start "rule__Solfege__NoteAssignment"
    // InternalSimpMusic.g:889:1: rule__Solfege__NoteAssignment : ( ruleSolfa ) ;
    public final void rule__Solfege__NoteAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpMusic.g:893:1: ( ( ruleSolfa ) )
            // InternalSimpMusic.g:894:2: ( ruleSolfa )
            {
            // InternalSimpMusic.g:894:2: ( ruleSolfa )
            // InternalSimpMusic.g:895:3: ruleSolfa
            {
             before(grammarAccess.getSolfegeAccess().getNoteSolfaEnumRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleSolfa();

            state._fsp--;

             after(grammarAccess.getSolfegeAccess().getNoteSolfaEnumRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Solfege__NoteAssignment"


    // $ANTLR start "rule__Sleep__NoteAssignment"
    // InternalSimpMusic.g:904:1: rule__Sleep__NoteAssignment : ( ( '-' ) ) ;
    public final void rule__Sleep__NoteAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpMusic.g:908:1: ( ( ( '-' ) ) )
            // InternalSimpMusic.g:909:2: ( ( '-' ) )
            {
            // InternalSimpMusic.g:909:2: ( ( '-' ) )
            // InternalSimpMusic.g:910:3: ( '-' )
            {
             before(grammarAccess.getSleepAccess().getNoteHyphenMinusKeyword_0()); 
            // InternalSimpMusic.g:911:3: ( '-' )
            // InternalSimpMusic.g:912:4: '-'
            {
             before(grammarAccess.getSleepAccess().getNoteHyphenMinusKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSleepAccess().getNoteHyphenMinusKeyword_0()); 

            }

             after(grammarAccess.getSleepAccess().getNoteHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sleep__NoteAssignment"


    // $ANTLR start "rule__SolfegeWithModification__NoteAssignment_0"
    // InternalSimpMusic.g:923:1: rule__SolfegeWithModification__NoteAssignment_0 : ( ruleSolfege ) ;
    public final void rule__SolfegeWithModification__NoteAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpMusic.g:927:1: ( ( ruleSolfege ) )
            // InternalSimpMusic.g:928:2: ( ruleSolfege )
            {
            // InternalSimpMusic.g:928:2: ( ruleSolfege )
            // InternalSimpMusic.g:929:3: ruleSolfege
            {
             before(grammarAccess.getSolfegeWithModificationAccess().getNoteSolfegeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSolfege();

            state._fsp--;

             after(grammarAccess.getSolfegeWithModificationAccess().getNoteSolfegeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolfegeWithModification__NoteAssignment_0"


    // $ANTLR start "rule__SolfegeWithModification__ModsAssignment_2"
    // InternalSimpMusic.g:938:1: rule__SolfegeWithModification__ModsAssignment_2 : ( ruleModification ) ;
    public final void rule__SolfegeWithModification__ModsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpMusic.g:942:1: ( ( ruleModification ) )
            // InternalSimpMusic.g:943:2: ( ruleModification )
            {
            // InternalSimpMusic.g:943:2: ( ruleModification )
            // InternalSimpMusic.g:944:3: ruleModification
            {
             before(grammarAccess.getSolfegeWithModificationAccess().getModsModificationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleModification();

            state._fsp--;

             after(grammarAccess.getSolfegeWithModificationAccess().getModsModificationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolfegeWithModification__ModsAssignment_2"


    // $ANTLR start "rule__Amplitude__AmpAssignment"
    // InternalSimpMusic.g:953:1: rule__Amplitude__AmpAssignment : ( ruleAmpType ) ;
    public final void rule__Amplitude__AmpAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpMusic.g:957:1: ( ( ruleAmpType ) )
            // InternalSimpMusic.g:958:2: ( ruleAmpType )
            {
            // InternalSimpMusic.g:958:2: ( ruleAmpType )
            // InternalSimpMusic.g:959:3: ruleAmpType
            {
             before(grammarAccess.getAmplitudeAccess().getAmpAmpTypeEnumRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAmpType();

            state._fsp--;

             after(grammarAccess.getAmplitudeAccess().getAmpAmpTypeEnumRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Amplitude__AmpAssignment"


    // $ANTLR start "rule__Timbre__TimbreAssignment"
    // InternalSimpMusic.g:968:1: rule__Timbre__TimbreAssignment : ( ruleTimbreType ) ;
    public final void rule__Timbre__TimbreAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpMusic.g:972:1: ( ( ruleTimbreType ) )
            // InternalSimpMusic.g:973:2: ( ruleTimbreType )
            {
            // InternalSimpMusic.g:973:2: ( ruleTimbreType )
            // InternalSimpMusic.g:974:3: ruleTimbreType
            {
             before(grammarAccess.getTimbreAccess().getTimbreTimbreTypeEnumRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleTimbreType();

            state._fsp--;

             after(grammarAccess.getTimbreAccess().getTimbreTimbreTypeEnumRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timbre__TimbreAssignment"


    // $ANTLR start "rule__Tone__ToneAssignment_0"
    // InternalSimpMusic.g:983:1: rule__Tone__ToneAssignment_0 : ( ruleToneType ) ;
    public final void rule__Tone__ToneAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpMusic.g:987:1: ( ( ruleToneType ) )
            // InternalSimpMusic.g:988:2: ( ruleToneType )
            {
            // InternalSimpMusic.g:988:2: ( ruleToneType )
            // InternalSimpMusic.g:989:3: ruleToneType
            {
             before(grammarAccess.getToneAccess().getToneToneTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleToneType();

            state._fsp--;

             after(grammarAccess.getToneAccess().getToneToneTypeEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tone__ToneAssignment_0"


    // $ANTLR start "rule__Tone__ValAssignment_1"
    // InternalSimpMusic.g:998:1: rule__Tone__ValAssignment_1 : ( RULE_INT ) ;
    public final void rule__Tone__ValAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpMusic.g:1002:1: ( ( RULE_INT ) )
            // InternalSimpMusic.g:1003:2: ( RULE_INT )
            {
            // InternalSimpMusic.g:1003:2: ( RULE_INT )
            // InternalSimpMusic.g:1004:3: RULE_INT
            {
             before(grammarAccess.getToneAccess().getValINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getToneAccess().getValINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tone__ValAssignment_1"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\uffff\7\13\4\uffff";
    static final String dfa_3s = "\10\4\4\uffff";
    static final String dfa_4s = "\1\27\7\33\4\uffff";
    static final String dfa_5s = "\10\uffff\1\2\1\4\1\3\1\1";
    static final String dfa_6s = "\14\uffff}>";
    static final String[] dfa_7s = {
            "\1\11\6\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\5\uffff\1\10",
            "\1\13\6\uffff\7\13\5\uffff\1\13\2\uffff\1\13\1\12",
            "\1\13\6\uffff\7\13\5\uffff\1\13\2\uffff\1\13\1\12",
            "\1\13\6\uffff\7\13\5\uffff\1\13\2\uffff\1\13\1\12",
            "\1\13\6\uffff\7\13\5\uffff\1\13\2\uffff\1\13\1\12",
            "\1\13\6\uffff\7\13\5\uffff\1\13\2\uffff\1\13\1\12",
            "\1\13\6\uffff\7\13\5\uffff\1\13\2\uffff\1\13\1\12",
            "\1\13\6\uffff\7\13\5\uffff\1\13\2\uffff\1\13\1\12",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "366:1: rule__Note__Alternatives : ( ( ruleSolfege ) | ( ruleSleep ) | ( ruleSolfegeWithModification ) | ( ruleLoopNote ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000083F812L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000483F810L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000FC0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000FC0002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});

}