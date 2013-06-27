package dk.sdu.mmmi.tjep.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.sdu.mmmi.tjep.services.TJGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalTJParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "';'", "'scenario'", "'{'", "'}'", "'assert'", "'$'", "'?'", "'primitive'", "'class'", "'@'", "'extends'", "'final'", "'('", "','", "')'", "'='", "'.'", "'this'", "'if'", "'else'", "'while'", "'return'", "':'", "'lift'", "'new'", "'<'", "'>'", "'=='", "'$<'", "'?<'", "'$>'", "'?>'", "'$=='", "'?=='", "'+'", "'-'", "'$+'", "'?+'", "'$-'", "'?-'", "'*'", "'/'", "'$*'", "'?*'", "'$/'", "'?/'", "'dynamic'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalTJParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTJParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTJParser.tokenNames; }
    public String getGrammarFileName() { return "../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g"; }



     	private TJGrammarAccess grammarAccess;
     	
        public InternalTJParser(TokenStream input, TJGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Program";	
       	}
       	
       	@Override
       	protected TJGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleProgram"
    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:67:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:68:2: (iv_ruleProgram= ruleProgram EOF )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:69:2: iv_ruleProgram= ruleProgram EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProgramRule()); 
            }
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram75);
            iv_ruleProgram=ruleProgram();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProgram; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:76:1: ruleProgram returns [EObject current=null] : (otherlv_0= 'package' ( (lv_pkgname_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_scenarios_3_0= ruleScenario ) )* ( (lv_types_4_0= ruleType ) )* ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_pkgname_1_0=null;
        Token otherlv_2=null;
        EObject lv_scenarios_3_0 = null;

        EObject lv_types_4_0 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:79:28: ( (otherlv_0= 'package' ( (lv_pkgname_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_scenarios_3_0= ruleScenario ) )* ( (lv_types_4_0= ruleType ) )* ) )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:80:1: (otherlv_0= 'package' ( (lv_pkgname_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_scenarios_3_0= ruleScenario ) )* ( (lv_types_4_0= ruleType ) )* )
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:80:1: (otherlv_0= 'package' ( (lv_pkgname_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_scenarios_3_0= ruleScenario ) )* ( (lv_types_4_0= ruleType ) )* )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:80:3: otherlv_0= 'package' ( (lv_pkgname_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_scenarios_3_0= ruleScenario ) )* ( (lv_types_4_0= ruleType ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleProgram122); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getProgramAccess().getPackageKeyword_0());
                  
            }
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:84:1: ( (lv_pkgname_1_0= RULE_ID ) )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:85:1: (lv_pkgname_1_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:85:1: (lv_pkgname_1_0= RULE_ID )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:86:3: lv_pkgname_1_0= RULE_ID
            {
            lv_pkgname_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProgram139); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_pkgname_1_0, grammarAccess.getProgramAccess().getPkgnameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getProgramRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"pkgname",
                      		lv_pkgname_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleProgram156); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getProgramAccess().getSemicolonKeyword_2());
                  
            }
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:106:1: ( (lv_scenarios_3_0= ruleScenario ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:107:1: (lv_scenarios_3_0= ruleScenario )
            	    {
            	    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:107:1: (lv_scenarios_3_0= ruleScenario )
            	    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:108:3: lv_scenarios_3_0= ruleScenario
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getProgramAccess().getScenariosScenarioParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleScenario_in_ruleProgram177);
            	    lv_scenarios_3_0=ruleScenario();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"scenarios",
            	              		lv_scenarios_3_0, 
            	              		"Scenario");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:124:3: ( (lv_types_4_0= ruleType ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=19 && LA2_0<=20)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:125:1: (lv_types_4_0= ruleType )
            	    {
            	    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:125:1: (lv_types_4_0= ruleType )
            	    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:126:3: lv_types_4_0= ruleType
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getProgramAccess().getTypesTypeParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleType_in_ruleProgram199);
            	    lv_types_4_0=ruleType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"types",
            	              		lv_types_4_0, 
            	              		"Type");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleScenario"
    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:150:1: entryRuleScenario returns [EObject current=null] : iv_ruleScenario= ruleScenario EOF ;
    public final EObject entryRuleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario = null;


        try {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:151:2: (iv_ruleScenario= ruleScenario EOF )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:152:2: iv_ruleScenario= ruleScenario EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScenarioRule()); 
            }
            pushFollow(FOLLOW_ruleScenario_in_entryRuleScenario236);
            iv_ruleScenario=ruleScenario();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScenario; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleScenario246); if (state.failed) return current;

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
    // $ANTLR end "entryRuleScenario"


    // $ANTLR start "ruleScenario"
    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:159:1: ruleScenario returns [EObject current=null] : (otherlv_0= 'scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_target_3_0= ruleStatement ) )* otherlv_4= '}' (otherlv_5= 'assert' otherlv_6= '{' ( (lv_assertion_7_0= ruleStatement ) )* otherlv_8= '}' )? ) ;
    public final EObject ruleScenario() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_target_3_0 = null;

        EObject lv_assertion_7_0 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:162:28: ( (otherlv_0= 'scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_target_3_0= ruleStatement ) )* otherlv_4= '}' (otherlv_5= 'assert' otherlv_6= '{' ( (lv_assertion_7_0= ruleStatement ) )* otherlv_8= '}' )? ) )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:163:1: (otherlv_0= 'scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_target_3_0= ruleStatement ) )* otherlv_4= '}' (otherlv_5= 'assert' otherlv_6= '{' ( (lv_assertion_7_0= ruleStatement ) )* otherlv_8= '}' )? )
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:163:1: (otherlv_0= 'scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_target_3_0= ruleStatement ) )* otherlv_4= '}' (otherlv_5= 'assert' otherlv_6= '{' ( (lv_assertion_7_0= ruleStatement ) )* otherlv_8= '}' )? )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:163:3: otherlv_0= 'scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_target_3_0= ruleStatement ) )* otherlv_4= '}' (otherlv_5= 'assert' otherlv_6= '{' ( (lv_assertion_7_0= ruleStatement ) )* otherlv_8= '}' )?
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleScenario283); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getScenarioAccess().getScenarioKeyword_0());
                  
            }
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:167:1: ( (lv_name_1_0= RULE_ID ) )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:168:1: (lv_name_1_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:168:1: (lv_name_1_0= RULE_ID )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:169:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleScenario300); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getScenarioAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getScenarioRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleScenario317); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getScenarioAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:189:1: ( (lv_target_3_0= ruleStatement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_ID && LA3_0<=RULE_INT)||(LA3_0>=17 && LA3_0<=18)||LA3_0==24||(LA3_0>=29 && LA3_0<=30)||(LA3_0>=32 && LA3_0<=33)||(LA3_0>=35 && LA3_0<=36)||LA3_0==58) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:190:1: (lv_target_3_0= ruleStatement )
            	    {
            	    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:190:1: (lv_target_3_0= ruleStatement )
            	    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:191:3: lv_target_3_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getScenarioAccess().getTargetStatementParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatement_in_ruleScenario338);
            	    lv_target_3_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getScenarioRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"target",
            	              		lv_target_3_0, 
            	              		"Statement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleScenario351); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getScenarioAccess().getRightCurlyBracketKeyword_4());
                  
            }
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:211:1: (otherlv_5= 'assert' otherlv_6= '{' ( (lv_assertion_7_0= ruleStatement ) )* otherlv_8= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:211:3: otherlv_5= 'assert' otherlv_6= '{' ( (lv_assertion_7_0= ruleStatement ) )* otherlv_8= '}'
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleScenario364); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getScenarioAccess().getAssertKeyword_5_0());
                          
                    }
                    otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleScenario376); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getScenarioAccess().getLeftCurlyBracketKeyword_5_1());
                          
                    }
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:219:1: ( (lv_assertion_7_0= ruleStatement ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>=RULE_ID && LA4_0<=RULE_INT)||(LA4_0>=17 && LA4_0<=18)||LA4_0==24||(LA4_0>=29 && LA4_0<=30)||(LA4_0>=32 && LA4_0<=33)||(LA4_0>=35 && LA4_0<=36)||LA4_0==58) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:220:1: (lv_assertion_7_0= ruleStatement )
                    	    {
                    	    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:220:1: (lv_assertion_7_0= ruleStatement )
                    	    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:221:3: lv_assertion_7_0= ruleStatement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getScenarioAccess().getAssertionStatementParserRuleCall_5_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleStatement_in_ruleScenario397);
                    	    lv_assertion_7_0=ruleStatement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getScenarioRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"assertion",
                    	              		lv_assertion_7_0, 
                    	              		"Statement");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleScenario410); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getScenarioAccess().getRightCurlyBracketKeyword_5_3());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleScenario"


    // $ANTLR start "entryRuleBT"
    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:249:1: entryRuleBT returns [EObject current=null] : iv_ruleBT= ruleBT EOF ;
    public final EObject entryRuleBT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBT = null;


        try {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:250:2: (iv_ruleBT= ruleBT EOF )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:251:2: iv_ruleBT= ruleBT EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBTRule()); 
            }
            pushFollow(FOLLOW_ruleBT_in_entryRuleBT448);
            iv_ruleBT=ruleBT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBT; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBT458); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBT"


    // $ANTLR start "ruleBT"
    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:258:1: ruleBT returns [EObject current=null] : ( ( () otherlv_1= '$' ) | ( () otherlv_3= '?' ) ) ;
    public final EObject ruleBT() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:261:28: ( ( ( () otherlv_1= '$' ) | ( () otherlv_3= '?' ) ) )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:262:1: ( ( () otherlv_1= '$' ) | ( () otherlv_3= '?' ) )
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:262:1: ( ( () otherlv_1= '$' ) | ( () otherlv_3= '?' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            else if ( (LA6_0==18) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:262:2: ( () otherlv_1= '$' )
                    {
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:262:2: ( () otherlv_1= '$' )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:262:3: () otherlv_1= '$'
                    {
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:262:3: ()
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:263:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getBTAccess().getStaticAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleBT505); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getBTAccess().getDollarSignKeyword_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:273:6: ( () otherlv_3= '?' )
                    {
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:273:6: ( () otherlv_3= '?' )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:273:7: () otherlv_3= '?'
                    {
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:273:7: ()
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:274:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getBTAccess().getDynamicAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleBT534); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getBTAccess().getQuestionMarkKeyword_1_1());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBT"


    // $ANTLR start "entryRuleType"
    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:291:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:292:2: (iv_ruleType= ruleType EOF )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:293:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType571);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType581); if (state.failed) return current;

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:300:1: ruleType returns [EObject current=null] : (this_Primitive_0= rulePrimitive | this_Clazz_1= ruleClazz ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_Primitive_0 = null;

        EObject this_Clazz_1 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:303:28: ( (this_Primitive_0= rulePrimitive | this_Clazz_1= ruleClazz ) )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:304:1: (this_Primitive_0= rulePrimitive | this_Clazz_1= ruleClazz )
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:304:1: (this_Primitive_0= rulePrimitive | this_Clazz_1= ruleClazz )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            else if ( (LA7_0==20) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:305:5: this_Primitive_0= rulePrimitive
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeAccess().getPrimitiveParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimitive_in_ruleType628);
                    this_Primitive_0=rulePrimitive();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Primitive_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:315:5: this_Clazz_1= ruleClazz
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeAccess().getClazzParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleClazz_in_ruleType655);
                    this_Clazz_1=ruleClazz();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Clazz_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRulePrimitive"
    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:331:1: entryRulePrimitive returns [EObject current=null] : iv_rulePrimitive= rulePrimitive EOF ;
    public final EObject entryRulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitive = null;


        try {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:332:2: (iv_rulePrimitive= rulePrimitive EOF )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:333:2: iv_rulePrimitive= rulePrimitive EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveRule()); 
            }
            pushFollow(FOLLOW_rulePrimitive_in_entryRulePrimitive690);
            iv_rulePrimitive=rulePrimitive();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitive; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitive700); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimitive"


    // $ANTLR start "rulePrimitive"
    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:340:1: rulePrimitive returns [EObject current=null] : (otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject rulePrimitive() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:343:28: ( (otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:344:1: (otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:344:1: (otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:344:3: otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_rulePrimitive737); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPrimitiveAccess().getPrimitiveKeyword_0());
                  
            }
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:348:1: ( (lv_name_1_0= RULE_ID ) )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:349:1: (lv_name_1_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:349:1: (lv_name_1_0= RULE_ID )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:350:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimitive754); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getPrimitiveAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPrimitiveRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_rulePrimitive771); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPrimitiveAccess().getSemicolonKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePrimitive"


    // $ANTLR start "entryRuleClazz"
    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:378:1: entryRuleClazz returns [EObject current=null] : iv_ruleClazz= ruleClazz EOF ;
    public final EObject entryRuleClazz() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClazz = null;


        try {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:379:2: (iv_ruleClazz= ruleClazz EOF )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:380:2: iv_ruleClazz= ruleClazz EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClazzRule()); 
            }
            pushFollow(FOLLOW_ruleClazz_in_entryRuleClazz807);
            iv_ruleClazz=ruleClazz();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClazz; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClazz817); if (state.failed) return current;

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
    // $ANTLR end "entryRuleClazz"


    // $ANTLR start "ruleClazz"
    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:387:1: ruleClazz returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '@' ( (lv_variant_3_0= RULE_INT ) ) )? otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' ( (lv_members_7_0= ruleMember ) )* otherlv_8= '}' ) ;
    public final EObject ruleClazz() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_variant_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_members_7_0 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:390:28: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '@' ( (lv_variant_3_0= RULE_INT ) ) )? otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' ( (lv_members_7_0= ruleMember ) )* otherlv_8= '}' ) )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:391:1: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '@' ( (lv_variant_3_0= RULE_INT ) ) )? otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' ( (lv_members_7_0= ruleMember ) )* otherlv_8= '}' )
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:391:1: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '@' ( (lv_variant_3_0= RULE_INT ) ) )? otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' ( (lv_members_7_0= ruleMember ) )* otherlv_8= '}' )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:391:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '@' ( (lv_variant_3_0= RULE_INT ) ) )? otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' ( (lv_members_7_0= ruleMember ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleClazz854); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getClazzAccess().getClassKeyword_0());
                  
            }
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:395:1: ( (lv_name_1_0= RULE_ID ) )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:396:1: (lv_name_1_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:396:1: (lv_name_1_0= RULE_ID )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:397:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClazz871); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getClazzAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getClazzRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:413:2: (otherlv_2= '@' ( (lv_variant_3_0= RULE_INT ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:413:4: otherlv_2= '@' ( (lv_variant_3_0= RULE_INT ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleClazz889); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getClazzAccess().getCommercialAtKeyword_2_0());
                          
                    }
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:417:1: ( (lv_variant_3_0= RULE_INT ) )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:418:1: (lv_variant_3_0= RULE_INT )
                    {
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:418:1: (lv_variant_3_0= RULE_INT )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:419:3: lv_variant_3_0= RULE_INT
                    {
                    lv_variant_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleClazz906); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_variant_3_0, grammarAccess.getClazzAccess().getVariantINTTerminalRuleCall_2_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getClazzRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"variant",
                              		lv_variant_3_0, 
                              		"INT");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleClazz925); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getClazzAccess().getExtendsKeyword_3());
                  
            }
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:439:1: ( (otherlv_5= RULE_ID ) )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:440:1: (otherlv_5= RULE_ID )
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:440:1: (otherlv_5= RULE_ID )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:441:3: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getClazzRule());
              	        }
                      
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClazz945); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_5, grammarAccess.getClazzAccess().getBaseClazzCrossReference_4_0()); 
              	
            }

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleClazz957); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getClazzAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:456:1: ( (lv_members_7_0= ruleMember ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||(LA9_0>=17 && LA9_0<=18)||LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:457:1: (lv_members_7_0= ruleMember )
            	    {
            	    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:457:1: (lv_members_7_0= ruleMember )
            	    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:458:3: lv_members_7_0= ruleMember
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClazzAccess().getMembersMemberParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMember_in_ruleClazz978);
            	    lv_members_7_0=ruleMember();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getClazzRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"members",
            	              		lv_members_7_0, 
            	              		"Member");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleClazz991); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getClazzAccess().getRightCurlyBracketKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleClazz"


    // $ANTLR start "entryRuleMember"
    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:486:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:487:2: (iv_ruleMember= ruleMember EOF )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:488:2: iv_ruleMember= ruleMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMemberRule()); 
            }
            pushFollow(FOLLOW_ruleMember_in_entryRuleMember1027);
            iv_ruleMember=ruleMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMember; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMember1037); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:495:1: ruleMember returns [EObject current=null] : (this_Field_0= ruleField | this_Method_1= ruleMethod | this_Constructor_2= ruleConstructor ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        EObject this_Field_0 = null;

        EObject this_Method_1 = null;

        EObject this_Constructor_2 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:498:28: ( (this_Field_0= ruleField | this_Method_1= ruleMethod | this_Constructor_2= ruleConstructor ) )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:499:1: (this_Field_0= ruleField | this_Method_1= ruleMethod | this_Constructor_2= ruleConstructor )
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:499:1: (this_Field_0= ruleField | this_Method_1= ruleMethod | this_Constructor_2= ruleConstructor )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==23) ) {
                    alt10=1;
                }
                else if ( (LA10_1==RULE_ID) ) {
                    int LA10_4 = input.LA(3);

                    if ( (LA10_4==24) ) {
                        alt10=3;
                    }
                    else if ( (LA10_4==RULE_ID) ) {
                        int LA10_6 = input.LA(4);

                        if ( (LA10_6==12) ) {
                            alt10=1;
                        }
                        else if ( (LA10_6==21||LA10_6==24) ) {
                            alt10=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 10, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 4, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
                }
                break;
            case 18:
                {
                int LA10_2 = input.LA(2);

                if ( (LA10_2==RULE_ID) ) {
                    int LA10_4 = input.LA(3);

                    if ( (LA10_4==24) ) {
                        alt10=3;
                    }
                    else if ( (LA10_4==RULE_ID) ) {
                        int LA10_6 = input.LA(4);

                        if ( (LA10_6==12) ) {
                            alt10=1;
                        }
                        else if ( (LA10_6==21||LA10_6==24) ) {
                            alt10=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 10, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 4, input);

                        throw nvae;
                    }
                }
                else if ( (LA10_2==23) ) {
                    alt10=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;
                }
                }
                break;
            case 23:
                {
                alt10=1;
                }
                break;
            case RULE_ID:
                {
                int LA10_4 = input.LA(2);

                if ( (LA10_4==24) ) {
                    alt10=3;
                }
                else if ( (LA10_4==RULE_ID) ) {
                    int LA10_6 = input.LA(3);

                    if ( (LA10_6==12) ) {
                        alt10=1;
                    }
                    else if ( (LA10_6==21||LA10_6==24) ) {
                        alt10=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 6, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:500:5: this_Field_0= ruleField
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMemberAccess().getFieldParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleField_in_ruleMember1084);
                    this_Field_0=ruleField();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Field_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:510:5: this_Method_1= ruleMethod
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMemberAccess().getMethodParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMethod_in_ruleMember1111);
                    this_Method_1=ruleMethod();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Method_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:520:5: this_Constructor_2= ruleConstructor
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMemberAccess().getConstructorParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConstructor_in_ruleMember1138);
                    this_Constructor_2=ruleConstructor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Constructor_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleField"
    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:536:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:537:2: (iv_ruleField= ruleField EOF )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:538:2: iv_ruleField= ruleField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldRule()); 
            }
            pushFollow(FOLLOW_ruleField_in_entryRuleField1173);
            iv_ruleField=ruleField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleField; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleField1183); if (state.failed) return current;

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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:545:1: ruleField returns [EObject current=null] : ( ( (lv_bt_0_0= ruleBT ) )? ( (lv_final_1_0= 'final' ) )? ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token lv_final_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        EObject lv_bt_0_0 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:548:28: ( ( ( (lv_bt_0_0= ruleBT ) )? ( (lv_final_1_0= 'final' ) )? ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:549:1: ( ( (lv_bt_0_0= ruleBT ) )? ( (lv_final_1_0= 'final' ) )? ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' )
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:549:1: ( ( (lv_bt_0_0= ruleBT ) )? ( (lv_final_1_0= 'final' ) )? ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:549:2: ( (lv_bt_0_0= ruleBT ) )? ( (lv_final_1_0= 'final' ) )? ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';'
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:549:2: ( (lv_bt_0_0= ruleBT ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=17 && LA11_0<=18)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:550:1: (lv_bt_0_0= ruleBT )
                    {
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:550:1: (lv_bt_0_0= ruleBT )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:551:3: lv_bt_0_0= ruleBT
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFieldAccess().getBtBTParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBT_in_ruleField1229);
                    lv_bt_0_0=ruleBT();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFieldRule());
                      	        }
                             		set(
                             			current, 
                             			"bt",
                              		lv_bt_0_0, 
                              		"BT");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:567:3: ( (lv_final_1_0= 'final' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:568:1: (lv_final_1_0= 'final' )
                    {
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:568:1: (lv_final_1_0= 'final' )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:569:3: lv_final_1_0= 'final'
                    {
                    lv_final_1_0=(Token)match(input,23,FOLLOW_23_in_ruleField1248); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_final_1_0, grammarAccess.getFieldAccess().getFinalFinalKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFieldRule());
                      	        }
                             		setWithLastConsumed(current, "final", true, "final");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:582:3: ( (otherlv_2= RULE_ID ) )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:583:1: (otherlv_2= RULE_ID )
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:583:1: (otherlv_2= RULE_ID )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:584:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getFieldRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleField1282); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getFieldAccess().getTypeTypeCrossReference_2_0()); 
              	
            }

            }


            }

            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:595:2: ( (lv_name_3_0= RULE_ID ) )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:596:1: (lv_name_3_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:596:1: (lv_name_3_0= RULE_ID )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:597:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleField1299); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFieldRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleField1316); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getFieldAccess().getSemicolonKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleMethod"
    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:625:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:626:2: (iv_ruleMethod= ruleMethod EOF )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:627:2: iv_ruleMethod= ruleMethod EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodRule()); 
            }
            pushFollow(FOLLOW_ruleMethod_in_entryRuleMethod1352);
            iv_ruleMethod=ruleMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethod; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod1362); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:634:1: ruleMethod returns [EObject current=null] : ( ( (lv_bt_0_0= ruleBT ) )? ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '@' ( (lv_variant_4_0= RULE_INT ) ) )? otherlv_5= '(' ( ( (lv_params_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParameter ) ) )* )? otherlv_9= ')' otherlv_10= '{' ( (lv_body_11_0= ruleStatement ) )* otherlv_12= '}' ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_variant_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_bt_0_0 = null;

        EObject lv_params_6_0 = null;

        EObject lv_params_8_0 = null;

        EObject lv_body_11_0 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:637:28: ( ( ( (lv_bt_0_0= ruleBT ) )? ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '@' ( (lv_variant_4_0= RULE_INT ) ) )? otherlv_5= '(' ( ( (lv_params_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParameter ) ) )* )? otherlv_9= ')' otherlv_10= '{' ( (lv_body_11_0= ruleStatement ) )* otherlv_12= '}' ) )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:638:1: ( ( (lv_bt_0_0= ruleBT ) )? ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '@' ( (lv_variant_4_0= RULE_INT ) ) )? otherlv_5= '(' ( ( (lv_params_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParameter ) ) )* )? otherlv_9= ')' otherlv_10= '{' ( (lv_body_11_0= ruleStatement ) )* otherlv_12= '}' )
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:638:1: ( ( (lv_bt_0_0= ruleBT ) )? ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '@' ( (lv_variant_4_0= RULE_INT ) ) )? otherlv_5= '(' ( ( (lv_params_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParameter ) ) )* )? otherlv_9= ')' otherlv_10= '{' ( (lv_body_11_0= ruleStatement ) )* otherlv_12= '}' )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:638:2: ( (lv_bt_0_0= ruleBT ) )? ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '@' ( (lv_variant_4_0= RULE_INT ) ) )? otherlv_5= '(' ( ( (lv_params_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParameter ) ) )* )? otherlv_9= ')' otherlv_10= '{' ( (lv_body_11_0= ruleStatement ) )* otherlv_12= '}'
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:638:2: ( (lv_bt_0_0= ruleBT ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=17 && LA13_0<=18)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:639:1: (lv_bt_0_0= ruleBT )
                    {
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:639:1: (lv_bt_0_0= ruleBT )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:640:3: lv_bt_0_0= ruleBT
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodAccess().getBtBTParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBT_in_ruleMethod1408);
                    lv_bt_0_0=ruleBT();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMethodRule());
                      	        }
                             		set(
                             			current, 
                             			"bt",
                              		lv_bt_0_0, 
                              		"BT");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:656:3: ( (otherlv_1= RULE_ID ) )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:657:1: (otherlv_1= RULE_ID )
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:657:1: (otherlv_1= RULE_ID )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:658:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMethodRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethod1429); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getMethodAccess().getTypeTypeCrossReference_1_0()); 
              	
            }

            }


            }

            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:669:2: ( (lv_name_2_0= RULE_ID ) )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:670:1: (lv_name_2_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:670:1: (lv_name_2_0= RULE_ID )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:671:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethod1446); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMethodRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:687:2: (otherlv_3= '@' ( (lv_variant_4_0= RULE_INT ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:687:4: otherlv_3= '@' ( (lv_variant_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleMethod1464); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getMethodAccess().getCommercialAtKeyword_3_0());
                          
                    }
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:691:1: ( (lv_variant_4_0= RULE_INT ) )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:692:1: (lv_variant_4_0= RULE_INT )
                    {
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:692:1: (lv_variant_4_0= RULE_INT )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:693:3: lv_variant_4_0= RULE_INT
                    {
                    lv_variant_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleMethod1481); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_variant_4_0, grammarAccess.getMethodAccess().getVariantINTTerminalRuleCall_3_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMethodRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"variant",
                              		lv_variant_4_0, 
                              		"INT");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleMethod1500); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:713:1: ( ( (lv_params_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParameter ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID||(LA16_0>=17 && LA16_0<=18)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:713:2: ( (lv_params_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleParameter ) ) )*
                    {
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:713:2: ( (lv_params_6_0= ruleParameter ) )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:714:1: (lv_params_6_0= ruleParameter )
                    {
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:714:1: (lv_params_6_0= ruleParameter )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:715:3: lv_params_6_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodAccess().getParamsParameterParserRuleCall_5_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_in_ruleMethod1522);
                    lv_params_6_0=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMethodRule());
                      	        }
                             		add(
                             			current, 
                             			"params",
                              		lv_params_6_0, 
                              		"Parameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:731:2: (otherlv_7= ',' ( (lv_params_8_0= ruleParameter ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==25) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:731:4: otherlv_7= ',' ( (lv_params_8_0= ruleParameter ) )
                    	    {
                    	    otherlv_7=(Token)match(input,25,FOLLOW_25_in_ruleMethod1535); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_7, grammarAccess.getMethodAccess().getCommaKeyword_5_1_0());
                    	          
                    	    }
                    	    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:735:1: ( (lv_params_8_0= ruleParameter ) )
                    	    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:736:1: (lv_params_8_0= ruleParameter )
                    	    {
                    	    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:736:1: (lv_params_8_0= ruleParameter )
                    	    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:737:3: lv_params_8_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMethodAccess().getParamsParameterParserRuleCall_5_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleMethod1556);
                    	    lv_params_8_0=ruleParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getMethodRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"params",
                    	              		lv_params_8_0, 
                    	              		"Parameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,26,FOLLOW_26_in_ruleMethod1572); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getMethodAccess().getRightParenthesisKeyword_6());
                  
            }
            otherlv_10=(Token)match(input,14,FOLLOW_14_in_ruleMethod1584); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_7());
                  
            }
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:761:1: ( (lv_body_11_0= ruleStatement ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_INT)||(LA17_0>=17 && LA17_0<=18)||LA17_0==24||(LA17_0>=29 && LA17_0<=30)||(LA17_0>=32 && LA17_0<=33)||(LA17_0>=35 && LA17_0<=36)||LA17_0==58) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:762:1: (lv_body_11_0= ruleStatement )
            	    {
            	    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:762:1: (lv_body_11_0= ruleStatement )
            	    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:763:3: lv_body_11_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMethodAccess().getBodyStatementParserRuleCall_8_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatement_in_ruleMethod1605);
            	    lv_body_11_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMethodRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"body",
            	              		lv_body_11_0, 
            	              		"Statement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_12=(Token)match(input,15,FOLLOW_15_in_ruleMethod1618); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getMethodAccess().getRightCurlyBracketKeyword_9());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleParameter"
    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:791:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:792:2: (iv_ruleParameter= ruleParameter EOF )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:793:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter1654);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter1664); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:800:1: ruleParameter returns [EObject current=null] : ( ( (lv_bt_0_0= ruleBT ) )? ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_bt_0_0 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:803:28: ( ( ( (lv_bt_0_0= ruleBT ) )? ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:804:1: ( ( (lv_bt_0_0= ruleBT ) )? ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:804:1: ( ( (lv_bt_0_0= ruleBT ) )? ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:804:2: ( (lv_bt_0_0= ruleBT ) )? ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:804:2: ( (lv_bt_0_0= ruleBT ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=17 && LA18_0<=18)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:805:1: (lv_bt_0_0= ruleBT )
                    {
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:805:1: (lv_bt_0_0= ruleBT )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:806:3: lv_bt_0_0= ruleBT
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParameterAccess().getBtBTParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBT_in_ruleParameter1710);
                    lv_bt_0_0=ruleBT();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getParameterRule());
                      	        }
                             		set(
                             			current, 
                             			"bt",
                              		lv_bt_0_0, 
                              		"BT");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:822:3: ( (otherlv_1= RULE_ID ) )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:823:1: (otherlv_1= RULE_ID )
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:823:1: (otherlv_1= RULE_ID )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:824:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getParameterRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter1731); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getTypeTypeCrossReference_1_0()); 
              	
            }

            }


            }

            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:835:2: ( (lv_name_2_0= RULE_ID ) )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:836:1: (lv_name_2_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:836:1: (lv_name_2_0= RULE_ID )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:837:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter1748); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getParameterRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleConstructor"
    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:861:1: entryRuleConstructor returns [EObject current=null] : iv_ruleConstructor= ruleConstructor EOF ;
    public final EObject entryRuleConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructor = null;


        try {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:862:2: (iv_ruleConstructor= ruleConstructor EOF )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:863:2: iv_ruleConstructor= ruleConstructor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstructorRule()); 
            }
            pushFollow(FOLLOW_ruleConstructor_in_entryRuleConstructor1789);
            iv_ruleConstructor=ruleConstructor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstructor; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstructor1799); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConstructor"


    // $ANTLR start "ruleConstructor"
    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:870:1: ruleConstructor returns [EObject current=null] : ( ( (lv_bt_0_0= ruleBT ) )? ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_body_8_0= ruleStatement ) )* otherlv_9= '}' ) ;
    public final EObject ruleConstructor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_bt_0_0 = null;

        EObject lv_params_3_0 = null;

        EObject lv_params_5_0 = null;

        EObject lv_body_8_0 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:873:28: ( ( ( (lv_bt_0_0= ruleBT ) )? ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_body_8_0= ruleStatement ) )* otherlv_9= '}' ) )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:874:1: ( ( (lv_bt_0_0= ruleBT ) )? ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_body_8_0= ruleStatement ) )* otherlv_9= '}' )
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:874:1: ( ( (lv_bt_0_0= ruleBT ) )? ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_body_8_0= ruleStatement ) )* otherlv_9= '}' )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:874:2: ( (lv_bt_0_0= ruleBT ) )? ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* )? otherlv_6= ')' otherlv_7= '{' ( (lv_body_8_0= ruleStatement ) )* otherlv_9= '}'
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:874:2: ( (lv_bt_0_0= ruleBT ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=17 && LA19_0<=18)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:875:1: (lv_bt_0_0= ruleBT )
                    {
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:875:1: (lv_bt_0_0= ruleBT )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:876:3: lv_bt_0_0= ruleBT
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConstructorAccess().getBtBTParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBT_in_ruleConstructor1845);
                    lv_bt_0_0=ruleBT();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConstructorRule());
                      	        }
                             		set(
                             			current, 
                             			"bt",
                              		lv_bt_0_0, 
                              		"BT");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:892:3: ( (otherlv_1= RULE_ID ) )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:893:1: (otherlv_1= RULE_ID )
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:893:1: (otherlv_1= RULE_ID )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:894:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getConstructorRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstructor1866); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getConstructorAccess().getClazzClazzCrossReference_1_0()); 
              	
            }

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleConstructor1878); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getConstructorAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:909:1: ( ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID||(LA21_0>=17 && LA21_0<=18)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:909:2: ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )*
                    {
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:909:2: ( (lv_params_3_0= ruleParameter ) )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:910:1: (lv_params_3_0= ruleParameter )
                    {
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:910:1: (lv_params_3_0= ruleParameter )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:911:3: lv_params_3_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConstructorAccess().getParamsParameterParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_in_ruleConstructor1900);
                    lv_params_3_0=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConstructorRule());
                      	        }
                             		add(
                             			current, 
                             			"params",
                              		lv_params_3_0, 
                              		"Parameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:927:2: (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==25) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:927:4: otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleConstructor1913); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getConstructorAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:931:1: ( (lv_params_5_0= ruleParameter ) )
                    	    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:932:1: (lv_params_5_0= ruleParameter )
                    	    {
                    	    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:932:1: (lv_params_5_0= ruleParameter )
                    	    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:933:3: lv_params_5_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getConstructorAccess().getParamsParameterParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleConstructor1934);
                    	    lv_params_5_0=ruleParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getConstructorRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"params",
                    	              		lv_params_5_0, 
                    	              		"Parameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleConstructor1950); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getConstructorAccess().getRightParenthesisKeyword_4());
                  
            }
            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleConstructor1962); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getConstructorAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:957:1: ( (lv_body_8_0= ruleStatement ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=RULE_ID && LA22_0<=RULE_INT)||(LA22_0>=17 && LA22_0<=18)||LA22_0==24||(LA22_0>=29 && LA22_0<=30)||(LA22_0>=32 && LA22_0<=33)||(LA22_0>=35 && LA22_0<=36)||LA22_0==58) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:958:1: (lv_body_8_0= ruleStatement )
            	    {
            	    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:958:1: (lv_body_8_0= ruleStatement )
            	    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:959:3: lv_body_8_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConstructorAccess().getBodyStatementParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatement_in_ruleConstructor1983);
            	    lv_body_8_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getConstructorRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"body",
            	              		lv_body_8_0, 
            	              		"Statement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleConstructor1996); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getConstructorAccess().getRightCurlyBracketKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleConstructor"


    // $ANTLR start "entryRuleStatement"
    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:987:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:988:2: (iv_ruleStatement= ruleStatement EOF )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:989:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement2032);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement2042); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:996:1: ruleStatement returns [EObject current=null] : (this_VarDecl_0= ruleVarDecl | this_LocalAssign_1= ruleLocalAssign | this_FieldAssign_2= ruleFieldAssign | this_Condition_3= ruleCondition | this_While_4= ruleWhile | this_Return_5= ruleReturn | this_SingleExpr_6= ruleSingleExpr ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_VarDecl_0 = null;

        EObject this_LocalAssign_1 = null;

        EObject this_FieldAssign_2 = null;

        EObject this_Condition_3 = null;

        EObject this_While_4 = null;

        EObject this_Return_5 = null;

        EObject this_SingleExpr_6 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:999:28: ( (this_VarDecl_0= ruleVarDecl | this_LocalAssign_1= ruleLocalAssign | this_FieldAssign_2= ruleFieldAssign | this_Condition_3= ruleCondition | this_While_4= ruleWhile | this_Return_5= ruleReturn | this_SingleExpr_6= ruleSingleExpr ) )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1000:1: (this_VarDecl_0= ruleVarDecl | this_LocalAssign_1= ruleLocalAssign | this_FieldAssign_2= ruleFieldAssign | this_Condition_3= ruleCondition | this_While_4= ruleWhile | this_Return_5= ruleReturn | this_SingleExpr_6= ruleSingleExpr )
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1000:1: (this_VarDecl_0= ruleVarDecl | this_LocalAssign_1= ruleLocalAssign | this_FieldAssign_2= ruleFieldAssign | this_Condition_3= ruleCondition | this_While_4= ruleWhile | this_Return_5= ruleReturn | this_SingleExpr_6= ruleSingleExpr )
            int alt23=7;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1001:5: this_VarDecl_0= ruleVarDecl
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getVarDeclParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVarDecl_in_ruleStatement2089);
                    this_VarDecl_0=ruleVarDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VarDecl_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1011:5: this_LocalAssign_1= ruleLocalAssign
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getLocalAssignParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLocalAssign_in_ruleStatement2116);
                    this_LocalAssign_1=ruleLocalAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LocalAssign_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1021:5: this_FieldAssign_2= ruleFieldAssign
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getFieldAssignParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFieldAssign_in_ruleStatement2143);
                    this_FieldAssign_2=ruleFieldAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FieldAssign_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1031:5: this_Condition_3= ruleCondition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getConditionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCondition_in_ruleStatement2170);
                    this_Condition_3=ruleCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Condition_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1041:5: this_While_4= ruleWhile
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getWhileParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleWhile_in_ruleStatement2197);
                    this_While_4=ruleWhile();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_While_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1051:5: this_Return_5= ruleReturn
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getReturnParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReturn_in_ruleStatement2224);
                    this_Return_5=ruleReturn();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Return_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1061:5: this_SingleExpr_6= ruleSingleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getSingleExprParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSingleExpr_in_ruleStatement2251);
                    this_SingleExpr_6=ruleSingleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SingleExpr_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleVarDecl"
    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1077:1: entryRuleVarDecl returns [EObject current=null] : iv_ruleVarDecl= ruleVarDecl EOF ;
    public final EObject entryRuleVarDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDecl = null;


        try {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1078:2: (iv_ruleVarDecl= ruleVarDecl EOF )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1079:2: iv_ruleVarDecl= ruleVarDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarDeclRule()); 
            }
            pushFollow(FOLLOW_ruleVarDecl_in_entryRuleVarDecl2286);
            iv_ruleVarDecl=ruleVarDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarDecl2296); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVarDecl"


    // $ANTLR start "ruleVarDecl"
    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1086:1: ruleVarDecl returns [EObject current=null] : ( ( (lv_bt_0_0= ruleBT ) )? ( (otherlv_1= RULE_ID ) ) (otherlv_2= '@' ( (lv_variant_3_0= RULE_INT ) ) )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' ) ;
    public final EObject ruleVarDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_variant_3_0=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        EObject lv_bt_0_0 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1089:28: ( ( ( (lv_bt_0_0= ruleBT ) )? ( (otherlv_1= RULE_ID ) ) (otherlv_2= '@' ( (lv_variant_3_0= RULE_INT ) ) )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' ) )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1090:1: ( ( (lv_bt_0_0= ruleBT ) )? ( (otherlv_1= RULE_ID ) ) (otherlv_2= '@' ( (lv_variant_3_0= RULE_INT ) ) )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' )
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1090:1: ( ( (lv_bt_0_0= ruleBT ) )? ( (otherlv_1= RULE_ID ) ) (otherlv_2= '@' ( (lv_variant_3_0= RULE_INT ) ) )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1090:2: ( (lv_bt_0_0= ruleBT ) )? ( (otherlv_1= RULE_ID ) ) (otherlv_2= '@' ( (lv_variant_3_0= RULE_INT ) ) )? ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';'
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1090:2: ( (lv_bt_0_0= ruleBT ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=17 && LA24_0<=18)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1091:1: (lv_bt_0_0= ruleBT )
                    {
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1091:1: (lv_bt_0_0= ruleBT )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1092:3: lv_bt_0_0= ruleBT
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVarDeclAccess().getBtBTParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBT_in_ruleVarDecl2342);
                    lv_bt_0_0=ruleBT();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVarDeclRule());
                      	        }
                             		set(
                             			current, 
                             			"bt",
                              		lv_bt_0_0, 
                              		"BT");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1108:3: ( (otherlv_1= RULE_ID ) )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1109:1: (otherlv_1= RULE_ID )
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1109:1: (otherlv_1= RULE_ID )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1110:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVarDeclRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVarDecl2363); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getVarDeclAccess().getTypeTypeCrossReference_1_0()); 
              	
            }

            }


            }

            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1121:2: (otherlv_2= '@' ( (lv_variant_3_0= RULE_INT ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==21) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1121:4: otherlv_2= '@' ( (lv_variant_3_0= RULE_INT ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleVarDecl2376); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getVarDeclAccess().getCommercialAtKeyword_2_0());
                          
                    }
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1125:1: ( (lv_variant_3_0= RULE_INT ) )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1126:1: (lv_variant_3_0= RULE_INT )
                    {
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1126:1: (lv_variant_3_0= RULE_INT )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1127:3: lv_variant_3_0= RULE_INT
                    {
                    lv_variant_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVarDecl2393); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_variant_3_0, grammarAccess.getVarDeclAccess().getVariantINTTerminalRuleCall_2_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVarDeclRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"variant",
                              		lv_variant_3_0, 
                              		"INT");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1143:4: ( (lv_name_4_0= RULE_ID ) )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1144:1: (lv_name_4_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1144:1: (lv_name_4_0= RULE_ID )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1145:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVarDecl2417); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_4_0, grammarAccess.getVarDeclAccess().getNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVarDeclRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_4_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleVarDecl2434); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getVarDeclAccess().getSemicolonKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleVarDecl"


    // $ANTLR start "entryRuleLocalAssign"
    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1173:1: entryRuleLocalAssign returns [EObject current=null] : iv_ruleLocalAssign= ruleLocalAssign EOF ;
    public final EObject entryRuleLocalAssign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalAssign = null;


        try {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1174:2: (iv_ruleLocalAssign= ruleLocalAssign EOF )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1175:2: iv_ruleLocalAssign= ruleLocalAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalAssignRule()); 
            }
            pushFollow(FOLLOW_ruleLocalAssign_in_entryRuleLocalAssign2470);
            iv_ruleLocalAssign=ruleLocalAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalAssign; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalAssign2480); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLocalAssign"


    // $ANTLR start "ruleLocalAssign"
    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1182:1: ruleLocalAssign returns [EObject current=null] : ( ( (lv_bt_0_0= ruleBT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_rhs_3_0= ruleExpr ) ) otherlv_4= ';' ) ;
    public final EObject ruleLocalAssign() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_bt_0_0 = null;

        EObject lv_rhs_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1185:28: ( ( ( (lv_bt_0_0= ruleBT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_rhs_3_0= ruleExpr ) ) otherlv_4= ';' ) )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1186:1: ( ( (lv_bt_0_0= ruleBT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_rhs_3_0= ruleExpr ) ) otherlv_4= ';' )
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1186:1: ( ( (lv_bt_0_0= ruleBT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_rhs_3_0= ruleExpr ) ) otherlv_4= ';' )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1186:2: ( (lv_bt_0_0= ruleBT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_rhs_3_0= ruleExpr ) ) otherlv_4= ';'
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1186:2: ( (lv_bt_0_0= ruleBT ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=17 && LA26_0<=18)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1187:1: (lv_bt_0_0= ruleBT )
                    {
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1187:1: (lv_bt_0_0= ruleBT )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1188:3: lv_bt_0_0= ruleBT
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLocalAssignAccess().getBtBTParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBT_in_ruleLocalAssign2526);
                    lv_bt_0_0=ruleBT();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLocalAssignRule());
                      	        }
                             		set(
                             			current, 
                             			"bt",
                              		lv_bt_0_0, 
                              		"BT");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1204:3: ( (lv_name_1_0= RULE_ID ) )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1205:1: (lv_name_1_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1205:1: (lv_name_1_0= RULE_ID )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1206:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLocalAssign2544); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getLocalAssignAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getLocalAssignRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleLocalAssign2561); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getLocalAssignAccess().getEqualsSignKeyword_2());
                  
            }
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1226:1: ( (lv_rhs_3_0= ruleExpr ) )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1227:1: (lv_rhs_3_0= ruleExpr )
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1227:1: (lv_rhs_3_0= ruleExpr )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1228:3: lv_rhs_3_0= ruleExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalAssignAccess().getRhsExprParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpr_in_ruleLocalAssign2582);
            lv_rhs_3_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLocalAssignRule());
              	        }
                     		set(
                     			current, 
                     			"rhs",
                      		lv_rhs_3_0, 
                      		"Expr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleLocalAssign2594); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getLocalAssignAccess().getSemicolonKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLocalAssign"


    // $ANTLR start "entryRuleFieldAssign"
    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1256:1: entryRuleFieldAssign returns [EObject current=null] : iv_ruleFieldAssign= ruleFieldAssign EOF ;
    public final EObject entryRuleFieldAssign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldAssign = null;


        try {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1257:2: (iv_ruleFieldAssign= ruleFieldAssign EOF )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1258:2: iv_ruleFieldAssign= ruleFieldAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldAssignRule()); 
            }
            pushFollow(FOLLOW_ruleFieldAssign_in_entryRuleFieldAssign2630);
            iv_ruleFieldAssign=ruleFieldAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldAssign; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldAssign2640); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFieldAssign"


    // $ANTLR start "ruleFieldAssign"
    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1265:1: ruleFieldAssign returns [EObject current=null] : ( ( ( (lv_bt_0_0= ruleBT ) )? ( (lv_object_1_0= RULE_ID ) ) otherlv_2= '.' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_rhs_5_0= ruleExpr ) ) otherlv_6= ';' ) | ( ( (lv_bt_7_0= ruleBT ) )? otherlv_8= 'this' otherlv_9= '.' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '=' ( (lv_rhs_12_0= ruleExpr ) ) otherlv_13= ';' ) ) ;
    public final EObject ruleFieldAssign() throws RecognitionException {
        EObject current = null;

        Token lv_object_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_name_10_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_bt_0_0 = null;

        EObject lv_rhs_5_0 = null;

        EObject lv_bt_7_0 = null;

        EObject lv_rhs_12_0 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1268:28: ( ( ( ( (lv_bt_0_0= ruleBT ) )? ( (lv_object_1_0= RULE_ID ) ) otherlv_2= '.' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_rhs_5_0= ruleExpr ) ) otherlv_6= ';' ) | ( ( (lv_bt_7_0= ruleBT ) )? otherlv_8= 'this' otherlv_9= '.' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '=' ( (lv_rhs_12_0= ruleExpr ) ) otherlv_13= ';' ) ) )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1269:1: ( ( ( (lv_bt_0_0= ruleBT ) )? ( (lv_object_1_0= RULE_ID ) ) otherlv_2= '.' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_rhs_5_0= ruleExpr ) ) otherlv_6= ';' ) | ( ( (lv_bt_7_0= ruleBT ) )? otherlv_8= 'this' otherlv_9= '.' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '=' ( (lv_rhs_12_0= ruleExpr ) ) otherlv_13= ';' ) )
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1269:1: ( ( ( (lv_bt_0_0= ruleBT ) )? ( (lv_object_1_0= RULE_ID ) ) otherlv_2= '.' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_rhs_5_0= ruleExpr ) ) otherlv_6= ';' ) | ( ( (lv_bt_7_0= ruleBT ) )? otherlv_8= 'this' otherlv_9= '.' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '=' ( (lv_rhs_12_0= ruleExpr ) ) otherlv_13= ';' ) )
            int alt29=2;
            switch ( input.LA(1) ) {
            case 17:
                {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==RULE_ID) ) {
                    alt29=1;
                }
                else if ( (LA29_1==29) ) {
                    alt29=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 1, input);

                    throw nvae;
                }
                }
                break;
            case 18:
                {
                int LA29_2 = input.LA(2);

                if ( (LA29_2==RULE_ID) ) {
                    alt29=1;
                }
                else if ( (LA29_2==29) ) {
                    alt29=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt29=1;
                }
                break;
            case 29:
                {
                alt29=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1269:2: ( ( (lv_bt_0_0= ruleBT ) )? ( (lv_object_1_0= RULE_ID ) ) otherlv_2= '.' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_rhs_5_0= ruleExpr ) ) otherlv_6= ';' )
                    {
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1269:2: ( ( (lv_bt_0_0= ruleBT ) )? ( (lv_object_1_0= RULE_ID ) ) otherlv_2= '.' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_rhs_5_0= ruleExpr ) ) otherlv_6= ';' )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1269:3: ( (lv_bt_0_0= ruleBT ) )? ( (lv_object_1_0= RULE_ID ) ) otherlv_2= '.' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_rhs_5_0= ruleExpr ) ) otherlv_6= ';'
                    {
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1269:3: ( (lv_bt_0_0= ruleBT ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( ((LA27_0>=17 && LA27_0<=18)) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1270:1: (lv_bt_0_0= ruleBT )
                            {
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1270:1: (lv_bt_0_0= ruleBT )
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1271:3: lv_bt_0_0= ruleBT
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getFieldAssignAccess().getBtBTParserRuleCall_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleBT_in_ruleFieldAssign2687);
                            lv_bt_0_0=ruleBT();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getFieldAssignRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"bt",
                                      		lv_bt_0_0, 
                                      		"BT");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1287:3: ( (lv_object_1_0= RULE_ID ) )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1288:1: (lv_object_1_0= RULE_ID )
                    {
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1288:1: (lv_object_1_0= RULE_ID )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1289:3: lv_object_1_0= RULE_ID
                    {
                    lv_object_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFieldAssign2705); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_object_1_0, grammarAccess.getFieldAssignAccess().getObjectIDTerminalRuleCall_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFieldAssignRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"object",
                              		lv_object_1_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleFieldAssign2722); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getFieldAssignAccess().getFullStopKeyword_0_2());
                          
                    }
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1309:1: ( (lv_name_3_0= RULE_ID ) )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1310:1: (lv_name_3_0= RULE_ID )
                    {
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1310:1: (lv_name_3_0= RULE_ID )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1311:3: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFieldAssign2739); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_3_0, grammarAccess.getFieldAssignAccess().getNameIDTerminalRuleCall_0_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFieldAssignRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_3_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleFieldAssign2756); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getFieldAssignAccess().getEqualsSignKeyword_0_4());
                          
                    }
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1331:1: ( (lv_rhs_5_0= ruleExpr ) )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1332:1: (lv_rhs_5_0= ruleExpr )
                    {
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1332:1: (lv_rhs_5_0= ruleExpr )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1333:3: lv_rhs_5_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFieldAssignAccess().getRhsExprParserRuleCall_0_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleFieldAssign2777);
                    lv_rhs_5_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFieldAssignRule());
                      	        }
                             		set(
                             			current, 
                             			"rhs",
                              		lv_rhs_5_0, 
                              		"Expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,12,FOLLOW_12_in_ruleFieldAssign2789); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getFieldAssignAccess().getSemicolonKeyword_0_6());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1354:6: ( ( (lv_bt_7_0= ruleBT ) )? otherlv_8= 'this' otherlv_9= '.' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '=' ( (lv_rhs_12_0= ruleExpr ) ) otherlv_13= ';' )
                    {
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1354:6: ( ( (lv_bt_7_0= ruleBT ) )? otherlv_8= 'this' otherlv_9= '.' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '=' ( (lv_rhs_12_0= ruleExpr ) ) otherlv_13= ';' )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1354:7: ( (lv_bt_7_0= ruleBT ) )? otherlv_8= 'this' otherlv_9= '.' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= '=' ( (lv_rhs_12_0= ruleExpr ) ) otherlv_13= ';'
                    {
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1354:7: ( (lv_bt_7_0= ruleBT ) )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( ((LA28_0>=17 && LA28_0<=18)) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1355:1: (lv_bt_7_0= ruleBT )
                            {
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1355:1: (lv_bt_7_0= ruleBT )
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1356:3: lv_bt_7_0= ruleBT
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getFieldAssignAccess().getBtBTParserRuleCall_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleBT_in_ruleFieldAssign2818);
                            lv_bt_7_0=ruleBT();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getFieldAssignRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"bt",
                                      		lv_bt_7_0, 
                                      		"BT");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,29,FOLLOW_29_in_ruleFieldAssign2831); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getFieldAssignAccess().getThisKeyword_1_1());
                          
                    }
                    otherlv_9=(Token)match(input,28,FOLLOW_28_in_ruleFieldAssign2843); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getFieldAssignAccess().getFullStopKeyword_1_2());
                          
                    }
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1380:1: ( (lv_name_10_0= RULE_ID ) )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1381:1: (lv_name_10_0= RULE_ID )
                    {
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1381:1: (lv_name_10_0= RULE_ID )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1382:3: lv_name_10_0= RULE_ID
                    {
                    lv_name_10_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFieldAssign2860); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_10_0, grammarAccess.getFieldAssignAccess().getNameIDTerminalRuleCall_1_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFieldAssignRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_10_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_11=(Token)match(input,27,FOLLOW_27_in_ruleFieldAssign2877); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getFieldAssignAccess().getEqualsSignKeyword_1_4());
                          
                    }
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1402:1: ( (lv_rhs_12_0= ruleExpr ) )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1403:1: (lv_rhs_12_0= ruleExpr )
                    {
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1403:1: (lv_rhs_12_0= ruleExpr )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1404:3: lv_rhs_12_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFieldAssignAccess().getRhsExprParserRuleCall_1_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleFieldAssign2898);
                    lv_rhs_12_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFieldAssignRule());
                      	        }
                             		set(
                             			current, 
                             			"rhs",
                              		lv_rhs_12_0, 
                              		"Expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,12,FOLLOW_12_in_ruleFieldAssign2910); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getFieldAssignAccess().getSemicolonKeyword_1_6());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleFieldAssign"


    // $ANTLR start "entryRuleCondition"
    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1432:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1433:2: (iv_ruleCondition= ruleCondition EOF )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1434:2: iv_ruleCondition= ruleCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionRule()); 
            }
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition2947);
            iv_ruleCondition=ruleCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCondition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition2957); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1441:1: ruleCondition returns [EObject current=null] : ( ( (lv_bt_0_0= ruleBT ) )? otherlv_1= 'if' otherlv_2= '(' ( (lv_cond_3_0= ruleExpr ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_thenBody_6_0= ruleStatement ) )* otherlv_7= '}' otherlv_8= 'else' otherlv_9= '{' ( (lv_elseBody_10_0= ruleStatement ) )* otherlv_11= '}' ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_bt_0_0 = null;

        EObject lv_cond_3_0 = null;

        EObject lv_thenBody_6_0 = null;

        EObject lv_elseBody_10_0 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1444:28: ( ( ( (lv_bt_0_0= ruleBT ) )? otherlv_1= 'if' otherlv_2= '(' ( (lv_cond_3_0= ruleExpr ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_thenBody_6_0= ruleStatement ) )* otherlv_7= '}' otherlv_8= 'else' otherlv_9= '{' ( (lv_elseBody_10_0= ruleStatement ) )* otherlv_11= '}' ) )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1445:1: ( ( (lv_bt_0_0= ruleBT ) )? otherlv_1= 'if' otherlv_2= '(' ( (lv_cond_3_0= ruleExpr ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_thenBody_6_0= ruleStatement ) )* otherlv_7= '}' otherlv_8= 'else' otherlv_9= '{' ( (lv_elseBody_10_0= ruleStatement ) )* otherlv_11= '}' )
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1445:1: ( ( (lv_bt_0_0= ruleBT ) )? otherlv_1= 'if' otherlv_2= '(' ( (lv_cond_3_0= ruleExpr ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_thenBody_6_0= ruleStatement ) )* otherlv_7= '}' otherlv_8= 'else' otherlv_9= '{' ( (lv_elseBody_10_0= ruleStatement ) )* otherlv_11= '}' )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1445:2: ( (lv_bt_0_0= ruleBT ) )? otherlv_1= 'if' otherlv_2= '(' ( (lv_cond_3_0= ruleExpr ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_thenBody_6_0= ruleStatement ) )* otherlv_7= '}' otherlv_8= 'else' otherlv_9= '{' ( (lv_elseBody_10_0= ruleStatement ) )* otherlv_11= '}'
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1445:2: ( (lv_bt_0_0= ruleBT ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=17 && LA30_0<=18)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1446:1: (lv_bt_0_0= ruleBT )
                    {
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1446:1: (lv_bt_0_0= ruleBT )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1447:3: lv_bt_0_0= ruleBT
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionAccess().getBtBTParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBT_in_ruleCondition3003);
                    lv_bt_0_0=ruleBT();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConditionRule());
                      	        }
                             		set(
                             			current, 
                             			"bt",
                              		lv_bt_0_0, 
                              		"BT");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleCondition3016); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getConditionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleCondition3028); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1471:1: ( (lv_cond_3_0= ruleExpr ) )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1472:1: (lv_cond_3_0= ruleExpr )
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1472:1: (lv_cond_3_0= ruleExpr )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1473:3: lv_cond_3_0= ruleExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConditionAccess().getCondExprParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpr_in_ruleCondition3049);
            lv_cond_3_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConditionRule());
              	        }
                     		set(
                     			current, 
                     			"cond",
                      		lv_cond_3_0, 
                      		"Expr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleCondition3061); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getConditionAccess().getRightParenthesisKeyword_4());
                  
            }
            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleCondition3073); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getConditionAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1497:1: ( (lv_thenBody_6_0= ruleStatement ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=RULE_ID && LA31_0<=RULE_INT)||(LA31_0>=17 && LA31_0<=18)||LA31_0==24||(LA31_0>=29 && LA31_0<=30)||(LA31_0>=32 && LA31_0<=33)||(LA31_0>=35 && LA31_0<=36)||LA31_0==58) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1498:1: (lv_thenBody_6_0= ruleStatement )
            	    {
            	    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1498:1: (lv_thenBody_6_0= ruleStatement )
            	    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1499:3: lv_thenBody_6_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConditionAccess().getThenBodyStatementParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatement_in_ruleCondition3094);
            	    lv_thenBody_6_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getConditionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"thenBody",
            	              		lv_thenBody_6_0, 
            	              		"Statement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleCondition3107); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getConditionAccess().getRightCurlyBracketKeyword_7());
                  
            }
            otherlv_8=(Token)match(input,31,FOLLOW_31_in_ruleCondition3119); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getConditionAccess().getElseKeyword_8());
                  
            }
            otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleCondition3131); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getConditionAccess().getLeftCurlyBracketKeyword_9());
                  
            }
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1527:1: ( (lv_elseBody_10_0= ruleStatement ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=RULE_ID && LA32_0<=RULE_INT)||(LA32_0>=17 && LA32_0<=18)||LA32_0==24||(LA32_0>=29 && LA32_0<=30)||(LA32_0>=32 && LA32_0<=33)||(LA32_0>=35 && LA32_0<=36)||LA32_0==58) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1528:1: (lv_elseBody_10_0= ruleStatement )
            	    {
            	    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1528:1: (lv_elseBody_10_0= ruleStatement )
            	    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1529:3: lv_elseBody_10_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConditionAccess().getElseBodyStatementParserRuleCall_10_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatement_in_ruleCondition3152);
            	    lv_elseBody_10_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getConditionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elseBody",
            	              		lv_elseBody_10_0, 
            	              		"Statement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleCondition3165); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getConditionAccess().getRightCurlyBracketKeyword_11());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleWhile"
    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1557:1: entryRuleWhile returns [EObject current=null] : iv_ruleWhile= ruleWhile EOF ;
    public final EObject entryRuleWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhile = null;


        try {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1558:2: (iv_ruleWhile= ruleWhile EOF )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1559:2: iv_ruleWhile= ruleWhile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhileRule()); 
            }
            pushFollow(FOLLOW_ruleWhile_in_entryRuleWhile3201);
            iv_ruleWhile=ruleWhile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhile; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhile3211); if (state.failed) return current;

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
    // $ANTLR end "entryRuleWhile"


    // $ANTLR start "ruleWhile"
    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1566:1: ruleWhile returns [EObject current=null] : ( ( (lv_bt_0_0= ruleBT ) )? otherlv_1= 'while' otherlv_2= '(' ( (lv_cond_3_0= ruleExpr ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_body_6_0= ruleStatement ) )* otherlv_7= '}' ) ;
    public final EObject ruleWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_bt_0_0 = null;

        EObject lv_cond_3_0 = null;

        EObject lv_body_6_0 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1569:28: ( ( ( (lv_bt_0_0= ruleBT ) )? otherlv_1= 'while' otherlv_2= '(' ( (lv_cond_3_0= ruleExpr ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_body_6_0= ruleStatement ) )* otherlv_7= '}' ) )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1570:1: ( ( (lv_bt_0_0= ruleBT ) )? otherlv_1= 'while' otherlv_2= '(' ( (lv_cond_3_0= ruleExpr ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_body_6_0= ruleStatement ) )* otherlv_7= '}' )
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1570:1: ( ( (lv_bt_0_0= ruleBT ) )? otherlv_1= 'while' otherlv_2= '(' ( (lv_cond_3_0= ruleExpr ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_body_6_0= ruleStatement ) )* otherlv_7= '}' )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1570:2: ( (lv_bt_0_0= ruleBT ) )? otherlv_1= 'while' otherlv_2= '(' ( (lv_cond_3_0= ruleExpr ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_body_6_0= ruleStatement ) )* otherlv_7= '}'
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1570:2: ( (lv_bt_0_0= ruleBT ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=17 && LA33_0<=18)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1571:1: (lv_bt_0_0= ruleBT )
                    {
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1571:1: (lv_bt_0_0= ruleBT )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1572:3: lv_bt_0_0= ruleBT
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getWhileAccess().getBtBTParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBT_in_ruleWhile3257);
                    lv_bt_0_0=ruleBT();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getWhileRule());
                      	        }
                             		set(
                             			current, 
                             			"bt",
                              		lv_bt_0_0, 
                              		"BT");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleWhile3270); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getWhileAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleWhile3282); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getWhileAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1596:1: ( (lv_cond_3_0= ruleExpr ) )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1597:1: (lv_cond_3_0= ruleExpr )
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1597:1: (lv_cond_3_0= ruleExpr )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1598:3: lv_cond_3_0= ruleExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhileAccess().getCondExprParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpr_in_ruleWhile3303);
            lv_cond_3_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWhileRule());
              	        }
                     		set(
                     			current, 
                     			"cond",
                      		lv_cond_3_0, 
                      		"Expr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleWhile3315); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getWhileAccess().getRightParenthesisKeyword_4());
                  
            }
            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleWhile3327); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getWhileAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1622:1: ( (lv_body_6_0= ruleStatement ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=RULE_ID && LA34_0<=RULE_INT)||(LA34_0>=17 && LA34_0<=18)||LA34_0==24||(LA34_0>=29 && LA34_0<=30)||(LA34_0>=32 && LA34_0<=33)||(LA34_0>=35 && LA34_0<=36)||LA34_0==58) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1623:1: (lv_body_6_0= ruleStatement )
            	    {
            	    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1623:1: (lv_body_6_0= ruleStatement )
            	    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1624:3: lv_body_6_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getWhileAccess().getBodyStatementParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatement_in_ruleWhile3348);
            	    lv_body_6_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getWhileRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"body",
            	              		lv_body_6_0, 
            	              		"Statement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleWhile3361); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getWhileAccess().getRightCurlyBracketKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleWhile"


    // $ANTLR start "entryRuleReturn"
    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1652:1: entryRuleReturn returns [EObject current=null] : iv_ruleReturn= ruleReturn EOF ;
    public final EObject entryRuleReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturn = null;


        try {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1653:2: (iv_ruleReturn= ruleReturn EOF )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1654:2: iv_ruleReturn= ruleReturn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReturnRule()); 
            }
            pushFollow(FOLLOW_ruleReturn_in_entryRuleReturn3397);
            iv_ruleReturn=ruleReturn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReturn; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturn3407); if (state.failed) return current;

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
    // $ANTLR end "entryRuleReturn"


    // $ANTLR start "ruleReturn"
    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1661:1: ruleReturn returns [EObject current=null] : ( ( (lv_bt_0_0= ruleBT ) )? otherlv_1= 'return' ( (lv_exp_2_0= ruleExpr ) ) otherlv_3= ';' ) ;
    public final EObject ruleReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_bt_0_0 = null;

        EObject lv_exp_2_0 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1664:28: ( ( ( (lv_bt_0_0= ruleBT ) )? otherlv_1= 'return' ( (lv_exp_2_0= ruleExpr ) ) otherlv_3= ';' ) )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1665:1: ( ( (lv_bt_0_0= ruleBT ) )? otherlv_1= 'return' ( (lv_exp_2_0= ruleExpr ) ) otherlv_3= ';' )
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1665:1: ( ( (lv_bt_0_0= ruleBT ) )? otherlv_1= 'return' ( (lv_exp_2_0= ruleExpr ) ) otherlv_3= ';' )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1665:2: ( (lv_bt_0_0= ruleBT ) )? otherlv_1= 'return' ( (lv_exp_2_0= ruleExpr ) ) otherlv_3= ';'
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1665:2: ( (lv_bt_0_0= ruleBT ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=17 && LA35_0<=18)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1666:1: (lv_bt_0_0= ruleBT )
                    {
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1666:1: (lv_bt_0_0= ruleBT )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1667:3: lv_bt_0_0= ruleBT
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReturnAccess().getBtBTParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBT_in_ruleReturn3453);
                    lv_bt_0_0=ruleBT();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReturnRule());
                      	        }
                             		set(
                             			current, 
                             			"bt",
                              		lv_bt_0_0, 
                              		"BT");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleReturn3466); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getReturnAccess().getReturnKeyword_1());
                  
            }
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1687:1: ( (lv_exp_2_0= ruleExpr ) )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1688:1: (lv_exp_2_0= ruleExpr )
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1688:1: (lv_exp_2_0= ruleExpr )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1689:3: lv_exp_2_0= ruleExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReturnAccess().getExpExprParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpr_in_ruleReturn3487);
            lv_exp_2_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getReturnRule());
              	        }
                     		set(
                     			current, 
                     			"exp",
                      		lv_exp_2_0, 
                      		"Expr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleReturn3499); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getReturnAccess().getSemicolonKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleReturn"


    // $ANTLR start "entryRuleSingleExpr"
    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1717:1: entryRuleSingleExpr returns [EObject current=null] : iv_ruleSingleExpr= ruleSingleExpr EOF ;
    public final EObject entryRuleSingleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleExpr = null;


        try {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1718:2: (iv_ruleSingleExpr= ruleSingleExpr EOF )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1719:2: iv_ruleSingleExpr= ruleSingleExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleExprRule()); 
            }
            pushFollow(FOLLOW_ruleSingleExpr_in_entryRuleSingleExpr3535);
            iv_ruleSingleExpr=ruleSingleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleExpr3545); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSingleExpr"


    // $ANTLR start "ruleSingleExpr"
    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1726:1: ruleSingleExpr returns [EObject current=null] : ( ( ( (lv_bt_0_0= ruleBT ) ) otherlv_1= ':' )? ( (lv_exp_2_0= ruleExpr ) ) otherlv_3= ';' ) ;
    public final EObject ruleSingleExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_bt_0_0 = null;

        EObject lv_exp_2_0 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1729:28: ( ( ( ( (lv_bt_0_0= ruleBT ) ) otherlv_1= ':' )? ( (lv_exp_2_0= ruleExpr ) ) otherlv_3= ';' ) )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1730:1: ( ( ( (lv_bt_0_0= ruleBT ) ) otherlv_1= ':' )? ( (lv_exp_2_0= ruleExpr ) ) otherlv_3= ';' )
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1730:1: ( ( ( (lv_bt_0_0= ruleBT ) ) otherlv_1= ':' )? ( (lv_exp_2_0= ruleExpr ) ) otherlv_3= ';' )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1730:2: ( ( (lv_bt_0_0= ruleBT ) ) otherlv_1= ':' )? ( (lv_exp_2_0= ruleExpr ) ) otherlv_3= ';'
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1730:2: ( ( (lv_bt_0_0= ruleBT ) ) otherlv_1= ':' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==17) ) {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==34) ) {
                    alt36=1;
                }
            }
            else if ( (LA36_0==18) ) {
                int LA36_2 = input.LA(2);

                if ( (LA36_2==34) ) {
                    alt36=1;
                }
            }
            switch (alt36) {
                case 1 :
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1730:3: ( (lv_bt_0_0= ruleBT ) ) otherlv_1= ':'
                    {
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1730:3: ( (lv_bt_0_0= ruleBT ) )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1731:1: (lv_bt_0_0= ruleBT )
                    {
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1731:1: (lv_bt_0_0= ruleBT )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1732:3: lv_bt_0_0= ruleBT
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSingleExprAccess().getBtBTParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBT_in_ruleSingleExpr3592);
                    lv_bt_0_0=ruleBT();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSingleExprRule());
                      	        }
                             		set(
                             			current, 
                             			"bt",
                              		lv_bt_0_0, 
                              		"BT");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleSingleExpr3604); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getSingleExprAccess().getColonKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1752:3: ( (lv_exp_2_0= ruleExpr ) )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1753:1: (lv_exp_2_0= ruleExpr )
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1753:1: (lv_exp_2_0= ruleExpr )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1754:3: lv_exp_2_0= ruleExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSingleExprAccess().getExpExprParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpr_in_ruleSingleExpr3627);
            lv_exp_2_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSingleExprRule());
              	        }
                     		set(
                     			current, 
                     			"exp",
                      		lv_exp_2_0, 
                      		"Expr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleSingleExpr3639); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSingleExprAccess().getSemicolonKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSingleExpr"


    // $ANTLR start "entryRuleExpr"
    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1782:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1783:2: (iv_ruleExpr= ruleExpr EOF )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1784:2: iv_ruleExpr= ruleExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprRule()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_entryRuleExpr3675);
            iv_ruleExpr=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpr3685); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1791:1: ruleExpr returns [EObject current=null] : (this_AnnotatedExpr_0= ruleAnnotatedExpr | this_ArithExp_1= ruleArithExp | this_LiftExp_2= ruleLiftExp ) ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        EObject this_AnnotatedExpr_0 = null;

        EObject this_ArithExp_1 = null;

        EObject this_LiftExp_2 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1794:28: ( (this_AnnotatedExpr_0= ruleAnnotatedExpr | this_ArithExp_1= ruleArithExp | this_LiftExp_2= ruleLiftExp ) )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1795:1: (this_AnnotatedExpr_0= ruleAnnotatedExpr | this_ArithExp_1= ruleArithExp | this_LiftExp_2= ruleLiftExp )
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1795:1: (this_AnnotatedExpr_0= ruleAnnotatedExpr | this_ArithExp_1= ruleArithExp | this_LiftExp_2= ruleLiftExp )
            int alt37=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==RULE_ID) ) {
                    int LA37_3 = input.LA(3);

                    if ( (LA37_3==28) ) {
                        alt37=1;
                    }
                    else if ( (LA37_3==EOF||LA37_3==12||(LA37_3>=25 && LA37_3<=26)||(LA37_3>=37 && LA37_3<=57)) ) {
                        alt37=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA37_1==29||LA37_1==36) ) {
                    alt37=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 1, input);

                    throw nvae;
                }
                }
                break;
            case 18:
                {
                int LA37_2 = input.LA(2);

                if ( (LA37_2==RULE_ID) ) {
                    int LA37_3 = input.LA(3);

                    if ( (LA37_3==28) ) {
                        alt37=1;
                    }
                    else if ( (LA37_3==EOF||LA37_3==12||(LA37_3>=25 && LA37_3<=26)||(LA37_3>=37 && LA37_3<=57)) ) {
                        alt37=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA37_2==29||LA37_2==36) ) {
                    alt37=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA37_3 = input.LA(2);

                if ( (LA37_3==28) ) {
                    alt37=1;
                }
                else if ( (LA37_3==EOF||LA37_3==12||(LA37_3>=25 && LA37_3<=26)||(LA37_3>=37 && LA37_3<=57)) ) {
                    alt37=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 3, input);

                    throw nvae;
                }
                }
                break;
            case 29:
            case 36:
                {
                alt37=1;
                }
                break;
            case RULE_INT:
            case 24:
            case 58:
                {
                alt37=2;
                }
                break;
            case 35:
                {
                alt37=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1796:5: this_AnnotatedExpr_0= ruleAnnotatedExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExprAccess().getAnnotatedExprParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAnnotatedExpr_in_ruleExpr3732);
                    this_AnnotatedExpr_0=ruleAnnotatedExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AnnotatedExpr_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1806:5: this_ArithExp_1= ruleArithExp
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExprAccess().getArithExpParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleArithExp_in_ruleExpr3759);
                    this_ArithExp_1=ruleArithExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ArithExp_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1816:5: this_LiftExp_2= ruleLiftExp
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExprAccess().getLiftExpParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiftExp_in_ruleExpr3786);
                    this_LiftExp_2=ruleLiftExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LiftExp_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleLiftExp"
    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1832:1: entryRuleLiftExp returns [EObject current=null] : iv_ruleLiftExp= ruleLiftExp EOF ;
    public final EObject entryRuleLiftExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiftExp = null;


        try {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1833:2: (iv_ruleLiftExp= ruleLiftExp EOF )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1834:2: iv_ruleLiftExp= ruleLiftExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiftExpRule()); 
            }
            pushFollow(FOLLOW_ruleLiftExp_in_entryRuleLiftExp3821);
            iv_ruleLiftExp=ruleLiftExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiftExp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiftExp3831); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiftExp"


    // $ANTLR start "ruleLiftExp"
    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1841:1: ruleLiftExp returns [EObject current=null] : (otherlv_0= 'lift' ( (lv_exp_1_0= ruleExpr ) ) ) ;
    public final EObject ruleLiftExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_exp_1_0 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1844:28: ( (otherlv_0= 'lift' ( (lv_exp_1_0= ruleExpr ) ) ) )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1845:1: (otherlv_0= 'lift' ( (lv_exp_1_0= ruleExpr ) ) )
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1845:1: (otherlv_0= 'lift' ( (lv_exp_1_0= ruleExpr ) ) )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1845:3: otherlv_0= 'lift' ( (lv_exp_1_0= ruleExpr ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleLiftExp3868); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLiftExpAccess().getLiftKeyword_0());
                  
            }
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1849:1: ( (lv_exp_1_0= ruleExpr ) )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1850:1: (lv_exp_1_0= ruleExpr )
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1850:1: (lv_exp_1_0= ruleExpr )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1851:3: lv_exp_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLiftExpAccess().getExpExprParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpr_in_ruleLiftExp3889);
            lv_exp_1_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLiftExpRule());
              	        }
                     		set(
                     			current, 
                     			"exp",
                      		lv_exp_1_0, 
                      		"Expr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLiftExp"


    // $ANTLR start "entryRuleAnnotatedExpr"
    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1875:1: entryRuleAnnotatedExpr returns [EObject current=null] : iv_ruleAnnotatedExpr= ruleAnnotatedExpr EOF ;
    public final EObject entryRuleAnnotatedExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotatedExpr = null;


        try {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1876:2: (iv_ruleAnnotatedExpr= ruleAnnotatedExpr EOF )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1877:2: iv_ruleAnnotatedExpr= ruleAnnotatedExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotatedExprRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotatedExpr_in_entryRuleAnnotatedExpr3925);
            iv_ruleAnnotatedExpr=ruleAnnotatedExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotatedExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotatedExpr3935); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAnnotatedExpr"


    // $ANTLR start "ruleAnnotatedExpr"
    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1884:1: ruleAnnotatedExpr returns [EObject current=null] : ( ( ( (lv_bt_0_0= ruleBT ) )? ( (lv_exp_1_0= ruleObjectOp ) ) ) | ( () ( (lv_bt_3_0= ruleBT ) )? otherlv_4= 'this' ) | ( ( (lv_bt_5_0= ruleBT ) )? ( (lv_exp_6_0= ruleInstantiation ) ) ) ) ;
    public final EObject ruleAnnotatedExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject lv_bt_0_0 = null;

        EObject lv_exp_1_0 = null;

        EObject lv_bt_3_0 = null;

        EObject lv_bt_5_0 = null;

        EObject lv_exp_6_0 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1887:28: ( ( ( ( (lv_bt_0_0= ruleBT ) )? ( (lv_exp_1_0= ruleObjectOp ) ) ) | ( () ( (lv_bt_3_0= ruleBT ) )? otherlv_4= 'this' ) | ( ( (lv_bt_5_0= ruleBT ) )? ( (lv_exp_6_0= ruleInstantiation ) ) ) ) )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1888:1: ( ( ( (lv_bt_0_0= ruleBT ) )? ( (lv_exp_1_0= ruleObjectOp ) ) ) | ( () ( (lv_bt_3_0= ruleBT ) )? otherlv_4= 'this' ) | ( ( (lv_bt_5_0= ruleBT ) )? ( (lv_exp_6_0= ruleInstantiation ) ) ) )
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1888:1: ( ( ( (lv_bt_0_0= ruleBT ) )? ( (lv_exp_1_0= ruleObjectOp ) ) ) | ( () ( (lv_bt_3_0= ruleBT ) )? otherlv_4= 'this' ) | ( ( (lv_bt_5_0= ruleBT ) )? ( (lv_exp_6_0= ruleInstantiation ) ) ) )
            int alt41=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                switch ( input.LA(2) ) {
                case RULE_ID:
                    {
                    alt41=1;
                    }
                    break;
                case 29:
                    {
                    int LA41_4 = input.LA(3);

                    if ( (LA41_4==28) ) {
                        alt41=1;
                    }
                    else if ( (LA41_4==EOF||LA41_4==12||(LA41_4>=25 && LA41_4<=26)) ) {
                        alt41=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 36:
                    {
                    alt41=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 1, input);

                    throw nvae;
                }

                }
                break;
            case 18:
                {
                switch ( input.LA(2) ) {
                case 36:
                    {
                    alt41=3;
                    }
                    break;
                case 29:
                    {
                    int LA41_4 = input.LA(3);

                    if ( (LA41_4==28) ) {
                        alt41=1;
                    }
                    else if ( (LA41_4==EOF||LA41_4==12||(LA41_4>=25 && LA41_4<=26)) ) {
                        alt41=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_ID:
                    {
                    alt41=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 2, input);

                    throw nvae;
                }

                }
                break;
            case RULE_ID:
                {
                alt41=1;
                }
                break;
            case 29:
                {
                int LA41_4 = input.LA(2);

                if ( (LA41_4==28) ) {
                    alt41=1;
                }
                else if ( (LA41_4==EOF||LA41_4==12||(LA41_4>=25 && LA41_4<=26)) ) {
                    alt41=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 4, input);

                    throw nvae;
                }
                }
                break;
            case 36:
                {
                alt41=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1888:2: ( ( (lv_bt_0_0= ruleBT ) )? ( (lv_exp_1_0= ruleObjectOp ) ) )
                    {
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1888:2: ( ( (lv_bt_0_0= ruleBT ) )? ( (lv_exp_1_0= ruleObjectOp ) ) )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1888:3: ( (lv_bt_0_0= ruleBT ) )? ( (lv_exp_1_0= ruleObjectOp ) )
                    {
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1888:3: ( (lv_bt_0_0= ruleBT ) )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( ((LA38_0>=17 && LA38_0<=18)) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1889:1: (lv_bt_0_0= ruleBT )
                            {
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1889:1: (lv_bt_0_0= ruleBT )
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1890:3: lv_bt_0_0= ruleBT
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAnnotatedExprAccess().getBtBTParserRuleCall_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleBT_in_ruleAnnotatedExpr3982);
                            lv_bt_0_0=ruleBT();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getAnnotatedExprRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"bt",
                                      		lv_bt_0_0, 
                                      		"BT");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1906:3: ( (lv_exp_1_0= ruleObjectOp ) )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1907:1: (lv_exp_1_0= ruleObjectOp )
                    {
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1907:1: (lv_exp_1_0= ruleObjectOp )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1908:3: lv_exp_1_0= ruleObjectOp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAnnotatedExprAccess().getExpObjectOpParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleObjectOp_in_ruleAnnotatedExpr4004);
                    lv_exp_1_0=ruleObjectOp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAnnotatedExprRule());
                      	        }
                             		set(
                             			current, 
                             			"exp",
                              		lv_exp_1_0, 
                              		"ObjectOp");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1925:6: ( () ( (lv_bt_3_0= ruleBT ) )? otherlv_4= 'this' )
                    {
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1925:6: ( () ( (lv_bt_3_0= ruleBT ) )? otherlv_4= 'this' )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1925:7: () ( (lv_bt_3_0= ruleBT ) )? otherlv_4= 'this'
                    {
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1925:7: ()
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1926:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAnnotatedExprAccess().getThisAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1931:2: ( (lv_bt_3_0= ruleBT ) )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( ((LA39_0>=17 && LA39_0<=18)) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1932:1: (lv_bt_3_0= ruleBT )
                            {
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1932:1: (lv_bt_3_0= ruleBT )
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1933:3: lv_bt_3_0= ruleBT
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAnnotatedExprAccess().getBtBTParserRuleCall_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleBT_in_ruleAnnotatedExpr4042);
                            lv_bt_3_0=ruleBT();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getAnnotatedExprRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"bt",
                                      		lv_bt_3_0, 
                                      		"BT");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleAnnotatedExpr4055); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getAnnotatedExprAccess().getThisKeyword_1_2());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1954:6: ( ( (lv_bt_5_0= ruleBT ) )? ( (lv_exp_6_0= ruleInstantiation ) ) )
                    {
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1954:6: ( ( (lv_bt_5_0= ruleBT ) )? ( (lv_exp_6_0= ruleInstantiation ) ) )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1954:7: ( (lv_bt_5_0= ruleBT ) )? ( (lv_exp_6_0= ruleInstantiation ) )
                    {
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1954:7: ( (lv_bt_5_0= ruleBT ) )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( ((LA40_0>=17 && LA40_0<=18)) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1955:1: (lv_bt_5_0= ruleBT )
                            {
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1955:1: (lv_bt_5_0= ruleBT )
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1956:3: lv_bt_5_0= ruleBT
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAnnotatedExprAccess().getBtBTParserRuleCall_2_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleBT_in_ruleAnnotatedExpr4084);
                            lv_bt_5_0=ruleBT();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getAnnotatedExprRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"bt",
                                      		lv_bt_5_0, 
                                      		"BT");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1972:3: ( (lv_exp_6_0= ruleInstantiation ) )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1973:1: (lv_exp_6_0= ruleInstantiation )
                    {
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1973:1: (lv_exp_6_0= ruleInstantiation )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1974:3: lv_exp_6_0= ruleInstantiation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAnnotatedExprAccess().getExpInstantiationParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInstantiation_in_ruleAnnotatedExpr4106);
                    lv_exp_6_0=ruleInstantiation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAnnotatedExprRule());
                      	        }
                             		set(
                             			current, 
                             			"exp",
                              		lv_exp_6_0, 
                              		"Instantiation");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAnnotatedExpr"


    // $ANTLR start "entryRuleObjectOp"
    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1998:1: entryRuleObjectOp returns [EObject current=null] : iv_ruleObjectOp= ruleObjectOp EOF ;
    public final EObject entryRuleObjectOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectOp = null;


        try {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:1999:2: (iv_ruleObjectOp= ruleObjectOp EOF )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2000:2: iv_ruleObjectOp= ruleObjectOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObjectOpRule()); 
            }
            pushFollow(FOLLOW_ruleObjectOp_in_entryRuleObjectOp4143);
            iv_ruleObjectOp=ruleObjectOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleObjectOp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectOp4153); if (state.failed) return current;

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
    // $ANTLR end "entryRuleObjectOp"


    // $ANTLR start "ruleObjectOp"
    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2007:1: ruleObjectOp returns [EObject current=null] : ( ( ( (lv_object_0_0= RULE_ID ) ) otherlv_1= '.' (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )? ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '@' ( (lv_variant_7_0= RULE_INT ) ) )? ( ( ( '(' )=>otherlv_8= '(' ) () ( ( (lv_argument_10_0= ruleExpr ) ) (otherlv_11= ',' ( (lv_argument_12_0= ruleExpr ) ) )* )? otherlv_13= ')' )? ) | (otherlv_14= 'this' otherlv_15= '.' (otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) otherlv_18= ')' )? ( (lv_name_19_0= RULE_ID ) ) (otherlv_20= '@' ( (lv_variant_21_0= RULE_INT ) ) )? ( ( ( '(' )=>otherlv_22= '(' ) () ( ( (lv_argument_24_0= ruleExpr ) ) (otherlv_25= ',' ( (lv_argument_26_0= ruleExpr ) ) )* )? otherlv_27= ')' )? ) ) ;
    public final EObject ruleObjectOp() throws RecognitionException {
        EObject current = null;

        Token lv_object_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token lv_variant_7_0=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_name_19_0=null;
        Token otherlv_20=null;
        Token lv_variant_21_0=null;
        Token otherlv_22=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        EObject lv_argument_10_0 = null;

        EObject lv_argument_12_0 = null;

        EObject lv_argument_24_0 = null;

        EObject lv_argument_26_0 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2010:28: ( ( ( ( (lv_object_0_0= RULE_ID ) ) otherlv_1= '.' (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )? ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '@' ( (lv_variant_7_0= RULE_INT ) ) )? ( ( ( '(' )=>otherlv_8= '(' ) () ( ( (lv_argument_10_0= ruleExpr ) ) (otherlv_11= ',' ( (lv_argument_12_0= ruleExpr ) ) )* )? otherlv_13= ')' )? ) | (otherlv_14= 'this' otherlv_15= '.' (otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) otherlv_18= ')' )? ( (lv_name_19_0= RULE_ID ) ) (otherlv_20= '@' ( (lv_variant_21_0= RULE_INT ) ) )? ( ( ( '(' )=>otherlv_22= '(' ) () ( ( (lv_argument_24_0= ruleExpr ) ) (otherlv_25= ',' ( (lv_argument_26_0= ruleExpr ) ) )* )? otherlv_27= ')' )? ) ) )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2011:1: ( ( ( (lv_object_0_0= RULE_ID ) ) otherlv_1= '.' (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )? ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '@' ( (lv_variant_7_0= RULE_INT ) ) )? ( ( ( '(' )=>otherlv_8= '(' ) () ( ( (lv_argument_10_0= ruleExpr ) ) (otherlv_11= ',' ( (lv_argument_12_0= ruleExpr ) ) )* )? otherlv_13= ')' )? ) | (otherlv_14= 'this' otherlv_15= '.' (otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) otherlv_18= ')' )? ( (lv_name_19_0= RULE_ID ) ) (otherlv_20= '@' ( (lv_variant_21_0= RULE_INT ) ) )? ( ( ( '(' )=>otherlv_22= '(' ) () ( ( (lv_argument_24_0= ruleExpr ) ) (otherlv_25= ',' ( (lv_argument_26_0= ruleExpr ) ) )* )? otherlv_27= ')' )? ) )
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2011:1: ( ( ( (lv_object_0_0= RULE_ID ) ) otherlv_1= '.' (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )? ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '@' ( (lv_variant_7_0= RULE_INT ) ) )? ( ( ( '(' )=>otherlv_8= '(' ) () ( ( (lv_argument_10_0= ruleExpr ) ) (otherlv_11= ',' ( (lv_argument_12_0= ruleExpr ) ) )* )? otherlv_13= ')' )? ) | (otherlv_14= 'this' otherlv_15= '.' (otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) otherlv_18= ')' )? ( (lv_name_19_0= RULE_ID ) ) (otherlv_20= '@' ( (lv_variant_21_0= RULE_INT ) ) )? ( ( ( '(' )=>otherlv_22= '(' ) () ( ( (lv_argument_24_0= ruleExpr ) ) (otherlv_25= ',' ( (lv_argument_26_0= ruleExpr ) ) )* )? otherlv_27= ')' )? ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID) ) {
                alt52=1;
            }
            else if ( (LA52_0==29) ) {
                alt52=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2011:2: ( ( (lv_object_0_0= RULE_ID ) ) otherlv_1= '.' (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )? ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '@' ( (lv_variant_7_0= RULE_INT ) ) )? ( ( ( '(' )=>otherlv_8= '(' ) () ( ( (lv_argument_10_0= ruleExpr ) ) (otherlv_11= ',' ( (lv_argument_12_0= ruleExpr ) ) )* )? otherlv_13= ')' )? )
                    {
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2011:2: ( ( (lv_object_0_0= RULE_ID ) ) otherlv_1= '.' (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )? ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '@' ( (lv_variant_7_0= RULE_INT ) ) )? ( ( ( '(' )=>otherlv_8= '(' ) () ( ( (lv_argument_10_0= ruleExpr ) ) (otherlv_11= ',' ( (lv_argument_12_0= ruleExpr ) ) )* )? otherlv_13= ')' )? )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2011:3: ( (lv_object_0_0= RULE_ID ) ) otherlv_1= '.' (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )? ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '@' ( (lv_variant_7_0= RULE_INT ) ) )? ( ( ( '(' )=>otherlv_8= '(' ) () ( ( (lv_argument_10_0= ruleExpr ) ) (otherlv_11= ',' ( (lv_argument_12_0= ruleExpr ) ) )* )? otherlv_13= ')' )?
                    {
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2011:3: ( (lv_object_0_0= RULE_ID ) )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2012:1: (lv_object_0_0= RULE_ID )
                    {
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2012:1: (lv_object_0_0= RULE_ID )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2013:3: lv_object_0_0= RULE_ID
                    {
                    lv_object_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjectOp4196); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_object_0_0, grammarAccess.getObjectOpAccess().getObjectIDTerminalRuleCall_0_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getObjectOpRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"object",
                              		lv_object_0_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleObjectOp4213); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getObjectOpAccess().getFullStopKeyword_0_1());
                          
                    }
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2033:1: (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==24) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2033:3: otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')'
                            {
                            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleObjectOp4226); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_2, grammarAccess.getObjectOpAccess().getLeftParenthesisKeyword_0_2_0());
                                  
                            }
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2037:1: ( (otherlv_3= RULE_ID ) )
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2038:1: (otherlv_3= RULE_ID )
                            {
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2038:1: (otherlv_3= RULE_ID )
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2039:3: otherlv_3= RULE_ID
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getObjectOpRule());
                              	        }
                                      
                            }
                            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjectOp4246); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		newLeafNode(otherlv_3, grammarAccess.getObjectOpAccess().getQualifierClazzCrossReference_0_2_1_0()); 
                              	
                            }

                            }


                            }

                            otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleObjectOp4258); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getObjectOpAccess().getRightParenthesisKeyword_0_2_2());
                                  
                            }

                            }
                            break;

                    }

                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2054:3: ( (lv_name_5_0= RULE_ID ) )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2055:1: (lv_name_5_0= RULE_ID )
                    {
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2055:1: (lv_name_5_0= RULE_ID )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2056:3: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjectOp4277); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_5_0, grammarAccess.getObjectOpAccess().getNameIDTerminalRuleCall_0_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getObjectOpRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_5_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2072:2: (otherlv_6= '@' ( (lv_variant_7_0= RULE_INT ) ) )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==21) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2072:4: otherlv_6= '@' ( (lv_variant_7_0= RULE_INT ) )
                            {
                            otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleObjectOp4295); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_6, grammarAccess.getObjectOpAccess().getCommercialAtKeyword_0_4_0());
                                  
                            }
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2076:1: ( (lv_variant_7_0= RULE_INT ) )
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2077:1: (lv_variant_7_0= RULE_INT )
                            {
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2077:1: (lv_variant_7_0= RULE_INT )
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2078:3: lv_variant_7_0= RULE_INT
                            {
                            lv_variant_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleObjectOp4312); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_variant_7_0, grammarAccess.getObjectOpAccess().getVariantINTTerminalRuleCall_0_4_1_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getObjectOpRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"variant",
                                      		lv_variant_7_0, 
                                      		"INT");
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2094:4: ( ( ( '(' )=>otherlv_8= '(' ) () ( ( (lv_argument_10_0= ruleExpr ) ) (otherlv_11= ',' ( (lv_argument_12_0= ruleExpr ) ) )* )? otherlv_13= ')' )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==24) && (synpred1_InternalTJ())) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2094:5: ( ( '(' )=>otherlv_8= '(' ) () ( ( (lv_argument_10_0= ruleExpr ) ) (otherlv_11= ',' ( (lv_argument_12_0= ruleExpr ) ) )* )? otherlv_13= ')'
                            {
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2094:5: ( ( '(' )=>otherlv_8= '(' )
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2094:6: ( '(' )=>otherlv_8= '('
                            {
                            otherlv_8=(Token)match(input,24,FOLLOW_24_in_ruleObjectOp4340); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getObjectOpAccess().getLeftParenthesisKeyword_0_5_0());
                                  
                            }

                            }

                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2099:2: ()
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2100:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getObjectOpAccess().getMethodCallTargetAction_0_5_1(),
                                          current);
                                  
                            }

                            }

                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2105:2: ( ( (lv_argument_10_0= ruleExpr ) ) (otherlv_11= ',' ( (lv_argument_12_0= ruleExpr ) ) )* )?
                            int alt45=2;
                            int LA45_0 = input.LA(1);

                            if ( ((LA45_0>=RULE_ID && LA45_0<=RULE_INT)||(LA45_0>=17 && LA45_0<=18)||LA45_0==24||LA45_0==29||(LA45_0>=35 && LA45_0<=36)||LA45_0==58) ) {
                                alt45=1;
                            }
                            switch (alt45) {
                                case 1 :
                                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2105:3: ( (lv_argument_10_0= ruleExpr ) ) (otherlv_11= ',' ( (lv_argument_12_0= ruleExpr ) ) )*
                                    {
                                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2105:3: ( (lv_argument_10_0= ruleExpr ) )
                                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2106:1: (lv_argument_10_0= ruleExpr )
                                    {
                                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2106:1: (lv_argument_10_0= ruleExpr )
                                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2107:3: lv_argument_10_0= ruleExpr
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getObjectOpAccess().getArgumentExprParserRuleCall_0_5_2_0_0()); 
                                      	    
                                    }
                                    pushFollow(FOLLOW_ruleExpr_in_ruleObjectOp4372);
                                    lv_argument_10_0=ruleExpr();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElementForParent(grammarAccess.getObjectOpRule());
                                      	        }
                                             		add(
                                             			current, 
                                             			"argument",
                                              		lv_argument_10_0, 
                                              		"Expr");
                                      	        afterParserOrEnumRuleCall();
                                      	    
                                    }

                                    }


                                    }

                                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2123:2: (otherlv_11= ',' ( (lv_argument_12_0= ruleExpr ) ) )*
                                    loop44:
                                    do {
                                        int alt44=2;
                                        int LA44_0 = input.LA(1);

                                        if ( (LA44_0==25) ) {
                                            alt44=1;
                                        }


                                        switch (alt44) {
                                    	case 1 :
                                    	    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2123:4: otherlv_11= ',' ( (lv_argument_12_0= ruleExpr ) )
                                    	    {
                                    	    otherlv_11=(Token)match(input,25,FOLLOW_25_in_ruleObjectOp4385); if (state.failed) return current;
                                    	    if ( state.backtracking==0 ) {

                                    	          	newLeafNode(otherlv_11, grammarAccess.getObjectOpAccess().getCommaKeyword_0_5_2_1_0());
                                    	          
                                    	    }
                                    	    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2127:1: ( (lv_argument_12_0= ruleExpr ) )
                                    	    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2128:1: (lv_argument_12_0= ruleExpr )
                                    	    {
                                    	    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2128:1: (lv_argument_12_0= ruleExpr )
                                    	    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2129:3: lv_argument_12_0= ruleExpr
                                    	    {
                                    	    if ( state.backtracking==0 ) {
                                    	       
                                    	      	        newCompositeNode(grammarAccess.getObjectOpAccess().getArgumentExprParserRuleCall_0_5_2_1_1_0()); 
                                    	      	    
                                    	    }
                                    	    pushFollow(FOLLOW_ruleExpr_in_ruleObjectOp4406);
                                    	    lv_argument_12_0=ruleExpr();

                                    	    state._fsp--;
                                    	    if (state.failed) return current;
                                    	    if ( state.backtracking==0 ) {

                                    	      	        if (current==null) {
                                    	      	            current = createModelElementForParent(grammarAccess.getObjectOpRule());
                                    	      	        }
                                    	             		add(
                                    	             			current, 
                                    	             			"argument",
                                    	              		lv_argument_12_0, 
                                    	              		"Expr");
                                    	      	        afterParserOrEnumRuleCall();
                                    	      	    
                                    	    }

                                    	    }


                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop44;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }

                            otherlv_13=(Token)match(input,26,FOLLOW_26_in_ruleObjectOp4422); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_13, grammarAccess.getObjectOpAccess().getRightParenthesisKeyword_0_5_3());
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2150:6: (otherlv_14= 'this' otherlv_15= '.' (otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) otherlv_18= ')' )? ( (lv_name_19_0= RULE_ID ) ) (otherlv_20= '@' ( (lv_variant_21_0= RULE_INT ) ) )? ( ( ( '(' )=>otherlv_22= '(' ) () ( ( (lv_argument_24_0= ruleExpr ) ) (otherlv_25= ',' ( (lv_argument_26_0= ruleExpr ) ) )* )? otherlv_27= ')' )? )
                    {
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2150:6: (otherlv_14= 'this' otherlv_15= '.' (otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) otherlv_18= ')' )? ( (lv_name_19_0= RULE_ID ) ) (otherlv_20= '@' ( (lv_variant_21_0= RULE_INT ) ) )? ( ( ( '(' )=>otherlv_22= '(' ) () ( ( (lv_argument_24_0= ruleExpr ) ) (otherlv_25= ',' ( (lv_argument_26_0= ruleExpr ) ) )* )? otherlv_27= ')' )? )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2150:8: otherlv_14= 'this' otherlv_15= '.' (otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) otherlv_18= ')' )? ( (lv_name_19_0= RULE_ID ) ) (otherlv_20= '@' ( (lv_variant_21_0= RULE_INT ) ) )? ( ( ( '(' )=>otherlv_22= '(' ) () ( ( (lv_argument_24_0= ruleExpr ) ) (otherlv_25= ',' ( (lv_argument_26_0= ruleExpr ) ) )* )? otherlv_27= ')' )?
                    {
                    otherlv_14=(Token)match(input,29,FOLLOW_29_in_ruleObjectOp4444); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getObjectOpAccess().getThisKeyword_1_0());
                          
                    }
                    otherlv_15=(Token)match(input,28,FOLLOW_28_in_ruleObjectOp4456); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getObjectOpAccess().getFullStopKeyword_1_1());
                          
                    }
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2158:1: (otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) otherlv_18= ')' )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==24) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2158:3: otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) otherlv_18= ')'
                            {
                            otherlv_16=(Token)match(input,24,FOLLOW_24_in_ruleObjectOp4469); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_16, grammarAccess.getObjectOpAccess().getLeftParenthesisKeyword_1_2_0());
                                  
                            }
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2162:1: ( (otherlv_17= RULE_ID ) )
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2163:1: (otherlv_17= RULE_ID )
                            {
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2163:1: (otherlv_17= RULE_ID )
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2164:3: otherlv_17= RULE_ID
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getObjectOpRule());
                              	        }
                                      
                            }
                            otherlv_17=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjectOp4489); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		newLeafNode(otherlv_17, grammarAccess.getObjectOpAccess().getQualifierClazzCrossReference_1_2_1_0()); 
                              	
                            }

                            }


                            }

                            otherlv_18=(Token)match(input,26,FOLLOW_26_in_ruleObjectOp4501); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_18, grammarAccess.getObjectOpAccess().getRightParenthesisKeyword_1_2_2());
                                  
                            }

                            }
                            break;

                    }

                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2179:3: ( (lv_name_19_0= RULE_ID ) )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2180:1: (lv_name_19_0= RULE_ID )
                    {
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2180:1: (lv_name_19_0= RULE_ID )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2181:3: lv_name_19_0= RULE_ID
                    {
                    lv_name_19_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjectOp4520); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_19_0, grammarAccess.getObjectOpAccess().getNameIDTerminalRuleCall_1_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getObjectOpRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_19_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2197:2: (otherlv_20= '@' ( (lv_variant_21_0= RULE_INT ) ) )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==21) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2197:4: otherlv_20= '@' ( (lv_variant_21_0= RULE_INT ) )
                            {
                            otherlv_20=(Token)match(input,21,FOLLOW_21_in_ruleObjectOp4538); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_20, grammarAccess.getObjectOpAccess().getCommercialAtKeyword_1_4_0());
                                  
                            }
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2201:1: ( (lv_variant_21_0= RULE_INT ) )
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2202:1: (lv_variant_21_0= RULE_INT )
                            {
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2202:1: (lv_variant_21_0= RULE_INT )
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2203:3: lv_variant_21_0= RULE_INT
                            {
                            lv_variant_21_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleObjectOp4555); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_variant_21_0, grammarAccess.getObjectOpAccess().getVariantINTTerminalRuleCall_1_4_1_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getObjectOpRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"variant",
                                      		lv_variant_21_0, 
                                      		"INT");
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2219:4: ( ( ( '(' )=>otherlv_22= '(' ) () ( ( (lv_argument_24_0= ruleExpr ) ) (otherlv_25= ',' ( (lv_argument_26_0= ruleExpr ) ) )* )? otherlv_27= ')' )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==24) && (synpred2_InternalTJ())) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2219:5: ( ( '(' )=>otherlv_22= '(' ) () ( ( (lv_argument_24_0= ruleExpr ) ) (otherlv_25= ',' ( (lv_argument_26_0= ruleExpr ) ) )* )? otherlv_27= ')'
                            {
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2219:5: ( ( '(' )=>otherlv_22= '(' )
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2219:6: ( '(' )=>otherlv_22= '('
                            {
                            otherlv_22=(Token)match(input,24,FOLLOW_24_in_ruleObjectOp4583); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_22, grammarAccess.getObjectOpAccess().getLeftParenthesisKeyword_1_5_0());
                                  
                            }

                            }

                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2224:2: ()
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2225:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getObjectOpAccess().getMethodCallTargetAction_1_5_1(),
                                          current);
                                  
                            }

                            }

                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2230:2: ( ( (lv_argument_24_0= ruleExpr ) ) (otherlv_25= ',' ( (lv_argument_26_0= ruleExpr ) ) )* )?
                            int alt50=2;
                            int LA50_0 = input.LA(1);

                            if ( ((LA50_0>=RULE_ID && LA50_0<=RULE_INT)||(LA50_0>=17 && LA50_0<=18)||LA50_0==24||LA50_0==29||(LA50_0>=35 && LA50_0<=36)||LA50_0==58) ) {
                                alt50=1;
                            }
                            switch (alt50) {
                                case 1 :
                                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2230:3: ( (lv_argument_24_0= ruleExpr ) ) (otherlv_25= ',' ( (lv_argument_26_0= ruleExpr ) ) )*
                                    {
                                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2230:3: ( (lv_argument_24_0= ruleExpr ) )
                                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2231:1: (lv_argument_24_0= ruleExpr )
                                    {
                                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2231:1: (lv_argument_24_0= ruleExpr )
                                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2232:3: lv_argument_24_0= ruleExpr
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getObjectOpAccess().getArgumentExprParserRuleCall_1_5_2_0_0()); 
                                      	    
                                    }
                                    pushFollow(FOLLOW_ruleExpr_in_ruleObjectOp4615);
                                    lv_argument_24_0=ruleExpr();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElementForParent(grammarAccess.getObjectOpRule());
                                      	        }
                                             		add(
                                             			current, 
                                             			"argument",
                                              		lv_argument_24_0, 
                                              		"Expr");
                                      	        afterParserOrEnumRuleCall();
                                      	    
                                    }

                                    }


                                    }

                                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2248:2: (otherlv_25= ',' ( (lv_argument_26_0= ruleExpr ) ) )*
                                    loop49:
                                    do {
                                        int alt49=2;
                                        int LA49_0 = input.LA(1);

                                        if ( (LA49_0==25) ) {
                                            alt49=1;
                                        }


                                        switch (alt49) {
                                    	case 1 :
                                    	    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2248:4: otherlv_25= ',' ( (lv_argument_26_0= ruleExpr ) )
                                    	    {
                                    	    otherlv_25=(Token)match(input,25,FOLLOW_25_in_ruleObjectOp4628); if (state.failed) return current;
                                    	    if ( state.backtracking==0 ) {

                                    	          	newLeafNode(otherlv_25, grammarAccess.getObjectOpAccess().getCommaKeyword_1_5_2_1_0());
                                    	          
                                    	    }
                                    	    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2252:1: ( (lv_argument_26_0= ruleExpr ) )
                                    	    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2253:1: (lv_argument_26_0= ruleExpr )
                                    	    {
                                    	    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2253:1: (lv_argument_26_0= ruleExpr )
                                    	    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2254:3: lv_argument_26_0= ruleExpr
                                    	    {
                                    	    if ( state.backtracking==0 ) {
                                    	       
                                    	      	        newCompositeNode(grammarAccess.getObjectOpAccess().getArgumentExprParserRuleCall_1_5_2_1_1_0()); 
                                    	      	    
                                    	    }
                                    	    pushFollow(FOLLOW_ruleExpr_in_ruleObjectOp4649);
                                    	    lv_argument_26_0=ruleExpr();

                                    	    state._fsp--;
                                    	    if (state.failed) return current;
                                    	    if ( state.backtracking==0 ) {

                                    	      	        if (current==null) {
                                    	      	            current = createModelElementForParent(grammarAccess.getObjectOpRule());
                                    	      	        }
                                    	             		add(
                                    	             			current, 
                                    	             			"argument",
                                    	              		lv_argument_26_0, 
                                    	              		"Expr");
                                    	      	        afterParserOrEnumRuleCall();
                                    	      	    
                                    	    }

                                    	    }


                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop49;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }

                            otherlv_27=(Token)match(input,26,FOLLOW_26_in_ruleObjectOp4665); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_27, grammarAccess.getObjectOpAccess().getRightParenthesisKeyword_1_5_3());
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleObjectOp"


    // $ANTLR start "entryRuleInstantiation"
    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2282:1: entryRuleInstantiation returns [EObject current=null] : iv_ruleInstantiation= ruleInstantiation EOF ;
    public final EObject entryRuleInstantiation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstantiation = null;


        try {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2283:2: (iv_ruleInstantiation= ruleInstantiation EOF )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2284:2: iv_ruleInstantiation= ruleInstantiation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstantiationRule()); 
            }
            pushFollow(FOLLOW_ruleInstantiation_in_entryRuleInstantiation4704);
            iv_ruleInstantiation=ruleInstantiation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstantiation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstantiation4714); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInstantiation"


    // $ANTLR start "ruleInstantiation"
    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2291:1: ruleInstantiation returns [EObject current=null] : (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '@' ( (lv_variant_3_0= RULE_INT ) ) )? otherlv_4= '(' ( ( (lv_argument_5_0= ruleExpr ) ) (otherlv_6= ',' ( (lv_argument_7_0= ruleExpr ) ) )* )? otherlv_8= ')' ) ;
    public final EObject ruleInstantiation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_variant_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_argument_5_0 = null;

        EObject lv_argument_7_0 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2294:28: ( (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '@' ( (lv_variant_3_0= RULE_INT ) ) )? otherlv_4= '(' ( ( (lv_argument_5_0= ruleExpr ) ) (otherlv_6= ',' ( (lv_argument_7_0= ruleExpr ) ) )* )? otherlv_8= ')' ) )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2295:1: (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '@' ( (lv_variant_3_0= RULE_INT ) ) )? otherlv_4= '(' ( ( (lv_argument_5_0= ruleExpr ) ) (otherlv_6= ',' ( (lv_argument_7_0= ruleExpr ) ) )* )? otherlv_8= ')' )
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2295:1: (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '@' ( (lv_variant_3_0= RULE_INT ) ) )? otherlv_4= '(' ( ( (lv_argument_5_0= ruleExpr ) ) (otherlv_6= ',' ( (lv_argument_7_0= ruleExpr ) ) )* )? otherlv_8= ')' )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2295:3: otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '@' ( (lv_variant_3_0= RULE_INT ) ) )? otherlv_4= '(' ( ( (lv_argument_5_0= ruleExpr ) ) (otherlv_6= ',' ( (lv_argument_7_0= ruleExpr ) ) )* )? otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleInstantiation4751); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInstantiationAccess().getNewKeyword_0());
                  
            }
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2299:1: ( (otherlv_1= RULE_ID ) )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2300:1: (otherlv_1= RULE_ID )
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2300:1: (otherlv_1= RULE_ID )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2301:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getInstantiationRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInstantiation4771); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getInstantiationAccess().getTypeClazzCrossReference_1_0()); 
              	
            }

            }


            }

            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2312:2: (otherlv_2= '@' ( (lv_variant_3_0= RULE_INT ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==21) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2312:4: otherlv_2= '@' ( (lv_variant_3_0= RULE_INT ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleInstantiation4784); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getInstantiationAccess().getCommercialAtKeyword_2_0());
                          
                    }
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2316:1: ( (lv_variant_3_0= RULE_INT ) )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2317:1: (lv_variant_3_0= RULE_INT )
                    {
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2317:1: (lv_variant_3_0= RULE_INT )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2318:3: lv_variant_3_0= RULE_INT
                    {
                    lv_variant_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleInstantiation4801); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_variant_3_0, grammarAccess.getInstantiationAccess().getVariantINTTerminalRuleCall_2_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getInstantiationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"variant",
                              		lv_variant_3_0, 
                              		"INT");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleInstantiation4820); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getInstantiationAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2338:1: ( ( (lv_argument_5_0= ruleExpr ) ) (otherlv_6= ',' ( (lv_argument_7_0= ruleExpr ) ) )* )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=RULE_ID && LA55_0<=RULE_INT)||(LA55_0>=17 && LA55_0<=18)||LA55_0==24||LA55_0==29||(LA55_0>=35 && LA55_0<=36)||LA55_0==58) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2338:2: ( (lv_argument_5_0= ruleExpr ) ) (otherlv_6= ',' ( (lv_argument_7_0= ruleExpr ) ) )*
                    {
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2338:2: ( (lv_argument_5_0= ruleExpr ) )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2339:1: (lv_argument_5_0= ruleExpr )
                    {
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2339:1: (lv_argument_5_0= ruleExpr )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2340:3: lv_argument_5_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInstantiationAccess().getArgumentExprParserRuleCall_4_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleInstantiation4842);
                    lv_argument_5_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInstantiationRule());
                      	        }
                             		add(
                             			current, 
                             			"argument",
                              		lv_argument_5_0, 
                              		"Expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2356:2: (otherlv_6= ',' ( (lv_argument_7_0= ruleExpr ) ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==25) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2356:4: otherlv_6= ',' ( (lv_argument_7_0= ruleExpr ) )
                    	    {
                    	    otherlv_6=(Token)match(input,25,FOLLOW_25_in_ruleInstantiation4855); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getInstantiationAccess().getCommaKeyword_4_1_0());
                    	          
                    	    }
                    	    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2360:1: ( (lv_argument_7_0= ruleExpr ) )
                    	    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2361:1: (lv_argument_7_0= ruleExpr )
                    	    {
                    	    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2361:1: (lv_argument_7_0= ruleExpr )
                    	    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2362:3: lv_argument_7_0= ruleExpr
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getInstantiationAccess().getArgumentExprParserRuleCall_4_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleExpr_in_ruleInstantiation4876);
                    	    lv_argument_7_0=ruleExpr();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getInstantiationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"argument",
                    	              		lv_argument_7_0, 
                    	              		"Expr");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,26,FOLLOW_26_in_ruleInstantiation4892); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getInstantiationAccess().getRightParenthesisKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleInstantiation"


    // $ANTLR start "entryRuleArithExp"
    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2390:1: entryRuleArithExp returns [EObject current=null] : iv_ruleArithExp= ruleArithExp EOF ;
    public final EObject entryRuleArithExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithExp = null;


        try {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2391:2: (iv_ruleArithExp= ruleArithExp EOF )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2392:2: iv_ruleArithExp= ruleArithExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArithExpRule()); 
            }
            pushFollow(FOLLOW_ruleArithExp_in_entryRuleArithExp4928);
            iv_ruleArithExp=ruleArithExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArithExp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArithExp4938); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArithExp"


    // $ANTLR start "ruleArithExp"
    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2399:1: ruleArithExp returns [EObject current=null] : ( () ( (lv_lhs_1_0= ruleAddition ) ) ( ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '==' | lv_op_2_4= '$<' | lv_op_2_5= '?<' | lv_op_2_6= '$>' | lv_op_2_7= '?>' | lv_op_2_8= '$==' | lv_op_2_9= '?==' ) ) ) ( (lv_rhs_3_0= ruleArithExp ) ) )? ) ;
    public final EObject ruleArithExp() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        Token lv_op_2_5=null;
        Token lv_op_2_6=null;
        Token lv_op_2_7=null;
        Token lv_op_2_8=null;
        Token lv_op_2_9=null;
        EObject lv_lhs_1_0 = null;

        EObject lv_rhs_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2402:28: ( ( () ( (lv_lhs_1_0= ruleAddition ) ) ( ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '==' | lv_op_2_4= '$<' | lv_op_2_5= '?<' | lv_op_2_6= '$>' | lv_op_2_7= '?>' | lv_op_2_8= '$==' | lv_op_2_9= '?==' ) ) ) ( (lv_rhs_3_0= ruleArithExp ) ) )? ) )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2403:1: ( () ( (lv_lhs_1_0= ruleAddition ) ) ( ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '==' | lv_op_2_4= '$<' | lv_op_2_5= '?<' | lv_op_2_6= '$>' | lv_op_2_7= '?>' | lv_op_2_8= '$==' | lv_op_2_9= '?==' ) ) ) ( (lv_rhs_3_0= ruleArithExp ) ) )? )
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2403:1: ( () ( (lv_lhs_1_0= ruleAddition ) ) ( ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '==' | lv_op_2_4= '$<' | lv_op_2_5= '?<' | lv_op_2_6= '$>' | lv_op_2_7= '?>' | lv_op_2_8= '$==' | lv_op_2_9= '?==' ) ) ) ( (lv_rhs_3_0= ruleArithExp ) ) )? )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2403:2: () ( (lv_lhs_1_0= ruleAddition ) ) ( ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '==' | lv_op_2_4= '$<' | lv_op_2_5= '?<' | lv_op_2_6= '$>' | lv_op_2_7= '?>' | lv_op_2_8= '$==' | lv_op_2_9= '?==' ) ) ) ( (lv_rhs_3_0= ruleArithExp ) ) )?
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2403:2: ()
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2404:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getArithExpAccess().getBinOpAction_0(),
                          current);
                  
            }

            }

            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2409:2: ( (lv_lhs_1_0= ruleAddition ) )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2410:1: (lv_lhs_1_0= ruleAddition )
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2410:1: (lv_lhs_1_0= ruleAddition )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2411:3: lv_lhs_1_0= ruleAddition
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArithExpAccess().getLhsAdditionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAddition_in_ruleArithExp4993);
            lv_lhs_1_0=ruleAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getArithExpRule());
              	        }
                     		set(
                     			current, 
                     			"lhs",
                      		lv_lhs_1_0, 
                      		"Addition");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2427:2: ( ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '==' | lv_op_2_4= '$<' | lv_op_2_5= '?<' | lv_op_2_6= '$>' | lv_op_2_7= '?>' | lv_op_2_8= '$==' | lv_op_2_9= '?==' ) ) ) ( (lv_rhs_3_0= ruleArithExp ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=37 && LA57_0<=45)) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2427:3: ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '==' | lv_op_2_4= '$<' | lv_op_2_5= '?<' | lv_op_2_6= '$>' | lv_op_2_7= '?>' | lv_op_2_8= '$==' | lv_op_2_9= '?==' ) ) ) ( (lv_rhs_3_0= ruleArithExp ) )
                    {
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2427:3: ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '==' | lv_op_2_4= '$<' | lv_op_2_5= '?<' | lv_op_2_6= '$>' | lv_op_2_7= '?>' | lv_op_2_8= '$==' | lv_op_2_9= '?==' ) ) )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2428:1: ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '==' | lv_op_2_4= '$<' | lv_op_2_5= '?<' | lv_op_2_6= '$>' | lv_op_2_7= '?>' | lv_op_2_8= '$==' | lv_op_2_9= '?==' ) )
                    {
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2428:1: ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '==' | lv_op_2_4= '$<' | lv_op_2_5= '?<' | lv_op_2_6= '$>' | lv_op_2_7= '?>' | lv_op_2_8= '$==' | lv_op_2_9= '?==' ) )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2429:1: (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '==' | lv_op_2_4= '$<' | lv_op_2_5= '?<' | lv_op_2_6= '$>' | lv_op_2_7= '?>' | lv_op_2_8= '$==' | lv_op_2_9= '?==' )
                    {
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2429:1: (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '==' | lv_op_2_4= '$<' | lv_op_2_5= '?<' | lv_op_2_6= '$>' | lv_op_2_7= '?>' | lv_op_2_8= '$==' | lv_op_2_9= '?==' )
                    int alt56=9;
                    switch ( input.LA(1) ) {
                    case 37:
                        {
                        alt56=1;
                        }
                        break;
                    case 38:
                        {
                        alt56=2;
                        }
                        break;
                    case 39:
                        {
                        alt56=3;
                        }
                        break;
                    case 40:
                        {
                        alt56=4;
                        }
                        break;
                    case 41:
                        {
                        alt56=5;
                        }
                        break;
                    case 42:
                        {
                        alt56=6;
                        }
                        break;
                    case 43:
                        {
                        alt56=7;
                        }
                        break;
                    case 44:
                        {
                        alt56=8;
                        }
                        break;
                    case 45:
                        {
                        alt56=9;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 56, 0, input);

                        throw nvae;
                    }

                    switch (alt56) {
                        case 1 :
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2430:3: lv_op_2_1= '<'
                            {
                            lv_op_2_1=(Token)match(input,37,FOLLOW_37_in_ruleArithExp5014); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_1, grammarAccess.getArithExpAccess().getOpLessThanSignKeyword_2_0_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getArithExpRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2442:8: lv_op_2_2= '>'
                            {
                            lv_op_2_2=(Token)match(input,38,FOLLOW_38_in_ruleArithExp5043); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_2, grammarAccess.getArithExpAccess().getOpGreaterThanSignKeyword_2_0_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getArithExpRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
                              	    
                            }

                            }
                            break;
                        case 3 :
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2454:8: lv_op_2_3= '=='
                            {
                            lv_op_2_3=(Token)match(input,39,FOLLOW_39_in_ruleArithExp5072); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_3, grammarAccess.getArithExpAccess().getOpEqualsSignEqualsSignKeyword_2_0_0_2());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getArithExpRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_3, null);
                              	    
                            }

                            }
                            break;
                        case 4 :
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2466:8: lv_op_2_4= '$<'
                            {
                            lv_op_2_4=(Token)match(input,40,FOLLOW_40_in_ruleArithExp5101); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_4, grammarAccess.getArithExpAccess().getOpDollarSignLessThanSignKeyword_2_0_0_3());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getArithExpRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_4, null);
                              	    
                            }

                            }
                            break;
                        case 5 :
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2478:8: lv_op_2_5= '?<'
                            {
                            lv_op_2_5=(Token)match(input,41,FOLLOW_41_in_ruleArithExp5130); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_5, grammarAccess.getArithExpAccess().getOpQuestionMarkLessThanSignKeyword_2_0_0_4());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getArithExpRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_5, null);
                              	    
                            }

                            }
                            break;
                        case 6 :
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2490:8: lv_op_2_6= '$>'
                            {
                            lv_op_2_6=(Token)match(input,42,FOLLOW_42_in_ruleArithExp5159); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_6, grammarAccess.getArithExpAccess().getOpDollarSignGreaterThanSignKeyword_2_0_0_5());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getArithExpRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_6, null);
                              	    
                            }

                            }
                            break;
                        case 7 :
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2502:8: lv_op_2_7= '?>'
                            {
                            lv_op_2_7=(Token)match(input,43,FOLLOW_43_in_ruleArithExp5188); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_7, grammarAccess.getArithExpAccess().getOpQuestionMarkGreaterThanSignKeyword_2_0_0_6());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getArithExpRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_7, null);
                              	    
                            }

                            }
                            break;
                        case 8 :
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2514:8: lv_op_2_8= '$=='
                            {
                            lv_op_2_8=(Token)match(input,44,FOLLOW_44_in_ruleArithExp5217); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_8, grammarAccess.getArithExpAccess().getOpDollarSignEqualsSignEqualsSignKeyword_2_0_0_7());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getArithExpRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_8, null);
                              	    
                            }

                            }
                            break;
                        case 9 :
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2526:8: lv_op_2_9= '?=='
                            {
                            lv_op_2_9=(Token)match(input,45,FOLLOW_45_in_ruleArithExp5246); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_9, grammarAccess.getArithExpAccess().getOpQuestionMarkEqualsSignEqualsSignKeyword_2_0_0_8());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getArithExpRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_9, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2541:2: ( (lv_rhs_3_0= ruleArithExp ) )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2542:1: (lv_rhs_3_0= ruleArithExp )
                    {
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2542:1: (lv_rhs_3_0= ruleArithExp )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2543:3: lv_rhs_3_0= ruleArithExp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArithExpAccess().getRhsArithExpParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleArithExp_in_ruleArithExp5283);
                    lv_rhs_3_0=ruleArithExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getArithExpRule());
                      	        }
                             		set(
                             			current, 
                             			"rhs",
                              		lv_rhs_3_0, 
                              		"ArithExp");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleArithExp"


    // $ANTLR start "entryRuleAddition"
    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2567:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2568:2: (iv_ruleAddition= ruleAddition EOF )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2569:2: iv_ruleAddition= ruleAddition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditionRule()); 
            }
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition5321);
            iv_ruleAddition=ruleAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition5331); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2576:1: ruleAddition returns [EObject current=null] : ( () ( (lv_lhs_1_0= ruleMultiplication ) ) ( ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' | lv_op_2_3= '$+' | lv_op_2_4= '?+' | lv_op_2_5= '$-' | lv_op_2_6= '?-' ) ) ) ( (lv_rhs_3_0= ruleAddition ) ) )? ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        Token lv_op_2_5=null;
        Token lv_op_2_6=null;
        EObject lv_lhs_1_0 = null;

        EObject lv_rhs_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2579:28: ( ( () ( (lv_lhs_1_0= ruleMultiplication ) ) ( ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' | lv_op_2_3= '$+' | lv_op_2_4= '?+' | lv_op_2_5= '$-' | lv_op_2_6= '?-' ) ) ) ( (lv_rhs_3_0= ruleAddition ) ) )? ) )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2580:1: ( () ( (lv_lhs_1_0= ruleMultiplication ) ) ( ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' | lv_op_2_3= '$+' | lv_op_2_4= '?+' | lv_op_2_5= '$-' | lv_op_2_6= '?-' ) ) ) ( (lv_rhs_3_0= ruleAddition ) ) )? )
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2580:1: ( () ( (lv_lhs_1_0= ruleMultiplication ) ) ( ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' | lv_op_2_3= '$+' | lv_op_2_4= '?+' | lv_op_2_5= '$-' | lv_op_2_6= '?-' ) ) ) ( (lv_rhs_3_0= ruleAddition ) ) )? )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2580:2: () ( (lv_lhs_1_0= ruleMultiplication ) ) ( ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' | lv_op_2_3= '$+' | lv_op_2_4= '?+' | lv_op_2_5= '$-' | lv_op_2_6= '?-' ) ) ) ( (lv_rhs_3_0= ruleAddition ) ) )?
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2580:2: ()
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2581:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAdditionAccess().getBinOpAction_0(),
                          current);
                  
            }

            }

            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2586:2: ( (lv_lhs_1_0= ruleMultiplication ) )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2587:1: (lv_lhs_1_0= ruleMultiplication )
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2587:1: (lv_lhs_1_0= ruleMultiplication )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2588:3: lv_lhs_1_0= ruleMultiplication
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAdditionAccess().getLhsMultiplicationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition5386);
            lv_lhs_1_0=ruleMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAdditionRule());
              	        }
                     		set(
                     			current, 
                     			"lhs",
                      		lv_lhs_1_0, 
                      		"Multiplication");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2604:2: ( ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' | lv_op_2_3= '$+' | lv_op_2_4= '?+' | lv_op_2_5= '$-' | lv_op_2_6= '?-' ) ) ) ( (lv_rhs_3_0= ruleAddition ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( ((LA59_0>=46 && LA59_0<=51)) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2604:3: ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' | lv_op_2_3= '$+' | lv_op_2_4= '?+' | lv_op_2_5= '$-' | lv_op_2_6= '?-' ) ) ) ( (lv_rhs_3_0= ruleAddition ) )
                    {
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2604:3: ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' | lv_op_2_3= '$+' | lv_op_2_4= '?+' | lv_op_2_5= '$-' | lv_op_2_6= '?-' ) ) )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2605:1: ( (lv_op_2_1= '+' | lv_op_2_2= '-' | lv_op_2_3= '$+' | lv_op_2_4= '?+' | lv_op_2_5= '$-' | lv_op_2_6= '?-' ) )
                    {
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2605:1: ( (lv_op_2_1= '+' | lv_op_2_2= '-' | lv_op_2_3= '$+' | lv_op_2_4= '?+' | lv_op_2_5= '$-' | lv_op_2_6= '?-' ) )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2606:1: (lv_op_2_1= '+' | lv_op_2_2= '-' | lv_op_2_3= '$+' | lv_op_2_4= '?+' | lv_op_2_5= '$-' | lv_op_2_6= '?-' )
                    {
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2606:1: (lv_op_2_1= '+' | lv_op_2_2= '-' | lv_op_2_3= '$+' | lv_op_2_4= '?+' | lv_op_2_5= '$-' | lv_op_2_6= '?-' )
                    int alt58=6;
                    switch ( input.LA(1) ) {
                    case 46:
                        {
                        alt58=1;
                        }
                        break;
                    case 47:
                        {
                        alt58=2;
                        }
                        break;
                    case 48:
                        {
                        alt58=3;
                        }
                        break;
                    case 49:
                        {
                        alt58=4;
                        }
                        break;
                    case 50:
                        {
                        alt58=5;
                        }
                        break;
                    case 51:
                        {
                        alt58=6;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 58, 0, input);

                        throw nvae;
                    }

                    switch (alt58) {
                        case 1 :
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2607:3: lv_op_2_1= '+'
                            {
                            lv_op_2_1=(Token)match(input,46,FOLLOW_46_in_ruleAddition5407); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_1, grammarAccess.getAdditionAccess().getOpPlusSignKeyword_2_0_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getAdditionRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2619:8: lv_op_2_2= '-'
                            {
                            lv_op_2_2=(Token)match(input,47,FOLLOW_47_in_ruleAddition5436); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_2, grammarAccess.getAdditionAccess().getOpHyphenMinusKeyword_2_0_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getAdditionRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
                              	    
                            }

                            }
                            break;
                        case 3 :
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2631:8: lv_op_2_3= '$+'
                            {
                            lv_op_2_3=(Token)match(input,48,FOLLOW_48_in_ruleAddition5465); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_3, grammarAccess.getAdditionAccess().getOpDollarSignPlusSignKeyword_2_0_0_2());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getAdditionRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_3, null);
                              	    
                            }

                            }
                            break;
                        case 4 :
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2643:8: lv_op_2_4= '?+'
                            {
                            lv_op_2_4=(Token)match(input,49,FOLLOW_49_in_ruleAddition5494); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_4, grammarAccess.getAdditionAccess().getOpQuestionMarkPlusSignKeyword_2_0_0_3());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getAdditionRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_4, null);
                              	    
                            }

                            }
                            break;
                        case 5 :
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2655:8: lv_op_2_5= '$-'
                            {
                            lv_op_2_5=(Token)match(input,50,FOLLOW_50_in_ruleAddition5523); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_5, grammarAccess.getAdditionAccess().getOpDollarSignHyphenMinusKeyword_2_0_0_4());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getAdditionRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_5, null);
                              	    
                            }

                            }
                            break;
                        case 6 :
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2667:8: lv_op_2_6= '?-'
                            {
                            lv_op_2_6=(Token)match(input,51,FOLLOW_51_in_ruleAddition5552); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_6, grammarAccess.getAdditionAccess().getOpQuestionMarkHyphenMinusKeyword_2_0_0_5());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getAdditionRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_6, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2682:2: ( (lv_rhs_3_0= ruleAddition ) )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2683:1: (lv_rhs_3_0= ruleAddition )
                    {
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2683:1: (lv_rhs_3_0= ruleAddition )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2684:3: lv_rhs_3_0= ruleAddition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAdditionAccess().getRhsAdditionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAddition_in_ruleAddition5589);
                    lv_rhs_3_0=ruleAddition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAdditionRule());
                      	        }
                             		set(
                             			current, 
                             			"rhs",
                              		lv_rhs_3_0, 
                              		"Addition");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2708:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2709:2: (iv_ruleMultiplication= ruleMultiplication EOF )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2710:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicationRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication5627);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplication; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication5637); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2717:1: ruleMultiplication returns [EObject current=null] : ( ( () ( (lv_lhs_1_0= ruleBaseExp ) ) ( ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '$*' | lv_op_2_4= '?*' | lv_op_2_5= '$/' | lv_op_2_6= '?/' ) ) ) ( (lv_rhs_3_0= ruleMultiplication ) ) )? ) | (otherlv_4= '(' this_Expr_5= ruleExpr otherlv_6= ')' ) ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        Token lv_op_2_5=null;
        Token lv_op_2_6=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_lhs_1_0 = null;

        EObject lv_rhs_3_0 = null;

        EObject this_Expr_5 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2720:28: ( ( ( () ( (lv_lhs_1_0= ruleBaseExp ) ) ( ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '$*' | lv_op_2_4= '?*' | lv_op_2_5= '$/' | lv_op_2_6= '?/' ) ) ) ( (lv_rhs_3_0= ruleMultiplication ) ) )? ) | (otherlv_4= '(' this_Expr_5= ruleExpr otherlv_6= ')' ) ) )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2721:1: ( ( () ( (lv_lhs_1_0= ruleBaseExp ) ) ( ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '$*' | lv_op_2_4= '?*' | lv_op_2_5= '$/' | lv_op_2_6= '?/' ) ) ) ( (lv_rhs_3_0= ruleMultiplication ) ) )? ) | (otherlv_4= '(' this_Expr_5= ruleExpr otherlv_6= ')' ) )
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2721:1: ( ( () ( (lv_lhs_1_0= ruleBaseExp ) ) ( ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '$*' | lv_op_2_4= '?*' | lv_op_2_5= '$/' | lv_op_2_6= '?/' ) ) ) ( (lv_rhs_3_0= ruleMultiplication ) ) )? ) | (otherlv_4= '(' this_Expr_5= ruleExpr otherlv_6= ')' ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( ((LA62_0>=RULE_ID && LA62_0<=RULE_INT)||(LA62_0>=17 && LA62_0<=18)||LA62_0==58) ) {
                alt62=1;
            }
            else if ( (LA62_0==24) ) {
                alt62=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2721:2: ( () ( (lv_lhs_1_0= ruleBaseExp ) ) ( ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '$*' | lv_op_2_4= '?*' | lv_op_2_5= '$/' | lv_op_2_6= '?/' ) ) ) ( (lv_rhs_3_0= ruleMultiplication ) ) )? )
                    {
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2721:2: ( () ( (lv_lhs_1_0= ruleBaseExp ) ) ( ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '$*' | lv_op_2_4= '?*' | lv_op_2_5= '$/' | lv_op_2_6= '?/' ) ) ) ( (lv_rhs_3_0= ruleMultiplication ) ) )? )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2721:3: () ( (lv_lhs_1_0= ruleBaseExp ) ) ( ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '$*' | lv_op_2_4= '?*' | lv_op_2_5= '$/' | lv_op_2_6= '?/' ) ) ) ( (lv_rhs_3_0= ruleMultiplication ) ) )?
                    {
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2721:3: ()
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2722:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getMultiplicationAccess().getBinOpAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2727:2: ( (lv_lhs_1_0= ruleBaseExp ) )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2728:1: (lv_lhs_1_0= ruleBaseExp )
                    {
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2728:1: (lv_lhs_1_0= ruleBaseExp )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2729:3: lv_lhs_1_0= ruleBaseExp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMultiplicationAccess().getLhsBaseExpParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBaseExp_in_ruleMultiplication5693);
                    lv_lhs_1_0=ruleBaseExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMultiplicationRule());
                      	        }
                             		set(
                             			current, 
                             			"lhs",
                              		lv_lhs_1_0, 
                              		"BaseExp");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2745:2: ( ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '$*' | lv_op_2_4= '?*' | lv_op_2_5= '$/' | lv_op_2_6= '?/' ) ) ) ( (lv_rhs_3_0= ruleMultiplication ) ) )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( ((LA61_0>=52 && LA61_0<=57)) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2745:3: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '$*' | lv_op_2_4= '?*' | lv_op_2_5= '$/' | lv_op_2_6= '?/' ) ) ) ( (lv_rhs_3_0= ruleMultiplication ) )
                            {
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2745:3: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '$*' | lv_op_2_4= '?*' | lv_op_2_5= '$/' | lv_op_2_6= '?/' ) ) )
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2746:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '$*' | lv_op_2_4= '?*' | lv_op_2_5= '$/' | lv_op_2_6= '?/' ) )
                            {
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2746:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '$*' | lv_op_2_4= '?*' | lv_op_2_5= '$/' | lv_op_2_6= '?/' ) )
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2747:1: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '$*' | lv_op_2_4= '?*' | lv_op_2_5= '$/' | lv_op_2_6= '?/' )
                            {
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2747:1: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '$*' | lv_op_2_4= '?*' | lv_op_2_5= '$/' | lv_op_2_6= '?/' )
                            int alt60=6;
                            switch ( input.LA(1) ) {
                            case 52:
                                {
                                alt60=1;
                                }
                                break;
                            case 53:
                                {
                                alt60=2;
                                }
                                break;
                            case 54:
                                {
                                alt60=3;
                                }
                                break;
                            case 55:
                                {
                                alt60=4;
                                }
                                break;
                            case 56:
                                {
                                alt60=5;
                                }
                                break;
                            case 57:
                                {
                                alt60=6;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 60, 0, input);

                                throw nvae;
                            }

                            switch (alt60) {
                                case 1 :
                                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2748:3: lv_op_2_1= '*'
                                    {
                                    lv_op_2_1=(Token)match(input,52,FOLLOW_52_in_ruleMultiplication5714); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              newLeafNode(lv_op_2_1, grammarAccess.getMultiplicationAccess().getOpAsteriskKeyword_0_2_0_0_0());
                                          
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getMultiplicationRule());
                                      	        }
                                             		setWithLastConsumed(current, "op", lv_op_2_1, null);
                                      	    
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2760:8: lv_op_2_2= '/'
                                    {
                                    lv_op_2_2=(Token)match(input,53,FOLLOW_53_in_ruleMultiplication5743); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              newLeafNode(lv_op_2_2, grammarAccess.getMultiplicationAccess().getOpSolidusKeyword_0_2_0_0_1());
                                          
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getMultiplicationRule());
                                      	        }
                                             		setWithLastConsumed(current, "op", lv_op_2_2, null);
                                      	    
                                    }

                                    }
                                    break;
                                case 3 :
                                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2772:8: lv_op_2_3= '$*'
                                    {
                                    lv_op_2_3=(Token)match(input,54,FOLLOW_54_in_ruleMultiplication5772); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              newLeafNode(lv_op_2_3, grammarAccess.getMultiplicationAccess().getOpDollarSignAsteriskKeyword_0_2_0_0_2());
                                          
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getMultiplicationRule());
                                      	        }
                                             		setWithLastConsumed(current, "op", lv_op_2_3, null);
                                      	    
                                    }

                                    }
                                    break;
                                case 4 :
                                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2784:8: lv_op_2_4= '?*'
                                    {
                                    lv_op_2_4=(Token)match(input,55,FOLLOW_55_in_ruleMultiplication5801); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              newLeafNode(lv_op_2_4, grammarAccess.getMultiplicationAccess().getOpQuestionMarkAsteriskKeyword_0_2_0_0_3());
                                          
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getMultiplicationRule());
                                      	        }
                                             		setWithLastConsumed(current, "op", lv_op_2_4, null);
                                      	    
                                    }

                                    }
                                    break;
                                case 5 :
                                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2796:8: lv_op_2_5= '$/'
                                    {
                                    lv_op_2_5=(Token)match(input,56,FOLLOW_56_in_ruleMultiplication5830); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              newLeafNode(lv_op_2_5, grammarAccess.getMultiplicationAccess().getOpDollarSignSolidusKeyword_0_2_0_0_4());
                                          
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getMultiplicationRule());
                                      	        }
                                             		setWithLastConsumed(current, "op", lv_op_2_5, null);
                                      	    
                                    }

                                    }
                                    break;
                                case 6 :
                                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2808:8: lv_op_2_6= '?/'
                                    {
                                    lv_op_2_6=(Token)match(input,57,FOLLOW_57_in_ruleMultiplication5859); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              newLeafNode(lv_op_2_6, grammarAccess.getMultiplicationAccess().getOpQuestionMarkSolidusKeyword_0_2_0_0_5());
                                          
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getMultiplicationRule());
                                      	        }
                                             		setWithLastConsumed(current, "op", lv_op_2_6, null);
                                      	    
                                    }

                                    }
                                    break;

                            }


                            }


                            }

                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2823:2: ( (lv_rhs_3_0= ruleMultiplication ) )
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2824:1: (lv_rhs_3_0= ruleMultiplication )
                            {
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2824:1: (lv_rhs_3_0= ruleMultiplication )
                            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2825:3: lv_rhs_3_0= ruleMultiplication
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getMultiplicationAccess().getRhsMultiplicationParserRuleCall_0_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleMultiplication_in_ruleMultiplication5896);
                            lv_rhs_3_0=ruleMultiplication();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getMultiplicationRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"rhs",
                                      		lv_rhs_3_0, 
                                      		"Multiplication");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2842:6: (otherlv_4= '(' this_Expr_5= ruleExpr otherlv_6= ')' )
                    {
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2842:6: (otherlv_4= '(' this_Expr_5= ruleExpr otherlv_6= ')' )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2842:8: otherlv_4= '(' this_Expr_5= ruleExpr otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleMultiplication5918); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getMultiplicationAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMultiplicationAccess().getExprParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleMultiplication5940);
                    this_Expr_5=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expr_5; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleMultiplication5951); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getMultiplicationAccess().getRightParenthesisKeyword_1_2());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRuleBaseExp"
    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2867:1: entryRuleBaseExp returns [EObject current=null] : iv_ruleBaseExp= ruleBaseExp EOF ;
    public final EObject entryRuleBaseExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseExp = null;


        try {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2868:2: (iv_ruleBaseExp= ruleBaseExp EOF )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2869:2: iv_ruleBaseExp= ruleBaseExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBaseExpRule()); 
            }
            pushFollow(FOLLOW_ruleBaseExp_in_entryRuleBaseExp5988);
            iv_ruleBaseExp=ruleBaseExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBaseExp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseExp5998); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBaseExp"


    // $ANTLR start "ruleBaseExp"
    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2876:1: ruleBaseExp returns [EObject current=null] : (this_VarRef_0= ruleVarRef | this_Constant_1= ruleConstant | this_DynamicValue_2= ruleDynamicValue ) ;
    public final EObject ruleBaseExp() throws RecognitionException {
        EObject current = null;

        EObject this_VarRef_0 = null;

        EObject this_Constant_1 = null;

        EObject this_DynamicValue_2 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2879:28: ( (this_VarRef_0= ruleVarRef | this_Constant_1= ruleConstant | this_DynamicValue_2= ruleDynamicValue ) )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2880:1: (this_VarRef_0= ruleVarRef | this_Constant_1= ruleConstant | this_DynamicValue_2= ruleDynamicValue )
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2880:1: (this_VarRef_0= ruleVarRef | this_Constant_1= ruleConstant | this_DynamicValue_2= ruleDynamicValue )
            int alt63=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 17:
            case 18:
                {
                alt63=1;
                }
                break;
            case RULE_INT:
                {
                alt63=2;
                }
                break;
            case 58:
                {
                alt63=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2881:5: this_VarRef_0= ruleVarRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBaseExpAccess().getVarRefParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVarRef_in_ruleBaseExp6045);
                    this_VarRef_0=ruleVarRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VarRef_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2891:5: this_Constant_1= ruleConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBaseExpAccess().getConstantParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConstant_in_ruleBaseExp6072);
                    this_Constant_1=ruleConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Constant_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2901:5: this_DynamicValue_2= ruleDynamicValue
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBaseExpAccess().getDynamicValueParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDynamicValue_in_ruleBaseExp6099);
                    this_DynamicValue_2=ruleDynamicValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DynamicValue_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBaseExp"


    // $ANTLR start "entryRuleVarRef"
    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2917:1: entryRuleVarRef returns [EObject current=null] : iv_ruleVarRef= ruleVarRef EOF ;
    public final EObject entryRuleVarRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarRef = null;


        try {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2918:2: (iv_ruleVarRef= ruleVarRef EOF )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2919:2: iv_ruleVarRef= ruleVarRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarRefRule()); 
            }
            pushFollow(FOLLOW_ruleVarRef_in_entryRuleVarRef6134);
            iv_ruleVarRef=ruleVarRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarRef6144); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVarRef"


    // $ANTLR start "ruleVarRef"
    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2926:1: ruleVarRef returns [EObject current=null] : ( ( (lv_bt_0_0= ruleBT ) )? ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVarRef() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_bt_0_0 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2929:28: ( ( ( (lv_bt_0_0= ruleBT ) )? ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2930:1: ( ( (lv_bt_0_0= ruleBT ) )? ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2930:1: ( ( (lv_bt_0_0= ruleBT ) )? ( (lv_name_1_0= RULE_ID ) ) )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2930:2: ( (lv_bt_0_0= ruleBT ) )? ( (lv_name_1_0= RULE_ID ) )
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2930:2: ( (lv_bt_0_0= ruleBT ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( ((LA64_0>=17 && LA64_0<=18)) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2931:1: (lv_bt_0_0= ruleBT )
                    {
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2931:1: (lv_bt_0_0= ruleBT )
                    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2932:3: lv_bt_0_0= ruleBT
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVarRefAccess().getBtBTParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBT_in_ruleVarRef6190);
                    lv_bt_0_0=ruleBT();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVarRefRule());
                      	        }
                             		set(
                             			current, 
                             			"bt",
                              		lv_bt_0_0, 
                              		"BT");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2948:3: ( (lv_name_1_0= RULE_ID ) )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2949:1: (lv_name_1_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2949:1: (lv_name_1_0= RULE_ID )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2950:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVarRef6208); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getVarRefAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVarRefRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleVarRef"


    // $ANTLR start "entryRuleConstant"
    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2974:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2975:2: (iv_ruleConstant= ruleConstant EOF )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2976:2: iv_ruleConstant= ruleConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantRule()); 
            }
            pushFollow(FOLLOW_ruleConstant_in_entryRuleConstant6249);
            iv_ruleConstant=ruleConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstant; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstant6259); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2983:1: ruleConstant returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2986:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2987:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2987:1: ( (lv_value_0_0= RULE_INT ) )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2988:1: (lv_value_0_0= RULE_INT )
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2988:1: (lv_value_0_0= RULE_INT )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2989:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleConstant6300); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getConstantAccess().getValueINTTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getConstantRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"INT");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleDynamicValue"
    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:3013:1: entryRuleDynamicValue returns [EObject current=null] : iv_ruleDynamicValue= ruleDynamicValue EOF ;
    public final EObject entryRuleDynamicValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDynamicValue = null;


        try {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:3014:2: (iv_ruleDynamicValue= ruleDynamicValue EOF )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:3015:2: iv_ruleDynamicValue= ruleDynamicValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDynamicValueRule()); 
            }
            pushFollow(FOLLOW_ruleDynamicValue_in_entryRuleDynamicValue6340);
            iv_ruleDynamicValue=ruleDynamicValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDynamicValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDynamicValue6350); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDynamicValue"


    // $ANTLR start "ruleDynamicValue"
    // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:3022:1: ruleDynamicValue returns [EObject current=null] : (otherlv_0= 'dynamic' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ')' ) ;
    public final EObject ruleDynamicValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:3025:28: ( (otherlv_0= 'dynamic' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ')' ) )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:3026:1: (otherlv_0= 'dynamic' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ')' )
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:3026:1: (otherlv_0= 'dynamic' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ')' )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:3026:3: otherlv_0= 'dynamic' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_58_in_ruleDynamicValue6387); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDynamicValueAccess().getDynamicKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleDynamicValue6399); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDynamicValueAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:3034:1: ( (otherlv_2= RULE_ID ) )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:3035:1: (otherlv_2= RULE_ID )
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:3035:1: (otherlv_2= RULE_ID )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:3036:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDynamicValueRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDynamicValue6419); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getDynamicValueAccess().getTypeTypeCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleDynamicValue6431); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDynamicValueAccess().getCommaKeyword_3());
                  
            }
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:3051:1: ( (lv_name_4_0= RULE_ID ) )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:3052:1: (lv_name_4_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:3052:1: (lv_name_4_0= RULE_ID )
            // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:3053:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDynamicValue6448); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_4_0, grammarAccess.getDynamicValueAccess().getNameIDTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDynamicValueRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_4_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleDynamicValue6465); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getDynamicValueAccess().getRightParenthesisKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDynamicValue"

    // $ANTLR start synpred1_InternalTJ
    public final void synpred1_InternalTJ_fragment() throws RecognitionException {   
        // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2094:6: ( '(' )
        // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2094:8: '('
        {
        match(input,24,FOLLOW_24_in_synpred1_InternalTJ4332); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalTJ

    // $ANTLR start synpred2_InternalTJ
    public final void synpred2_InternalTJ_fragment() throws RecognitionException {   
        // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2219:6: ( '(' )
        // ../dk.sdu.mmmi.tjep/src-gen/dk/sdu/mmmi/tjep/parser/antlr/internal/InternalTJ.g:2219:8: '('
        {
        match(input,24,FOLLOW_24_in_synpred2_InternalTJ4575); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalTJ

    // Delegated rules

    public final boolean synpred1_InternalTJ() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalTJ_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalTJ() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalTJ_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA23 dfa23 = new DFA23(this);
    static final String DFA23_eotS =
        "\20\uffff";
    static final String DFA23_eofS =
        "\20\uffff";
    static final String DFA23_minS =
        "\4\4\1\14\4\uffff\1\4\2\uffff\1\4\2\14\1\uffff";
    static final String DFA23_maxS =
        "\1\72\2\44\1\71\1\34\4\uffff\1\30\2\uffff\1\30\2\33\1\uffff";
    static final String DFA23_acceptS =
        "\5\uffff\1\4\1\5\1\6\1\7\1\uffff\1\1\1\2\3\uffff\1\3";
    static final String DFA23_specialS =
        "\20\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\3\1\10\13\uffff\1\1\1\2\5\uffff\1\10\4\uffff\1\4\1\5\1\uffff"+
            "\1\6\1\7\1\uffff\2\10\25\uffff\1\10",
            "\1\3\30\uffff\1\4\1\5\1\uffff\1\6\1\7\1\10\1\uffff\1\10",
            "\1\3\30\uffff\1\4\1\5\1\uffff\1\6\1\7\1\10\1\uffff\1\10",
            "\1\12\7\uffff\1\10\10\uffff\1\12\5\uffff\1\13\1\11\10\uffff"+
            "\25\10",
            "\1\10\17\uffff\1\14",
            "",
            "",
            "",
            "",
            "\1\15\23\uffff\1\10",
            "",
            "",
            "\1\16\23\uffff\1\10",
            "\1\10\10\uffff\1\10\2\uffff\1\10\2\uffff\1\17",
            "\1\10\10\uffff\1\10\2\uffff\1\10\2\uffff\1\17",
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "1000:1: (this_VarDecl_0= ruleVarDecl | this_LocalAssign_1= ruleLocalAssign | this_FieldAssign_2= ruleFieldAssign | this_Condition_3= ruleCondition | this_While_4= ruleWhile | this_Return_5= ruleReturn | this_SingleExpr_6= ruleSingleExpr )";
        }
    }
 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleProgram122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProgram139 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProgram156 = new BitSet(new long[]{0x0000000000182002L});
    public static final BitSet FOLLOW_ruleScenario_in_ruleProgram177 = new BitSet(new long[]{0x0000000000182002L});
    public static final BitSet FOLLOW_ruleType_in_ruleProgram199 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_ruleScenario_in_entryRuleScenario236 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScenario246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleScenario283 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleScenario300 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleScenario317 = new BitSet(new long[]{0x0400001B61068030L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleScenario338 = new BitSet(new long[]{0x0400001B61068030L});
    public static final BitSet FOLLOW_15_in_ruleScenario351 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleScenario364 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleScenario376 = new BitSet(new long[]{0x0400001B61068030L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleScenario397 = new BitSet(new long[]{0x0400001B61068030L});
    public static final BitSet FOLLOW_15_in_ruleScenario410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBT_in_entryRuleBT448 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBT458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleBT505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleBT534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType571 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_ruleType628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClazz_in_ruleType655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_entryRulePrimitive690 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitive700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rulePrimitive737 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimitive754 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePrimitive771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClazz_in_entryRuleClazz807 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClazz817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleClazz854 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClazz871 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleClazz889 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleClazz906 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleClazz925 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClazz945 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleClazz957 = new BitSet(new long[]{0x0000000000868010L});
    public static final BitSet FOLLOW_ruleMember_in_ruleClazz978 = new BitSet(new long[]{0x0000000000868010L});
    public static final BitSet FOLLOW_15_in_ruleClazz991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_entryRuleMember1027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMember1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_ruleMember1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleMember1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructor_in_ruleMember1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField1173 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBT_in_ruleField1229 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_23_in_ruleField1248 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleField1282 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleField1299 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleField1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod1352 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBT_in_ruleMethod1408 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethod1429 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethod1446 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_21_in_ruleMethod1464 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleMethod1481 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleMethod1500 = new BitSet(new long[]{0x0000000004060010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleMethod1522 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_25_in_ruleMethod1535 = new BitSet(new long[]{0x0000000000060010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleMethod1556 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_26_in_ruleMethod1572 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMethod1584 = new BitSet(new long[]{0x0400001B61068030L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleMethod1605 = new BitSet(new long[]{0x0400001B61068030L});
    public static final BitSet FOLLOW_15_in_ruleMethod1618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter1654 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBT_in_ruleParameter1710 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter1731 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructor_in_entryRuleConstructor1789 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstructor1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBT_in_ruleConstructor1845 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstructor1866 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleConstructor1878 = new BitSet(new long[]{0x0000000004060010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleConstructor1900 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_25_in_ruleConstructor1913 = new BitSet(new long[]{0x0000000000060010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleConstructor1934 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_26_in_ruleConstructor1950 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleConstructor1962 = new BitSet(new long[]{0x0400001B61068030L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleConstructor1983 = new BitSet(new long[]{0x0400001B61068030L});
    public static final BitSet FOLLOW_15_in_ruleConstructor1996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement2032 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement2042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDecl_in_ruleStatement2089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalAssign_in_ruleStatement2116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldAssign_in_ruleStatement2143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleStatement2170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_in_ruleStatement2197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturn_in_ruleStatement2224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleExpr_in_ruleStatement2251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDecl_in_entryRuleVarDecl2286 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarDecl2296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBT_in_ruleVarDecl2342 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVarDecl2363 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_21_in_ruleVarDecl2376 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVarDecl2393 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVarDecl2417 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleVarDecl2434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalAssign_in_entryRuleLocalAssign2470 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalAssign2480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBT_in_ruleLocalAssign2526 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLocalAssign2544 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleLocalAssign2561 = new BitSet(new long[]{0x0400001B61060030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleLocalAssign2582 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleLocalAssign2594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldAssign_in_entryRuleFieldAssign2630 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldAssign2640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBT_in_ruleFieldAssign2687 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFieldAssign2705 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleFieldAssign2722 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFieldAssign2739 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleFieldAssign2756 = new BitSet(new long[]{0x0400001B61060030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleFieldAssign2777 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFieldAssign2789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBT_in_ruleFieldAssign2818 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleFieldAssign2831 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleFieldAssign2843 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFieldAssign2860 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleFieldAssign2877 = new BitSet(new long[]{0x0400001B61060030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleFieldAssign2898 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFieldAssign2910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition2947 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition2957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBT_in_ruleCondition3003 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleCondition3016 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleCondition3028 = new BitSet(new long[]{0x0400001B61060030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleCondition3049 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleCondition3061 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCondition3073 = new BitSet(new long[]{0x0400001B61068030L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleCondition3094 = new BitSet(new long[]{0x0400001B61068030L});
    public static final BitSet FOLLOW_15_in_ruleCondition3107 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleCondition3119 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCondition3131 = new BitSet(new long[]{0x0400001B61068030L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleCondition3152 = new BitSet(new long[]{0x0400001B61068030L});
    public static final BitSet FOLLOW_15_in_ruleCondition3165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_in_entryRuleWhile3201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhile3211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBT_in_ruleWhile3257 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleWhile3270 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleWhile3282 = new BitSet(new long[]{0x0400001B61060030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleWhile3303 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleWhile3315 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleWhile3327 = new BitSet(new long[]{0x0400001B61068030L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleWhile3348 = new BitSet(new long[]{0x0400001B61068030L});
    public static final BitSet FOLLOW_15_in_ruleWhile3361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturn_in_entryRuleReturn3397 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturn3407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBT_in_ruleReturn3453 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleReturn3466 = new BitSet(new long[]{0x0400001B61060030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleReturn3487 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleReturn3499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleExpr_in_entryRuleSingleExpr3535 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleExpr3545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBT_in_ruleSingleExpr3592 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleSingleExpr3604 = new BitSet(new long[]{0x0400001B61060030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleSingleExpr3627 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSingleExpr3639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_entryRuleExpr3675 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpr3685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotatedExpr_in_ruleExpr3732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithExp_in_ruleExpr3759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiftExp_in_ruleExpr3786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiftExp_in_entryRuleLiftExp3821 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiftExp3831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleLiftExp3868 = new BitSet(new long[]{0x0400001B61060030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleLiftExp3889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotatedExpr_in_entryRuleAnnotatedExpr3925 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotatedExpr3935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBT_in_ruleAnnotatedExpr3982 = new BitSet(new long[]{0x0000000020060010L});
    public static final BitSet FOLLOW_ruleObjectOp_in_ruleAnnotatedExpr4004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBT_in_ruleAnnotatedExpr4042 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAnnotatedExpr4055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBT_in_ruleAnnotatedExpr4084 = new BitSet(new long[]{0x0000001020060010L});
    public static final BitSet FOLLOW_ruleInstantiation_in_ruleAnnotatedExpr4106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectOp_in_entryRuleObjectOp4143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectOp4153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjectOp4196 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleObjectOp4213 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_24_in_ruleObjectOp4226 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjectOp4246 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleObjectOp4258 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjectOp4277 = new BitSet(new long[]{0x0000000001200002L});
    public static final BitSet FOLLOW_21_in_ruleObjectOp4295 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleObjectOp4312 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleObjectOp4340 = new BitSet(new long[]{0x0400001B65060030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleObjectOp4372 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_25_in_ruleObjectOp4385 = new BitSet(new long[]{0x0400001B61060030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleObjectOp4406 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_26_in_ruleObjectOp4422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleObjectOp4444 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleObjectOp4456 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_24_in_ruleObjectOp4469 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjectOp4489 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleObjectOp4501 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjectOp4520 = new BitSet(new long[]{0x0000000001200002L});
    public static final BitSet FOLLOW_21_in_ruleObjectOp4538 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleObjectOp4555 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleObjectOp4583 = new BitSet(new long[]{0x0400001B65060030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleObjectOp4615 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_25_in_ruleObjectOp4628 = new BitSet(new long[]{0x0400001B61060030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleObjectOp4649 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_26_in_ruleObjectOp4665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstantiation_in_entryRuleInstantiation4704 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstantiation4714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleInstantiation4751 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInstantiation4771 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_21_in_ruleInstantiation4784 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleInstantiation4801 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleInstantiation4820 = new BitSet(new long[]{0x0400001B65060030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleInstantiation4842 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_25_in_ruleInstantiation4855 = new BitSet(new long[]{0x0400001B61060030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleInstantiation4876 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_26_in_ruleInstantiation4892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithExp_in_entryRuleArithExp4928 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArithExp4938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleArithExp4993 = new BitSet(new long[]{0x00003FE000000002L});
    public static final BitSet FOLLOW_37_in_ruleArithExp5014 = new BitSet(new long[]{0x0400000001060030L});
    public static final BitSet FOLLOW_38_in_ruleArithExp5043 = new BitSet(new long[]{0x0400000001060030L});
    public static final BitSet FOLLOW_39_in_ruleArithExp5072 = new BitSet(new long[]{0x0400000001060030L});
    public static final BitSet FOLLOW_40_in_ruleArithExp5101 = new BitSet(new long[]{0x0400000001060030L});
    public static final BitSet FOLLOW_41_in_ruleArithExp5130 = new BitSet(new long[]{0x0400000001060030L});
    public static final BitSet FOLLOW_42_in_ruleArithExp5159 = new BitSet(new long[]{0x0400000001060030L});
    public static final BitSet FOLLOW_43_in_ruleArithExp5188 = new BitSet(new long[]{0x0400000001060030L});
    public static final BitSet FOLLOW_44_in_ruleArithExp5217 = new BitSet(new long[]{0x0400000001060030L});
    public static final BitSet FOLLOW_45_in_ruleArithExp5246 = new BitSet(new long[]{0x0400000001060030L});
    public static final BitSet FOLLOW_ruleArithExp_in_ruleArithExp5283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition5321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition5331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition5386 = new BitSet(new long[]{0x000FC00000000002L});
    public static final BitSet FOLLOW_46_in_ruleAddition5407 = new BitSet(new long[]{0x0400000001060030L});
    public static final BitSet FOLLOW_47_in_ruleAddition5436 = new BitSet(new long[]{0x0400000001060030L});
    public static final BitSet FOLLOW_48_in_ruleAddition5465 = new BitSet(new long[]{0x0400000001060030L});
    public static final BitSet FOLLOW_49_in_ruleAddition5494 = new BitSet(new long[]{0x0400000001060030L});
    public static final BitSet FOLLOW_50_in_ruleAddition5523 = new BitSet(new long[]{0x0400000001060030L});
    public static final BitSet FOLLOW_51_in_ruleAddition5552 = new BitSet(new long[]{0x0400000001060030L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleAddition5589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication5627 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication5637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseExp_in_ruleMultiplication5693 = new BitSet(new long[]{0x03F0000000000002L});
    public static final BitSet FOLLOW_52_in_ruleMultiplication5714 = new BitSet(new long[]{0x0400000001060030L});
    public static final BitSet FOLLOW_53_in_ruleMultiplication5743 = new BitSet(new long[]{0x0400000001060030L});
    public static final BitSet FOLLOW_54_in_ruleMultiplication5772 = new BitSet(new long[]{0x0400000001060030L});
    public static final BitSet FOLLOW_55_in_ruleMultiplication5801 = new BitSet(new long[]{0x0400000001060030L});
    public static final BitSet FOLLOW_56_in_ruleMultiplication5830 = new BitSet(new long[]{0x0400000001060030L});
    public static final BitSet FOLLOW_57_in_ruleMultiplication5859 = new BitSet(new long[]{0x0400000001060030L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleMultiplication5896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleMultiplication5918 = new BitSet(new long[]{0x0400001B61060030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleMultiplication5940 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleMultiplication5951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseExp_in_entryRuleBaseExp5988 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseExp5998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarRef_in_ruleBaseExp6045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleBaseExp6072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDynamicValue_in_ruleBaseExp6099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarRef_in_entryRuleVarRef6134 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarRef6144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBT_in_ruleVarRef6190 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVarRef6208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant6249 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstant6259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleConstant6300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDynamicValue_in_entryRuleDynamicValue6340 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDynamicValue6350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleDynamicValue6387 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleDynamicValue6399 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDynamicValue6419 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleDynamicValue6431 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDynamicValue6448 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleDynamicValue6465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred1_InternalTJ4332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred2_InternalTJ4575 = new BitSet(new long[]{0x0000000000000002L});

}