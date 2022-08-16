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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSimpMusicParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'times'", "'do'", "'end'", "'-'", "'('", "')'", "'Do'", "'Re'", "'Mi'", "'Fa'", "'Sol'", "'La'", "'Si'", "'>'", "'<'", "'sharp'", "'flat'", "'+'"
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




    // $ANTLR start "entryRuleSimpleMusic"
    // InternalSimpMusic.g:65:1: entryRuleSimpleMusic returns [EObject current=null] : iv_ruleSimpleMusic= ruleSimpleMusic EOF ;
    public final EObject entryRuleSimpleMusic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleMusic = null;


        try {
            // InternalSimpMusic.g:65:52: (iv_ruleSimpleMusic= ruleSimpleMusic EOF )
            // InternalSimpMusic.g:66:2: iv_ruleSimpleMusic= ruleSimpleMusic EOF
            {
             newCompositeNode(grammarAccess.getSimpleMusicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleMusic=ruleSimpleMusic();

            state._fsp--;

             current =iv_ruleSimpleMusic; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleMusic"


    // $ANTLR start "ruleSimpleMusic"
    // InternalSimpMusic.g:72:1: ruleSimpleMusic returns [EObject current=null] : ( (lv_notes_0_0= ruleNote ) )* ;
    public final EObject ruleSimpleMusic() throws RecognitionException {
        EObject current = null;

        EObject lv_notes_0_0 = null;



        	enterRule();

        try {
            // InternalSimpMusic.g:78:2: ( ( (lv_notes_0_0= ruleNote ) )* )
            // InternalSimpMusic.g:79:2: ( (lv_notes_0_0= ruleNote ) )*
            {
            // InternalSimpMusic.g:79:2: ( (lv_notes_0_0= ruleNote ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_INT||LA1_0==14||(LA1_0>=17 && LA1_0<=23)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSimpMusic.g:80:3: (lv_notes_0_0= ruleNote )
            	    {
            	    // InternalSimpMusic.g:80:3: (lv_notes_0_0= ruleNote )
            	    // InternalSimpMusic.g:81:4: lv_notes_0_0= ruleNote
            	    {

            	    				newCompositeNode(grammarAccess.getSimpleMusicAccess().getNotesNoteParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_notes_0_0=ruleNote();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getSimpleMusicRule());
            	    				}
            	    				add(
            	    					current,
            	    					"notes",
            	    					lv_notes_0_0,
            	    					"uk.ac.kcl.inf.SimpMusic.Note");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleMusic"


    // $ANTLR start "entryRuleNote"
    // InternalSimpMusic.g:101:1: entryRuleNote returns [EObject current=null] : iv_ruleNote= ruleNote EOF ;
    public final EObject entryRuleNote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNote = null;


        try {
            // InternalSimpMusic.g:101:45: (iv_ruleNote= ruleNote EOF )
            // InternalSimpMusic.g:102:2: iv_ruleNote= ruleNote EOF
            {
             newCompositeNode(grammarAccess.getNoteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNote=ruleNote();

            state._fsp--;

             current =iv_ruleNote; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNote"


    // $ANTLR start "ruleNote"
    // InternalSimpMusic.g:108:1: ruleNote returns [EObject current=null] : (this_Solfege_0= ruleSolfege | this_Sleep_1= ruleSleep | this_SolfegeWithModification_2= ruleSolfegeWithModification | this_LoopNote_3= ruleLoopNote ) ;
    public final EObject ruleNote() throws RecognitionException {
        EObject current = null;

        EObject this_Solfege_0 = null;

        EObject this_Sleep_1 = null;

        EObject this_SolfegeWithModification_2 = null;

        EObject this_LoopNote_3 = null;



        	enterRule();

        try {
            // InternalSimpMusic.g:114:2: ( (this_Solfege_0= ruleSolfege | this_Sleep_1= ruleSleep | this_SolfegeWithModification_2= ruleSolfegeWithModification | this_LoopNote_3= ruleLoopNote ) )
            // InternalSimpMusic.g:115:2: (this_Solfege_0= ruleSolfege | this_Sleep_1= ruleSleep | this_SolfegeWithModification_2= ruleSolfegeWithModification | this_LoopNote_3= ruleLoopNote )
            {
            // InternalSimpMusic.g:115:2: (this_Solfege_0= ruleSolfege | this_Sleep_1= ruleSleep | this_SolfegeWithModification_2= ruleSolfegeWithModification | this_LoopNote_3= ruleLoopNote )
            int alt2=4;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalSimpMusic.g:116:3: this_Solfege_0= ruleSolfege
                    {

                    			newCompositeNode(grammarAccess.getNoteAccess().getSolfegeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Solfege_0=ruleSolfege();

                    state._fsp--;


                    			current = this_Solfege_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSimpMusic.g:125:3: this_Sleep_1= ruleSleep
                    {

                    			newCompositeNode(grammarAccess.getNoteAccess().getSleepParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sleep_1=ruleSleep();

                    state._fsp--;


                    			current = this_Sleep_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSimpMusic.g:134:3: this_SolfegeWithModification_2= ruleSolfegeWithModification
                    {

                    			newCompositeNode(grammarAccess.getNoteAccess().getSolfegeWithModificationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_SolfegeWithModification_2=ruleSolfegeWithModification();

                    state._fsp--;


                    			current = this_SolfegeWithModification_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSimpMusic.g:143:3: this_LoopNote_3= ruleLoopNote
                    {

                    			newCompositeNode(grammarAccess.getNoteAccess().getLoopNoteParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_LoopNote_3=ruleLoopNote();

                    state._fsp--;


                    			current = this_LoopNote_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNote"


    // $ANTLR start "entryRuleLoopNote"
    // InternalSimpMusic.g:155:1: entryRuleLoopNote returns [EObject current=null] : iv_ruleLoopNote= ruleLoopNote EOF ;
    public final EObject entryRuleLoopNote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoopNote = null;


        try {
            // InternalSimpMusic.g:155:49: (iv_ruleLoopNote= ruleLoopNote EOF )
            // InternalSimpMusic.g:156:2: iv_ruleLoopNote= ruleLoopNote EOF
            {
             newCompositeNode(grammarAccess.getLoopNoteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoopNote=ruleLoopNote();

            state._fsp--;

             current =iv_ruleLoopNote; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLoopNote"


    // $ANTLR start "ruleLoopNote"
    // InternalSimpMusic.g:162:1: ruleLoopNote returns [EObject current=null] : ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'times' otherlv_2= 'do' ( (lv_notes_3_0= ruleNote ) )* otherlv_4= 'end' ) ;
    public final EObject ruleLoopNote() throws RecognitionException {
        EObject current = null;

        Token lv_count_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_notes_3_0 = null;



        	enterRule();

        try {
            // InternalSimpMusic.g:168:2: ( ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'times' otherlv_2= 'do' ( (lv_notes_3_0= ruleNote ) )* otherlv_4= 'end' ) )
            // InternalSimpMusic.g:169:2: ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'times' otherlv_2= 'do' ( (lv_notes_3_0= ruleNote ) )* otherlv_4= 'end' )
            {
            // InternalSimpMusic.g:169:2: ( ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'times' otherlv_2= 'do' ( (lv_notes_3_0= ruleNote ) )* otherlv_4= 'end' )
            // InternalSimpMusic.g:170:3: ( (lv_count_0_0= RULE_INT ) ) otherlv_1= 'times' otherlv_2= 'do' ( (lv_notes_3_0= ruleNote ) )* otherlv_4= 'end'
            {
            // InternalSimpMusic.g:170:3: ( (lv_count_0_0= RULE_INT ) )
            // InternalSimpMusic.g:171:4: (lv_count_0_0= RULE_INT )
            {
            // InternalSimpMusic.g:171:4: (lv_count_0_0= RULE_INT )
            // InternalSimpMusic.g:172:5: lv_count_0_0= RULE_INT
            {
            lv_count_0_0=(Token)match(input,RULE_INT,FOLLOW_4); 

            					newLeafNode(lv_count_0_0, grammarAccess.getLoopNoteAccess().getCountINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLoopNoteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"count",
            						lv_count_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getLoopNoteAccess().getTimesKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getLoopNoteAccess().getDoKeyword_2());
            		
            // InternalSimpMusic.g:196:3: ( (lv_notes_3_0= ruleNote ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_INT||LA3_0==14||(LA3_0>=17 && LA3_0<=23)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSimpMusic.g:197:4: (lv_notes_3_0= ruleNote )
            	    {
            	    // InternalSimpMusic.g:197:4: (lv_notes_3_0= ruleNote )
            	    // InternalSimpMusic.g:198:5: lv_notes_3_0= ruleNote
            	    {

            	    					newCompositeNode(grammarAccess.getLoopNoteAccess().getNotesNoteParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_notes_3_0=ruleNote();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLoopNoteRule());
            	    					}
            	    					add(
            	    						current,
            	    						"notes",
            	    						lv_notes_3_0,
            	    						"uk.ac.kcl.inf.SimpMusic.Note");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getLoopNoteAccess().getEndKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLoopNote"


    // $ANTLR start "entryRuleSolfege"
    // InternalSimpMusic.g:223:1: entryRuleSolfege returns [EObject current=null] : iv_ruleSolfege= ruleSolfege EOF ;
    public final EObject entryRuleSolfege() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSolfege = null;


        try {
            // InternalSimpMusic.g:223:48: (iv_ruleSolfege= ruleSolfege EOF )
            // InternalSimpMusic.g:224:2: iv_ruleSolfege= ruleSolfege EOF
            {
             newCompositeNode(grammarAccess.getSolfegeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSolfege=ruleSolfege();

            state._fsp--;

             current =iv_ruleSolfege; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSolfege"


    // $ANTLR start "ruleSolfege"
    // InternalSimpMusic.g:230:1: ruleSolfege returns [EObject current=null] : ( (lv_note_0_0= ruleSolfa ) ) ;
    public final EObject ruleSolfege() throws RecognitionException {
        EObject current = null;

        Enumerator lv_note_0_0 = null;



        	enterRule();

        try {
            // InternalSimpMusic.g:236:2: ( ( (lv_note_0_0= ruleSolfa ) ) )
            // InternalSimpMusic.g:237:2: ( (lv_note_0_0= ruleSolfa ) )
            {
            // InternalSimpMusic.g:237:2: ( (lv_note_0_0= ruleSolfa ) )
            // InternalSimpMusic.g:238:3: (lv_note_0_0= ruleSolfa )
            {
            // InternalSimpMusic.g:238:3: (lv_note_0_0= ruleSolfa )
            // InternalSimpMusic.g:239:4: lv_note_0_0= ruleSolfa
            {

            				newCompositeNode(grammarAccess.getSolfegeAccess().getNoteSolfaEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_note_0_0=ruleSolfa();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getSolfegeRule());
            				}
            				set(
            					current,
            					"note",
            					lv_note_0_0,
            					"uk.ac.kcl.inf.SimpMusic.Solfa");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSolfege"


    // $ANTLR start "entryRuleSleep"
    // InternalSimpMusic.g:259:1: entryRuleSleep returns [EObject current=null] : iv_ruleSleep= ruleSleep EOF ;
    public final EObject entryRuleSleep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSleep = null;


        try {
            // InternalSimpMusic.g:259:46: (iv_ruleSleep= ruleSleep EOF )
            // InternalSimpMusic.g:260:2: iv_ruleSleep= ruleSleep EOF
            {
             newCompositeNode(grammarAccess.getSleepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSleep=ruleSleep();

            state._fsp--;

             current =iv_ruleSleep; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSleep"


    // $ANTLR start "ruleSleep"
    // InternalSimpMusic.g:266:1: ruleSleep returns [EObject current=null] : ( (lv_note_0_0= '-' ) ) ;
    public final EObject ruleSleep() throws RecognitionException {
        EObject current = null;

        Token lv_note_0_0=null;


        	enterRule();

        try {
            // InternalSimpMusic.g:272:2: ( ( (lv_note_0_0= '-' ) ) )
            // InternalSimpMusic.g:273:2: ( (lv_note_0_0= '-' ) )
            {
            // InternalSimpMusic.g:273:2: ( (lv_note_0_0= '-' ) )
            // InternalSimpMusic.g:274:3: (lv_note_0_0= '-' )
            {
            // InternalSimpMusic.g:274:3: (lv_note_0_0= '-' )
            // InternalSimpMusic.g:275:4: lv_note_0_0= '-'
            {
            lv_note_0_0=(Token)match(input,14,FOLLOW_2); 

            				newLeafNode(lv_note_0_0, grammarAccess.getSleepAccess().getNoteHyphenMinusKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSleepRule());
            				}
            				setWithLastConsumed(current, "note", lv_note_0_0, "-");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSleep"


    // $ANTLR start "entryRuleSolfegeWithModification"
    // InternalSimpMusic.g:290:1: entryRuleSolfegeWithModification returns [EObject current=null] : iv_ruleSolfegeWithModification= ruleSolfegeWithModification EOF ;
    public final EObject entryRuleSolfegeWithModification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSolfegeWithModification = null;


        try {
            // InternalSimpMusic.g:290:64: (iv_ruleSolfegeWithModification= ruleSolfegeWithModification EOF )
            // InternalSimpMusic.g:291:2: iv_ruleSolfegeWithModification= ruleSolfegeWithModification EOF
            {
             newCompositeNode(grammarAccess.getSolfegeWithModificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSolfegeWithModification=ruleSolfegeWithModification();

            state._fsp--;

             current =iv_ruleSolfegeWithModification; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSolfegeWithModification"


    // $ANTLR start "ruleSolfegeWithModification"
    // InternalSimpMusic.g:297:1: ruleSolfegeWithModification returns [EObject current=null] : ( ( (lv_note_0_0= ruleSolfege ) ) otherlv_1= '(' ( (lv_mods_2_0= ruleModification ) )+ otherlv_3= ')' ) ;
    public final EObject ruleSolfegeWithModification() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_note_0_0 = null;

        EObject lv_mods_2_0 = null;



        	enterRule();

        try {
            // InternalSimpMusic.g:303:2: ( ( ( (lv_note_0_0= ruleSolfege ) ) otherlv_1= '(' ( (lv_mods_2_0= ruleModification ) )+ otherlv_3= ')' ) )
            // InternalSimpMusic.g:304:2: ( ( (lv_note_0_0= ruleSolfege ) ) otherlv_1= '(' ( (lv_mods_2_0= ruleModification ) )+ otherlv_3= ')' )
            {
            // InternalSimpMusic.g:304:2: ( ( (lv_note_0_0= ruleSolfege ) ) otherlv_1= '(' ( (lv_mods_2_0= ruleModification ) )+ otherlv_3= ')' )
            // InternalSimpMusic.g:305:3: ( (lv_note_0_0= ruleSolfege ) ) otherlv_1= '(' ( (lv_mods_2_0= ruleModification ) )+ otherlv_3= ')'
            {
            // InternalSimpMusic.g:305:3: ( (lv_note_0_0= ruleSolfege ) )
            // InternalSimpMusic.g:306:4: (lv_note_0_0= ruleSolfege )
            {
            // InternalSimpMusic.g:306:4: (lv_note_0_0= ruleSolfege )
            // InternalSimpMusic.g:307:5: lv_note_0_0= ruleSolfege
            {

            					newCompositeNode(grammarAccess.getSolfegeWithModificationAccess().getNoteSolfegeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_note_0_0=ruleSolfege();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSolfegeWithModificationRule());
            					}
            					set(
            						current,
            						"note",
            						lv_note_0_0,
            						"uk.ac.kcl.inf.SimpMusic.Solfege");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getSolfegeWithModificationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSimpMusic.g:328:3: ( (lv_mods_2_0= ruleModification ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14||(LA4_0>=24 && LA4_0<=28)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSimpMusic.g:329:4: (lv_mods_2_0= ruleModification )
            	    {
            	    // InternalSimpMusic.g:329:4: (lv_mods_2_0= ruleModification )
            	    // InternalSimpMusic.g:330:5: lv_mods_2_0= ruleModification
            	    {

            	    					newCompositeNode(grammarAccess.getSolfegeWithModificationAccess().getModsModificationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_mods_2_0=ruleModification();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSolfegeWithModificationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"mods",
            	    						lv_mods_2_0,
            	    						"uk.ac.kcl.inf.SimpMusic.Modification");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSolfegeWithModificationAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSolfegeWithModification"


    // $ANTLR start "entryRuleModification"
    // InternalSimpMusic.g:355:1: entryRuleModification returns [EObject current=null] : iv_ruleModification= ruleModification EOF ;
    public final EObject entryRuleModification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModification = null;


        try {
            // InternalSimpMusic.g:355:53: (iv_ruleModification= ruleModification EOF )
            // InternalSimpMusic.g:356:2: iv_ruleModification= ruleModification EOF
            {
             newCompositeNode(grammarAccess.getModificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModification=ruleModification();

            state._fsp--;

             current =iv_ruleModification; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModification"


    // $ANTLR start "ruleModification"
    // InternalSimpMusic.g:362:1: ruleModification returns [EObject current=null] : (this_Amplitude_0= ruleAmplitude | this_Timbre_1= ruleTimbre | this_Tone_2= ruleTone ) ;
    public final EObject ruleModification() throws RecognitionException {
        EObject current = null;

        EObject this_Amplitude_0 = null;

        EObject this_Timbre_1 = null;

        EObject this_Tone_2 = null;



        	enterRule();

        try {
            // InternalSimpMusic.g:368:2: ( (this_Amplitude_0= ruleAmplitude | this_Timbre_1= ruleTimbre | this_Tone_2= ruleTone ) )
            // InternalSimpMusic.g:369:2: (this_Amplitude_0= ruleAmplitude | this_Timbre_1= ruleTimbre | this_Tone_2= ruleTone )
            {
            // InternalSimpMusic.g:369:2: (this_Amplitude_0= ruleAmplitude | this_Timbre_1= ruleTimbre | this_Tone_2= ruleTone )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 24:
            case 25:
                {
                alt5=1;
                }
                break;
            case 26:
            case 27:
                {
                alt5=2;
                }
                break;
            case 14:
            case 28:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalSimpMusic.g:370:3: this_Amplitude_0= ruleAmplitude
                    {

                    			newCompositeNode(grammarAccess.getModificationAccess().getAmplitudeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Amplitude_0=ruleAmplitude();

                    state._fsp--;


                    			current = this_Amplitude_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSimpMusic.g:379:3: this_Timbre_1= ruleTimbre
                    {

                    			newCompositeNode(grammarAccess.getModificationAccess().getTimbreParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Timbre_1=ruleTimbre();

                    state._fsp--;


                    			current = this_Timbre_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSimpMusic.g:388:3: this_Tone_2= ruleTone
                    {

                    			newCompositeNode(grammarAccess.getModificationAccess().getToneParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Tone_2=ruleTone();

                    state._fsp--;


                    			current = this_Tone_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModification"


    // $ANTLR start "entryRuleAmplitude"
    // InternalSimpMusic.g:400:1: entryRuleAmplitude returns [EObject current=null] : iv_ruleAmplitude= ruleAmplitude EOF ;
    public final EObject entryRuleAmplitude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAmplitude = null;


        try {
            // InternalSimpMusic.g:400:50: (iv_ruleAmplitude= ruleAmplitude EOF )
            // InternalSimpMusic.g:401:2: iv_ruleAmplitude= ruleAmplitude EOF
            {
             newCompositeNode(grammarAccess.getAmplitudeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAmplitude=ruleAmplitude();

            state._fsp--;

             current =iv_ruleAmplitude; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAmplitude"


    // $ANTLR start "ruleAmplitude"
    // InternalSimpMusic.g:407:1: ruleAmplitude returns [EObject current=null] : ( (lv_amp_0_0= ruleAmpType ) ) ;
    public final EObject ruleAmplitude() throws RecognitionException {
        EObject current = null;

        Enumerator lv_amp_0_0 = null;



        	enterRule();

        try {
            // InternalSimpMusic.g:413:2: ( ( (lv_amp_0_0= ruleAmpType ) ) )
            // InternalSimpMusic.g:414:2: ( (lv_amp_0_0= ruleAmpType ) )
            {
            // InternalSimpMusic.g:414:2: ( (lv_amp_0_0= ruleAmpType ) )
            // InternalSimpMusic.g:415:3: (lv_amp_0_0= ruleAmpType )
            {
            // InternalSimpMusic.g:415:3: (lv_amp_0_0= ruleAmpType )
            // InternalSimpMusic.g:416:4: lv_amp_0_0= ruleAmpType
            {

            				newCompositeNode(grammarAccess.getAmplitudeAccess().getAmpAmpTypeEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_amp_0_0=ruleAmpType();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getAmplitudeRule());
            				}
            				set(
            					current,
            					"amp",
            					lv_amp_0_0,
            					"uk.ac.kcl.inf.SimpMusic.AmpType");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAmplitude"


    // $ANTLR start "entryRuleTimbre"
    // InternalSimpMusic.g:436:1: entryRuleTimbre returns [EObject current=null] : iv_ruleTimbre= ruleTimbre EOF ;
    public final EObject entryRuleTimbre() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimbre = null;


        try {
            // InternalSimpMusic.g:436:47: (iv_ruleTimbre= ruleTimbre EOF )
            // InternalSimpMusic.g:437:2: iv_ruleTimbre= ruleTimbre EOF
            {
             newCompositeNode(grammarAccess.getTimbreRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimbre=ruleTimbre();

            state._fsp--;

             current =iv_ruleTimbre; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimbre"


    // $ANTLR start "ruleTimbre"
    // InternalSimpMusic.g:443:1: ruleTimbre returns [EObject current=null] : ( (lv_timbre_0_0= ruleTimbreType ) ) ;
    public final EObject ruleTimbre() throws RecognitionException {
        EObject current = null;

        Enumerator lv_timbre_0_0 = null;



        	enterRule();

        try {
            // InternalSimpMusic.g:449:2: ( ( (lv_timbre_0_0= ruleTimbreType ) ) )
            // InternalSimpMusic.g:450:2: ( (lv_timbre_0_0= ruleTimbreType ) )
            {
            // InternalSimpMusic.g:450:2: ( (lv_timbre_0_0= ruleTimbreType ) )
            // InternalSimpMusic.g:451:3: (lv_timbre_0_0= ruleTimbreType )
            {
            // InternalSimpMusic.g:451:3: (lv_timbre_0_0= ruleTimbreType )
            // InternalSimpMusic.g:452:4: lv_timbre_0_0= ruleTimbreType
            {

            				newCompositeNode(grammarAccess.getTimbreAccess().getTimbreTimbreTypeEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_timbre_0_0=ruleTimbreType();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getTimbreRule());
            				}
            				set(
            					current,
            					"timbre",
            					lv_timbre_0_0,
            					"uk.ac.kcl.inf.SimpMusic.TimbreType");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimbre"


    // $ANTLR start "entryRuleTone"
    // InternalSimpMusic.g:472:1: entryRuleTone returns [EObject current=null] : iv_ruleTone= ruleTone EOF ;
    public final EObject entryRuleTone() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTone = null;


        try {
            // InternalSimpMusic.g:472:45: (iv_ruleTone= ruleTone EOF )
            // InternalSimpMusic.g:473:2: iv_ruleTone= ruleTone EOF
            {
             newCompositeNode(grammarAccess.getToneRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTone=ruleTone();

            state._fsp--;

             current =iv_ruleTone; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTone"


    // $ANTLR start "ruleTone"
    // InternalSimpMusic.g:479:1: ruleTone returns [EObject current=null] : ( ( (lv_tone_0_0= ruleToneType ) ) ( (lv_val_1_0= RULE_INT ) ) ) ;
    public final EObject ruleTone() throws RecognitionException {
        EObject current = null;

        Token lv_val_1_0=null;
        Enumerator lv_tone_0_0 = null;



        	enterRule();

        try {
            // InternalSimpMusic.g:485:2: ( ( ( (lv_tone_0_0= ruleToneType ) ) ( (lv_val_1_0= RULE_INT ) ) ) )
            // InternalSimpMusic.g:486:2: ( ( (lv_tone_0_0= ruleToneType ) ) ( (lv_val_1_0= RULE_INT ) ) )
            {
            // InternalSimpMusic.g:486:2: ( ( (lv_tone_0_0= ruleToneType ) ) ( (lv_val_1_0= RULE_INT ) ) )
            // InternalSimpMusic.g:487:3: ( (lv_tone_0_0= ruleToneType ) ) ( (lv_val_1_0= RULE_INT ) )
            {
            // InternalSimpMusic.g:487:3: ( (lv_tone_0_0= ruleToneType ) )
            // InternalSimpMusic.g:488:4: (lv_tone_0_0= ruleToneType )
            {
            // InternalSimpMusic.g:488:4: (lv_tone_0_0= ruleToneType )
            // InternalSimpMusic.g:489:5: lv_tone_0_0= ruleToneType
            {

            					newCompositeNode(grammarAccess.getToneAccess().getToneToneTypeEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_tone_0_0=ruleToneType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getToneRule());
            					}
            					set(
            						current,
            						"tone",
            						lv_tone_0_0,
            						"uk.ac.kcl.inf.SimpMusic.ToneType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSimpMusic.g:506:3: ( (lv_val_1_0= RULE_INT ) )
            // InternalSimpMusic.g:507:4: (lv_val_1_0= RULE_INT )
            {
            // InternalSimpMusic.g:507:4: (lv_val_1_0= RULE_INT )
            // InternalSimpMusic.g:508:5: lv_val_1_0= RULE_INT
            {
            lv_val_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_val_1_0, grammarAccess.getToneAccess().getValINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getToneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"val",
            						lv_val_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTone"


    // $ANTLR start "ruleSolfa"
    // InternalSimpMusic.g:528:1: ruleSolfa returns [Enumerator current=null] : ( (enumLiteral_0= 'Do' ) | (enumLiteral_1= 'Re' ) | (enumLiteral_2= 'Mi' ) | (enumLiteral_3= 'Fa' ) | (enumLiteral_4= 'Sol' ) | (enumLiteral_5= 'La' ) | (enumLiteral_6= 'Si' ) ) ;
    public final Enumerator ruleSolfa() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalSimpMusic.g:534:2: ( ( (enumLiteral_0= 'Do' ) | (enumLiteral_1= 'Re' ) | (enumLiteral_2= 'Mi' ) | (enumLiteral_3= 'Fa' ) | (enumLiteral_4= 'Sol' ) | (enumLiteral_5= 'La' ) | (enumLiteral_6= 'Si' ) ) )
            // InternalSimpMusic.g:535:2: ( (enumLiteral_0= 'Do' ) | (enumLiteral_1= 'Re' ) | (enumLiteral_2= 'Mi' ) | (enumLiteral_3= 'Fa' ) | (enumLiteral_4= 'Sol' ) | (enumLiteral_5= 'La' ) | (enumLiteral_6= 'Si' ) )
            {
            // InternalSimpMusic.g:535:2: ( (enumLiteral_0= 'Do' ) | (enumLiteral_1= 'Re' ) | (enumLiteral_2= 'Mi' ) | (enumLiteral_3= 'Fa' ) | (enumLiteral_4= 'Sol' ) | (enumLiteral_5= 'La' ) | (enumLiteral_6= 'Si' ) )
            int alt6=7;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt6=1;
                }
                break;
            case 18:
                {
                alt6=2;
                }
                break;
            case 19:
                {
                alt6=3;
                }
                break;
            case 20:
                {
                alt6=4;
                }
                break;
            case 21:
                {
                alt6=5;
                }
                break;
            case 22:
                {
                alt6=6;
                }
                break;
            case 23:
                {
                alt6=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalSimpMusic.g:536:3: (enumLiteral_0= 'Do' )
                    {
                    // InternalSimpMusic.g:536:3: (enumLiteral_0= 'Do' )
                    // InternalSimpMusic.g:537:4: enumLiteral_0= 'Do'
                    {
                    enumLiteral_0=(Token)match(input,17,FOLLOW_2); 

                    				current = grammarAccess.getSolfaAccess().getDoEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSolfaAccess().getDoEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSimpMusic.g:544:3: (enumLiteral_1= 'Re' )
                    {
                    // InternalSimpMusic.g:544:3: (enumLiteral_1= 'Re' )
                    // InternalSimpMusic.g:545:4: enumLiteral_1= 'Re'
                    {
                    enumLiteral_1=(Token)match(input,18,FOLLOW_2); 

                    				current = grammarAccess.getSolfaAccess().getReEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSolfaAccess().getReEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSimpMusic.g:552:3: (enumLiteral_2= 'Mi' )
                    {
                    // InternalSimpMusic.g:552:3: (enumLiteral_2= 'Mi' )
                    // InternalSimpMusic.g:553:4: enumLiteral_2= 'Mi'
                    {
                    enumLiteral_2=(Token)match(input,19,FOLLOW_2); 

                    				current = grammarAccess.getSolfaAccess().getMiEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSolfaAccess().getMiEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSimpMusic.g:560:3: (enumLiteral_3= 'Fa' )
                    {
                    // InternalSimpMusic.g:560:3: (enumLiteral_3= 'Fa' )
                    // InternalSimpMusic.g:561:4: enumLiteral_3= 'Fa'
                    {
                    enumLiteral_3=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getSolfaAccess().getFaEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getSolfaAccess().getFaEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSimpMusic.g:568:3: (enumLiteral_4= 'Sol' )
                    {
                    // InternalSimpMusic.g:568:3: (enumLiteral_4= 'Sol' )
                    // InternalSimpMusic.g:569:4: enumLiteral_4= 'Sol'
                    {
                    enumLiteral_4=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getSolfaAccess().getSolEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getSolfaAccess().getSolEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSimpMusic.g:576:3: (enumLiteral_5= 'La' )
                    {
                    // InternalSimpMusic.g:576:3: (enumLiteral_5= 'La' )
                    // InternalSimpMusic.g:577:4: enumLiteral_5= 'La'
                    {
                    enumLiteral_5=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getSolfaAccess().getLaEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getSolfaAccess().getLaEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSimpMusic.g:584:3: (enumLiteral_6= 'Si' )
                    {
                    // InternalSimpMusic.g:584:3: (enumLiteral_6= 'Si' )
                    // InternalSimpMusic.g:585:4: enumLiteral_6= 'Si'
                    {
                    enumLiteral_6=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getSolfaAccess().getSiEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getSolfaAccess().getSiEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSolfa"


    // $ANTLR start "ruleAmpType"
    // InternalSimpMusic.g:595:1: ruleAmpType returns [Enumerator current=null] : ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) ) ;
    public final Enumerator ruleAmpType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSimpMusic.g:601:2: ( ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) ) )
            // InternalSimpMusic.g:602:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) )
            {
            // InternalSimpMusic.g:602:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            else if ( (LA7_0==25) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalSimpMusic.g:603:3: (enumLiteral_0= '>' )
                    {
                    // InternalSimpMusic.g:603:3: (enumLiteral_0= '>' )
                    // InternalSimpMusic.g:604:4: enumLiteral_0= '>'
                    {
                    enumLiteral_0=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getAmpTypeAccess().getWeakEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAmpTypeAccess().getWeakEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSimpMusic.g:611:3: (enumLiteral_1= '<' )
                    {
                    // InternalSimpMusic.g:611:3: (enumLiteral_1= '<' )
                    // InternalSimpMusic.g:612:4: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getAmpTypeAccess().getStrongEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAmpTypeAccess().getStrongEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAmpType"


    // $ANTLR start "ruleTimbreType"
    // InternalSimpMusic.g:622:1: ruleTimbreType returns [Enumerator current=null] : ( (enumLiteral_0= 'sharp' ) | (enumLiteral_1= 'flat' ) ) ;
    public final Enumerator ruleTimbreType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSimpMusic.g:628:2: ( ( (enumLiteral_0= 'sharp' ) | (enumLiteral_1= 'flat' ) ) )
            // InternalSimpMusic.g:629:2: ( (enumLiteral_0= 'sharp' ) | (enumLiteral_1= 'flat' ) )
            {
            // InternalSimpMusic.g:629:2: ( (enumLiteral_0= 'sharp' ) | (enumLiteral_1= 'flat' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            else if ( (LA8_0==27) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalSimpMusic.g:630:3: (enumLiteral_0= 'sharp' )
                    {
                    // InternalSimpMusic.g:630:3: (enumLiteral_0= 'sharp' )
                    // InternalSimpMusic.g:631:4: enumLiteral_0= 'sharp'
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getTimbreTypeAccess().getSharpEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTimbreTypeAccess().getSharpEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSimpMusic.g:638:3: (enumLiteral_1= 'flat' )
                    {
                    // InternalSimpMusic.g:638:3: (enumLiteral_1= 'flat' )
                    // InternalSimpMusic.g:639:4: enumLiteral_1= 'flat'
                    {
                    enumLiteral_1=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getTimbreTypeAccess().getFlatEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTimbreTypeAccess().getFlatEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimbreType"


    // $ANTLR start "ruleToneType"
    // InternalSimpMusic.g:649:1: ruleToneType returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleToneType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSimpMusic.g:655:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalSimpMusic.g:656:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalSimpMusic.g:656:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                alt9=1;
            }
            else if ( (LA9_0==14) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalSimpMusic.g:657:3: (enumLiteral_0= '+' )
                    {
                    // InternalSimpMusic.g:657:3: (enumLiteral_0= '+' )
                    // InternalSimpMusic.g:658:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getToneTypeAccess().getHighEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getToneTypeAccess().getHighEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSimpMusic.g:665:3: (enumLiteral_1= '-' )
                    {
                    // InternalSimpMusic.g:665:3: (enumLiteral_1= '-' )
                    // InternalSimpMusic.g:666:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,14,FOLLOW_2); 

                    				current = grammarAccess.getToneTypeAccess().getSubEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getToneTypeAccess().getSubEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleToneType"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\uffff\7\13\4\uffff";
    static final String dfa_3s = "\10\4\4\uffff";
    static final String dfa_4s = "\10\27\4\uffff";
    static final String dfa_5s = "\10\uffff\1\2\1\4\1\3\1\1";
    static final String dfa_6s = "\14\uffff}>";
    static final String[] dfa_7s = {
            "\1\11\11\uffff\1\10\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7",
            "\1\13\10\uffff\2\13\1\12\1\uffff\7\13",
            "\1\13\10\uffff\2\13\1\12\1\uffff\7\13",
            "\1\13\10\uffff\2\13\1\12\1\uffff\7\13",
            "\1\13\10\uffff\2\13\1\12\1\uffff\7\13",
            "\1\13\10\uffff\2\13\1\12\1\uffff\7\13",
            "\1\13\10\uffff\2\13\1\12\1\uffff\7\13",
            "\1\13\10\uffff\2\13\1\12\1\uffff\7\13",
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
            return "115:2: (this_Solfege_0= ruleSolfege | this_Sleep_1= ruleSleep | this_SolfegeWithModification_2= ruleSolfegeWithModification | this_LoopNote_3= ruleLoopNote )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000FE4012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000FE6010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000001F004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000001F014000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});

}