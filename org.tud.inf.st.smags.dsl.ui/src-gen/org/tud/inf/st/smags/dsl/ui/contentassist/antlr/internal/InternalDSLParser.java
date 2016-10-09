package org.tud.inf.st.smags.dsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.tud.inf.st.smags.dsl.services.DSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'imports'", "'{'", "'}'", "';'", "'MetaArchitecture'", "'Type'", "'Primitive'", "'('", "')'", "','", "'ComponentType'", "'PortType'", "'RoleModel'", "'bind'", "'role'", "'to'", "'Architecture'", "'::'", "'Component'", "'Port'", "'='"
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
     	
        public void setGrammarAccess(DSLGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleSmagsModel"
    // InternalDSL.g:60:1: entryRuleSmagsModel : ruleSmagsModel EOF ;
    public final void entryRuleSmagsModel() throws RecognitionException {
        try {
            // InternalDSL.g:61:1: ( ruleSmagsModel EOF )
            // InternalDSL.g:62:1: ruleSmagsModel EOF
            {
             before(grammarAccess.getSmagsModelRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleSmagsModel();

            state._fsp--;

             after(grammarAccess.getSmagsModelRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleSmagsModel"


    // $ANTLR start "ruleSmagsModel"
    // InternalDSL.g:69:1: ruleSmagsModel : ( ( rule__SmagsModel__Group__0 ) ) ;
    public final void ruleSmagsModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:73:2: ( ( ( rule__SmagsModel__Group__0 ) ) )
            // InternalDSL.g:74:1: ( ( rule__SmagsModel__Group__0 ) )
            {
            // InternalDSL.g:74:1: ( ( rule__SmagsModel__Group__0 ) )
            // InternalDSL.g:75:1: ( rule__SmagsModel__Group__0 )
            {
             before(grammarAccess.getSmagsModelAccess().getGroup()); 
            // InternalDSL.g:76:1: ( rule__SmagsModel__Group__0 )
            // InternalDSL.g:76:2: rule__SmagsModel__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SmagsModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSmagsModelAccess().getGroup()); 

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
    // $ANTLR end "ruleSmagsModel"


    // $ANTLR start "entryRuleSmagsElement"
    // InternalDSL.g:88:1: entryRuleSmagsElement : ruleSmagsElement EOF ;
    public final void entryRuleSmagsElement() throws RecognitionException {
        try {
            // InternalDSL.g:89:1: ( ruleSmagsElement EOF )
            // InternalDSL.g:90:1: ruleSmagsElement EOF
            {
             before(grammarAccess.getSmagsElementRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleSmagsElement();

            state._fsp--;

             after(grammarAccess.getSmagsElementRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleSmagsElement"


    // $ANTLR start "ruleSmagsElement"
    // InternalDSL.g:97:1: ruleSmagsElement : ( ( rule__SmagsElement__Alternatives ) ) ;
    public final void ruleSmagsElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:101:2: ( ( ( rule__SmagsElement__Alternatives ) ) )
            // InternalDSL.g:102:1: ( ( rule__SmagsElement__Alternatives ) )
            {
            // InternalDSL.g:102:1: ( ( rule__SmagsElement__Alternatives ) )
            // InternalDSL.g:103:1: ( rule__SmagsElement__Alternatives )
            {
             before(grammarAccess.getSmagsElementAccess().getAlternatives()); 
            // InternalDSL.g:104:1: ( rule__SmagsElement__Alternatives )
            // InternalDSL.g:104:2: rule__SmagsElement__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SmagsElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSmagsElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSmagsElement"


    // $ANTLR start "entryRuleImport"
    // InternalDSL.g:116:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalDSL.g:117:1: ( ruleImport EOF )
            // InternalDSL.g:118:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalDSL.g:125:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:129:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalDSL.g:130:1: ( ( rule__Import__Group__0 ) )
            {
            // InternalDSL.g:130:1: ( ( rule__Import__Group__0 ) )
            // InternalDSL.g:131:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalDSL.g:132:1: ( rule__Import__Group__0 )
            // InternalDSL.g:132:2: rule__Import__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleMetaArchitecture"
    // InternalDSL.g:144:1: entryRuleMetaArchitecture : ruleMetaArchitecture EOF ;
    public final void entryRuleMetaArchitecture() throws RecognitionException {
        try {
            // InternalDSL.g:145:1: ( ruleMetaArchitecture EOF )
            // InternalDSL.g:146:1: ruleMetaArchitecture EOF
            {
             before(grammarAccess.getMetaArchitectureRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMetaArchitecture();

            state._fsp--;

             after(grammarAccess.getMetaArchitectureRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleMetaArchitecture"


    // $ANTLR start "ruleMetaArchitecture"
    // InternalDSL.g:153:1: ruleMetaArchitecture : ( ( rule__MetaArchitecture__Group__0 ) ) ;
    public final void ruleMetaArchitecture() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:157:2: ( ( ( rule__MetaArchitecture__Group__0 ) ) )
            // InternalDSL.g:158:1: ( ( rule__MetaArchitecture__Group__0 ) )
            {
            // InternalDSL.g:158:1: ( ( rule__MetaArchitecture__Group__0 ) )
            // InternalDSL.g:159:1: ( rule__MetaArchitecture__Group__0 )
            {
             before(grammarAccess.getMetaArchitectureAccess().getGroup()); 
            // InternalDSL.g:160:1: ( rule__MetaArchitecture__Group__0 )
            // InternalDSL.g:160:2: rule__MetaArchitecture__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MetaArchitecture__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMetaArchitectureAccess().getGroup()); 

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
    // $ANTLR end "ruleMetaArchitecture"


    // $ANTLR start "entryRuleMetaArchitectureElement"
    // InternalDSL.g:172:1: entryRuleMetaArchitectureElement : ruleMetaArchitectureElement EOF ;
    public final void entryRuleMetaArchitectureElement() throws RecognitionException {
        try {
            // InternalDSL.g:173:1: ( ruleMetaArchitectureElement EOF )
            // InternalDSL.g:174:1: ruleMetaArchitectureElement EOF
            {
             before(grammarAccess.getMetaArchitectureElementRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMetaArchitectureElement();

            state._fsp--;

             after(grammarAccess.getMetaArchitectureElementRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleMetaArchitectureElement"


    // $ANTLR start "ruleMetaArchitectureElement"
    // InternalDSL.g:181:1: ruleMetaArchitectureElement : ( ( rule__MetaArchitectureElement__Alternatives ) ) ;
    public final void ruleMetaArchitectureElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:185:2: ( ( ( rule__MetaArchitectureElement__Alternatives ) ) )
            // InternalDSL.g:186:1: ( ( rule__MetaArchitectureElement__Alternatives ) )
            {
            // InternalDSL.g:186:1: ( ( rule__MetaArchitectureElement__Alternatives ) )
            // InternalDSL.g:187:1: ( rule__MetaArchitectureElement__Alternatives )
            {
             before(grammarAccess.getMetaArchitectureElementAccess().getAlternatives()); 
            // InternalDSL.g:188:1: ( rule__MetaArchitectureElement__Alternatives )
            // InternalDSL.g:188:2: rule__MetaArchitectureElement__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MetaArchitectureElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMetaArchitectureElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleMetaArchitectureElement"


    // $ANTLR start "entryRuleType"
    // InternalDSL.g:200:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalDSL.g:201:1: ( ruleType EOF )
            // InternalDSL.g:202:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalDSL.g:209:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:213:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalDSL.g:214:1: ( ( rule__Type__Alternatives ) )
            {
            // InternalDSL.g:214:1: ( ( rule__Type__Alternatives ) )
            // InternalDSL.g:215:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalDSL.g:216:1: ( rule__Type__Alternatives )
            // InternalDSL.g:216:2: rule__Type__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleExternalType"
    // InternalDSL.g:228:1: entryRuleExternalType : ruleExternalType EOF ;
    public final void entryRuleExternalType() throws RecognitionException {
        try {
            // InternalDSL.g:229:1: ( ruleExternalType EOF )
            // InternalDSL.g:230:1: ruleExternalType EOF
            {
             before(grammarAccess.getExternalTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleExternalType();

            state._fsp--;

             after(grammarAccess.getExternalTypeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleExternalType"


    // $ANTLR start "ruleExternalType"
    // InternalDSL.g:237:1: ruleExternalType : ( ( rule__ExternalType__Group__0 ) ) ;
    public final void ruleExternalType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:241:2: ( ( ( rule__ExternalType__Group__0 ) ) )
            // InternalDSL.g:242:1: ( ( rule__ExternalType__Group__0 ) )
            {
            // InternalDSL.g:242:1: ( ( rule__ExternalType__Group__0 ) )
            // InternalDSL.g:243:1: ( rule__ExternalType__Group__0 )
            {
             before(grammarAccess.getExternalTypeAccess().getGroup()); 
            // InternalDSL.g:244:1: ( rule__ExternalType__Group__0 )
            // InternalDSL.g:244:2: rule__ExternalType__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExternalType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExternalTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleExternalType"


    // $ANTLR start "entryRulePrimitiveType"
    // InternalDSL.g:256:1: entryRulePrimitiveType : rulePrimitiveType EOF ;
    public final void entryRulePrimitiveType() throws RecognitionException {
        try {
            // InternalDSL.g:257:1: ( rulePrimitiveType EOF )
            // InternalDSL.g:258:1: rulePrimitiveType EOF
            {
             before(grammarAccess.getPrimitiveTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            rulePrimitiveType();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRulePrimitiveType"


    // $ANTLR start "rulePrimitiveType"
    // InternalDSL.g:265:1: rulePrimitiveType : ( ( rule__PrimitiveType__Group__0 ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:269:2: ( ( ( rule__PrimitiveType__Group__0 ) ) )
            // InternalDSL.g:270:1: ( ( rule__PrimitiveType__Group__0 ) )
            {
            // InternalDSL.g:270:1: ( ( rule__PrimitiveType__Group__0 ) )
            // InternalDSL.g:271:1: ( rule__PrimitiveType__Group__0 )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getGroup()); 
            // InternalDSL.g:272:1: ( rule__PrimitiveType__Group__0 )
            // InternalDSL.g:272:2: rule__PrimitiveType__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PrimitiveType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypeAccess().getGroup()); 

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
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "entryRuleVariable"
    // InternalDSL.g:284:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalDSL.g:285:1: ( ruleVariable EOF )
            // InternalDSL.g:286:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalDSL.g:293:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:297:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalDSL.g:298:1: ( ( rule__Variable__Group__0 ) )
            {
            // InternalDSL.g:298:1: ( ( rule__Variable__Group__0 ) )
            // InternalDSL.g:299:1: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalDSL.g:300:1: ( rule__Variable__Group__0 )
            // InternalDSL.g:300:2: rule__Variable__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Variable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleAnonymousVariable"
    // InternalDSL.g:312:1: entryRuleAnonymousVariable : ruleAnonymousVariable EOF ;
    public final void entryRuleAnonymousVariable() throws RecognitionException {
        try {
            // InternalDSL.g:313:1: ( ruleAnonymousVariable EOF )
            // InternalDSL.g:314:1: ruleAnonymousVariable EOF
            {
             before(grammarAccess.getAnonymousVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAnonymousVariable();

            state._fsp--;

             after(grammarAccess.getAnonymousVariableRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleAnonymousVariable"


    // $ANTLR start "ruleAnonymousVariable"
    // InternalDSL.g:321:1: ruleAnonymousVariable : ( ( rule__AnonymousVariable__TypeAssignment ) ) ;
    public final void ruleAnonymousVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:325:2: ( ( ( rule__AnonymousVariable__TypeAssignment ) ) )
            // InternalDSL.g:326:1: ( ( rule__AnonymousVariable__TypeAssignment ) )
            {
            // InternalDSL.g:326:1: ( ( rule__AnonymousVariable__TypeAssignment ) )
            // InternalDSL.g:327:1: ( rule__AnonymousVariable__TypeAssignment )
            {
             before(grammarAccess.getAnonymousVariableAccess().getTypeAssignment()); 
            // InternalDSL.g:328:1: ( rule__AnonymousVariable__TypeAssignment )
            // InternalDSL.g:328:2: rule__AnonymousVariable__TypeAssignment
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AnonymousVariable__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAnonymousVariableAccess().getTypeAssignment()); 

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
    // $ANTLR end "ruleAnonymousVariable"


    // $ANTLR start "entryRuleMethod"
    // InternalDSL.g:340:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // InternalDSL.g:341:1: ( ruleMethod EOF )
            // InternalDSL.g:342:1: ruleMethod EOF
            {
             before(grammarAccess.getMethodRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getMethodRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalDSL.g:349:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:353:2: ( ( ( rule__Method__Group__0 ) ) )
            // InternalDSL.g:354:1: ( ( rule__Method__Group__0 ) )
            {
            // InternalDSL.g:354:1: ( ( rule__Method__Group__0 ) )
            // InternalDSL.g:355:1: ( rule__Method__Group__0 )
            {
             before(grammarAccess.getMethodAccess().getGroup()); 
            // InternalDSL.g:356:1: ( rule__Method__Group__0 )
            // InternalDSL.g:356:2: rule__Method__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Method__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getGroup()); 

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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRulePortTypeElement"
    // InternalDSL.g:368:1: entryRulePortTypeElement : rulePortTypeElement EOF ;
    public final void entryRulePortTypeElement() throws RecognitionException {
        try {
            // InternalDSL.g:369:1: ( rulePortTypeElement EOF )
            // InternalDSL.g:370:1: rulePortTypeElement EOF
            {
             before(grammarAccess.getPortTypeElementRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            rulePortTypeElement();

            state._fsp--;

             after(grammarAccess.getPortTypeElementRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRulePortTypeElement"


    // $ANTLR start "rulePortTypeElement"
    // InternalDSL.g:377:1: rulePortTypeElement : ( ( rule__PortTypeElement__Group__0 ) ) ;
    public final void rulePortTypeElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:381:2: ( ( ( rule__PortTypeElement__Group__0 ) ) )
            // InternalDSL.g:382:1: ( ( rule__PortTypeElement__Group__0 ) )
            {
            // InternalDSL.g:382:1: ( ( rule__PortTypeElement__Group__0 ) )
            // InternalDSL.g:383:1: ( rule__PortTypeElement__Group__0 )
            {
             before(grammarAccess.getPortTypeElementAccess().getGroup()); 
            // InternalDSL.g:384:1: ( rule__PortTypeElement__Group__0 )
            // InternalDSL.g:384:2: rule__PortTypeElement__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PortTypeElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPortTypeElementAccess().getGroup()); 

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
    // $ANTLR end "rulePortTypeElement"


    // $ANTLR start "entryRuleCompositionOperator"
    // InternalDSL.g:396:1: entryRuleCompositionOperator : ruleCompositionOperator EOF ;
    public final void entryRuleCompositionOperator() throws RecognitionException {
        try {
            // InternalDSL.g:397:1: ( ruleCompositionOperator EOF )
            // InternalDSL.g:398:1: ruleCompositionOperator EOF
            {
             before(grammarAccess.getCompositionOperatorRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleCompositionOperator();

            state._fsp--;

             after(grammarAccess.getCompositionOperatorRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleCompositionOperator"


    // $ANTLR start "ruleCompositionOperator"
    // InternalDSL.g:405:1: ruleCompositionOperator : ( ruleBindOperator ) ;
    public final void ruleCompositionOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:409:2: ( ( ruleBindOperator ) )
            // InternalDSL.g:410:1: ( ruleBindOperator )
            {
            // InternalDSL.g:410:1: ( ruleBindOperator )
            // InternalDSL.g:411:1: ruleBindOperator
            {
             before(grammarAccess.getCompositionOperatorAccess().getBindOperatorParserRuleCall()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleBindOperator();

            state._fsp--;

             after(grammarAccess.getCompositionOperatorAccess().getBindOperatorParserRuleCall()); 

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
    // $ANTLR end "ruleCompositionOperator"


    // $ANTLR start "entryRuleEString"
    // InternalDSL.g:424:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalDSL.g:425:1: ( ruleEString EOF )
            // InternalDSL.g:426:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalDSL.g:433:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:437:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalDSL.g:438:1: ( ( rule__EString__Alternatives ) )
            {
            // InternalDSL.g:438:1: ( ( rule__EString__Alternatives ) )
            // InternalDSL.g:439:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalDSL.g:440:1: ( rule__EString__Alternatives )
            // InternalDSL.g:440:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleComponentType"
    // InternalDSL.g:452:1: entryRuleComponentType : ruleComponentType EOF ;
    public final void entryRuleComponentType() throws RecognitionException {
        try {
            // InternalDSL.g:453:1: ( ruleComponentType EOF )
            // InternalDSL.g:454:1: ruleComponentType EOF
            {
             before(grammarAccess.getComponentTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleComponentType();

            state._fsp--;

             after(grammarAccess.getComponentTypeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleComponentType"


    // $ANTLR start "ruleComponentType"
    // InternalDSL.g:461:1: ruleComponentType : ( ( rule__ComponentType__Group__0 ) ) ;
    public final void ruleComponentType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:465:2: ( ( ( rule__ComponentType__Group__0 ) ) )
            // InternalDSL.g:466:1: ( ( rule__ComponentType__Group__0 ) )
            {
            // InternalDSL.g:466:1: ( ( rule__ComponentType__Group__0 ) )
            // InternalDSL.g:467:1: ( rule__ComponentType__Group__0 )
            {
             before(grammarAccess.getComponentTypeAccess().getGroup()); 
            // InternalDSL.g:468:1: ( rule__ComponentType__Group__0 )
            // InternalDSL.g:468:2: rule__ComponentType__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ComponentType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleComponentType"


    // $ANTLR start "entryRulePortType"
    // InternalDSL.g:480:1: entryRulePortType : rulePortType EOF ;
    public final void entryRulePortType() throws RecognitionException {
        try {
            // InternalDSL.g:481:1: ( rulePortType EOF )
            // InternalDSL.g:482:1: rulePortType EOF
            {
             before(grammarAccess.getPortTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            rulePortType();

            state._fsp--;

             after(grammarAccess.getPortTypeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRulePortType"


    // $ANTLR start "rulePortType"
    // InternalDSL.g:489:1: rulePortType : ( ( rule__PortType__Group__0 ) ) ;
    public final void rulePortType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:493:2: ( ( ( rule__PortType__Group__0 ) ) )
            // InternalDSL.g:494:1: ( ( rule__PortType__Group__0 ) )
            {
            // InternalDSL.g:494:1: ( ( rule__PortType__Group__0 ) )
            // InternalDSL.g:495:1: ( rule__PortType__Group__0 )
            {
             before(grammarAccess.getPortTypeAccess().getGroup()); 
            // InternalDSL.g:496:1: ( rule__PortType__Group__0 )
            // InternalDSL.g:496:2: rule__PortType__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PortType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPortTypeAccess().getGroup()); 

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
    // $ANTLR end "rulePortType"


    // $ANTLR start "entryRuleRoleModel"
    // InternalDSL.g:508:1: entryRuleRoleModel : ruleRoleModel EOF ;
    public final void entryRuleRoleModel() throws RecognitionException {
        try {
            // InternalDSL.g:509:1: ( ruleRoleModel EOF )
            // InternalDSL.g:510:1: ruleRoleModel EOF
            {
             before(grammarAccess.getRoleModelRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleRoleModel();

            state._fsp--;

             after(grammarAccess.getRoleModelRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleRoleModel"


    // $ANTLR start "ruleRoleModel"
    // InternalDSL.g:517:1: ruleRoleModel : ( ( rule__RoleModel__Group__0 ) ) ;
    public final void ruleRoleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:521:2: ( ( ( rule__RoleModel__Group__0 ) ) )
            // InternalDSL.g:522:1: ( ( rule__RoleModel__Group__0 ) )
            {
            // InternalDSL.g:522:1: ( ( rule__RoleModel__Group__0 ) )
            // InternalDSL.g:523:1: ( rule__RoleModel__Group__0 )
            {
             before(grammarAccess.getRoleModelAccess().getGroup()); 
            // InternalDSL.g:524:1: ( rule__RoleModel__Group__0 )
            // InternalDSL.g:524:2: rule__RoleModel__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RoleModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRoleModelAccess().getGroup()); 

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
    // $ANTLR end "ruleRoleModel"


    // $ANTLR start "entryRuleRoleModelSlot"
    // InternalDSL.g:536:1: entryRuleRoleModelSlot : ruleRoleModelSlot EOF ;
    public final void entryRuleRoleModelSlot() throws RecognitionException {
        try {
            // InternalDSL.g:537:1: ( ruleRoleModelSlot EOF )
            // InternalDSL.g:538:1: ruleRoleModelSlot EOF
            {
             before(grammarAccess.getRoleModelSlotRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleRoleModelSlot();

            state._fsp--;

             after(grammarAccess.getRoleModelSlotRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleRoleModelSlot"


    // $ANTLR start "ruleRoleModelSlot"
    // InternalDSL.g:545:1: ruleRoleModelSlot : ( ( rule__RoleModelSlot__Group__0 ) ) ;
    public final void ruleRoleModelSlot() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:549:2: ( ( ( rule__RoleModelSlot__Group__0 ) ) )
            // InternalDSL.g:550:1: ( ( rule__RoleModelSlot__Group__0 ) )
            {
            // InternalDSL.g:550:1: ( ( rule__RoleModelSlot__Group__0 ) )
            // InternalDSL.g:551:1: ( rule__RoleModelSlot__Group__0 )
            {
             before(grammarAccess.getRoleModelSlotAccess().getGroup()); 
            // InternalDSL.g:552:1: ( rule__RoleModelSlot__Group__0 )
            // InternalDSL.g:552:2: rule__RoleModelSlot__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RoleModelSlot__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRoleModelSlotAccess().getGroup()); 

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
    // $ANTLR end "ruleRoleModelSlot"


    // $ANTLR start "entryRuleBindOperator"
    // InternalDSL.g:564:1: entryRuleBindOperator : ruleBindOperator EOF ;
    public final void entryRuleBindOperator() throws RecognitionException {
        try {
            // InternalDSL.g:565:1: ( ruleBindOperator EOF )
            // InternalDSL.g:566:1: ruleBindOperator EOF
            {
             before(grammarAccess.getBindOperatorRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleBindOperator();

            state._fsp--;

             after(grammarAccess.getBindOperatorRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleBindOperator"


    // $ANTLR start "ruleBindOperator"
    // InternalDSL.g:573:1: ruleBindOperator : ( ( rule__BindOperator__Group__0 ) ) ;
    public final void ruleBindOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:577:2: ( ( ( rule__BindOperator__Group__0 ) ) )
            // InternalDSL.g:578:1: ( ( rule__BindOperator__Group__0 ) )
            {
            // InternalDSL.g:578:1: ( ( rule__BindOperator__Group__0 ) )
            // InternalDSL.g:579:1: ( rule__BindOperator__Group__0 )
            {
             before(grammarAccess.getBindOperatorAccess().getGroup()); 
            // InternalDSL.g:580:1: ( rule__BindOperator__Group__0 )
            // InternalDSL.g:580:2: rule__BindOperator__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BindOperator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBindOperatorAccess().getGroup()); 

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
    // $ANTLR end "ruleBindOperator"


    // $ANTLR start "entryRuleArchitecture"
    // InternalDSL.g:592:1: entryRuleArchitecture : ruleArchitecture EOF ;
    public final void entryRuleArchitecture() throws RecognitionException {
        try {
            // InternalDSL.g:593:1: ( ruleArchitecture EOF )
            // InternalDSL.g:594:1: ruleArchitecture EOF
            {
             before(grammarAccess.getArchitectureRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleArchitecture();

            state._fsp--;

             after(grammarAccess.getArchitectureRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleArchitecture"


    // $ANTLR start "ruleArchitecture"
    // InternalDSL.g:601:1: ruleArchitecture : ( ( rule__Architecture__Group__0 ) ) ;
    public final void ruleArchitecture() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:605:2: ( ( ( rule__Architecture__Group__0 ) ) )
            // InternalDSL.g:606:1: ( ( rule__Architecture__Group__0 ) )
            {
            // InternalDSL.g:606:1: ( ( rule__Architecture__Group__0 ) )
            // InternalDSL.g:607:1: ( rule__Architecture__Group__0 )
            {
             before(grammarAccess.getArchitectureAccess().getGroup()); 
            // InternalDSL.g:608:1: ( rule__Architecture__Group__0 )
            // InternalDSL.g:608:2: rule__Architecture__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Architecture__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArchitectureAccess().getGroup()); 

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
    // $ANTLR end "ruleArchitecture"


    // $ANTLR start "entryRuleArchitectureElement"
    // InternalDSL.g:620:1: entryRuleArchitectureElement : ruleArchitectureElement EOF ;
    public final void entryRuleArchitectureElement() throws RecognitionException {
        try {
            // InternalDSL.g:621:1: ( ruleArchitectureElement EOF )
            // InternalDSL.g:622:1: ruleArchitectureElement EOF
            {
             before(grammarAccess.getArchitectureElementRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleArchitectureElement();

            state._fsp--;

             after(grammarAccess.getArchitectureElementRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleArchitectureElement"


    // $ANTLR start "ruleArchitectureElement"
    // InternalDSL.g:629:1: ruleArchitectureElement : ( ( rule__ArchitectureElement__Alternatives ) ) ;
    public final void ruleArchitectureElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:633:2: ( ( ( rule__ArchitectureElement__Alternatives ) ) )
            // InternalDSL.g:634:1: ( ( rule__ArchitectureElement__Alternatives ) )
            {
            // InternalDSL.g:634:1: ( ( rule__ArchitectureElement__Alternatives ) )
            // InternalDSL.g:635:1: ( rule__ArchitectureElement__Alternatives )
            {
             before(grammarAccess.getArchitectureElementAccess().getAlternatives()); 
            // InternalDSL.g:636:1: ( rule__ArchitectureElement__Alternatives )
            // InternalDSL.g:636:2: rule__ArchitectureElement__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ArchitectureElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getArchitectureElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleArchitectureElement"


    // $ANTLR start "entryRuleComponent"
    // InternalDSL.g:648:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // InternalDSL.g:649:1: ( ruleComponent EOF )
            // InternalDSL.g:650:1: ruleComponent EOF
            {
             before(grammarAccess.getComponentRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getComponentRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalDSL.g:657:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:661:2: ( ( ( rule__Component__Group__0 ) ) )
            // InternalDSL.g:662:1: ( ( rule__Component__Group__0 ) )
            {
            // InternalDSL.g:662:1: ( ( rule__Component__Group__0 ) )
            // InternalDSL.g:663:1: ( rule__Component__Group__0 )
            {
             before(grammarAccess.getComponentAccess().getGroup()); 
            // InternalDSL.g:664:1: ( rule__Component__Group__0 )
            // InternalDSL.g:664:2: rule__Component__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Component__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getGroup()); 

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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRulePort"
    // InternalDSL.g:676:1: entryRulePort : rulePort EOF ;
    public final void entryRulePort() throws RecognitionException {
        try {
            // InternalDSL.g:677:1: ( rulePort EOF )
            // InternalDSL.g:678:1: rulePort EOF
            {
             before(grammarAccess.getPortRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            rulePort();

            state._fsp--;

             after(grammarAccess.getPortRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // InternalDSL.g:685:1: rulePort : ( ( rule__Port__Group__0 ) ) ;
    public final void rulePort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:689:2: ( ( ( rule__Port__Group__0 ) ) )
            // InternalDSL.g:690:1: ( ( rule__Port__Group__0 ) )
            {
            // InternalDSL.g:690:1: ( ( rule__Port__Group__0 ) )
            // InternalDSL.g:691:1: ( rule__Port__Group__0 )
            {
             before(grammarAccess.getPortAccess().getGroup()); 
            // InternalDSL.g:692:1: ( rule__Port__Group__0 )
            // InternalDSL.g:692:2: rule__Port__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Port__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getGroup()); 

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
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleTypeBinding"
    // InternalDSL.g:704:1: entryRuleTypeBinding : ruleTypeBinding EOF ;
    public final void entryRuleTypeBinding() throws RecognitionException {
        try {
            // InternalDSL.g:705:1: ( ruleTypeBinding EOF )
            // InternalDSL.g:706:1: ruleTypeBinding EOF
            {
             before(grammarAccess.getTypeBindingRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTypeBinding();

            state._fsp--;

             after(grammarAccess.getTypeBindingRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleTypeBinding"


    // $ANTLR start "ruleTypeBinding"
    // InternalDSL.g:713:1: ruleTypeBinding : ( ( rule__TypeBinding__Group__0 ) ) ;
    public final void ruleTypeBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:717:2: ( ( ( rule__TypeBinding__Group__0 ) ) )
            // InternalDSL.g:718:1: ( ( rule__TypeBinding__Group__0 ) )
            {
            // InternalDSL.g:718:1: ( ( rule__TypeBinding__Group__0 ) )
            // InternalDSL.g:719:1: ( rule__TypeBinding__Group__0 )
            {
             before(grammarAccess.getTypeBindingAccess().getGroup()); 
            // InternalDSL.g:720:1: ( rule__TypeBinding__Group__0 )
            // InternalDSL.g:720:2: rule__TypeBinding__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypeBinding__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeBindingAccess().getGroup()); 

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
    // $ANTLR end "ruleTypeBinding"


    // $ANTLR start "rule__SmagsElement__Alternatives"
    // InternalDSL.g:732:1: rule__SmagsElement__Alternatives : ( ( ruleMetaArchitecture ) | ( ruleArchitecture ) );
    public final void rule__SmagsElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:736:1: ( ( ruleMetaArchitecture ) | ( ruleArchitecture ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            else if ( (LA1_0==27) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDSL.g:737:1: ( ruleMetaArchitecture )
                    {
                    // InternalDSL.g:737:1: ( ruleMetaArchitecture )
                    // InternalDSL.g:738:1: ruleMetaArchitecture
                    {
                     before(grammarAccess.getSmagsElementAccess().getMetaArchitectureParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleMetaArchitecture();

                    state._fsp--;

                     after(grammarAccess.getSmagsElementAccess().getMetaArchitectureParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:743:6: ( ruleArchitecture )
                    {
                    // InternalDSL.g:743:6: ( ruleArchitecture )
                    // InternalDSL.g:744:1: ruleArchitecture
                    {
                     before(grammarAccess.getSmagsElementAccess().getArchitectureParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleArchitecture();

                    state._fsp--;

                     after(grammarAccess.getSmagsElementAccess().getArchitectureParserRuleCall_1()); 

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
    // $ANTLR end "rule__SmagsElement__Alternatives"


    // $ANTLR start "rule__MetaArchitectureElement__Alternatives"
    // InternalDSL.g:754:1: rule__MetaArchitectureElement__Alternatives : ( ( ruleComponentType ) | ( rulePortType ) | ( ruleRoleModel ) );
    public final void rule__MetaArchitectureElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:758:1: ( ( ruleComponentType ) | ( rulePortType ) | ( ruleRoleModel ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt2=1;
                }
                break;
            case 22:
                {
                alt2=2;
                }
                break;
            case 23:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalDSL.g:759:1: ( ruleComponentType )
                    {
                    // InternalDSL.g:759:1: ( ruleComponentType )
                    // InternalDSL.g:760:1: ruleComponentType
                    {
                     before(grammarAccess.getMetaArchitectureElementAccess().getComponentTypeParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleComponentType();

                    state._fsp--;

                     after(grammarAccess.getMetaArchitectureElementAccess().getComponentTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:765:6: ( rulePortType )
                    {
                    // InternalDSL.g:765:6: ( rulePortType )
                    // InternalDSL.g:766:1: rulePortType
                    {
                     before(grammarAccess.getMetaArchitectureElementAccess().getPortTypeParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    rulePortType();

                    state._fsp--;

                     after(grammarAccess.getMetaArchitectureElementAccess().getPortTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:771:6: ( ruleRoleModel )
                    {
                    // InternalDSL.g:771:6: ( ruleRoleModel )
                    // InternalDSL.g:772:1: ruleRoleModel
                    {
                     before(grammarAccess.getMetaArchitectureElementAccess().getRoleModelParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleRoleModel();

                    state._fsp--;

                     after(grammarAccess.getMetaArchitectureElementAccess().getRoleModelParserRuleCall_2()); 

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
    // $ANTLR end "rule__MetaArchitectureElement__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalDSL.g:782:1: rule__Type__Alternatives : ( ( ruleExternalType ) | ( rulePrimitiveType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:786:1: ( ( ruleExternalType ) | ( rulePrimitiveType ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            else if ( (LA3_0==17) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDSL.g:787:1: ( ruleExternalType )
                    {
                    // InternalDSL.g:787:1: ( ruleExternalType )
                    // InternalDSL.g:788:1: ruleExternalType
                    {
                     before(grammarAccess.getTypeAccess().getExternalTypeParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleExternalType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getExternalTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:793:6: ( rulePrimitiveType )
                    {
                    // InternalDSL.g:793:6: ( rulePrimitiveType )
                    // InternalDSL.g:794:1: rulePrimitiveType
                    {
                     before(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    rulePrimitiveType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_1()); 

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__PortTypeElement__Alternatives_0"
    // InternalDSL.g:804:1: rule__PortTypeElement__Alternatives_0 : ( ( ruleVariable ) | ( ruleMethod ) );
    public final void rule__PortTypeElement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:808:1: ( ( ruleVariable ) | ( ruleMethod ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_STRING) ) {
                    int LA4_3 = input.LA(3);

                    if ( (LA4_3==18) ) {
                        alt4=2;
                    }
                    else if ( (LA4_3==14) ) {
                        alt4=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA4_1==RULE_ID) ) {
                    int LA4_4 = input.LA(3);

                    if ( (LA4_4==14) ) {
                        alt4=1;
                    }
                    else if ( (LA4_4==18) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0==RULE_ID) ) {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==RULE_STRING) ) {
                    int LA4_3 = input.LA(3);

                    if ( (LA4_3==18) ) {
                        alt4=2;
                    }
                    else if ( (LA4_3==14) ) {
                        alt4=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA4_2==RULE_ID) ) {
                    int LA4_4 = input.LA(3);

                    if ( (LA4_4==14) ) {
                        alt4=1;
                    }
                    else if ( (LA4_4==18) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDSL.g:809:1: ( ruleVariable )
                    {
                    // InternalDSL.g:809:1: ( ruleVariable )
                    // InternalDSL.g:810:1: ruleVariable
                    {
                     before(grammarAccess.getPortTypeElementAccess().getVariableParserRuleCall_0_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleVariable();

                    state._fsp--;

                     after(grammarAccess.getPortTypeElementAccess().getVariableParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:815:6: ( ruleMethod )
                    {
                    // InternalDSL.g:815:6: ( ruleMethod )
                    // InternalDSL.g:816:1: ruleMethod
                    {
                     before(grammarAccess.getPortTypeElementAccess().getMethodParserRuleCall_0_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleMethod();

                    state._fsp--;

                     after(grammarAccess.getPortTypeElementAccess().getMethodParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__PortTypeElement__Alternatives_0"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalDSL.g:826:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:830:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDSL.g:831:1: ( RULE_STRING )
                    {
                    // InternalDSL.g:831:1: ( RULE_STRING )
                    // InternalDSL.g:832:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:837:6: ( RULE_ID )
                    {
                    // InternalDSL.g:837:6: ( RULE_ID )
                    // InternalDSL.g:838:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__ArchitectureElement__Alternatives"
    // InternalDSL.g:848:1: rule__ArchitectureElement__Alternatives : ( ( ruleComponent ) | ( rulePort ) );
    public final void rule__ArchitectureElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:852:1: ( ( ruleComponent ) | ( rulePort ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==29) ) {
                alt6=1;
            }
            else if ( (LA6_0==30) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalDSL.g:853:1: ( ruleComponent )
                    {
                    // InternalDSL.g:853:1: ( ruleComponent )
                    // InternalDSL.g:854:1: ruleComponent
                    {
                     before(grammarAccess.getArchitectureElementAccess().getComponentParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleComponent();

                    state._fsp--;

                     after(grammarAccess.getArchitectureElementAccess().getComponentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:859:6: ( rulePort )
                    {
                    // InternalDSL.g:859:6: ( rulePort )
                    // InternalDSL.g:860:1: rulePort
                    {
                     before(grammarAccess.getArchitectureElementAccess().getPortParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    rulePort();

                    state._fsp--;

                     after(grammarAccess.getArchitectureElementAccess().getPortParserRuleCall_1()); 

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
    // $ANTLR end "rule__ArchitectureElement__Alternatives"


    // $ANTLR start "rule__SmagsModel__Group__0"
    // InternalDSL.g:872:1: rule__SmagsModel__Group__0 : rule__SmagsModel__Group__0__Impl rule__SmagsModel__Group__1 ;
    public final void rule__SmagsModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:876:1: ( rule__SmagsModel__Group__0__Impl rule__SmagsModel__Group__1 )
            // InternalDSL.g:877:2: rule__SmagsModel__Group__0__Impl rule__SmagsModel__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__SmagsModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__SmagsModel__Group__1();

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
    // $ANTLR end "rule__SmagsModel__Group__0"


    // $ANTLR start "rule__SmagsModel__Group__0__Impl"
    // InternalDSL.g:884:1: rule__SmagsModel__Group__0__Impl : ( () ) ;
    public final void rule__SmagsModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:888:1: ( ( () ) )
            // InternalDSL.g:889:1: ( () )
            {
            // InternalDSL.g:889:1: ( () )
            // InternalDSL.g:890:1: ()
            {
             before(grammarAccess.getSmagsModelAccess().getSmagsModelAction_0()); 
            // InternalDSL.g:891:1: ()
            // InternalDSL.g:893:1: 
            {
            }

             after(grammarAccess.getSmagsModelAccess().getSmagsModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmagsModel__Group__0__Impl"


    // $ANTLR start "rule__SmagsModel__Group__1"
    // InternalDSL.g:903:1: rule__SmagsModel__Group__1 : rule__SmagsModel__Group__1__Impl rule__SmagsModel__Group__2 ;
    public final void rule__SmagsModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:907:1: ( rule__SmagsModel__Group__1__Impl rule__SmagsModel__Group__2 )
            // InternalDSL.g:908:2: rule__SmagsModel__Group__1__Impl rule__SmagsModel__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__SmagsModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__SmagsModel__Group__2();

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
    // $ANTLR end "rule__SmagsModel__Group__1"


    // $ANTLR start "rule__SmagsModel__Group__1__Impl"
    // InternalDSL.g:915:1: rule__SmagsModel__Group__1__Impl : ( ( rule__SmagsModel__Group_1__0 )? ) ;
    public final void rule__SmagsModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:919:1: ( ( ( rule__SmagsModel__Group_1__0 )? ) )
            // InternalDSL.g:920:1: ( ( rule__SmagsModel__Group_1__0 )? )
            {
            // InternalDSL.g:920:1: ( ( rule__SmagsModel__Group_1__0 )? )
            // InternalDSL.g:921:1: ( rule__SmagsModel__Group_1__0 )?
            {
             before(grammarAccess.getSmagsModelAccess().getGroup_1()); 
            // InternalDSL.g:922:1: ( rule__SmagsModel__Group_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==11) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDSL.g:922:2: rule__SmagsModel__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__SmagsModel__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSmagsModelAccess().getGroup_1()); 

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
    // $ANTLR end "rule__SmagsModel__Group__1__Impl"


    // $ANTLR start "rule__SmagsModel__Group__2"
    // InternalDSL.g:932:1: rule__SmagsModel__Group__2 : rule__SmagsModel__Group__2__Impl ;
    public final void rule__SmagsModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:936:1: ( rule__SmagsModel__Group__2__Impl )
            // InternalDSL.g:937:2: rule__SmagsModel__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SmagsModel__Group__2__Impl();

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
    // $ANTLR end "rule__SmagsModel__Group__2"


    // $ANTLR start "rule__SmagsModel__Group__2__Impl"
    // InternalDSL.g:943:1: rule__SmagsModel__Group__2__Impl : ( ( rule__SmagsModel__ElementsAssignment_2 )* ) ;
    public final void rule__SmagsModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:947:1: ( ( ( rule__SmagsModel__ElementsAssignment_2 )* ) )
            // InternalDSL.g:948:1: ( ( rule__SmagsModel__ElementsAssignment_2 )* )
            {
            // InternalDSL.g:948:1: ( ( rule__SmagsModel__ElementsAssignment_2 )* )
            // InternalDSL.g:949:1: ( rule__SmagsModel__ElementsAssignment_2 )*
            {
             before(grammarAccess.getSmagsModelAccess().getElementsAssignment_2()); 
            // InternalDSL.g:950:1: ( rule__SmagsModel__ElementsAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15||LA8_0==27) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDSL.g:950:2: rule__SmagsModel__ElementsAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    rule__SmagsModel__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getSmagsModelAccess().getElementsAssignment_2()); 

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
    // $ANTLR end "rule__SmagsModel__Group__2__Impl"


    // $ANTLR start "rule__SmagsModel__Group_1__0"
    // InternalDSL.g:966:1: rule__SmagsModel__Group_1__0 : rule__SmagsModel__Group_1__0__Impl rule__SmagsModel__Group_1__1 ;
    public final void rule__SmagsModel__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:970:1: ( rule__SmagsModel__Group_1__0__Impl rule__SmagsModel__Group_1__1 )
            // InternalDSL.g:971:2: rule__SmagsModel__Group_1__0__Impl rule__SmagsModel__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__SmagsModel__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__SmagsModel__Group_1__1();

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
    // $ANTLR end "rule__SmagsModel__Group_1__0"


    // $ANTLR start "rule__SmagsModel__Group_1__0__Impl"
    // InternalDSL.g:978:1: rule__SmagsModel__Group_1__0__Impl : ( 'imports' ) ;
    public final void rule__SmagsModel__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:982:1: ( ( 'imports' ) )
            // InternalDSL.g:983:1: ( 'imports' )
            {
            // InternalDSL.g:983:1: ( 'imports' )
            // InternalDSL.g:984:1: 'imports'
            {
             before(grammarAccess.getSmagsModelAccess().getImportsKeyword_1_0()); 
            match(input,11,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getSmagsModelAccess().getImportsKeyword_1_0()); 

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
    // $ANTLR end "rule__SmagsModel__Group_1__0__Impl"


    // $ANTLR start "rule__SmagsModel__Group_1__1"
    // InternalDSL.g:997:1: rule__SmagsModel__Group_1__1 : rule__SmagsModel__Group_1__1__Impl rule__SmagsModel__Group_1__2 ;
    public final void rule__SmagsModel__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1001:1: ( rule__SmagsModel__Group_1__1__Impl rule__SmagsModel__Group_1__2 )
            // InternalDSL.g:1002:2: rule__SmagsModel__Group_1__1__Impl rule__SmagsModel__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__SmagsModel__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__SmagsModel__Group_1__2();

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
    // $ANTLR end "rule__SmagsModel__Group_1__1"


    // $ANTLR start "rule__SmagsModel__Group_1__1__Impl"
    // InternalDSL.g:1009:1: rule__SmagsModel__Group_1__1__Impl : ( '{' ) ;
    public final void rule__SmagsModel__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1013:1: ( ( '{' ) )
            // InternalDSL.g:1014:1: ( '{' )
            {
            // InternalDSL.g:1014:1: ( '{' )
            // InternalDSL.g:1015:1: '{'
            {
             before(grammarAccess.getSmagsModelAccess().getLeftCurlyBracketKeyword_1_1()); 
            match(input,12,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getSmagsModelAccess().getLeftCurlyBracketKeyword_1_1()); 

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
    // $ANTLR end "rule__SmagsModel__Group_1__1__Impl"


    // $ANTLR start "rule__SmagsModel__Group_1__2"
    // InternalDSL.g:1028:1: rule__SmagsModel__Group_1__2 : rule__SmagsModel__Group_1__2__Impl rule__SmagsModel__Group_1__3 ;
    public final void rule__SmagsModel__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1032:1: ( rule__SmagsModel__Group_1__2__Impl rule__SmagsModel__Group_1__3 )
            // InternalDSL.g:1033:2: rule__SmagsModel__Group_1__2__Impl rule__SmagsModel__Group_1__3
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__SmagsModel__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__SmagsModel__Group_1__3();

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
    // $ANTLR end "rule__SmagsModel__Group_1__2"


    // $ANTLR start "rule__SmagsModel__Group_1__2__Impl"
    // InternalDSL.g:1040:1: rule__SmagsModel__Group_1__2__Impl : ( ( rule__SmagsModel__ImportsAssignment_1_2 )* ) ;
    public final void rule__SmagsModel__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1044:1: ( ( ( rule__SmagsModel__ImportsAssignment_1_2 )* ) )
            // InternalDSL.g:1045:1: ( ( rule__SmagsModel__ImportsAssignment_1_2 )* )
            {
            // InternalDSL.g:1045:1: ( ( rule__SmagsModel__ImportsAssignment_1_2 )* )
            // InternalDSL.g:1046:1: ( rule__SmagsModel__ImportsAssignment_1_2 )*
            {
             before(grammarAccess.getSmagsModelAccess().getImportsAssignment_1_2()); 
            // InternalDSL.g:1047:1: ( rule__SmagsModel__ImportsAssignment_1_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_STRING) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDSL.g:1047:2: rule__SmagsModel__ImportsAssignment_1_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_7);
            	    rule__SmagsModel__ImportsAssignment_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getSmagsModelAccess().getImportsAssignment_1_2()); 

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
    // $ANTLR end "rule__SmagsModel__Group_1__2__Impl"


    // $ANTLR start "rule__SmagsModel__Group_1__3"
    // InternalDSL.g:1057:1: rule__SmagsModel__Group_1__3 : rule__SmagsModel__Group_1__3__Impl ;
    public final void rule__SmagsModel__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1061:1: ( rule__SmagsModel__Group_1__3__Impl )
            // InternalDSL.g:1062:2: rule__SmagsModel__Group_1__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SmagsModel__Group_1__3__Impl();

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
    // $ANTLR end "rule__SmagsModel__Group_1__3"


    // $ANTLR start "rule__SmagsModel__Group_1__3__Impl"
    // InternalDSL.g:1068:1: rule__SmagsModel__Group_1__3__Impl : ( '}' ) ;
    public final void rule__SmagsModel__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1072:1: ( ( '}' ) )
            // InternalDSL.g:1073:1: ( '}' )
            {
            // InternalDSL.g:1073:1: ( '}' )
            // InternalDSL.g:1074:1: '}'
            {
             before(grammarAccess.getSmagsModelAccess().getRightCurlyBracketKeyword_1_3()); 
            match(input,13,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getSmagsModelAccess().getRightCurlyBracketKeyword_1_3()); 

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
    // $ANTLR end "rule__SmagsModel__Group_1__3__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalDSL.g:1095:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1099:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalDSL.g:1100:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Import__Group__1();

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
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalDSL.g:1107:1: rule__Import__Group__0__Impl : ( ( rule__Import__ImportURIAssignment_0 ) ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1111:1: ( ( ( rule__Import__ImportURIAssignment_0 ) ) )
            // InternalDSL.g:1112:1: ( ( rule__Import__ImportURIAssignment_0 ) )
            {
            // InternalDSL.g:1112:1: ( ( rule__Import__ImportURIAssignment_0 ) )
            // InternalDSL.g:1113:1: ( rule__Import__ImportURIAssignment_0 )
            {
             before(grammarAccess.getImportAccess().getImportURIAssignment_0()); 
            // InternalDSL.g:1114:1: ( rule__Import__ImportURIAssignment_0 )
            // InternalDSL.g:1114:2: rule__Import__ImportURIAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Import__ImportURIAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportURIAssignment_0()); 

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
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalDSL.g:1124:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1128:1: ( rule__Import__Group__1__Impl )
            // InternalDSL.g:1129:2: rule__Import__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Import__Group__1__Impl();

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
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalDSL.g:1135:1: rule__Import__Group__1__Impl : ( ';' ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1139:1: ( ( ';' ) )
            // InternalDSL.g:1140:1: ( ';' )
            {
            // InternalDSL.g:1140:1: ( ';' )
            // InternalDSL.g:1141:1: ';'
            {
             before(grammarAccess.getImportAccess().getSemicolonKeyword_1()); 
            match(input,14,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getImportAccess().getSemicolonKeyword_1()); 

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
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__MetaArchitecture__Group__0"
    // InternalDSL.g:1158:1: rule__MetaArchitecture__Group__0 : rule__MetaArchitecture__Group__0__Impl rule__MetaArchitecture__Group__1 ;
    public final void rule__MetaArchitecture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1162:1: ( rule__MetaArchitecture__Group__0__Impl rule__MetaArchitecture__Group__1 )
            // InternalDSL.g:1163:2: rule__MetaArchitecture__Group__0__Impl rule__MetaArchitecture__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__MetaArchitecture__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__MetaArchitecture__Group__1();

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
    // $ANTLR end "rule__MetaArchitecture__Group__0"


    // $ANTLR start "rule__MetaArchitecture__Group__0__Impl"
    // InternalDSL.g:1170:1: rule__MetaArchitecture__Group__0__Impl : ( 'MetaArchitecture' ) ;
    public final void rule__MetaArchitecture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1174:1: ( ( 'MetaArchitecture' ) )
            // InternalDSL.g:1175:1: ( 'MetaArchitecture' )
            {
            // InternalDSL.g:1175:1: ( 'MetaArchitecture' )
            // InternalDSL.g:1176:1: 'MetaArchitecture'
            {
             before(grammarAccess.getMetaArchitectureAccess().getMetaArchitectureKeyword_0()); 
            match(input,15,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getMetaArchitectureAccess().getMetaArchitectureKeyword_0()); 

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
    // $ANTLR end "rule__MetaArchitecture__Group__0__Impl"


    // $ANTLR start "rule__MetaArchitecture__Group__1"
    // InternalDSL.g:1189:1: rule__MetaArchitecture__Group__1 : rule__MetaArchitecture__Group__1__Impl rule__MetaArchitecture__Group__2 ;
    public final void rule__MetaArchitecture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1193:1: ( rule__MetaArchitecture__Group__1__Impl rule__MetaArchitecture__Group__2 )
            // InternalDSL.g:1194:2: rule__MetaArchitecture__Group__1__Impl rule__MetaArchitecture__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__MetaArchitecture__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__MetaArchitecture__Group__2();

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
    // $ANTLR end "rule__MetaArchitecture__Group__1"


    // $ANTLR start "rule__MetaArchitecture__Group__1__Impl"
    // InternalDSL.g:1201:1: rule__MetaArchitecture__Group__1__Impl : ( ( rule__MetaArchitecture__NameAssignment_1 ) ) ;
    public final void rule__MetaArchitecture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1205:1: ( ( ( rule__MetaArchitecture__NameAssignment_1 ) ) )
            // InternalDSL.g:1206:1: ( ( rule__MetaArchitecture__NameAssignment_1 ) )
            {
            // InternalDSL.g:1206:1: ( ( rule__MetaArchitecture__NameAssignment_1 ) )
            // InternalDSL.g:1207:1: ( rule__MetaArchitecture__NameAssignment_1 )
            {
             before(grammarAccess.getMetaArchitectureAccess().getNameAssignment_1()); 
            // InternalDSL.g:1208:1: ( rule__MetaArchitecture__NameAssignment_1 )
            // InternalDSL.g:1208:2: rule__MetaArchitecture__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MetaArchitecture__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMetaArchitectureAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__MetaArchitecture__Group__1__Impl"


    // $ANTLR start "rule__MetaArchitecture__Group__2"
    // InternalDSL.g:1218:1: rule__MetaArchitecture__Group__2 : rule__MetaArchitecture__Group__2__Impl rule__MetaArchitecture__Group__3 ;
    public final void rule__MetaArchitecture__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1222:1: ( rule__MetaArchitecture__Group__2__Impl rule__MetaArchitecture__Group__3 )
            // InternalDSL.g:1223:2: rule__MetaArchitecture__Group__2__Impl rule__MetaArchitecture__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__MetaArchitecture__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__MetaArchitecture__Group__3();

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
    // $ANTLR end "rule__MetaArchitecture__Group__2"


    // $ANTLR start "rule__MetaArchitecture__Group__2__Impl"
    // InternalDSL.g:1230:1: rule__MetaArchitecture__Group__2__Impl : ( '{' ) ;
    public final void rule__MetaArchitecture__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1234:1: ( ( '{' ) )
            // InternalDSL.g:1235:1: ( '{' )
            {
            // InternalDSL.g:1235:1: ( '{' )
            // InternalDSL.g:1236:1: '{'
            {
             before(grammarAccess.getMetaArchitectureAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getMetaArchitectureAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__MetaArchitecture__Group__2__Impl"


    // $ANTLR start "rule__MetaArchitecture__Group__3"
    // InternalDSL.g:1249:1: rule__MetaArchitecture__Group__3 : rule__MetaArchitecture__Group__3__Impl rule__MetaArchitecture__Group__4 ;
    public final void rule__MetaArchitecture__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1253:1: ( rule__MetaArchitecture__Group__3__Impl rule__MetaArchitecture__Group__4 )
            // InternalDSL.g:1254:2: rule__MetaArchitecture__Group__3__Impl rule__MetaArchitecture__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__MetaArchitecture__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__MetaArchitecture__Group__4();

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
    // $ANTLR end "rule__MetaArchitecture__Group__3"


    // $ANTLR start "rule__MetaArchitecture__Group__3__Impl"
    // InternalDSL.g:1261:1: rule__MetaArchitecture__Group__3__Impl : ( ( rule__MetaArchitecture__TypesAssignment_3 )* ) ;
    public final void rule__MetaArchitecture__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1265:1: ( ( ( rule__MetaArchitecture__TypesAssignment_3 )* ) )
            // InternalDSL.g:1266:1: ( ( rule__MetaArchitecture__TypesAssignment_3 )* )
            {
            // InternalDSL.g:1266:1: ( ( rule__MetaArchitecture__TypesAssignment_3 )* )
            // InternalDSL.g:1267:1: ( rule__MetaArchitecture__TypesAssignment_3 )*
            {
             before(grammarAccess.getMetaArchitectureAccess().getTypesAssignment_3()); 
            // InternalDSL.g:1268:1: ( rule__MetaArchitecture__TypesAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=16 && LA10_0<=17)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDSL.g:1268:2: rule__MetaArchitecture__TypesAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_11);
            	    rule__MetaArchitecture__TypesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getMetaArchitectureAccess().getTypesAssignment_3()); 

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
    // $ANTLR end "rule__MetaArchitecture__Group__3__Impl"


    // $ANTLR start "rule__MetaArchitecture__Group__4"
    // InternalDSL.g:1278:1: rule__MetaArchitecture__Group__4 : rule__MetaArchitecture__Group__4__Impl rule__MetaArchitecture__Group__5 ;
    public final void rule__MetaArchitecture__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1282:1: ( rule__MetaArchitecture__Group__4__Impl rule__MetaArchitecture__Group__5 )
            // InternalDSL.g:1283:2: rule__MetaArchitecture__Group__4__Impl rule__MetaArchitecture__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__MetaArchitecture__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__MetaArchitecture__Group__5();

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
    // $ANTLR end "rule__MetaArchitecture__Group__4"


    // $ANTLR start "rule__MetaArchitecture__Group__4__Impl"
    // InternalDSL.g:1290:1: rule__MetaArchitecture__Group__4__Impl : ( '}' ) ;
    public final void rule__MetaArchitecture__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1294:1: ( ( '}' ) )
            // InternalDSL.g:1295:1: ( '}' )
            {
            // InternalDSL.g:1295:1: ( '}' )
            // InternalDSL.g:1296:1: '}'
            {
             before(grammarAccess.getMetaArchitectureAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getMetaArchitectureAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__MetaArchitecture__Group__4__Impl"


    // $ANTLR start "rule__MetaArchitecture__Group__5"
    // InternalDSL.g:1309:1: rule__MetaArchitecture__Group__5 : rule__MetaArchitecture__Group__5__Impl rule__MetaArchitecture__Group__6 ;
    public final void rule__MetaArchitecture__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1313:1: ( rule__MetaArchitecture__Group__5__Impl rule__MetaArchitecture__Group__6 )
            // InternalDSL.g:1314:2: rule__MetaArchitecture__Group__5__Impl rule__MetaArchitecture__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__MetaArchitecture__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__MetaArchitecture__Group__6();

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
    // $ANTLR end "rule__MetaArchitecture__Group__5"


    // $ANTLR start "rule__MetaArchitecture__Group__5__Impl"
    // InternalDSL.g:1321:1: rule__MetaArchitecture__Group__5__Impl : ( '{' ) ;
    public final void rule__MetaArchitecture__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1325:1: ( ( '{' ) )
            // InternalDSL.g:1326:1: ( '{' )
            {
            // InternalDSL.g:1326:1: ( '{' )
            // InternalDSL.g:1327:1: '{'
            {
             before(grammarAccess.getMetaArchitectureAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,12,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getMetaArchitectureAccess().getLeftCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__MetaArchitecture__Group__5__Impl"


    // $ANTLR start "rule__MetaArchitecture__Group__6"
    // InternalDSL.g:1340:1: rule__MetaArchitecture__Group__6 : rule__MetaArchitecture__Group__6__Impl rule__MetaArchitecture__Group__7 ;
    public final void rule__MetaArchitecture__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1344:1: ( rule__MetaArchitecture__Group__6__Impl rule__MetaArchitecture__Group__7 )
            // InternalDSL.g:1345:2: rule__MetaArchitecture__Group__6__Impl rule__MetaArchitecture__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__MetaArchitecture__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__MetaArchitecture__Group__7();

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
    // $ANTLR end "rule__MetaArchitecture__Group__6"


    // $ANTLR start "rule__MetaArchitecture__Group__6__Impl"
    // InternalDSL.g:1352:1: rule__MetaArchitecture__Group__6__Impl : ( ( rule__MetaArchitecture__ElementsAssignment_6 )* ) ;
    public final void rule__MetaArchitecture__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1356:1: ( ( ( rule__MetaArchitecture__ElementsAssignment_6 )* ) )
            // InternalDSL.g:1357:1: ( ( rule__MetaArchitecture__ElementsAssignment_6 )* )
            {
            // InternalDSL.g:1357:1: ( ( rule__MetaArchitecture__ElementsAssignment_6 )* )
            // InternalDSL.g:1358:1: ( rule__MetaArchitecture__ElementsAssignment_6 )*
            {
             before(grammarAccess.getMetaArchitectureAccess().getElementsAssignment_6()); 
            // InternalDSL.g:1359:1: ( rule__MetaArchitecture__ElementsAssignment_6 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=21 && LA11_0<=23)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDSL.g:1359:2: rule__MetaArchitecture__ElementsAssignment_6
            	    {
            	    pushFollow(FollowSets000.FOLLOW_13);
            	    rule__MetaArchitecture__ElementsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getMetaArchitectureAccess().getElementsAssignment_6()); 

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
    // $ANTLR end "rule__MetaArchitecture__Group__6__Impl"


    // $ANTLR start "rule__MetaArchitecture__Group__7"
    // InternalDSL.g:1369:1: rule__MetaArchitecture__Group__7 : rule__MetaArchitecture__Group__7__Impl ;
    public final void rule__MetaArchitecture__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1373:1: ( rule__MetaArchitecture__Group__7__Impl )
            // InternalDSL.g:1374:2: rule__MetaArchitecture__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MetaArchitecture__Group__7__Impl();

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
    // $ANTLR end "rule__MetaArchitecture__Group__7"


    // $ANTLR start "rule__MetaArchitecture__Group__7__Impl"
    // InternalDSL.g:1380:1: rule__MetaArchitecture__Group__7__Impl : ( '}' ) ;
    public final void rule__MetaArchitecture__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1384:1: ( ( '}' ) )
            // InternalDSL.g:1385:1: ( '}' )
            {
            // InternalDSL.g:1385:1: ( '}' )
            // InternalDSL.g:1386:1: '}'
            {
             before(grammarAccess.getMetaArchitectureAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getMetaArchitectureAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__MetaArchitecture__Group__7__Impl"


    // $ANTLR start "rule__ExternalType__Group__0"
    // InternalDSL.g:1415:1: rule__ExternalType__Group__0 : rule__ExternalType__Group__0__Impl rule__ExternalType__Group__1 ;
    public final void rule__ExternalType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1419:1: ( rule__ExternalType__Group__0__Impl rule__ExternalType__Group__1 )
            // InternalDSL.g:1420:2: rule__ExternalType__Group__0__Impl rule__ExternalType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__ExternalType__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExternalType__Group__1();

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
    // $ANTLR end "rule__ExternalType__Group__0"


    // $ANTLR start "rule__ExternalType__Group__0__Impl"
    // InternalDSL.g:1427:1: rule__ExternalType__Group__0__Impl : ( 'Type' ) ;
    public final void rule__ExternalType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1431:1: ( ( 'Type' ) )
            // InternalDSL.g:1432:1: ( 'Type' )
            {
            // InternalDSL.g:1432:1: ( 'Type' )
            // InternalDSL.g:1433:1: 'Type'
            {
             before(grammarAccess.getExternalTypeAccess().getTypeKeyword_0()); 
            match(input,16,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getExternalTypeAccess().getTypeKeyword_0()); 

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
    // $ANTLR end "rule__ExternalType__Group__0__Impl"


    // $ANTLR start "rule__ExternalType__Group__1"
    // InternalDSL.g:1446:1: rule__ExternalType__Group__1 : rule__ExternalType__Group__1__Impl rule__ExternalType__Group__2 ;
    public final void rule__ExternalType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1450:1: ( rule__ExternalType__Group__1__Impl rule__ExternalType__Group__2 )
            // InternalDSL.g:1451:2: rule__ExternalType__Group__1__Impl rule__ExternalType__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__ExternalType__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExternalType__Group__2();

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
    // $ANTLR end "rule__ExternalType__Group__1"


    // $ANTLR start "rule__ExternalType__Group__1__Impl"
    // InternalDSL.g:1458:1: rule__ExternalType__Group__1__Impl : ( ( rule__ExternalType__NameAssignment_1 ) ) ;
    public final void rule__ExternalType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1462:1: ( ( ( rule__ExternalType__NameAssignment_1 ) ) )
            // InternalDSL.g:1463:1: ( ( rule__ExternalType__NameAssignment_1 ) )
            {
            // InternalDSL.g:1463:1: ( ( rule__ExternalType__NameAssignment_1 ) )
            // InternalDSL.g:1464:1: ( rule__ExternalType__NameAssignment_1 )
            {
             before(grammarAccess.getExternalTypeAccess().getNameAssignment_1()); 
            // InternalDSL.g:1465:1: ( rule__ExternalType__NameAssignment_1 )
            // InternalDSL.g:1465:2: rule__ExternalType__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExternalType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExternalTypeAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ExternalType__Group__1__Impl"


    // $ANTLR start "rule__ExternalType__Group__2"
    // InternalDSL.g:1475:1: rule__ExternalType__Group__2 : rule__ExternalType__Group__2__Impl ;
    public final void rule__ExternalType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1479:1: ( rule__ExternalType__Group__2__Impl )
            // InternalDSL.g:1480:2: rule__ExternalType__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExternalType__Group__2__Impl();

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
    // $ANTLR end "rule__ExternalType__Group__2"


    // $ANTLR start "rule__ExternalType__Group__2__Impl"
    // InternalDSL.g:1486:1: rule__ExternalType__Group__2__Impl : ( ';' ) ;
    public final void rule__ExternalType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1490:1: ( ( ';' ) )
            // InternalDSL.g:1491:1: ( ';' )
            {
            // InternalDSL.g:1491:1: ( ';' )
            // InternalDSL.g:1492:1: ';'
            {
             before(grammarAccess.getExternalTypeAccess().getSemicolonKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getExternalTypeAccess().getSemicolonKeyword_2()); 

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
    // $ANTLR end "rule__ExternalType__Group__2__Impl"


    // $ANTLR start "rule__PrimitiveType__Group__0"
    // InternalDSL.g:1511:1: rule__PrimitiveType__Group__0 : rule__PrimitiveType__Group__0__Impl rule__PrimitiveType__Group__1 ;
    public final void rule__PrimitiveType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1515:1: ( rule__PrimitiveType__Group__0__Impl rule__PrimitiveType__Group__1 )
            // InternalDSL.g:1516:2: rule__PrimitiveType__Group__0__Impl rule__PrimitiveType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__PrimitiveType__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__PrimitiveType__Group__1();

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
    // $ANTLR end "rule__PrimitiveType__Group__0"


    // $ANTLR start "rule__PrimitiveType__Group__0__Impl"
    // InternalDSL.g:1523:1: rule__PrimitiveType__Group__0__Impl : ( 'Primitive' ) ;
    public final void rule__PrimitiveType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1527:1: ( ( 'Primitive' ) )
            // InternalDSL.g:1528:1: ( 'Primitive' )
            {
            // InternalDSL.g:1528:1: ( 'Primitive' )
            // InternalDSL.g:1529:1: 'Primitive'
            {
             before(grammarAccess.getPrimitiveTypeAccess().getPrimitiveKeyword_0()); 
            match(input,17,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPrimitiveTypeAccess().getPrimitiveKeyword_0()); 

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
    // $ANTLR end "rule__PrimitiveType__Group__0__Impl"


    // $ANTLR start "rule__PrimitiveType__Group__1"
    // InternalDSL.g:1542:1: rule__PrimitiveType__Group__1 : rule__PrimitiveType__Group__1__Impl rule__PrimitiveType__Group__2 ;
    public final void rule__PrimitiveType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1546:1: ( rule__PrimitiveType__Group__1__Impl rule__PrimitiveType__Group__2 )
            // InternalDSL.g:1547:2: rule__PrimitiveType__Group__1__Impl rule__PrimitiveType__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__PrimitiveType__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__PrimitiveType__Group__2();

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
    // $ANTLR end "rule__PrimitiveType__Group__1"


    // $ANTLR start "rule__PrimitiveType__Group__1__Impl"
    // InternalDSL.g:1554:1: rule__PrimitiveType__Group__1__Impl : ( ( rule__PrimitiveType__NameAssignment_1 ) ) ;
    public final void rule__PrimitiveType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1558:1: ( ( ( rule__PrimitiveType__NameAssignment_1 ) ) )
            // InternalDSL.g:1559:1: ( ( rule__PrimitiveType__NameAssignment_1 ) )
            {
            // InternalDSL.g:1559:1: ( ( rule__PrimitiveType__NameAssignment_1 ) )
            // InternalDSL.g:1560:1: ( rule__PrimitiveType__NameAssignment_1 )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getNameAssignment_1()); 
            // InternalDSL.g:1561:1: ( rule__PrimitiveType__NameAssignment_1 )
            // InternalDSL.g:1561:2: rule__PrimitiveType__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PrimitiveType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypeAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__PrimitiveType__Group__1__Impl"


    // $ANTLR start "rule__PrimitiveType__Group__2"
    // InternalDSL.g:1571:1: rule__PrimitiveType__Group__2 : rule__PrimitiveType__Group__2__Impl ;
    public final void rule__PrimitiveType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1575:1: ( rule__PrimitiveType__Group__2__Impl )
            // InternalDSL.g:1576:2: rule__PrimitiveType__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PrimitiveType__Group__2__Impl();

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
    // $ANTLR end "rule__PrimitiveType__Group__2"


    // $ANTLR start "rule__PrimitiveType__Group__2__Impl"
    // InternalDSL.g:1582:1: rule__PrimitiveType__Group__2__Impl : ( ';' ) ;
    public final void rule__PrimitiveType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1586:1: ( ( ';' ) )
            // InternalDSL.g:1587:1: ( ';' )
            {
            // InternalDSL.g:1587:1: ( ';' )
            // InternalDSL.g:1588:1: ';'
            {
             before(grammarAccess.getPrimitiveTypeAccess().getSemicolonKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPrimitiveTypeAccess().getSemicolonKeyword_2()); 

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
    // $ANTLR end "rule__PrimitiveType__Group__2__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // InternalDSL.g:1607:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1611:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalDSL.g:1612:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Variable__Group__1();

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
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // InternalDSL.g:1619:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__TypeAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1623:1: ( ( ( rule__Variable__TypeAssignment_0 ) ) )
            // InternalDSL.g:1624:1: ( ( rule__Variable__TypeAssignment_0 ) )
            {
            // InternalDSL.g:1624:1: ( ( rule__Variable__TypeAssignment_0 ) )
            // InternalDSL.g:1625:1: ( rule__Variable__TypeAssignment_0 )
            {
             before(grammarAccess.getVariableAccess().getTypeAssignment_0()); 
            // InternalDSL.g:1626:1: ( rule__Variable__TypeAssignment_0 )
            // InternalDSL.g:1626:2: rule__Variable__TypeAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Variable__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getTypeAssignment_0()); 

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
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // InternalDSL.g:1636:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1640:1: ( rule__Variable__Group__1__Impl )
            // InternalDSL.g:1641:2: rule__Variable__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Variable__Group__1__Impl();

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
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // InternalDSL.g:1647:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__NameAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1651:1: ( ( ( rule__Variable__NameAssignment_1 ) ) )
            // InternalDSL.g:1652:1: ( ( rule__Variable__NameAssignment_1 ) )
            {
            // InternalDSL.g:1652:1: ( ( rule__Variable__NameAssignment_1 ) )
            // InternalDSL.g:1653:1: ( rule__Variable__NameAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_1()); 
            // InternalDSL.g:1654:1: ( rule__Variable__NameAssignment_1 )
            // InternalDSL.g:1654:2: rule__Variable__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Variable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__Method__Group__0"
    // InternalDSL.g:1668:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1672:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // InternalDSL.g:1673:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__Method__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Method__Group__1();

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
    // $ANTLR end "rule__Method__Group__0"


    // $ANTLR start "rule__Method__Group__0__Impl"
    // InternalDSL.g:1680:1: rule__Method__Group__0__Impl : ( ( rule__Method__ReturnTypeAssignment_0 ) ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1684:1: ( ( ( rule__Method__ReturnTypeAssignment_0 ) ) )
            // InternalDSL.g:1685:1: ( ( rule__Method__ReturnTypeAssignment_0 ) )
            {
            // InternalDSL.g:1685:1: ( ( rule__Method__ReturnTypeAssignment_0 ) )
            // InternalDSL.g:1686:1: ( rule__Method__ReturnTypeAssignment_0 )
            {
             before(grammarAccess.getMethodAccess().getReturnTypeAssignment_0()); 
            // InternalDSL.g:1687:1: ( rule__Method__ReturnTypeAssignment_0 )
            // InternalDSL.g:1687:2: rule__Method__ReturnTypeAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Method__ReturnTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getReturnTypeAssignment_0()); 

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
    // $ANTLR end "rule__Method__Group__0__Impl"


    // $ANTLR start "rule__Method__Group__1"
    // InternalDSL.g:1697:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1701:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // InternalDSL.g:1702:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__Method__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Method__Group__2();

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
    // $ANTLR end "rule__Method__Group__1"


    // $ANTLR start "rule__Method__Group__1__Impl"
    // InternalDSL.g:1709:1: rule__Method__Group__1__Impl : ( ( rule__Method__NameAssignment_1 ) ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1713:1: ( ( ( rule__Method__NameAssignment_1 ) ) )
            // InternalDSL.g:1714:1: ( ( rule__Method__NameAssignment_1 ) )
            {
            // InternalDSL.g:1714:1: ( ( rule__Method__NameAssignment_1 ) )
            // InternalDSL.g:1715:1: ( rule__Method__NameAssignment_1 )
            {
             before(grammarAccess.getMethodAccess().getNameAssignment_1()); 
            // InternalDSL.g:1716:1: ( rule__Method__NameAssignment_1 )
            // InternalDSL.g:1716:2: rule__Method__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Method__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Method__Group__1__Impl"


    // $ANTLR start "rule__Method__Group__2"
    // InternalDSL.g:1726:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1730:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // InternalDSL.g:1731:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__Method__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Method__Group__3();

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
    // $ANTLR end "rule__Method__Group__2"


    // $ANTLR start "rule__Method__Group__2__Impl"
    // InternalDSL.g:1738:1: rule__Method__Group__2__Impl : ( '(' ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1742:1: ( ( '(' ) )
            // InternalDSL.g:1743:1: ( '(' )
            {
            // InternalDSL.g:1743:1: ( '(' )
            // InternalDSL.g:1744:1: '('
            {
             before(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2()); 
            match(input,18,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__Method__Group__2__Impl"


    // $ANTLR start "rule__Method__Group__3"
    // InternalDSL.g:1757:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1761:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // InternalDSL.g:1762:2: rule__Method__Group__3__Impl rule__Method__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__Method__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Method__Group__4();

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
    // $ANTLR end "rule__Method__Group__3"


    // $ANTLR start "rule__Method__Group__3__Impl"
    // InternalDSL.g:1769:1: rule__Method__Group__3__Impl : ( ( rule__Method__Group_3__0 )? ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1773:1: ( ( ( rule__Method__Group_3__0 )? ) )
            // InternalDSL.g:1774:1: ( ( rule__Method__Group_3__0 )? )
            {
            // InternalDSL.g:1774:1: ( ( rule__Method__Group_3__0 )? )
            // InternalDSL.g:1775:1: ( rule__Method__Group_3__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_3()); 
            // InternalDSL.g:1776:1: ( rule__Method__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_STRING && LA12_0<=RULE_ID)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDSL.g:1776:2: rule__Method__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Method__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Method__Group__3__Impl"


    // $ANTLR start "rule__Method__Group__4"
    // InternalDSL.g:1786:1: rule__Method__Group__4 : rule__Method__Group__4__Impl ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1790:1: ( rule__Method__Group__4__Impl )
            // InternalDSL.g:1791:2: rule__Method__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Method__Group__4__Impl();

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
    // $ANTLR end "rule__Method__Group__4"


    // $ANTLR start "rule__Method__Group__4__Impl"
    // InternalDSL.g:1797:1: rule__Method__Group__4__Impl : ( ')' ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1801:1: ( ( ')' ) )
            // InternalDSL.g:1802:1: ( ')' )
            {
            // InternalDSL.g:1802:1: ( ')' )
            // InternalDSL.g:1803:1: ')'
            {
             before(grammarAccess.getMethodAccess().getRightParenthesisKeyword_4()); 
            match(input,19,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__Method__Group__4__Impl"


    // $ANTLR start "rule__Method__Group_3__0"
    // InternalDSL.g:1826:1: rule__Method__Group_3__0 : rule__Method__Group_3__0__Impl rule__Method__Group_3__1 ;
    public final void rule__Method__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1830:1: ( rule__Method__Group_3__0__Impl rule__Method__Group_3__1 )
            // InternalDSL.g:1831:2: rule__Method__Group_3__0__Impl rule__Method__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__Method__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Method__Group_3__1();

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
    // $ANTLR end "rule__Method__Group_3__0"


    // $ANTLR start "rule__Method__Group_3__0__Impl"
    // InternalDSL.g:1838:1: rule__Method__Group_3__0__Impl : ( ( rule__Method__ArgsAssignment_3_0 ) ) ;
    public final void rule__Method__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1842:1: ( ( ( rule__Method__ArgsAssignment_3_0 ) ) )
            // InternalDSL.g:1843:1: ( ( rule__Method__ArgsAssignment_3_0 ) )
            {
            // InternalDSL.g:1843:1: ( ( rule__Method__ArgsAssignment_3_0 ) )
            // InternalDSL.g:1844:1: ( rule__Method__ArgsAssignment_3_0 )
            {
             before(grammarAccess.getMethodAccess().getArgsAssignment_3_0()); 
            // InternalDSL.g:1845:1: ( rule__Method__ArgsAssignment_3_0 )
            // InternalDSL.g:1845:2: rule__Method__ArgsAssignment_3_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Method__ArgsAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getArgsAssignment_3_0()); 

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
    // $ANTLR end "rule__Method__Group_3__0__Impl"


    // $ANTLR start "rule__Method__Group_3__1"
    // InternalDSL.g:1855:1: rule__Method__Group_3__1 : rule__Method__Group_3__1__Impl ;
    public final void rule__Method__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1859:1: ( rule__Method__Group_3__1__Impl )
            // InternalDSL.g:1860:2: rule__Method__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Method__Group_3__1__Impl();

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
    // $ANTLR end "rule__Method__Group_3__1"


    // $ANTLR start "rule__Method__Group_3__1__Impl"
    // InternalDSL.g:1866:1: rule__Method__Group_3__1__Impl : ( ( rule__Method__Group_3_1__0 )* ) ;
    public final void rule__Method__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1870:1: ( ( ( rule__Method__Group_3_1__0 )* ) )
            // InternalDSL.g:1871:1: ( ( rule__Method__Group_3_1__0 )* )
            {
            // InternalDSL.g:1871:1: ( ( rule__Method__Group_3_1__0 )* )
            // InternalDSL.g:1872:1: ( rule__Method__Group_3_1__0 )*
            {
             before(grammarAccess.getMethodAccess().getGroup_3_1()); 
            // InternalDSL.g:1873:1: ( rule__Method__Group_3_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==20) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDSL.g:1873:2: rule__Method__Group_3_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_17);
            	    rule__Method__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getMethodAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__Method__Group_3__1__Impl"


    // $ANTLR start "rule__Method__Group_3_1__0"
    // InternalDSL.g:1887:1: rule__Method__Group_3_1__0 : rule__Method__Group_3_1__0__Impl rule__Method__Group_3_1__1 ;
    public final void rule__Method__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1891:1: ( rule__Method__Group_3_1__0__Impl rule__Method__Group_3_1__1 )
            // InternalDSL.g:1892:2: rule__Method__Group_3_1__0__Impl rule__Method__Group_3_1__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__Method__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Method__Group_3_1__1();

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
    // $ANTLR end "rule__Method__Group_3_1__0"


    // $ANTLR start "rule__Method__Group_3_1__0__Impl"
    // InternalDSL.g:1899:1: rule__Method__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Method__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1903:1: ( ( ',' ) )
            // InternalDSL.g:1904:1: ( ',' )
            {
            // InternalDSL.g:1904:1: ( ',' )
            // InternalDSL.g:1905:1: ','
            {
             before(grammarAccess.getMethodAccess().getCommaKeyword_3_1_0()); 
            match(input,20,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getCommaKeyword_3_1_0()); 

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
    // $ANTLR end "rule__Method__Group_3_1__0__Impl"


    // $ANTLR start "rule__Method__Group_3_1__1"
    // InternalDSL.g:1918:1: rule__Method__Group_3_1__1 : rule__Method__Group_3_1__1__Impl ;
    public final void rule__Method__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1922:1: ( rule__Method__Group_3_1__1__Impl )
            // InternalDSL.g:1923:2: rule__Method__Group_3_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Method__Group_3_1__1__Impl();

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
    // $ANTLR end "rule__Method__Group_3_1__1"


    // $ANTLR start "rule__Method__Group_3_1__1__Impl"
    // InternalDSL.g:1929:1: rule__Method__Group_3_1__1__Impl : ( ( rule__Method__ArgsAssignment_3_1_1 ) ) ;
    public final void rule__Method__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1933:1: ( ( ( rule__Method__ArgsAssignment_3_1_1 ) ) )
            // InternalDSL.g:1934:1: ( ( rule__Method__ArgsAssignment_3_1_1 ) )
            {
            // InternalDSL.g:1934:1: ( ( rule__Method__ArgsAssignment_3_1_1 ) )
            // InternalDSL.g:1935:1: ( rule__Method__ArgsAssignment_3_1_1 )
            {
             before(grammarAccess.getMethodAccess().getArgsAssignment_3_1_1()); 
            // InternalDSL.g:1936:1: ( rule__Method__ArgsAssignment_3_1_1 )
            // InternalDSL.g:1936:2: rule__Method__ArgsAssignment_3_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Method__ArgsAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getArgsAssignment_3_1_1()); 

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
    // $ANTLR end "rule__Method__Group_3_1__1__Impl"


    // $ANTLR start "rule__PortTypeElement__Group__0"
    // InternalDSL.g:1950:1: rule__PortTypeElement__Group__0 : rule__PortTypeElement__Group__0__Impl rule__PortTypeElement__Group__1 ;
    public final void rule__PortTypeElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1954:1: ( rule__PortTypeElement__Group__0__Impl rule__PortTypeElement__Group__1 )
            // InternalDSL.g:1955:2: rule__PortTypeElement__Group__0__Impl rule__PortTypeElement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__PortTypeElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__PortTypeElement__Group__1();

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
    // $ANTLR end "rule__PortTypeElement__Group__0"


    // $ANTLR start "rule__PortTypeElement__Group__0__Impl"
    // InternalDSL.g:1962:1: rule__PortTypeElement__Group__0__Impl : ( ( rule__PortTypeElement__Alternatives_0 ) ) ;
    public final void rule__PortTypeElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1966:1: ( ( ( rule__PortTypeElement__Alternatives_0 ) ) )
            // InternalDSL.g:1967:1: ( ( rule__PortTypeElement__Alternatives_0 ) )
            {
            // InternalDSL.g:1967:1: ( ( rule__PortTypeElement__Alternatives_0 ) )
            // InternalDSL.g:1968:1: ( rule__PortTypeElement__Alternatives_0 )
            {
             before(grammarAccess.getPortTypeElementAccess().getAlternatives_0()); 
            // InternalDSL.g:1969:1: ( rule__PortTypeElement__Alternatives_0 )
            // InternalDSL.g:1969:2: rule__PortTypeElement__Alternatives_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PortTypeElement__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getPortTypeElementAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__PortTypeElement__Group__0__Impl"


    // $ANTLR start "rule__PortTypeElement__Group__1"
    // InternalDSL.g:1979:1: rule__PortTypeElement__Group__1 : rule__PortTypeElement__Group__1__Impl ;
    public final void rule__PortTypeElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1983:1: ( rule__PortTypeElement__Group__1__Impl )
            // InternalDSL.g:1984:2: rule__PortTypeElement__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PortTypeElement__Group__1__Impl();

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
    // $ANTLR end "rule__PortTypeElement__Group__1"


    // $ANTLR start "rule__PortTypeElement__Group__1__Impl"
    // InternalDSL.g:1990:1: rule__PortTypeElement__Group__1__Impl : ( ';' ) ;
    public final void rule__PortTypeElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:1994:1: ( ( ';' ) )
            // InternalDSL.g:1995:1: ( ';' )
            {
            // InternalDSL.g:1995:1: ( ';' )
            // InternalDSL.g:1996:1: ';'
            {
             before(grammarAccess.getPortTypeElementAccess().getSemicolonKeyword_1()); 
            match(input,14,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPortTypeElementAccess().getSemicolonKeyword_1()); 

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
    // $ANTLR end "rule__PortTypeElement__Group__1__Impl"


    // $ANTLR start "rule__ComponentType__Group__0"
    // InternalDSL.g:2013:1: rule__ComponentType__Group__0 : rule__ComponentType__Group__0__Impl rule__ComponentType__Group__1 ;
    public final void rule__ComponentType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:2017:1: ( rule__ComponentType__Group__0__Impl rule__ComponentType__Group__1 )
            // InternalDSL.g:2018:2: rule__ComponentType__Group__0__Impl rule__ComponentType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__ComponentType__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ComponentType__Group__1();

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
    // $ANTLR end "rule__ComponentType__Group__0"


    // $ANTLR start "rule__ComponentType__Group__0__Impl"
    // InternalDSL.g:2025:1: rule__ComponentType__Group__0__Impl : ( () ) ;
    public final void rule__ComponentType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:2029:1: ( ( () ) )
            // InternalDSL.g:2030:1: ( () )
            {
            // InternalDSL.g:2030:1: ( () )
            // InternalDSL.g:2031:1: ()
            {
             before(grammarAccess.getComponentTypeAccess().getComponentTypeAction_0()); 
            // InternalDSL.g:2032:1: ()
            // InternalDSL.g:2034:1: 
            {
            }

             after(grammarAccess.getComponentTypeAccess().getComponentTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentType__Group__0__Impl"


    // $ANTLR start "rule__ComponentType__Group__1"
    // InternalDSL.g:2044:1: rule__ComponentType__Group__1 : rule__ComponentType__Group__1__Impl rule__ComponentType__Group__2 ;
    public final void rule__ComponentType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:2048:1: ( rule__ComponentType__Group__1__Impl rule__ComponentType__Group__2 )
            // InternalDSL.g:2049:2: rule__ComponentType__Group__1__Impl rule__ComponentType__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__ComponentType__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ComponentType__Group__2();

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
    // $ANTLR end "rule__ComponentType__Group__1"


    // $ANTLR start "rule__ComponentType__Group__1__Impl"
    // InternalDSL.g:2056:1: rule__ComponentType__Group__1__Impl : ( 'ComponentType' ) ;
    public final void rule__ComponentType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:2060:1: ( ( 'ComponentType' ) )
            // InternalDSL.g:2061:1: ( 'ComponentType' )
            {
            // InternalDSL.g:2061:1: ( 'ComponentType' )
            // InternalDSL.g:2062:1: 'ComponentType'
            {
             before(grammarAccess.getComponentTypeAccess().getComponentTypeKeyword_1()); 
            match(input,21,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getComponentTypeAccess().getComponentTypeKeyword_1()); 

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
    // $ANTLR end "rule__ComponentType__Group__1__Impl"


    // $ANTLR start "rule__ComponentType__Group__2"
    // InternalDSL.g:2075:1: rule__ComponentType__Group__2 : rule__ComponentType__Group__2__Impl rule__ComponentType__Group__3 ;
    public final void rule__ComponentType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:2079:1: ( rule__ComponentType__Group__2__Impl rule__ComponentType__Group__3 )
            // InternalDSL.g:2080:2: rule__ComponentType__Group__2__Impl rule__ComponentType__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__ComponentType__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ComponentType__Group__3();

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
    // $ANTLR end "rule__ComponentType__Group__2"


    // $ANTLR start "rule__ComponentType__Group__2__Impl"
    // InternalDSL.g:2087:1: rule__ComponentType__Group__2__Impl : ( ( rule__ComponentType__NameAssignment_2 ) ) ;
    public final void rule__ComponentType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:2091:1: ( ( ( rule__ComponentType__NameAssignment_2 ) ) )
            // InternalDSL.g:2092:1: ( ( rule__ComponentType__NameAssignment_2 ) )
            {
            // InternalDSL.g:2092:1: ( ( rule__ComponentType__NameAssignment_2 ) )
            // InternalDSL.g:2093:1: ( rule__ComponentType__NameAssignment_2 )
            {
             before(grammarAccess.getComponentTypeAccess().getNameAssignment_2()); 
            // InternalDSL.g:2094:1: ( rule__ComponentType__NameAssignment_2 )
            // InternalDSL.g:2094:2: rule__ComponentType__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ComponentType__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentTypeAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__ComponentType__Group__2__Impl"


    // $ANTLR start "rule__ComponentType__Group__3"
    // InternalDSL.g:2104:1: rule__ComponentType__Group__3 : rule__ComponentType__Group__3__Impl ;
    public final void rule__ComponentType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:2108:1: ( rule__ComponentType__Group__3__Impl )
            // InternalDSL.g:2109:2: rule__ComponentType__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ComponentType__Group__3__Impl();

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
    // $ANTLR end "rule__ComponentType__Group__3"


    // $ANTLR start "rule__ComponentType__Group__3__Impl"
    // InternalDSL.g:2115:1: rule__ComponentType__Group__3__Impl : ( ';' ) ;
    public final void rule__ComponentType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:2119:1: ( ( ';' ) )
            // InternalDSL.g:2120:1: ( ';' )
            {
            // InternalDSL.g:2120:1: ( ';' )
            // InternalDSL.g:2121:1: ';'
            {
             before(grammarAccess.getComponentTypeAccess().getSemicolonKeyword_3()); 
            match(input,14,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getComponentTypeAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__ComponentType__Group__3__Impl"


    // $ANTLR start "rule__PortType__Group__0"
    // InternalDSL.g:2142:1: rule__PortType__Group__0 : rule__PortType__Group__0__Impl rule__PortType__Group__1 ;
    public final void rule__PortType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:2146:1: ( rule__PortType__Group__0__Impl rule__PortType__Group__1 )
            // InternalDSL.g:2147:2: rule__PortType__Group__0__Impl rule__PortType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__PortType__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__PortType__Group__1();

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
    // $ANTLR end "rule__PortType__Group__0"


    // $ANTLR start "rule__PortType__Group__0__Impl"
    // InternalDSL.g:2154:1: rule__PortType__Group__0__Impl : ( () ) ;
    public final void rule__PortType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:2158:1: ( ( () ) )
            // InternalDSL.g:2159:1: ( () )
            {
            // InternalDSL.g:2159:1: ( () )
            // InternalDSL.g:2160:1: ()
            {
             before(grammarAccess.getPortTypeAccess().getPortTypeAction_0()); 
            // InternalDSL.g:2161:1: ()
            // InternalDSL.g:2163:1: 
            {
            }

             after(grammarAccess.getPortTypeAccess().getPortTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortType__Group__0__Impl"


    // $ANTLR start "rule__PortType__Group__1"
    // InternalDSL.g:2173:1: rule__PortType__Group__1 : rule__PortType__Group__1__Impl rule__PortType__Group__2 ;
    public final void rule__PortType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:2177:1: ( rule__PortType__Group__1__Impl rule__PortType__Group__2 )
            // InternalDSL.g:2178:2: rule__PortType__Group__1__Impl rule__PortType__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__PortType__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__PortType__Group__2();

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
    // $ANTLR end "rule__PortType__Group__1"


    // $ANTLR start "rule__PortType__Group__1__Impl"
    // InternalDSL.g:2185:1: rule__PortType__Group__1__Impl : ( 'PortType' ) ;
    public final void rule__PortType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:2189:1: ( ( 'PortType' ) )
            // InternalDSL.g:2190:1: ( 'PortType' )
            {
            // InternalDSL.g:2190:1: ( 'PortType' )
            // InternalDSL.g:2191:1: 'PortType'
            {
             before(grammarAccess.getPortTypeAccess().getPortTypeKeyword_1()); 
            match(input,22,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPortTypeAccess().getPortTypeKeyword_1()); 

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
    // $ANTLR end "rule__PortType__Group__1__Impl"


    // $ANTLR start "rule__PortType__Group__2"
    // InternalDSL.g:2204:1: rule__PortType__Group__2 : rule__PortType__Group__2__Impl rule__PortType__Group__3 ;
    public final void rule__PortType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:2208:1: ( rule__PortType__Group__2__Impl rule__PortType__Group__3 )
            // InternalDSL.g:2209:2: rule__PortType__Group__2__Impl rule__PortType__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__PortType__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__PortType__Group__3();

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
    // $ANTLR end "rule__PortType__Group__2"


    // $ANTLR start "rule__PortType__Group__2__Impl"
    // InternalDSL.g:2216:1: rule__PortType__Group__2__Impl : ( ( rule__PortType__NameAssignment_2 ) ) ;
    public final void rule__PortType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:2220:1: ( ( ( rule__PortType__NameAssignment_2 ) ) )
            // InternalDSL.g:2221:1: ( ( rule__PortType__NameAssignment_2 ) )
            {
            // InternalDSL.g:2221:1: ( ( rule__PortType__NameAssignment_2 ) )
            // InternalDSL.g:2222:1: ( rule__PortType__NameAssignment_2 )
            {
             before(grammarAccess.getPortTypeAccess().getNameAssignment_2()); 
            // InternalDSL.g:2223:1: ( rule__PortType__NameAssignment_2 )
            // InternalDSL.g:2223:2: rule__PortType__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PortType__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPortTypeAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__PortType__Group__2__Impl"


    // $ANTLR start "rule__PortType__Group__3"
    // InternalDSL.g:2233:1: rule__PortType__Group__3 : rule__PortType__Group__3__Impl rule__PortType__Group__4 ;
    public final void rule__PortType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:2237:1: ( rule__PortType__Group__3__Impl rule__PortType__Group__4 )
            // InternalDSL.g:2238:2: rule__PortType__Group__3__Impl rule__PortType__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__PortType__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__PortType__Group__4();

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
    // $ANTLR end "rule__PortType__Group__3"


    // $ANTLR start "rule__PortType__Group__3__Impl"
    // InternalDSL.g:2245:1: rule__PortType__Group__3__Impl : ( '{' ) ;
    public final void rule__PortType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:2249:1: ( ( '{' ) )
            // InternalDSL.g:2250:1: ( '{' )
            {
            // InternalDSL.g:2250:1: ( '{' )
            // InternalDSL.g:2251:1: '{'
            {
             before(grammarAccess.getPortTypeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPortTypeAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__PortType__Group__3__Impl"


    // $ANTLR start "rule__PortType__Group__4"
    // InternalDSL.g:2264:1: rule__PortType__Group__4 : rule__PortType__Group__4__Impl rule__PortType__Group__5 ;
    public final void rule__PortType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:2268:1: ( rule__PortType__Group__4__Impl rule__PortType__Group__5 )
            // InternalDSL.g:2269:2: rule__PortType__Group__4__Impl rule__PortType__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__PortType__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__PortType__Group__5();

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
    // $ANTLR end "rule__PortType__Group__4"


    // $ANTLR start "rule__PortType__Group__4__Impl"
    // InternalDSL.g:2276:1: rule__PortType__Group__4__Impl : ( ( rule__PortType__ElementsAssignment_4 )* ) ;
    public final void rule__PortType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:2280:1: ( ( ( rule__PortType__ElementsAssignment_4 )* ) )
            // InternalDSL.g:2281:1: ( ( rule__PortType__ElementsAssignment_4 )* )
            {
            // InternalDSL.g:2281:1: ( ( rule__PortType__ElementsAssignment_4 )* )
            // InternalDSL.g:2282:1: ( rule__PortType__ElementsAssignment_4 )*
            {
             before(grammarAccess.getPortTypeAccess().getElementsAssignment_4()); 
            // InternalDSL.g:2283:1: ( rule__PortType__ElementsAssignment_4 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_ID)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDSL.g:2283:2: rule__PortType__ElementsAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_21);
            	    rule__PortType__ElementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getPortTypeAccess().getElementsAssignment_4()); 

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
    // $ANTLR end "rule__PortType__Group__4__Impl"


    // $ANTLR start "rule__PortType__Group__5"
    // InternalDSL.g:2293:1: rule__PortType__Group__5 : rule__PortType__Group__5__Impl ;
    public final void rule__PortType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:2297:1: ( rule__PortType__Group__5__Impl )
            // InternalDSL.g:2298:2: rule__PortType__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PortType__Group__5__Impl();

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
    // $ANTLR end "rule__PortType__Group__5"


    // $ANTLR start "rule__PortType__Group__5__Impl"
    // InternalDSL.g:2304:1: rule__PortType__Group__5__Impl : ( '}' ) ;
    public final void rule__PortType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:2308:1: ( ( '}' ) )
            // InternalDSL.g:2309:1: ( '}' )
            {
            // InternalDSL.g:2309:1: ( '}' )
            // InternalDSL.g:2310:1: '}'
            {
             before(grammarAccess.getPortTypeAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPortTypeAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__PortType__Group__5__Impl"


    // $ANTLR start "rule__RoleModel__Group__0"
    // InternalDSL.g:2335:1: rule__RoleModel__Group__0 : rule__RoleModel__Group__0__Impl rule__RoleModel__Group__1 ;
    public final void rule__RoleModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:2339:1: ( rule__RoleModel__Group__0__Impl rule__RoleModel__Group__1 )
            // InternalDSL.g:2340:2: rule__RoleModel__Group__0__Impl rule__RoleModel__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__RoleModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__RoleModel__Group__1();

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
    // $ANTLR end "rule__RoleModel__Group__0"


    // $ANTLR start "rule__RoleModel__Group__0__Impl"
    // InternalDSL.g:2347:1: rule__RoleModel__Group__0__Impl : ( () ) ;
    public final void rule__RoleModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:2351:1: ( ( () ) )
            // InternalDSL.g:2352:1: ( () )
            {
            // InternalDSL.g:2352:1: ( () )
            // InternalDSL.g:2353:1: ()
            {
             before(grammarAccess.getRoleModelAccess().getRoleModelAction_0()); 
            // InternalDSL.g:2354:1: ()
            // InternalDSL.g:2356:1: 
            {
            }

             after(grammarAccess.getRoleModelAccess().getRoleModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleModel__Group__0__Impl"


    // $ANTLR start "rule__RoleModel__Group__1"
    // InternalDSL.g:2366:1: rule__RoleModel__Group__1 : rule__RoleModel__Group__1__Impl rule__RoleModel__Group__2 ;
    public final void rule__RoleModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:2370:1: ( rule__RoleModel__Group__1__Impl rule__RoleModel__Group__2 )
            // InternalDSL.g:2371:2: rule__RoleModel__Group__1__Impl rule__RoleModel__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__RoleModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__RoleModel__Group__2();

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
    // $ANTLR end "rule__RoleModel__Group__1"


    // $ANTLR start "rule__RoleModel__Group__1__Impl"
    // InternalDSL.g:2378:1: rule__RoleModel__Group__1__Impl : ( 'RoleModel' ) ;
    public final void rule__RoleModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:2382:1: ( ( 'RoleModel' ) )
            // InternalDSL.g:2383:1: ( 'RoleModel' )
            {
            // InternalDSL.g:2383:1: ( 'RoleModel' )
            // InternalDSL.g:2384:1: 'RoleModel'
            {
             before(grammarAccess.getRoleModelAccess().getRoleModelKeyword_1()); 
            match(input,23,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getRoleModelAccess().getRoleModelKeyword_1()); 

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
    // $ANTLR end "rule__RoleModel__Group__1__Impl"


    // $ANTLR start "rule__RoleModel__Group__2"
    // InternalDSL.g:2397:1: rule__RoleModel__Group__2 : rule__RoleModel__Group__2__Impl rule__RoleModel__Group__3 ;
    public final void rule__RoleModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:2401:1: ( rule__RoleModel__Group__2__Impl rule__RoleModel__Group__3 )
            // InternalDSL.g:2402:2: rule__RoleModel__Group__2__Impl rule__RoleModel__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__RoleModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__RoleModel__Group__3();

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
    // $ANTLR end "rule__RoleModel__Group__2"


    // $ANTLR start "rule__RoleModel__Group__2__Impl"
    // InternalDSL.g:2409:1: rule__RoleModel__Group__2__Impl : ( ( rule__RoleModel__NameAssignment_2 ) ) ;
    public final void rule__RoleModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:2413:1: ( ( ( rule__RoleModel__NameAssignment_2 ) ) )
            // InternalDSL.g:2414:1: ( ( rule__RoleModel__NameAssignment_2 ) )
            {
            // InternalDSL.g:2414:1: ( ( rule__RoleModel__NameAssignment_2 ) )
            // InternalDSL.g:2415:1: ( rule__RoleModel__NameAssignment_2 )
            {
             before(grammarAccess.getRoleModelAccess().getNameAssignment_2()); 
            // InternalDSL.g:2416:1: ( rule__RoleModel__NameAssignment_2 )
            // InternalDSL.g:2416:2: rule__RoleModel__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RoleModel__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRoleModelAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__RoleModel__Group__2__Impl"


    // $ANTLR start "rule__RoleModel__Group__3"
    // InternalDSL.g:2426:1: rule__RoleModel__Group__3 : rule__RoleModel__Group__3__Impl rule__RoleModel__Group__4 ;
    public final void rule__RoleModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:2430:1: ( rule__RoleModel__Group__3__Impl rule__RoleModel__Group__4 )
            // InternalDSL.g:2431:2: rule__RoleModel__Group__3__Impl rule__RoleModel__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__RoleModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__RoleModel__Group__4();

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
    // $ANTLR end "rule__RoleModel__Group__3"


    // $ANTLR start "rule__RoleModel__Group__3__Impl"
    // InternalDSL.g:2438:1: rule__RoleModel__Group__3__Impl : ( ( rule__RoleModel__Group_3__0 )? ) ;
    public final void rule__RoleModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:2442:1: ( ( ( rule__RoleModel__Group_3__0 )? ) )
            // InternalDSL.g:2443:1: ( ( rule__RoleModel__Group_3__0 )? )
            {
            // InternalDSL.g:2443:1: ( ( rule__RoleModel__Group_3__0 )? )
            // InternalDSL.g:2444:1: ( rule__RoleModel__Group_3__0 )?
            {
             before(grammarAccess.getRoleModelAccess().getGroup_3()); 
            // InternalDSL.g:2445:1: ( rule__RoleModel__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDSL.g:2445:2: rule__RoleModel__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__RoleModel__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRoleModelAccess().getGroup_3()); 

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
    // $ANTLR end "rule__RoleModel__Group__3__Impl"


    // $ANTLR start "rule__RoleModel__Group__4"
    // InternalDSL.g:2455:1: rule__RoleModel__Group__4 : rule__RoleModel__Group__4__Impl rule__RoleModel__Group__5 ;
    public final void rule__RoleModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:2459:1: ( rule__RoleModel__Group__4__Impl rule__RoleModel__Group__5 )
            // InternalDSL.g:2460:2: rule__RoleModel__Group__4__Impl rule__RoleModel__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__RoleModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__RoleModel__Group__5();

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
    // $ANTLR end "rule__RoleModel__Group__4"


    // $ANTLR start "rule__RoleModel__Group__4__Impl"
    // InternalDSL.g:2467:1: rule__RoleModel__Group__4__Impl : ( '{' ) ;
    public final void rule__RoleModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:2471:1: ( ( '{' ) )
            // InternalDSL.g:2472:1: ( '{' )
            {
            // InternalDSL.g:2472:1: ( '{' )
            // InternalDSL.g:2473:1: '{'
            {
             before(grammarAccess.getRoleModelAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,12,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getRoleModelAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__RoleModel__Group__4__Impl"


    // $ANTLR start "rule__RoleModel__Group__5"
    // InternalDSL.g:2486:1: rule__RoleModel__Group__5 : rule__RoleModel__Group__5__Impl rule__RoleModel__Group__6 ;
    public final void rule__RoleModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:2490:1: ( rule__RoleModel__Group__5__Impl rule__RoleModel__Group__6 )
            // InternalDSL.g:2491:2: rule__RoleModel__Group__5__Impl rule__RoleModel__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__RoleModel__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__RoleModel__Group__6();

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
    // $ANTLR end "rule__RoleModel__Group__5"


    // $ANTLR start "rule__RoleModel__Group__5__Impl"
    // InternalDSL.g:2498:1: rule__RoleModel__Group__5__Impl : ( ( rule__RoleModel__InitializationAssignment_5 )* ) ;
    public final void rule__RoleModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:2502:1: ( ( ( rule__RoleModel__InitializationAssignment_5 )* ) )
            // InternalDSL.g:2503:1: ( ( rule__RoleModel__InitializationAssignment_5 )* )
            {
            // InternalDSL.g:2503:1: ( ( rule__RoleModel__InitializationAssignment_5 )* )
            // InternalDSL.g:2504:1: ( rule__RoleModel__InitializationAssignment_5 )*
            {
             before(grammarAccess.getRoleModelAccess().getInitializationAssignment_5()); 
            // InternalDSL.g:2505:1: ( rule__RoleModel__InitializationAssignment_5 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==24) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDSL.g:2505:2: rule__RoleModel__InitializationAssignment_5
            	    {
            	    pushFollow(FollowSets000.FOLLOW_25);
            	    rule__RoleModel__InitializationAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getRoleModelAccess().getInitializationAssignment_5()); 

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
    // $ANTLR end "rule__RoleModel__Group__5__Impl"


    // $ANTLR start "rule__RoleModel__Group__6"
    // InternalDSL.g:2515:1: rule__RoleModel__Group__6 : rule__RoleModel__Group__6__Impl ;
    public final void rule__RoleModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:2519:1: ( rule__RoleModel__Group__6__Impl )
            // InternalDSL.g:2520:2: rule__RoleModel__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RoleModel__Group__6__Impl();

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
    // $ANTLR end "rule__RoleModel__Group__6"


    // $ANTLR start "rule__RoleModel__Group__6__Impl"
    // InternalDSL.g:2526:1: rule__RoleModel__Group__6__Impl : ( '}' ) ;
    public final void rule__RoleModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:2530:1: ( ( '}' ) )
            // InternalDSL.g:2531:1: ( '}' )
            {
            // InternalDSL.g:2531:1: ( '}' )
            // InternalDSL.g:2532:1: '}'
            {
             before(grammarAccess.getRoleModelAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getRoleModelAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__RoleModel__Group__6__Impl"


    // $ANTLR start "rule__RoleModel__Group_3__0"
    // InternalDSL.g:2559:1: rule__RoleModel__Group_3__0 : rule__RoleModel__Group_3__0__Impl rule__RoleModel__Group_3__1 ;
    public final void rule__RoleModel__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:2563:1: ( rule__RoleModel__Group_3__0__Impl rule__RoleModel__Group_3__1 )
            // InternalDSL.g:2564:2: rule__RoleModel__Group_3__0__Impl rule__RoleModel__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__RoleModel__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__RoleModel__Group_3__1();

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
    // $ANTLR end "rule__RoleModel__Group_3__0"


    // $ANTLR start "rule__RoleModel__Group_3__0__Impl"
    // InternalDSL.g:2571:1: rule__RoleModel__Group_3__0__Impl : ( '(' ) ;
    public final void rule__RoleModel__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:2575:1: ( ( '(' ) )
            // InternalDSL.g:2576:1: ( '(' )
            {
            // InternalDSL.g:2576:1: ( '(' )
            // InternalDSL.g:2577:1: '('
            {
             before(grammarAccess.getRoleModelAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,18,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getRoleModelAccess().getLeftParenthesisKeyword_3_0()); 

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
    // $ANTLR end "rule__RoleModel__Group_3__0__Impl"


    // $ANTLR start "rule__RoleModel__Group_3__1"
    // InternalDSL.g:2590:1: rule__RoleModel__Group_3__1 : rule__RoleModel__Group_3__1__Impl rule__RoleModel__Group_3__2 ;
    public final void rule__RoleModel__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:2594:1: ( rule__RoleModel__Group_3__1__Impl rule__RoleModel__Group_3__2 )
            // InternalDSL.g:2595:2: rule__RoleModel__Group_3__1__Impl rule__RoleModel__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__RoleModel__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__RoleModel__Group_3__2();

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
    // $ANTLR end "rule__RoleModel__Group_3__1"


    // $ANTLR start "rule__RoleModel__Group_3__1__Impl"
    // InternalDSL.g:2602:1: rule__RoleModel__Group_3__1__Impl : ( ( rule__RoleModel__SlotsAssignment_3_1 ) ) ;
    public final void rule__RoleModel__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:2606:1: ( ( ( rule__RoleModel__SlotsAssignment_3_1 ) ) )
            // InternalDSL.g:2607:1: ( ( rule__RoleModel__SlotsAssignment_3_1 ) )
            {
            // InternalDSL.g:2607:1: ( ( rule__RoleModel__SlotsAssignment_3_1 ) )
            // InternalDSL.g:2608:1: ( rule__RoleModel__SlotsAssignment_3_1 )
            {
             before(grammarAccess.getRoleModelAccess().getSlotsAssignment_3_1()); 
            // InternalDSL.g:2609:1: ( rule__RoleModel__SlotsAssignment_3_1 )
            // InternalDSL.g:2609:2: rule__RoleModel__SlotsAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RoleModel__SlotsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRoleModelAccess().getSlotsAssignment_3_1()); 

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
    // $ANTLR end "rule__RoleModel__Group_3__1__Impl"


    // $ANTLR start "rule__RoleModel__Group_3__2"
    // InternalDSL.g:2619:1: rule__RoleModel__Group_3__2 : rule__RoleModel__Group_3__2__Impl rule__RoleModel__Group_3__3 ;
    public final void rule__RoleModel__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:2623:1: ( rule__RoleModel__Group_3__2__Impl rule__RoleModel__Group_3__3 )
            // InternalDSL.g:2624:2: rule__RoleModel__Group_3__2__Impl rule__RoleModel__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__RoleModel__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__RoleModel__Group_3__3();

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
    // $ANTLR end "rule__RoleModel__Group_3__2"


    // $ANTLR start "rule__RoleModel__Group_3__2__Impl"
    // InternalDSL.g:2631:1: rule__RoleModel__Group_3__2__Impl : ( ( rule__RoleModel__Group_3_2__0 )* ) ;
    public final void rule__RoleModel__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:2635:1: ( ( ( rule__RoleModel__Group_3_2__0 )* ) )
            // InternalDSL.g:2636:1: ( ( rule__RoleModel__Group_3_2__0 )* )
            {
            // InternalDSL.g:2636:1: ( ( rule__RoleModel__Group_3_2__0 )* )
            // InternalDSL.g:2637:1: ( rule__RoleModel__Group_3_2__0 )*
            {
             before(grammarAccess.getRoleModelAccess().getGroup_3_2()); 
            // InternalDSL.g:2638:1: ( rule__RoleModel__Group_3_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==20) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDSL.g:2638:2: rule__RoleModel__Group_3_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_17);
            	    rule__RoleModel__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getRoleModelAccess().getGroup_3_2()); 

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
    // $ANTLR end "rule__RoleModel__Group_3__2__Impl"


    // $ANTLR start "rule__RoleModel__Group_3__3"
    // InternalDSL.g:2648:1: rule__RoleModel__Group_3__3 : rule__RoleModel__Group_3__3__Impl ;
    public final void rule__RoleModel__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:2652:1: ( rule__RoleModel__Group_3__3__Impl )
            // InternalDSL.g:2653:2: rule__RoleModel__Group_3__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RoleModel__Group_3__3__Impl();

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
    // $ANTLR end "rule__RoleModel__Group_3__3"


    // $ANTLR start "rule__RoleModel__Group_3__3__Impl"
    // InternalDSL.g:2659:1: rule__RoleModel__Group_3__3__Impl : ( ')' ) ;
    public final void rule__RoleModel__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:2663:1: ( ( ')' ) )
            // InternalDSL.g:2664:1: ( ')' )
            {
            // InternalDSL.g:2664:1: ( ')' )
            // InternalDSL.g:2665:1: ')'
            {
             before(grammarAccess.getRoleModelAccess().getRightParenthesisKeyword_3_3()); 
            match(input,19,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getRoleModelAccess().getRightParenthesisKeyword_3_3()); 

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
    // $ANTLR end "rule__RoleModel__Group_3__3__Impl"


    // $ANTLR start "rule__RoleModel__Group_3_2__0"
    // InternalDSL.g:2686:1: rule__RoleModel__Group_3_2__0 : rule__RoleModel__Group_3_2__0__Impl rule__RoleModel__Group_3_2__1 ;
    public final void rule__RoleModel__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:2690:1: ( rule__RoleModel__Group_3_2__0__Impl rule__RoleModel__Group_3_2__1 )
            // InternalDSL.g:2691:2: rule__RoleModel__Group_3_2__0__Impl rule__RoleModel__Group_3_2__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__RoleModel__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__RoleModel__Group_3_2__1();

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
    // $ANTLR end "rule__RoleModel__Group_3_2__0"


    // $ANTLR start "rule__RoleModel__Group_3_2__0__Impl"
    // InternalDSL.g:2698:1: rule__RoleModel__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__RoleModel__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:2702:1: ( ( ',' ) )
            // InternalDSL.g:2703:1: ( ',' )
            {
            // InternalDSL.g:2703:1: ( ',' )
            // InternalDSL.g:2704:1: ','
            {
             before(grammarAccess.getRoleModelAccess().getCommaKeyword_3_2_0()); 
            match(input,20,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getRoleModelAccess().getCommaKeyword_3_2_0()); 

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
    // $ANTLR end "rule__RoleModel__Group_3_2__0__Impl"


    // $ANTLR start "rule__RoleModel__Group_3_2__1"
    // InternalDSL.g:2717:1: rule__RoleModel__Group_3_2__1 : rule__RoleModel__Group_3_2__1__Impl ;
    public final void rule__RoleModel__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:2721:1: ( rule__RoleModel__Group_3_2__1__Impl )
            // InternalDSL.g:2722:2: rule__RoleModel__Group_3_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RoleModel__Group_3_2__1__Impl();

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
    // $ANTLR end "rule__RoleModel__Group_3_2__1"


    // $ANTLR start "rule__RoleModel__Group_3_2__1__Impl"
    // InternalDSL.g:2728:1: rule__RoleModel__Group_3_2__1__Impl : ( ( rule__RoleModel__SlotsAssignment_3_2_1 ) ) ;
    public final void rule__RoleModel__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:2732:1: ( ( ( rule__RoleModel__SlotsAssignment_3_2_1 ) ) )
            // InternalDSL.g:2733:1: ( ( rule__RoleModel__SlotsAssignment_3_2_1 ) )
            {
            // InternalDSL.g:2733:1: ( ( rule__RoleModel__SlotsAssignment_3_2_1 ) )
            // InternalDSL.g:2734:1: ( rule__RoleModel__SlotsAssignment_3_2_1 )
            {
             before(grammarAccess.getRoleModelAccess().getSlotsAssignment_3_2_1()); 
            // InternalDSL.g:2735:1: ( rule__RoleModel__SlotsAssignment_3_2_1 )
            // InternalDSL.g:2735:2: rule__RoleModel__SlotsAssignment_3_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RoleModel__SlotsAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRoleModelAccess().getSlotsAssignment_3_2_1()); 

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
    // $ANTLR end "rule__RoleModel__Group_3_2__1__Impl"


    // $ANTLR start "rule__RoleModelSlot__Group__0"
    // InternalDSL.g:2749:1: rule__RoleModelSlot__Group__0 : rule__RoleModelSlot__Group__0__Impl rule__RoleModelSlot__Group__1 ;
    public final void rule__RoleModelSlot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:2753:1: ( rule__RoleModelSlot__Group__0__Impl rule__RoleModelSlot__Group__1 )
            // InternalDSL.g:2754:2: rule__RoleModelSlot__Group__0__Impl rule__RoleModelSlot__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__RoleModelSlot__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__RoleModelSlot__Group__1();

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
    // $ANTLR end "rule__RoleModelSlot__Group__0"


    // $ANTLR start "rule__RoleModelSlot__Group__0__Impl"
    // InternalDSL.g:2761:1: rule__RoleModelSlot__Group__0__Impl : ( () ) ;
    public final void rule__RoleModelSlot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:2765:1: ( ( () ) )
            // InternalDSL.g:2766:1: ( () )
            {
            // InternalDSL.g:2766:1: ( () )
            // InternalDSL.g:2767:1: ()
            {
             before(grammarAccess.getRoleModelSlotAccess().getRoleModelSlotAction_0()); 
            // InternalDSL.g:2768:1: ()
            // InternalDSL.g:2770:1: 
            {
            }

             after(grammarAccess.getRoleModelSlotAccess().getRoleModelSlotAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleModelSlot__Group__0__Impl"


    // $ANTLR start "rule__RoleModelSlot__Group__1"
    // InternalDSL.g:2780:1: rule__RoleModelSlot__Group__1 : rule__RoleModelSlot__Group__1__Impl rule__RoleModelSlot__Group__2 ;
    public final void rule__RoleModelSlot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:2784:1: ( rule__RoleModelSlot__Group__1__Impl rule__RoleModelSlot__Group__2 )
            // InternalDSL.g:2785:2: rule__RoleModelSlot__Group__1__Impl rule__RoleModelSlot__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__RoleModelSlot__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__RoleModelSlot__Group__2();

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
    // $ANTLR end "rule__RoleModelSlot__Group__1"


    // $ANTLR start "rule__RoleModelSlot__Group__1__Impl"
    // InternalDSL.g:2792:1: rule__RoleModelSlot__Group__1__Impl : ( ( rule__RoleModelSlot__TypeAssignment_1 ) ) ;
    public final void rule__RoleModelSlot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:2796:1: ( ( ( rule__RoleModelSlot__TypeAssignment_1 ) ) )
            // InternalDSL.g:2797:1: ( ( rule__RoleModelSlot__TypeAssignment_1 ) )
            {
            // InternalDSL.g:2797:1: ( ( rule__RoleModelSlot__TypeAssignment_1 ) )
            // InternalDSL.g:2798:1: ( rule__RoleModelSlot__TypeAssignment_1 )
            {
             before(grammarAccess.getRoleModelSlotAccess().getTypeAssignment_1()); 
            // InternalDSL.g:2799:1: ( rule__RoleModelSlot__TypeAssignment_1 )
            // InternalDSL.g:2799:2: rule__RoleModelSlot__TypeAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RoleModelSlot__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRoleModelSlotAccess().getTypeAssignment_1()); 

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
    // $ANTLR end "rule__RoleModelSlot__Group__1__Impl"


    // $ANTLR start "rule__RoleModelSlot__Group__2"
    // InternalDSL.g:2809:1: rule__RoleModelSlot__Group__2 : rule__RoleModelSlot__Group__2__Impl ;
    public final void rule__RoleModelSlot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:2813:1: ( rule__RoleModelSlot__Group__2__Impl )
            // InternalDSL.g:2814:2: rule__RoleModelSlot__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RoleModelSlot__Group__2__Impl();

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
    // $ANTLR end "rule__RoleModelSlot__Group__2"


    // $ANTLR start "rule__RoleModelSlot__Group__2__Impl"
    // InternalDSL.g:2820:1: rule__RoleModelSlot__Group__2__Impl : ( ( rule__RoleModelSlot__NameAssignment_2 ) ) ;
    public final void rule__RoleModelSlot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:2824:1: ( ( ( rule__RoleModelSlot__NameAssignment_2 ) ) )
            // InternalDSL.g:2825:1: ( ( rule__RoleModelSlot__NameAssignment_2 ) )
            {
            // InternalDSL.g:2825:1: ( ( rule__RoleModelSlot__NameAssignment_2 ) )
            // InternalDSL.g:2826:1: ( rule__RoleModelSlot__NameAssignment_2 )
            {
             before(grammarAccess.getRoleModelSlotAccess().getNameAssignment_2()); 
            // InternalDSL.g:2827:1: ( rule__RoleModelSlot__NameAssignment_2 )
            // InternalDSL.g:2827:2: rule__RoleModelSlot__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RoleModelSlot__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRoleModelSlotAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__RoleModelSlot__Group__2__Impl"


    // $ANTLR start "rule__BindOperator__Group__0"
    // InternalDSL.g:2843:1: rule__BindOperator__Group__0 : rule__BindOperator__Group__0__Impl rule__BindOperator__Group__1 ;
    public final void rule__BindOperator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:2847:1: ( rule__BindOperator__Group__0__Impl rule__BindOperator__Group__1 )
            // InternalDSL.g:2848:2: rule__BindOperator__Group__0__Impl rule__BindOperator__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__BindOperator__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__BindOperator__Group__1();

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
    // $ANTLR end "rule__BindOperator__Group__0"


    // $ANTLR start "rule__BindOperator__Group__0__Impl"
    // InternalDSL.g:2855:1: rule__BindOperator__Group__0__Impl : ( () ) ;
    public final void rule__BindOperator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:2859:1: ( ( () ) )
            // InternalDSL.g:2860:1: ( () )
            {
            // InternalDSL.g:2860:1: ( () )
            // InternalDSL.g:2861:1: ()
            {
             before(grammarAccess.getBindOperatorAccess().getBindOperatorAction_0()); 
            // InternalDSL.g:2862:1: ()
            // InternalDSL.g:2864:1: 
            {
            }

             after(grammarAccess.getBindOperatorAccess().getBindOperatorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BindOperator__Group__0__Impl"


    // $ANTLR start "rule__BindOperator__Group__1"
    // InternalDSL.g:2874:1: rule__BindOperator__Group__1 : rule__BindOperator__Group__1__Impl rule__BindOperator__Group__2 ;
    public final void rule__BindOperator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:2878:1: ( rule__BindOperator__Group__1__Impl rule__BindOperator__Group__2 )
            // InternalDSL.g:2879:2: rule__BindOperator__Group__1__Impl rule__BindOperator__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_28);
            rule__BindOperator__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__BindOperator__Group__2();

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
    // $ANTLR end "rule__BindOperator__Group__1"


    // $ANTLR start "rule__BindOperator__Group__1__Impl"
    // InternalDSL.g:2886:1: rule__BindOperator__Group__1__Impl : ( 'bind' ) ;
    public final void rule__BindOperator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:2890:1: ( ( 'bind' ) )
            // InternalDSL.g:2891:1: ( 'bind' )
            {
            // InternalDSL.g:2891:1: ( 'bind' )
            // InternalDSL.g:2892:1: 'bind'
            {
             before(grammarAccess.getBindOperatorAccess().getBindKeyword_1()); 
            match(input,24,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getBindOperatorAccess().getBindKeyword_1()); 

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
    // $ANTLR end "rule__BindOperator__Group__1__Impl"


    // $ANTLR start "rule__BindOperator__Group__2"
    // InternalDSL.g:2905:1: rule__BindOperator__Group__2 : rule__BindOperator__Group__2__Impl rule__BindOperator__Group__3 ;
    public final void rule__BindOperator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:2909:1: ( rule__BindOperator__Group__2__Impl rule__BindOperator__Group__3 )
            // InternalDSL.g:2910:2: rule__BindOperator__Group__2__Impl rule__BindOperator__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__BindOperator__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__BindOperator__Group__3();

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
    // $ANTLR end "rule__BindOperator__Group__2"


    // $ANTLR start "rule__BindOperator__Group__2__Impl"
    // InternalDSL.g:2917:1: rule__BindOperator__Group__2__Impl : ( 'role' ) ;
    public final void rule__BindOperator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:2921:1: ( ( 'role' ) )
            // InternalDSL.g:2922:1: ( 'role' )
            {
            // InternalDSL.g:2922:1: ( 'role' )
            // InternalDSL.g:2923:1: 'role'
            {
             before(grammarAccess.getBindOperatorAccess().getRoleKeyword_2()); 
            match(input,25,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getBindOperatorAccess().getRoleKeyword_2()); 

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
    // $ANTLR end "rule__BindOperator__Group__2__Impl"


    // $ANTLR start "rule__BindOperator__Group__3"
    // InternalDSL.g:2936:1: rule__BindOperator__Group__3 : rule__BindOperator__Group__3__Impl rule__BindOperator__Group__4 ;
    public final void rule__BindOperator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:2940:1: ( rule__BindOperator__Group__3__Impl rule__BindOperator__Group__4 )
            // InternalDSL.g:2941:2: rule__BindOperator__Group__3__Impl rule__BindOperator__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_29);
            rule__BindOperator__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__BindOperator__Group__4();

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
    // $ANTLR end "rule__BindOperator__Group__3"


    // $ANTLR start "rule__BindOperator__Group__3__Impl"
    // InternalDSL.g:2948:1: rule__BindOperator__Group__3__Impl : ( ( rule__BindOperator__ToAssignment_3 ) ) ;
    public final void rule__BindOperator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:2952:1: ( ( ( rule__BindOperator__ToAssignment_3 ) ) )
            // InternalDSL.g:2953:1: ( ( rule__BindOperator__ToAssignment_3 ) )
            {
            // InternalDSL.g:2953:1: ( ( rule__BindOperator__ToAssignment_3 ) )
            // InternalDSL.g:2954:1: ( rule__BindOperator__ToAssignment_3 )
            {
             before(grammarAccess.getBindOperatorAccess().getToAssignment_3()); 
            // InternalDSL.g:2955:1: ( rule__BindOperator__ToAssignment_3 )
            // InternalDSL.g:2955:2: rule__BindOperator__ToAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BindOperator__ToAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBindOperatorAccess().getToAssignment_3()); 

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
    // $ANTLR end "rule__BindOperator__Group__3__Impl"


    // $ANTLR start "rule__BindOperator__Group__4"
    // InternalDSL.g:2965:1: rule__BindOperator__Group__4 : rule__BindOperator__Group__4__Impl rule__BindOperator__Group__5 ;
    public final void rule__BindOperator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:2969:1: ( rule__BindOperator__Group__4__Impl rule__BindOperator__Group__5 )
            // InternalDSL.g:2970:2: rule__BindOperator__Group__4__Impl rule__BindOperator__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__BindOperator__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__BindOperator__Group__5();

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
    // $ANTLR end "rule__BindOperator__Group__4"


    // $ANTLR start "rule__BindOperator__Group__4__Impl"
    // InternalDSL.g:2977:1: rule__BindOperator__Group__4__Impl : ( 'to' ) ;
    public final void rule__BindOperator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:2981:1: ( ( 'to' ) )
            // InternalDSL.g:2982:1: ( 'to' )
            {
            // InternalDSL.g:2982:1: ( 'to' )
            // InternalDSL.g:2983:1: 'to'
            {
             before(grammarAccess.getBindOperatorAccess().getToKeyword_4()); 
            match(input,26,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getBindOperatorAccess().getToKeyword_4()); 

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
    // $ANTLR end "rule__BindOperator__Group__4__Impl"


    // $ANTLR start "rule__BindOperator__Group__5"
    // InternalDSL.g:2996:1: rule__BindOperator__Group__5 : rule__BindOperator__Group__5__Impl rule__BindOperator__Group__6 ;
    public final void rule__BindOperator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3000:1: ( rule__BindOperator__Group__5__Impl rule__BindOperator__Group__6 )
            // InternalDSL.g:3001:2: rule__BindOperator__Group__5__Impl rule__BindOperator__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__BindOperator__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__BindOperator__Group__6();

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
    // $ANTLR end "rule__BindOperator__Group__5"


    // $ANTLR start "rule__BindOperator__Group__5__Impl"
    // InternalDSL.g:3008:1: rule__BindOperator__Group__5__Impl : ( ( rule__BindOperator__SlotAssignment_5 ) ) ;
    public final void rule__BindOperator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3012:1: ( ( ( rule__BindOperator__SlotAssignment_5 ) ) )
            // InternalDSL.g:3013:1: ( ( rule__BindOperator__SlotAssignment_5 ) )
            {
            // InternalDSL.g:3013:1: ( ( rule__BindOperator__SlotAssignment_5 ) )
            // InternalDSL.g:3014:1: ( rule__BindOperator__SlotAssignment_5 )
            {
             before(grammarAccess.getBindOperatorAccess().getSlotAssignment_5()); 
            // InternalDSL.g:3015:1: ( rule__BindOperator__SlotAssignment_5 )
            // InternalDSL.g:3015:2: rule__BindOperator__SlotAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BindOperator__SlotAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getBindOperatorAccess().getSlotAssignment_5()); 

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
    // $ANTLR end "rule__BindOperator__Group__5__Impl"


    // $ANTLR start "rule__BindOperator__Group__6"
    // InternalDSL.g:3025:1: rule__BindOperator__Group__6 : rule__BindOperator__Group__6__Impl ;
    public final void rule__BindOperator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3029:1: ( rule__BindOperator__Group__6__Impl )
            // InternalDSL.g:3030:2: rule__BindOperator__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BindOperator__Group__6__Impl();

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
    // $ANTLR end "rule__BindOperator__Group__6"


    // $ANTLR start "rule__BindOperator__Group__6__Impl"
    // InternalDSL.g:3036:1: rule__BindOperator__Group__6__Impl : ( ';' ) ;
    public final void rule__BindOperator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3040:1: ( ( ';' ) )
            // InternalDSL.g:3041:1: ( ';' )
            {
            // InternalDSL.g:3041:1: ( ';' )
            // InternalDSL.g:3042:1: ';'
            {
             before(grammarAccess.getBindOperatorAccess().getSemicolonKeyword_6()); 
            match(input,14,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getBindOperatorAccess().getSemicolonKeyword_6()); 

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
    // $ANTLR end "rule__BindOperator__Group__6__Impl"


    // $ANTLR start "rule__Architecture__Group__0"
    // InternalDSL.g:3069:1: rule__Architecture__Group__0 : rule__Architecture__Group__0__Impl rule__Architecture__Group__1 ;
    public final void rule__Architecture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3073:1: ( rule__Architecture__Group__0__Impl rule__Architecture__Group__1 )
            // InternalDSL.g:3074:2: rule__Architecture__Group__0__Impl rule__Architecture__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__Architecture__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Architecture__Group__1();

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
    // $ANTLR end "rule__Architecture__Group__0"


    // $ANTLR start "rule__Architecture__Group__0__Impl"
    // InternalDSL.g:3081:1: rule__Architecture__Group__0__Impl : ( 'Architecture' ) ;
    public final void rule__Architecture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3085:1: ( ( 'Architecture' ) )
            // InternalDSL.g:3086:1: ( 'Architecture' )
            {
            // InternalDSL.g:3086:1: ( 'Architecture' )
            // InternalDSL.g:3087:1: 'Architecture'
            {
             before(grammarAccess.getArchitectureAccess().getArchitectureKeyword_0()); 
            match(input,27,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getArchitectureAccess().getArchitectureKeyword_0()); 

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
    // $ANTLR end "rule__Architecture__Group__0__Impl"


    // $ANTLR start "rule__Architecture__Group__1"
    // InternalDSL.g:3100:1: rule__Architecture__Group__1 : rule__Architecture__Group__1__Impl rule__Architecture__Group__2 ;
    public final void rule__Architecture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3104:1: ( rule__Architecture__Group__1__Impl rule__Architecture__Group__2 )
            // InternalDSL.g:3105:2: rule__Architecture__Group__1__Impl rule__Architecture__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_30);
            rule__Architecture__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Architecture__Group__2();

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
    // $ANTLR end "rule__Architecture__Group__1"


    // $ANTLR start "rule__Architecture__Group__1__Impl"
    // InternalDSL.g:3112:1: rule__Architecture__Group__1__Impl : ( ( rule__Architecture__NameAssignment_1 ) ) ;
    public final void rule__Architecture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3116:1: ( ( ( rule__Architecture__NameAssignment_1 ) ) )
            // InternalDSL.g:3117:1: ( ( rule__Architecture__NameAssignment_1 ) )
            {
            // InternalDSL.g:3117:1: ( ( rule__Architecture__NameAssignment_1 ) )
            // InternalDSL.g:3118:1: ( rule__Architecture__NameAssignment_1 )
            {
             before(grammarAccess.getArchitectureAccess().getNameAssignment_1()); 
            // InternalDSL.g:3119:1: ( rule__Architecture__NameAssignment_1 )
            // InternalDSL.g:3119:2: rule__Architecture__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Architecture__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getArchitectureAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Architecture__Group__1__Impl"


    // $ANTLR start "rule__Architecture__Group__2"
    // InternalDSL.g:3129:1: rule__Architecture__Group__2 : rule__Architecture__Group__2__Impl rule__Architecture__Group__3 ;
    public final void rule__Architecture__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3133:1: ( rule__Architecture__Group__2__Impl rule__Architecture__Group__3 )
            // InternalDSL.g:3134:2: rule__Architecture__Group__2__Impl rule__Architecture__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__Architecture__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Architecture__Group__3();

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
    // $ANTLR end "rule__Architecture__Group__2"


    // $ANTLR start "rule__Architecture__Group__2__Impl"
    // InternalDSL.g:3141:1: rule__Architecture__Group__2__Impl : ( '::' ) ;
    public final void rule__Architecture__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3145:1: ( ( '::' ) )
            // InternalDSL.g:3146:1: ( '::' )
            {
            // InternalDSL.g:3146:1: ( '::' )
            // InternalDSL.g:3147:1: '::'
            {
             before(grammarAccess.getArchitectureAccess().getColonColonKeyword_2()); 
            match(input,28,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getArchitectureAccess().getColonColonKeyword_2()); 

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
    // $ANTLR end "rule__Architecture__Group__2__Impl"


    // $ANTLR start "rule__Architecture__Group__3"
    // InternalDSL.g:3160:1: rule__Architecture__Group__3 : rule__Architecture__Group__3__Impl rule__Architecture__Group__4 ;
    public final void rule__Architecture__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3164:1: ( rule__Architecture__Group__3__Impl rule__Architecture__Group__4 )
            // InternalDSL.g:3165:2: rule__Architecture__Group__3__Impl rule__Architecture__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Architecture__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Architecture__Group__4();

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
    // $ANTLR end "rule__Architecture__Group__3"


    // $ANTLR start "rule__Architecture__Group__3__Impl"
    // InternalDSL.g:3172:1: rule__Architecture__Group__3__Impl : ( ( rule__Architecture__TypeAssignment_3 ) ) ;
    public final void rule__Architecture__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3176:1: ( ( ( rule__Architecture__TypeAssignment_3 ) ) )
            // InternalDSL.g:3177:1: ( ( rule__Architecture__TypeAssignment_3 ) )
            {
            // InternalDSL.g:3177:1: ( ( rule__Architecture__TypeAssignment_3 ) )
            // InternalDSL.g:3178:1: ( rule__Architecture__TypeAssignment_3 )
            {
             before(grammarAccess.getArchitectureAccess().getTypeAssignment_3()); 
            // InternalDSL.g:3179:1: ( rule__Architecture__TypeAssignment_3 )
            // InternalDSL.g:3179:2: rule__Architecture__TypeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Architecture__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getArchitectureAccess().getTypeAssignment_3()); 

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
    // $ANTLR end "rule__Architecture__Group__3__Impl"


    // $ANTLR start "rule__Architecture__Group__4"
    // InternalDSL.g:3189:1: rule__Architecture__Group__4 : rule__Architecture__Group__4__Impl rule__Architecture__Group__5 ;
    public final void rule__Architecture__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3193:1: ( rule__Architecture__Group__4__Impl rule__Architecture__Group__5 )
            // InternalDSL.g:3194:2: rule__Architecture__Group__4__Impl rule__Architecture__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__Architecture__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Architecture__Group__5();

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
    // $ANTLR end "rule__Architecture__Group__4"


    // $ANTLR start "rule__Architecture__Group__4__Impl"
    // InternalDSL.g:3201:1: rule__Architecture__Group__4__Impl : ( '{' ) ;
    public final void rule__Architecture__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3205:1: ( ( '{' ) )
            // InternalDSL.g:3206:1: ( '{' )
            {
            // InternalDSL.g:3206:1: ( '{' )
            // InternalDSL.g:3207:1: '{'
            {
             before(grammarAccess.getArchitectureAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,12,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getArchitectureAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Architecture__Group__4__Impl"


    // $ANTLR start "rule__Architecture__Group__5"
    // InternalDSL.g:3220:1: rule__Architecture__Group__5 : rule__Architecture__Group__5__Impl rule__Architecture__Group__6 ;
    public final void rule__Architecture__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3224:1: ( rule__Architecture__Group__5__Impl rule__Architecture__Group__6 )
            // InternalDSL.g:3225:2: rule__Architecture__Group__5__Impl rule__Architecture__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__Architecture__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Architecture__Group__6();

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
    // $ANTLR end "rule__Architecture__Group__5"


    // $ANTLR start "rule__Architecture__Group__5__Impl"
    // InternalDSL.g:3232:1: rule__Architecture__Group__5__Impl : ( ( rule__Architecture__TypeBindingsAssignment_5 )* ) ;
    public final void rule__Architecture__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3236:1: ( ( ( rule__Architecture__TypeBindingsAssignment_5 )* ) )
            // InternalDSL.g:3237:1: ( ( rule__Architecture__TypeBindingsAssignment_5 )* )
            {
            // InternalDSL.g:3237:1: ( ( rule__Architecture__TypeBindingsAssignment_5 )* )
            // InternalDSL.g:3238:1: ( rule__Architecture__TypeBindingsAssignment_5 )*
            {
             before(grammarAccess.getArchitectureAccess().getTypeBindingsAssignment_5()); 
            // InternalDSL.g:3239:1: ( rule__Architecture__TypeBindingsAssignment_5 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_STRING && LA18_0<=RULE_ID)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalDSL.g:3239:2: rule__Architecture__TypeBindingsAssignment_5
            	    {
            	    pushFollow(FollowSets000.FOLLOW_21);
            	    rule__Architecture__TypeBindingsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getArchitectureAccess().getTypeBindingsAssignment_5()); 

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
    // $ANTLR end "rule__Architecture__Group__5__Impl"


    // $ANTLR start "rule__Architecture__Group__6"
    // InternalDSL.g:3249:1: rule__Architecture__Group__6 : rule__Architecture__Group__6__Impl rule__Architecture__Group__7 ;
    public final void rule__Architecture__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3253:1: ( rule__Architecture__Group__6__Impl rule__Architecture__Group__7 )
            // InternalDSL.g:3254:2: rule__Architecture__Group__6__Impl rule__Architecture__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Architecture__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Architecture__Group__7();

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
    // $ANTLR end "rule__Architecture__Group__6"


    // $ANTLR start "rule__Architecture__Group__6__Impl"
    // InternalDSL.g:3261:1: rule__Architecture__Group__6__Impl : ( '}' ) ;
    public final void rule__Architecture__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3265:1: ( ( '}' ) )
            // InternalDSL.g:3266:1: ( '}' )
            {
            // InternalDSL.g:3266:1: ( '}' )
            // InternalDSL.g:3267:1: '}'
            {
             before(grammarAccess.getArchitectureAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getArchitectureAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Architecture__Group__6__Impl"


    // $ANTLR start "rule__Architecture__Group__7"
    // InternalDSL.g:3280:1: rule__Architecture__Group__7 : rule__Architecture__Group__7__Impl rule__Architecture__Group__8 ;
    public final void rule__Architecture__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3284:1: ( rule__Architecture__Group__7__Impl rule__Architecture__Group__8 )
            // InternalDSL.g:3285:2: rule__Architecture__Group__7__Impl rule__Architecture__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_31);
            rule__Architecture__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Architecture__Group__8();

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
    // $ANTLR end "rule__Architecture__Group__7"


    // $ANTLR start "rule__Architecture__Group__7__Impl"
    // InternalDSL.g:3292:1: rule__Architecture__Group__7__Impl : ( '{' ) ;
    public final void rule__Architecture__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3296:1: ( ( '{' ) )
            // InternalDSL.g:3297:1: ( '{' )
            {
            // InternalDSL.g:3297:1: ( '{' )
            // InternalDSL.g:3298:1: '{'
            {
             before(grammarAccess.getArchitectureAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,12,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getArchitectureAccess().getLeftCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Architecture__Group__7__Impl"


    // $ANTLR start "rule__Architecture__Group__8"
    // InternalDSL.g:3311:1: rule__Architecture__Group__8 : rule__Architecture__Group__8__Impl rule__Architecture__Group__9 ;
    public final void rule__Architecture__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3315:1: ( rule__Architecture__Group__8__Impl rule__Architecture__Group__9 )
            // InternalDSL.g:3316:2: rule__Architecture__Group__8__Impl rule__Architecture__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_31);
            rule__Architecture__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Architecture__Group__9();

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
    // $ANTLR end "rule__Architecture__Group__8"


    // $ANTLR start "rule__Architecture__Group__8__Impl"
    // InternalDSL.g:3323:1: rule__Architecture__Group__8__Impl : ( ( rule__Architecture__ElementsAssignment_8 )* ) ;
    public final void rule__Architecture__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3327:1: ( ( ( rule__Architecture__ElementsAssignment_8 )* ) )
            // InternalDSL.g:3328:1: ( ( rule__Architecture__ElementsAssignment_8 )* )
            {
            // InternalDSL.g:3328:1: ( ( rule__Architecture__ElementsAssignment_8 )* )
            // InternalDSL.g:3329:1: ( rule__Architecture__ElementsAssignment_8 )*
            {
             before(grammarAccess.getArchitectureAccess().getElementsAssignment_8()); 
            // InternalDSL.g:3330:1: ( rule__Architecture__ElementsAssignment_8 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=29 && LA19_0<=30)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalDSL.g:3330:2: rule__Architecture__ElementsAssignment_8
            	    {
            	    pushFollow(FollowSets000.FOLLOW_32);
            	    rule__Architecture__ElementsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getArchitectureAccess().getElementsAssignment_8()); 

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
    // $ANTLR end "rule__Architecture__Group__8__Impl"


    // $ANTLR start "rule__Architecture__Group__9"
    // InternalDSL.g:3340:1: rule__Architecture__Group__9 : rule__Architecture__Group__9__Impl ;
    public final void rule__Architecture__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3344:1: ( rule__Architecture__Group__9__Impl )
            // InternalDSL.g:3345:2: rule__Architecture__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Architecture__Group__9__Impl();

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
    // $ANTLR end "rule__Architecture__Group__9"


    // $ANTLR start "rule__Architecture__Group__9__Impl"
    // InternalDSL.g:3351:1: rule__Architecture__Group__9__Impl : ( '}' ) ;
    public final void rule__Architecture__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3355:1: ( ( '}' ) )
            // InternalDSL.g:3356:1: ( '}' )
            {
            // InternalDSL.g:3356:1: ( '}' )
            // InternalDSL.g:3357:1: '}'
            {
             before(grammarAccess.getArchitectureAccess().getRightCurlyBracketKeyword_9()); 
            match(input,13,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getArchitectureAccess().getRightCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__Architecture__Group__9__Impl"


    // $ANTLR start "rule__Component__Group__0"
    // InternalDSL.g:3390:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3394:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalDSL.g:3395:2: rule__Component__Group__0__Impl rule__Component__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__Component__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Component__Group__1();

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
    // $ANTLR end "rule__Component__Group__0"


    // $ANTLR start "rule__Component__Group__0__Impl"
    // InternalDSL.g:3402:1: rule__Component__Group__0__Impl : ( 'Component' ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3406:1: ( ( 'Component' ) )
            // InternalDSL.g:3407:1: ( 'Component' )
            {
            // InternalDSL.g:3407:1: ( 'Component' )
            // InternalDSL.g:3408:1: 'Component'
            {
             before(grammarAccess.getComponentAccess().getComponentKeyword_0()); 
            match(input,29,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getComponentKeyword_0()); 

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
    // $ANTLR end "rule__Component__Group__0__Impl"


    // $ANTLR start "rule__Component__Group__1"
    // InternalDSL.g:3421:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3425:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // InternalDSL.g:3426:2: rule__Component__Group__1__Impl rule__Component__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_30);
            rule__Component__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Component__Group__2();

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
    // $ANTLR end "rule__Component__Group__1"


    // $ANTLR start "rule__Component__Group__1__Impl"
    // InternalDSL.g:3433:1: rule__Component__Group__1__Impl : ( ( rule__Component__NameAssignment_1 ) ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3437:1: ( ( ( rule__Component__NameAssignment_1 ) ) )
            // InternalDSL.g:3438:1: ( ( rule__Component__NameAssignment_1 ) )
            {
            // InternalDSL.g:3438:1: ( ( rule__Component__NameAssignment_1 ) )
            // InternalDSL.g:3439:1: ( rule__Component__NameAssignment_1 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_1()); 
            // InternalDSL.g:3440:1: ( rule__Component__NameAssignment_1 )
            // InternalDSL.g:3440:2: rule__Component__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Component__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Component__Group__1__Impl"


    // $ANTLR start "rule__Component__Group__2"
    // InternalDSL.g:3450:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3454:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // InternalDSL.g:3455:2: rule__Component__Group__2__Impl rule__Component__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__Component__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Component__Group__3();

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
    // $ANTLR end "rule__Component__Group__2"


    // $ANTLR start "rule__Component__Group__2__Impl"
    // InternalDSL.g:3462:1: rule__Component__Group__2__Impl : ( '::' ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3466:1: ( ( '::' ) )
            // InternalDSL.g:3467:1: ( '::' )
            {
            // InternalDSL.g:3467:1: ( '::' )
            // InternalDSL.g:3468:1: '::'
            {
             before(grammarAccess.getComponentAccess().getColonColonKeyword_2()); 
            match(input,28,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getColonColonKeyword_2()); 

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
    // $ANTLR end "rule__Component__Group__2__Impl"


    // $ANTLR start "rule__Component__Group__3"
    // InternalDSL.g:3481:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3485:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // InternalDSL.g:3486:2: rule__Component__Group__3__Impl rule__Component__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__Component__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Component__Group__4();

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
    // $ANTLR end "rule__Component__Group__3"


    // $ANTLR start "rule__Component__Group__3__Impl"
    // InternalDSL.g:3493:1: rule__Component__Group__3__Impl : ( ( rule__Component__TypeAssignment_3 ) ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3497:1: ( ( ( rule__Component__TypeAssignment_3 ) ) )
            // InternalDSL.g:3498:1: ( ( rule__Component__TypeAssignment_3 ) )
            {
            // InternalDSL.g:3498:1: ( ( rule__Component__TypeAssignment_3 ) )
            // InternalDSL.g:3499:1: ( rule__Component__TypeAssignment_3 )
            {
             before(grammarAccess.getComponentAccess().getTypeAssignment_3()); 
            // InternalDSL.g:3500:1: ( rule__Component__TypeAssignment_3 )
            // InternalDSL.g:3500:2: rule__Component__TypeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Component__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getTypeAssignment_3()); 

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
    // $ANTLR end "rule__Component__Group__3__Impl"


    // $ANTLR start "rule__Component__Group__4"
    // InternalDSL.g:3510:1: rule__Component__Group__4 : rule__Component__Group__4__Impl ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3514:1: ( rule__Component__Group__4__Impl )
            // InternalDSL.g:3515:2: rule__Component__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Component__Group__4__Impl();

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
    // $ANTLR end "rule__Component__Group__4"


    // $ANTLR start "rule__Component__Group__4__Impl"
    // InternalDSL.g:3521:1: rule__Component__Group__4__Impl : ( ';' ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3525:1: ( ( ';' ) )
            // InternalDSL.g:3526:1: ( ';' )
            {
            // InternalDSL.g:3526:1: ( ';' )
            // InternalDSL.g:3527:1: ';'
            {
             before(grammarAccess.getComponentAccess().getSemicolonKeyword_4()); 
            match(input,14,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getSemicolonKeyword_4()); 

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
    // $ANTLR end "rule__Component__Group__4__Impl"


    // $ANTLR start "rule__Port__Group__0"
    // InternalDSL.g:3550:1: rule__Port__Group__0 : rule__Port__Group__0__Impl rule__Port__Group__1 ;
    public final void rule__Port__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3554:1: ( rule__Port__Group__0__Impl rule__Port__Group__1 )
            // InternalDSL.g:3555:2: rule__Port__Group__0__Impl rule__Port__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__Port__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Port__Group__1();

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
    // $ANTLR end "rule__Port__Group__0"


    // $ANTLR start "rule__Port__Group__0__Impl"
    // InternalDSL.g:3562:1: rule__Port__Group__0__Impl : ( 'Port' ) ;
    public final void rule__Port__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3566:1: ( ( 'Port' ) )
            // InternalDSL.g:3567:1: ( 'Port' )
            {
            // InternalDSL.g:3567:1: ( 'Port' )
            // InternalDSL.g:3568:1: 'Port'
            {
             before(grammarAccess.getPortAccess().getPortKeyword_0()); 
            match(input,30,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPortAccess().getPortKeyword_0()); 

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
    // $ANTLR end "rule__Port__Group__0__Impl"


    // $ANTLR start "rule__Port__Group__1"
    // InternalDSL.g:3581:1: rule__Port__Group__1 : rule__Port__Group__1__Impl rule__Port__Group__2 ;
    public final void rule__Port__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3585:1: ( rule__Port__Group__1__Impl rule__Port__Group__2 )
            // InternalDSL.g:3586:2: rule__Port__Group__1__Impl rule__Port__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_30);
            rule__Port__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Port__Group__2();

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
    // $ANTLR end "rule__Port__Group__1"


    // $ANTLR start "rule__Port__Group__1__Impl"
    // InternalDSL.g:3593:1: rule__Port__Group__1__Impl : ( ( rule__Port__NameAssignment_1 ) ) ;
    public final void rule__Port__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3597:1: ( ( ( rule__Port__NameAssignment_1 ) ) )
            // InternalDSL.g:3598:1: ( ( rule__Port__NameAssignment_1 ) )
            {
            // InternalDSL.g:3598:1: ( ( rule__Port__NameAssignment_1 ) )
            // InternalDSL.g:3599:1: ( rule__Port__NameAssignment_1 )
            {
             before(grammarAccess.getPortAccess().getNameAssignment_1()); 
            // InternalDSL.g:3600:1: ( rule__Port__NameAssignment_1 )
            // InternalDSL.g:3600:2: rule__Port__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Port__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Port__Group__1__Impl"


    // $ANTLR start "rule__Port__Group__2"
    // InternalDSL.g:3610:1: rule__Port__Group__2 : rule__Port__Group__2__Impl rule__Port__Group__3 ;
    public final void rule__Port__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3614:1: ( rule__Port__Group__2__Impl rule__Port__Group__3 )
            // InternalDSL.g:3615:2: rule__Port__Group__2__Impl rule__Port__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__Port__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Port__Group__3();

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
    // $ANTLR end "rule__Port__Group__2"


    // $ANTLR start "rule__Port__Group__2__Impl"
    // InternalDSL.g:3622:1: rule__Port__Group__2__Impl : ( '::' ) ;
    public final void rule__Port__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3626:1: ( ( '::' ) )
            // InternalDSL.g:3627:1: ( '::' )
            {
            // InternalDSL.g:3627:1: ( '::' )
            // InternalDSL.g:3628:1: '::'
            {
             before(grammarAccess.getPortAccess().getColonColonKeyword_2()); 
            match(input,28,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPortAccess().getColonColonKeyword_2()); 

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
    // $ANTLR end "rule__Port__Group__2__Impl"


    // $ANTLR start "rule__Port__Group__3"
    // InternalDSL.g:3641:1: rule__Port__Group__3 : rule__Port__Group__3__Impl rule__Port__Group__4 ;
    public final void rule__Port__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3645:1: ( rule__Port__Group__3__Impl rule__Port__Group__4 )
            // InternalDSL.g:3646:2: rule__Port__Group__3__Impl rule__Port__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__Port__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Port__Group__4();

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
    // $ANTLR end "rule__Port__Group__3"


    // $ANTLR start "rule__Port__Group__3__Impl"
    // InternalDSL.g:3653:1: rule__Port__Group__3__Impl : ( ( rule__Port__TypeAssignment_3 ) ) ;
    public final void rule__Port__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3657:1: ( ( ( rule__Port__TypeAssignment_3 ) ) )
            // InternalDSL.g:3658:1: ( ( rule__Port__TypeAssignment_3 ) )
            {
            // InternalDSL.g:3658:1: ( ( rule__Port__TypeAssignment_3 ) )
            // InternalDSL.g:3659:1: ( rule__Port__TypeAssignment_3 )
            {
             before(grammarAccess.getPortAccess().getTypeAssignment_3()); 
            // InternalDSL.g:3660:1: ( rule__Port__TypeAssignment_3 )
            // InternalDSL.g:3660:2: rule__Port__TypeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Port__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getTypeAssignment_3()); 

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
    // $ANTLR end "rule__Port__Group__3__Impl"


    // $ANTLR start "rule__Port__Group__4"
    // InternalDSL.g:3670:1: rule__Port__Group__4 : rule__Port__Group__4__Impl ;
    public final void rule__Port__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3674:1: ( rule__Port__Group__4__Impl )
            // InternalDSL.g:3675:2: rule__Port__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Port__Group__4__Impl();

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
    // $ANTLR end "rule__Port__Group__4"


    // $ANTLR start "rule__Port__Group__4__Impl"
    // InternalDSL.g:3681:1: rule__Port__Group__4__Impl : ( ';' ) ;
    public final void rule__Port__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3685:1: ( ( ';' ) )
            // InternalDSL.g:3686:1: ( ';' )
            {
            // InternalDSL.g:3686:1: ( ';' )
            // InternalDSL.g:3687:1: ';'
            {
             before(grammarAccess.getPortAccess().getSemicolonKeyword_4()); 
            match(input,14,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPortAccess().getSemicolonKeyword_4()); 

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
    // $ANTLR end "rule__Port__Group__4__Impl"


    // $ANTLR start "rule__TypeBinding__Group__0"
    // InternalDSL.g:3710:1: rule__TypeBinding__Group__0 : rule__TypeBinding__Group__0__Impl rule__TypeBinding__Group__1 ;
    public final void rule__TypeBinding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3714:1: ( rule__TypeBinding__Group__0__Impl rule__TypeBinding__Group__1 )
            // InternalDSL.g:3715:2: rule__TypeBinding__Group__0__Impl rule__TypeBinding__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_33);
            rule__TypeBinding__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypeBinding__Group__1();

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
    // $ANTLR end "rule__TypeBinding__Group__0"


    // $ANTLR start "rule__TypeBinding__Group__0__Impl"
    // InternalDSL.g:3722:1: rule__TypeBinding__Group__0__Impl : ( ( rule__TypeBinding__TypeAssignment_0 ) ) ;
    public final void rule__TypeBinding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3726:1: ( ( ( rule__TypeBinding__TypeAssignment_0 ) ) )
            // InternalDSL.g:3727:1: ( ( rule__TypeBinding__TypeAssignment_0 ) )
            {
            // InternalDSL.g:3727:1: ( ( rule__TypeBinding__TypeAssignment_0 ) )
            // InternalDSL.g:3728:1: ( rule__TypeBinding__TypeAssignment_0 )
            {
             before(grammarAccess.getTypeBindingAccess().getTypeAssignment_0()); 
            // InternalDSL.g:3729:1: ( rule__TypeBinding__TypeAssignment_0 )
            // InternalDSL.g:3729:2: rule__TypeBinding__TypeAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypeBinding__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeBindingAccess().getTypeAssignment_0()); 

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
    // $ANTLR end "rule__TypeBinding__Group__0__Impl"


    // $ANTLR start "rule__TypeBinding__Group__1"
    // InternalDSL.g:3739:1: rule__TypeBinding__Group__1 : rule__TypeBinding__Group__1__Impl rule__TypeBinding__Group__2 ;
    public final void rule__TypeBinding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3743:1: ( rule__TypeBinding__Group__1__Impl rule__TypeBinding__Group__2 )
            // InternalDSL.g:3744:2: rule__TypeBinding__Group__1__Impl rule__TypeBinding__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__TypeBinding__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypeBinding__Group__2();

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
    // $ANTLR end "rule__TypeBinding__Group__1"


    // $ANTLR start "rule__TypeBinding__Group__1__Impl"
    // InternalDSL.g:3751:1: rule__TypeBinding__Group__1__Impl : ( '=' ) ;
    public final void rule__TypeBinding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3755:1: ( ( '=' ) )
            // InternalDSL.g:3756:1: ( '=' )
            {
            // InternalDSL.g:3756:1: ( '=' )
            // InternalDSL.g:3757:1: '='
            {
             before(grammarAccess.getTypeBindingAccess().getEqualsSignKeyword_1()); 
            match(input,31,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getTypeBindingAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__TypeBinding__Group__1__Impl"


    // $ANTLR start "rule__TypeBinding__Group__2"
    // InternalDSL.g:3770:1: rule__TypeBinding__Group__2 : rule__TypeBinding__Group__2__Impl rule__TypeBinding__Group__3 ;
    public final void rule__TypeBinding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3774:1: ( rule__TypeBinding__Group__2__Impl rule__TypeBinding__Group__3 )
            // InternalDSL.g:3775:2: rule__TypeBinding__Group__2__Impl rule__TypeBinding__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__TypeBinding__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypeBinding__Group__3();

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
    // $ANTLR end "rule__TypeBinding__Group__2"


    // $ANTLR start "rule__TypeBinding__Group__2__Impl"
    // InternalDSL.g:3782:1: rule__TypeBinding__Group__2__Impl : ( ( rule__TypeBinding__ImplementationAssignment_2 ) ) ;
    public final void rule__TypeBinding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3786:1: ( ( ( rule__TypeBinding__ImplementationAssignment_2 ) ) )
            // InternalDSL.g:3787:1: ( ( rule__TypeBinding__ImplementationAssignment_2 ) )
            {
            // InternalDSL.g:3787:1: ( ( rule__TypeBinding__ImplementationAssignment_2 ) )
            // InternalDSL.g:3788:1: ( rule__TypeBinding__ImplementationAssignment_2 )
            {
             before(grammarAccess.getTypeBindingAccess().getImplementationAssignment_2()); 
            // InternalDSL.g:3789:1: ( rule__TypeBinding__ImplementationAssignment_2 )
            // InternalDSL.g:3789:2: rule__TypeBinding__ImplementationAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypeBinding__ImplementationAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTypeBindingAccess().getImplementationAssignment_2()); 

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
    // $ANTLR end "rule__TypeBinding__Group__2__Impl"


    // $ANTLR start "rule__TypeBinding__Group__3"
    // InternalDSL.g:3799:1: rule__TypeBinding__Group__3 : rule__TypeBinding__Group__3__Impl ;
    public final void rule__TypeBinding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3803:1: ( rule__TypeBinding__Group__3__Impl )
            // InternalDSL.g:3804:2: rule__TypeBinding__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypeBinding__Group__3__Impl();

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
    // $ANTLR end "rule__TypeBinding__Group__3"


    // $ANTLR start "rule__TypeBinding__Group__3__Impl"
    // InternalDSL.g:3810:1: rule__TypeBinding__Group__3__Impl : ( ';' ) ;
    public final void rule__TypeBinding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3814:1: ( ( ';' ) )
            // InternalDSL.g:3815:1: ( ';' )
            {
            // InternalDSL.g:3815:1: ( ';' )
            // InternalDSL.g:3816:1: ';'
            {
             before(grammarAccess.getTypeBindingAccess().getSemicolonKeyword_3()); 
            match(input,14,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getTypeBindingAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__TypeBinding__Group__3__Impl"


    // $ANTLR start "rule__SmagsModel__ImportsAssignment_1_2"
    // InternalDSL.g:3838:1: rule__SmagsModel__ImportsAssignment_1_2 : ( ruleImport ) ;
    public final void rule__SmagsModel__ImportsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3842:1: ( ( ruleImport ) )
            // InternalDSL.g:3843:1: ( ruleImport )
            {
            // InternalDSL.g:3843:1: ( ruleImport )
            // InternalDSL.g:3844:1: ruleImport
            {
             before(grammarAccess.getSmagsModelAccess().getImportsImportParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getSmagsModelAccess().getImportsImportParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__SmagsModel__ImportsAssignment_1_2"


    // $ANTLR start "rule__SmagsModel__ElementsAssignment_2"
    // InternalDSL.g:3853:1: rule__SmagsModel__ElementsAssignment_2 : ( ruleSmagsElement ) ;
    public final void rule__SmagsModel__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3857:1: ( ( ruleSmagsElement ) )
            // InternalDSL.g:3858:1: ( ruleSmagsElement )
            {
            // InternalDSL.g:3858:1: ( ruleSmagsElement )
            // InternalDSL.g:3859:1: ruleSmagsElement
            {
             before(grammarAccess.getSmagsModelAccess().getElementsSmagsElementParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleSmagsElement();

            state._fsp--;

             after(grammarAccess.getSmagsModelAccess().getElementsSmagsElementParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__SmagsModel__ElementsAssignment_2"


    // $ANTLR start "rule__Import__ImportURIAssignment_0"
    // InternalDSL.g:3868:1: rule__Import__ImportURIAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3872:1: ( ( RULE_STRING ) )
            // InternalDSL.g:3873:1: ( RULE_STRING )
            {
            // InternalDSL.g:3873:1: ( RULE_STRING )
            // InternalDSL.g:3874:1: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Import__ImportURIAssignment_0"


    // $ANTLR start "rule__MetaArchitecture__NameAssignment_1"
    // InternalDSL.g:3883:1: rule__MetaArchitecture__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__MetaArchitecture__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3887:1: ( ( ruleEString ) )
            // InternalDSL.g:3888:1: ( ruleEString )
            {
            // InternalDSL.g:3888:1: ( ruleEString )
            // InternalDSL.g:3889:1: ruleEString
            {
             before(grammarAccess.getMetaArchitectureAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMetaArchitectureAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__MetaArchitecture__NameAssignment_1"


    // $ANTLR start "rule__MetaArchitecture__TypesAssignment_3"
    // InternalDSL.g:3898:1: rule__MetaArchitecture__TypesAssignment_3 : ( ruleType ) ;
    public final void rule__MetaArchitecture__TypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3902:1: ( ( ruleType ) )
            // InternalDSL.g:3903:1: ( ruleType )
            {
            // InternalDSL.g:3903:1: ( ruleType )
            // InternalDSL.g:3904:1: ruleType
            {
             before(grammarAccess.getMetaArchitectureAccess().getTypesTypeParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getMetaArchitectureAccess().getTypesTypeParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__MetaArchitecture__TypesAssignment_3"


    // $ANTLR start "rule__MetaArchitecture__ElementsAssignment_6"
    // InternalDSL.g:3913:1: rule__MetaArchitecture__ElementsAssignment_6 : ( ruleMetaArchitectureElement ) ;
    public final void rule__MetaArchitecture__ElementsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3917:1: ( ( ruleMetaArchitectureElement ) )
            // InternalDSL.g:3918:1: ( ruleMetaArchitectureElement )
            {
            // InternalDSL.g:3918:1: ( ruleMetaArchitectureElement )
            // InternalDSL.g:3919:1: ruleMetaArchitectureElement
            {
             before(grammarAccess.getMetaArchitectureAccess().getElementsMetaArchitectureElementParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMetaArchitectureElement();

            state._fsp--;

             after(grammarAccess.getMetaArchitectureAccess().getElementsMetaArchitectureElementParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__MetaArchitecture__ElementsAssignment_6"


    // $ANTLR start "rule__ExternalType__NameAssignment_1"
    // InternalDSL.g:3928:1: rule__ExternalType__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__ExternalType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3932:1: ( ( ruleEString ) )
            // InternalDSL.g:3933:1: ( ruleEString )
            {
            // InternalDSL.g:3933:1: ( ruleEString )
            // InternalDSL.g:3934:1: ruleEString
            {
             before(grammarAccess.getExternalTypeAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExternalTypeAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ExternalType__NameAssignment_1"


    // $ANTLR start "rule__PrimitiveType__NameAssignment_1"
    // InternalDSL.g:3943:1: rule__PrimitiveType__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__PrimitiveType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3947:1: ( ( ruleEString ) )
            // InternalDSL.g:3948:1: ( ruleEString )
            {
            // InternalDSL.g:3948:1: ( ruleEString )
            // InternalDSL.g:3949:1: ruleEString
            {
             before(grammarAccess.getPrimitiveTypeAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypeAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__PrimitiveType__NameAssignment_1"


    // $ANTLR start "rule__Variable__TypeAssignment_0"
    // InternalDSL.g:3958:1: rule__Variable__TypeAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__Variable__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3962:1: ( ( ( ruleEString ) ) )
            // InternalDSL.g:3963:1: ( ( ruleEString ) )
            {
            // InternalDSL.g:3963:1: ( ( ruleEString ) )
            // InternalDSL.g:3964:1: ( ruleEString )
            {
             before(grammarAccess.getVariableAccess().getTypeTypeCrossReference_0_0()); 
            // InternalDSL.g:3965:1: ( ruleEString )
            // InternalDSL.g:3966:1: ruleEString
            {
             before(grammarAccess.getVariableAccess().getTypeTypeEStringParserRuleCall_0_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getTypeTypeEStringParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getVariableAccess().getTypeTypeCrossReference_0_0()); 

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
    // $ANTLR end "rule__Variable__TypeAssignment_0"


    // $ANTLR start "rule__Variable__NameAssignment_1"
    // InternalDSL.g:3977:1: rule__Variable__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Variable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3981:1: ( ( ruleEString ) )
            // InternalDSL.g:3982:1: ( ruleEString )
            {
            // InternalDSL.g:3982:1: ( ruleEString )
            // InternalDSL.g:3983:1: ruleEString
            {
             before(grammarAccess.getVariableAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Variable__NameAssignment_1"


    // $ANTLR start "rule__AnonymousVariable__TypeAssignment"
    // InternalDSL.g:3992:1: rule__AnonymousVariable__TypeAssignment : ( ( ruleEString ) ) ;
    public final void rule__AnonymousVariable__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:3996:1: ( ( ( ruleEString ) ) )
            // InternalDSL.g:3997:1: ( ( ruleEString ) )
            {
            // InternalDSL.g:3997:1: ( ( ruleEString ) )
            // InternalDSL.g:3998:1: ( ruleEString )
            {
             before(grammarAccess.getAnonymousVariableAccess().getTypeTypeCrossReference_0()); 
            // InternalDSL.g:3999:1: ( ruleEString )
            // InternalDSL.g:4000:1: ruleEString
            {
             before(grammarAccess.getAnonymousVariableAccess().getTypeTypeEStringParserRuleCall_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAnonymousVariableAccess().getTypeTypeEStringParserRuleCall_0_1()); 

            }

             after(grammarAccess.getAnonymousVariableAccess().getTypeTypeCrossReference_0()); 

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
    // $ANTLR end "rule__AnonymousVariable__TypeAssignment"


    // $ANTLR start "rule__Method__ReturnTypeAssignment_0"
    // InternalDSL.g:4011:1: rule__Method__ReturnTypeAssignment_0 : ( ruleAnonymousVariable ) ;
    public final void rule__Method__ReturnTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:4015:1: ( ( ruleAnonymousVariable ) )
            // InternalDSL.g:4016:1: ( ruleAnonymousVariable )
            {
            // InternalDSL.g:4016:1: ( ruleAnonymousVariable )
            // InternalDSL.g:4017:1: ruleAnonymousVariable
            {
             before(grammarAccess.getMethodAccess().getReturnTypeAnonymousVariableParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAnonymousVariable();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getReturnTypeAnonymousVariableParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Method__ReturnTypeAssignment_0"


    // $ANTLR start "rule__Method__NameAssignment_1"
    // InternalDSL.g:4026:1: rule__Method__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Method__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:4030:1: ( ( ruleEString ) )
            // InternalDSL.g:4031:1: ( ruleEString )
            {
            // InternalDSL.g:4031:1: ( ruleEString )
            // InternalDSL.g:4032:1: ruleEString
            {
             before(grammarAccess.getMethodAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Method__NameAssignment_1"


    // $ANTLR start "rule__Method__ArgsAssignment_3_0"
    // InternalDSL.g:4041:1: rule__Method__ArgsAssignment_3_0 : ( ruleVariable ) ;
    public final void rule__Method__ArgsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:4045:1: ( ( ruleVariable ) )
            // InternalDSL.g:4046:1: ( ruleVariable )
            {
            // InternalDSL.g:4046:1: ( ruleVariable )
            // InternalDSL.g:4047:1: ruleVariable
            {
             before(grammarAccess.getMethodAccess().getArgsVariableParserRuleCall_3_0_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getArgsVariableParserRuleCall_3_0_0()); 

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
    // $ANTLR end "rule__Method__ArgsAssignment_3_0"


    // $ANTLR start "rule__Method__ArgsAssignment_3_1_1"
    // InternalDSL.g:4056:1: rule__Method__ArgsAssignment_3_1_1 : ( ruleVariable ) ;
    public final void rule__Method__ArgsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:4060:1: ( ( ruleVariable ) )
            // InternalDSL.g:4061:1: ( ruleVariable )
            {
            // InternalDSL.g:4061:1: ( ruleVariable )
            // InternalDSL.g:4062:1: ruleVariable
            {
             before(grammarAccess.getMethodAccess().getArgsVariableParserRuleCall_3_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getArgsVariableParserRuleCall_3_1_1_0()); 

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
    // $ANTLR end "rule__Method__ArgsAssignment_3_1_1"


    // $ANTLR start "rule__ComponentType__NameAssignment_2"
    // InternalDSL.g:4071:1: rule__ComponentType__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ComponentType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:4075:1: ( ( ruleEString ) )
            // InternalDSL.g:4076:1: ( ruleEString )
            {
            // InternalDSL.g:4076:1: ( ruleEString )
            // InternalDSL.g:4077:1: ruleEString
            {
             before(grammarAccess.getComponentTypeAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponentTypeAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ComponentType__NameAssignment_2"


    // $ANTLR start "rule__PortType__NameAssignment_2"
    // InternalDSL.g:4086:1: rule__PortType__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__PortType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:4090:1: ( ( ruleEString ) )
            // InternalDSL.g:4091:1: ( ruleEString )
            {
            // InternalDSL.g:4091:1: ( ruleEString )
            // InternalDSL.g:4092:1: ruleEString
            {
             before(grammarAccess.getPortTypeAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPortTypeAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__PortType__NameAssignment_2"


    // $ANTLR start "rule__PortType__ElementsAssignment_4"
    // InternalDSL.g:4101:1: rule__PortType__ElementsAssignment_4 : ( rulePortTypeElement ) ;
    public final void rule__PortType__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:4105:1: ( ( rulePortTypeElement ) )
            // InternalDSL.g:4106:1: ( rulePortTypeElement )
            {
            // InternalDSL.g:4106:1: ( rulePortTypeElement )
            // InternalDSL.g:4107:1: rulePortTypeElement
            {
             before(grammarAccess.getPortTypeAccess().getElementsPortTypeElementParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            rulePortTypeElement();

            state._fsp--;

             after(grammarAccess.getPortTypeAccess().getElementsPortTypeElementParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__PortType__ElementsAssignment_4"


    // $ANTLR start "rule__RoleModel__NameAssignment_2"
    // InternalDSL.g:4116:1: rule__RoleModel__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RoleModel__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:4120:1: ( ( ruleEString ) )
            // InternalDSL.g:4121:1: ( ruleEString )
            {
            // InternalDSL.g:4121:1: ( ruleEString )
            // InternalDSL.g:4122:1: ruleEString
            {
             before(grammarAccess.getRoleModelAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRoleModelAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__RoleModel__NameAssignment_2"


    // $ANTLR start "rule__RoleModel__SlotsAssignment_3_1"
    // InternalDSL.g:4131:1: rule__RoleModel__SlotsAssignment_3_1 : ( ruleRoleModelSlot ) ;
    public final void rule__RoleModel__SlotsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:4135:1: ( ( ruleRoleModelSlot ) )
            // InternalDSL.g:4136:1: ( ruleRoleModelSlot )
            {
            // InternalDSL.g:4136:1: ( ruleRoleModelSlot )
            // InternalDSL.g:4137:1: ruleRoleModelSlot
            {
             before(grammarAccess.getRoleModelAccess().getSlotsRoleModelSlotParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleRoleModelSlot();

            state._fsp--;

             after(grammarAccess.getRoleModelAccess().getSlotsRoleModelSlotParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__RoleModel__SlotsAssignment_3_1"


    // $ANTLR start "rule__RoleModel__SlotsAssignment_3_2_1"
    // InternalDSL.g:4146:1: rule__RoleModel__SlotsAssignment_3_2_1 : ( ruleRoleModelSlot ) ;
    public final void rule__RoleModel__SlotsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:4150:1: ( ( ruleRoleModelSlot ) )
            // InternalDSL.g:4151:1: ( ruleRoleModelSlot )
            {
            // InternalDSL.g:4151:1: ( ruleRoleModelSlot )
            // InternalDSL.g:4152:1: ruleRoleModelSlot
            {
             before(grammarAccess.getRoleModelAccess().getSlotsRoleModelSlotParserRuleCall_3_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleRoleModelSlot();

            state._fsp--;

             after(grammarAccess.getRoleModelAccess().getSlotsRoleModelSlotParserRuleCall_3_2_1_0()); 

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
    // $ANTLR end "rule__RoleModel__SlotsAssignment_3_2_1"


    // $ANTLR start "rule__RoleModel__InitializationAssignment_5"
    // InternalDSL.g:4161:1: rule__RoleModel__InitializationAssignment_5 : ( ruleCompositionOperator ) ;
    public final void rule__RoleModel__InitializationAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:4165:1: ( ( ruleCompositionOperator ) )
            // InternalDSL.g:4166:1: ( ruleCompositionOperator )
            {
            // InternalDSL.g:4166:1: ( ruleCompositionOperator )
            // InternalDSL.g:4167:1: ruleCompositionOperator
            {
             before(grammarAccess.getRoleModelAccess().getInitializationCompositionOperatorParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleCompositionOperator();

            state._fsp--;

             after(grammarAccess.getRoleModelAccess().getInitializationCompositionOperatorParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__RoleModel__InitializationAssignment_5"


    // $ANTLR start "rule__RoleModelSlot__TypeAssignment_1"
    // InternalDSL.g:4176:1: rule__RoleModelSlot__TypeAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__RoleModelSlot__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:4180:1: ( ( ( ruleEString ) ) )
            // InternalDSL.g:4181:1: ( ( ruleEString ) )
            {
            // InternalDSL.g:4181:1: ( ( ruleEString ) )
            // InternalDSL.g:4182:1: ( ruleEString )
            {
             before(grammarAccess.getRoleModelSlotAccess().getTypeComponentTypeCrossReference_1_0()); 
            // InternalDSL.g:4183:1: ( ruleEString )
            // InternalDSL.g:4184:1: ruleEString
            {
             before(grammarAccess.getRoleModelSlotAccess().getTypeComponentTypeEStringParserRuleCall_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRoleModelSlotAccess().getTypeComponentTypeEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRoleModelSlotAccess().getTypeComponentTypeCrossReference_1_0()); 

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
    // $ANTLR end "rule__RoleModelSlot__TypeAssignment_1"


    // $ANTLR start "rule__RoleModelSlot__NameAssignment_2"
    // InternalDSL.g:4195:1: rule__RoleModelSlot__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RoleModelSlot__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:4199:1: ( ( ruleEString ) )
            // InternalDSL.g:4200:1: ( ruleEString )
            {
            // InternalDSL.g:4200:1: ( ruleEString )
            // InternalDSL.g:4201:1: ruleEString
            {
             before(grammarAccess.getRoleModelSlotAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRoleModelSlotAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__RoleModelSlot__NameAssignment_2"


    // $ANTLR start "rule__BindOperator__ToAssignment_3"
    // InternalDSL.g:4210:1: rule__BindOperator__ToAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__BindOperator__ToAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:4214:1: ( ( ( ruleEString ) ) )
            // InternalDSL.g:4215:1: ( ( ruleEString ) )
            {
            // InternalDSL.g:4215:1: ( ( ruleEString ) )
            // InternalDSL.g:4216:1: ( ruleEString )
            {
             before(grammarAccess.getBindOperatorAccess().getToPortTypeCrossReference_3_0()); 
            // InternalDSL.g:4217:1: ( ruleEString )
            // InternalDSL.g:4218:1: ruleEString
            {
             before(grammarAccess.getBindOperatorAccess().getToPortTypeEStringParserRuleCall_3_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBindOperatorAccess().getToPortTypeEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getBindOperatorAccess().getToPortTypeCrossReference_3_0()); 

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
    // $ANTLR end "rule__BindOperator__ToAssignment_3"


    // $ANTLR start "rule__BindOperator__SlotAssignment_5"
    // InternalDSL.g:4229:1: rule__BindOperator__SlotAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__BindOperator__SlotAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:4233:1: ( ( ( ruleEString ) ) )
            // InternalDSL.g:4234:1: ( ( ruleEString ) )
            {
            // InternalDSL.g:4234:1: ( ( ruleEString ) )
            // InternalDSL.g:4235:1: ( ruleEString )
            {
             before(grammarAccess.getBindOperatorAccess().getSlotRoleModelSlotCrossReference_5_0()); 
            // InternalDSL.g:4236:1: ( ruleEString )
            // InternalDSL.g:4237:1: ruleEString
            {
             before(grammarAccess.getBindOperatorAccess().getSlotRoleModelSlotEStringParserRuleCall_5_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBindOperatorAccess().getSlotRoleModelSlotEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getBindOperatorAccess().getSlotRoleModelSlotCrossReference_5_0()); 

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
    // $ANTLR end "rule__BindOperator__SlotAssignment_5"


    // $ANTLR start "rule__Architecture__NameAssignment_1"
    // InternalDSL.g:4248:1: rule__Architecture__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Architecture__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:4252:1: ( ( ruleEString ) )
            // InternalDSL.g:4253:1: ( ruleEString )
            {
            // InternalDSL.g:4253:1: ( ruleEString )
            // InternalDSL.g:4254:1: ruleEString
            {
             before(grammarAccess.getArchitectureAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getArchitectureAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Architecture__NameAssignment_1"


    // $ANTLR start "rule__Architecture__TypeAssignment_3"
    // InternalDSL.g:4263:1: rule__Architecture__TypeAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Architecture__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:4267:1: ( ( ( ruleEString ) ) )
            // InternalDSL.g:4268:1: ( ( ruleEString ) )
            {
            // InternalDSL.g:4268:1: ( ( ruleEString ) )
            // InternalDSL.g:4269:1: ( ruleEString )
            {
             before(grammarAccess.getArchitectureAccess().getTypeMetaArchitectureCrossReference_3_0()); 
            // InternalDSL.g:4270:1: ( ruleEString )
            // InternalDSL.g:4271:1: ruleEString
            {
             before(grammarAccess.getArchitectureAccess().getTypeMetaArchitectureEStringParserRuleCall_3_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getArchitectureAccess().getTypeMetaArchitectureEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getArchitectureAccess().getTypeMetaArchitectureCrossReference_3_0()); 

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
    // $ANTLR end "rule__Architecture__TypeAssignment_3"


    // $ANTLR start "rule__Architecture__TypeBindingsAssignment_5"
    // InternalDSL.g:4282:1: rule__Architecture__TypeBindingsAssignment_5 : ( ruleTypeBinding ) ;
    public final void rule__Architecture__TypeBindingsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:4286:1: ( ( ruleTypeBinding ) )
            // InternalDSL.g:4287:1: ( ruleTypeBinding )
            {
            // InternalDSL.g:4287:1: ( ruleTypeBinding )
            // InternalDSL.g:4288:1: ruleTypeBinding
            {
             before(grammarAccess.getArchitectureAccess().getTypeBindingsTypeBindingParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTypeBinding();

            state._fsp--;

             after(grammarAccess.getArchitectureAccess().getTypeBindingsTypeBindingParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Architecture__TypeBindingsAssignment_5"


    // $ANTLR start "rule__Architecture__ElementsAssignment_8"
    // InternalDSL.g:4297:1: rule__Architecture__ElementsAssignment_8 : ( ruleArchitectureElement ) ;
    public final void rule__Architecture__ElementsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:4301:1: ( ( ruleArchitectureElement ) )
            // InternalDSL.g:4302:1: ( ruleArchitectureElement )
            {
            // InternalDSL.g:4302:1: ( ruleArchitectureElement )
            // InternalDSL.g:4303:1: ruleArchitectureElement
            {
             before(grammarAccess.getArchitectureAccess().getElementsArchitectureElementParserRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleArchitectureElement();

            state._fsp--;

             after(grammarAccess.getArchitectureAccess().getElementsArchitectureElementParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__Architecture__ElementsAssignment_8"


    // $ANTLR start "rule__Component__NameAssignment_1"
    // InternalDSL.g:4312:1: rule__Component__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Component__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:4316:1: ( ( ruleEString ) )
            // InternalDSL.g:4317:1: ( ruleEString )
            {
            // InternalDSL.g:4317:1: ( ruleEString )
            // InternalDSL.g:4318:1: ruleEString
            {
             before(grammarAccess.getComponentAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Component__NameAssignment_1"


    // $ANTLR start "rule__Component__TypeAssignment_3"
    // InternalDSL.g:4327:1: rule__Component__TypeAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Component__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:4331:1: ( ( ( ruleEString ) ) )
            // InternalDSL.g:4332:1: ( ( ruleEString ) )
            {
            // InternalDSL.g:4332:1: ( ( ruleEString ) )
            // InternalDSL.g:4333:1: ( ruleEString )
            {
             before(grammarAccess.getComponentAccess().getTypeComponentTypeCrossReference_3_0()); 
            // InternalDSL.g:4334:1: ( ruleEString )
            // InternalDSL.g:4335:1: ruleEString
            {
             before(grammarAccess.getComponentAccess().getTypeComponentTypeEStringParserRuleCall_3_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getTypeComponentTypeEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getComponentAccess().getTypeComponentTypeCrossReference_3_0()); 

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
    // $ANTLR end "rule__Component__TypeAssignment_3"


    // $ANTLR start "rule__Port__NameAssignment_1"
    // InternalDSL.g:4346:1: rule__Port__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Port__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:4350:1: ( ( ruleEString ) )
            // InternalDSL.g:4351:1: ( ruleEString )
            {
            // InternalDSL.g:4351:1: ( ruleEString )
            // InternalDSL.g:4352:1: ruleEString
            {
             before(grammarAccess.getPortAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPortAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Port__NameAssignment_1"


    // $ANTLR start "rule__Port__TypeAssignment_3"
    // InternalDSL.g:4361:1: rule__Port__TypeAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Port__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:4365:1: ( ( ( ruleEString ) ) )
            // InternalDSL.g:4366:1: ( ( ruleEString ) )
            {
            // InternalDSL.g:4366:1: ( ( ruleEString ) )
            // InternalDSL.g:4367:1: ( ruleEString )
            {
             before(grammarAccess.getPortAccess().getTypePortTypeCrossReference_3_0()); 
            // InternalDSL.g:4368:1: ( ruleEString )
            // InternalDSL.g:4369:1: ruleEString
            {
             before(grammarAccess.getPortAccess().getTypePortTypeEStringParserRuleCall_3_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPortAccess().getTypePortTypeEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getPortAccess().getTypePortTypeCrossReference_3_0()); 

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
    // $ANTLR end "rule__Port__TypeAssignment_3"


    // $ANTLR start "rule__TypeBinding__TypeAssignment_0"
    // InternalDSL.g:4380:1: rule__TypeBinding__TypeAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__TypeBinding__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:4384:1: ( ( ( ruleEString ) ) )
            // InternalDSL.g:4385:1: ( ( ruleEString ) )
            {
            // InternalDSL.g:4385:1: ( ( ruleEString ) )
            // InternalDSL.g:4386:1: ( ruleEString )
            {
             before(grammarAccess.getTypeBindingAccess().getTypeTypeCrossReference_0_0()); 
            // InternalDSL.g:4387:1: ( ruleEString )
            // InternalDSL.g:4388:1: ruleEString
            {
             before(grammarAccess.getTypeBindingAccess().getTypeTypeEStringParserRuleCall_0_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTypeBindingAccess().getTypeTypeEStringParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getTypeBindingAccess().getTypeTypeCrossReference_0_0()); 

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
    // $ANTLR end "rule__TypeBinding__TypeAssignment_0"


    // $ANTLR start "rule__TypeBinding__ImplementationAssignment_2"
    // InternalDSL.g:4399:1: rule__TypeBinding__ImplementationAssignment_2 : ( ruleEString ) ;
    public final void rule__TypeBinding__ImplementationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDSL.g:4403:1: ( ( ruleEString ) )
            // InternalDSL.g:4404:1: ( ruleEString )
            {
            // InternalDSL.g:4404:1: ( ruleEString )
            // InternalDSL.g:4405:1: ruleEString
            {
             before(grammarAccess.getTypeBindingAccess().getImplementationEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTypeBindingAccess().getImplementationEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__TypeBinding__ImplementationAssignment_2"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000008008800L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000008008002L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002010L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000032000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000030002L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000E02000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000E00002L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080030L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000002030L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000032L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000E00000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000041000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000001002000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000060002000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000060000002L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000080000000L});
    }


}