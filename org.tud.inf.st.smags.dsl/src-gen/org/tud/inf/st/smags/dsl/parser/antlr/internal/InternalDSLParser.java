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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'imports'", "'{'", "'}'", "';'", "'MetaArchitecture'", "'with'", "'namespace'", "'Type'", "':'", "'('", "','", "')'", "'ComponentType'", "'provides'", "'PortType'", "'RoleModel'", "'bind'", "'role'", "'to'", "'Architecture'", "'::'", "'Component'", "'Port'", "'='", "'Deployment'", "'val'", "'new'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
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
    // InternalDSL.g:226:1: ruleMetaArchitecture returns [EObject current=null] : (otherlv_0= 'MetaArchitecture' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'with' otherlv_3= 'namespace' ( (lv_namespace_4_0= ruleEString ) ) )? otherlv_5= '{' ( (lv_types_6_0= ruleType ) )* otherlv_7= '}' otherlv_8= '{' ( (lv_elements_9_0= ruleMetaArchitectureElement ) )* otherlv_10= '}' ) ;
    public final EObject ruleMetaArchitecture() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_namespace_4_0 = null;

        EObject lv_types_6_0 = null;

        EObject lv_elements_9_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:232:2: ( (otherlv_0= 'MetaArchitecture' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'with' otherlv_3= 'namespace' ( (lv_namespace_4_0= ruleEString ) ) )? otherlv_5= '{' ( (lv_types_6_0= ruleType ) )* otherlv_7= '}' otherlv_8= '{' ( (lv_elements_9_0= ruleMetaArchitectureElement ) )* otherlv_10= '}' ) )
            // InternalDSL.g:233:2: (otherlv_0= 'MetaArchitecture' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'with' otherlv_3= 'namespace' ( (lv_namespace_4_0= ruleEString ) ) )? otherlv_5= '{' ( (lv_types_6_0= ruleType ) )* otherlv_7= '}' otherlv_8= '{' ( (lv_elements_9_0= ruleMetaArchitectureElement ) )* otherlv_10= '}' )
            {
            // InternalDSL.g:233:2: (otherlv_0= 'MetaArchitecture' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'with' otherlv_3= 'namespace' ( (lv_namespace_4_0= ruleEString ) ) )? otherlv_5= '{' ( (lv_types_6_0= ruleType ) )* otherlv_7= '}' otherlv_8= '{' ( (lv_elements_9_0= ruleMetaArchitectureElement ) )* otherlv_10= '}' )
            // InternalDSL.g:234:3: otherlv_0= 'MetaArchitecture' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'with' otherlv_3= 'namespace' ( (lv_namespace_4_0= ruleEString ) ) )? otherlv_5= '{' ( (lv_types_6_0= ruleType ) )* otherlv_7= '}' otherlv_8= '{' ( (lv_elements_9_0= ruleMetaArchitectureElement ) )* otherlv_10= '}'
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
            				
            pushFollow(FOLLOW_8);
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

            // InternalDSL.g:257:3: (otherlv_2= 'with' otherlv_3= 'namespace' ( (lv_namespace_4_0= ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDSL.g:258:4: otherlv_2= 'with' otherlv_3= 'namespace' ( (lv_namespace_4_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getMetaArchitectureAccess().getWithKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,17,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getMetaArchitectureAccess().getNamespaceKeyword_2_1());
                    			
                    // InternalDSL.g:266:4: ( (lv_namespace_4_0= ruleEString ) )
                    // InternalDSL.g:267:5: (lv_namespace_4_0= ruleEString )
                    {
                    // InternalDSL.g:267:5: (lv_namespace_4_0= ruleEString )
                    // InternalDSL.g:268:6: lv_namespace_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMetaArchitectureAccess().getNamespaceEStringParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_namespace_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMetaArchitectureRule());
                    						}
                    						set(
                    							current,
                    							"namespace",
                    							lv_namespace_4_0,
                    							"org.tud.inf.st.smags.dsl.DSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getMetaArchitectureAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDSL.g:290:3: ( (lv_types_6_0= ruleType ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDSL.g:291:4: (lv_types_6_0= ruleType )
            	    {
            	    // InternalDSL.g:291:4: (lv_types_6_0= ruleType )
            	    // InternalDSL.g:292:5: lv_types_6_0= ruleType
            	    {

            	    					newCompositeNode(grammarAccess.getMetaArchitectureAccess().getTypesTypeParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_types_6_0=ruleType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMetaArchitectureRule());
            	    					}
            	    					add(
            	    						current,
            	    						"types",
            	    						lv_types_6_0,
            	    						"org.tud.inf.st.smags.dsl.DSL.Type");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getMetaArchitectureAccess().getRightCurlyBracketKeyword_5());
            		
            otherlv_8=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_8, grammarAccess.getMetaArchitectureAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalDSL.g:317:3: ( (lv_elements_9_0= ruleMetaArchitectureElement ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==23||(LA7_0>=25 && LA7_0<=26)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDSL.g:318:4: (lv_elements_9_0= ruleMetaArchitectureElement )
            	    {
            	    // InternalDSL.g:318:4: (lv_elements_9_0= ruleMetaArchitectureElement )
            	    // InternalDSL.g:319:5: lv_elements_9_0= ruleMetaArchitectureElement
            	    {

            	    					newCompositeNode(grammarAccess.getMetaArchitectureAccess().getElementsMetaArchitectureElementParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_elements_9_0=ruleMetaArchitectureElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMetaArchitectureRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_9_0,
            	    						"org.tud.inf.st.smags.dsl.DSL.MetaArchitectureElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_10=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getMetaArchitectureAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalDSL.g:344:1: entryRuleMetaArchitectureElement returns [EObject current=null] : iv_ruleMetaArchitectureElement= ruleMetaArchitectureElement EOF ;
    public final EObject entryRuleMetaArchitectureElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaArchitectureElement = null;


        try {
            // InternalDSL.g:344:64: (iv_ruleMetaArchitectureElement= ruleMetaArchitectureElement EOF )
            // InternalDSL.g:345:2: iv_ruleMetaArchitectureElement= ruleMetaArchitectureElement EOF
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
    // InternalDSL.g:351:1: ruleMetaArchitectureElement returns [EObject current=null] : (this_ComponentType_0= ruleComponentType | this_PortType_1= rulePortType | this_RoleModel_2= ruleRoleModel ) ;
    public final EObject ruleMetaArchitectureElement() throws RecognitionException {
        EObject current = null;

        EObject this_ComponentType_0 = null;

        EObject this_PortType_1 = null;

        EObject this_RoleModel_2 = null;



        	enterRule();

        try {
            // InternalDSL.g:357:2: ( (this_ComponentType_0= ruleComponentType | this_PortType_1= rulePortType | this_RoleModel_2= ruleRoleModel ) )
            // InternalDSL.g:358:2: (this_ComponentType_0= ruleComponentType | this_PortType_1= rulePortType | this_RoleModel_2= ruleRoleModel )
            {
            // InternalDSL.g:358:2: (this_ComponentType_0= ruleComponentType | this_PortType_1= rulePortType | this_RoleModel_2= ruleRoleModel )
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
                    // InternalDSL.g:359:3: this_ComponentType_0= ruleComponentType
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
                    // InternalDSL.g:368:3: this_PortType_1= rulePortType
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
                    // InternalDSL.g:377:3: this_RoleModel_2= ruleRoleModel
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
    // InternalDSL.g:389:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalDSL.g:389:45: (iv_ruleType= ruleType EOF )
            // InternalDSL.g:390:2: iv_ruleType= ruleType EOF
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
    // InternalDSL.g:396:1: ruleType returns [EObject current=null] : (otherlv_0= 'Type' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalDSL.g:402:2: ( (otherlv_0= 'Type' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalDSL.g:403:2: (otherlv_0= 'Type' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalDSL.g:403:2: (otherlv_0= 'Type' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // InternalDSL.g:404:3: otherlv_0= 'Type' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeAccess().getTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getTypeAccess().getColonKeyword_1());
            		
            // InternalDSL.g:412:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDSL.g:413:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDSL.g:413:4: (lv_name_2_0= RULE_ID )
            // InternalDSL.g:414:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // InternalDSL.g:438:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalDSL.g:438:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalDSL.g:439:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalDSL.g:445:1: ruleVariable returns [EObject current=null] : ( ( (lv_type_0_0= ruleTypeUse ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:451:2: ( ( ( (lv_type_0_0= ruleTypeUse ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalDSL.g:452:2: ( ( (lv_type_0_0= ruleTypeUse ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalDSL.g:452:2: ( ( (lv_type_0_0= ruleTypeUse ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalDSL.g:453:3: ( (lv_type_0_0= ruleTypeUse ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalDSL.g:453:3: ( (lv_type_0_0= ruleTypeUse ) )
            // InternalDSL.g:454:4: (lv_type_0_0= ruleTypeUse )
            {
            // InternalDSL.g:454:4: (lv_type_0_0= ruleTypeUse )
            // InternalDSL.g:455:5: lv_type_0_0= ruleTypeUse
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getTypeTypeUseParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_13);
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

            // InternalDSL.g:472:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDSL.g:473:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDSL.g:473:4: (lv_name_1_0= RULE_ID )
            // InternalDSL.g:474:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // InternalDSL.g:494:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalDSL.g:494:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalDSL.g:495:2: iv_ruleMethod= ruleMethod EOF
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
    // InternalDSL.g:501:1: ruleMethod returns [EObject current=null] : ( ( (lv_returnType_0_0= ruleTypeUse ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleVariable ) ) )* )? otherlv_6= ')' ) ;
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
            // InternalDSL.g:507:2: ( ( ( (lv_returnType_0_0= ruleTypeUse ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleVariable ) ) )* )? otherlv_6= ')' ) )
            // InternalDSL.g:508:2: ( ( (lv_returnType_0_0= ruleTypeUse ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleVariable ) ) )* )? otherlv_6= ')' )
            {
            // InternalDSL.g:508:2: ( ( (lv_returnType_0_0= ruleTypeUse ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleVariable ) ) )* )? otherlv_6= ')' )
            // InternalDSL.g:509:3: ( (lv_returnType_0_0= ruleTypeUse ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleVariable ) ) )* )? otherlv_6= ')'
            {
            // InternalDSL.g:509:3: ( (lv_returnType_0_0= ruleTypeUse ) )
            // InternalDSL.g:510:4: (lv_returnType_0_0= ruleTypeUse )
            {
            // InternalDSL.g:510:4: (lv_returnType_0_0= ruleTypeUse )
            // InternalDSL.g:511:5: lv_returnType_0_0= ruleTypeUse
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

            // InternalDSL.g:528:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDSL.g:529:4: (lv_name_1_0= ruleEString )
            {
            // InternalDSL.g:529:4: (lv_name_1_0= ruleEString )
            // InternalDSL.g:530:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMethodAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
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

            otherlv_2=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2());
            		
            // InternalDSL.g:551:3: ( ( (lv_args_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleVariable ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_ID)||LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDSL.g:552:4: ( (lv_args_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleVariable ) ) )*
                    {
                    // InternalDSL.g:552:4: ( (lv_args_3_0= ruleVariable ) )
                    // InternalDSL.g:553:5: (lv_args_3_0= ruleVariable )
                    {
                    // InternalDSL.g:553:5: (lv_args_3_0= ruleVariable )
                    // InternalDSL.g:554:6: lv_args_3_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getMethodAccess().getArgsVariableParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_16);
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

                    // InternalDSL.g:571:4: (otherlv_4= ',' ( (lv_args_5_0= ruleVariable ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==21) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalDSL.g:572:5: otherlv_4= ',' ( (lv_args_5_0= ruleVariable ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FOLLOW_17); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getMethodAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalDSL.g:576:5: ( (lv_args_5_0= ruleVariable ) )
                    	    // InternalDSL.g:577:6: (lv_args_5_0= ruleVariable )
                    	    {
                    	    // InternalDSL.g:577:6: (lv_args_5_0= ruleVariable )
                    	    // InternalDSL.g:578:7: lv_args_5_0= ruleVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getMethodAccess().getArgsVariableParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
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
    // InternalDSL.g:605:1: entryRuleTypeUse returns [EObject current=null] : iv_ruleTypeUse= ruleTypeUse EOF ;
    public final EObject entryRuleTypeUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeUse = null;


        try {
            // InternalDSL.g:605:48: (iv_ruleTypeUse= ruleTypeUse EOF )
            // InternalDSL.g:606:2: iv_ruleTypeUse= ruleTypeUse EOF
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
    // InternalDSL.g:612:1: ruleTypeUse returns [EObject current=null] : (this_PrimitiveUse_0= rulePrimitiveUse | this_GenericUse_1= ruleGenericUse ) ;
    public final EObject ruleTypeUse() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveUse_0 = null;

        EObject this_GenericUse_1 = null;



        	enterRule();

        try {
            // InternalDSL.g:618:2: ( (this_PrimitiveUse_0= rulePrimitiveUse | this_GenericUse_1= ruleGenericUse ) )
            // InternalDSL.g:619:2: (this_PrimitiveUse_0= rulePrimitiveUse | this_GenericUse_1= ruleGenericUse )
            {
            // InternalDSL.g:619:2: (this_PrimitiveUse_0= rulePrimitiveUse | this_GenericUse_1= ruleGenericUse )
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
                    // InternalDSL.g:620:3: this_PrimitiveUse_0= rulePrimitiveUse
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
                    // InternalDSL.g:629:3: this_GenericUse_1= ruleGenericUse
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
    // InternalDSL.g:641:1: entryRulePrimitiveUse returns [EObject current=null] : iv_rulePrimitiveUse= rulePrimitiveUse EOF ;
    public final EObject entryRulePrimitiveUse() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveUse = null;


        try {
            // InternalDSL.g:641:53: (iv_rulePrimitiveUse= rulePrimitiveUse EOF )
            // InternalDSL.g:642:2: iv_rulePrimitiveUse= rulePrimitiveUse EOF
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
    // InternalDSL.g:648:1: rulePrimitiveUse returns [EObject current=null] : ( (lv_type_0_0= ruleEString ) ) ;
    public final EObject rulePrimitiveUse() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:654:2: ( ( (lv_type_0_0= ruleEString ) ) )
            // InternalDSL.g:655:2: ( (lv_type_0_0= ruleEString ) )
            {
            // InternalDSL.g:655:2: ( (lv_type_0_0= ruleEString ) )
            // InternalDSL.g:656:3: (lv_type_0_0= ruleEString )
            {
            // InternalDSL.g:656:3: (lv_type_0_0= ruleEString )
            // InternalDSL.g:657:4: lv_type_0_0= ruleEString
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
    // InternalDSL.g:677:1: entryRuleGenericUse returns [EObject current=null] : iv_ruleGenericUse= ruleGenericUse EOF ;
    public final EObject entryRuleGenericUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenericUse = null;


        try {
            // InternalDSL.g:677:51: (iv_ruleGenericUse= ruleGenericUse EOF )
            // InternalDSL.g:678:2: iv_ruleGenericUse= ruleGenericUse EOF
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
    // InternalDSL.g:684:1: ruleGenericUse returns [EObject current=null] : (otherlv_0= ':' ( ( ruleEString ) ) ) ;
    public final EObject ruleGenericUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalDSL.g:690:2: ( (otherlv_0= ':' ( ( ruleEString ) ) ) )
            // InternalDSL.g:691:2: (otherlv_0= ':' ( ( ruleEString ) ) )
            {
            // InternalDSL.g:691:2: (otherlv_0= ':' ( ( ruleEString ) ) )
            // InternalDSL.g:692:3: otherlv_0= ':' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getGenericUseAccess().getColonKeyword_0());
            		
            // InternalDSL.g:696:3: ( ( ruleEString ) )
            // InternalDSL.g:697:4: ( ruleEString )
            {
            // InternalDSL.g:697:4: ( ruleEString )
            // InternalDSL.g:698:5: ruleEString
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
    // InternalDSL.g:716:1: entryRulePortTypeElement returns [EObject current=null] : iv_rulePortTypeElement= rulePortTypeElement EOF ;
    public final EObject entryRulePortTypeElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePortTypeElement = null;


        try {
            // InternalDSL.g:716:56: (iv_rulePortTypeElement= rulePortTypeElement EOF )
            // InternalDSL.g:717:2: iv_rulePortTypeElement= rulePortTypeElement EOF
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
    // InternalDSL.g:723:1: rulePortTypeElement returns [EObject current=null] : ( (this_Variable_0= ruleVariable | this_Method_1= ruleMethod ) otherlv_2= ';' ) ;
    public final EObject rulePortTypeElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Variable_0 = null;

        EObject this_Method_1 = null;



        	enterRule();

        try {
            // InternalDSL.g:729:2: ( ( (this_Variable_0= ruleVariable | this_Method_1= ruleMethod ) otherlv_2= ';' ) )
            // InternalDSL.g:730:2: ( (this_Variable_0= ruleVariable | this_Method_1= ruleMethod ) otherlv_2= ';' )
            {
            // InternalDSL.g:730:2: ( (this_Variable_0= ruleVariable | this_Method_1= ruleMethod ) otherlv_2= ';' )
            // InternalDSL.g:731:3: (this_Variable_0= ruleVariable | this_Method_1= ruleMethod ) otherlv_2= ';'
            {
            // InternalDSL.g:731:3: (this_Variable_0= ruleVariable | this_Method_1= ruleMethod )
            int alt12=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==RULE_ID) ) {
                    int LA12_4 = input.LA(3);

                    if ( (LA12_4==20) ) {
                        alt12=2;
                    }
                    else if ( (LA12_4==14) ) {
                        alt12=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 4, input);

                        throw nvae;
                    }
                }
                else if ( (LA12_1==RULE_STRING) ) {
                    alt12=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA12_2 = input.LA(2);

                if ( (LA12_2==RULE_ID) ) {
                    int LA12_4 = input.LA(3);

                    if ( (LA12_4==20) ) {
                        alt12=2;
                    }
                    else if ( (LA12_4==14) ) {
                        alt12=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 4, input);

                        throw nvae;
                    }
                }
                else if ( (LA12_2==RULE_STRING) ) {
                    alt12=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 2, input);

                    throw nvae;
                }
                }
                break;
            case 19:
                {
                int LA12_3 = input.LA(2);

                if ( (LA12_3==RULE_STRING) ) {
                    int LA12_6 = input.LA(3);

                    if ( (LA12_6==RULE_ID) ) {
                        int LA12_4 = input.LA(4);

                        if ( (LA12_4==20) ) {
                            alt12=2;
                        }
                        else if ( (LA12_4==14) ) {
                            alt12=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 12, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA12_6==RULE_STRING) ) {
                        alt12=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 6, input);

                        throw nvae;
                    }
                }
                else if ( (LA12_3==RULE_ID) ) {
                    int LA12_7 = input.LA(3);

                    if ( (LA12_7==RULE_ID) ) {
                        int LA12_4 = input.LA(4);

                        if ( (LA12_4==20) ) {
                            alt12=2;
                        }
                        else if ( (LA12_4==14) ) {
                            alt12=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 12, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA12_7==RULE_STRING) ) {
                        alt12=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 7, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalDSL.g:732:4: this_Variable_0= ruleVariable
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
                    // InternalDSL.g:741:4: this_Method_1= ruleMethod
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
    // InternalDSL.g:758:1: entryRuleCompositionOperator returns [EObject current=null] : iv_ruleCompositionOperator= ruleCompositionOperator EOF ;
    public final EObject entryRuleCompositionOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositionOperator = null;


        try {
            // InternalDSL.g:758:60: (iv_ruleCompositionOperator= ruleCompositionOperator EOF )
            // InternalDSL.g:759:2: iv_ruleCompositionOperator= ruleCompositionOperator EOF
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
    // InternalDSL.g:765:1: ruleCompositionOperator returns [EObject current=null] : this_BindOperator_0= ruleBindOperator ;
    public final EObject ruleCompositionOperator() throws RecognitionException {
        EObject current = null;

        EObject this_BindOperator_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:771:2: (this_BindOperator_0= ruleBindOperator )
            // InternalDSL.g:772:2: this_BindOperator_0= ruleBindOperator
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
    // InternalDSL.g:783:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDSL.g:783:47: (iv_ruleEString= ruleEString EOF )
            // InternalDSL.g:784:2: iv_ruleEString= ruleEString EOF
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
    // InternalDSL.g:790:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalDSL.g:796:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDSL.g:797:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDSL.g:797:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalDSL.g:798:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDSL.g:806:3: this_ID_1= RULE_ID
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
    // InternalDSL.g:817:1: entryRuleComponentType returns [EObject current=null] : iv_ruleComponentType= ruleComponentType EOF ;
    public final EObject entryRuleComponentType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentType = null;


        try {
            // InternalDSL.g:817:54: (iv_ruleComponentType= ruleComponentType EOF )
            // InternalDSL.g:818:2: iv_ruleComponentType= ruleComponentType EOF
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
    // InternalDSL.g:824:1: ruleComponentType returns [EObject current=null] : ( () otherlv_1= 'ComponentType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'provides' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? otherlv_7= ';' ) ;
    public final EObject ruleComponentType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:830:2: ( ( () otherlv_1= 'ComponentType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'provides' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? otherlv_7= ';' ) )
            // InternalDSL.g:831:2: ( () otherlv_1= 'ComponentType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'provides' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? otherlv_7= ';' )
            {
            // InternalDSL.g:831:2: ( () otherlv_1= 'ComponentType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'provides' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? otherlv_7= ';' )
            // InternalDSL.g:832:3: () otherlv_1= 'ComponentType' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'provides' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? otherlv_7= ';'
            {
            // InternalDSL.g:832:3: ()
            // InternalDSL.g:833:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComponentTypeAccess().getComponentTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentTypeAccess().getComponentTypeKeyword_1());
            		
            // InternalDSL.g:843:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDSL.g:844:4: (lv_name_2_0= ruleEString )
            {
            // InternalDSL.g:844:4: (lv_name_2_0= ruleEString )
            // InternalDSL.g:845:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getComponentTypeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
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

            // InternalDSL.g:862:3: (otherlv_3= 'provides' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDSL.g:863:4: otherlv_3= 'provides' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getComponentTypeAccess().getProvidesKeyword_3_0());
                    			
                    // InternalDSL.g:867:4: ( ( ruleEString ) )
                    // InternalDSL.g:868:5: ( ruleEString )
                    {
                    // InternalDSL.g:868:5: ( ruleEString )
                    // InternalDSL.g:869:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComponentTypeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getComponentTypeAccess().getProvidesPortTypeCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:883:4: (otherlv_5= ',' ( ( ruleEString ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==21) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalDSL.g:884:5: otherlv_5= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_5=(Token)match(input,21,FOLLOW_7); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getComponentTypeAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalDSL.g:888:5: ( ( ruleEString ) )
                    	    // InternalDSL.g:889:6: ( ruleEString )
                    	    {
                    	    // InternalDSL.g:889:6: ( ruleEString )
                    	    // InternalDSL.g:890:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getComponentTypeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getComponentTypeAccess().getProvidesPortTypeCrossReference_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
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
    // InternalDSL.g:914:1: entryRulePortType returns [EObject current=null] : iv_rulePortType= rulePortType EOF ;
    public final EObject entryRulePortType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePortType = null;


        try {
            // InternalDSL.g:914:49: (iv_rulePortType= rulePortType EOF )
            // InternalDSL.g:915:2: iv_rulePortType= rulePortType EOF
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
    // InternalDSL.g:921:1: rulePortType returns [EObject current=null] : ( () otherlv_1= 'PortType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_elements_4_0= rulePortTypeElement ) )* otherlv_5= '}' ) ;
    public final EObject rulePortType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:927:2: ( ( () otherlv_1= 'PortType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_elements_4_0= rulePortTypeElement ) )* otherlv_5= '}' ) )
            // InternalDSL.g:928:2: ( () otherlv_1= 'PortType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_elements_4_0= rulePortTypeElement ) )* otherlv_5= '}' )
            {
            // InternalDSL.g:928:2: ( () otherlv_1= 'PortType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_elements_4_0= rulePortTypeElement ) )* otherlv_5= '}' )
            // InternalDSL.g:929:3: () otherlv_1= 'PortType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_elements_4_0= rulePortTypeElement ) )* otherlv_5= '}'
            {
            // InternalDSL.g:929:3: ()
            // InternalDSL.g:930:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPortTypeAccess().getPortTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getPortTypeAccess().getPortTypeKeyword_1());
            		
            // InternalDSL.g:940:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDSL.g:941:4: (lv_name_2_0= ruleEString )
            {
            // InternalDSL.g:941:4: (lv_name_2_0= ruleEString )
            // InternalDSL.g:942:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getPortTypeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDSL.g:963:3: ( (lv_elements_4_0= rulePortTypeElement ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)||LA16_0==19) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDSL.g:964:4: (lv_elements_4_0= rulePortTypeElement )
            	    {
            	    // InternalDSL.g:964:4: (lv_elements_4_0= rulePortTypeElement )
            	    // InternalDSL.g:965:5: lv_elements_4_0= rulePortTypeElement
            	    {

            	    					newCompositeNode(grammarAccess.getPortTypeAccess().getElementsPortTypeElementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_20);
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
    // InternalDSL.g:990:1: entryRuleRoleModel returns [EObject current=null] : iv_ruleRoleModel= ruleRoleModel EOF ;
    public final EObject entryRuleRoleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoleModel = null;


        try {
            // InternalDSL.g:990:50: (iv_ruleRoleModel= ruleRoleModel EOF )
            // InternalDSL.g:991:2: iv_ruleRoleModel= ruleRoleModel EOF
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
    // InternalDSL.g:997:1: ruleRoleModel returns [EObject current=null] : ( () otherlv_1= 'RoleModel' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_slots_4_0= ruleRoleModelSlot ) ) (otherlv_5= ',' ( (lv_slots_6_0= ruleRoleModelSlot ) ) )* otherlv_7= ')' )? otherlv_8= '{' ( (lv_initialization_9_0= ruleCompositionOperator ) )* otherlv_10= '}' ) ;
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
            // InternalDSL.g:1003:2: ( ( () otherlv_1= 'RoleModel' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_slots_4_0= ruleRoleModelSlot ) ) (otherlv_5= ',' ( (lv_slots_6_0= ruleRoleModelSlot ) ) )* otherlv_7= ')' )? otherlv_8= '{' ( (lv_initialization_9_0= ruleCompositionOperator ) )* otherlv_10= '}' ) )
            // InternalDSL.g:1004:2: ( () otherlv_1= 'RoleModel' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_slots_4_0= ruleRoleModelSlot ) ) (otherlv_5= ',' ( (lv_slots_6_0= ruleRoleModelSlot ) ) )* otherlv_7= ')' )? otherlv_8= '{' ( (lv_initialization_9_0= ruleCompositionOperator ) )* otherlv_10= '}' )
            {
            // InternalDSL.g:1004:2: ( () otherlv_1= 'RoleModel' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_slots_4_0= ruleRoleModelSlot ) ) (otherlv_5= ',' ( (lv_slots_6_0= ruleRoleModelSlot ) ) )* otherlv_7= ')' )? otherlv_8= '{' ( (lv_initialization_9_0= ruleCompositionOperator ) )* otherlv_10= '}' )
            // InternalDSL.g:1005:3: () otherlv_1= 'RoleModel' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_slots_4_0= ruleRoleModelSlot ) ) (otherlv_5= ',' ( (lv_slots_6_0= ruleRoleModelSlot ) ) )* otherlv_7= ')' )? otherlv_8= '{' ( (lv_initialization_9_0= ruleCompositionOperator ) )* otherlv_10= '}'
            {
            // InternalDSL.g:1005:3: ()
            // InternalDSL.g:1006:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRoleModelAccess().getRoleModelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getRoleModelAccess().getRoleModelKeyword_1());
            		
            // InternalDSL.g:1016:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDSL.g:1017:4: (lv_name_2_0= ruleEString )
            {
            // InternalDSL.g:1017:4: (lv_name_2_0= ruleEString )
            // InternalDSL.g:1018:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRoleModelAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
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

            // InternalDSL.g:1035:3: (otherlv_3= '(' ( (lv_slots_4_0= ruleRoleModelSlot ) ) (otherlv_5= ',' ( (lv_slots_6_0= ruleRoleModelSlot ) ) )* otherlv_7= ')' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==20) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDSL.g:1036:4: otherlv_3= '(' ( (lv_slots_4_0= ruleRoleModelSlot ) ) (otherlv_5= ',' ( (lv_slots_6_0= ruleRoleModelSlot ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getRoleModelAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalDSL.g:1040:4: ( (lv_slots_4_0= ruleRoleModelSlot ) )
                    // InternalDSL.g:1041:5: (lv_slots_4_0= ruleRoleModelSlot )
                    {
                    // InternalDSL.g:1041:5: (lv_slots_4_0= ruleRoleModelSlot )
                    // InternalDSL.g:1042:6: lv_slots_4_0= ruleRoleModelSlot
                    {

                    						newCompositeNode(grammarAccess.getRoleModelAccess().getSlotsRoleModelSlotParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_16);
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

                    // InternalDSL.g:1059:4: (otherlv_5= ',' ( (lv_slots_6_0= ruleRoleModelSlot ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==21) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalDSL.g:1060:5: otherlv_5= ',' ( (lv_slots_6_0= ruleRoleModelSlot ) )
                    	    {
                    	    otherlv_5=(Token)match(input,21,FOLLOW_7); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getRoleModelAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalDSL.g:1064:5: ( (lv_slots_6_0= ruleRoleModelSlot ) )
                    	    // InternalDSL.g:1065:6: (lv_slots_6_0= ruleRoleModelSlot )
                    	    {
                    	    // InternalDSL.g:1065:6: (lv_slots_6_0= ruleRoleModelSlot )
                    	    // InternalDSL.g:1066:7: lv_slots_6_0= ruleRoleModelSlot
                    	    {

                    	    							newCompositeNode(grammarAccess.getRoleModelAccess().getSlotsRoleModelSlotParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
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

            otherlv_8=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_8, grammarAccess.getRoleModelAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalDSL.g:1093:3: ( (lv_initialization_9_0= ruleCompositionOperator ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==27) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalDSL.g:1094:4: (lv_initialization_9_0= ruleCompositionOperator )
            	    {
            	    // InternalDSL.g:1094:4: (lv_initialization_9_0= ruleCompositionOperator )
            	    // InternalDSL.g:1095:5: lv_initialization_9_0= ruleCompositionOperator
            	    {

            	    					newCompositeNode(grammarAccess.getRoleModelAccess().getInitializationCompositionOperatorParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_22);
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
    // InternalDSL.g:1120:1: entryRuleRoleModelSlot returns [EObject current=null] : iv_ruleRoleModelSlot= ruleRoleModelSlot EOF ;
    public final EObject entryRuleRoleModelSlot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoleModelSlot = null;


        try {
            // InternalDSL.g:1120:54: (iv_ruleRoleModelSlot= ruleRoleModelSlot EOF )
            // InternalDSL.g:1121:2: iv_ruleRoleModelSlot= ruleRoleModelSlot EOF
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
    // InternalDSL.g:1127:1: ruleRoleModelSlot returns [EObject current=null] : ( () ( ( ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleRoleModelSlot() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1133:2: ( ( () ( ( ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalDSL.g:1134:2: ( () ( ( ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalDSL.g:1134:2: ( () ( ( ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) )
            // InternalDSL.g:1135:3: () ( ( ruleEString ) ) ( (lv_name_2_0= ruleEString ) )
            {
            // InternalDSL.g:1135:3: ()
            // InternalDSL.g:1136:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRoleModelSlotAccess().getRoleModelSlotAction_0(),
            					current);
            			

            }

            // InternalDSL.g:1142:3: ( ( ruleEString ) )
            // InternalDSL.g:1143:4: ( ruleEString )
            {
            // InternalDSL.g:1143:4: ( ruleEString )
            // InternalDSL.g:1144:5: ruleEString
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

            // InternalDSL.g:1158:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDSL.g:1159:4: (lv_name_2_0= ruleEString )
            {
            // InternalDSL.g:1159:4: (lv_name_2_0= ruleEString )
            // InternalDSL.g:1160:5: lv_name_2_0= ruleEString
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
    // InternalDSL.g:1181:1: entryRuleBindOperator returns [EObject current=null] : iv_ruleBindOperator= ruleBindOperator EOF ;
    public final EObject entryRuleBindOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindOperator = null;


        try {
            // InternalDSL.g:1181:53: (iv_ruleBindOperator= ruleBindOperator EOF )
            // InternalDSL.g:1182:2: iv_ruleBindOperator= ruleBindOperator EOF
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
    // InternalDSL.g:1188:1: ruleBindOperator returns [EObject current=null] : ( () otherlv_1= 'bind' otherlv_2= 'role' ( ( ruleEString ) ) otherlv_4= 'to' ( ( ruleEString ) ) otherlv_6= ';' ) ;
    public final EObject ruleBindOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalDSL.g:1194:2: ( ( () otherlv_1= 'bind' otherlv_2= 'role' ( ( ruleEString ) ) otherlv_4= 'to' ( ( ruleEString ) ) otherlv_6= ';' ) )
            // InternalDSL.g:1195:2: ( () otherlv_1= 'bind' otherlv_2= 'role' ( ( ruleEString ) ) otherlv_4= 'to' ( ( ruleEString ) ) otherlv_6= ';' )
            {
            // InternalDSL.g:1195:2: ( () otherlv_1= 'bind' otherlv_2= 'role' ( ( ruleEString ) ) otherlv_4= 'to' ( ( ruleEString ) ) otherlv_6= ';' )
            // InternalDSL.g:1196:3: () otherlv_1= 'bind' otherlv_2= 'role' ( ( ruleEString ) ) otherlv_4= 'to' ( ( ruleEString ) ) otherlv_6= ';'
            {
            // InternalDSL.g:1196:3: ()
            // InternalDSL.g:1197:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBindOperatorAccess().getBindOperatorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getBindOperatorAccess().getBindKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getBindOperatorAccess().getRoleKeyword_2());
            		
            // InternalDSL.g:1211:3: ( ( ruleEString ) )
            // InternalDSL.g:1212:4: ( ruleEString )
            {
            // InternalDSL.g:1212:4: ( ruleEString )
            // InternalDSL.g:1213:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBindOperatorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getBindOperatorAccess().getToPortTypeCrossReference_3_0());
            				
            pushFollow(FOLLOW_24);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,29,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getBindOperatorAccess().getToKeyword_4());
            		
            // InternalDSL.g:1231:3: ( ( ruleEString ) )
            // InternalDSL.g:1232:4: ( ruleEString )
            {
            // InternalDSL.g:1232:4: ( ruleEString )
            // InternalDSL.g:1233:5: ruleEString
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
    // InternalDSL.g:1255:1: entryRuleArchitecture returns [EObject current=null] : iv_ruleArchitecture= ruleArchitecture EOF ;
    public final EObject entryRuleArchitecture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchitecture = null;


        try {
            // InternalDSL.g:1255:53: (iv_ruleArchitecture= ruleArchitecture EOF )
            // InternalDSL.g:1256:2: iv_ruleArchitecture= ruleArchitecture EOF
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
    // InternalDSL.g:1262:1: ruleArchitecture returns [EObject current=null] : (otherlv_0= 'Architecture' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '::' ( ( ruleEString ) ) (otherlv_4= 'with' otherlv_5= 'namespace' ( (lv_namespace_6_0= ruleEString ) ) )? otherlv_7= '{' ( (lv_typeBindings_8_0= ruleTypeBinding ) )* otherlv_9= '}' otherlv_10= '{' ( (lv_elements_11_0= ruleArchitectureElement ) )* otherlv_12= '}' ) ;
    public final EObject ruleArchitecture() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_namespace_6_0 = null;

        EObject lv_typeBindings_8_0 = null;

        EObject lv_elements_11_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1268:2: ( (otherlv_0= 'Architecture' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '::' ( ( ruleEString ) ) (otherlv_4= 'with' otherlv_5= 'namespace' ( (lv_namespace_6_0= ruleEString ) ) )? otherlv_7= '{' ( (lv_typeBindings_8_0= ruleTypeBinding ) )* otherlv_9= '}' otherlv_10= '{' ( (lv_elements_11_0= ruleArchitectureElement ) )* otherlv_12= '}' ) )
            // InternalDSL.g:1269:2: (otherlv_0= 'Architecture' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '::' ( ( ruleEString ) ) (otherlv_4= 'with' otherlv_5= 'namespace' ( (lv_namespace_6_0= ruleEString ) ) )? otherlv_7= '{' ( (lv_typeBindings_8_0= ruleTypeBinding ) )* otherlv_9= '}' otherlv_10= '{' ( (lv_elements_11_0= ruleArchitectureElement ) )* otherlv_12= '}' )
            {
            // InternalDSL.g:1269:2: (otherlv_0= 'Architecture' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '::' ( ( ruleEString ) ) (otherlv_4= 'with' otherlv_5= 'namespace' ( (lv_namespace_6_0= ruleEString ) ) )? otherlv_7= '{' ( (lv_typeBindings_8_0= ruleTypeBinding ) )* otherlv_9= '}' otherlv_10= '{' ( (lv_elements_11_0= ruleArchitectureElement ) )* otherlv_12= '}' )
            // InternalDSL.g:1270:3: otherlv_0= 'Architecture' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '::' ( ( ruleEString ) ) (otherlv_4= 'with' otherlv_5= 'namespace' ( (lv_namespace_6_0= ruleEString ) ) )? otherlv_7= '{' ( (lv_typeBindings_8_0= ruleTypeBinding ) )* otherlv_9= '}' otherlv_10= '{' ( (lv_elements_11_0= ruleArchitectureElement ) )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getArchitectureAccess().getArchitectureKeyword_0());
            		
            // InternalDSL.g:1274:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDSL.g:1275:4: (lv_name_1_0= ruleEString )
            {
            // InternalDSL.g:1275:4: (lv_name_1_0= ruleEString )
            // InternalDSL.g:1276:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getArchitectureAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_25);
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
            		
            // InternalDSL.g:1297:3: ( ( ruleEString ) )
            // InternalDSL.g:1298:4: ( ruleEString )
            {
            // InternalDSL.g:1298:4: ( ruleEString )
            // InternalDSL.g:1299:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArchitectureRule());
            					}
            				

            					newCompositeNode(grammarAccess.getArchitectureAccess().getTypeMetaArchitectureCrossReference_3_0());
            				
            pushFollow(FOLLOW_8);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDSL.g:1313:3: (otherlv_4= 'with' otherlv_5= 'namespace' ( (lv_namespace_6_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==16) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDSL.g:1314:4: otherlv_4= 'with' otherlv_5= 'namespace' ( (lv_namespace_6_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getArchitectureAccess().getWithKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,17,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getArchitectureAccess().getNamespaceKeyword_4_1());
                    			
                    // InternalDSL.g:1322:4: ( (lv_namespace_6_0= ruleEString ) )
                    // InternalDSL.g:1323:5: (lv_namespace_6_0= ruleEString )
                    {
                    // InternalDSL.g:1323:5: (lv_namespace_6_0= ruleEString )
                    // InternalDSL.g:1324:6: lv_namespace_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getArchitectureAccess().getNamespaceEStringParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_namespace_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArchitectureRule());
                    						}
                    						set(
                    							current,
                    							"namespace",
                    							lv_namespace_6_0,
                    							"org.tud.inf.st.smags.dsl.DSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_7, grammarAccess.getArchitectureAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalDSL.g:1346:3: ( (lv_typeBindings_8_0= ruleTypeBinding ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalDSL.g:1347:4: (lv_typeBindings_8_0= ruleTypeBinding )
            	    {
            	    // InternalDSL.g:1347:4: (lv_typeBindings_8_0= ruleTypeBinding )
            	    // InternalDSL.g:1348:5: lv_typeBindings_8_0= ruleTypeBinding
            	    {

            	    					newCompositeNode(grammarAccess.getArchitectureAccess().getTypeBindingsTypeBindingParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_26);
            	    lv_typeBindings_8_0=ruleTypeBinding();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getArchitectureRule());
            	    					}
            	    					add(
            	    						current,
            	    						"typeBindings",
            	    						lv_typeBindings_8_0,
            	    						"org.tud.inf.st.smags.dsl.DSL.TypeBinding");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_9=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getArchitectureAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_10=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_10, grammarAccess.getArchitectureAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalDSL.g:1373:3: ( (lv_elements_11_0= ruleArchitectureElement ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=32 && LA22_0<=33)||LA22_0==35) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalDSL.g:1374:4: (lv_elements_11_0= ruleArchitectureElement )
            	    {
            	    // InternalDSL.g:1374:4: (lv_elements_11_0= ruleArchitectureElement )
            	    // InternalDSL.g:1375:5: lv_elements_11_0= ruleArchitectureElement
            	    {

            	    					newCompositeNode(grammarAccess.getArchitectureAccess().getElementsArchitectureElementParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_27);
            	    lv_elements_11_0=ruleArchitectureElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getArchitectureRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_11_0,
            	    						"org.tud.inf.st.smags.dsl.DSL.ArchitectureElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_12=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getArchitectureAccess().getRightCurlyBracketKeyword_10());
            		

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
    // InternalDSL.g:1400:1: entryRuleArchitectureElement returns [EObject current=null] : iv_ruleArchitectureElement= ruleArchitectureElement EOF ;
    public final EObject entryRuleArchitectureElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchitectureElement = null;


        try {
            // InternalDSL.g:1400:60: (iv_ruleArchitectureElement= ruleArchitectureElement EOF )
            // InternalDSL.g:1401:2: iv_ruleArchitectureElement= ruleArchitectureElement EOF
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
    // InternalDSL.g:1407:1: ruleArchitectureElement returns [EObject current=null] : (this_Component_0= ruleComponent | this_Port_1= rulePort | this_Deployment_2= ruleDeployment ) ;
    public final EObject ruleArchitectureElement() throws RecognitionException {
        EObject current = null;

        EObject this_Component_0 = null;

        EObject this_Port_1 = null;

        EObject this_Deployment_2 = null;



        	enterRule();

        try {
            // InternalDSL.g:1413:2: ( (this_Component_0= ruleComponent | this_Port_1= rulePort | this_Deployment_2= ruleDeployment ) )
            // InternalDSL.g:1414:2: (this_Component_0= ruleComponent | this_Port_1= rulePort | this_Deployment_2= ruleDeployment )
            {
            // InternalDSL.g:1414:2: (this_Component_0= ruleComponent | this_Port_1= rulePort | this_Deployment_2= ruleDeployment )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt23=1;
                }
                break;
            case 33:
                {
                alt23=2;
                }
                break;
            case 35:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalDSL.g:1415:3: this_Component_0= ruleComponent
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
                    // InternalDSL.g:1424:3: this_Port_1= rulePort
                    {

                    			newCompositeNode(grammarAccess.getArchitectureElementAccess().getPortParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Port_1=rulePort();

                    state._fsp--;


                    			current = this_Port_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDSL.g:1433:3: this_Deployment_2= ruleDeployment
                    {

                    			newCompositeNode(grammarAccess.getArchitectureElementAccess().getDeploymentParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Deployment_2=ruleDeployment();

                    state._fsp--;


                    			current = this_Deployment_2;
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
    // InternalDSL.g:1445:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalDSL.g:1445:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalDSL.g:1446:2: iv_ruleComponent= ruleComponent EOF
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
    // InternalDSL.g:1452:1: ruleComponent returns [EObject current=null] : (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '::' ( ( ruleEString ) ) otherlv_4= ';' ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1458:2: ( (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '::' ( ( ruleEString ) ) otherlv_4= ';' ) )
            // InternalDSL.g:1459:2: (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '::' ( ( ruleEString ) ) otherlv_4= ';' )
            {
            // InternalDSL.g:1459:2: (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '::' ( ( ruleEString ) ) otherlv_4= ';' )
            // InternalDSL.g:1460:3: otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '::' ( ( ruleEString ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0());
            		
            // InternalDSL.g:1464:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDSL.g:1465:4: (lv_name_1_0= ruleEString )
            {
            // InternalDSL.g:1465:4: (lv_name_1_0= ruleEString )
            // InternalDSL.g:1466:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getComponentAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_25);
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
            		
            // InternalDSL.g:1487:3: ( ( ruleEString ) )
            // InternalDSL.g:1488:4: ( ruleEString )
            {
            // InternalDSL.g:1488:4: ( ruleEString )
            // InternalDSL.g:1489:5: ruleEString
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
    // InternalDSL.g:1511:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // InternalDSL.g:1511:45: (iv_rulePort= rulePort EOF )
            // InternalDSL.g:1512:2: iv_rulePort= rulePort EOF
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
    // InternalDSL.g:1518:1: rulePort returns [EObject current=null] : (otherlv_0= 'Port' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '::' ( ( ruleEString ) ) otherlv_4= ';' ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1524:2: ( (otherlv_0= 'Port' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '::' ( ( ruleEString ) ) otherlv_4= ';' ) )
            // InternalDSL.g:1525:2: (otherlv_0= 'Port' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '::' ( ( ruleEString ) ) otherlv_4= ';' )
            {
            // InternalDSL.g:1525:2: (otherlv_0= 'Port' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '::' ( ( ruleEString ) ) otherlv_4= ';' )
            // InternalDSL.g:1526:3: otherlv_0= 'Port' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '::' ( ( ruleEString ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getPortAccess().getPortKeyword_0());
            		
            // InternalDSL.g:1530:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDSL.g:1531:4: (lv_name_1_0= ruleEString )
            {
            // InternalDSL.g:1531:4: (lv_name_1_0= ruleEString )
            // InternalDSL.g:1532:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPortAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_25);
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
            		
            // InternalDSL.g:1553:3: ( ( ruleEString ) )
            // InternalDSL.g:1554:4: ( ruleEString )
            {
            // InternalDSL.g:1554:4: ( ruleEString )
            // InternalDSL.g:1555:5: ruleEString
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
    // InternalDSL.g:1577:1: entryRuleTypeBinding returns [EObject current=null] : iv_ruleTypeBinding= ruleTypeBinding EOF ;
    public final EObject entryRuleTypeBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeBinding = null;


        try {
            // InternalDSL.g:1577:52: (iv_ruleTypeBinding= ruleTypeBinding EOF )
            // InternalDSL.g:1578:2: iv_ruleTypeBinding= ruleTypeBinding EOF
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
    // InternalDSL.g:1584:1: ruleTypeBinding returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_implementation_2_0= ruleEString ) ) otherlv_3= ';' ) ;
    public final EObject ruleTypeBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_implementation_2_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1590:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_implementation_2_0= ruleEString ) ) otherlv_3= ';' ) )
            // InternalDSL.g:1591:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_implementation_2_0= ruleEString ) ) otherlv_3= ';' )
            {
            // InternalDSL.g:1591:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_implementation_2_0= ruleEString ) ) otherlv_3= ';' )
            // InternalDSL.g:1592:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_implementation_2_0= ruleEString ) ) otherlv_3= ';'
            {
            // InternalDSL.g:1592:3: ( (otherlv_0= RULE_ID ) )
            // InternalDSL.g:1593:4: (otherlv_0= RULE_ID )
            {
            // InternalDSL.g:1593:4: (otherlv_0= RULE_ID )
            // InternalDSL.g:1594:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeBindingRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(otherlv_0, grammarAccess.getTypeBindingAccess().getTypeTypeCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getTypeBindingAccess().getEqualsSignKeyword_1());
            		
            // InternalDSL.g:1609:3: ( (lv_implementation_2_0= ruleEString ) )
            // InternalDSL.g:1610:4: (lv_implementation_2_0= ruleEString )
            {
            // InternalDSL.g:1610:4: (lv_implementation_2_0= ruleEString )
            // InternalDSL.g:1611:5: lv_implementation_2_0= ruleEString
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


    // $ANTLR start "entryRuleDeployment"
    // InternalDSL.g:1636:1: entryRuleDeployment returns [EObject current=null] : iv_ruleDeployment= ruleDeployment EOF ;
    public final EObject entryRuleDeployment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeployment = null;


        try {
            // InternalDSL.g:1636:51: (iv_ruleDeployment= ruleDeployment EOF )
            // InternalDSL.g:1637:2: iv_ruleDeployment= ruleDeployment EOF
            {
             newCompositeNode(grammarAccess.getDeploymentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeployment=ruleDeployment();

            state._fsp--;

             current =iv_ruleDeployment; 
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
    // $ANTLR end "entryRuleDeployment"


    // $ANTLR start "ruleDeployment"
    // InternalDSL.g:1643:1: ruleDeployment returns [EObject current=null] : (otherlv_0= 'Deployment' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_script_3_0= ruleDeploymentOperator ) )* otherlv_4= '}' ) ;
    public final EObject ruleDeployment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_script_3_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1649:2: ( (otherlv_0= 'Deployment' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_script_3_0= ruleDeploymentOperator ) )* otherlv_4= '}' ) )
            // InternalDSL.g:1650:2: (otherlv_0= 'Deployment' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_script_3_0= ruleDeploymentOperator ) )* otherlv_4= '}' )
            {
            // InternalDSL.g:1650:2: (otherlv_0= 'Deployment' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_script_3_0= ruleDeploymentOperator ) )* otherlv_4= '}' )
            // InternalDSL.g:1651:3: otherlv_0= 'Deployment' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_script_3_0= ruleDeploymentOperator ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDeploymentAccess().getDeploymentKeyword_0());
            		
            // InternalDSL.g:1655:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDSL.g:1656:4: (lv_name_1_0= ruleEString )
            {
            // InternalDSL.g:1656:4: (lv_name_1_0= ruleEString )
            // InternalDSL.g:1657:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDeploymentAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeploymentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.tud.inf.st.smags.dsl.DSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getDeploymentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDSL.g:1678:3: ( (lv_script_3_0= ruleDeploymentOperator ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=RULE_STRING && LA24_0<=RULE_ID)||LA24_0==36) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalDSL.g:1679:4: (lv_script_3_0= ruleDeploymentOperator )
            	    {
            	    // InternalDSL.g:1679:4: (lv_script_3_0= ruleDeploymentOperator )
            	    // InternalDSL.g:1680:5: lv_script_3_0= ruleDeploymentOperator
            	    {

            	    					newCompositeNode(grammarAccess.getDeploymentAccess().getScriptDeploymentOperatorParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_29);
            	    lv_script_3_0=ruleDeploymentOperator();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDeploymentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"script",
            	    						lv_script_3_0,
            	    						"org.tud.inf.st.smags.dsl.DSL.DeploymentOperator");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDeploymentAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleDeployment"


    // $ANTLR start "entryRuleDeploymentOperator"
    // InternalDSL.g:1705:1: entryRuleDeploymentOperator returns [EObject current=null] : iv_ruleDeploymentOperator= ruleDeploymentOperator EOF ;
    public final EObject entryRuleDeploymentOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeploymentOperator = null;


        try {
            // InternalDSL.g:1705:59: (iv_ruleDeploymentOperator= ruleDeploymentOperator EOF )
            // InternalDSL.g:1706:2: iv_ruleDeploymentOperator= ruleDeploymentOperator EOF
            {
             newCompositeNode(grammarAccess.getDeploymentOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeploymentOperator=ruleDeploymentOperator();

            state._fsp--;

             current =iv_ruleDeploymentOperator; 
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
    // $ANTLR end "entryRuleDeploymentOperator"


    // $ANTLR start "ruleDeploymentOperator"
    // InternalDSL.g:1712:1: ruleDeploymentOperator returns [EObject current=null] : ( (this_ActivateRoleModelOperator_0= ruleActivateRoleModelOperator | this_CreateInstanceOperator_1= ruleCreateInstanceOperator ) otherlv_2= ';' ) ;
    public final EObject ruleDeploymentOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ActivateRoleModelOperator_0 = null;

        EObject this_CreateInstanceOperator_1 = null;



        	enterRule();

        try {
            // InternalDSL.g:1718:2: ( ( (this_ActivateRoleModelOperator_0= ruleActivateRoleModelOperator | this_CreateInstanceOperator_1= ruleCreateInstanceOperator ) otherlv_2= ';' ) )
            // InternalDSL.g:1719:2: ( (this_ActivateRoleModelOperator_0= ruleActivateRoleModelOperator | this_CreateInstanceOperator_1= ruleCreateInstanceOperator ) otherlv_2= ';' )
            {
            // InternalDSL.g:1719:2: ( (this_ActivateRoleModelOperator_0= ruleActivateRoleModelOperator | this_CreateInstanceOperator_1= ruleCreateInstanceOperator ) otherlv_2= ';' )
            // InternalDSL.g:1720:3: (this_ActivateRoleModelOperator_0= ruleActivateRoleModelOperator | this_CreateInstanceOperator_1= ruleCreateInstanceOperator ) otherlv_2= ';'
            {
            // InternalDSL.g:1720:3: (this_ActivateRoleModelOperator_0= ruleActivateRoleModelOperator | this_CreateInstanceOperator_1= ruleCreateInstanceOperator )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_STRING && LA25_0<=RULE_ID)) ) {
                alt25=1;
            }
            else if ( (LA25_0==36) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalDSL.g:1721:4: this_ActivateRoleModelOperator_0= ruleActivateRoleModelOperator
                    {

                    				newCompositeNode(grammarAccess.getDeploymentOperatorAccess().getActivateRoleModelOperatorParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_6);
                    this_ActivateRoleModelOperator_0=ruleActivateRoleModelOperator();

                    state._fsp--;


                    				current = this_ActivateRoleModelOperator_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalDSL.g:1730:4: this_CreateInstanceOperator_1= ruleCreateInstanceOperator
                    {

                    				newCompositeNode(grammarAccess.getDeploymentOperatorAccess().getCreateInstanceOperatorParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_6);
                    this_CreateInstanceOperator_1=ruleCreateInstanceOperator();

                    state._fsp--;


                    				current = this_CreateInstanceOperator_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getDeploymentOperatorAccess().getSemicolonKeyword_1());
            		

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
    // $ANTLR end "ruleDeploymentOperator"


    // $ANTLR start "entryRuleActivateRoleModelOperator"
    // InternalDSL.g:1747:1: entryRuleActivateRoleModelOperator returns [EObject current=null] : iv_ruleActivateRoleModelOperator= ruleActivateRoleModelOperator EOF ;
    public final EObject entryRuleActivateRoleModelOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivateRoleModelOperator = null;


        try {
            // InternalDSL.g:1747:66: (iv_ruleActivateRoleModelOperator= ruleActivateRoleModelOperator EOF )
            // InternalDSL.g:1748:2: iv_ruleActivateRoleModelOperator= ruleActivateRoleModelOperator EOF
            {
             newCompositeNode(grammarAccess.getActivateRoleModelOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActivateRoleModelOperator=ruleActivateRoleModelOperator();

            state._fsp--;

             current =iv_ruleActivateRoleModelOperator; 
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
    // $ANTLR end "entryRuleActivateRoleModelOperator"


    // $ANTLR start "ruleActivateRoleModelOperator"
    // InternalDSL.g:1754:1: ruleActivateRoleModelOperator returns [EObject current=null] : ( ( ( ruleEString ) ) otherlv_1= '(' ( ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleActivateRoleModelOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalDSL.g:1760:2: ( ( ( ( ruleEString ) ) otherlv_1= '(' ( ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* )? otherlv_5= ')' ) )
            // InternalDSL.g:1761:2: ( ( ( ruleEString ) ) otherlv_1= '(' ( ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* )? otherlv_5= ')' )
            {
            // InternalDSL.g:1761:2: ( ( ( ruleEString ) ) otherlv_1= '(' ( ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* )? otherlv_5= ')' )
            // InternalDSL.g:1762:3: ( ( ruleEString ) ) otherlv_1= '(' ( ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* )? otherlv_5= ')'
            {
            // InternalDSL.g:1762:3: ( ( ruleEString ) )
            // InternalDSL.g:1763:4: ( ruleEString )
            {
            // InternalDSL.g:1763:4: ( ruleEString )
            // InternalDSL.g:1764:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActivateRoleModelOperatorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getActivateRoleModelOperatorAccess().getRoleModelRoleModelCrossReference_0_0());
            				
            pushFollow(FOLLOW_14);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getActivateRoleModelOperatorAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDSL.g:1782:3: ( ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=RULE_STRING && LA27_0<=RULE_ID)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalDSL.g:1783:4: ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )*
                    {
                    // InternalDSL.g:1783:4: ( ( ruleEString ) )
                    // InternalDSL.g:1784:5: ( ruleEString )
                    {
                    // InternalDSL.g:1784:5: ( ruleEString )
                    // InternalDSL.g:1785:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActivateRoleModelOperatorRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getActivateRoleModelOperatorAccess().getArgsComponentInstanceCrossReference_2_0_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:1799:4: (otherlv_3= ',' ( ( ruleEString ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==21) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalDSL.g:1800:5: otherlv_3= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_3=(Token)match(input,21,FOLLOW_7); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getActivateRoleModelOperatorAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalDSL.g:1804:5: ( ( ruleEString ) )
                    	    // InternalDSL.g:1805:6: ( ruleEString )
                    	    {
                    	    // InternalDSL.g:1805:6: ( ruleEString )
                    	    // InternalDSL.g:1806:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getActivateRoleModelOperatorRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getActivateRoleModelOperatorAccess().getArgsComponentInstanceCrossReference_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getActivateRoleModelOperatorAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleActivateRoleModelOperator"


    // $ANTLR start "entryRuleCreateInstanceOperator"
    // InternalDSL.g:1830:1: entryRuleCreateInstanceOperator returns [EObject current=null] : iv_ruleCreateInstanceOperator= ruleCreateInstanceOperator EOF ;
    public final EObject entryRuleCreateInstanceOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateInstanceOperator = null;


        try {
            // InternalDSL.g:1830:63: (iv_ruleCreateInstanceOperator= ruleCreateInstanceOperator EOF )
            // InternalDSL.g:1831:2: iv_ruleCreateInstanceOperator= ruleCreateInstanceOperator EOF
            {
             newCompositeNode(grammarAccess.getCreateInstanceOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCreateInstanceOperator=ruleCreateInstanceOperator();

            state._fsp--;

             current =iv_ruleCreateInstanceOperator; 
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
    // $ANTLR end "entryRuleCreateInstanceOperator"


    // $ANTLR start "ruleCreateInstanceOperator"
    // InternalDSL.g:1837:1: ruleCreateInstanceOperator returns [EObject current=null] : ( (lv_instance_0_0= ruleComponentInstance ) ) ;
    public final EObject ruleCreateInstanceOperator() throws RecognitionException {
        EObject current = null;

        EObject lv_instance_0_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1843:2: ( ( (lv_instance_0_0= ruleComponentInstance ) ) )
            // InternalDSL.g:1844:2: ( (lv_instance_0_0= ruleComponentInstance ) )
            {
            // InternalDSL.g:1844:2: ( (lv_instance_0_0= ruleComponentInstance ) )
            // InternalDSL.g:1845:3: (lv_instance_0_0= ruleComponentInstance )
            {
            // InternalDSL.g:1845:3: (lv_instance_0_0= ruleComponentInstance )
            // InternalDSL.g:1846:4: lv_instance_0_0= ruleComponentInstance
            {

            				newCompositeNode(grammarAccess.getCreateInstanceOperatorAccess().getInstanceComponentInstanceParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_instance_0_0=ruleComponentInstance();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getCreateInstanceOperatorRule());
            				}
            				set(
            					current,
            					"instance",
            					lv_instance_0_0,
            					"org.tud.inf.st.smags.dsl.DSL.ComponentInstance");
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
    // $ANTLR end "ruleCreateInstanceOperator"


    // $ANTLR start "entryRuleComponentInstance"
    // InternalDSL.g:1866:1: entryRuleComponentInstance returns [EObject current=null] : iv_ruleComponentInstance= ruleComponentInstance EOF ;
    public final EObject entryRuleComponentInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentInstance = null;


        try {
            // InternalDSL.g:1866:58: (iv_ruleComponentInstance= ruleComponentInstance EOF )
            // InternalDSL.g:1867:2: iv_ruleComponentInstance= ruleComponentInstance EOF
            {
             newCompositeNode(grammarAccess.getComponentInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentInstance=ruleComponentInstance();

            state._fsp--;

             current =iv_ruleComponentInstance; 
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
    // $ANTLR end "entryRuleComponentInstance"


    // $ANTLR start "ruleComponentInstance"
    // InternalDSL.g:1873:1: ruleComponentInstance returns [EObject current=null] : (otherlv_0= 'val' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' otherlv_3= 'new' ( ( ruleEString ) ) otherlv_5= '(' otherlv_6= ')' ) ;
    public final EObject ruleComponentInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:1879:2: ( (otherlv_0= 'val' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' otherlv_3= 'new' ( ( ruleEString ) ) otherlv_5= '(' otherlv_6= ')' ) )
            // InternalDSL.g:1880:2: (otherlv_0= 'val' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' otherlv_3= 'new' ( ( ruleEString ) ) otherlv_5= '(' otherlv_6= ')' )
            {
            // InternalDSL.g:1880:2: (otherlv_0= 'val' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' otherlv_3= 'new' ( ( ruleEString ) ) otherlv_5= '(' otherlv_6= ')' )
            // InternalDSL.g:1881:3: otherlv_0= 'val' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' otherlv_3= 'new' ( ( ruleEString ) ) otherlv_5= '(' otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentInstanceAccess().getValKeyword_0());
            		
            // InternalDSL.g:1885:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDSL.g:1886:4: (lv_name_1_0= ruleEString )
            {
            // InternalDSL.g:1886:4: (lv_name_1_0= ruleEString )
            // InternalDSL.g:1887:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getComponentInstanceAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_28);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentInstanceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.tud.inf.st.smags.dsl.DSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,34,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentInstanceAccess().getEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,37,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getComponentInstanceAccess().getNewKeyword_3());
            		
            // InternalDSL.g:1912:3: ( ( ruleEString ) )
            // InternalDSL.g:1913:4: ( ruleEString )
            {
            // InternalDSL.g:1913:4: ( ruleEString )
            // InternalDSL.g:1914:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentInstanceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getComponentInstanceAccess().getTypeComponentCrossReference_4_0());
            				
            pushFollow(FOLLOW_14);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_32); 

            			newLeafNode(otherlv_5, grammarAccess.getComponentInstanceAccess().getLeftParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getComponentInstanceAccess().getRightParenthesisKeyword_6());
            		

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
    // $ANTLR end "ruleComponentInstance"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000040008002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000006802000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000480030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080030L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000082030L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000101000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008002000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000B00002000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000002030L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000400030L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000400000L});

}