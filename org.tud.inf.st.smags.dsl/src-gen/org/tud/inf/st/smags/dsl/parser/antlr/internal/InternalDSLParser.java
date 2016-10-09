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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'imports'", "'{'", "'}'", "';'", "'MetaArchitecture'", "'Type'", "'Primitive'", "'('", "','", "')'", "'ComponentType'", "'PortType'", "'RoleModel'", "'bind'", "'role'", "'to'", "'Architecture'", "'::'", "'Component'", "'Port'", "'='"
    };
    public static final int RULE_STRING=4;
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
    public static final int T__30=30;
    public static final int T__31=31;
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

                if ( (LA3_0==15||LA3_0==27) ) {
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
            else if ( (LA4_0==27) ) {
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
    // InternalDSL.g:226:1: ruleMetaArchitecture returns [EObject current=null] : (otherlv_0= 'MetaArchitecture' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_types_3_0= ruleType ) )* otherlv_4= '}' otherlv_5= '{' ( (lv_elements_6_0= ruleMetaArchitectureElement ) )* otherlv_7= '}' ) ;
    public final EObject ruleMetaArchitecture() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_types_3_0 = null;

        EObject lv_elements_6_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:232:2: ( (otherlv_0= 'MetaArchitecture' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_types_3_0= ruleType ) )* otherlv_4= '}' otherlv_5= '{' ( (lv_elements_6_0= ruleMetaArchitectureElement ) )* otherlv_7= '}' ) )
            // InternalDSL.g:233:2: (otherlv_0= 'MetaArchitecture' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_types_3_0= ruleType ) )* otherlv_4= '}' otherlv_5= '{' ( (lv_elements_6_0= ruleMetaArchitectureElement ) )* otherlv_7= '}' )
            {
            // InternalDSL.g:233:2: (otherlv_0= 'MetaArchitecture' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_types_3_0= ruleType ) )* otherlv_4= '}' otherlv_5= '{' ( (lv_elements_6_0= ruleMetaArchitectureElement ) )* otherlv_7= '}' )
            // InternalDSL.g:234:3: otherlv_0= 'MetaArchitecture' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_types_3_0= ruleType ) )* otherlv_4= '}' otherlv_5= '{' ( (lv_elements_6_0= ruleMetaArchitectureElement ) )* otherlv_7= '}'
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

                if ( ((LA5_0>=16 && LA5_0<=17)) ) {
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

                if ( ((LA6_0>=21 && LA6_0<=23)) ) {
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

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getMetaArchitectureAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalDSL.g:315:1: entryRuleMetaArchitectureElement returns [EObject current=null] : iv_ruleMetaArchitectureElement= ruleMetaArchitectureElement EOF ;
    public final EObject entryRuleMetaArchitectureElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaArchitectureElement = null;


        try {
            // InternalDSL.g:315:64: (iv_ruleMetaArchitectureElement= ruleMetaArchitectureElement EOF )
            // InternalDSL.g:316:2: iv_ruleMetaArchitectureElement= ruleMetaArchitectureElement EOF
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
    // InternalDSL.g:322:1: ruleMetaArchitectureElement returns [EObject current=null] : (this_ComponentType_0= ruleComponentType | this_PortType_1= rulePortType | this_RoleModel_2= ruleRoleModel ) ;
    public final EObject ruleMetaArchitectureElement() throws RecognitionException {
        EObject current = null;

        EObject this_ComponentType_0 = null;

        EObject this_PortType_1 = null;

        EObject this_RoleModel_2 = null;



        	enterRule();

        try {
            // InternalDSL.g:328:2: ( (this_ComponentType_0= ruleComponentType | this_PortType_1= rulePortType | this_RoleModel_2= ruleRoleModel ) )
            // InternalDSL.g:329:2: (this_ComponentType_0= ruleComponentType | this_PortType_1= rulePortType | this_RoleModel_2= ruleRoleModel )
            {
            // InternalDSL.g:329:2: (this_ComponentType_0= ruleComponentType | this_PortType_1= rulePortType | this_RoleModel_2= ruleRoleModel )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt7=1;
                }
                break;
            case 22:
                {
                alt7=2;
                }
                break;
            case 23:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalDSL.g:330:3: this_ComponentType_0= ruleComponentType
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
                    // InternalDSL.g:339:3: this_PortType_1= rulePortType
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
                    // InternalDSL.g:348:3: this_RoleModel_2= ruleRoleModel
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
    // InternalDSL.g:360:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalDSL.g:360:45: (iv_ruleType= ruleType EOF )
            // InternalDSL.g:361:2: iv_ruleType= ruleType EOF
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
    // InternalDSL.g:367:1: ruleType returns [EObject current=null] : (this_ExternalType_0= ruleExternalType | this_PrimitiveType_1= rulePrimitiveType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_ExternalType_0 = null;

        EObject this_PrimitiveType_1 = null;



        	enterRule();

        try {
            // InternalDSL.g:373:2: ( (this_ExternalType_0= ruleExternalType | this_PrimitiveType_1= rulePrimitiveType ) )
            // InternalDSL.g:374:2: (this_ExternalType_0= ruleExternalType | this_PrimitiveType_1= rulePrimitiveType )
            {
            // InternalDSL.g:374:2: (this_ExternalType_0= ruleExternalType | this_PrimitiveType_1= rulePrimitiveType )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            else if ( (LA8_0==17) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalDSL.g:375:3: this_ExternalType_0= ruleExternalType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getExternalTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalType_0=ruleExternalType();

                    state._fsp--;


                    			current = this_ExternalType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDSL.g:384:3: this_PrimitiveType_1= rulePrimitiveType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimitiveType_1=rulePrimitiveType();

                    state._fsp--;


                    			current = this_PrimitiveType_1;
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleExternalType"
    // InternalDSL.g:396:1: entryRuleExternalType returns [EObject current=null] : iv_ruleExternalType= ruleExternalType EOF ;
    public final EObject entryRuleExternalType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalType = null;


        try {
            // InternalDSL.g:396:53: (iv_ruleExternalType= ruleExternalType EOF )
            // InternalDSL.g:397:2: iv_ruleExternalType= ruleExternalType EOF
            {
             newCompositeNode(grammarAccess.getExternalTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalType=ruleExternalType();

            state._fsp--;

             current =iv_ruleExternalType; 
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
    // $ANTLR end "entryRuleExternalType"


    // $ANTLR start "ruleExternalType"
    // InternalDSL.g:403:1: ruleExternalType returns [EObject current=null] : (otherlv_0= 'Type' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ';' ) ;
    public final EObject ruleExternalType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:409:2: ( (otherlv_0= 'Type' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ';' ) )
            // InternalDSL.g:410:2: (otherlv_0= 'Type' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ';' )
            {
            // InternalDSL.g:410:2: (otherlv_0= 'Type' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ';' )
            // InternalDSL.g:411:3: otherlv_0= 'Type' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalTypeAccess().getTypeKeyword_0());
            		
            // InternalDSL.g:415:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDSL.g:416:4: (lv_name_1_0= ruleEString )
            {
            // InternalDSL.g:416:4: (lv_name_1_0= ruleEString )
            // InternalDSL.g:417:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getExternalTypeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternalTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.tud.inf.st.smags.dsl.DSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getExternalTypeAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleExternalType"


    // $ANTLR start "entryRulePrimitiveType"
    // InternalDSL.g:442:1: entryRulePrimitiveType returns [EObject current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final EObject entryRulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveType = null;


        try {
            // InternalDSL.g:442:54: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // InternalDSL.g:443:2: iv_rulePrimitiveType= rulePrimitiveType EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveType=rulePrimitiveType();

            state._fsp--;

             current =iv_rulePrimitiveType; 
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
    // $ANTLR end "entryRulePrimitiveType"


    // $ANTLR start "rulePrimitiveType"
    // InternalDSL.g:449:1: rulePrimitiveType returns [EObject current=null] : (otherlv_0= 'Primitive' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ';' ) ;
    public final EObject rulePrimitiveType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:455:2: ( (otherlv_0= 'Primitive' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ';' ) )
            // InternalDSL.g:456:2: (otherlv_0= 'Primitive' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ';' )
            {
            // InternalDSL.g:456:2: (otherlv_0= 'Primitive' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ';' )
            // InternalDSL.g:457:3: otherlv_0= 'Primitive' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getPrimitiveTypeAccess().getPrimitiveKeyword_0());
            		
            // InternalDSL.g:461:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDSL.g:462:4: (lv_name_1_0= ruleEString )
            {
            // InternalDSL.g:462:4: (lv_name_1_0= ruleEString )
            // InternalDSL.g:463:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrimitiveTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.tud.inf.st.smags.dsl.DSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getPrimitiveTypeAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "entryRuleVariable"
    // InternalDSL.g:488:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalDSL.g:488:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalDSL.g:489:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalDSL.g:495:1: ruleVariable returns [EObject current=null] : ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:501:2: ( ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalDSL.g:502:2: ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalDSL.g:502:2: ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) )
            // InternalDSL.g:503:3: ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) )
            {
            // InternalDSL.g:503:3: ( ( ruleEString ) )
            // InternalDSL.g:504:4: ( ruleEString )
            {
            // InternalDSL.g:504:4: ( ruleEString )
            // InternalDSL.g:505:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            				

            					newCompositeNode(grammarAccess.getVariableAccess().getTypeTypeCrossReference_0_0());
            				
            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDSL.g:519:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDSL.g:520:4: (lv_name_1_0= ruleEString )
            {
            // InternalDSL.g:520:4: (lv_name_1_0= ruleEString )
            // InternalDSL.g:521:5: lv_name_1_0= ruleEString
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


    // $ANTLR start "entryRuleAnonymousVariable"
    // InternalDSL.g:542:1: entryRuleAnonymousVariable returns [EObject current=null] : iv_ruleAnonymousVariable= ruleAnonymousVariable EOF ;
    public final EObject entryRuleAnonymousVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnonymousVariable = null;


        try {
            // InternalDSL.g:542:58: (iv_ruleAnonymousVariable= ruleAnonymousVariable EOF )
            // InternalDSL.g:543:2: iv_ruleAnonymousVariable= ruleAnonymousVariable EOF
            {
             newCompositeNode(grammarAccess.getAnonymousVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnonymousVariable=ruleAnonymousVariable();

            state._fsp--;

             current =iv_ruleAnonymousVariable; 
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
    // $ANTLR end "entryRuleAnonymousVariable"


    // $ANTLR start "ruleAnonymousVariable"
    // InternalDSL.g:549:1: ruleAnonymousVariable returns [EObject current=null] : ( ( ruleEString ) ) ;
    public final EObject ruleAnonymousVariable() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalDSL.g:555:2: ( ( ( ruleEString ) ) )
            // InternalDSL.g:556:2: ( ( ruleEString ) )
            {
            // InternalDSL.g:556:2: ( ( ruleEString ) )
            // InternalDSL.g:557:3: ( ruleEString )
            {
            // InternalDSL.g:557:3: ( ruleEString )
            // InternalDSL.g:558:4: ruleEString
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getAnonymousVariableRule());
            				}
            			

            				newCompositeNode(grammarAccess.getAnonymousVariableAccess().getTypeTypeCrossReference_0());
            			
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
    // $ANTLR end "ruleAnonymousVariable"


    // $ANTLR start "entryRuleMethod"
    // InternalDSL.g:575:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalDSL.g:575:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalDSL.g:576:2: iv_ruleMethod= ruleMethod EOF
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
    // InternalDSL.g:582:1: ruleMethod returns [EObject current=null] : ( ( (lv_returnType_0_0= ruleAnonymousVariable ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleVariable ) ) )* )? otherlv_6= ')' ) ;
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
            // InternalDSL.g:588:2: ( ( ( (lv_returnType_0_0= ruleAnonymousVariable ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleVariable ) ) )* )? otherlv_6= ')' ) )
            // InternalDSL.g:589:2: ( ( (lv_returnType_0_0= ruleAnonymousVariable ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleVariable ) ) )* )? otherlv_6= ')' )
            {
            // InternalDSL.g:589:2: ( ( (lv_returnType_0_0= ruleAnonymousVariable ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleVariable ) ) )* )? otherlv_6= ')' )
            // InternalDSL.g:590:3: ( (lv_returnType_0_0= ruleAnonymousVariable ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleVariable ) ) )* )? otherlv_6= ')'
            {
            // InternalDSL.g:590:3: ( (lv_returnType_0_0= ruleAnonymousVariable ) )
            // InternalDSL.g:591:4: (lv_returnType_0_0= ruleAnonymousVariable )
            {
            // InternalDSL.g:591:4: (lv_returnType_0_0= ruleAnonymousVariable )
            // InternalDSL.g:592:5: lv_returnType_0_0= ruleAnonymousVariable
            {

            					newCompositeNode(grammarAccess.getMethodAccess().getReturnTypeAnonymousVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_returnType_0_0=ruleAnonymousVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMethodRule());
            					}
            					set(
            						current,
            						"returnType",
            						lv_returnType_0_0,
            						"org.tud.inf.st.smags.dsl.DSL.AnonymousVariable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDSL.g:609:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDSL.g:610:4: (lv_name_1_0= ruleEString )
            {
            // InternalDSL.g:610:4: (lv_name_1_0= ruleEString )
            // InternalDSL.g:611:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMethodAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
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

            otherlv_2=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2());
            		
            // InternalDSL.g:632:3: ( ( (lv_args_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleVariable ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_ID)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDSL.g:633:4: ( (lv_args_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleVariable ) ) )*
                    {
                    // InternalDSL.g:633:4: ( (lv_args_3_0= ruleVariable ) )
                    // InternalDSL.g:634:5: (lv_args_3_0= ruleVariable )
                    {
                    // InternalDSL.g:634:5: (lv_args_3_0= ruleVariable )
                    // InternalDSL.g:635:6: lv_args_3_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getMethodAccess().getArgsVariableParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_12);
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

                    // InternalDSL.g:652:4: (otherlv_4= ',' ( (lv_args_5_0= ruleVariable ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==19) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalDSL.g:653:5: otherlv_4= ',' ( (lv_args_5_0= ruleVariable ) )
                    	    {
                    	    otherlv_4=(Token)match(input,19,FOLLOW_7); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getMethodAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalDSL.g:657:5: ( (lv_args_5_0= ruleVariable ) )
                    	    // InternalDSL.g:658:6: (lv_args_5_0= ruleVariable )
                    	    {
                    	    // InternalDSL.g:658:6: (lv_args_5_0= ruleVariable )
                    	    // InternalDSL.g:659:7: lv_args_5_0= ruleVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getMethodAccess().getArgsVariableParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
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

            otherlv_6=(Token)match(input,20,FOLLOW_2); 

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


    // $ANTLR start "entryRulePortTypeElement"
    // InternalDSL.g:686:1: entryRulePortTypeElement returns [EObject current=null] : iv_rulePortTypeElement= rulePortTypeElement EOF ;
    public final EObject entryRulePortTypeElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePortTypeElement = null;


        try {
            // InternalDSL.g:686:56: (iv_rulePortTypeElement= rulePortTypeElement EOF )
            // InternalDSL.g:687:2: iv_rulePortTypeElement= rulePortTypeElement EOF
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
    // InternalDSL.g:693:1: rulePortTypeElement returns [EObject current=null] : ( (this_Variable_0= ruleVariable | this_Method_1= ruleMethod ) otherlv_2= ';' ) ;
    public final EObject rulePortTypeElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Variable_0 = null;

        EObject this_Method_1 = null;



        	enterRule();

        try {
            // InternalDSL.g:699:2: ( ( (this_Variable_0= ruleVariable | this_Method_1= ruleMethod ) otherlv_2= ';' ) )
            // InternalDSL.g:700:2: ( (this_Variable_0= ruleVariable | this_Method_1= ruleMethod ) otherlv_2= ';' )
            {
            // InternalDSL.g:700:2: ( (this_Variable_0= ruleVariable | this_Method_1= ruleMethod ) otherlv_2= ';' )
            // InternalDSL.g:701:3: (this_Variable_0= ruleVariable | this_Method_1= ruleMethod ) otherlv_2= ';'
            {
            // InternalDSL.g:701:3: (this_Variable_0= ruleVariable | this_Method_1= ruleMethod )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==RULE_STRING) ) {
                    int LA11_3 = input.LA(3);

                    if ( (LA11_3==18) ) {
                        alt11=2;
                    }
                    else if ( (LA11_3==14) ) {
                        alt11=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA11_1==RULE_ID) ) {
                    int LA11_4 = input.LA(3);

                    if ( (LA11_4==14) ) {
                        alt11=1;
                    }
                    else if ( (LA11_4==18) ) {
                        alt11=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA11_0==RULE_ID) ) {
                int LA11_2 = input.LA(2);

                if ( (LA11_2==RULE_STRING) ) {
                    int LA11_3 = input.LA(3);

                    if ( (LA11_3==18) ) {
                        alt11=2;
                    }
                    else if ( (LA11_3==14) ) {
                        alt11=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA11_2==RULE_ID) ) {
                    int LA11_4 = input.LA(3);

                    if ( (LA11_4==14) ) {
                        alt11=1;
                    }
                    else if ( (LA11_4==18) ) {
                        alt11=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalDSL.g:702:4: this_Variable_0= ruleVariable
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
                    // InternalDSL.g:711:4: this_Method_1= ruleMethod
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
    // InternalDSL.g:728:1: entryRuleCompositionOperator returns [EObject current=null] : iv_ruleCompositionOperator= ruleCompositionOperator EOF ;
    public final EObject entryRuleCompositionOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositionOperator = null;


        try {
            // InternalDSL.g:728:60: (iv_ruleCompositionOperator= ruleCompositionOperator EOF )
            // InternalDSL.g:729:2: iv_ruleCompositionOperator= ruleCompositionOperator EOF
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
    // InternalDSL.g:735:1: ruleCompositionOperator returns [EObject current=null] : this_BindOperator_0= ruleBindOperator ;
    public final EObject ruleCompositionOperator() throws RecognitionException {
        EObject current = null;

        EObject this_BindOperator_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:741:2: (this_BindOperator_0= ruleBindOperator )
            // InternalDSL.g:742:2: this_BindOperator_0= ruleBindOperator
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
    // InternalDSL.g:753:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDSL.g:753:47: (iv_ruleEString= ruleEString EOF )
            // InternalDSL.g:754:2: iv_ruleEString= ruleEString EOF
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
    // InternalDSL.g:760:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalDSL.g:766:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDSL.g:767:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDSL.g:767:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalDSL.g:768:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDSL.g:776:3: this_ID_1= RULE_ID
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
    // InternalDSL.g:787:1: entryRuleComponentType returns [EObject current=null] : iv_ruleComponentType= ruleComponentType EOF ;
    public final EObject entryRuleComponentType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentType = null;


        try {
            // InternalDSL.g:787:54: (iv_ruleComponentType= ruleComponentType EOF )
            // InternalDSL.g:788:2: iv_ruleComponentType= ruleComponentType EOF
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
    // InternalDSL.g:794:1: ruleComponentType returns [EObject current=null] : ( () otherlv_1= 'ComponentType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ';' ) ;
    public final EObject ruleComponentType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:800:2: ( ( () otherlv_1= 'ComponentType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ';' ) )
            // InternalDSL.g:801:2: ( () otherlv_1= 'ComponentType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ';' )
            {
            // InternalDSL.g:801:2: ( () otherlv_1= 'ComponentType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ';' )
            // InternalDSL.g:802:3: () otherlv_1= 'ComponentType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ';'
            {
            // InternalDSL.g:802:3: ()
            // InternalDSL.g:803:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComponentTypeAccess().getComponentTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentTypeAccess().getComponentTypeKeyword_1());
            		
            // InternalDSL.g:813:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDSL.g:814:4: (lv_name_2_0= ruleEString )
            {
            // InternalDSL.g:814:4: (lv_name_2_0= ruleEString )
            // InternalDSL.g:815:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getComponentTypeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
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

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getComponentTypeAccess().getSemicolonKeyword_3());
            		

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
    // InternalDSL.g:840:1: entryRulePortType returns [EObject current=null] : iv_rulePortType= rulePortType EOF ;
    public final EObject entryRulePortType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePortType = null;


        try {
            // InternalDSL.g:840:49: (iv_rulePortType= rulePortType EOF )
            // InternalDSL.g:841:2: iv_rulePortType= rulePortType EOF
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
    // InternalDSL.g:847:1: rulePortType returns [EObject current=null] : ( () otherlv_1= 'PortType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_elements_4_0= rulePortTypeElement ) )* otherlv_5= '}' ) ;
    public final EObject rulePortType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:853:2: ( ( () otherlv_1= 'PortType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_elements_4_0= rulePortTypeElement ) )* otherlv_5= '}' ) )
            // InternalDSL.g:854:2: ( () otherlv_1= 'PortType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_elements_4_0= rulePortTypeElement ) )* otherlv_5= '}' )
            {
            // InternalDSL.g:854:2: ( () otherlv_1= 'PortType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_elements_4_0= rulePortTypeElement ) )* otherlv_5= '}' )
            // InternalDSL.g:855:3: () otherlv_1= 'PortType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_elements_4_0= rulePortTypeElement ) )* otherlv_5= '}'
            {
            // InternalDSL.g:855:3: ()
            // InternalDSL.g:856:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPortTypeAccess().getPortTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getPortTypeAccess().getPortTypeKeyword_1());
            		
            // InternalDSL.g:866:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDSL.g:867:4: (lv_name_2_0= ruleEString )
            {
            // InternalDSL.g:867:4: (lv_name_2_0= ruleEString )
            // InternalDSL.g:868:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getPortTypeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDSL.g:889:3: ( (lv_elements_4_0= rulePortTypeElement ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_STRING && LA13_0<=RULE_ID)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDSL.g:890:4: (lv_elements_4_0= rulePortTypeElement )
            	    {
            	    // InternalDSL.g:890:4: (lv_elements_4_0= rulePortTypeElement )
            	    // InternalDSL.g:891:5: lv_elements_4_0= rulePortTypeElement
            	    {

            	    					newCompositeNode(grammarAccess.getPortTypeAccess().getElementsPortTypeElementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_13);
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
            	    break loop13;
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
    // InternalDSL.g:916:1: entryRuleRoleModel returns [EObject current=null] : iv_ruleRoleModel= ruleRoleModel EOF ;
    public final EObject entryRuleRoleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoleModel = null;


        try {
            // InternalDSL.g:916:50: (iv_ruleRoleModel= ruleRoleModel EOF )
            // InternalDSL.g:917:2: iv_ruleRoleModel= ruleRoleModel EOF
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
    // InternalDSL.g:923:1: ruleRoleModel returns [EObject current=null] : ( () otherlv_1= 'RoleModel' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_slots_4_0= ruleRoleModelSlot ) ) (otherlv_5= ',' ( (lv_slots_6_0= ruleRoleModelSlot ) ) )* otherlv_7= ')' )? otherlv_8= '{' ( (lv_initialization_9_0= ruleCompositionOperator ) )* otherlv_10= '}' ) ;
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
            // InternalDSL.g:929:2: ( ( () otherlv_1= 'RoleModel' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_slots_4_0= ruleRoleModelSlot ) ) (otherlv_5= ',' ( (lv_slots_6_0= ruleRoleModelSlot ) ) )* otherlv_7= ')' )? otherlv_8= '{' ( (lv_initialization_9_0= ruleCompositionOperator ) )* otherlv_10= '}' ) )
            // InternalDSL.g:930:2: ( () otherlv_1= 'RoleModel' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_slots_4_0= ruleRoleModelSlot ) ) (otherlv_5= ',' ( (lv_slots_6_0= ruleRoleModelSlot ) ) )* otherlv_7= ')' )? otherlv_8= '{' ( (lv_initialization_9_0= ruleCompositionOperator ) )* otherlv_10= '}' )
            {
            // InternalDSL.g:930:2: ( () otherlv_1= 'RoleModel' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_slots_4_0= ruleRoleModelSlot ) ) (otherlv_5= ',' ( (lv_slots_6_0= ruleRoleModelSlot ) ) )* otherlv_7= ')' )? otherlv_8= '{' ( (lv_initialization_9_0= ruleCompositionOperator ) )* otherlv_10= '}' )
            // InternalDSL.g:931:3: () otherlv_1= 'RoleModel' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_slots_4_0= ruleRoleModelSlot ) ) (otherlv_5= ',' ( (lv_slots_6_0= ruleRoleModelSlot ) ) )* otherlv_7= ')' )? otherlv_8= '{' ( (lv_initialization_9_0= ruleCompositionOperator ) )* otherlv_10= '}'
            {
            // InternalDSL.g:931:3: ()
            // InternalDSL.g:932:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRoleModelAccess().getRoleModelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getRoleModelAccess().getRoleModelKeyword_1());
            		
            // InternalDSL.g:942:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDSL.g:943:4: (lv_name_2_0= ruleEString )
            {
            // InternalDSL.g:943:4: (lv_name_2_0= ruleEString )
            // InternalDSL.g:944:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRoleModelAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
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

            // InternalDSL.g:961:3: (otherlv_3= '(' ( (lv_slots_4_0= ruleRoleModelSlot ) ) (otherlv_5= ',' ( (lv_slots_6_0= ruleRoleModelSlot ) ) )* otherlv_7= ')' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDSL.g:962:4: otherlv_3= '(' ( (lv_slots_4_0= ruleRoleModelSlot ) ) (otherlv_5= ',' ( (lv_slots_6_0= ruleRoleModelSlot ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getRoleModelAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalDSL.g:966:4: ( (lv_slots_4_0= ruleRoleModelSlot ) )
                    // InternalDSL.g:967:5: (lv_slots_4_0= ruleRoleModelSlot )
                    {
                    // InternalDSL.g:967:5: (lv_slots_4_0= ruleRoleModelSlot )
                    // InternalDSL.g:968:6: lv_slots_4_0= ruleRoleModelSlot
                    {

                    						newCompositeNode(grammarAccess.getRoleModelAccess().getSlotsRoleModelSlotParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_12);
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

                    // InternalDSL.g:985:4: (otherlv_5= ',' ( (lv_slots_6_0= ruleRoleModelSlot ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==19) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalDSL.g:986:5: otherlv_5= ',' ( (lv_slots_6_0= ruleRoleModelSlot ) )
                    	    {
                    	    otherlv_5=(Token)match(input,19,FOLLOW_7); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getRoleModelAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalDSL.g:990:5: ( (lv_slots_6_0= ruleRoleModelSlot ) )
                    	    // InternalDSL.g:991:6: (lv_slots_6_0= ruleRoleModelSlot )
                    	    {
                    	    // InternalDSL.g:991:6: (lv_slots_6_0= ruleRoleModelSlot )
                    	    // InternalDSL.g:992:7: lv_slots_6_0= ruleRoleModelSlot
                    	    {

                    	    							newCompositeNode(grammarAccess.getRoleModelAccess().getSlotsRoleModelSlotParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
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
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getRoleModelAccess().getRightParenthesisKeyword_3_3());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_8, grammarAccess.getRoleModelAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalDSL.g:1019:3: ( (lv_initialization_9_0= ruleCompositionOperator ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==24) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDSL.g:1020:4: (lv_initialization_9_0= ruleCompositionOperator )
            	    {
            	    // InternalDSL.g:1020:4: (lv_initialization_9_0= ruleCompositionOperator )
            	    // InternalDSL.g:1021:5: lv_initialization_9_0= ruleCompositionOperator
            	    {

            	    					newCompositeNode(grammarAccess.getRoleModelAccess().getInitializationCompositionOperatorParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_15);
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
            	    break loop16;
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
    // InternalDSL.g:1046:1: entryRuleRoleModelSlot returns [EObject current=null] : iv_ruleRoleModelSlot= ruleRoleModelSlot EOF ;
    public final EObject entryRuleRoleModelSlot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoleModelSlot = null;


        try {
            // InternalDSL.g:1046:54: (iv_ruleRoleModelSlot= ruleRoleModelSlot EOF )
            // InternalDSL.g:1047:2: iv_ruleRoleModelSlot= ruleRoleModelSlot EOF
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
    // InternalDSL.g:1053:1: ruleRoleModelSlot returns [EObject current=null] : ( () ( ( ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleRoleModelSlot() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1059:2: ( ( () ( ( ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalDSL.g:1060:2: ( () ( ( ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalDSL.g:1060:2: ( () ( ( ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) )
            // InternalDSL.g:1061:3: () ( ( ruleEString ) ) ( (lv_name_2_0= ruleEString ) )
            {
            // InternalDSL.g:1061:3: ()
            // InternalDSL.g:1062:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRoleModelSlotAccess().getRoleModelSlotAction_0(),
            					current);
            			

            }

            // InternalDSL.g:1068:3: ( ( ruleEString ) )
            // InternalDSL.g:1069:4: ( ruleEString )
            {
            // InternalDSL.g:1069:4: ( ruleEString )
            // InternalDSL.g:1070:5: ruleEString
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

            // InternalDSL.g:1084:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDSL.g:1085:4: (lv_name_2_0= ruleEString )
            {
            // InternalDSL.g:1085:4: (lv_name_2_0= ruleEString )
            // InternalDSL.g:1086:5: lv_name_2_0= ruleEString
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
    // InternalDSL.g:1107:1: entryRuleBindOperator returns [EObject current=null] : iv_ruleBindOperator= ruleBindOperator EOF ;
    public final EObject entryRuleBindOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindOperator = null;


        try {
            // InternalDSL.g:1107:53: (iv_ruleBindOperator= ruleBindOperator EOF )
            // InternalDSL.g:1108:2: iv_ruleBindOperator= ruleBindOperator EOF
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
    // InternalDSL.g:1114:1: ruleBindOperator returns [EObject current=null] : ( () otherlv_1= 'bind' otherlv_2= 'role' ( ( ruleEString ) ) otherlv_4= 'to' ( ( ruleEString ) ) otherlv_6= ';' ) ;
    public final EObject ruleBindOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalDSL.g:1120:2: ( ( () otherlv_1= 'bind' otherlv_2= 'role' ( ( ruleEString ) ) otherlv_4= 'to' ( ( ruleEString ) ) otherlv_6= ';' ) )
            // InternalDSL.g:1121:2: ( () otherlv_1= 'bind' otherlv_2= 'role' ( ( ruleEString ) ) otherlv_4= 'to' ( ( ruleEString ) ) otherlv_6= ';' )
            {
            // InternalDSL.g:1121:2: ( () otherlv_1= 'bind' otherlv_2= 'role' ( ( ruleEString ) ) otherlv_4= 'to' ( ( ruleEString ) ) otherlv_6= ';' )
            // InternalDSL.g:1122:3: () otherlv_1= 'bind' otherlv_2= 'role' ( ( ruleEString ) ) otherlv_4= 'to' ( ( ruleEString ) ) otherlv_6= ';'
            {
            // InternalDSL.g:1122:3: ()
            // InternalDSL.g:1123:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBindOperatorAccess().getBindOperatorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getBindOperatorAccess().getBindKeyword_1());
            		
            otherlv_2=(Token)match(input,25,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getBindOperatorAccess().getRoleKeyword_2());
            		
            // InternalDSL.g:1137:3: ( ( ruleEString ) )
            // InternalDSL.g:1138:4: ( ruleEString )
            {
            // InternalDSL.g:1138:4: ( ruleEString )
            // InternalDSL.g:1139:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBindOperatorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getBindOperatorAccess().getToPortTypeCrossReference_3_0());
            				
            pushFollow(FOLLOW_17);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getBindOperatorAccess().getToKeyword_4());
            		
            // InternalDSL.g:1157:3: ( ( ruleEString ) )
            // InternalDSL.g:1158:4: ( ruleEString )
            {
            // InternalDSL.g:1158:4: ( ruleEString )
            // InternalDSL.g:1159:5: ruleEString
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
    // InternalDSL.g:1181:1: entryRuleArchitecture returns [EObject current=null] : iv_ruleArchitecture= ruleArchitecture EOF ;
    public final EObject entryRuleArchitecture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchitecture = null;


        try {
            // InternalDSL.g:1181:53: (iv_ruleArchitecture= ruleArchitecture EOF )
            // InternalDSL.g:1182:2: iv_ruleArchitecture= ruleArchitecture EOF
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
    // InternalDSL.g:1188:1: ruleArchitecture returns [EObject current=null] : (otherlv_0= 'Architecture' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '::' ( ( ruleEString ) ) otherlv_4= '{' ( (lv_typeBindings_5_0= ruleTypeBinding ) )* otherlv_6= '}' otherlv_7= '{' ( (lv_elements_8_0= ruleArchitectureElement ) )* otherlv_9= '}' ) ;
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
            // InternalDSL.g:1194:2: ( (otherlv_0= 'Architecture' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '::' ( ( ruleEString ) ) otherlv_4= '{' ( (lv_typeBindings_5_0= ruleTypeBinding ) )* otherlv_6= '}' otherlv_7= '{' ( (lv_elements_8_0= ruleArchitectureElement ) )* otherlv_9= '}' ) )
            // InternalDSL.g:1195:2: (otherlv_0= 'Architecture' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '::' ( ( ruleEString ) ) otherlv_4= '{' ( (lv_typeBindings_5_0= ruleTypeBinding ) )* otherlv_6= '}' otherlv_7= '{' ( (lv_elements_8_0= ruleArchitectureElement ) )* otherlv_9= '}' )
            {
            // InternalDSL.g:1195:2: (otherlv_0= 'Architecture' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '::' ( ( ruleEString ) ) otherlv_4= '{' ( (lv_typeBindings_5_0= ruleTypeBinding ) )* otherlv_6= '}' otherlv_7= '{' ( (lv_elements_8_0= ruleArchitectureElement ) )* otherlv_9= '}' )
            // InternalDSL.g:1196:3: otherlv_0= 'Architecture' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '::' ( ( ruleEString ) ) otherlv_4= '{' ( (lv_typeBindings_5_0= ruleTypeBinding ) )* otherlv_6= '}' otherlv_7= '{' ( (lv_elements_8_0= ruleArchitectureElement ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getArchitectureAccess().getArchitectureKeyword_0());
            		
            // InternalDSL.g:1200:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDSL.g:1201:4: (lv_name_1_0= ruleEString )
            {
            // InternalDSL.g:1201:4: (lv_name_1_0= ruleEString )
            // InternalDSL.g:1202:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getArchitectureAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
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

            otherlv_2=(Token)match(input,28,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getArchitectureAccess().getColonColonKeyword_2());
            		
            // InternalDSL.g:1223:3: ( ( ruleEString ) )
            // InternalDSL.g:1224:4: ( ruleEString )
            {
            // InternalDSL.g:1224:4: ( ruleEString )
            // InternalDSL.g:1225:5: ruleEString
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

            otherlv_4=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getArchitectureAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalDSL.g:1243:3: ( (lv_typeBindings_5_0= ruleTypeBinding ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_STRING && LA17_0<=RULE_ID)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDSL.g:1244:4: (lv_typeBindings_5_0= ruleTypeBinding )
            	    {
            	    // InternalDSL.g:1244:4: (lv_typeBindings_5_0= ruleTypeBinding )
            	    // InternalDSL.g:1245:5: lv_typeBindings_5_0= ruleTypeBinding
            	    {

            	    					newCompositeNode(grammarAccess.getArchitectureAccess().getTypeBindingsTypeBindingParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_13);
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
            	    break loop17;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getArchitectureAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_7=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_7, grammarAccess.getArchitectureAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalDSL.g:1270:3: ( (lv_elements_8_0= ruleArchitectureElement ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=29 && LA18_0<=30)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalDSL.g:1271:4: (lv_elements_8_0= ruleArchitectureElement )
            	    {
            	    // InternalDSL.g:1271:4: (lv_elements_8_0= ruleArchitectureElement )
            	    // InternalDSL.g:1272:5: lv_elements_8_0= ruleArchitectureElement
            	    {

            	    					newCompositeNode(grammarAccess.getArchitectureAccess().getElementsArchitectureElementParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_19);
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
            	    break loop18;
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
    // InternalDSL.g:1297:1: entryRuleArchitectureElement returns [EObject current=null] : iv_ruleArchitectureElement= ruleArchitectureElement EOF ;
    public final EObject entryRuleArchitectureElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchitectureElement = null;


        try {
            // InternalDSL.g:1297:60: (iv_ruleArchitectureElement= ruleArchitectureElement EOF )
            // InternalDSL.g:1298:2: iv_ruleArchitectureElement= ruleArchitectureElement EOF
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
    // InternalDSL.g:1304:1: ruleArchitectureElement returns [EObject current=null] : (this_Component_0= ruleComponent | this_Port_1= rulePort ) ;
    public final EObject ruleArchitectureElement() throws RecognitionException {
        EObject current = null;

        EObject this_Component_0 = null;

        EObject this_Port_1 = null;



        	enterRule();

        try {
            // InternalDSL.g:1310:2: ( (this_Component_0= ruleComponent | this_Port_1= rulePort ) )
            // InternalDSL.g:1311:2: (this_Component_0= ruleComponent | this_Port_1= rulePort )
            {
            // InternalDSL.g:1311:2: (this_Component_0= ruleComponent | this_Port_1= rulePort )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            else if ( (LA19_0==30) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalDSL.g:1312:3: this_Component_0= ruleComponent
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
                    // InternalDSL.g:1321:3: this_Port_1= rulePort
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
    // InternalDSL.g:1333:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalDSL.g:1333:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalDSL.g:1334:2: iv_ruleComponent= ruleComponent EOF
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
    // InternalDSL.g:1340:1: ruleComponent returns [EObject current=null] : (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '::' ( ( ruleEString ) ) otherlv_4= ';' ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1346:2: ( (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '::' ( ( ruleEString ) ) otherlv_4= ';' ) )
            // InternalDSL.g:1347:2: (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '::' ( ( ruleEString ) ) otherlv_4= ';' )
            {
            // InternalDSL.g:1347:2: (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '::' ( ( ruleEString ) ) otherlv_4= ';' )
            // InternalDSL.g:1348:3: otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '::' ( ( ruleEString ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0());
            		
            // InternalDSL.g:1352:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDSL.g:1353:4: (lv_name_1_0= ruleEString )
            {
            // InternalDSL.g:1353:4: (lv_name_1_0= ruleEString )
            // InternalDSL.g:1354:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getComponentAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
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

            otherlv_2=(Token)match(input,28,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getColonColonKeyword_2());
            		
            // InternalDSL.g:1375:3: ( ( ruleEString ) )
            // InternalDSL.g:1376:4: ( ruleEString )
            {
            // InternalDSL.g:1376:4: ( ruleEString )
            // InternalDSL.g:1377:5: ruleEString
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
    // InternalDSL.g:1399:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // InternalDSL.g:1399:45: (iv_rulePort= rulePort EOF )
            // InternalDSL.g:1400:2: iv_rulePort= rulePort EOF
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
    // InternalDSL.g:1406:1: rulePort returns [EObject current=null] : (otherlv_0= 'Port' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '::' ( ( ruleEString ) ) otherlv_4= ';' ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1412:2: ( (otherlv_0= 'Port' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '::' ( ( ruleEString ) ) otherlv_4= ';' ) )
            // InternalDSL.g:1413:2: (otherlv_0= 'Port' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '::' ( ( ruleEString ) ) otherlv_4= ';' )
            {
            // InternalDSL.g:1413:2: (otherlv_0= 'Port' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '::' ( ( ruleEString ) ) otherlv_4= ';' )
            // InternalDSL.g:1414:3: otherlv_0= 'Port' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '::' ( ( ruleEString ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getPortAccess().getPortKeyword_0());
            		
            // InternalDSL.g:1418:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDSL.g:1419:4: (lv_name_1_0= ruleEString )
            {
            // InternalDSL.g:1419:4: (lv_name_1_0= ruleEString )
            // InternalDSL.g:1420:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPortAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
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

            otherlv_2=(Token)match(input,28,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getPortAccess().getColonColonKeyword_2());
            		
            // InternalDSL.g:1441:3: ( ( ruleEString ) )
            // InternalDSL.g:1442:4: ( ruleEString )
            {
            // InternalDSL.g:1442:4: ( ruleEString )
            // InternalDSL.g:1443:5: ruleEString
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
    // InternalDSL.g:1465:1: entryRuleTypeBinding returns [EObject current=null] : iv_ruleTypeBinding= ruleTypeBinding EOF ;
    public final EObject entryRuleTypeBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeBinding = null;


        try {
            // InternalDSL.g:1465:52: (iv_ruleTypeBinding= ruleTypeBinding EOF )
            // InternalDSL.g:1466:2: iv_ruleTypeBinding= ruleTypeBinding EOF
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
    // InternalDSL.g:1472:1: ruleTypeBinding returns [EObject current=null] : ( ( ( ruleEString ) ) otherlv_1= '=' ( (lv_implementation_2_0= ruleEString ) ) otherlv_3= ';' ) ;
    public final EObject ruleTypeBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_implementation_2_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1478:2: ( ( ( ( ruleEString ) ) otherlv_1= '=' ( (lv_implementation_2_0= ruleEString ) ) otherlv_3= ';' ) )
            // InternalDSL.g:1479:2: ( ( ( ruleEString ) ) otherlv_1= '=' ( (lv_implementation_2_0= ruleEString ) ) otherlv_3= ';' )
            {
            // InternalDSL.g:1479:2: ( ( ( ruleEString ) ) otherlv_1= '=' ( (lv_implementation_2_0= ruleEString ) ) otherlv_3= ';' )
            // InternalDSL.g:1480:3: ( ( ruleEString ) ) otherlv_1= '=' ( (lv_implementation_2_0= ruleEString ) ) otherlv_3= ';'
            {
            // InternalDSL.g:1480:3: ( ( ruleEString ) )
            // InternalDSL.g:1481:4: ( ruleEString )
            {
            // InternalDSL.g:1481:4: ( ruleEString )
            // InternalDSL.g:1482:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeBindingRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTypeBindingAccess().getTypeTypeCrossReference_0_0());
            				
            pushFollow(FOLLOW_20);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getTypeBindingAccess().getEqualsSignKeyword_1());
            		
            // InternalDSL.g:1500:3: ( (lv_implementation_2_0= ruleEString ) )
            // InternalDSL.g:1501:4: (lv_implementation_2_0= ruleEString )
            {
            // InternalDSL.g:1501:4: (lv_implementation_2_0= ruleEString )
            // InternalDSL.g:1502:5: lv_implementation_2_0= ruleEString
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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000008008002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000032000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000E02000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000002030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000041000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001002000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000060002000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});

}