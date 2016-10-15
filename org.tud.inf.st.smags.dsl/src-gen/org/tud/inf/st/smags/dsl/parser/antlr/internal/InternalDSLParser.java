package org.tud.inf.st.smags.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.tud.inf.st.smags.dsl.services.DSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'imports'", "'{'", "'}'", "';'", "'MetaArchitecture'", "'start'", "'with'", "'Type'", "':'", "'('", "','", "')'", "'ComponentType'", "'provides'", "'PortType'", "'RoleModel'", "'bind'", "'role'", "'to'", "'Architecture'", "'::'", "'Component'", "'Port'", "'='"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDSL.g"; }



     	private DSLGrammarAccess grammarAccess;

        public InternalDSLParser(TokenStream input, DSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "SmagsModel";
       	}

       	@Override
       	protected DSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSmagsModel"
    // InternalDSL.g:64:1: entryRuleSmagsModel returns [EObject current=null] : iv_ruleSmagsModel= ruleSmagsModel EOF ;
    public final EObject entryRuleSmagsModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSmagsModel = null;


        try {
            // InternalDSL.g:64:51: (iv_ruleSmagsModel= ruleSmagsModel EOF )
            // InternalDSL.g:65:2: iv_ruleSmagsModel= ruleSmagsModel EOF
            {
             newCompositeNode(grammarAccess.getSmagsModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSmagsModel=ruleSmagsModel();

            state._fsp--;

             current =iv_ruleSmagsModel; 
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
    // $ANTLR end "entryRuleSmagsModel"


    // $ANTLR start "ruleSmagsModel"
    // InternalDSL.g:71:1: ruleSmagsModel returns [EObject current=null] : ( () (otherlv_1= 'imports' otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* otherlv_4= '}' )? ( (lv_elements_5_0= ruleSmagsElement ) )* ) ;
    public final EObject ruleSmagsModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_imports_3_0 = null;

        EObject lv_elements_5_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:77:2: ( ( () (otherlv_1= 'imports' otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* otherlv_4= '}' )? ( (lv_elements_5_0= ruleSmagsElement ) )* ) )
            // InternalDSL.g:78:2: ( () (otherlv_1= 'imports' otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* otherlv_4= '}' )? ( (lv_elements_5_0= ruleSmagsElement ) )* )
            {
            // InternalDSL.g:78:2: ( () (otherlv_1= 'imports' otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* otherlv_4= '}' )? ( (lv_elements_5_0= ruleSmagsElement ) )* )
            // InternalDSL.g:79:3: () (otherlv_1= 'imports' otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* otherlv_4= '}' )? ( (lv_elements_5_0= ruleSmagsElement ) )*
            {
            // InternalDSL.g:79:3: ()
            // InternalDSL.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSmagsModelAccess().getSmagsModelAction_0(),
            					current);
            			

            }

            // InternalDSL.g:86:3: (otherlv_1= 'imports' otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* otherlv_4= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDSL.g:87:4: otherlv_1= 'imports' otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* otherlv_4= '}'
                    {
                    otherlv_1=(Token)match(input,11,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getSmagsModelAccess().getImportsKeyword_1_0());
                    			
                    otherlv_2=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getSmagsModelAccess().getLeftCurlyBracketKeyword_1_1());
                    			
                    // InternalDSL.g:95:4: ( (lv_imports_3_0= ruleImport ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==RULE_STRING) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalDSL.g:96:5: (lv_imports_3_0= ruleImport )
                    	    {
                    	    // InternalDSL.g:96:5: (lv_imports_3_0= ruleImport )
                    	    // InternalDSL.g:97:6: lv_imports_3_0= ruleImport
                    	    {

                    	    						newCompositeNode(grammarAccess.getSmagsModelAccess().getImportsImportParserRuleCall_1_2_0());
                    	    					
                    	    pushFollow(FOLLOW_4);
                    	    lv_imports_3_0=ruleImport();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getSmagsModelRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"imports",
                    	    							lv_imports_3_0,
                    	    							"org.tud.inf.st.smags.dsl.DSL.Import");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getSmagsModelAccess().getRightCurlyBracketKeyword_1_3());
                    			

                    }
                    break;

            }

            // InternalDSL.g:119:3: ( (lv_elements_5_0= ruleSmagsElement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15||LA3_0==30) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDSL.g:120:4: (lv_elements_5_0= ruleSmagsElement )
            	    {
            	    // InternalDSL.g:120:4: (lv_elements_5_0= ruleSmagsElement )
            	    // InternalDSL.g:121:5: lv_elements_5_0= ruleSmagsElement
            	    {

            	    					newCompositeNode(grammarAccess.getSmagsModelAccess().getElementsSmagsElementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_elements_5_0=ruleSmagsElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSmagsModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_5_0,
            	    						"org.tud.inf.st.smags.dsl.DSL.SmagsElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


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
    // $ANTLR end "ruleSmagsModel"


    // $ANTLR start "entryRuleSmagsElement"
    // InternalDSL.g:142:1: entryRuleSmagsElement returns [EObject current=null] : iv_ruleSmagsElement= ruleSmagsElement EOF ;
    public final EObject entryRuleSmagsElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSmagsElement = null;


        try {
            // InternalDSL.g:142:53: (iv_ruleSmagsElement= ruleSmagsElement EOF )
            // InternalDSL.g:143:2: iv_ruleSmagsElement= ruleSmagsElement EOF
            {
             newCompositeNode(grammarAccess.getSmagsElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSmagsElement=ruleSmagsElement();

            state._fsp--;

             current =iv_ruleSmagsElement; 
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
    // $ANTLR end "entryRuleSmagsElement"


    // $ANTLR start "ruleSmagsElement"
    // InternalDSL.g:149:1: ruleSmagsElement returns [EObject current=null] : (this_MetaArchitecture_0= ruleMetaArchitecture | this_Architecture_1= ruleArchitecture ) ;
    public final EObject ruleSmagsElement() throws RecognitionException {
        EObject current = null;

        EObject this_MetaArchitecture_0 = null;

        EObject this_Architecture_1 = null;



        	enterRule();

        try {
            // InternalDSL.g:155:2: ( (this_MetaArchitecture_0= ruleMetaArchitecture | this_Architecture_1= ruleArchitecture ) )
            // InternalDSL.g:156:2: (this_MetaArchitecture_0= ruleMetaArchitecture | this_Architecture_1= ruleArchitecture )
            {
            // InternalDSL.g:156:2: (this_MetaArchitecture_0= ruleMetaArchitecture | this_Architecture_1= ruleArchitecture )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            else if ( (LA4_0==30) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDSL.g:157:3: this_MetaArchitecture_0= ruleMetaArchitecture
                    {

                    			newCompositeNode(grammarAccess.getSmagsElementAccess().getMetaArchitectureParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MetaArchitecture_0=ruleMetaArchitecture();

                    state._fsp--;


                    			current = this_MetaArchitecture_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDSL.g:166:3: this_Architecture_1= ruleArchitecture
                    {

                    			newCompositeNode(grammarAccess.getSmagsElementAccess().getArchitectureParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Architecture_1=ruleArchitecture();

                    state._fsp--;


                    			current = this_Architecture_1;
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
    // $ANTLR end "ruleSmagsElement"


    // $ANTLR start "entryRuleImport"
    // InternalDSL.g:178:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalDSL.g:178:47: (iv_ruleImport= ruleImport EOF )
            // InternalDSL.g:179:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalDSL.g:185:1: ruleImport returns [EObject current=null] : ( ( (lv_importURI_0_0= RULE_STRING ) ) otherlv_1= ';' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token lv_importURI_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDSL.g:191:2: ( ( ( (lv_importURI_0_0= RULE_STRING ) ) otherlv_1= ';' ) )
            // InternalDSL.g:192:2: ( ( (lv_importURI_0_0= RULE_STRING ) ) otherlv_1= ';' )
            {
            // InternalDSL.g:192:2: ( ( (lv_importURI_0_0= RULE_STRING ) ) otherlv_1= ';' )
            // InternalDSL.g:193:3: ( (lv_importURI_0_0= RULE_STRING ) ) otherlv_1= ';'
            {
            // InternalDSL.g:193:3: ( (lv_importURI_0_0= RULE_STRING ) )
            // InternalDSL.g:194:4: (lv_importURI_0_0= RULE_STRING )
            {
            // InternalDSL.g:194:4: (lv_importURI_0_0= RULE_STRING )
            // InternalDSL.g:195:5: lv_importURI_0_0= RULE_STRING
            {
            lv_importURI_0_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_importURI_0_0, grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImportRule());
            					}
            					setWithLastConsumed(
            						current,
            						"importURI",
            						lv_importURI_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getImportAccess().getSemicolonKeyword_1());
            		

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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleMetaArchitecture"
    // InternalDSL.g:219:1: entryRuleMetaArchitecture returns [EObject current=null] : iv_ruleMetaArchitecture= ruleMetaArchitecture EOF ;
    public final EObject entryRuleMetaArchitecture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaArchitecture = null;


        try {
            // InternalDSL.g:219:57: (iv_ruleMetaArchitecture= ruleMetaArchitecture EOF )
            // InternalDSL.g:220:2: iv_ruleMetaArchitecture= ruleMetaArchitecture EOF
            {
             newCompositeNode(grammarAccess.getMetaArchitectureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetaArchitecture=ruleMetaArchitecture();

            state._fsp--;

             current =iv_ruleMetaArchitecture; 
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
    // $ANTLR end "entryRuleMetaArchitecture"


    // $ANTLR start "ruleMetaArchitecture"
    // InternalDSL.g:226:1: ruleMetaArchitecture returns [EObject current=null] : (otherlv_0= 'MetaArchitecture' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_types_3_0= ruleType ) )* otherlv_4= '}' otherlv_5= '{' ( (lv_elements_6_0= ruleMetaArchitectureElement ) )* otherlv_7= '}' (otherlv_8= 'start' otherlv_9= 'with' ( ( ruleEString ) ) )? ) ;
    public final EObject ruleMetaArchitecture() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_types_3_0 = null;

        EObject lv_elements_6_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:232:2: ( (otherlv_0= 'MetaArchitecture' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_types_3_0= ruleType ) )* otherlv_4= '}' otherlv_5= '{' ( (lv_elements_6_0= ruleMetaArchitectureElement ) )* otherlv_7= '}' (otherlv_8= 'start' otherlv_9= 'with' ( ( ruleEString ) ) )? ) )
            // InternalDSL.g:233:2: (otherlv_0= 'MetaArchitecture' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_types_3_0= ruleType ) )* otherlv_4= '}' otherlv_5= '{' ( (lv_elements_6_0= ruleMetaArchitectureElement ) )* otherlv_7= '}' (otherlv_8= 'start' otherlv_9= 'with' ( ( ruleEString ) ) )? )
            {
            // InternalDSL.g:233:2: (otherlv_0= 'MetaArchitecture' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_types_3_0= ruleType ) )* otherlv_4= '}' otherlv_5= '{' ( (lv_elements_6_0= ruleMetaArchitectureElement ) )* otherlv_7= '}' (otherlv_8= 'start' otherlv_9= 'with' ( ( ruleEString ) ) )? )
            // InternalDSL.g:234:3: otherlv_0= 'MetaArchitecture' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_types_3_0= ruleType ) )* otherlv_4= '}' otherlv_5= '{' ( (lv_elements_6_0= ruleMetaArchitectureElement ) )* otherlv_7= '}' (otherlv_8= 'start' otherlv_9= 'with' ( ( ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getMetaArchitectureAccess().getMetaArchitectureKeyword_0());
            		
            // InternalDSL.g:238:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDSL.g:239:4: (lv_name_1_0= ruleEString )
            {
            // InternalDSL.g:239:4: (lv_name_1_0= ruleEString )
            // InternalDSL.g:240:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMetaArchitectureAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMetaArchitectureRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.tud.inf.st.smags.dsl.DSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getMetaArchitectureAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDSL.g:261:3: ( (lv_types_3_0= ruleType ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDSL.g:262:4: (lv_types_3_0= ruleType )
            	    {
            	    // InternalDSL.g:262:4: (lv_types_3_0= ruleType )
            	    // InternalDSL.g:263:5: lv_types_3_0= ruleType
            	    {

            	    					newCompositeNode(grammarAccess.getMetaArchitectureAccess().getTypesTypeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_types_3_0=ruleType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMetaArchitectureRule());
            	    					}
            	    					add(
            	    						current,
            	    						"types",
            	    						lv_types_3_0,
            	    						"org.tud.inf.st.smags.dsl.DSL.Type");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getMetaArchitectureAccess().getRightCurlyBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getMetaArchitectureAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalDSL.g:288:3: ( (lv_elements_6_0= ruleMetaArchitectureElement ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23||(LA6_0>=25 && LA6_0<=26)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDSL.g:289:4: (lv_elements_6_0= ruleMetaArchitectureElement )
            	    {
            	    // InternalDSL.g:289:4: (lv_elements_6_0= ruleMetaArchitectureElement )
            	    // InternalDSL.g:290:5: lv_elements_6_0= ruleMetaArchitectureElement
            	    {

            	    					newCompositeNode(grammarAccess.getMetaArchitectureAccess().getElementsMetaArchitectureElementParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_elements_6_0=ruleMetaArchitectureElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMetaArchitectureRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_6_0,
            	    						"org.tud.inf.st.smags.dsl.DSL.MetaArchitectureElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getMetaArchitectureAccess().getRightCurlyBracketKeyword_7());
            		
            // InternalDSL.g:311:3: (otherlv_8= 'start' otherlv_9= 'with' ( ( ruleEString ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDSL.g:312:4: otherlv_8= 'start' otherlv_9= 'with' ( ( ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,16,FOLLOW_11); 

                    				newLeafNode(otherlv_8, grammarAccess.getMetaArchitectureAccess().getStartKeyword_8_0());
                    			
                    otherlv_9=(Token)match(input,17,FOLLOW_7); 

                    				newLeafNode(otherlv_9, grammarAccess.getMetaArchitectureAccess().getWithKeyword_8_1());
                    			
                    // InternalDSL.g:320:4: ( ( ruleEString ) )
                    // InternalDSL.g:321:5: ( ruleEString )
                    {
                    // InternalDSL.g:321:5: ( ruleEString )
                    // InternalDSL.g:322:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMetaArchitectureRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMetaArchitectureAccess().getInitialRoleModelRoleModelCrossReference_8_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleMetaArchitecture"


    // $ANTLR start "entryRuleMetaArchitectureElement"
    // InternalDSL.g:341:1: entryRuleMetaArchitectureElement returns [EObject current=null] : iv_ruleMetaArchitectureElement= ruleMetaArchitectureElement EOF ;
    public final EObject entryRuleMetaArchitectureElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaArchitectureElement = null;


        try {
            // InternalDSL.g:341:64: (iv_ruleMetaArchitectureElement= ruleMetaArchitectureElement EOF )
            // InternalDSL.g:342:2: iv_ruleMetaArchitectureElement= ruleMetaArchitectureElement EOF
            {
             newCompositeNode(grammarAccess.getMetaArchitectureElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetaArchitectureElement=ruleMetaArchitectureElement();

            state._fsp--;

             current =iv_ruleMetaArchitectureElement; 
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
    // $ANTLR end "entryRuleMetaArchitectureElement"


    // $ANTLR start "ruleMetaArchitectureElement"
    // InternalDSL.g:348:1: ruleMetaArchitectureElement returns [EObject current=null] : (this_ComponentType_0= ruleComponentType | this_PortType_1= rulePortType | this_RoleModel_2= ruleRoleModel ) ;
    public final EObject ruleMetaArchitectureElement() throws RecognitionException {
        EObject current = null;

        EObject this_ComponentType_0 = null;

        EObject this_PortType_1 = null;

        EObject this_RoleModel_2 = null;



        	enterRule();

        try {
            // InternalDSL.g:354:2: ( (this_ComponentType_0= ruleComponentType | this_PortType_1= rulePortType | this_RoleModel_2= ruleRoleModel ) )
            // InternalDSL.g:355:2: (this_ComponentType_0= ruleComponentType | this_PortType_1= rulePortType | this_RoleModel_2= ruleRoleModel )
            {
            // InternalDSL.g:355:2: (this_ComponentType_0= ruleComponentType | this_PortType_1= rulePortType | this_RoleModel_2= ruleRoleModel )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt8=1;
                }
                break;
            case 25:
                {
                alt8=2;
                }
                break;
            case 26:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalDSL.g:356:3: this_ComponentType_0= ruleComponentType
                    {

                    			newCompositeNode(grammarAccess.getMetaArchitectureElementAccess().getComponentTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComponentType_0=ruleComponentType();

                    state._fsp--;


                    			current = this_ComponentType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDSL.g:365:3: this_PortType_1= rulePortType
                    {

                    			newCompositeNode(grammarAccess.getMetaArchitectureElementAccess().getPortTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PortType_1=rulePortType();

                    state._fsp--;


                    			current = this_PortType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDSL.g:374:3: this_RoleModel_2= ruleRoleModel
                    {

                    			newCompositeNode(grammarAccess.getMetaArchitectureElementAccess().getRoleModelParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_RoleModel_2=ruleRoleModel();

                    state._fsp--;


                    			current = this_RoleModel_2;
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
    // $ANTLR end "ruleMetaArchitectureElement"


    // $ANTLR start "entryRuleType"
    // InternalDSL.g:386:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalDSL.g:386:45: (iv_ruleType= ruleType EOF )
            // InternalDSL.g:387:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalDSL.g:393:1: ruleType returns [EObject current=null] : (otherlv_0= 'Type' otherlv_1= ':' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ';' ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:399:2: ( (otherlv_0= 'Type' otherlv_1= ':' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ';' ) )
            // InternalDSL.g:400:2: (otherlv_0= 'Type' otherlv_1= ':' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ';' )
            {
            // InternalDSL.g:400:2: (otherlv_0= 'Type' otherlv_1= ':' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ';' )
            // InternalDSL.g:401:3: otherlv_0= 'Type' otherlv_1= ':' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeAccess().getTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getTypeAccess().getColonKeyword_1());
            		
            // InternalDSL.g:409:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDSL.g:410:4: (lv_name_2_0= ruleEString )
            {
            // InternalDSL.g:410:4: (lv_name_2_0= ruleEString )
            // InternalDSL.g:411:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTypeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.tud.inf.st.smags.dsl.DSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getTypeAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleVariable"
    // InternalDSL.g:436:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalDSL.g:436:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalDSL.g:437:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalDSL.g:443:1: ruleVariable returns [EObject current=null] : ( ( (lv_type_0_0= ruleTypeUse ) ) ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        EObject lv_type_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:449:2: ( ( ( (lv_type_0_0= ruleTypeUse ) ) ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalDSL.g:450:2: ( ( (lv_type_0_0= ruleTypeUse ) ) ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalDSL.g:450:2: ( ( (lv_type_0_0= ruleTypeUse ) ) ( (lv_name_1_0= ruleEString ) ) )
            // InternalDSL.g:451:3: ( (lv_type_0_0= ruleTypeUse ) ) ( (lv_name_1_0= ruleEString ) )
            {
            // InternalDSL.g:451:3: ( (lv_type_0_0= ruleTypeUse ) )
            // InternalDSL.g:452:4: (lv_type_0_0= ruleTypeUse )
            {
            // InternalDSL.g:452:4: (lv_type_0_0= ruleTypeUse )
            // InternalDSL.g:453:5: lv_type_0_0= ruleTypeUse
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getTypeTypeUseParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_type_0_0=ruleTypeUse();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"org.tud.inf.st.smags.dsl.DSL.TypeUse");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDSL.g:470:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDSL.g:471:4: (lv_name_1_0= ruleEString )
            {
            // InternalDSL.g:471:4: (lv_name_1_0= ruleEString )
            // InternalDSL.g:472:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.tud.inf.st.smags.dsl.DSL.EString");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleMethod"
    // InternalDSL.g:493:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalDSL.g:493:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalDSL.g:494:2: iv_ruleMethod= ruleMethod EOF
            {
             newCompositeNode(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethod=ruleMethod();

            state._fsp--;

             current =iv_ruleMethod; 
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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalDSL.g:500:1: ruleMethod returns [EObject current=null] : ( ( (lv_returnType_0_0= ruleTypeUse ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleVariable ) ) )* )? otherlv_6= ')' ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_returnType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_args_3_0 = null;

        EObject lv_args_5_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:506:2: ( ( ( (lv_returnType_0_0= ruleTypeUse ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleVariable ) ) )* )? otherlv_6= ')' ) )
            // InternalDSL.g:507:2: ( ( (lv_returnType_0_0= ruleTypeUse ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleVariable ) ) )* )? otherlv_6= ')' )
            {
            // InternalDSL.g:507:2: ( ( (lv_returnType_0_0= ruleTypeUse ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleVariable ) ) )* )? otherlv_6= ')' )
            // InternalDSL.g:508:3: ( (lv_returnType_0_0= ruleTypeUse ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleVariable ) ) )* )? otherlv_6= ')'
            {
            // InternalDSL.g:508:3: ( (lv_returnType_0_0= ruleTypeUse ) )
            // InternalDSL.g:509:4: (lv_returnType_0_0= ruleTypeUse )
            {
            // InternalDSL.g:509:4: (lv_returnType_0_0= ruleTypeUse )
            // InternalDSL.g:510:5: lv_returnType_0_0= ruleTypeUse
            {

            					newCompositeNode(grammarAccess.getMethodAccess().getReturnTypeTypeUseParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_returnType_0_0=ruleTypeUse();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMethodRule());
            					}
            					set(
            						current,
            						"returnType",
            						lv_returnType_0_0,
            						"org.tud.inf.st.smags.dsl.DSL.TypeUse");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDSL.g:527:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDSL.g:528:4: (lv_name_1_0= ruleEString )
            {
            // InternalDSL.g:528:4: (lv_name_1_0= ruleEString )
            // InternalDSL.g:529:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMethodAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMethodRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.tud.inf.st.smags.dsl.DSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2());
            		
            // InternalDSL.g:550:3: ( ( (lv_args_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleVariable ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_ID)||LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDSL.g:551:4: ( (lv_args_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleVariable ) ) )*
                    {
                    // InternalDSL.g:551:4: ( (lv_args_3_0= ruleVariable ) )
                    // InternalDSL.g:552:5: (lv_args_3_0= ruleVariable )
                    {
                    // InternalDSL.g:552:5: (lv_args_3_0= ruleVariable )
                    // InternalDSL.g:553:6: lv_args_3_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getMethodAccess().getArgsVariableParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_args_3_0=ruleVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMethodRule());
                    						}
                    						add(
                    							current,
                    							"args",
                    							lv_args_3_0,
                    							"org.tud.inf.st.smags.dsl.DSL.Variable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:570:4: (otherlv_4= ',' ( (lv_args_5_0= ruleVariable ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==21) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalDSL.g:571:5: otherlv_4= ',' ( (lv_args_5_0= ruleVariable ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FOLLOW_16); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getMethodAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalDSL.g:575:5: ( (lv_args_5_0= ruleVariable ) )
                    	    // InternalDSL.g:576:6: (lv_args_5_0= ruleVariable )
                    	    {
                    	    // InternalDSL.g:576:6: (lv_args_5_0= ruleVariable )
                    	    // InternalDSL.g:577:7: lv_args_5_0= ruleVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getMethodAccess().getArgsVariableParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_args_5_0=ruleVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMethodRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"args",
                    	    								lv_args_5_0,
                    	    								"org.tud.inf.st.smags.dsl.DSL.Variable");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMethodAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleTypeUse"
    // InternalDSL.g:604:1: entryRuleTypeUse returns [EObject current=null] : iv_ruleTypeUse= ruleTypeUse EOF ;
    public final EObject entryRuleTypeUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeUse = null;


        try {
            // InternalDSL.g:604:48: (iv_ruleTypeUse= ruleTypeUse EOF )
            // InternalDSL.g:605:2: iv_ruleTypeUse= ruleTypeUse EOF
            {
             newCompositeNode(grammarAccess.getTypeUseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeUse=ruleTypeUse();

            state._fsp--;

             current =iv_ruleTypeUse; 
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
    // $ANTLR end "entryRuleTypeUse"


    // $ANTLR start "ruleTypeUse"
    // InternalDSL.g:611:1: ruleTypeUse returns [EObject current=null] : (this_PrimitiveUse_0= rulePrimitiveUse | this_GenericUse_1= ruleGenericUse ) ;
    public final EObject ruleTypeUse() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveUse_0 = null;

        EObject this_GenericUse_1 = null;



        	enterRule();

        try {
            // InternalDSL.g:617:2: ( (this_PrimitiveUse_0= rulePrimitiveUse | this_GenericUse_1= ruleGenericUse ) )
            // InternalDSL.g:618:2: (this_PrimitiveUse_0= rulePrimitiveUse | this_GenericUse_1= ruleGenericUse )
            {
            // InternalDSL.g:618:2: (this_PrimitiveUse_0= rulePrimitiveUse | this_GenericUse_1= ruleGenericUse )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_ID)) ) {
                alt11=1;
            }
            else if ( (LA11_0==19) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalDSL.g:619:3: this_PrimitiveUse_0= rulePrimitiveUse
                    {

                    			newCompositeNode(grammarAccess.getTypeUseAccess().getPrimitiveUseParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimitiveUse_0=rulePrimitiveUse();

                    state._fsp--;


                    			current = this_PrimitiveUse_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDSL.g:628:3: this_GenericUse_1= ruleGenericUse
                    {

                    			newCompositeNode(grammarAccess.getTypeUseAccess().getGenericUseParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_GenericUse_1=ruleGenericUse();

                    state._fsp--;


                    			current = this_GenericUse_1;
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
    // $ANTLR end "ruleTypeUse"


    // $ANTLR start "entryRulePrimitiveUse"
    // InternalDSL.g:640:1: entryRulePrimitiveUse returns [EObject current=null] : iv_rulePrimitiveUse= rulePrimitiveUse EOF ;
    public final EObject entryRulePrimitiveUse() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveUse = null;


        try {
            // InternalDSL.g:640:53: (iv_rulePrimitiveUse= rulePrimitiveUse EOF )
            // InternalDSL.g:641:2: iv_rulePrimitiveUse= rulePrimitiveUse EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveUseRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveUse=rulePrimitiveUse();

            state._fsp--;

             current =iv_rulePrimitiveUse; 
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
    // $ANTLR end "entryRulePrimitiveUse"


    // $ANTLR start "rulePrimitiveUse"
    // InternalDSL.g:647:1: rulePrimitiveUse returns [EObject current=null] : ( (lv_type_0_0= ruleEString ) ) ;
    public final EObject rulePrimitiveUse() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:653:2: ( ( (lv_type_0_0= ruleEString ) ) )
            // InternalDSL.g:654:2: ( (lv_type_0_0= ruleEString ) )
            {
            // InternalDSL.g:654:2: ( (lv_type_0_0= ruleEString ) )
            // InternalDSL.g:655:3: (lv_type_0_0= ruleEString )
            {
            // InternalDSL.g:655:3: (lv_type_0_0= ruleEString )
            // InternalDSL.g:656:4: lv_type_0_0= ruleEString
            {

            				newCompositeNode(grammarAccess.getPrimitiveUseAccess().getTypeEStringParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_type_0_0=ruleEString();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getPrimitiveUseRule());
            				}
            				set(
            					current,
            					"type",
            					lv_type_0_0,
            					"org.tud.inf.st.smags.dsl.DSL.EString");
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
    // $ANTLR end "rulePrimitiveUse"


    // $ANTLR start "entryRuleGenericUse"
    // InternalDSL.g:676:1: entryRuleGenericUse returns [EObject current=null] : iv_ruleGenericUse= ruleGenericUse EOF ;
    public final EObject entryRuleGenericUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenericUse = null;


        try {
            // InternalDSL.g:676:51: (iv_ruleGenericUse= ruleGenericUse EOF )
            // InternalDSL.g:677:2: iv_ruleGenericUse= ruleGenericUse EOF
            {
             newCompositeNode(grammarAccess.getGenericUseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGenericUse=ruleGenericUse();

            state._fsp--;

             current =iv_ruleGenericUse; 
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
    // $ANTLR end "entryRuleGenericUse"


    // $ANTLR start "ruleGenericUse"
    // InternalDSL.g:683:1: ruleGenericUse returns [EObject current=null] : (otherlv_0= ':' ( ( ruleEString ) ) ) ;
    public final EObject ruleGenericUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalDSL.g:689:2: ( (otherlv_0= ':' ( ( ruleEString ) ) ) )
            // InternalDSL.g:690:2: (otherlv_0= ':' ( ( ruleEString ) ) )
            {
            // InternalDSL.g:690:2: (otherlv_0= ':' ( ( ruleEString ) ) )
            // InternalDSL.g:691:3: otherlv_0= ':' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getGenericUseAccess().getColonKeyword_0());
            		
            // InternalDSL.g:695:3: ( ( ruleEString ) )
            // InternalDSL.g:696:4: ( ruleEString )
            {
            // InternalDSL.g:696:4: ( ruleEString )
            // InternalDSL.g:697:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGenericUseRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGenericUseAccess().getTypeTypeCrossReference_1_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleGenericUse"


    // $ANTLR start "entryRulePortTypeElement"
    // InternalDSL.g:715:1: entryRulePortTypeElement returns [EObject current=null] : iv_rulePortTypeElement= rulePortTypeElement EOF ;
    public final EObject entryRulePortTypeElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePortTypeElement = null;


        try {
            // InternalDSL.g:715:56: (iv_rulePortTypeElement= rulePortTypeElement EOF )
            // InternalDSL.g:716:2: iv_rulePortTypeElement= rulePortTypeElement EOF
            {
             newCompositeNode(grammarAccess.getPortTypeElementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePortTypeElement=rulePortTypeElement();

            state._fsp--;

             current =iv_rulePortTypeElement; 
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
    // $ANTLR end "entryRulePortTypeElement"


    // $ANTLR start "rulePortTypeElement"
    // InternalDSL.g:722:1: rulePortTypeElement returns [EObject current=null] : ( (this_Variable_0= ruleVariable | this_Method_1= ruleMethod ) otherlv_2= ';' ) ;
    public final EObject rulePortTypeElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Variable_0 = null;

        EObject this_Method_1 = null;



        	enterRule();

        try {
            // InternalDSL.g:728:2: ( ( (this_Variable_0= ruleVariable | this_Method_1= ruleMethod ) otherlv_2= ';' ) )
            // InternalDSL.g:729:2: ( (this_Variable_0= ruleVariable | this_Method_1= ruleMethod ) otherlv_2= ';' )
            {
            // InternalDSL.g:729:2: ( (this_Variable_0= ruleVariable | this_Method_1= ruleMethod ) otherlv_2= ';' )
            // InternalDSL.g:730:3: (this_Variable_0= ruleVariable | this_Method_1= ruleMethod ) otherlv_2= ';'
            {
            // InternalDSL.g:730:3: (this_Variable_0= ruleVariable | this_Method_1= ruleMethod )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalDSL.g:731:4: this_Variable_0= ruleVariable
                    {

                    				newCompositeNode(grammarAccess.getPortTypeElementAccess().getVariableParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_6);
                    this_Variable_0=ruleVariable();

                    state._fsp--;


                    				current = this_Variable_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalDSL.g:740:4: this_Method_1= ruleMethod
                    {

                    				newCompositeNode(grammarAccess.getPortTypeElementAccess().getMethodParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_6);
                    this_Method_1=ruleMethod();

                    state._fsp--;


                    				current = this_Method_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getPortTypeElementAccess().getSemicolonKeyword_1());
            		

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
    // $ANTLR end "rulePortTypeElement"


    // $ANTLR start "entryRuleCompositionOperator"
    // InternalDSL.g:757:1: entryRuleCompositionOperator returns [EObject current=null] : iv_ruleCompositionOperator= ruleCompositionOperator EOF ;
    public final EObject entryRuleCompositionOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositionOperator = null;


        try {
            // InternalDSL.g:757:60: (iv_ruleCompositionOperator= ruleCompositionOperator EOF )
            // InternalDSL.g:758:2: iv_ruleCompositionOperator= ruleCompositionOperator EOF
            {
             newCompositeNode(grammarAccess.getCompositionOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompositionOperator=ruleCompositionOperator();

            state._fsp--;

             current =iv_ruleCompositionOperator; 
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
    // $ANTLR end "entryRuleCompositionOperator"


    // $ANTLR start "ruleCompositionOperator"
    // InternalDSL.g:764:1: ruleCompositionOperator returns [EObject current=null] : this_BindOperator_0= ruleBindOperator ;
    public final EObject ruleCompositionOperator() throws RecognitionException {
        EObject current = null;

        EObject this_BindOperator_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:770:2: (this_BindOperator_0= ruleBindOperator )
            // InternalDSL.g:771:2: this_BindOperator_0= ruleBindOperator
            {

            		newCompositeNode(grammarAccess.getCompositionOperatorAccess().getBindOperatorParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_BindOperator_0=ruleBindOperator();

            state._fsp--;


            		current = this_BindOperator_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleCompositionOperator"


    // $ANTLR start "entryRuleEString"
    // InternalDSL.g:782:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDSL.g:782:47: (iv_ruleEString= ruleEString EOF )
            // InternalDSL.g:783:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalDSL.g:789:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalDSL.g:795:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDSL.g:796:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDSL.g:796:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalDSL.g:797:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDSL.g:805:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleComponentType"
    // InternalDSL.g:816:1: entryRuleComponentType returns [EObject current=null] : iv_ruleComponentType= ruleComponentType EOF ;
    public final EObject entryRuleComponentType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentType = null;


        try {
            // InternalDSL.g:816:54: (iv_ruleComponentType= ruleComponentType EOF )
            // InternalDSL.g:817:2: iv_ruleComponentType= ruleComponentType EOF
            {
             newCompositeNode(grammarAccess.getComponentTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentType=ruleComponentType();

            state._fsp--;

             current =iv_ruleComponentType; 
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
    // $ANTLR end "entryRuleComponentType"


    // $ANTLR start "ruleComponentType"
    // InternalDSL.g:823:1: ruleComponentType returns [EObject current=null] : ( () otherlv_1= 'ComponentType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'provides' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? otherlv_7= ';' ) ;
    public final EObject ruleComponentType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:829:2: ( ( () otherlv_1= 'ComponentType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'provides' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? otherlv_7= ';' ) )
            // InternalDSL.g:830:2: ( () otherlv_1= 'ComponentType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'provides' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? otherlv_7= ';' )
            {
            // InternalDSL.g:830:2: ( () otherlv_1= 'ComponentType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'provides' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? otherlv_7= ';' )
            // InternalDSL.g:831:3: () otherlv_1= 'ComponentType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'provides' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? otherlv_7= ';'
            {
            // InternalDSL.g:831:3: ()
            // InternalDSL.g:832:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComponentTypeAccess().getComponentTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentTypeAccess().getComponentTypeKeyword_1());
            		
            // InternalDSL.g:842:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDSL.g:843:4: (lv_name_2_0= ruleEString )
            {
            // InternalDSL.g:843:4: (lv_name_2_0= ruleEString )
            // InternalDSL.g:844:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getComponentTypeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.tud.inf.st.smags.dsl.DSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDSL.g:861:3: (otherlv_3= 'provides' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDSL.g:862:4: otherlv_3= 'provides' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getComponentTypeAccess().getProvidesKeyword_3_0());
                    			
                    // InternalDSL.g:866:4: ( ( ruleEString ) )
                    // InternalDSL.g:867:5: ( ruleEString )
                    {
                    // InternalDSL.g:867:5: ( ruleEString )
                    // InternalDSL.g:868:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComponentTypeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getComponentTypeAccess().getProvidesPortTypeCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:882:4: (otherlv_5= ',' ( ( ruleEString ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==21) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalDSL.g:883:5: otherlv_5= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_5=(Token)match(input,21,FOLLOW_7); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getComponentTypeAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalDSL.g:887:5: ( ( ruleEString ) )
                    	    // InternalDSL.g:888:6: ( ruleEString )
                    	    {
                    	    // InternalDSL.g:888:6: ( ruleEString )
                    	    // InternalDSL.g:889:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getComponentTypeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getComponentTypeAccess().getProvidesPortTypeCrossReference_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getComponentTypeAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleComponentType"


    // $ANTLR start "entryRulePortType"
    // InternalDSL.g:913:1: entryRulePortType returns [EObject current=null] : iv_rulePortType= rulePortType EOF ;
    public final EObject entryRulePortType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePortType = null;


        try {
            // InternalDSL.g:913:49: (iv_rulePortType= rulePortType EOF )
            // InternalDSL.g:914:2: iv_rulePortType= rulePortType EOF
            {
             newCompositeNode(grammarAccess.getPortTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePortType=rulePortType();

            state._fsp--;

             current =iv_rulePortType; 
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
    // $ANTLR end "entryRulePortType"


    // $ANTLR start "rulePortType"
    // InternalDSL.g:920:1: rulePortType returns [EObject current=null] : ( () otherlv_1= 'PortType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_elements_4_0= rulePortTypeElement ) )* otherlv_5= '}' ) ;
    public final EObject rulePortType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:926:2: ( ( () otherlv_1= 'PortType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_elements_4_0= rulePortTypeElement ) )* otherlv_5= '}' ) )
            // InternalDSL.g:927:2: ( () otherlv_1= 'PortType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_elements_4_0= rulePortTypeElement ) )* otherlv_5= '}' )
            {
            // InternalDSL.g:927:2: ( () otherlv_1= 'PortType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_elements_4_0= rulePortTypeElement ) )* otherlv_5= '}' )
            // InternalDSL.g:928:3: () otherlv_1= 'PortType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_elements_4_0= rulePortTypeElement ) )* otherlv_5= '}'
            {
            // InternalDSL.g:928:3: ()
            // InternalDSL.g:929:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPortTypeAccess().getPortTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getPortTypeAccess().getPortTypeKeyword_1());
            		
            // InternalDSL.g:939:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDSL.g:940:4: (lv_name_2_0= ruleEString )
            {
            // InternalDSL.g:940:4: (lv_name_2_0= ruleEString )
            // InternalDSL.g:941:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPortTypeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPortTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.tud.inf.st.smags.dsl.DSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getPortTypeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDSL.g:962:3: ( (lv_elements_4_0= rulePortTypeElement ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)||LA16_0==19) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDSL.g:963:4: (lv_elements_4_0= rulePortTypeElement )
            	    {
            	    // InternalDSL.g:963:4: (lv_elements_4_0= rulePortTypeElement )
            	    // InternalDSL.g:964:5: lv_elements_4_0= rulePortTypeElement
            	    {

            	    					newCompositeNode(grammarAccess.getPortTypeAccess().getElementsPortTypeElementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_elements_4_0=rulePortTypeElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPortTypeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_4_0,
            	    						"org.tud.inf.st.smags.dsl.DSL.PortTypeElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPortTypeAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "rulePortType"


    // $ANTLR start "entryRuleRoleModel"
    // InternalDSL.g:989:1: entryRuleRoleModel returns [EObject current=null] : iv_ruleRoleModel= ruleRoleModel EOF ;
    public final EObject entryRuleRoleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoleModel = null;


        try {
            // InternalDSL.g:989:50: (iv_ruleRoleModel= ruleRoleModel EOF )
            // InternalDSL.g:990:2: iv_ruleRoleModel= ruleRoleModel EOF
            {
             newCompositeNode(grammarAccess.getRoleModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoleModel=ruleRoleModel();

            state._fsp--;

             current =iv_ruleRoleModel; 
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
    // $ANTLR end "entryRuleRoleModel"


    // $ANTLR start "ruleRoleModel"
    // InternalDSL.g:996:1: ruleRoleModel returns [EObject current=null] : ( () otherlv_1= 'RoleModel' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_slots_4_0= ruleRoleModelSlot ) ) (otherlv_5= ',' ( (lv_slots_6_0= ruleRoleModelSlot ) ) )* otherlv_7= ')' )? otherlv_8= '{' ( (lv_initialization_9_0= ruleCompositionOperator ) )* otherlv_10= '}' ) ;
    public final EObject ruleRoleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_slots_4_0 = null;

        EObject lv_slots_6_0 = null;

        EObject lv_initialization_9_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1002:2: ( ( () otherlv_1= 'RoleModel' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_slots_4_0= ruleRoleModelSlot ) ) (otherlv_5= ',' ( (lv_slots_6_0= ruleRoleModelSlot ) ) )* otherlv_7= ')' )? otherlv_8= '{' ( (lv_initialization_9_0= ruleCompositionOperator ) )* otherlv_10= '}' ) )
            // InternalDSL.g:1003:2: ( () otherlv_1= 'RoleModel' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_slots_4_0= ruleRoleModelSlot ) ) (otherlv_5= ',' ( (lv_slots_6_0= ruleRoleModelSlot ) ) )* otherlv_7= ')' )? otherlv_8= '{' ( (lv_initialization_9_0= ruleCompositionOperator ) )* otherlv_10= '}' )
            {
            // InternalDSL.g:1003:2: ( () otherlv_1= 'RoleModel' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_slots_4_0= ruleRoleModelSlot ) ) (otherlv_5= ',' ( (lv_slots_6_0= ruleRoleModelSlot ) ) )* otherlv_7= ')' )? otherlv_8= '{' ( (lv_initialization_9_0= ruleCompositionOperator ) )* otherlv_10= '}' )
            // InternalDSL.g:1004:3: () otherlv_1= 'RoleModel' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_slots_4_0= ruleRoleModelSlot ) ) (otherlv_5= ',' ( (lv_slots_6_0= ruleRoleModelSlot ) ) )* otherlv_7= ')' )? otherlv_8= '{' ( (lv_initialization_9_0= ruleCompositionOperator ) )* otherlv_10= '}'
            {
            // InternalDSL.g:1004:3: ()
            // InternalDSL.g:1005:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRoleModelAccess().getRoleModelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getRoleModelAccess().getRoleModelKeyword_1());
            		
            // InternalDSL.g:1015:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDSL.g:1016:4: (lv_name_2_0= ruleEString )
            {
            // InternalDSL.g:1016:4: (lv_name_2_0= ruleEString )
            // InternalDSL.g:1017:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRoleModelAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoleModelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.tud.inf.st.smags.dsl.DSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDSL.g:1034:3: (otherlv_3= '(' ( (lv_slots_4_0= ruleRoleModelSlot ) ) (otherlv_5= ',' ( (lv_slots_6_0= ruleRoleModelSlot ) ) )* otherlv_7= ')' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==20) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDSL.g:1035:4: otherlv_3= '(' ( (lv_slots_4_0= ruleRoleModelSlot ) ) (otherlv_5= ',' ( (lv_slots_6_0= ruleRoleModelSlot ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getRoleModelAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalDSL.g:1039:4: ( (lv_slots_4_0= ruleRoleModelSlot ) )
                    // InternalDSL.g:1040:5: (lv_slots_4_0= ruleRoleModelSlot )
                    {
                    // InternalDSL.g:1040:5: (lv_slots_4_0= ruleRoleModelSlot )
                    // InternalDSL.g:1041:6: lv_slots_4_0= ruleRoleModelSlot
                    {

                    						newCompositeNode(grammarAccess.getRoleModelAccess().getSlotsRoleModelSlotParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_slots_4_0=ruleRoleModelSlot();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRoleModelRule());
                    						}
                    						add(
                    							current,
                    							"slots",
                    							lv_slots_4_0,
                    							"org.tud.inf.st.smags.dsl.DSL.RoleModelSlot");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:1058:4: (otherlv_5= ',' ( (lv_slots_6_0= ruleRoleModelSlot ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==21) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalDSL.g:1059:5: otherlv_5= ',' ( (lv_slots_6_0= ruleRoleModelSlot ) )
                    	    {
                    	    otherlv_5=(Token)match(input,21,FOLLOW_7); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getRoleModelAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalDSL.g:1063:5: ( (lv_slots_6_0= ruleRoleModelSlot ) )
                    	    // InternalDSL.g:1064:6: (lv_slots_6_0= ruleRoleModelSlot )
                    	    {
                    	    // InternalDSL.g:1064:6: (lv_slots_6_0= ruleRoleModelSlot )
                    	    // InternalDSL.g:1065:7: lv_slots_6_0= ruleRoleModelSlot
                    	    {

                    	    							newCompositeNode(grammarAccess.getRoleModelAccess().getSlotsRoleModelSlotParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_slots_6_0=ruleRoleModelSlot();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRoleModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"slots",
                    	    								lv_slots_6_0,
                    	    								"org.tud.inf.st.smags.dsl.DSL.RoleModelSlot");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getRoleModelAccess().getRightParenthesisKeyword_3_3());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_8, grammarAccess.getRoleModelAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalDSL.g:1092:3: ( (lv_initialization_9_0= ruleCompositionOperator ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==27) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalDSL.g:1093:4: (lv_initialization_9_0= ruleCompositionOperator )
            	    {
            	    // InternalDSL.g:1093:4: (lv_initialization_9_0= ruleCompositionOperator )
            	    // InternalDSL.g:1094:5: lv_initialization_9_0= ruleCompositionOperator
            	    {

            	    					newCompositeNode(grammarAccess.getRoleModelAccess().getInitializationCompositionOperatorParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_initialization_9_0=ruleCompositionOperator();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRoleModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"initialization",
            	    						lv_initialization_9_0,
            	    						"org.tud.inf.st.smags.dsl.DSL.CompositionOperator");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_10=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getRoleModelAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleRoleModel"


    // $ANTLR start "entryRuleRoleModelSlot"
    // InternalDSL.g:1119:1: entryRuleRoleModelSlot returns [EObject current=null] : iv_ruleRoleModelSlot= ruleRoleModelSlot EOF ;
    public final EObject entryRuleRoleModelSlot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoleModelSlot = null;


        try {
            // InternalDSL.g:1119:54: (iv_ruleRoleModelSlot= ruleRoleModelSlot EOF )
            // InternalDSL.g:1120:2: iv_ruleRoleModelSlot= ruleRoleModelSlot EOF
            {
             newCompositeNode(grammarAccess.getRoleModelSlotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoleModelSlot=ruleRoleModelSlot();

            state._fsp--;

             current =iv_ruleRoleModelSlot; 
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
    // $ANTLR end "entryRuleRoleModelSlot"


    // $ANTLR start "ruleRoleModelSlot"
    // InternalDSL.g:1126:1: ruleRoleModelSlot returns [EObject current=null] : ( () ( ( ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleRoleModelSlot() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1132:2: ( ( () ( ( ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalDSL.g:1133:2: ( () ( ( ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalDSL.g:1133:2: ( () ( ( ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) )
            // InternalDSL.g:1134:3: () ( ( ruleEString ) ) ( (lv_name_2_0= ruleEString ) )
            {
            // InternalDSL.g:1134:3: ()
            // InternalDSL.g:1135:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRoleModelSlotAccess().getRoleModelSlotAction_0(),
            					current);
            			

            }

            // InternalDSL.g:1141:3: ( ( ruleEString ) )
            // InternalDSL.g:1142:4: ( ruleEString )
            {
            // InternalDSL.g:1142:4: ( ruleEString )
            // InternalDSL.g:1143:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoleModelSlotRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRoleModelSlotAccess().getTypeComponentTypeCrossReference_1_0());
            				
            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDSL.g:1157:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDSL.g:1158:4: (lv_name_2_0= ruleEString )
            {
            // InternalDSL.g:1158:4: (lv_name_2_0= ruleEString )
            // InternalDSL.g:1159:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRoleModelSlotAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoleModelSlotRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.tud.inf.st.smags.dsl.DSL.EString");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleRoleModelSlot"


    // $ANTLR start "entryRuleBindOperator"
    // InternalDSL.g:1180:1: entryRuleBindOperator returns [EObject current=null] : iv_ruleBindOperator= ruleBindOperator EOF ;
    public final EObject entryRuleBindOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindOperator = null;


        try {
            // InternalDSL.g:1180:53: (iv_ruleBindOperator= ruleBindOperator EOF )
            // InternalDSL.g:1181:2: iv_ruleBindOperator= ruleBindOperator EOF
            {
             newCompositeNode(grammarAccess.getBindOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBindOperator=ruleBindOperator();

            state._fsp--;

             current =iv_ruleBindOperator; 
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
    // $ANTLR end "entryRuleBindOperator"


    // $ANTLR start "ruleBindOperator"
    // InternalDSL.g:1187:1: ruleBindOperator returns [EObject current=null] : ( () otherlv_1= 'bind' otherlv_2= 'role' ( ( ruleEString ) ) otherlv_4= 'to' ( ( ruleEString ) ) otherlv_6= ';' ) ;
    public final EObject ruleBindOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalDSL.g:1193:2: ( ( () otherlv_1= 'bind' otherlv_2= 'role' ( ( ruleEString ) ) otherlv_4= 'to' ( ( ruleEString ) ) otherlv_6= ';' ) )
            // InternalDSL.g:1194:2: ( () otherlv_1= 'bind' otherlv_2= 'role' ( ( ruleEString ) ) otherlv_4= 'to' ( ( ruleEString ) ) otherlv_6= ';' )
            {
            // InternalDSL.g:1194:2: ( () otherlv_1= 'bind' otherlv_2= 'role' ( ( ruleEString ) ) otherlv_4= 'to' ( ( ruleEString ) ) otherlv_6= ';' )
            // InternalDSL.g:1195:3: () otherlv_1= 'bind' otherlv_2= 'role' ( ( ruleEString ) ) otherlv_4= 'to' ( ( ruleEString ) ) otherlv_6= ';'
            {
            // InternalDSL.g:1195:3: ()
            // InternalDSL.g:1196:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBindOperatorAccess().getBindOperatorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getBindOperatorAccess().getBindKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getBindOperatorAccess().getRoleKeyword_2());
            		
            // InternalDSL.g:1210:3: ( ( ruleEString ) )
            // InternalDSL.g:1211:4: ( ruleEString )
            {
            // InternalDSL.g:1211:4: ( ruleEString )
            // InternalDSL.g:1212:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBindOperatorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getBindOperatorAccess().getToPortTypeCrossReference_3_0());
            				
            pushFollow(FOLLOW_23);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,29,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getBindOperatorAccess().getToKeyword_4());
            		
            // InternalDSL.g:1230:3: ( ( ruleEString ) )
            // InternalDSL.g:1231:4: ( ruleEString )
            {
            // InternalDSL.g:1231:4: ( ruleEString )
            // InternalDSL.g:1232:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBindOperatorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getBindOperatorAccess().getSlotRoleModelSlotCrossReference_5_0());
            				
            pushFollow(FOLLOW_6);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getBindOperatorAccess().getSemicolonKeyword_6());
            		

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
    // $ANTLR end "ruleBindOperator"


    // $ANTLR start "entryRuleArchitecture"
    // InternalDSL.g:1254:1: entryRuleArchitecture returns [EObject current=null] : iv_ruleArchitecture= ruleArchitecture EOF ;
    public final EObject entryRuleArchitecture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchitecture = null;


        try {
            // InternalDSL.g:1254:53: (iv_ruleArchitecture= ruleArchitecture EOF )
            // InternalDSL.g:1255:2: iv_ruleArchitecture= ruleArchitecture EOF
            {
             newCompositeNode(grammarAccess.getArchitectureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArchitecture=ruleArchitecture();

            state._fsp--;

             current =iv_ruleArchitecture; 
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
    // $ANTLR end "entryRuleArchitecture"


    // $ANTLR start "ruleArchitecture"
    // InternalDSL.g:1261:1: ruleArchitecture returns [EObject current=null] : (otherlv_0= 'Architecture' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '::' ( ( ruleEString ) ) otherlv_4= '{' ( (lv_typeBindings_5_0= ruleTypeBinding ) )* otherlv_6= '}' otherlv_7= '{' ( (lv_elements_8_0= ruleArchitectureElement ) )* otherlv_9= '}' ) ;
    public final EObject ruleArchitecture() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_typeBindings_5_0 = null;

        EObject lv_elements_8_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1267:2: ( (otherlv_0= 'Architecture' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '::' ( ( ruleEString ) ) otherlv_4= '{' ( (lv_typeBindings_5_0= ruleTypeBinding ) )* otherlv_6= '}' otherlv_7= '{' ( (lv_elements_8_0= ruleArchitectureElement ) )* otherlv_9= '}' ) )
            // InternalDSL.g:1268:2: (otherlv_0= 'Architecture' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '::' ( ( ruleEString ) ) otherlv_4= '{' ( (lv_typeBindings_5_0= ruleTypeBinding ) )* otherlv_6= '}' otherlv_7= '{' ( (lv_elements_8_0= ruleArchitectureElement ) )* otherlv_9= '}' )
            {
            // InternalDSL.g:1268:2: (otherlv_0= 'Architecture' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '::' ( ( ruleEString ) ) otherlv_4= '{' ( (lv_typeBindings_5_0= ruleTypeBinding ) )* otherlv_6= '}' otherlv_7= '{' ( (lv_elements_8_0= ruleArchitectureElement ) )* otherlv_9= '}' )
            // InternalDSL.g:1269:3: otherlv_0= 'Architecture' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '::' ( ( ruleEString ) ) otherlv_4= '{' ( (lv_typeBindings_5_0= ruleTypeBinding ) )* otherlv_6= '}' otherlv_7= '{' ( (lv_elements_8_0= ruleArchitectureElement ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getArchitectureAccess().getArchitectureKeyword_0());
            		
            // InternalDSL.g:1273:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDSL.g:1274:4: (lv_name_1_0= ruleEString )
            {
            // InternalDSL.g:1274:4: (lv_name_1_0= ruleEString )
            // InternalDSL.g:1275:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getArchitectureAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_24);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArchitectureRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.tud.inf.st.smags.dsl.DSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getArchitectureAccess().getColonColonKeyword_2());
            		
            // InternalDSL.g:1296:3: ( ( ruleEString ) )
            // InternalDSL.g:1297:4: ( ruleEString )
            {
            // InternalDSL.g:1297:4: ( ruleEString )
            // InternalDSL.g:1298:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArchitectureRule());
            					}
            				

            					newCompositeNode(grammarAccess.getArchitectureAccess().getTypeMetaArchitectureCrossReference_3_0());
            				
            pushFollow(FOLLOW_3);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_4, grammarAccess.getArchitectureAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalDSL.g:1316:3: ( (lv_typeBindings_5_0= ruleTypeBinding ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=RULE_STRING && LA20_0<=RULE_ID)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalDSL.g:1317:4: (lv_typeBindings_5_0= ruleTypeBinding )
            	    {
            	    // InternalDSL.g:1317:4: (lv_typeBindings_5_0= ruleTypeBinding )
            	    // InternalDSL.g:1318:5: lv_typeBindings_5_0= ruleTypeBinding
            	    {

            	    					newCompositeNode(grammarAccess.getArchitectureAccess().getTypeBindingsTypeBindingParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_25);
            	    lv_typeBindings_5_0=ruleTypeBinding();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getArchitectureRule());
            	    					}
            	    					add(
            	    						current,
            	    						"typeBindings",
            	    						lv_typeBindings_5_0,
            	    						"org.tud.inf.st.smags.dsl.DSL.TypeBinding");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getArchitectureAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_7=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_7, grammarAccess.getArchitectureAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalDSL.g:1343:3: ( (lv_elements_8_0= ruleArchitectureElement ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=32 && LA21_0<=33)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalDSL.g:1344:4: (lv_elements_8_0= ruleArchitectureElement )
            	    {
            	    // InternalDSL.g:1344:4: (lv_elements_8_0= ruleArchitectureElement )
            	    // InternalDSL.g:1345:5: lv_elements_8_0= ruleArchitectureElement
            	    {

            	    					newCompositeNode(grammarAccess.getArchitectureAccess().getElementsArchitectureElementParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_26);
            	    lv_elements_8_0=ruleArchitectureElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getArchitectureRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_8_0,
            	    						"org.tud.inf.st.smags.dsl.DSL.ArchitectureElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_9=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getArchitectureAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleArchitecture"


    // $ANTLR start "entryRuleArchitectureElement"
    // InternalDSL.g:1370:1: entryRuleArchitectureElement returns [EObject current=null] : iv_ruleArchitectureElement= ruleArchitectureElement EOF ;
    public final EObject entryRuleArchitectureElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchitectureElement = null;


        try {
            // InternalDSL.g:1370:60: (iv_ruleArchitectureElement= ruleArchitectureElement EOF )
            // InternalDSL.g:1371:2: iv_ruleArchitectureElement= ruleArchitectureElement EOF
            {
             newCompositeNode(grammarAccess.getArchitectureElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArchitectureElement=ruleArchitectureElement();

            state._fsp--;

             current =iv_ruleArchitectureElement; 
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
    // $ANTLR end "entryRuleArchitectureElement"


    // $ANTLR start "ruleArchitectureElement"
    // InternalDSL.g:1377:1: ruleArchitectureElement returns [EObject current=null] : (this_Component_0= ruleComponent | this_Port_1= rulePort ) ;
    public final EObject ruleArchitectureElement() throws RecognitionException {
        EObject current = null;

        EObject this_Component_0 = null;

        EObject this_Port_1 = null;



        	enterRule();

        try {
            // InternalDSL.g:1383:2: ( (this_Component_0= ruleComponent | this_Port_1= rulePort ) )
            // InternalDSL.g:1384:2: (this_Component_0= ruleComponent | this_Port_1= rulePort )
            {
            // InternalDSL.g:1384:2: (this_Component_0= ruleComponent | this_Port_1= rulePort )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==32) ) {
                alt22=1;
            }
            else if ( (LA22_0==33) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalDSL.g:1385:3: this_Component_0= ruleComponent
                    {

                    			newCompositeNode(grammarAccess.getArchitectureElementAccess().getComponentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Component_0=ruleComponent();

                    state._fsp--;


                    			current = this_Component_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDSL.g:1394:3: this_Port_1= rulePort
                    {

                    			newCompositeNode(grammarAccess.getArchitectureElementAccess().getPortParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Port_1=rulePort();

                    state._fsp--;


                    			current = this_Port_1;
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
    // $ANTLR end "ruleArchitectureElement"


    // $ANTLR start "entryRuleComponent"
    // InternalDSL.g:1406:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalDSL.g:1406:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalDSL.g:1407:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalDSL.g:1413:1: ruleComponent returns [EObject current=null] : (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '::' ( ( ruleEString ) ) otherlv_4= ';' ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1419:2: ( (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '::' ( ( ruleEString ) ) otherlv_4= ';' ) )
            // InternalDSL.g:1420:2: (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '::' ( ( ruleEString ) ) otherlv_4= ';' )
            {
            // InternalDSL.g:1420:2: (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '::' ( ( ruleEString ) ) otherlv_4= ';' )
            // InternalDSL.g:1421:3: otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '::' ( ( ruleEString ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0());
            		
            // InternalDSL.g:1425:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDSL.g:1426:4: (lv_name_1_0= ruleEString )
            {
            // InternalDSL.g:1426:4: (lv_name_1_0= ruleEString )
            // InternalDSL.g:1427:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getComponentAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_24);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.tud.inf.st.smags.dsl.DSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getColonColonKeyword_2());
            		
            // InternalDSL.g:1448:3: ( ( ruleEString ) )
            // InternalDSL.g:1449:4: ( ruleEString )
            {
            // InternalDSL.g:1449:4: ( ruleEString )
            // InternalDSL.g:1450:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentRule());
            					}
            				

            					newCompositeNode(grammarAccess.getComponentAccess().getTypeComponentTypeCrossReference_3_0());
            				
            pushFollow(FOLLOW_6);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getComponentAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRulePort"
    // InternalDSL.g:1472:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // InternalDSL.g:1472:45: (iv_rulePort= rulePort EOF )
            // InternalDSL.g:1473:2: iv_rulePort= rulePort EOF
            {
             newCompositeNode(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePort=rulePort();

            state._fsp--;

             current =iv_rulePort; 
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
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // InternalDSL.g:1479:1: rulePort returns [EObject current=null] : (otherlv_0= 'Port' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '::' ( ( ruleEString ) ) otherlv_4= ';' ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1485:2: ( (otherlv_0= 'Port' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '::' ( ( ruleEString ) ) otherlv_4= ';' ) )
            // InternalDSL.g:1486:2: (otherlv_0= 'Port' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '::' ( ( ruleEString ) ) otherlv_4= ';' )
            {
            // InternalDSL.g:1486:2: (otherlv_0= 'Port' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '::' ( ( ruleEString ) ) otherlv_4= ';' )
            // InternalDSL.g:1487:3: otherlv_0= 'Port' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '::' ( ( ruleEString ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getPortAccess().getPortKeyword_0());
            		
            // InternalDSL.g:1491:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDSL.g:1492:4: (lv_name_1_0= ruleEString )
            {
            // InternalDSL.g:1492:4: (lv_name_1_0= ruleEString )
            // InternalDSL.g:1493:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPortAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_24);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPortRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.tud.inf.st.smags.dsl.DSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getPortAccess().getColonColonKeyword_2());
            		
            // InternalDSL.g:1514:3: ( ( ruleEString ) )
            // InternalDSL.g:1515:4: ( ruleEString )
            {
            // InternalDSL.g:1515:4: ( ruleEString )
            // InternalDSL.g:1516:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPortRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPortAccess().getTypePortTypeCrossReference_3_0());
            				
            pushFollow(FOLLOW_6);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPortAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleTypeBinding"
    // InternalDSL.g:1538:1: entryRuleTypeBinding returns [EObject current=null] : iv_ruleTypeBinding= ruleTypeBinding EOF ;
    public final EObject entryRuleTypeBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeBinding = null;


        try {
            // InternalDSL.g:1538:52: (iv_ruleTypeBinding= ruleTypeBinding EOF )
            // InternalDSL.g:1539:2: iv_ruleTypeBinding= ruleTypeBinding EOF
            {
             newCompositeNode(grammarAccess.getTypeBindingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeBinding=ruleTypeBinding();

            state._fsp--;

             current =iv_ruleTypeBinding; 
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
    // $ANTLR end "entryRuleTypeBinding"


    // $ANTLR start "ruleTypeBinding"
    // InternalDSL.g:1545:1: ruleTypeBinding returns [EObject current=null] : ( ( ( ruleEString ) ) otherlv_1= '=' ( (lv_implementation_2_0= ruleEString ) ) otherlv_3= ';' ) ;
    public final EObject ruleTypeBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_implementation_2_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1551:2: ( ( ( ( ruleEString ) ) otherlv_1= '=' ( (lv_implementation_2_0= ruleEString ) ) otherlv_3= ';' ) )
            // InternalDSL.g:1552:2: ( ( ( ruleEString ) ) otherlv_1= '=' ( (lv_implementation_2_0= ruleEString ) ) otherlv_3= ';' )
            {
            // InternalDSL.g:1552:2: ( ( ( ruleEString ) ) otherlv_1= '=' ( (lv_implementation_2_0= ruleEString ) ) otherlv_3= ';' )
            // InternalDSL.g:1553:3: ( ( ruleEString ) ) otherlv_1= '=' ( (lv_implementation_2_0= ruleEString ) ) otherlv_3= ';'
            {
            // InternalDSL.g:1553:3: ( ( ruleEString ) )
            // InternalDSL.g:1554:4: ( ruleEString )
            {
            // InternalDSL.g:1554:4: ( ruleEString )
            // InternalDSL.g:1555:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeBindingRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTypeBindingAccess().getTypeTypeCrossReference_0_0());
            				
            pushFollow(FOLLOW_27);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getTypeBindingAccess().getEqualsSignKeyword_1());
            		
            // InternalDSL.g:1573:3: ( (lv_implementation_2_0= ruleEString ) )
            // InternalDSL.g:1574:4: (lv_implementation_2_0= ruleEString )
            {
            // InternalDSL.g:1574:4: (lv_implementation_2_0= ruleEString )
            // InternalDSL.g:1575:5: lv_implementation_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTypeBindingAccess().getImplementationEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_implementation_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypeBindingRule());
            					}
            					set(
            						current,
            						"implementation",
            						lv_implementation_2_0,
            						"org.tud.inf.st.smags.dsl.DSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getTypeBindingAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleTypeBinding"

    // Delegated rules


    protected DFA12 dfa12 = new DFA12(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\4\4\2\16\2\4\2\uffff";
    static final String dfa_3s = "\1\23\3\5\2\24\2\5\2\uffff";
    static final String dfa_4s = "\10\uffff\1\1\1\2";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\2\15\uffff\1\3",
            "\1\4\1\5",
            "\1\4\1\5",
            "\1\6\1\7",
            "\1\10\5\uffff\1\11",
            "\1\10\5\uffff\1\11",
            "\1\4\1\5",
            "\1\4\1\5",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "730:3: (this_Variable_0= ruleVariable | this_Method_1= ruleMethod )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000040008002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000006802000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000480030L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000082030L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000101000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008002000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000002030L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000300002000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});

}