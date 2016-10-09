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
    // InternalDSL.g:67:1: entryRuleSmagsModel returns [EObject current=null] : iv_ruleSmagsModel= ruleSmagsModel EOF ;
    public final EObject entryRuleSmagsModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSmagsModel = null;


        try {
            // InternalDSL.g:68:2: (iv_ruleSmagsModel= ruleSmagsModel EOF )
            // InternalDSL.g:69:2: iv_ruleSmagsModel= ruleSmagsModel EOF
            {
             newCompositeNode(grammarAccess.getSmagsModelRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSmagsModel=ruleSmagsModel();

            state._fsp--;

             current =iv_ruleSmagsModel; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalDSL.g:76:1: ruleSmagsModel returns [EObject current=null] : ( () (otherlv_1= 'imports' otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* otherlv_4= '}' )? ( (lv_elements_5_0= ruleSmagsElement ) )* ) ;
    public final EObject ruleSmagsModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_imports_3_0 = null;

        EObject lv_elements_5_0 = null;


         enterRule(); 
            
        try {
            // InternalDSL.g:79:28: ( ( () (otherlv_1= 'imports' otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* otherlv_4= '}' )? ( (lv_elements_5_0= ruleSmagsElement ) )* ) )
            // InternalDSL.g:80:1: ( () (otherlv_1= 'imports' otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* otherlv_4= '}' )? ( (lv_elements_5_0= ruleSmagsElement ) )* )
            {
            // InternalDSL.g:80:1: ( () (otherlv_1= 'imports' otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* otherlv_4= '}' )? ( (lv_elements_5_0= ruleSmagsElement ) )* )
            // InternalDSL.g:80:2: () (otherlv_1= 'imports' otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* otherlv_4= '}' )? ( (lv_elements_5_0= ruleSmagsElement ) )*
            {
            // InternalDSL.g:80:2: ()
            // InternalDSL.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSmagsModelAccess().getSmagsModelAction_0(),
                        current);
                

            }

            // InternalDSL.g:86:2: (otherlv_1= 'imports' otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* otherlv_4= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDSL.g:86:4: otherlv_1= 'imports' otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* otherlv_4= '}'
                    {
                    otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_3); 

                        	newLeafNode(otherlv_1, grammarAccess.getSmagsModelAccess().getImportsKeyword_1_0());
                        
                    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_4); 

                        	newLeafNode(otherlv_2, grammarAccess.getSmagsModelAccess().getLeftCurlyBracketKeyword_1_1());
                        
                    // InternalDSL.g:94:1: ( (lv_imports_3_0= ruleImport ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==RULE_STRING) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalDSL.g:95:1: (lv_imports_3_0= ruleImport )
                    	    {
                    	    // InternalDSL.g:95:1: (lv_imports_3_0= ruleImport )
                    	    // InternalDSL.g:96:3: lv_imports_3_0= ruleImport
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSmagsModelAccess().getImportsImportParserRuleCall_1_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_4);
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

                    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_5); 

                        	newLeafNode(otherlv_4, grammarAccess.getSmagsModelAccess().getRightCurlyBracketKeyword_1_3());
                        

                    }
                    break;

            }

            // InternalDSL.g:116:3: ( (lv_elements_5_0= ruleSmagsElement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15||LA3_0==27) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDSL.g:117:1: (lv_elements_5_0= ruleSmagsElement )
            	    {
            	    // InternalDSL.g:117:1: (lv_elements_5_0= ruleSmagsElement )
            	    // InternalDSL.g:118:3: lv_elements_5_0= ruleSmagsElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSmagsModelAccess().getElementsSmagsElementParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_5);
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
            // InternalDSL.g:143:2: (iv_ruleSmagsElement= ruleSmagsElement EOF )
            // InternalDSL.g:144:2: iv_ruleSmagsElement= ruleSmagsElement EOF
            {
             newCompositeNode(grammarAccess.getSmagsElementRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSmagsElement=ruleSmagsElement();

            state._fsp--;

             current =iv_ruleSmagsElement; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalDSL.g:151:1: ruleSmagsElement returns [EObject current=null] : (this_MetaArchitecture_0= ruleMetaArchitecture | this_Architecture_1= ruleArchitecture ) ;
    public final EObject ruleSmagsElement() throws RecognitionException {
        EObject current = null;

        EObject this_MetaArchitecture_0 = null;

        EObject this_Architecture_1 = null;


         enterRule(); 
            
        try {
            // InternalDSL.g:154:28: ( (this_MetaArchitecture_0= ruleMetaArchitecture | this_Architecture_1= ruleArchitecture ) )
            // InternalDSL.g:155:1: (this_MetaArchitecture_0= ruleMetaArchitecture | this_Architecture_1= ruleArchitecture )
            {
            // InternalDSL.g:155:1: (this_MetaArchitecture_0= ruleMetaArchitecture | this_Architecture_1= ruleArchitecture )
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
                    // InternalDSL.g:156:5: this_MetaArchitecture_0= ruleMetaArchitecture
                    {
                     
                            newCompositeNode(grammarAccess.getSmagsElementAccess().getMetaArchitectureParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_MetaArchitecture_0=ruleMetaArchitecture();

                    state._fsp--;

                     
                            current = this_MetaArchitecture_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalDSL.g:166:5: this_Architecture_1= ruleArchitecture
                    {
                     
                            newCompositeNode(grammarAccess.getSmagsElementAccess().getArchitectureParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDSL.g:182:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalDSL.g:183:2: (iv_ruleImport= ruleImport EOF )
            // InternalDSL.g:184:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalDSL.g:191:1: ruleImport returns [EObject current=null] : ( ( (lv_importURI_0_0= RULE_STRING ) ) otherlv_1= ';' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token lv_importURI_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalDSL.g:194:28: ( ( ( (lv_importURI_0_0= RULE_STRING ) ) otherlv_1= ';' ) )
            // InternalDSL.g:195:1: ( ( (lv_importURI_0_0= RULE_STRING ) ) otherlv_1= ';' )
            {
            // InternalDSL.g:195:1: ( ( (lv_importURI_0_0= RULE_STRING ) ) otherlv_1= ';' )
            // InternalDSL.g:195:2: ( (lv_importURI_0_0= RULE_STRING ) ) otherlv_1= ';'
            {
            // InternalDSL.g:195:2: ( (lv_importURI_0_0= RULE_STRING ) )
            // InternalDSL.g:196:1: (lv_importURI_0_0= RULE_STRING )
            {
            // InternalDSL.g:196:1: (lv_importURI_0_0= RULE_STRING )
            // InternalDSL.g:197:3: lv_importURI_0_0= RULE_STRING
            {
            lv_importURI_0_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); 

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

            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_2); 

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
    // InternalDSL.g:225:1: entryRuleMetaArchitecture returns [EObject current=null] : iv_ruleMetaArchitecture= ruleMetaArchitecture EOF ;
    public final EObject entryRuleMetaArchitecture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaArchitecture = null;


        try {
            // InternalDSL.g:226:2: (iv_ruleMetaArchitecture= ruleMetaArchitecture EOF )
            // InternalDSL.g:227:2: iv_ruleMetaArchitecture= ruleMetaArchitecture EOF
            {
             newCompositeNode(grammarAccess.getMetaArchitectureRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMetaArchitecture=ruleMetaArchitecture();

            state._fsp--;

             current =iv_ruleMetaArchitecture; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalDSL.g:234:1: ruleMetaArchitecture returns [EObject current=null] : (otherlv_0= 'MetaArchitecture' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_types_3_0= ruleType ) )* otherlv_4= '}' otherlv_5= '{' ( (lv_elements_6_0= ruleMetaArchitectureElement ) )* otherlv_7= '}' ) ;
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
            // InternalDSL.g:237:28: ( (otherlv_0= 'MetaArchitecture' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_types_3_0= ruleType ) )* otherlv_4= '}' otherlv_5= '{' ( (lv_elements_6_0= ruleMetaArchitectureElement ) )* otherlv_7= '}' ) )
            // InternalDSL.g:238:1: (otherlv_0= 'MetaArchitecture' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_types_3_0= ruleType ) )* otherlv_4= '}' otherlv_5= '{' ( (lv_elements_6_0= ruleMetaArchitectureElement ) )* otherlv_7= '}' )
            {
            // InternalDSL.g:238:1: (otherlv_0= 'MetaArchitecture' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_types_3_0= ruleType ) )* otherlv_4= '}' otherlv_5= '{' ( (lv_elements_6_0= ruleMetaArchitectureElement ) )* otherlv_7= '}' )
            // InternalDSL.g:238:3: otherlv_0= 'MetaArchitecture' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_types_3_0= ruleType ) )* otherlv_4= '}' otherlv_5= '{' ( (lv_elements_6_0= ruleMetaArchitectureElement ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_7); 

                	newLeafNode(otherlv_0, grammarAccess.getMetaArchitectureAccess().getMetaArchitectureKeyword_0());
                
            // InternalDSL.g:242:1: ( (lv_name_1_0= ruleEString ) )
            // InternalDSL.g:243:1: (lv_name_1_0= ruleEString )
            {
            // InternalDSL.g:243:1: (lv_name_1_0= ruleEString )
            // InternalDSL.g:244:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMetaArchitectureAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_3);
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

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_8); 

                	newLeafNode(otherlv_2, grammarAccess.getMetaArchitectureAccess().getLeftCurlyBracketKeyword_2());
                
            // InternalDSL.g:264:1: ( (lv_types_3_0= ruleType ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=16 && LA5_0<=17)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDSL.g:265:1: (lv_types_3_0= ruleType )
            	    {
            	    // InternalDSL.g:265:1: (lv_types_3_0= ruleType )
            	    // InternalDSL.g:266:3: lv_types_3_0= ruleType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMetaArchitectureAccess().getTypesTypeParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_8);
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

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_4, grammarAccess.getMetaArchitectureAccess().getRightCurlyBracketKeyword_4());
                
            otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_9); 

                	newLeafNode(otherlv_5, grammarAccess.getMetaArchitectureAccess().getLeftCurlyBracketKeyword_5());
                
            // InternalDSL.g:290:1: ( (lv_elements_6_0= ruleMetaArchitectureElement ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=21 && LA6_0<=23)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDSL.g:291:1: (lv_elements_6_0= ruleMetaArchitectureElement )
            	    {
            	    // InternalDSL.g:291:1: (lv_elements_6_0= ruleMetaArchitectureElement )
            	    // InternalDSL.g:292:3: lv_elements_6_0= ruleMetaArchitectureElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMetaArchitectureAccess().getElementsMetaArchitectureElementParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_9);
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

            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_2); 

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
    // InternalDSL.g:320:1: entryRuleMetaArchitectureElement returns [EObject current=null] : iv_ruleMetaArchitectureElement= ruleMetaArchitectureElement EOF ;
    public final EObject entryRuleMetaArchitectureElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaArchitectureElement = null;


        try {
            // InternalDSL.g:321:2: (iv_ruleMetaArchitectureElement= ruleMetaArchitectureElement EOF )
            // InternalDSL.g:322:2: iv_ruleMetaArchitectureElement= ruleMetaArchitectureElement EOF
            {
             newCompositeNode(grammarAccess.getMetaArchitectureElementRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMetaArchitectureElement=ruleMetaArchitectureElement();

            state._fsp--;

             current =iv_ruleMetaArchitectureElement; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalDSL.g:329:1: ruleMetaArchitectureElement returns [EObject current=null] : (this_ComponentType_0= ruleComponentType | this_PortType_1= rulePortType | this_RoleModel_2= ruleRoleModel ) ;
    public final EObject ruleMetaArchitectureElement() throws RecognitionException {
        EObject current = null;

        EObject this_ComponentType_0 = null;

        EObject this_PortType_1 = null;

        EObject this_RoleModel_2 = null;


         enterRule(); 
            
        try {
            // InternalDSL.g:332:28: ( (this_ComponentType_0= ruleComponentType | this_PortType_1= rulePortType | this_RoleModel_2= ruleRoleModel ) )
            // InternalDSL.g:333:1: (this_ComponentType_0= ruleComponentType | this_PortType_1= rulePortType | this_RoleModel_2= ruleRoleModel )
            {
            // InternalDSL.g:333:1: (this_ComponentType_0= ruleComponentType | this_PortType_1= rulePortType | this_RoleModel_2= ruleRoleModel )
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
                    // InternalDSL.g:334:5: this_ComponentType_0= ruleComponentType
                    {
                     
                            newCompositeNode(grammarAccess.getMetaArchitectureElementAccess().getComponentTypeParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ComponentType_0=ruleComponentType();

                    state._fsp--;

                     
                            current = this_ComponentType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalDSL.g:344:5: this_PortType_1= rulePortType
                    {
                     
                            newCompositeNode(grammarAccess.getMetaArchitectureElementAccess().getPortTypeParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_PortType_1=rulePortType();

                    state._fsp--;

                     
                            current = this_PortType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalDSL.g:354:5: this_RoleModel_2= ruleRoleModel
                    {
                     
                            newCompositeNode(grammarAccess.getMetaArchitectureElementAccess().getRoleModelParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDSL.g:370:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalDSL.g:371:2: (iv_ruleType= ruleType EOF )
            // InternalDSL.g:372:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalDSL.g:379:1: ruleType returns [EObject current=null] : (this_ExternalType_0= ruleExternalType | this_PrimitiveType_1= rulePrimitiveType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_ExternalType_0 = null;

        EObject this_PrimitiveType_1 = null;


         enterRule(); 
            
        try {
            // InternalDSL.g:382:28: ( (this_ExternalType_0= ruleExternalType | this_PrimitiveType_1= rulePrimitiveType ) )
            // InternalDSL.g:383:1: (this_ExternalType_0= ruleExternalType | this_PrimitiveType_1= rulePrimitiveType )
            {
            // InternalDSL.g:383:1: (this_ExternalType_0= ruleExternalType | this_PrimitiveType_1= rulePrimitiveType )
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
                    // InternalDSL.g:384:5: this_ExternalType_0= ruleExternalType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getExternalTypeParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ExternalType_0=ruleExternalType();

                    state._fsp--;

                     
                            current = this_ExternalType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalDSL.g:394:5: this_PrimitiveType_1= rulePrimitiveType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDSL.g:410:1: entryRuleExternalType returns [EObject current=null] : iv_ruleExternalType= ruleExternalType EOF ;
    public final EObject entryRuleExternalType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalType = null;


        try {
            // InternalDSL.g:411:2: (iv_ruleExternalType= ruleExternalType EOF )
            // InternalDSL.g:412:2: iv_ruleExternalType= ruleExternalType EOF
            {
             newCompositeNode(grammarAccess.getExternalTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleExternalType=ruleExternalType();

            state._fsp--;

             current =iv_ruleExternalType; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalDSL.g:419:1: ruleExternalType returns [EObject current=null] : (otherlv_0= 'Type' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ';' ) ;
    public final EObject ruleExternalType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // InternalDSL.g:422:28: ( (otherlv_0= 'Type' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ';' ) )
            // InternalDSL.g:423:1: (otherlv_0= 'Type' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ';' )
            {
            // InternalDSL.g:423:1: (otherlv_0= 'Type' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ';' )
            // InternalDSL.g:423:3: otherlv_0= 'Type' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_7); 

                	newLeafNode(otherlv_0, grammarAccess.getExternalTypeAccess().getTypeKeyword_0());
                
            // InternalDSL.g:427:1: ( (lv_name_1_0= ruleEString ) )
            // InternalDSL.g:428:1: (lv_name_1_0= ruleEString )
            {
            // InternalDSL.g:428:1: (lv_name_1_0= ruleEString )
            // InternalDSL.g:429:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getExternalTypeAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_6);
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

            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_2); 

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
    // InternalDSL.g:457:1: entryRulePrimitiveType returns [EObject current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final EObject entryRulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveType = null;


        try {
            // InternalDSL.g:458:2: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // InternalDSL.g:459:2: iv_rulePrimitiveType= rulePrimitiveType EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePrimitiveType=rulePrimitiveType();

            state._fsp--;

             current =iv_rulePrimitiveType; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalDSL.g:466:1: rulePrimitiveType returns [EObject current=null] : (otherlv_0= 'Primitive' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ';' ) ;
    public final EObject rulePrimitiveType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // InternalDSL.g:469:28: ( (otherlv_0= 'Primitive' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ';' ) )
            // InternalDSL.g:470:1: (otherlv_0= 'Primitive' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ';' )
            {
            // InternalDSL.g:470:1: (otherlv_0= 'Primitive' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ';' )
            // InternalDSL.g:470:3: otherlv_0= 'Primitive' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_7); 

                	newLeafNode(otherlv_0, grammarAccess.getPrimitiveTypeAccess().getPrimitiveKeyword_0());
                
            // InternalDSL.g:474:1: ( (lv_name_1_0= ruleEString ) )
            // InternalDSL.g:475:1: (lv_name_1_0= ruleEString )
            {
            // InternalDSL.g:475:1: (lv_name_1_0= ruleEString )
            // InternalDSL.g:476:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_6);
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

            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_2); 

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
    // InternalDSL.g:504:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalDSL.g:505:2: (iv_ruleVariable= ruleVariable EOF )
            // InternalDSL.g:506:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalDSL.g:513:1: ruleVariable returns [EObject current=null] : ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // InternalDSL.g:516:28: ( ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalDSL.g:517:1: ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalDSL.g:517:1: ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) )
            // InternalDSL.g:517:2: ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) )
            {
            // InternalDSL.g:517:2: ( ( ruleEString ) )
            // InternalDSL.g:518:1: ( ruleEString )
            {
            // InternalDSL.g:518:1: ( ruleEString )
            // InternalDSL.g:519:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getVariableAccess().getTypeTypeCrossReference_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_7);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalDSL.g:532:2: ( (lv_name_1_0= ruleEString ) )
            // InternalDSL.g:533:1: (lv_name_1_0= ruleEString )
            {
            // InternalDSL.g:533:1: (lv_name_1_0= ruleEString )
            // InternalDSL.g:534:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getVariableAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDSL.g:558:1: entryRuleAnonymousVariable returns [EObject current=null] : iv_ruleAnonymousVariable= ruleAnonymousVariable EOF ;
    public final EObject entryRuleAnonymousVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnonymousVariable = null;


        try {
            // InternalDSL.g:559:2: (iv_ruleAnonymousVariable= ruleAnonymousVariable EOF )
            // InternalDSL.g:560:2: iv_ruleAnonymousVariable= ruleAnonymousVariable EOF
            {
             newCompositeNode(grammarAccess.getAnonymousVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAnonymousVariable=ruleAnonymousVariable();

            state._fsp--;

             current =iv_ruleAnonymousVariable; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalDSL.g:567:1: ruleAnonymousVariable returns [EObject current=null] : ( ( ruleEString ) ) ;
    public final EObject ruleAnonymousVariable() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // InternalDSL.g:570:28: ( ( ( ruleEString ) ) )
            // InternalDSL.g:571:1: ( ( ruleEString ) )
            {
            // InternalDSL.g:571:1: ( ( ruleEString ) )
            // InternalDSL.g:572:1: ( ruleEString )
            {
            // InternalDSL.g:572:1: ( ruleEString )
            // InternalDSL.g:573:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAnonymousVariableRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAnonymousVariableAccess().getTypeTypeCrossReference_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDSL.g:594:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalDSL.g:595:2: (iv_ruleMethod= ruleMethod EOF )
            // InternalDSL.g:596:2: iv_ruleMethod= ruleMethod EOF
            {
             newCompositeNode(grammarAccess.getMethodRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMethod=ruleMethod();

            state._fsp--;

             current =iv_ruleMethod; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalDSL.g:603:1: ruleMethod returns [EObject current=null] : ( ( (lv_returnType_0_0= ruleAnonymousVariable ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleVariable ) ) )* )? otherlv_6= ')' ) ;
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
            // InternalDSL.g:606:28: ( ( ( (lv_returnType_0_0= ruleAnonymousVariable ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleVariable ) ) )* )? otherlv_6= ')' ) )
            // InternalDSL.g:607:1: ( ( (lv_returnType_0_0= ruleAnonymousVariable ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleVariable ) ) )* )? otherlv_6= ')' )
            {
            // InternalDSL.g:607:1: ( ( (lv_returnType_0_0= ruleAnonymousVariable ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleVariable ) ) )* )? otherlv_6= ')' )
            // InternalDSL.g:607:2: ( (lv_returnType_0_0= ruleAnonymousVariable ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleVariable ) ) )* )? otherlv_6= ')'
            {
            // InternalDSL.g:607:2: ( (lv_returnType_0_0= ruleAnonymousVariable ) )
            // InternalDSL.g:608:1: (lv_returnType_0_0= ruleAnonymousVariable )
            {
            // InternalDSL.g:608:1: (lv_returnType_0_0= ruleAnonymousVariable )
            // InternalDSL.g:609:3: lv_returnType_0_0= ruleAnonymousVariable
            {
             
            	        newCompositeNode(grammarAccess.getMethodAccess().getReturnTypeAnonymousVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_7);
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

            // InternalDSL.g:625:2: ( (lv_name_1_0= ruleEString ) )
            // InternalDSL.g:626:1: (lv_name_1_0= ruleEString )
            {
            // InternalDSL.g:626:1: (lv_name_1_0= ruleEString )
            // InternalDSL.g:627:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMethodAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_10);
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

            otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_11); 

                	newLeafNode(otherlv_2, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2());
                
            // InternalDSL.g:647:1: ( ( (lv_args_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleVariable ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_ID)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDSL.g:647:2: ( (lv_args_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleVariable ) ) )*
                    {
                    // InternalDSL.g:647:2: ( (lv_args_3_0= ruleVariable ) )
                    // InternalDSL.g:648:1: (lv_args_3_0= ruleVariable )
                    {
                    // InternalDSL.g:648:1: (lv_args_3_0= ruleVariable )
                    // InternalDSL.g:649:3: lv_args_3_0= ruleVariable
                    {
                     
                    	        newCompositeNode(grammarAccess.getMethodAccess().getArgsVariableParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_12);
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

                    // InternalDSL.g:665:2: (otherlv_4= ',' ( (lv_args_5_0= ruleVariable ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==19) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalDSL.g:665:4: otherlv_4= ',' ( (lv_args_5_0= ruleVariable ) )
                    	    {
                    	    otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_7); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getMethodAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // InternalDSL.g:669:1: ( (lv_args_5_0= ruleVariable ) )
                    	    // InternalDSL.g:670:1: (lv_args_5_0= ruleVariable )
                    	    {
                    	    // InternalDSL.g:670:1: (lv_args_5_0= ruleVariable )
                    	    // InternalDSL.g:671:3: lv_args_5_0= ruleVariable
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMethodAccess().getArgsVariableParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_12);
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

            otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_2); 

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
    // InternalDSL.g:699:1: entryRulePortTypeElement returns [EObject current=null] : iv_rulePortTypeElement= rulePortTypeElement EOF ;
    public final EObject entryRulePortTypeElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePortTypeElement = null;


        try {
            // InternalDSL.g:700:2: (iv_rulePortTypeElement= rulePortTypeElement EOF )
            // InternalDSL.g:701:2: iv_rulePortTypeElement= rulePortTypeElement EOF
            {
             newCompositeNode(grammarAccess.getPortTypeElementRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePortTypeElement=rulePortTypeElement();

            state._fsp--;

             current =iv_rulePortTypeElement; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalDSL.g:708:1: rulePortTypeElement returns [EObject current=null] : ( (this_Variable_0= ruleVariable | this_Method_1= ruleMethod ) otherlv_2= ';' ) ;
    public final EObject rulePortTypeElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Variable_0 = null;

        EObject this_Method_1 = null;


         enterRule(); 
            
        try {
            // InternalDSL.g:711:28: ( ( (this_Variable_0= ruleVariable | this_Method_1= ruleMethod ) otherlv_2= ';' ) )
            // InternalDSL.g:712:1: ( (this_Variable_0= ruleVariable | this_Method_1= ruleMethod ) otherlv_2= ';' )
            {
            // InternalDSL.g:712:1: ( (this_Variable_0= ruleVariable | this_Method_1= ruleMethod ) otherlv_2= ';' )
            // InternalDSL.g:712:2: (this_Variable_0= ruleVariable | this_Method_1= ruleMethod ) otherlv_2= ';'
            {
            // InternalDSL.g:712:2: (this_Variable_0= ruleVariable | this_Method_1= ruleMethod )
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
                    // InternalDSL.g:713:5: this_Variable_0= ruleVariable
                    {
                     
                            newCompositeNode(grammarAccess.getPortTypeElementAccess().getVariableParserRuleCall_0_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_6);
                    this_Variable_0=ruleVariable();

                    state._fsp--;

                     
                            current = this_Variable_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalDSL.g:723:5: this_Method_1= ruleMethod
                    {
                     
                            newCompositeNode(grammarAccess.getPortTypeElementAccess().getMethodParserRuleCall_0_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_6);
                    this_Method_1=ruleMethod();

                    state._fsp--;

                     
                            current = this_Method_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_2); 

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
    // InternalDSL.g:743:1: entryRuleCompositionOperator returns [EObject current=null] : iv_ruleCompositionOperator= ruleCompositionOperator EOF ;
    public final EObject entryRuleCompositionOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositionOperator = null;


        try {
            // InternalDSL.g:744:2: (iv_ruleCompositionOperator= ruleCompositionOperator EOF )
            // InternalDSL.g:745:2: iv_ruleCompositionOperator= ruleCompositionOperator EOF
            {
             newCompositeNode(grammarAccess.getCompositionOperatorRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCompositionOperator=ruleCompositionOperator();

            state._fsp--;

             current =iv_ruleCompositionOperator; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalDSL.g:752:1: ruleCompositionOperator returns [EObject current=null] : this_BindOperator_0= ruleBindOperator ;
    public final EObject ruleCompositionOperator() throws RecognitionException {
        EObject current = null;

        EObject this_BindOperator_0 = null;


         enterRule(); 
            
        try {
            // InternalDSL.g:755:28: (this_BindOperator_0= ruleBindOperator )
            // InternalDSL.g:757:5: this_BindOperator_0= ruleBindOperator
            {
             
                    newCompositeNode(grammarAccess.getCompositionOperatorAccess().getBindOperatorParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDSL.g:773:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDSL.g:774:2: (iv_ruleEString= ruleEString EOF )
            // InternalDSL.g:775:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalDSL.g:782:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // InternalDSL.g:785:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDSL.g:786:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDSL.g:786:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalDSL.g:786:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalDSL.g:794:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

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
    // InternalDSL.g:809:1: entryRuleComponentType returns [EObject current=null] : iv_ruleComponentType= ruleComponentType EOF ;
    public final EObject entryRuleComponentType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentType = null;


        try {
            // InternalDSL.g:810:2: (iv_ruleComponentType= ruleComponentType EOF )
            // InternalDSL.g:811:2: iv_ruleComponentType= ruleComponentType EOF
            {
             newCompositeNode(grammarAccess.getComponentTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleComponentType=ruleComponentType();

            state._fsp--;

             current =iv_ruleComponentType; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalDSL.g:818:1: ruleComponentType returns [EObject current=null] : ( () otherlv_1= 'ComponentType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ';' ) ;
    public final EObject ruleComponentType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // InternalDSL.g:821:28: ( ( () otherlv_1= 'ComponentType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ';' ) )
            // InternalDSL.g:822:1: ( () otherlv_1= 'ComponentType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ';' )
            {
            // InternalDSL.g:822:1: ( () otherlv_1= 'ComponentType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ';' )
            // InternalDSL.g:822:2: () otherlv_1= 'ComponentType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ';'
            {
            // InternalDSL.g:822:2: ()
            // InternalDSL.g:823:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getComponentTypeAccess().getComponentTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_7); 

                	newLeafNode(otherlv_1, grammarAccess.getComponentTypeAccess().getComponentTypeKeyword_1());
                
            // InternalDSL.g:832:1: ( (lv_name_2_0= ruleEString ) )
            // InternalDSL.g:833:1: (lv_name_2_0= ruleEString )
            {
            // InternalDSL.g:833:1: (lv_name_2_0= ruleEString )
            // InternalDSL.g:834:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getComponentTypeAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_6);
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

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_2); 

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
    // InternalDSL.g:862:1: entryRulePortType returns [EObject current=null] : iv_rulePortType= rulePortType EOF ;
    public final EObject entryRulePortType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePortType = null;


        try {
            // InternalDSL.g:863:2: (iv_rulePortType= rulePortType EOF )
            // InternalDSL.g:864:2: iv_rulePortType= rulePortType EOF
            {
             newCompositeNode(grammarAccess.getPortTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePortType=rulePortType();

            state._fsp--;

             current =iv_rulePortType; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalDSL.g:871:1: rulePortType returns [EObject current=null] : ( () otherlv_1= 'PortType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_elements_4_0= rulePortTypeElement ) )* otherlv_5= '}' ) ;
    public final EObject rulePortType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_elements_4_0 = null;


         enterRule(); 
            
        try {
            // InternalDSL.g:874:28: ( ( () otherlv_1= 'PortType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_elements_4_0= rulePortTypeElement ) )* otherlv_5= '}' ) )
            // InternalDSL.g:875:1: ( () otherlv_1= 'PortType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_elements_4_0= rulePortTypeElement ) )* otherlv_5= '}' )
            {
            // InternalDSL.g:875:1: ( () otherlv_1= 'PortType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_elements_4_0= rulePortTypeElement ) )* otherlv_5= '}' )
            // InternalDSL.g:875:2: () otherlv_1= 'PortType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_elements_4_0= rulePortTypeElement ) )* otherlv_5= '}'
            {
            // InternalDSL.g:875:2: ()
            // InternalDSL.g:876:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPortTypeAccess().getPortTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_7); 

                	newLeafNode(otherlv_1, grammarAccess.getPortTypeAccess().getPortTypeKeyword_1());
                
            // InternalDSL.g:885:1: ( (lv_name_2_0= ruleEString ) )
            // InternalDSL.g:886:1: (lv_name_2_0= ruleEString )
            {
            // InternalDSL.g:886:1: (lv_name_2_0= ruleEString )
            // InternalDSL.g:887:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getPortTypeAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_3);
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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_13); 

                	newLeafNode(otherlv_3, grammarAccess.getPortTypeAccess().getLeftCurlyBracketKeyword_3());
                
            // InternalDSL.g:907:1: ( (lv_elements_4_0= rulePortTypeElement ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_STRING && LA13_0<=RULE_ID)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDSL.g:908:1: (lv_elements_4_0= rulePortTypeElement )
            	    {
            	    // InternalDSL.g:908:1: (lv_elements_4_0= rulePortTypeElement )
            	    // InternalDSL.g:909:3: lv_elements_4_0= rulePortTypeElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPortTypeAccess().getElementsPortTypeElementParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_13);
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

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_2); 

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
    // InternalDSL.g:937:1: entryRuleRoleModel returns [EObject current=null] : iv_ruleRoleModel= ruleRoleModel EOF ;
    public final EObject entryRuleRoleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoleModel = null;


        try {
            // InternalDSL.g:938:2: (iv_ruleRoleModel= ruleRoleModel EOF )
            // InternalDSL.g:939:2: iv_ruleRoleModel= ruleRoleModel EOF
            {
             newCompositeNode(grammarAccess.getRoleModelRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRoleModel=ruleRoleModel();

            state._fsp--;

             current =iv_ruleRoleModel; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalDSL.g:946:1: ruleRoleModel returns [EObject current=null] : ( () otherlv_1= 'RoleModel' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_slots_4_0= ruleRoleModelSlot ) ) (otherlv_5= ',' ( (lv_slots_6_0= ruleRoleModelSlot ) ) )* otherlv_7= ')' )? otherlv_8= '{' ( (lv_initialization_9_0= ruleCompositionOperator ) )* otherlv_10= '}' ) ;
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
            // InternalDSL.g:949:28: ( ( () otherlv_1= 'RoleModel' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_slots_4_0= ruleRoleModelSlot ) ) (otherlv_5= ',' ( (lv_slots_6_0= ruleRoleModelSlot ) ) )* otherlv_7= ')' )? otherlv_8= '{' ( (lv_initialization_9_0= ruleCompositionOperator ) )* otherlv_10= '}' ) )
            // InternalDSL.g:950:1: ( () otherlv_1= 'RoleModel' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_slots_4_0= ruleRoleModelSlot ) ) (otherlv_5= ',' ( (lv_slots_6_0= ruleRoleModelSlot ) ) )* otherlv_7= ')' )? otherlv_8= '{' ( (lv_initialization_9_0= ruleCompositionOperator ) )* otherlv_10= '}' )
            {
            // InternalDSL.g:950:1: ( () otherlv_1= 'RoleModel' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_slots_4_0= ruleRoleModelSlot ) ) (otherlv_5= ',' ( (lv_slots_6_0= ruleRoleModelSlot ) ) )* otherlv_7= ')' )? otherlv_8= '{' ( (lv_initialization_9_0= ruleCompositionOperator ) )* otherlv_10= '}' )
            // InternalDSL.g:950:2: () otherlv_1= 'RoleModel' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_slots_4_0= ruleRoleModelSlot ) ) (otherlv_5= ',' ( (lv_slots_6_0= ruleRoleModelSlot ) ) )* otherlv_7= ')' )? otherlv_8= '{' ( (lv_initialization_9_0= ruleCompositionOperator ) )* otherlv_10= '}'
            {
            // InternalDSL.g:950:2: ()
            // InternalDSL.g:951:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRoleModelAccess().getRoleModelAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_7); 

                	newLeafNode(otherlv_1, grammarAccess.getRoleModelAccess().getRoleModelKeyword_1());
                
            // InternalDSL.g:960:1: ( (lv_name_2_0= ruleEString ) )
            // InternalDSL.g:961:1: (lv_name_2_0= ruleEString )
            {
            // InternalDSL.g:961:1: (lv_name_2_0= ruleEString )
            // InternalDSL.g:962:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRoleModelAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_14);
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

            // InternalDSL.g:978:2: (otherlv_3= '(' ( (lv_slots_4_0= ruleRoleModelSlot ) ) (otherlv_5= ',' ( (lv_slots_6_0= ruleRoleModelSlot ) ) )* otherlv_7= ')' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDSL.g:978:4: otherlv_3= '(' ( (lv_slots_4_0= ruleRoleModelSlot ) ) (otherlv_5= ',' ( (lv_slots_6_0= ruleRoleModelSlot ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_7); 

                        	newLeafNode(otherlv_3, grammarAccess.getRoleModelAccess().getLeftParenthesisKeyword_3_0());
                        
                    // InternalDSL.g:982:1: ( (lv_slots_4_0= ruleRoleModelSlot ) )
                    // InternalDSL.g:983:1: (lv_slots_4_0= ruleRoleModelSlot )
                    {
                    // InternalDSL.g:983:1: (lv_slots_4_0= ruleRoleModelSlot )
                    // InternalDSL.g:984:3: lv_slots_4_0= ruleRoleModelSlot
                    {
                     
                    	        newCompositeNode(grammarAccess.getRoleModelAccess().getSlotsRoleModelSlotParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_12);
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

                    // InternalDSL.g:1000:2: (otherlv_5= ',' ( (lv_slots_6_0= ruleRoleModelSlot ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==19) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalDSL.g:1000:4: otherlv_5= ',' ( (lv_slots_6_0= ruleRoleModelSlot ) )
                    	    {
                    	    otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_7); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getRoleModelAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // InternalDSL.g:1004:1: ( (lv_slots_6_0= ruleRoleModelSlot ) )
                    	    // InternalDSL.g:1005:1: (lv_slots_6_0= ruleRoleModelSlot )
                    	    {
                    	    // InternalDSL.g:1005:1: (lv_slots_6_0= ruleRoleModelSlot )
                    	    // InternalDSL.g:1006:3: lv_slots_6_0= ruleRoleModelSlot
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRoleModelAccess().getSlotsRoleModelSlotParserRuleCall_3_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_12);
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

                    otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_3); 

                        	newLeafNode(otherlv_7, grammarAccess.getRoleModelAccess().getRightParenthesisKeyword_3_3());
                        

                    }
                    break;

            }

            otherlv_8=(Token)match(input,12,FollowSets000.FOLLOW_15); 

                	newLeafNode(otherlv_8, grammarAccess.getRoleModelAccess().getLeftCurlyBracketKeyword_4());
                
            // InternalDSL.g:1030:1: ( (lv_initialization_9_0= ruleCompositionOperator ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==24) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDSL.g:1031:1: (lv_initialization_9_0= ruleCompositionOperator )
            	    {
            	    // InternalDSL.g:1031:1: (lv_initialization_9_0= ruleCompositionOperator )
            	    // InternalDSL.g:1032:3: lv_initialization_9_0= ruleCompositionOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRoleModelAccess().getInitializationCompositionOperatorParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_15);
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

            otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_2); 

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
    // InternalDSL.g:1060:1: entryRuleRoleModelSlot returns [EObject current=null] : iv_ruleRoleModelSlot= ruleRoleModelSlot EOF ;
    public final EObject entryRuleRoleModelSlot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoleModelSlot = null;


        try {
            // InternalDSL.g:1061:2: (iv_ruleRoleModelSlot= ruleRoleModelSlot EOF )
            // InternalDSL.g:1062:2: iv_ruleRoleModelSlot= ruleRoleModelSlot EOF
            {
             newCompositeNode(grammarAccess.getRoleModelSlotRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRoleModelSlot=ruleRoleModelSlot();

            state._fsp--;

             current =iv_ruleRoleModelSlot; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalDSL.g:1069:1: ruleRoleModelSlot returns [EObject current=null] : ( () ( ( ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleRoleModelSlot() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // InternalDSL.g:1072:28: ( ( () ( ( ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalDSL.g:1073:1: ( () ( ( ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalDSL.g:1073:1: ( () ( ( ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) )
            // InternalDSL.g:1073:2: () ( ( ruleEString ) ) ( (lv_name_2_0= ruleEString ) )
            {
            // InternalDSL.g:1073:2: ()
            // InternalDSL.g:1074:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRoleModelSlotAccess().getRoleModelSlotAction_0(),
                        current);
                

            }

            // InternalDSL.g:1079:2: ( ( ruleEString ) )
            // InternalDSL.g:1080:1: ( ruleEString )
            {
            // InternalDSL.g:1080:1: ( ruleEString )
            // InternalDSL.g:1081:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRoleModelSlotRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRoleModelSlotAccess().getTypeComponentTypeCrossReference_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_7);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalDSL.g:1094:2: ( (lv_name_2_0= ruleEString ) )
            // InternalDSL.g:1095:1: (lv_name_2_0= ruleEString )
            {
            // InternalDSL.g:1095:1: (lv_name_2_0= ruleEString )
            // InternalDSL.g:1096:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRoleModelSlotAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDSL.g:1120:1: entryRuleBindOperator returns [EObject current=null] : iv_ruleBindOperator= ruleBindOperator EOF ;
    public final EObject entryRuleBindOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindOperator = null;


        try {
            // InternalDSL.g:1121:2: (iv_ruleBindOperator= ruleBindOperator EOF )
            // InternalDSL.g:1122:2: iv_ruleBindOperator= ruleBindOperator EOF
            {
             newCompositeNode(grammarAccess.getBindOperatorRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBindOperator=ruleBindOperator();

            state._fsp--;

             current =iv_ruleBindOperator; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalDSL.g:1129:1: ruleBindOperator returns [EObject current=null] : ( () otherlv_1= 'bind' otherlv_2= 'role' ( ( ruleEString ) ) otherlv_4= 'to' ( ( ruleEString ) ) otherlv_6= ';' ) ;
    public final EObject ruleBindOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // InternalDSL.g:1132:28: ( ( () otherlv_1= 'bind' otherlv_2= 'role' ( ( ruleEString ) ) otherlv_4= 'to' ( ( ruleEString ) ) otherlv_6= ';' ) )
            // InternalDSL.g:1133:1: ( () otherlv_1= 'bind' otherlv_2= 'role' ( ( ruleEString ) ) otherlv_4= 'to' ( ( ruleEString ) ) otherlv_6= ';' )
            {
            // InternalDSL.g:1133:1: ( () otherlv_1= 'bind' otherlv_2= 'role' ( ( ruleEString ) ) otherlv_4= 'to' ( ( ruleEString ) ) otherlv_6= ';' )
            // InternalDSL.g:1133:2: () otherlv_1= 'bind' otherlv_2= 'role' ( ( ruleEString ) ) otherlv_4= 'to' ( ( ruleEString ) ) otherlv_6= ';'
            {
            // InternalDSL.g:1133:2: ()
            // InternalDSL.g:1134:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBindOperatorAccess().getBindOperatorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_16); 

                	newLeafNode(otherlv_1, grammarAccess.getBindOperatorAccess().getBindKeyword_1());
                
            otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_7); 

                	newLeafNode(otherlv_2, grammarAccess.getBindOperatorAccess().getRoleKeyword_2());
                
            // InternalDSL.g:1147:1: ( ( ruleEString ) )
            // InternalDSL.g:1148:1: ( ruleEString )
            {
            // InternalDSL.g:1148:1: ( ruleEString )
            // InternalDSL.g:1149:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBindOperatorRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getBindOperatorAccess().getToPortTypeCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_17);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,26,FollowSets000.FOLLOW_7); 

                	newLeafNode(otherlv_4, grammarAccess.getBindOperatorAccess().getToKeyword_4());
                
            // InternalDSL.g:1166:1: ( ( ruleEString ) )
            // InternalDSL.g:1167:1: ( ruleEString )
            {
            // InternalDSL.g:1167:1: ( ruleEString )
            // InternalDSL.g:1168:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBindOperatorRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getBindOperatorAccess().getSlotRoleModelSlotCrossReference_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_6);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_2); 

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
    // InternalDSL.g:1193:1: entryRuleArchitecture returns [EObject current=null] : iv_ruleArchitecture= ruleArchitecture EOF ;
    public final EObject entryRuleArchitecture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchitecture = null;


        try {
            // InternalDSL.g:1194:2: (iv_ruleArchitecture= ruleArchitecture EOF )
            // InternalDSL.g:1195:2: iv_ruleArchitecture= ruleArchitecture EOF
            {
             newCompositeNode(grammarAccess.getArchitectureRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleArchitecture=ruleArchitecture();

            state._fsp--;

             current =iv_ruleArchitecture; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalDSL.g:1202:1: ruleArchitecture returns [EObject current=null] : (otherlv_0= 'Architecture' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '::' ( ( ruleEString ) ) otherlv_4= '{' ( (lv_typeBindings_5_0= ruleTypeBinding ) )* otherlv_6= '}' otherlv_7= '{' ( (lv_elements_8_0= ruleArchitectureElement ) )* otherlv_9= '}' ) ;
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
            // InternalDSL.g:1205:28: ( (otherlv_0= 'Architecture' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '::' ( ( ruleEString ) ) otherlv_4= '{' ( (lv_typeBindings_5_0= ruleTypeBinding ) )* otherlv_6= '}' otherlv_7= '{' ( (lv_elements_8_0= ruleArchitectureElement ) )* otherlv_9= '}' ) )
            // InternalDSL.g:1206:1: (otherlv_0= 'Architecture' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '::' ( ( ruleEString ) ) otherlv_4= '{' ( (lv_typeBindings_5_0= ruleTypeBinding ) )* otherlv_6= '}' otherlv_7= '{' ( (lv_elements_8_0= ruleArchitectureElement ) )* otherlv_9= '}' )
            {
            // InternalDSL.g:1206:1: (otherlv_0= 'Architecture' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '::' ( ( ruleEString ) ) otherlv_4= '{' ( (lv_typeBindings_5_0= ruleTypeBinding ) )* otherlv_6= '}' otherlv_7= '{' ( (lv_elements_8_0= ruleArchitectureElement ) )* otherlv_9= '}' )
            // InternalDSL.g:1206:3: otherlv_0= 'Architecture' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '::' ( ( ruleEString ) ) otherlv_4= '{' ( (lv_typeBindings_5_0= ruleTypeBinding ) )* otherlv_6= '}' otherlv_7= '{' ( (lv_elements_8_0= ruleArchitectureElement ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_7); 

                	newLeafNode(otherlv_0, grammarAccess.getArchitectureAccess().getArchitectureKeyword_0());
                
            // InternalDSL.g:1210:1: ( (lv_name_1_0= ruleEString ) )
            // InternalDSL.g:1211:1: (lv_name_1_0= ruleEString )
            {
            // InternalDSL.g:1211:1: (lv_name_1_0= ruleEString )
            // InternalDSL.g:1212:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getArchitectureAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_18);
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

            otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_7); 

                	newLeafNode(otherlv_2, grammarAccess.getArchitectureAccess().getColonColonKeyword_2());
                
            // InternalDSL.g:1232:1: ( ( ruleEString ) )
            // InternalDSL.g:1233:1: ( ruleEString )
            {
            // InternalDSL.g:1233:1: ( ruleEString )
            // InternalDSL.g:1234:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getArchitectureRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getArchitectureAccess().getTypeMetaArchitectureCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_3);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_13); 

                	newLeafNode(otherlv_4, grammarAccess.getArchitectureAccess().getLeftCurlyBracketKeyword_4());
                
            // InternalDSL.g:1251:1: ( (lv_typeBindings_5_0= ruleTypeBinding ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_STRING && LA17_0<=RULE_ID)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDSL.g:1252:1: (lv_typeBindings_5_0= ruleTypeBinding )
            	    {
            	    // InternalDSL.g:1252:1: (lv_typeBindings_5_0= ruleTypeBinding )
            	    // InternalDSL.g:1253:3: lv_typeBindings_5_0= ruleTypeBinding
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getArchitectureAccess().getTypeBindingsTypeBindingParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_13);
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

            otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_6, grammarAccess.getArchitectureAccess().getRightCurlyBracketKeyword_6());
                
            otherlv_7=(Token)match(input,12,FollowSets000.FOLLOW_19); 

                	newLeafNode(otherlv_7, grammarAccess.getArchitectureAccess().getLeftCurlyBracketKeyword_7());
                
            // InternalDSL.g:1277:1: ( (lv_elements_8_0= ruleArchitectureElement ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=29 && LA18_0<=30)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalDSL.g:1278:1: (lv_elements_8_0= ruleArchitectureElement )
            	    {
            	    // InternalDSL.g:1278:1: (lv_elements_8_0= ruleArchitectureElement )
            	    // InternalDSL.g:1279:3: lv_elements_8_0= ruleArchitectureElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getArchitectureAccess().getElementsArchitectureElementParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_19);
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

            otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_2); 

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
    // InternalDSL.g:1307:1: entryRuleArchitectureElement returns [EObject current=null] : iv_ruleArchitectureElement= ruleArchitectureElement EOF ;
    public final EObject entryRuleArchitectureElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchitectureElement = null;


        try {
            // InternalDSL.g:1308:2: (iv_ruleArchitectureElement= ruleArchitectureElement EOF )
            // InternalDSL.g:1309:2: iv_ruleArchitectureElement= ruleArchitectureElement EOF
            {
             newCompositeNode(grammarAccess.getArchitectureElementRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleArchitectureElement=ruleArchitectureElement();

            state._fsp--;

             current =iv_ruleArchitectureElement; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalDSL.g:1316:1: ruleArchitectureElement returns [EObject current=null] : (this_Component_0= ruleComponent | this_Port_1= rulePort ) ;
    public final EObject ruleArchitectureElement() throws RecognitionException {
        EObject current = null;

        EObject this_Component_0 = null;

        EObject this_Port_1 = null;


         enterRule(); 
            
        try {
            // InternalDSL.g:1319:28: ( (this_Component_0= ruleComponent | this_Port_1= rulePort ) )
            // InternalDSL.g:1320:1: (this_Component_0= ruleComponent | this_Port_1= rulePort )
            {
            // InternalDSL.g:1320:1: (this_Component_0= ruleComponent | this_Port_1= rulePort )
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
                    // InternalDSL.g:1321:5: this_Component_0= ruleComponent
                    {
                     
                            newCompositeNode(grammarAccess.getArchitectureElementAccess().getComponentParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Component_0=ruleComponent();

                    state._fsp--;

                     
                            current = this_Component_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalDSL.g:1331:5: this_Port_1= rulePort
                    {
                     
                            newCompositeNode(grammarAccess.getArchitectureElementAccess().getPortParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDSL.g:1347:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalDSL.g:1348:2: (iv_ruleComponent= ruleComponent EOF )
            // InternalDSL.g:1349:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalDSL.g:1356:1: ruleComponent returns [EObject current=null] : (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '::' ( ( ruleEString ) ) otherlv_4= ';' ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // InternalDSL.g:1359:28: ( (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '::' ( ( ruleEString ) ) otherlv_4= ';' ) )
            // InternalDSL.g:1360:1: (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '::' ( ( ruleEString ) ) otherlv_4= ';' )
            {
            // InternalDSL.g:1360:1: (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '::' ( ( ruleEString ) ) otherlv_4= ';' )
            // InternalDSL.g:1360:3: otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '::' ( ( ruleEString ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_7); 

                	newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0());
                
            // InternalDSL.g:1364:1: ( (lv_name_1_0= ruleEString ) )
            // InternalDSL.g:1365:1: (lv_name_1_0= ruleEString )
            {
            // InternalDSL.g:1365:1: (lv_name_1_0= ruleEString )
            // InternalDSL.g:1366:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getComponentAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_18);
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

            otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_7); 

                	newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getColonColonKeyword_2());
                
            // InternalDSL.g:1386:1: ( ( ruleEString ) )
            // InternalDSL.g:1387:1: ( ruleEString )
            {
            // InternalDSL.g:1387:1: ( ruleEString )
            // InternalDSL.g:1388:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getComponentRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getComponentAccess().getTypeComponentTypeCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_6);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_2); 

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
    // InternalDSL.g:1413:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // InternalDSL.g:1414:2: (iv_rulePort= rulePort EOF )
            // InternalDSL.g:1415:2: iv_rulePort= rulePort EOF
            {
             newCompositeNode(grammarAccess.getPortRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePort=rulePort();

            state._fsp--;

             current =iv_rulePort; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalDSL.g:1422:1: rulePort returns [EObject current=null] : (otherlv_0= 'Port' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '::' ( ( ruleEString ) ) otherlv_4= ';' ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // InternalDSL.g:1425:28: ( (otherlv_0= 'Port' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '::' ( ( ruleEString ) ) otherlv_4= ';' ) )
            // InternalDSL.g:1426:1: (otherlv_0= 'Port' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '::' ( ( ruleEString ) ) otherlv_4= ';' )
            {
            // InternalDSL.g:1426:1: (otherlv_0= 'Port' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '::' ( ( ruleEString ) ) otherlv_4= ';' )
            // InternalDSL.g:1426:3: otherlv_0= 'Port' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '::' ( ( ruleEString ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_7); 

                	newLeafNode(otherlv_0, grammarAccess.getPortAccess().getPortKeyword_0());
                
            // InternalDSL.g:1430:1: ( (lv_name_1_0= ruleEString ) )
            // InternalDSL.g:1431:1: (lv_name_1_0= ruleEString )
            {
            // InternalDSL.g:1431:1: (lv_name_1_0= ruleEString )
            // InternalDSL.g:1432:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getPortAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_18);
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

            otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_7); 

                	newLeafNode(otherlv_2, grammarAccess.getPortAccess().getColonColonKeyword_2());
                
            // InternalDSL.g:1452:1: ( ( ruleEString ) )
            // InternalDSL.g:1453:1: ( ruleEString )
            {
            // InternalDSL.g:1453:1: ( ruleEString )
            // InternalDSL.g:1454:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPortRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getPortAccess().getTypePortTypeCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_6);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_2); 

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
    // InternalDSL.g:1479:1: entryRuleTypeBinding returns [EObject current=null] : iv_ruleTypeBinding= ruleTypeBinding EOF ;
    public final EObject entryRuleTypeBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeBinding = null;


        try {
            // InternalDSL.g:1480:2: (iv_ruleTypeBinding= ruleTypeBinding EOF )
            // InternalDSL.g:1481:2: iv_ruleTypeBinding= ruleTypeBinding EOF
            {
             newCompositeNode(grammarAccess.getTypeBindingRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypeBinding=ruleTypeBinding();

            state._fsp--;

             current =iv_ruleTypeBinding; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalDSL.g:1488:1: ruleTypeBinding returns [EObject current=null] : ( ( ( ruleEString ) ) otherlv_1= '=' ( (lv_implementation_2_0= ruleEString ) ) otherlv_3= ';' ) ;
    public final EObject ruleTypeBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_implementation_2_0 = null;


         enterRule(); 
            
        try {
            // InternalDSL.g:1491:28: ( ( ( ( ruleEString ) ) otherlv_1= '=' ( (lv_implementation_2_0= ruleEString ) ) otherlv_3= ';' ) )
            // InternalDSL.g:1492:1: ( ( ( ruleEString ) ) otherlv_1= '=' ( (lv_implementation_2_0= ruleEString ) ) otherlv_3= ';' )
            {
            // InternalDSL.g:1492:1: ( ( ( ruleEString ) ) otherlv_1= '=' ( (lv_implementation_2_0= ruleEString ) ) otherlv_3= ';' )
            // InternalDSL.g:1492:2: ( ( ruleEString ) ) otherlv_1= '=' ( (lv_implementation_2_0= ruleEString ) ) otherlv_3= ';'
            {
            // InternalDSL.g:1492:2: ( ( ruleEString ) )
            // InternalDSL.g:1493:1: ( ruleEString )
            {
            // InternalDSL.g:1493:1: ( ruleEString )
            // InternalDSL.g:1494:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTypeBindingRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTypeBindingAccess().getTypeTypeCrossReference_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_20);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_7); 

                	newLeafNode(otherlv_1, grammarAccess.getTypeBindingAccess().getEqualsSignKeyword_1());
                
            // InternalDSL.g:1511:1: ( (lv_implementation_2_0= ruleEString ) )
            // InternalDSL.g:1512:1: (lv_implementation_2_0= ruleEString )
            {
            // InternalDSL.g:1512:1: (lv_implementation_2_0= ruleEString )
            // InternalDSL.g:1513:3: lv_implementation_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTypeBindingAccess().getImplementationEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_6);
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

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_2); 

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


 

    
    private static class FollowSets000 {
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


}