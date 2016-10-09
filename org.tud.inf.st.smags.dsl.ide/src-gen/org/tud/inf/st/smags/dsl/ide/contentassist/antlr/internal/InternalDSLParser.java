package org.tud.inf.st.smags.dsl.ide.contentassist.antlr.internal;

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
    // InternalDSL.g:53:1: entryRuleSmagsModel : ruleSmagsModel EOF ;
    public final void entryRuleSmagsModel() throws RecognitionException {
        try {
            // InternalDSL.g:54:1: ( ruleSmagsModel EOF )
            // InternalDSL.g:55:1: ruleSmagsModel EOF
            {
             before(grammarAccess.getSmagsModelRule()); 
            pushFollow(FOLLOW_1);
            ruleSmagsModel();

            state._fsp--;

             after(grammarAccess.getSmagsModelRule()); 
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
    // $ANTLR end "entryRuleSmagsModel"


    // $ANTLR start "ruleSmagsModel"
    // InternalDSL.g:62:1: ruleSmagsModel : ( ( rule__SmagsModel__Group__0 ) ) ;
    public final void ruleSmagsModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:66:2: ( ( ( rule__SmagsModel__Group__0 ) ) )
            // InternalDSL.g:67:2: ( ( rule__SmagsModel__Group__0 ) )
            {
            // InternalDSL.g:67:2: ( ( rule__SmagsModel__Group__0 ) )
            // InternalDSL.g:68:3: ( rule__SmagsModel__Group__0 )
            {
             before(grammarAccess.getSmagsModelAccess().getGroup()); 
            // InternalDSL.g:69:3: ( rule__SmagsModel__Group__0 )
            // InternalDSL.g:69:4: rule__SmagsModel__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:78:1: entryRuleSmagsElement : ruleSmagsElement EOF ;
    public final void entryRuleSmagsElement() throws RecognitionException {
        try {
            // InternalDSL.g:79:1: ( ruleSmagsElement EOF )
            // InternalDSL.g:80:1: ruleSmagsElement EOF
            {
             before(grammarAccess.getSmagsElementRule()); 
            pushFollow(FOLLOW_1);
            ruleSmagsElement();

            state._fsp--;

             after(grammarAccess.getSmagsElementRule()); 
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
    // $ANTLR end "entryRuleSmagsElement"


    // $ANTLR start "ruleSmagsElement"
    // InternalDSL.g:87:1: ruleSmagsElement : ( ( rule__SmagsElement__Alternatives ) ) ;
    public final void ruleSmagsElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:91:2: ( ( ( rule__SmagsElement__Alternatives ) ) )
            // InternalDSL.g:92:2: ( ( rule__SmagsElement__Alternatives ) )
            {
            // InternalDSL.g:92:2: ( ( rule__SmagsElement__Alternatives ) )
            // InternalDSL.g:93:3: ( rule__SmagsElement__Alternatives )
            {
             before(grammarAccess.getSmagsElementAccess().getAlternatives()); 
            // InternalDSL.g:94:3: ( rule__SmagsElement__Alternatives )
            // InternalDSL.g:94:4: rule__SmagsElement__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:103:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalDSL.g:104:1: ( ruleImport EOF )
            // InternalDSL.g:105:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalDSL.g:112:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:116:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalDSL.g:117:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalDSL.g:117:2: ( ( rule__Import__Group__0 ) )
            // InternalDSL.g:118:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalDSL.g:119:3: ( rule__Import__Group__0 )
            // InternalDSL.g:119:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:128:1: entryRuleMetaArchitecture : ruleMetaArchitecture EOF ;
    public final void entryRuleMetaArchitecture() throws RecognitionException {
        try {
            // InternalDSL.g:129:1: ( ruleMetaArchitecture EOF )
            // InternalDSL.g:130:1: ruleMetaArchitecture EOF
            {
             before(grammarAccess.getMetaArchitectureRule()); 
            pushFollow(FOLLOW_1);
            ruleMetaArchitecture();

            state._fsp--;

             after(grammarAccess.getMetaArchitectureRule()); 
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
    // $ANTLR end "entryRuleMetaArchitecture"


    // $ANTLR start "ruleMetaArchitecture"
    // InternalDSL.g:137:1: ruleMetaArchitecture : ( ( rule__MetaArchitecture__Group__0 ) ) ;
    public final void ruleMetaArchitecture() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:141:2: ( ( ( rule__MetaArchitecture__Group__0 ) ) )
            // InternalDSL.g:142:2: ( ( rule__MetaArchitecture__Group__0 ) )
            {
            // InternalDSL.g:142:2: ( ( rule__MetaArchitecture__Group__0 ) )
            // InternalDSL.g:143:3: ( rule__MetaArchitecture__Group__0 )
            {
             before(grammarAccess.getMetaArchitectureAccess().getGroup()); 
            // InternalDSL.g:144:3: ( rule__MetaArchitecture__Group__0 )
            // InternalDSL.g:144:4: rule__MetaArchitecture__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:153:1: entryRuleMetaArchitectureElement : ruleMetaArchitectureElement EOF ;
    public final void entryRuleMetaArchitectureElement() throws RecognitionException {
        try {
            // InternalDSL.g:154:1: ( ruleMetaArchitectureElement EOF )
            // InternalDSL.g:155:1: ruleMetaArchitectureElement EOF
            {
             before(grammarAccess.getMetaArchitectureElementRule()); 
            pushFollow(FOLLOW_1);
            ruleMetaArchitectureElement();

            state._fsp--;

             after(grammarAccess.getMetaArchitectureElementRule()); 
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
    // $ANTLR end "entryRuleMetaArchitectureElement"


    // $ANTLR start "ruleMetaArchitectureElement"
    // InternalDSL.g:162:1: ruleMetaArchitectureElement : ( ( rule__MetaArchitectureElement__Alternatives ) ) ;
    public final void ruleMetaArchitectureElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:166:2: ( ( ( rule__MetaArchitectureElement__Alternatives ) ) )
            // InternalDSL.g:167:2: ( ( rule__MetaArchitectureElement__Alternatives ) )
            {
            // InternalDSL.g:167:2: ( ( rule__MetaArchitectureElement__Alternatives ) )
            // InternalDSL.g:168:3: ( rule__MetaArchitectureElement__Alternatives )
            {
             before(grammarAccess.getMetaArchitectureElementAccess().getAlternatives()); 
            // InternalDSL.g:169:3: ( rule__MetaArchitectureElement__Alternatives )
            // InternalDSL.g:169:4: rule__MetaArchitectureElement__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:178:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalDSL.g:179:1: ( ruleType EOF )
            // InternalDSL.g:180:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalDSL.g:187:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:191:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalDSL.g:192:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalDSL.g:192:2: ( ( rule__Type__Alternatives ) )
            // InternalDSL.g:193:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalDSL.g:194:3: ( rule__Type__Alternatives )
            // InternalDSL.g:194:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:203:1: entryRuleExternalType : ruleExternalType EOF ;
    public final void entryRuleExternalType() throws RecognitionException {
        try {
            // InternalDSL.g:204:1: ( ruleExternalType EOF )
            // InternalDSL.g:205:1: ruleExternalType EOF
            {
             before(grammarAccess.getExternalTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleExternalType();

            state._fsp--;

             after(grammarAccess.getExternalTypeRule()); 
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
    // $ANTLR end "entryRuleExternalType"


    // $ANTLR start "ruleExternalType"
    // InternalDSL.g:212:1: ruleExternalType : ( ( rule__ExternalType__Group__0 ) ) ;
    public final void ruleExternalType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:216:2: ( ( ( rule__ExternalType__Group__0 ) ) )
            // InternalDSL.g:217:2: ( ( rule__ExternalType__Group__0 ) )
            {
            // InternalDSL.g:217:2: ( ( rule__ExternalType__Group__0 ) )
            // InternalDSL.g:218:3: ( rule__ExternalType__Group__0 )
            {
             before(grammarAccess.getExternalTypeAccess().getGroup()); 
            // InternalDSL.g:219:3: ( rule__ExternalType__Group__0 )
            // InternalDSL.g:219:4: rule__ExternalType__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:228:1: entryRulePrimitiveType : rulePrimitiveType EOF ;
    public final void entryRulePrimitiveType() throws RecognitionException {
        try {
            // InternalDSL.g:229:1: ( rulePrimitiveType EOF )
            // InternalDSL.g:230:1: rulePrimitiveType EOF
            {
             before(grammarAccess.getPrimitiveTypeRule()); 
            pushFollow(FOLLOW_1);
            rulePrimitiveType();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypeRule()); 
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
    // $ANTLR end "entryRulePrimitiveType"


    // $ANTLR start "rulePrimitiveType"
    // InternalDSL.g:237:1: rulePrimitiveType : ( ( rule__PrimitiveType__Group__0 ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:241:2: ( ( ( rule__PrimitiveType__Group__0 ) ) )
            // InternalDSL.g:242:2: ( ( rule__PrimitiveType__Group__0 ) )
            {
            // InternalDSL.g:242:2: ( ( rule__PrimitiveType__Group__0 ) )
            // InternalDSL.g:243:3: ( rule__PrimitiveType__Group__0 )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getGroup()); 
            // InternalDSL.g:244:3: ( rule__PrimitiveType__Group__0 )
            // InternalDSL.g:244:4: rule__PrimitiveType__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:253:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalDSL.g:254:1: ( ruleVariable EOF )
            // InternalDSL.g:255:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalDSL.g:262:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:266:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalDSL.g:267:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalDSL.g:267:2: ( ( rule__Variable__Group__0 ) )
            // InternalDSL.g:268:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalDSL.g:269:3: ( rule__Variable__Group__0 )
            // InternalDSL.g:269:4: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:278:1: entryRuleAnonymousVariable : ruleAnonymousVariable EOF ;
    public final void entryRuleAnonymousVariable() throws RecognitionException {
        try {
            // InternalDSL.g:279:1: ( ruleAnonymousVariable EOF )
            // InternalDSL.g:280:1: ruleAnonymousVariable EOF
            {
             before(grammarAccess.getAnonymousVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleAnonymousVariable();

            state._fsp--;

             after(grammarAccess.getAnonymousVariableRule()); 
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
    // $ANTLR end "entryRuleAnonymousVariable"


    // $ANTLR start "ruleAnonymousVariable"
    // InternalDSL.g:287:1: ruleAnonymousVariable : ( ( rule__AnonymousVariable__TypeAssignment ) ) ;
    public final void ruleAnonymousVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:291:2: ( ( ( rule__AnonymousVariable__TypeAssignment ) ) )
            // InternalDSL.g:292:2: ( ( rule__AnonymousVariable__TypeAssignment ) )
            {
            // InternalDSL.g:292:2: ( ( rule__AnonymousVariable__TypeAssignment ) )
            // InternalDSL.g:293:3: ( rule__AnonymousVariable__TypeAssignment )
            {
             before(grammarAccess.getAnonymousVariableAccess().getTypeAssignment()); 
            // InternalDSL.g:294:3: ( rule__AnonymousVariable__TypeAssignment )
            // InternalDSL.g:294:4: rule__AnonymousVariable__TypeAssignment
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:303:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // InternalDSL.g:304:1: ( ruleMethod EOF )
            // InternalDSL.g:305:1: ruleMethod EOF
            {
             before(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_1);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getMethodRule()); 
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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalDSL.g:312:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:316:2: ( ( ( rule__Method__Group__0 ) ) )
            // InternalDSL.g:317:2: ( ( rule__Method__Group__0 ) )
            {
            // InternalDSL.g:317:2: ( ( rule__Method__Group__0 ) )
            // InternalDSL.g:318:3: ( rule__Method__Group__0 )
            {
             before(grammarAccess.getMethodAccess().getGroup()); 
            // InternalDSL.g:319:3: ( rule__Method__Group__0 )
            // InternalDSL.g:319:4: rule__Method__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:328:1: entryRulePortTypeElement : rulePortTypeElement EOF ;
    public final void entryRulePortTypeElement() throws RecognitionException {
        try {
            // InternalDSL.g:329:1: ( rulePortTypeElement EOF )
            // InternalDSL.g:330:1: rulePortTypeElement EOF
            {
             before(grammarAccess.getPortTypeElementRule()); 
            pushFollow(FOLLOW_1);
            rulePortTypeElement();

            state._fsp--;

             after(grammarAccess.getPortTypeElementRule()); 
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
    // $ANTLR end "entryRulePortTypeElement"


    // $ANTLR start "rulePortTypeElement"
    // InternalDSL.g:337:1: rulePortTypeElement : ( ( rule__PortTypeElement__Group__0 ) ) ;
    public final void rulePortTypeElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:341:2: ( ( ( rule__PortTypeElement__Group__0 ) ) )
            // InternalDSL.g:342:2: ( ( rule__PortTypeElement__Group__0 ) )
            {
            // InternalDSL.g:342:2: ( ( rule__PortTypeElement__Group__0 ) )
            // InternalDSL.g:343:3: ( rule__PortTypeElement__Group__0 )
            {
             before(grammarAccess.getPortTypeElementAccess().getGroup()); 
            // InternalDSL.g:344:3: ( rule__PortTypeElement__Group__0 )
            // InternalDSL.g:344:4: rule__PortTypeElement__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:353:1: entryRuleCompositionOperator : ruleCompositionOperator EOF ;
    public final void entryRuleCompositionOperator() throws RecognitionException {
        try {
            // InternalDSL.g:354:1: ( ruleCompositionOperator EOF )
            // InternalDSL.g:355:1: ruleCompositionOperator EOF
            {
             before(grammarAccess.getCompositionOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleCompositionOperator();

            state._fsp--;

             after(grammarAccess.getCompositionOperatorRule()); 
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
    // $ANTLR end "entryRuleCompositionOperator"


    // $ANTLR start "ruleCompositionOperator"
    // InternalDSL.g:362:1: ruleCompositionOperator : ( ruleBindOperator ) ;
    public final void ruleCompositionOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:366:2: ( ( ruleBindOperator ) )
            // InternalDSL.g:367:2: ( ruleBindOperator )
            {
            // InternalDSL.g:367:2: ( ruleBindOperator )
            // InternalDSL.g:368:3: ruleBindOperator
            {
             before(grammarAccess.getCompositionOperatorAccess().getBindOperatorParserRuleCall()); 
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:378:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalDSL.g:379:1: ( ruleEString EOF )
            // InternalDSL.g:380:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalDSL.g:387:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:391:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalDSL.g:392:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalDSL.g:392:2: ( ( rule__EString__Alternatives ) )
            // InternalDSL.g:393:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalDSL.g:394:3: ( rule__EString__Alternatives )
            // InternalDSL.g:394:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:403:1: entryRuleComponentType : ruleComponentType EOF ;
    public final void entryRuleComponentType() throws RecognitionException {
        try {
            // InternalDSL.g:404:1: ( ruleComponentType EOF )
            // InternalDSL.g:405:1: ruleComponentType EOF
            {
             before(grammarAccess.getComponentTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleComponentType();

            state._fsp--;

             after(grammarAccess.getComponentTypeRule()); 
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
    // $ANTLR end "entryRuleComponentType"


    // $ANTLR start "ruleComponentType"
    // InternalDSL.g:412:1: ruleComponentType : ( ( rule__ComponentType__Group__0 ) ) ;
    public final void ruleComponentType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:416:2: ( ( ( rule__ComponentType__Group__0 ) ) )
            // InternalDSL.g:417:2: ( ( rule__ComponentType__Group__0 ) )
            {
            // InternalDSL.g:417:2: ( ( rule__ComponentType__Group__0 ) )
            // InternalDSL.g:418:3: ( rule__ComponentType__Group__0 )
            {
             before(grammarAccess.getComponentTypeAccess().getGroup()); 
            // InternalDSL.g:419:3: ( rule__ComponentType__Group__0 )
            // InternalDSL.g:419:4: rule__ComponentType__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:428:1: entryRulePortType : rulePortType EOF ;
    public final void entryRulePortType() throws RecognitionException {
        try {
            // InternalDSL.g:429:1: ( rulePortType EOF )
            // InternalDSL.g:430:1: rulePortType EOF
            {
             before(grammarAccess.getPortTypeRule()); 
            pushFollow(FOLLOW_1);
            rulePortType();

            state._fsp--;

             after(grammarAccess.getPortTypeRule()); 
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
    // $ANTLR end "entryRulePortType"


    // $ANTLR start "rulePortType"
    // InternalDSL.g:437:1: rulePortType : ( ( rule__PortType__Group__0 ) ) ;
    public final void rulePortType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:441:2: ( ( ( rule__PortType__Group__0 ) ) )
            // InternalDSL.g:442:2: ( ( rule__PortType__Group__0 ) )
            {
            // InternalDSL.g:442:2: ( ( rule__PortType__Group__0 ) )
            // InternalDSL.g:443:3: ( rule__PortType__Group__0 )
            {
             before(grammarAccess.getPortTypeAccess().getGroup()); 
            // InternalDSL.g:444:3: ( rule__PortType__Group__0 )
            // InternalDSL.g:444:4: rule__PortType__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:453:1: entryRuleRoleModel : ruleRoleModel EOF ;
    public final void entryRuleRoleModel() throws RecognitionException {
        try {
            // InternalDSL.g:454:1: ( ruleRoleModel EOF )
            // InternalDSL.g:455:1: ruleRoleModel EOF
            {
             before(grammarAccess.getRoleModelRule()); 
            pushFollow(FOLLOW_1);
            ruleRoleModel();

            state._fsp--;

             after(grammarAccess.getRoleModelRule()); 
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
    // $ANTLR end "entryRuleRoleModel"


    // $ANTLR start "ruleRoleModel"
    // InternalDSL.g:462:1: ruleRoleModel : ( ( rule__RoleModel__Group__0 ) ) ;
    public final void ruleRoleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:466:2: ( ( ( rule__RoleModel__Group__0 ) ) )
            // InternalDSL.g:467:2: ( ( rule__RoleModel__Group__0 ) )
            {
            // InternalDSL.g:467:2: ( ( rule__RoleModel__Group__0 ) )
            // InternalDSL.g:468:3: ( rule__RoleModel__Group__0 )
            {
             before(grammarAccess.getRoleModelAccess().getGroup()); 
            // InternalDSL.g:469:3: ( rule__RoleModel__Group__0 )
            // InternalDSL.g:469:4: rule__RoleModel__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:478:1: entryRuleRoleModelSlot : ruleRoleModelSlot EOF ;
    public final void entryRuleRoleModelSlot() throws RecognitionException {
        try {
            // InternalDSL.g:479:1: ( ruleRoleModelSlot EOF )
            // InternalDSL.g:480:1: ruleRoleModelSlot EOF
            {
             before(grammarAccess.getRoleModelSlotRule()); 
            pushFollow(FOLLOW_1);
            ruleRoleModelSlot();

            state._fsp--;

             after(grammarAccess.getRoleModelSlotRule()); 
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
    // $ANTLR end "entryRuleRoleModelSlot"


    // $ANTLR start "ruleRoleModelSlot"
    // InternalDSL.g:487:1: ruleRoleModelSlot : ( ( rule__RoleModelSlot__Group__0 ) ) ;
    public final void ruleRoleModelSlot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:491:2: ( ( ( rule__RoleModelSlot__Group__0 ) ) )
            // InternalDSL.g:492:2: ( ( rule__RoleModelSlot__Group__0 ) )
            {
            // InternalDSL.g:492:2: ( ( rule__RoleModelSlot__Group__0 ) )
            // InternalDSL.g:493:3: ( rule__RoleModelSlot__Group__0 )
            {
             before(grammarAccess.getRoleModelSlotAccess().getGroup()); 
            // InternalDSL.g:494:3: ( rule__RoleModelSlot__Group__0 )
            // InternalDSL.g:494:4: rule__RoleModelSlot__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:503:1: entryRuleBindOperator : ruleBindOperator EOF ;
    public final void entryRuleBindOperator() throws RecognitionException {
        try {
            // InternalDSL.g:504:1: ( ruleBindOperator EOF )
            // InternalDSL.g:505:1: ruleBindOperator EOF
            {
             before(grammarAccess.getBindOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleBindOperator();

            state._fsp--;

             after(grammarAccess.getBindOperatorRule()); 
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
    // $ANTLR end "entryRuleBindOperator"


    // $ANTLR start "ruleBindOperator"
    // InternalDSL.g:512:1: ruleBindOperator : ( ( rule__BindOperator__Group__0 ) ) ;
    public final void ruleBindOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:516:2: ( ( ( rule__BindOperator__Group__0 ) ) )
            // InternalDSL.g:517:2: ( ( rule__BindOperator__Group__0 ) )
            {
            // InternalDSL.g:517:2: ( ( rule__BindOperator__Group__0 ) )
            // InternalDSL.g:518:3: ( rule__BindOperator__Group__0 )
            {
             before(grammarAccess.getBindOperatorAccess().getGroup()); 
            // InternalDSL.g:519:3: ( rule__BindOperator__Group__0 )
            // InternalDSL.g:519:4: rule__BindOperator__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:528:1: entryRuleArchitecture : ruleArchitecture EOF ;
    public final void entryRuleArchitecture() throws RecognitionException {
        try {
            // InternalDSL.g:529:1: ( ruleArchitecture EOF )
            // InternalDSL.g:530:1: ruleArchitecture EOF
            {
             before(grammarAccess.getArchitectureRule()); 
            pushFollow(FOLLOW_1);
            ruleArchitecture();

            state._fsp--;

             after(grammarAccess.getArchitectureRule()); 
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
    // $ANTLR end "entryRuleArchitecture"


    // $ANTLR start "ruleArchitecture"
    // InternalDSL.g:537:1: ruleArchitecture : ( ( rule__Architecture__Group__0 ) ) ;
    public final void ruleArchitecture() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:541:2: ( ( ( rule__Architecture__Group__0 ) ) )
            // InternalDSL.g:542:2: ( ( rule__Architecture__Group__0 ) )
            {
            // InternalDSL.g:542:2: ( ( rule__Architecture__Group__0 ) )
            // InternalDSL.g:543:3: ( rule__Architecture__Group__0 )
            {
             before(grammarAccess.getArchitectureAccess().getGroup()); 
            // InternalDSL.g:544:3: ( rule__Architecture__Group__0 )
            // InternalDSL.g:544:4: rule__Architecture__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:553:1: entryRuleArchitectureElement : ruleArchitectureElement EOF ;
    public final void entryRuleArchitectureElement() throws RecognitionException {
        try {
            // InternalDSL.g:554:1: ( ruleArchitectureElement EOF )
            // InternalDSL.g:555:1: ruleArchitectureElement EOF
            {
             before(grammarAccess.getArchitectureElementRule()); 
            pushFollow(FOLLOW_1);
            ruleArchitectureElement();

            state._fsp--;

             after(grammarAccess.getArchitectureElementRule()); 
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
    // $ANTLR end "entryRuleArchitectureElement"


    // $ANTLR start "ruleArchitectureElement"
    // InternalDSL.g:562:1: ruleArchitectureElement : ( ( rule__ArchitectureElement__Alternatives ) ) ;
    public final void ruleArchitectureElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:566:2: ( ( ( rule__ArchitectureElement__Alternatives ) ) )
            // InternalDSL.g:567:2: ( ( rule__ArchitectureElement__Alternatives ) )
            {
            // InternalDSL.g:567:2: ( ( rule__ArchitectureElement__Alternatives ) )
            // InternalDSL.g:568:3: ( rule__ArchitectureElement__Alternatives )
            {
             before(grammarAccess.getArchitectureElementAccess().getAlternatives()); 
            // InternalDSL.g:569:3: ( rule__ArchitectureElement__Alternatives )
            // InternalDSL.g:569:4: rule__ArchitectureElement__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:578:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // InternalDSL.g:579:1: ( ruleComponent EOF )
            // InternalDSL.g:580:1: ruleComponent EOF
            {
             before(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getComponentRule()); 
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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalDSL.g:587:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:591:2: ( ( ( rule__Component__Group__0 ) ) )
            // InternalDSL.g:592:2: ( ( rule__Component__Group__0 ) )
            {
            // InternalDSL.g:592:2: ( ( rule__Component__Group__0 ) )
            // InternalDSL.g:593:3: ( rule__Component__Group__0 )
            {
             before(grammarAccess.getComponentAccess().getGroup()); 
            // InternalDSL.g:594:3: ( rule__Component__Group__0 )
            // InternalDSL.g:594:4: rule__Component__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:603:1: entryRulePort : rulePort EOF ;
    public final void entryRulePort() throws RecognitionException {
        try {
            // InternalDSL.g:604:1: ( rulePort EOF )
            // InternalDSL.g:605:1: rulePort EOF
            {
             before(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_1);
            rulePort();

            state._fsp--;

             after(grammarAccess.getPortRule()); 
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
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // InternalDSL.g:612:1: rulePort : ( ( rule__Port__Group__0 ) ) ;
    public final void rulePort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:616:2: ( ( ( rule__Port__Group__0 ) ) )
            // InternalDSL.g:617:2: ( ( rule__Port__Group__0 ) )
            {
            // InternalDSL.g:617:2: ( ( rule__Port__Group__0 ) )
            // InternalDSL.g:618:3: ( rule__Port__Group__0 )
            {
             before(grammarAccess.getPortAccess().getGroup()); 
            // InternalDSL.g:619:3: ( rule__Port__Group__0 )
            // InternalDSL.g:619:4: rule__Port__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:628:1: entryRuleTypeBinding : ruleTypeBinding EOF ;
    public final void entryRuleTypeBinding() throws RecognitionException {
        try {
            // InternalDSL.g:629:1: ( ruleTypeBinding EOF )
            // InternalDSL.g:630:1: ruleTypeBinding EOF
            {
             before(grammarAccess.getTypeBindingRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeBinding();

            state._fsp--;

             after(grammarAccess.getTypeBindingRule()); 
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
    // $ANTLR end "entryRuleTypeBinding"


    // $ANTLR start "ruleTypeBinding"
    // InternalDSL.g:637:1: ruleTypeBinding : ( ( rule__TypeBinding__Group__0 ) ) ;
    public final void ruleTypeBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:641:2: ( ( ( rule__TypeBinding__Group__0 ) ) )
            // InternalDSL.g:642:2: ( ( rule__TypeBinding__Group__0 ) )
            {
            // InternalDSL.g:642:2: ( ( rule__TypeBinding__Group__0 ) )
            // InternalDSL.g:643:3: ( rule__TypeBinding__Group__0 )
            {
             before(grammarAccess.getTypeBindingAccess().getGroup()); 
            // InternalDSL.g:644:3: ( rule__TypeBinding__Group__0 )
            // InternalDSL.g:644:4: rule__TypeBinding__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:652:1: rule__SmagsElement__Alternatives : ( ( ruleMetaArchitecture ) | ( ruleArchitecture ) );
    public final void rule__SmagsElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:656:1: ( ( ruleMetaArchitecture ) | ( ruleArchitecture ) )
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
                    // InternalDSL.g:657:2: ( ruleMetaArchitecture )
                    {
                    // InternalDSL.g:657:2: ( ruleMetaArchitecture )
                    // InternalDSL.g:658:3: ruleMetaArchitecture
                    {
                     before(grammarAccess.getSmagsElementAccess().getMetaArchitectureParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMetaArchitecture();

                    state._fsp--;

                     after(grammarAccess.getSmagsElementAccess().getMetaArchitectureParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:663:2: ( ruleArchitecture )
                    {
                    // InternalDSL.g:663:2: ( ruleArchitecture )
                    // InternalDSL.g:664:3: ruleArchitecture
                    {
                     before(grammarAccess.getSmagsElementAccess().getArchitectureParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
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
    // InternalDSL.g:673:1: rule__MetaArchitectureElement__Alternatives : ( ( ruleComponentType ) | ( rulePortType ) | ( ruleRoleModel ) );
    public final void rule__MetaArchitectureElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:677:1: ( ( ruleComponentType ) | ( rulePortType ) | ( ruleRoleModel ) )
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
                    // InternalDSL.g:678:2: ( ruleComponentType )
                    {
                    // InternalDSL.g:678:2: ( ruleComponentType )
                    // InternalDSL.g:679:3: ruleComponentType
                    {
                     before(grammarAccess.getMetaArchitectureElementAccess().getComponentTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleComponentType();

                    state._fsp--;

                     after(grammarAccess.getMetaArchitectureElementAccess().getComponentTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:684:2: ( rulePortType )
                    {
                    // InternalDSL.g:684:2: ( rulePortType )
                    // InternalDSL.g:685:3: rulePortType
                    {
                     before(grammarAccess.getMetaArchitectureElementAccess().getPortTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePortType();

                    state._fsp--;

                     after(grammarAccess.getMetaArchitectureElementAccess().getPortTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:690:2: ( ruleRoleModel )
                    {
                    // InternalDSL.g:690:2: ( ruleRoleModel )
                    // InternalDSL.g:691:3: ruleRoleModel
                    {
                     before(grammarAccess.getMetaArchitectureElementAccess().getRoleModelParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
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
    // InternalDSL.g:700:1: rule__Type__Alternatives : ( ( ruleExternalType ) | ( rulePrimitiveType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:704:1: ( ( ruleExternalType ) | ( rulePrimitiveType ) )
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
                    // InternalDSL.g:705:2: ( ruleExternalType )
                    {
                    // InternalDSL.g:705:2: ( ruleExternalType )
                    // InternalDSL.g:706:3: ruleExternalType
                    {
                     before(grammarAccess.getTypeAccess().getExternalTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleExternalType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getExternalTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:711:2: ( rulePrimitiveType )
                    {
                    // InternalDSL.g:711:2: ( rulePrimitiveType )
                    // InternalDSL.g:712:3: rulePrimitiveType
                    {
                     before(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
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
    // InternalDSL.g:721:1: rule__PortTypeElement__Alternatives_0 : ( ( ruleVariable ) | ( ruleMethod ) );
    public final void rule__PortTypeElement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:725:1: ( ( ruleVariable ) | ( ruleMethod ) )
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
                    // InternalDSL.g:726:2: ( ruleVariable )
                    {
                    // InternalDSL.g:726:2: ( ruleVariable )
                    // InternalDSL.g:727:3: ruleVariable
                    {
                     before(grammarAccess.getPortTypeElementAccess().getVariableParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleVariable();

                    state._fsp--;

                     after(grammarAccess.getPortTypeElementAccess().getVariableParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:732:2: ( ruleMethod )
                    {
                    // InternalDSL.g:732:2: ( ruleMethod )
                    // InternalDSL.g:733:3: ruleMethod
                    {
                     before(grammarAccess.getPortTypeElementAccess().getMethodParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
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
    // InternalDSL.g:742:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:746:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalDSL.g:747:2: ( RULE_STRING )
                    {
                    // InternalDSL.g:747:2: ( RULE_STRING )
                    // InternalDSL.g:748:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:753:2: ( RULE_ID )
                    {
                    // InternalDSL.g:753:2: ( RULE_ID )
                    // InternalDSL.g:754:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
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
    // InternalDSL.g:763:1: rule__ArchitectureElement__Alternatives : ( ( ruleComponent ) | ( rulePort ) );
    public final void rule__ArchitectureElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:767:1: ( ( ruleComponent ) | ( rulePort ) )
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
                    // InternalDSL.g:768:2: ( ruleComponent )
                    {
                    // InternalDSL.g:768:2: ( ruleComponent )
                    // InternalDSL.g:769:3: ruleComponent
                    {
                     before(grammarAccess.getArchitectureElementAccess().getComponentParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleComponent();

                    state._fsp--;

                     after(grammarAccess.getArchitectureElementAccess().getComponentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:774:2: ( rulePort )
                    {
                    // InternalDSL.g:774:2: ( rulePort )
                    // InternalDSL.g:775:3: rulePort
                    {
                     before(grammarAccess.getArchitectureElementAccess().getPortParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
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
    // InternalDSL.g:784:1: rule__SmagsModel__Group__0 : rule__SmagsModel__Group__0__Impl rule__SmagsModel__Group__1 ;
    public final void rule__SmagsModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:788:1: ( rule__SmagsModel__Group__0__Impl rule__SmagsModel__Group__1 )
            // InternalDSL.g:789:2: rule__SmagsModel__Group__0__Impl rule__SmagsModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SmagsModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:796:1: rule__SmagsModel__Group__0__Impl : ( () ) ;
    public final void rule__SmagsModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:800:1: ( ( () ) )
            // InternalDSL.g:801:1: ( () )
            {
            // InternalDSL.g:801:1: ( () )
            // InternalDSL.g:802:2: ()
            {
             before(grammarAccess.getSmagsModelAccess().getSmagsModelAction_0()); 
            // InternalDSL.g:803:2: ()
            // InternalDSL.g:803:3: 
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
    // InternalDSL.g:811:1: rule__SmagsModel__Group__1 : rule__SmagsModel__Group__1__Impl rule__SmagsModel__Group__2 ;
    public final void rule__SmagsModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:815:1: ( rule__SmagsModel__Group__1__Impl rule__SmagsModel__Group__2 )
            // InternalDSL.g:816:2: rule__SmagsModel__Group__1__Impl rule__SmagsModel__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__SmagsModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:823:1: rule__SmagsModel__Group__1__Impl : ( ( rule__SmagsModel__Group_1__0 )? ) ;
    public final void rule__SmagsModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:827:1: ( ( ( rule__SmagsModel__Group_1__0 )? ) )
            // InternalDSL.g:828:1: ( ( rule__SmagsModel__Group_1__0 )? )
            {
            // InternalDSL.g:828:1: ( ( rule__SmagsModel__Group_1__0 )? )
            // InternalDSL.g:829:2: ( rule__SmagsModel__Group_1__0 )?
            {
             before(grammarAccess.getSmagsModelAccess().getGroup_1()); 
            // InternalDSL.g:830:2: ( rule__SmagsModel__Group_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==11) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDSL.g:830:3: rule__SmagsModel__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalDSL.g:838:1: rule__SmagsModel__Group__2 : rule__SmagsModel__Group__2__Impl ;
    public final void rule__SmagsModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:842:1: ( rule__SmagsModel__Group__2__Impl )
            // InternalDSL.g:843:2: rule__SmagsModel__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:849:1: rule__SmagsModel__Group__2__Impl : ( ( rule__SmagsModel__ElementsAssignment_2 )* ) ;
    public final void rule__SmagsModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:853:1: ( ( ( rule__SmagsModel__ElementsAssignment_2 )* ) )
            // InternalDSL.g:854:1: ( ( rule__SmagsModel__ElementsAssignment_2 )* )
            {
            // InternalDSL.g:854:1: ( ( rule__SmagsModel__ElementsAssignment_2 )* )
            // InternalDSL.g:855:2: ( rule__SmagsModel__ElementsAssignment_2 )*
            {
             before(grammarAccess.getSmagsModelAccess().getElementsAssignment_2()); 
            // InternalDSL.g:856:2: ( rule__SmagsModel__ElementsAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15||LA8_0==27) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDSL.g:856:3: rule__SmagsModel__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_4);
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
    // InternalDSL.g:865:1: rule__SmagsModel__Group_1__0 : rule__SmagsModel__Group_1__0__Impl rule__SmagsModel__Group_1__1 ;
    public final void rule__SmagsModel__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:869:1: ( rule__SmagsModel__Group_1__0__Impl rule__SmagsModel__Group_1__1 )
            // InternalDSL.g:870:2: rule__SmagsModel__Group_1__0__Impl rule__SmagsModel__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__SmagsModel__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:877:1: rule__SmagsModel__Group_1__0__Impl : ( 'imports' ) ;
    public final void rule__SmagsModel__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:881:1: ( ( 'imports' ) )
            // InternalDSL.g:882:1: ( 'imports' )
            {
            // InternalDSL.g:882:1: ( 'imports' )
            // InternalDSL.g:883:2: 'imports'
            {
             before(grammarAccess.getSmagsModelAccess().getImportsKeyword_1_0()); 
            match(input,11,FOLLOW_2); 
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
    // InternalDSL.g:892:1: rule__SmagsModel__Group_1__1 : rule__SmagsModel__Group_1__1__Impl rule__SmagsModel__Group_1__2 ;
    public final void rule__SmagsModel__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:896:1: ( rule__SmagsModel__Group_1__1__Impl rule__SmagsModel__Group_1__2 )
            // InternalDSL.g:897:2: rule__SmagsModel__Group_1__1__Impl rule__SmagsModel__Group_1__2
            {
            pushFollow(FOLLOW_6);
            rule__SmagsModel__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:904:1: rule__SmagsModel__Group_1__1__Impl : ( '{' ) ;
    public final void rule__SmagsModel__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:908:1: ( ( '{' ) )
            // InternalDSL.g:909:1: ( '{' )
            {
            // InternalDSL.g:909:1: ( '{' )
            // InternalDSL.g:910:2: '{'
            {
             before(grammarAccess.getSmagsModelAccess().getLeftCurlyBracketKeyword_1_1()); 
            match(input,12,FOLLOW_2); 
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
    // InternalDSL.g:919:1: rule__SmagsModel__Group_1__2 : rule__SmagsModel__Group_1__2__Impl rule__SmagsModel__Group_1__3 ;
    public final void rule__SmagsModel__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:923:1: ( rule__SmagsModel__Group_1__2__Impl rule__SmagsModel__Group_1__3 )
            // InternalDSL.g:924:2: rule__SmagsModel__Group_1__2__Impl rule__SmagsModel__Group_1__3
            {
            pushFollow(FOLLOW_6);
            rule__SmagsModel__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:931:1: rule__SmagsModel__Group_1__2__Impl : ( ( rule__SmagsModel__ImportsAssignment_1_2 )* ) ;
    public final void rule__SmagsModel__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:935:1: ( ( ( rule__SmagsModel__ImportsAssignment_1_2 )* ) )
            // InternalDSL.g:936:1: ( ( rule__SmagsModel__ImportsAssignment_1_2 )* )
            {
            // InternalDSL.g:936:1: ( ( rule__SmagsModel__ImportsAssignment_1_2 )* )
            // InternalDSL.g:937:2: ( rule__SmagsModel__ImportsAssignment_1_2 )*
            {
             before(grammarAccess.getSmagsModelAccess().getImportsAssignment_1_2()); 
            // InternalDSL.g:938:2: ( rule__SmagsModel__ImportsAssignment_1_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_STRING) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDSL.g:938:3: rule__SmagsModel__ImportsAssignment_1_2
            	    {
            	    pushFollow(FOLLOW_7);
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
    // InternalDSL.g:946:1: rule__SmagsModel__Group_1__3 : rule__SmagsModel__Group_1__3__Impl ;
    public final void rule__SmagsModel__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:950:1: ( rule__SmagsModel__Group_1__3__Impl )
            // InternalDSL.g:951:2: rule__SmagsModel__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:957:1: rule__SmagsModel__Group_1__3__Impl : ( '}' ) ;
    public final void rule__SmagsModel__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:961:1: ( ( '}' ) )
            // InternalDSL.g:962:1: ( '}' )
            {
            // InternalDSL.g:962:1: ( '}' )
            // InternalDSL.g:963:2: '}'
            {
             before(grammarAccess.getSmagsModelAccess().getRightCurlyBracketKeyword_1_3()); 
            match(input,13,FOLLOW_2); 
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
    // InternalDSL.g:973:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:977:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalDSL.g:978:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:985:1: rule__Import__Group__0__Impl : ( ( rule__Import__ImportURIAssignment_0 ) ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:989:1: ( ( ( rule__Import__ImportURIAssignment_0 ) ) )
            // InternalDSL.g:990:1: ( ( rule__Import__ImportURIAssignment_0 ) )
            {
            // InternalDSL.g:990:1: ( ( rule__Import__ImportURIAssignment_0 ) )
            // InternalDSL.g:991:2: ( rule__Import__ImportURIAssignment_0 )
            {
             before(grammarAccess.getImportAccess().getImportURIAssignment_0()); 
            // InternalDSL.g:992:2: ( rule__Import__ImportURIAssignment_0 )
            // InternalDSL.g:992:3: rule__Import__ImportURIAssignment_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:1000:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1004:1: ( rule__Import__Group__1__Impl )
            // InternalDSL.g:1005:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:1011:1: rule__Import__Group__1__Impl : ( ';' ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1015:1: ( ( ';' ) )
            // InternalDSL.g:1016:1: ( ';' )
            {
            // InternalDSL.g:1016:1: ( ';' )
            // InternalDSL.g:1017:2: ';'
            {
             before(grammarAccess.getImportAccess().getSemicolonKeyword_1()); 
            match(input,14,FOLLOW_2); 
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
    // InternalDSL.g:1027:1: rule__MetaArchitecture__Group__0 : rule__MetaArchitecture__Group__0__Impl rule__MetaArchitecture__Group__1 ;
    public final void rule__MetaArchitecture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1031:1: ( rule__MetaArchitecture__Group__0__Impl rule__MetaArchitecture__Group__1 )
            // InternalDSL.g:1032:2: rule__MetaArchitecture__Group__0__Impl rule__MetaArchitecture__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__MetaArchitecture__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:1039:1: rule__MetaArchitecture__Group__0__Impl : ( 'MetaArchitecture' ) ;
    public final void rule__MetaArchitecture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1043:1: ( ( 'MetaArchitecture' ) )
            // InternalDSL.g:1044:1: ( 'MetaArchitecture' )
            {
            // InternalDSL.g:1044:1: ( 'MetaArchitecture' )
            // InternalDSL.g:1045:2: 'MetaArchitecture'
            {
             before(grammarAccess.getMetaArchitectureAccess().getMetaArchitectureKeyword_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalDSL.g:1054:1: rule__MetaArchitecture__Group__1 : rule__MetaArchitecture__Group__1__Impl rule__MetaArchitecture__Group__2 ;
    public final void rule__MetaArchitecture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1058:1: ( rule__MetaArchitecture__Group__1__Impl rule__MetaArchitecture__Group__2 )
            // InternalDSL.g:1059:2: rule__MetaArchitecture__Group__1__Impl rule__MetaArchitecture__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__MetaArchitecture__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:1066:1: rule__MetaArchitecture__Group__1__Impl : ( ( rule__MetaArchitecture__NameAssignment_1 ) ) ;
    public final void rule__MetaArchitecture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1070:1: ( ( ( rule__MetaArchitecture__NameAssignment_1 ) ) )
            // InternalDSL.g:1071:1: ( ( rule__MetaArchitecture__NameAssignment_1 ) )
            {
            // InternalDSL.g:1071:1: ( ( rule__MetaArchitecture__NameAssignment_1 ) )
            // InternalDSL.g:1072:2: ( rule__MetaArchitecture__NameAssignment_1 )
            {
             before(grammarAccess.getMetaArchitectureAccess().getNameAssignment_1()); 
            // InternalDSL.g:1073:2: ( rule__MetaArchitecture__NameAssignment_1 )
            // InternalDSL.g:1073:3: rule__MetaArchitecture__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:1081:1: rule__MetaArchitecture__Group__2 : rule__MetaArchitecture__Group__2__Impl rule__MetaArchitecture__Group__3 ;
    public final void rule__MetaArchitecture__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1085:1: ( rule__MetaArchitecture__Group__2__Impl rule__MetaArchitecture__Group__3 )
            // InternalDSL.g:1086:2: rule__MetaArchitecture__Group__2__Impl rule__MetaArchitecture__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__MetaArchitecture__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:1093:1: rule__MetaArchitecture__Group__2__Impl : ( '{' ) ;
    public final void rule__MetaArchitecture__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1097:1: ( ( '{' ) )
            // InternalDSL.g:1098:1: ( '{' )
            {
            // InternalDSL.g:1098:1: ( '{' )
            // InternalDSL.g:1099:2: '{'
            {
             before(grammarAccess.getMetaArchitectureAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
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
    // InternalDSL.g:1108:1: rule__MetaArchitecture__Group__3 : rule__MetaArchitecture__Group__3__Impl rule__MetaArchitecture__Group__4 ;
    public final void rule__MetaArchitecture__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1112:1: ( rule__MetaArchitecture__Group__3__Impl rule__MetaArchitecture__Group__4 )
            // InternalDSL.g:1113:2: rule__MetaArchitecture__Group__3__Impl rule__MetaArchitecture__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__MetaArchitecture__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:1120:1: rule__MetaArchitecture__Group__3__Impl : ( ( rule__MetaArchitecture__TypesAssignment_3 )* ) ;
    public final void rule__MetaArchitecture__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1124:1: ( ( ( rule__MetaArchitecture__TypesAssignment_3 )* ) )
            // InternalDSL.g:1125:1: ( ( rule__MetaArchitecture__TypesAssignment_3 )* )
            {
            // InternalDSL.g:1125:1: ( ( rule__MetaArchitecture__TypesAssignment_3 )* )
            // InternalDSL.g:1126:2: ( rule__MetaArchitecture__TypesAssignment_3 )*
            {
             before(grammarAccess.getMetaArchitectureAccess().getTypesAssignment_3()); 
            // InternalDSL.g:1127:2: ( rule__MetaArchitecture__TypesAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=16 && LA10_0<=17)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDSL.g:1127:3: rule__MetaArchitecture__TypesAssignment_3
            	    {
            	    pushFollow(FOLLOW_11);
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
    // InternalDSL.g:1135:1: rule__MetaArchitecture__Group__4 : rule__MetaArchitecture__Group__4__Impl rule__MetaArchitecture__Group__5 ;
    public final void rule__MetaArchitecture__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1139:1: ( rule__MetaArchitecture__Group__4__Impl rule__MetaArchitecture__Group__5 )
            // InternalDSL.g:1140:2: rule__MetaArchitecture__Group__4__Impl rule__MetaArchitecture__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__MetaArchitecture__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:1147:1: rule__MetaArchitecture__Group__4__Impl : ( '}' ) ;
    public final void rule__MetaArchitecture__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1151:1: ( ( '}' ) )
            // InternalDSL.g:1152:1: ( '}' )
            {
            // InternalDSL.g:1152:1: ( '}' )
            // InternalDSL.g:1153:2: '}'
            {
             before(grammarAccess.getMetaArchitectureAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
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
    // InternalDSL.g:1162:1: rule__MetaArchitecture__Group__5 : rule__MetaArchitecture__Group__5__Impl rule__MetaArchitecture__Group__6 ;
    public final void rule__MetaArchitecture__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1166:1: ( rule__MetaArchitecture__Group__5__Impl rule__MetaArchitecture__Group__6 )
            // InternalDSL.g:1167:2: rule__MetaArchitecture__Group__5__Impl rule__MetaArchitecture__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__MetaArchitecture__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:1174:1: rule__MetaArchitecture__Group__5__Impl : ( '{' ) ;
    public final void rule__MetaArchitecture__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1178:1: ( ( '{' ) )
            // InternalDSL.g:1179:1: ( '{' )
            {
            // InternalDSL.g:1179:1: ( '{' )
            // InternalDSL.g:1180:2: '{'
            {
             before(grammarAccess.getMetaArchitectureAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,12,FOLLOW_2); 
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
    // InternalDSL.g:1189:1: rule__MetaArchitecture__Group__6 : rule__MetaArchitecture__Group__6__Impl rule__MetaArchitecture__Group__7 ;
    public final void rule__MetaArchitecture__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1193:1: ( rule__MetaArchitecture__Group__6__Impl rule__MetaArchitecture__Group__7 )
            // InternalDSL.g:1194:2: rule__MetaArchitecture__Group__6__Impl rule__MetaArchitecture__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__MetaArchitecture__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:1201:1: rule__MetaArchitecture__Group__6__Impl : ( ( rule__MetaArchitecture__ElementsAssignment_6 )* ) ;
    public final void rule__MetaArchitecture__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1205:1: ( ( ( rule__MetaArchitecture__ElementsAssignment_6 )* ) )
            // InternalDSL.g:1206:1: ( ( rule__MetaArchitecture__ElementsAssignment_6 )* )
            {
            // InternalDSL.g:1206:1: ( ( rule__MetaArchitecture__ElementsAssignment_6 )* )
            // InternalDSL.g:1207:2: ( rule__MetaArchitecture__ElementsAssignment_6 )*
            {
             before(grammarAccess.getMetaArchitectureAccess().getElementsAssignment_6()); 
            // InternalDSL.g:1208:2: ( rule__MetaArchitecture__ElementsAssignment_6 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=21 && LA11_0<=23)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDSL.g:1208:3: rule__MetaArchitecture__ElementsAssignment_6
            	    {
            	    pushFollow(FOLLOW_13);
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
    // InternalDSL.g:1216:1: rule__MetaArchitecture__Group__7 : rule__MetaArchitecture__Group__7__Impl ;
    public final void rule__MetaArchitecture__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1220:1: ( rule__MetaArchitecture__Group__7__Impl )
            // InternalDSL.g:1221:2: rule__MetaArchitecture__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:1227:1: rule__MetaArchitecture__Group__7__Impl : ( '}' ) ;
    public final void rule__MetaArchitecture__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1231:1: ( ( '}' ) )
            // InternalDSL.g:1232:1: ( '}' )
            {
            // InternalDSL.g:1232:1: ( '}' )
            // InternalDSL.g:1233:2: '}'
            {
             before(grammarAccess.getMetaArchitectureAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
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
    // InternalDSL.g:1243:1: rule__ExternalType__Group__0 : rule__ExternalType__Group__0__Impl rule__ExternalType__Group__1 ;
    public final void rule__ExternalType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1247:1: ( rule__ExternalType__Group__0__Impl rule__ExternalType__Group__1 )
            // InternalDSL.g:1248:2: rule__ExternalType__Group__0__Impl rule__ExternalType__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ExternalType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:1255:1: rule__ExternalType__Group__0__Impl : ( 'Type' ) ;
    public final void rule__ExternalType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1259:1: ( ( 'Type' ) )
            // InternalDSL.g:1260:1: ( 'Type' )
            {
            // InternalDSL.g:1260:1: ( 'Type' )
            // InternalDSL.g:1261:2: 'Type'
            {
             before(grammarAccess.getExternalTypeAccess().getTypeKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalDSL.g:1270:1: rule__ExternalType__Group__1 : rule__ExternalType__Group__1__Impl rule__ExternalType__Group__2 ;
    public final void rule__ExternalType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1274:1: ( rule__ExternalType__Group__1__Impl rule__ExternalType__Group__2 )
            // InternalDSL.g:1275:2: rule__ExternalType__Group__1__Impl rule__ExternalType__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__ExternalType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:1282:1: rule__ExternalType__Group__1__Impl : ( ( rule__ExternalType__NameAssignment_1 ) ) ;
    public final void rule__ExternalType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1286:1: ( ( ( rule__ExternalType__NameAssignment_1 ) ) )
            // InternalDSL.g:1287:1: ( ( rule__ExternalType__NameAssignment_1 ) )
            {
            // InternalDSL.g:1287:1: ( ( rule__ExternalType__NameAssignment_1 ) )
            // InternalDSL.g:1288:2: ( rule__ExternalType__NameAssignment_1 )
            {
             before(grammarAccess.getExternalTypeAccess().getNameAssignment_1()); 
            // InternalDSL.g:1289:2: ( rule__ExternalType__NameAssignment_1 )
            // InternalDSL.g:1289:3: rule__ExternalType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:1297:1: rule__ExternalType__Group__2 : rule__ExternalType__Group__2__Impl ;
    public final void rule__ExternalType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1301:1: ( rule__ExternalType__Group__2__Impl )
            // InternalDSL.g:1302:2: rule__ExternalType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:1308:1: rule__ExternalType__Group__2__Impl : ( ';' ) ;
    public final void rule__ExternalType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1312:1: ( ( ';' ) )
            // InternalDSL.g:1313:1: ( ';' )
            {
            // InternalDSL.g:1313:1: ( ';' )
            // InternalDSL.g:1314:2: ';'
            {
             before(grammarAccess.getExternalTypeAccess().getSemicolonKeyword_2()); 
            match(input,14,FOLLOW_2); 
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
    // InternalDSL.g:1324:1: rule__PrimitiveType__Group__0 : rule__PrimitiveType__Group__0__Impl rule__PrimitiveType__Group__1 ;
    public final void rule__PrimitiveType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1328:1: ( rule__PrimitiveType__Group__0__Impl rule__PrimitiveType__Group__1 )
            // InternalDSL.g:1329:2: rule__PrimitiveType__Group__0__Impl rule__PrimitiveType__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__PrimitiveType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:1336:1: rule__PrimitiveType__Group__0__Impl : ( 'Primitive' ) ;
    public final void rule__PrimitiveType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1340:1: ( ( 'Primitive' ) )
            // InternalDSL.g:1341:1: ( 'Primitive' )
            {
            // InternalDSL.g:1341:1: ( 'Primitive' )
            // InternalDSL.g:1342:2: 'Primitive'
            {
             before(grammarAccess.getPrimitiveTypeAccess().getPrimitiveKeyword_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalDSL.g:1351:1: rule__PrimitiveType__Group__1 : rule__PrimitiveType__Group__1__Impl rule__PrimitiveType__Group__2 ;
    public final void rule__PrimitiveType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1355:1: ( rule__PrimitiveType__Group__1__Impl rule__PrimitiveType__Group__2 )
            // InternalDSL.g:1356:2: rule__PrimitiveType__Group__1__Impl rule__PrimitiveType__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__PrimitiveType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:1363:1: rule__PrimitiveType__Group__1__Impl : ( ( rule__PrimitiveType__NameAssignment_1 ) ) ;
    public final void rule__PrimitiveType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1367:1: ( ( ( rule__PrimitiveType__NameAssignment_1 ) ) )
            // InternalDSL.g:1368:1: ( ( rule__PrimitiveType__NameAssignment_1 ) )
            {
            // InternalDSL.g:1368:1: ( ( rule__PrimitiveType__NameAssignment_1 ) )
            // InternalDSL.g:1369:2: ( rule__PrimitiveType__NameAssignment_1 )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getNameAssignment_1()); 
            // InternalDSL.g:1370:2: ( rule__PrimitiveType__NameAssignment_1 )
            // InternalDSL.g:1370:3: rule__PrimitiveType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:1378:1: rule__PrimitiveType__Group__2 : rule__PrimitiveType__Group__2__Impl ;
    public final void rule__PrimitiveType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1382:1: ( rule__PrimitiveType__Group__2__Impl )
            // InternalDSL.g:1383:2: rule__PrimitiveType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:1389:1: rule__PrimitiveType__Group__2__Impl : ( ';' ) ;
    public final void rule__PrimitiveType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1393:1: ( ( ';' ) )
            // InternalDSL.g:1394:1: ( ';' )
            {
            // InternalDSL.g:1394:1: ( ';' )
            // InternalDSL.g:1395:2: ';'
            {
             before(grammarAccess.getPrimitiveTypeAccess().getSemicolonKeyword_2()); 
            match(input,14,FOLLOW_2); 
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
    // InternalDSL.g:1405:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1409:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalDSL.g:1410:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:1417:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__TypeAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1421:1: ( ( ( rule__Variable__TypeAssignment_0 ) ) )
            // InternalDSL.g:1422:1: ( ( rule__Variable__TypeAssignment_0 ) )
            {
            // InternalDSL.g:1422:1: ( ( rule__Variable__TypeAssignment_0 ) )
            // InternalDSL.g:1423:2: ( rule__Variable__TypeAssignment_0 )
            {
             before(grammarAccess.getVariableAccess().getTypeAssignment_0()); 
            // InternalDSL.g:1424:2: ( rule__Variable__TypeAssignment_0 )
            // InternalDSL.g:1424:3: rule__Variable__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:1432:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1436:1: ( rule__Variable__Group__1__Impl )
            // InternalDSL.g:1437:2: rule__Variable__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:1443:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__NameAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1447:1: ( ( ( rule__Variable__NameAssignment_1 ) ) )
            // InternalDSL.g:1448:1: ( ( rule__Variable__NameAssignment_1 ) )
            {
            // InternalDSL.g:1448:1: ( ( rule__Variable__NameAssignment_1 ) )
            // InternalDSL.g:1449:2: ( rule__Variable__NameAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_1()); 
            // InternalDSL.g:1450:2: ( rule__Variable__NameAssignment_1 )
            // InternalDSL.g:1450:3: rule__Variable__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:1459:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1463:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // InternalDSL.g:1464:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Method__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:1471:1: rule__Method__Group__0__Impl : ( ( rule__Method__ReturnTypeAssignment_0 ) ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1475:1: ( ( ( rule__Method__ReturnTypeAssignment_0 ) ) )
            // InternalDSL.g:1476:1: ( ( rule__Method__ReturnTypeAssignment_0 ) )
            {
            // InternalDSL.g:1476:1: ( ( rule__Method__ReturnTypeAssignment_0 ) )
            // InternalDSL.g:1477:2: ( rule__Method__ReturnTypeAssignment_0 )
            {
             before(grammarAccess.getMethodAccess().getReturnTypeAssignment_0()); 
            // InternalDSL.g:1478:2: ( rule__Method__ReturnTypeAssignment_0 )
            // InternalDSL.g:1478:3: rule__Method__ReturnTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:1486:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1490:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // InternalDSL.g:1491:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Method__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:1498:1: rule__Method__Group__1__Impl : ( ( rule__Method__NameAssignment_1 ) ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1502:1: ( ( ( rule__Method__NameAssignment_1 ) ) )
            // InternalDSL.g:1503:1: ( ( rule__Method__NameAssignment_1 ) )
            {
            // InternalDSL.g:1503:1: ( ( rule__Method__NameAssignment_1 ) )
            // InternalDSL.g:1504:2: ( rule__Method__NameAssignment_1 )
            {
             before(grammarAccess.getMethodAccess().getNameAssignment_1()); 
            // InternalDSL.g:1505:2: ( rule__Method__NameAssignment_1 )
            // InternalDSL.g:1505:3: rule__Method__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:1513:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1517:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // InternalDSL.g:1518:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Method__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:1525:1: rule__Method__Group__2__Impl : ( '(' ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1529:1: ( ( '(' ) )
            // InternalDSL.g:1530:1: ( '(' )
            {
            // InternalDSL.g:1530:1: ( '(' )
            // InternalDSL.g:1531:2: '('
            {
             before(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2()); 
            match(input,18,FOLLOW_2); 
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
    // InternalDSL.g:1540:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1544:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // InternalDSL.g:1545:2: rule__Method__Group__3__Impl rule__Method__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Method__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:1552:1: rule__Method__Group__3__Impl : ( ( rule__Method__Group_3__0 )? ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1556:1: ( ( ( rule__Method__Group_3__0 )? ) )
            // InternalDSL.g:1557:1: ( ( rule__Method__Group_3__0 )? )
            {
            // InternalDSL.g:1557:1: ( ( rule__Method__Group_3__0 )? )
            // InternalDSL.g:1558:2: ( rule__Method__Group_3__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_3()); 
            // InternalDSL.g:1559:2: ( rule__Method__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_STRING && LA12_0<=RULE_ID)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDSL.g:1559:3: rule__Method__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalDSL.g:1567:1: rule__Method__Group__4 : rule__Method__Group__4__Impl ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1571:1: ( rule__Method__Group__4__Impl )
            // InternalDSL.g:1572:2: rule__Method__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:1578:1: rule__Method__Group__4__Impl : ( ')' ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1582:1: ( ( ')' ) )
            // InternalDSL.g:1583:1: ( ')' )
            {
            // InternalDSL.g:1583:1: ( ')' )
            // InternalDSL.g:1584:2: ')'
            {
             before(grammarAccess.getMethodAccess().getRightParenthesisKeyword_4()); 
            match(input,19,FOLLOW_2); 
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
    // InternalDSL.g:1594:1: rule__Method__Group_3__0 : rule__Method__Group_3__0__Impl rule__Method__Group_3__1 ;
    public final void rule__Method__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1598:1: ( rule__Method__Group_3__0__Impl rule__Method__Group_3__1 )
            // InternalDSL.g:1599:2: rule__Method__Group_3__0__Impl rule__Method__Group_3__1
            {
            pushFollow(FOLLOW_16);
            rule__Method__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:1606:1: rule__Method__Group_3__0__Impl : ( ( rule__Method__ArgsAssignment_3_0 ) ) ;
    public final void rule__Method__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1610:1: ( ( ( rule__Method__ArgsAssignment_3_0 ) ) )
            // InternalDSL.g:1611:1: ( ( rule__Method__ArgsAssignment_3_0 ) )
            {
            // InternalDSL.g:1611:1: ( ( rule__Method__ArgsAssignment_3_0 ) )
            // InternalDSL.g:1612:2: ( rule__Method__ArgsAssignment_3_0 )
            {
             before(grammarAccess.getMethodAccess().getArgsAssignment_3_0()); 
            // InternalDSL.g:1613:2: ( rule__Method__ArgsAssignment_3_0 )
            // InternalDSL.g:1613:3: rule__Method__ArgsAssignment_3_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:1621:1: rule__Method__Group_3__1 : rule__Method__Group_3__1__Impl ;
    public final void rule__Method__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1625:1: ( rule__Method__Group_3__1__Impl )
            // InternalDSL.g:1626:2: rule__Method__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:1632:1: rule__Method__Group_3__1__Impl : ( ( rule__Method__Group_3_1__0 )* ) ;
    public final void rule__Method__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1636:1: ( ( ( rule__Method__Group_3_1__0 )* ) )
            // InternalDSL.g:1637:1: ( ( rule__Method__Group_3_1__0 )* )
            {
            // InternalDSL.g:1637:1: ( ( rule__Method__Group_3_1__0 )* )
            // InternalDSL.g:1638:2: ( rule__Method__Group_3_1__0 )*
            {
             before(grammarAccess.getMethodAccess().getGroup_3_1()); 
            // InternalDSL.g:1639:2: ( rule__Method__Group_3_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==20) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDSL.g:1639:3: rule__Method__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_17);
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
    // InternalDSL.g:1648:1: rule__Method__Group_3_1__0 : rule__Method__Group_3_1__0__Impl rule__Method__Group_3_1__1 ;
    public final void rule__Method__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1652:1: ( rule__Method__Group_3_1__0__Impl rule__Method__Group_3_1__1 )
            // InternalDSL.g:1653:2: rule__Method__Group_3_1__0__Impl rule__Method__Group_3_1__1
            {
            pushFollow(FOLLOW_9);
            rule__Method__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:1660:1: rule__Method__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Method__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1664:1: ( ( ',' ) )
            // InternalDSL.g:1665:1: ( ',' )
            {
            // InternalDSL.g:1665:1: ( ',' )
            // InternalDSL.g:1666:2: ','
            {
             before(grammarAccess.getMethodAccess().getCommaKeyword_3_1_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalDSL.g:1675:1: rule__Method__Group_3_1__1 : rule__Method__Group_3_1__1__Impl ;
    public final void rule__Method__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1679:1: ( rule__Method__Group_3_1__1__Impl )
            // InternalDSL.g:1680:2: rule__Method__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:1686:1: rule__Method__Group_3_1__1__Impl : ( ( rule__Method__ArgsAssignment_3_1_1 ) ) ;
    public final void rule__Method__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1690:1: ( ( ( rule__Method__ArgsAssignment_3_1_1 ) ) )
            // InternalDSL.g:1691:1: ( ( rule__Method__ArgsAssignment_3_1_1 ) )
            {
            // InternalDSL.g:1691:1: ( ( rule__Method__ArgsAssignment_3_1_1 ) )
            // InternalDSL.g:1692:2: ( rule__Method__ArgsAssignment_3_1_1 )
            {
             before(grammarAccess.getMethodAccess().getArgsAssignment_3_1_1()); 
            // InternalDSL.g:1693:2: ( rule__Method__ArgsAssignment_3_1_1 )
            // InternalDSL.g:1693:3: rule__Method__ArgsAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:1702:1: rule__PortTypeElement__Group__0 : rule__PortTypeElement__Group__0__Impl rule__PortTypeElement__Group__1 ;
    public final void rule__PortTypeElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1706:1: ( rule__PortTypeElement__Group__0__Impl rule__PortTypeElement__Group__1 )
            // InternalDSL.g:1707:2: rule__PortTypeElement__Group__0__Impl rule__PortTypeElement__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__PortTypeElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:1714:1: rule__PortTypeElement__Group__0__Impl : ( ( rule__PortTypeElement__Alternatives_0 ) ) ;
    public final void rule__PortTypeElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1718:1: ( ( ( rule__PortTypeElement__Alternatives_0 ) ) )
            // InternalDSL.g:1719:1: ( ( rule__PortTypeElement__Alternatives_0 ) )
            {
            // InternalDSL.g:1719:1: ( ( rule__PortTypeElement__Alternatives_0 ) )
            // InternalDSL.g:1720:2: ( rule__PortTypeElement__Alternatives_0 )
            {
             before(grammarAccess.getPortTypeElementAccess().getAlternatives_0()); 
            // InternalDSL.g:1721:2: ( rule__PortTypeElement__Alternatives_0 )
            // InternalDSL.g:1721:3: rule__PortTypeElement__Alternatives_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:1729:1: rule__PortTypeElement__Group__1 : rule__PortTypeElement__Group__1__Impl ;
    public final void rule__PortTypeElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1733:1: ( rule__PortTypeElement__Group__1__Impl )
            // InternalDSL.g:1734:2: rule__PortTypeElement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:1740:1: rule__PortTypeElement__Group__1__Impl : ( ';' ) ;
    public final void rule__PortTypeElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1744:1: ( ( ';' ) )
            // InternalDSL.g:1745:1: ( ';' )
            {
            // InternalDSL.g:1745:1: ( ';' )
            // InternalDSL.g:1746:2: ';'
            {
             before(grammarAccess.getPortTypeElementAccess().getSemicolonKeyword_1()); 
            match(input,14,FOLLOW_2); 
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
    // InternalDSL.g:1756:1: rule__ComponentType__Group__0 : rule__ComponentType__Group__0__Impl rule__ComponentType__Group__1 ;
    public final void rule__ComponentType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1760:1: ( rule__ComponentType__Group__0__Impl rule__ComponentType__Group__1 )
            // InternalDSL.g:1761:2: rule__ComponentType__Group__0__Impl rule__ComponentType__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__ComponentType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:1768:1: rule__ComponentType__Group__0__Impl : ( () ) ;
    public final void rule__ComponentType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1772:1: ( ( () ) )
            // InternalDSL.g:1773:1: ( () )
            {
            // InternalDSL.g:1773:1: ( () )
            // InternalDSL.g:1774:2: ()
            {
             before(grammarAccess.getComponentTypeAccess().getComponentTypeAction_0()); 
            // InternalDSL.g:1775:2: ()
            // InternalDSL.g:1775:3: 
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
    // InternalDSL.g:1783:1: rule__ComponentType__Group__1 : rule__ComponentType__Group__1__Impl rule__ComponentType__Group__2 ;
    public final void rule__ComponentType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1787:1: ( rule__ComponentType__Group__1__Impl rule__ComponentType__Group__2 )
            // InternalDSL.g:1788:2: rule__ComponentType__Group__1__Impl rule__ComponentType__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__ComponentType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:1795:1: rule__ComponentType__Group__1__Impl : ( 'ComponentType' ) ;
    public final void rule__ComponentType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1799:1: ( ( 'ComponentType' ) )
            // InternalDSL.g:1800:1: ( 'ComponentType' )
            {
            // InternalDSL.g:1800:1: ( 'ComponentType' )
            // InternalDSL.g:1801:2: 'ComponentType'
            {
             before(grammarAccess.getComponentTypeAccess().getComponentTypeKeyword_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalDSL.g:1810:1: rule__ComponentType__Group__2 : rule__ComponentType__Group__2__Impl rule__ComponentType__Group__3 ;
    public final void rule__ComponentType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1814:1: ( rule__ComponentType__Group__2__Impl rule__ComponentType__Group__3 )
            // InternalDSL.g:1815:2: rule__ComponentType__Group__2__Impl rule__ComponentType__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__ComponentType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:1822:1: rule__ComponentType__Group__2__Impl : ( ( rule__ComponentType__NameAssignment_2 ) ) ;
    public final void rule__ComponentType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1826:1: ( ( ( rule__ComponentType__NameAssignment_2 ) ) )
            // InternalDSL.g:1827:1: ( ( rule__ComponentType__NameAssignment_2 ) )
            {
            // InternalDSL.g:1827:1: ( ( rule__ComponentType__NameAssignment_2 ) )
            // InternalDSL.g:1828:2: ( rule__ComponentType__NameAssignment_2 )
            {
             before(grammarAccess.getComponentTypeAccess().getNameAssignment_2()); 
            // InternalDSL.g:1829:2: ( rule__ComponentType__NameAssignment_2 )
            // InternalDSL.g:1829:3: rule__ComponentType__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:1837:1: rule__ComponentType__Group__3 : rule__ComponentType__Group__3__Impl ;
    public final void rule__ComponentType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1841:1: ( rule__ComponentType__Group__3__Impl )
            // InternalDSL.g:1842:2: rule__ComponentType__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:1848:1: rule__ComponentType__Group__3__Impl : ( ';' ) ;
    public final void rule__ComponentType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1852:1: ( ( ';' ) )
            // InternalDSL.g:1853:1: ( ';' )
            {
            // InternalDSL.g:1853:1: ( ';' )
            // InternalDSL.g:1854:2: ';'
            {
             before(grammarAccess.getComponentTypeAccess().getSemicolonKeyword_3()); 
            match(input,14,FOLLOW_2); 
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
    // InternalDSL.g:1864:1: rule__PortType__Group__0 : rule__PortType__Group__0__Impl rule__PortType__Group__1 ;
    public final void rule__PortType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1868:1: ( rule__PortType__Group__0__Impl rule__PortType__Group__1 )
            // InternalDSL.g:1869:2: rule__PortType__Group__0__Impl rule__PortType__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__PortType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:1876:1: rule__PortType__Group__0__Impl : ( () ) ;
    public final void rule__PortType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1880:1: ( ( () ) )
            // InternalDSL.g:1881:1: ( () )
            {
            // InternalDSL.g:1881:1: ( () )
            // InternalDSL.g:1882:2: ()
            {
             before(grammarAccess.getPortTypeAccess().getPortTypeAction_0()); 
            // InternalDSL.g:1883:2: ()
            // InternalDSL.g:1883:3: 
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
    // InternalDSL.g:1891:1: rule__PortType__Group__1 : rule__PortType__Group__1__Impl rule__PortType__Group__2 ;
    public final void rule__PortType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1895:1: ( rule__PortType__Group__1__Impl rule__PortType__Group__2 )
            // InternalDSL.g:1896:2: rule__PortType__Group__1__Impl rule__PortType__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__PortType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:1903:1: rule__PortType__Group__1__Impl : ( 'PortType' ) ;
    public final void rule__PortType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1907:1: ( ( 'PortType' ) )
            // InternalDSL.g:1908:1: ( 'PortType' )
            {
            // InternalDSL.g:1908:1: ( 'PortType' )
            // InternalDSL.g:1909:2: 'PortType'
            {
             before(grammarAccess.getPortTypeAccess().getPortTypeKeyword_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalDSL.g:1918:1: rule__PortType__Group__2 : rule__PortType__Group__2__Impl rule__PortType__Group__3 ;
    public final void rule__PortType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1922:1: ( rule__PortType__Group__2__Impl rule__PortType__Group__3 )
            // InternalDSL.g:1923:2: rule__PortType__Group__2__Impl rule__PortType__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__PortType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:1930:1: rule__PortType__Group__2__Impl : ( ( rule__PortType__NameAssignment_2 ) ) ;
    public final void rule__PortType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1934:1: ( ( ( rule__PortType__NameAssignment_2 ) ) )
            // InternalDSL.g:1935:1: ( ( rule__PortType__NameAssignment_2 ) )
            {
            // InternalDSL.g:1935:1: ( ( rule__PortType__NameAssignment_2 ) )
            // InternalDSL.g:1936:2: ( rule__PortType__NameAssignment_2 )
            {
             before(grammarAccess.getPortTypeAccess().getNameAssignment_2()); 
            // InternalDSL.g:1937:2: ( rule__PortType__NameAssignment_2 )
            // InternalDSL.g:1937:3: rule__PortType__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:1945:1: rule__PortType__Group__3 : rule__PortType__Group__3__Impl rule__PortType__Group__4 ;
    public final void rule__PortType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1949:1: ( rule__PortType__Group__3__Impl rule__PortType__Group__4 )
            // InternalDSL.g:1950:2: rule__PortType__Group__3__Impl rule__PortType__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__PortType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:1957:1: rule__PortType__Group__3__Impl : ( '{' ) ;
    public final void rule__PortType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1961:1: ( ( '{' ) )
            // InternalDSL.g:1962:1: ( '{' )
            {
            // InternalDSL.g:1962:1: ( '{' )
            // InternalDSL.g:1963:2: '{'
            {
             before(grammarAccess.getPortTypeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
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
    // InternalDSL.g:1972:1: rule__PortType__Group__4 : rule__PortType__Group__4__Impl rule__PortType__Group__5 ;
    public final void rule__PortType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1976:1: ( rule__PortType__Group__4__Impl rule__PortType__Group__5 )
            // InternalDSL.g:1977:2: rule__PortType__Group__4__Impl rule__PortType__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__PortType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:1984:1: rule__PortType__Group__4__Impl : ( ( rule__PortType__ElementsAssignment_4 )* ) ;
    public final void rule__PortType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1988:1: ( ( ( rule__PortType__ElementsAssignment_4 )* ) )
            // InternalDSL.g:1989:1: ( ( rule__PortType__ElementsAssignment_4 )* )
            {
            // InternalDSL.g:1989:1: ( ( rule__PortType__ElementsAssignment_4 )* )
            // InternalDSL.g:1990:2: ( rule__PortType__ElementsAssignment_4 )*
            {
             before(grammarAccess.getPortTypeAccess().getElementsAssignment_4()); 
            // InternalDSL.g:1991:2: ( rule__PortType__ElementsAssignment_4 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_ID)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDSL.g:1991:3: rule__PortType__ElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_21);
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
    // InternalDSL.g:1999:1: rule__PortType__Group__5 : rule__PortType__Group__5__Impl ;
    public final void rule__PortType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2003:1: ( rule__PortType__Group__5__Impl )
            // InternalDSL.g:2004:2: rule__PortType__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:2010:1: rule__PortType__Group__5__Impl : ( '}' ) ;
    public final void rule__PortType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2014:1: ( ( '}' ) )
            // InternalDSL.g:2015:1: ( '}' )
            {
            // InternalDSL.g:2015:1: ( '}' )
            // InternalDSL.g:2016:2: '}'
            {
             before(grammarAccess.getPortTypeAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
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
    // InternalDSL.g:2026:1: rule__RoleModel__Group__0 : rule__RoleModel__Group__0__Impl rule__RoleModel__Group__1 ;
    public final void rule__RoleModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2030:1: ( rule__RoleModel__Group__0__Impl rule__RoleModel__Group__1 )
            // InternalDSL.g:2031:2: rule__RoleModel__Group__0__Impl rule__RoleModel__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__RoleModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:2038:1: rule__RoleModel__Group__0__Impl : ( () ) ;
    public final void rule__RoleModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2042:1: ( ( () ) )
            // InternalDSL.g:2043:1: ( () )
            {
            // InternalDSL.g:2043:1: ( () )
            // InternalDSL.g:2044:2: ()
            {
             before(grammarAccess.getRoleModelAccess().getRoleModelAction_0()); 
            // InternalDSL.g:2045:2: ()
            // InternalDSL.g:2045:3: 
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
    // InternalDSL.g:2053:1: rule__RoleModel__Group__1 : rule__RoleModel__Group__1__Impl rule__RoleModel__Group__2 ;
    public final void rule__RoleModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2057:1: ( rule__RoleModel__Group__1__Impl rule__RoleModel__Group__2 )
            // InternalDSL.g:2058:2: rule__RoleModel__Group__1__Impl rule__RoleModel__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__RoleModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:2065:1: rule__RoleModel__Group__1__Impl : ( 'RoleModel' ) ;
    public final void rule__RoleModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2069:1: ( ( 'RoleModel' ) )
            // InternalDSL.g:2070:1: ( 'RoleModel' )
            {
            // InternalDSL.g:2070:1: ( 'RoleModel' )
            // InternalDSL.g:2071:2: 'RoleModel'
            {
             before(grammarAccess.getRoleModelAccess().getRoleModelKeyword_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalDSL.g:2080:1: rule__RoleModel__Group__2 : rule__RoleModel__Group__2__Impl rule__RoleModel__Group__3 ;
    public final void rule__RoleModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2084:1: ( rule__RoleModel__Group__2__Impl rule__RoleModel__Group__3 )
            // InternalDSL.g:2085:2: rule__RoleModel__Group__2__Impl rule__RoleModel__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__RoleModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:2092:1: rule__RoleModel__Group__2__Impl : ( ( rule__RoleModel__NameAssignment_2 ) ) ;
    public final void rule__RoleModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2096:1: ( ( ( rule__RoleModel__NameAssignment_2 ) ) )
            // InternalDSL.g:2097:1: ( ( rule__RoleModel__NameAssignment_2 ) )
            {
            // InternalDSL.g:2097:1: ( ( rule__RoleModel__NameAssignment_2 ) )
            // InternalDSL.g:2098:2: ( rule__RoleModel__NameAssignment_2 )
            {
             before(grammarAccess.getRoleModelAccess().getNameAssignment_2()); 
            // InternalDSL.g:2099:2: ( rule__RoleModel__NameAssignment_2 )
            // InternalDSL.g:2099:3: rule__RoleModel__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:2107:1: rule__RoleModel__Group__3 : rule__RoleModel__Group__3__Impl rule__RoleModel__Group__4 ;
    public final void rule__RoleModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2111:1: ( rule__RoleModel__Group__3__Impl rule__RoleModel__Group__4 )
            // InternalDSL.g:2112:2: rule__RoleModel__Group__3__Impl rule__RoleModel__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__RoleModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:2119:1: rule__RoleModel__Group__3__Impl : ( ( rule__RoleModel__Group_3__0 )? ) ;
    public final void rule__RoleModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2123:1: ( ( ( rule__RoleModel__Group_3__0 )? ) )
            // InternalDSL.g:2124:1: ( ( rule__RoleModel__Group_3__0 )? )
            {
            // InternalDSL.g:2124:1: ( ( rule__RoleModel__Group_3__0 )? )
            // InternalDSL.g:2125:2: ( rule__RoleModel__Group_3__0 )?
            {
             before(grammarAccess.getRoleModelAccess().getGroup_3()); 
            // InternalDSL.g:2126:2: ( rule__RoleModel__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDSL.g:2126:3: rule__RoleModel__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalDSL.g:2134:1: rule__RoleModel__Group__4 : rule__RoleModel__Group__4__Impl rule__RoleModel__Group__5 ;
    public final void rule__RoleModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2138:1: ( rule__RoleModel__Group__4__Impl rule__RoleModel__Group__5 )
            // InternalDSL.g:2139:2: rule__RoleModel__Group__4__Impl rule__RoleModel__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__RoleModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:2146:1: rule__RoleModel__Group__4__Impl : ( '{' ) ;
    public final void rule__RoleModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2150:1: ( ( '{' ) )
            // InternalDSL.g:2151:1: ( '{' )
            {
            // InternalDSL.g:2151:1: ( '{' )
            // InternalDSL.g:2152:2: '{'
            {
             before(grammarAccess.getRoleModelAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,12,FOLLOW_2); 
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
    // InternalDSL.g:2161:1: rule__RoleModel__Group__5 : rule__RoleModel__Group__5__Impl rule__RoleModel__Group__6 ;
    public final void rule__RoleModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2165:1: ( rule__RoleModel__Group__5__Impl rule__RoleModel__Group__6 )
            // InternalDSL.g:2166:2: rule__RoleModel__Group__5__Impl rule__RoleModel__Group__6
            {
            pushFollow(FOLLOW_24);
            rule__RoleModel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:2173:1: rule__RoleModel__Group__5__Impl : ( ( rule__RoleModel__InitializationAssignment_5 )* ) ;
    public final void rule__RoleModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2177:1: ( ( ( rule__RoleModel__InitializationAssignment_5 )* ) )
            // InternalDSL.g:2178:1: ( ( rule__RoleModel__InitializationAssignment_5 )* )
            {
            // InternalDSL.g:2178:1: ( ( rule__RoleModel__InitializationAssignment_5 )* )
            // InternalDSL.g:2179:2: ( rule__RoleModel__InitializationAssignment_5 )*
            {
             before(grammarAccess.getRoleModelAccess().getInitializationAssignment_5()); 
            // InternalDSL.g:2180:2: ( rule__RoleModel__InitializationAssignment_5 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==24) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDSL.g:2180:3: rule__RoleModel__InitializationAssignment_5
            	    {
            	    pushFollow(FOLLOW_25);
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
    // InternalDSL.g:2188:1: rule__RoleModel__Group__6 : rule__RoleModel__Group__6__Impl ;
    public final void rule__RoleModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2192:1: ( rule__RoleModel__Group__6__Impl )
            // InternalDSL.g:2193:2: rule__RoleModel__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:2199:1: rule__RoleModel__Group__6__Impl : ( '}' ) ;
    public final void rule__RoleModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2203:1: ( ( '}' ) )
            // InternalDSL.g:2204:1: ( '}' )
            {
            // InternalDSL.g:2204:1: ( '}' )
            // InternalDSL.g:2205:2: '}'
            {
             before(grammarAccess.getRoleModelAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
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
    // InternalDSL.g:2215:1: rule__RoleModel__Group_3__0 : rule__RoleModel__Group_3__0__Impl rule__RoleModel__Group_3__1 ;
    public final void rule__RoleModel__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2219:1: ( rule__RoleModel__Group_3__0__Impl rule__RoleModel__Group_3__1 )
            // InternalDSL.g:2220:2: rule__RoleModel__Group_3__0__Impl rule__RoleModel__Group_3__1
            {
            pushFollow(FOLLOW_9);
            rule__RoleModel__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:2227:1: rule__RoleModel__Group_3__0__Impl : ( '(' ) ;
    public final void rule__RoleModel__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2231:1: ( ( '(' ) )
            // InternalDSL.g:2232:1: ( '(' )
            {
            // InternalDSL.g:2232:1: ( '(' )
            // InternalDSL.g:2233:2: '('
            {
             before(grammarAccess.getRoleModelAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalDSL.g:2242:1: rule__RoleModel__Group_3__1 : rule__RoleModel__Group_3__1__Impl rule__RoleModel__Group_3__2 ;
    public final void rule__RoleModel__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2246:1: ( rule__RoleModel__Group_3__1__Impl rule__RoleModel__Group_3__2 )
            // InternalDSL.g:2247:2: rule__RoleModel__Group_3__1__Impl rule__RoleModel__Group_3__2
            {
            pushFollow(FOLLOW_26);
            rule__RoleModel__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:2254:1: rule__RoleModel__Group_3__1__Impl : ( ( rule__RoleModel__SlotsAssignment_3_1 ) ) ;
    public final void rule__RoleModel__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2258:1: ( ( ( rule__RoleModel__SlotsAssignment_3_1 ) ) )
            // InternalDSL.g:2259:1: ( ( rule__RoleModel__SlotsAssignment_3_1 ) )
            {
            // InternalDSL.g:2259:1: ( ( rule__RoleModel__SlotsAssignment_3_1 ) )
            // InternalDSL.g:2260:2: ( rule__RoleModel__SlotsAssignment_3_1 )
            {
             before(grammarAccess.getRoleModelAccess().getSlotsAssignment_3_1()); 
            // InternalDSL.g:2261:2: ( rule__RoleModel__SlotsAssignment_3_1 )
            // InternalDSL.g:2261:3: rule__RoleModel__SlotsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:2269:1: rule__RoleModel__Group_3__2 : rule__RoleModel__Group_3__2__Impl rule__RoleModel__Group_3__3 ;
    public final void rule__RoleModel__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2273:1: ( rule__RoleModel__Group_3__2__Impl rule__RoleModel__Group_3__3 )
            // InternalDSL.g:2274:2: rule__RoleModel__Group_3__2__Impl rule__RoleModel__Group_3__3
            {
            pushFollow(FOLLOW_26);
            rule__RoleModel__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:2281:1: rule__RoleModel__Group_3__2__Impl : ( ( rule__RoleModel__Group_3_2__0 )* ) ;
    public final void rule__RoleModel__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2285:1: ( ( ( rule__RoleModel__Group_3_2__0 )* ) )
            // InternalDSL.g:2286:1: ( ( rule__RoleModel__Group_3_2__0 )* )
            {
            // InternalDSL.g:2286:1: ( ( rule__RoleModel__Group_3_2__0 )* )
            // InternalDSL.g:2287:2: ( rule__RoleModel__Group_3_2__0 )*
            {
             before(grammarAccess.getRoleModelAccess().getGroup_3_2()); 
            // InternalDSL.g:2288:2: ( rule__RoleModel__Group_3_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==20) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDSL.g:2288:3: rule__RoleModel__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_17);
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
    // InternalDSL.g:2296:1: rule__RoleModel__Group_3__3 : rule__RoleModel__Group_3__3__Impl ;
    public final void rule__RoleModel__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2300:1: ( rule__RoleModel__Group_3__3__Impl )
            // InternalDSL.g:2301:2: rule__RoleModel__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:2307:1: rule__RoleModel__Group_3__3__Impl : ( ')' ) ;
    public final void rule__RoleModel__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2311:1: ( ( ')' ) )
            // InternalDSL.g:2312:1: ( ')' )
            {
            // InternalDSL.g:2312:1: ( ')' )
            // InternalDSL.g:2313:2: ')'
            {
             before(grammarAccess.getRoleModelAccess().getRightParenthesisKeyword_3_3()); 
            match(input,19,FOLLOW_2); 
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
    // InternalDSL.g:2323:1: rule__RoleModel__Group_3_2__0 : rule__RoleModel__Group_3_2__0__Impl rule__RoleModel__Group_3_2__1 ;
    public final void rule__RoleModel__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2327:1: ( rule__RoleModel__Group_3_2__0__Impl rule__RoleModel__Group_3_2__1 )
            // InternalDSL.g:2328:2: rule__RoleModel__Group_3_2__0__Impl rule__RoleModel__Group_3_2__1
            {
            pushFollow(FOLLOW_9);
            rule__RoleModel__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:2335:1: rule__RoleModel__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__RoleModel__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2339:1: ( ( ',' ) )
            // InternalDSL.g:2340:1: ( ',' )
            {
            // InternalDSL.g:2340:1: ( ',' )
            // InternalDSL.g:2341:2: ','
            {
             before(grammarAccess.getRoleModelAccess().getCommaKeyword_3_2_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalDSL.g:2350:1: rule__RoleModel__Group_3_2__1 : rule__RoleModel__Group_3_2__1__Impl ;
    public final void rule__RoleModel__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2354:1: ( rule__RoleModel__Group_3_2__1__Impl )
            // InternalDSL.g:2355:2: rule__RoleModel__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:2361:1: rule__RoleModel__Group_3_2__1__Impl : ( ( rule__RoleModel__SlotsAssignment_3_2_1 ) ) ;
    public final void rule__RoleModel__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2365:1: ( ( ( rule__RoleModel__SlotsAssignment_3_2_1 ) ) )
            // InternalDSL.g:2366:1: ( ( rule__RoleModel__SlotsAssignment_3_2_1 ) )
            {
            // InternalDSL.g:2366:1: ( ( rule__RoleModel__SlotsAssignment_3_2_1 ) )
            // InternalDSL.g:2367:2: ( rule__RoleModel__SlotsAssignment_3_2_1 )
            {
             before(grammarAccess.getRoleModelAccess().getSlotsAssignment_3_2_1()); 
            // InternalDSL.g:2368:2: ( rule__RoleModel__SlotsAssignment_3_2_1 )
            // InternalDSL.g:2368:3: rule__RoleModel__SlotsAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:2377:1: rule__RoleModelSlot__Group__0 : rule__RoleModelSlot__Group__0__Impl rule__RoleModelSlot__Group__1 ;
    public final void rule__RoleModelSlot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2381:1: ( rule__RoleModelSlot__Group__0__Impl rule__RoleModelSlot__Group__1 )
            // InternalDSL.g:2382:2: rule__RoleModelSlot__Group__0__Impl rule__RoleModelSlot__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__RoleModelSlot__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:2389:1: rule__RoleModelSlot__Group__0__Impl : ( () ) ;
    public final void rule__RoleModelSlot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2393:1: ( ( () ) )
            // InternalDSL.g:2394:1: ( () )
            {
            // InternalDSL.g:2394:1: ( () )
            // InternalDSL.g:2395:2: ()
            {
             before(grammarAccess.getRoleModelSlotAccess().getRoleModelSlotAction_0()); 
            // InternalDSL.g:2396:2: ()
            // InternalDSL.g:2396:3: 
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
    // InternalDSL.g:2404:1: rule__RoleModelSlot__Group__1 : rule__RoleModelSlot__Group__1__Impl rule__RoleModelSlot__Group__2 ;
    public final void rule__RoleModelSlot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2408:1: ( rule__RoleModelSlot__Group__1__Impl rule__RoleModelSlot__Group__2 )
            // InternalDSL.g:2409:2: rule__RoleModelSlot__Group__1__Impl rule__RoleModelSlot__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__RoleModelSlot__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:2416:1: rule__RoleModelSlot__Group__1__Impl : ( ( rule__RoleModelSlot__TypeAssignment_1 ) ) ;
    public final void rule__RoleModelSlot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2420:1: ( ( ( rule__RoleModelSlot__TypeAssignment_1 ) ) )
            // InternalDSL.g:2421:1: ( ( rule__RoleModelSlot__TypeAssignment_1 ) )
            {
            // InternalDSL.g:2421:1: ( ( rule__RoleModelSlot__TypeAssignment_1 ) )
            // InternalDSL.g:2422:2: ( rule__RoleModelSlot__TypeAssignment_1 )
            {
             before(grammarAccess.getRoleModelSlotAccess().getTypeAssignment_1()); 
            // InternalDSL.g:2423:2: ( rule__RoleModelSlot__TypeAssignment_1 )
            // InternalDSL.g:2423:3: rule__RoleModelSlot__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:2431:1: rule__RoleModelSlot__Group__2 : rule__RoleModelSlot__Group__2__Impl ;
    public final void rule__RoleModelSlot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2435:1: ( rule__RoleModelSlot__Group__2__Impl )
            // InternalDSL.g:2436:2: rule__RoleModelSlot__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:2442:1: rule__RoleModelSlot__Group__2__Impl : ( ( rule__RoleModelSlot__NameAssignment_2 ) ) ;
    public final void rule__RoleModelSlot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2446:1: ( ( ( rule__RoleModelSlot__NameAssignment_2 ) ) )
            // InternalDSL.g:2447:1: ( ( rule__RoleModelSlot__NameAssignment_2 ) )
            {
            // InternalDSL.g:2447:1: ( ( rule__RoleModelSlot__NameAssignment_2 ) )
            // InternalDSL.g:2448:2: ( rule__RoleModelSlot__NameAssignment_2 )
            {
             before(grammarAccess.getRoleModelSlotAccess().getNameAssignment_2()); 
            // InternalDSL.g:2449:2: ( rule__RoleModelSlot__NameAssignment_2 )
            // InternalDSL.g:2449:3: rule__RoleModelSlot__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:2458:1: rule__BindOperator__Group__0 : rule__BindOperator__Group__0__Impl rule__BindOperator__Group__1 ;
    public final void rule__BindOperator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2462:1: ( rule__BindOperator__Group__0__Impl rule__BindOperator__Group__1 )
            // InternalDSL.g:2463:2: rule__BindOperator__Group__0__Impl rule__BindOperator__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__BindOperator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:2470:1: rule__BindOperator__Group__0__Impl : ( () ) ;
    public final void rule__BindOperator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2474:1: ( ( () ) )
            // InternalDSL.g:2475:1: ( () )
            {
            // InternalDSL.g:2475:1: ( () )
            // InternalDSL.g:2476:2: ()
            {
             before(grammarAccess.getBindOperatorAccess().getBindOperatorAction_0()); 
            // InternalDSL.g:2477:2: ()
            // InternalDSL.g:2477:3: 
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
    // InternalDSL.g:2485:1: rule__BindOperator__Group__1 : rule__BindOperator__Group__1__Impl rule__BindOperator__Group__2 ;
    public final void rule__BindOperator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2489:1: ( rule__BindOperator__Group__1__Impl rule__BindOperator__Group__2 )
            // InternalDSL.g:2490:2: rule__BindOperator__Group__1__Impl rule__BindOperator__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__BindOperator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:2497:1: rule__BindOperator__Group__1__Impl : ( 'bind' ) ;
    public final void rule__BindOperator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2501:1: ( ( 'bind' ) )
            // InternalDSL.g:2502:1: ( 'bind' )
            {
            // InternalDSL.g:2502:1: ( 'bind' )
            // InternalDSL.g:2503:2: 'bind'
            {
             before(grammarAccess.getBindOperatorAccess().getBindKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalDSL.g:2512:1: rule__BindOperator__Group__2 : rule__BindOperator__Group__2__Impl rule__BindOperator__Group__3 ;
    public final void rule__BindOperator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2516:1: ( rule__BindOperator__Group__2__Impl rule__BindOperator__Group__3 )
            // InternalDSL.g:2517:2: rule__BindOperator__Group__2__Impl rule__BindOperator__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__BindOperator__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:2524:1: rule__BindOperator__Group__2__Impl : ( 'role' ) ;
    public final void rule__BindOperator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2528:1: ( ( 'role' ) )
            // InternalDSL.g:2529:1: ( 'role' )
            {
            // InternalDSL.g:2529:1: ( 'role' )
            // InternalDSL.g:2530:2: 'role'
            {
             before(grammarAccess.getBindOperatorAccess().getRoleKeyword_2()); 
            match(input,25,FOLLOW_2); 
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
    // InternalDSL.g:2539:1: rule__BindOperator__Group__3 : rule__BindOperator__Group__3__Impl rule__BindOperator__Group__4 ;
    public final void rule__BindOperator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2543:1: ( rule__BindOperator__Group__3__Impl rule__BindOperator__Group__4 )
            // InternalDSL.g:2544:2: rule__BindOperator__Group__3__Impl rule__BindOperator__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__BindOperator__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:2551:1: rule__BindOperator__Group__3__Impl : ( ( rule__BindOperator__ToAssignment_3 ) ) ;
    public final void rule__BindOperator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2555:1: ( ( ( rule__BindOperator__ToAssignment_3 ) ) )
            // InternalDSL.g:2556:1: ( ( rule__BindOperator__ToAssignment_3 ) )
            {
            // InternalDSL.g:2556:1: ( ( rule__BindOperator__ToAssignment_3 ) )
            // InternalDSL.g:2557:2: ( rule__BindOperator__ToAssignment_3 )
            {
             before(grammarAccess.getBindOperatorAccess().getToAssignment_3()); 
            // InternalDSL.g:2558:2: ( rule__BindOperator__ToAssignment_3 )
            // InternalDSL.g:2558:3: rule__BindOperator__ToAssignment_3
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:2566:1: rule__BindOperator__Group__4 : rule__BindOperator__Group__4__Impl rule__BindOperator__Group__5 ;
    public final void rule__BindOperator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2570:1: ( rule__BindOperator__Group__4__Impl rule__BindOperator__Group__5 )
            // InternalDSL.g:2571:2: rule__BindOperator__Group__4__Impl rule__BindOperator__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__BindOperator__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:2578:1: rule__BindOperator__Group__4__Impl : ( 'to' ) ;
    public final void rule__BindOperator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2582:1: ( ( 'to' ) )
            // InternalDSL.g:2583:1: ( 'to' )
            {
            // InternalDSL.g:2583:1: ( 'to' )
            // InternalDSL.g:2584:2: 'to'
            {
             before(grammarAccess.getBindOperatorAccess().getToKeyword_4()); 
            match(input,26,FOLLOW_2); 
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
    // InternalDSL.g:2593:1: rule__BindOperator__Group__5 : rule__BindOperator__Group__5__Impl rule__BindOperator__Group__6 ;
    public final void rule__BindOperator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2597:1: ( rule__BindOperator__Group__5__Impl rule__BindOperator__Group__6 )
            // InternalDSL.g:2598:2: rule__BindOperator__Group__5__Impl rule__BindOperator__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__BindOperator__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:2605:1: rule__BindOperator__Group__5__Impl : ( ( rule__BindOperator__SlotAssignment_5 ) ) ;
    public final void rule__BindOperator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2609:1: ( ( ( rule__BindOperator__SlotAssignment_5 ) ) )
            // InternalDSL.g:2610:1: ( ( rule__BindOperator__SlotAssignment_5 ) )
            {
            // InternalDSL.g:2610:1: ( ( rule__BindOperator__SlotAssignment_5 ) )
            // InternalDSL.g:2611:2: ( rule__BindOperator__SlotAssignment_5 )
            {
             before(grammarAccess.getBindOperatorAccess().getSlotAssignment_5()); 
            // InternalDSL.g:2612:2: ( rule__BindOperator__SlotAssignment_5 )
            // InternalDSL.g:2612:3: rule__BindOperator__SlotAssignment_5
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:2620:1: rule__BindOperator__Group__6 : rule__BindOperator__Group__6__Impl ;
    public final void rule__BindOperator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2624:1: ( rule__BindOperator__Group__6__Impl )
            // InternalDSL.g:2625:2: rule__BindOperator__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:2631:1: rule__BindOperator__Group__6__Impl : ( ';' ) ;
    public final void rule__BindOperator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2635:1: ( ( ';' ) )
            // InternalDSL.g:2636:1: ( ';' )
            {
            // InternalDSL.g:2636:1: ( ';' )
            // InternalDSL.g:2637:2: ';'
            {
             before(grammarAccess.getBindOperatorAccess().getSemicolonKeyword_6()); 
            match(input,14,FOLLOW_2); 
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
    // InternalDSL.g:2647:1: rule__Architecture__Group__0 : rule__Architecture__Group__0__Impl rule__Architecture__Group__1 ;
    public final void rule__Architecture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2651:1: ( rule__Architecture__Group__0__Impl rule__Architecture__Group__1 )
            // InternalDSL.g:2652:2: rule__Architecture__Group__0__Impl rule__Architecture__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Architecture__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:2659:1: rule__Architecture__Group__0__Impl : ( 'Architecture' ) ;
    public final void rule__Architecture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2663:1: ( ( 'Architecture' ) )
            // InternalDSL.g:2664:1: ( 'Architecture' )
            {
            // InternalDSL.g:2664:1: ( 'Architecture' )
            // InternalDSL.g:2665:2: 'Architecture'
            {
             before(grammarAccess.getArchitectureAccess().getArchitectureKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalDSL.g:2674:1: rule__Architecture__Group__1 : rule__Architecture__Group__1__Impl rule__Architecture__Group__2 ;
    public final void rule__Architecture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2678:1: ( rule__Architecture__Group__1__Impl rule__Architecture__Group__2 )
            // InternalDSL.g:2679:2: rule__Architecture__Group__1__Impl rule__Architecture__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__Architecture__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:2686:1: rule__Architecture__Group__1__Impl : ( ( rule__Architecture__NameAssignment_1 ) ) ;
    public final void rule__Architecture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2690:1: ( ( ( rule__Architecture__NameAssignment_1 ) ) )
            // InternalDSL.g:2691:1: ( ( rule__Architecture__NameAssignment_1 ) )
            {
            // InternalDSL.g:2691:1: ( ( rule__Architecture__NameAssignment_1 ) )
            // InternalDSL.g:2692:2: ( rule__Architecture__NameAssignment_1 )
            {
             before(grammarAccess.getArchitectureAccess().getNameAssignment_1()); 
            // InternalDSL.g:2693:2: ( rule__Architecture__NameAssignment_1 )
            // InternalDSL.g:2693:3: rule__Architecture__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:2701:1: rule__Architecture__Group__2 : rule__Architecture__Group__2__Impl rule__Architecture__Group__3 ;
    public final void rule__Architecture__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2705:1: ( rule__Architecture__Group__2__Impl rule__Architecture__Group__3 )
            // InternalDSL.g:2706:2: rule__Architecture__Group__2__Impl rule__Architecture__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Architecture__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:2713:1: rule__Architecture__Group__2__Impl : ( '::' ) ;
    public final void rule__Architecture__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2717:1: ( ( '::' ) )
            // InternalDSL.g:2718:1: ( '::' )
            {
            // InternalDSL.g:2718:1: ( '::' )
            // InternalDSL.g:2719:2: '::'
            {
             before(grammarAccess.getArchitectureAccess().getColonColonKeyword_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalDSL.g:2728:1: rule__Architecture__Group__3 : rule__Architecture__Group__3__Impl rule__Architecture__Group__4 ;
    public final void rule__Architecture__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2732:1: ( rule__Architecture__Group__3__Impl rule__Architecture__Group__4 )
            // InternalDSL.g:2733:2: rule__Architecture__Group__3__Impl rule__Architecture__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Architecture__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:2740:1: rule__Architecture__Group__3__Impl : ( ( rule__Architecture__TypeAssignment_3 ) ) ;
    public final void rule__Architecture__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2744:1: ( ( ( rule__Architecture__TypeAssignment_3 ) ) )
            // InternalDSL.g:2745:1: ( ( rule__Architecture__TypeAssignment_3 ) )
            {
            // InternalDSL.g:2745:1: ( ( rule__Architecture__TypeAssignment_3 ) )
            // InternalDSL.g:2746:2: ( rule__Architecture__TypeAssignment_3 )
            {
             before(grammarAccess.getArchitectureAccess().getTypeAssignment_3()); 
            // InternalDSL.g:2747:2: ( rule__Architecture__TypeAssignment_3 )
            // InternalDSL.g:2747:3: rule__Architecture__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:2755:1: rule__Architecture__Group__4 : rule__Architecture__Group__4__Impl rule__Architecture__Group__5 ;
    public final void rule__Architecture__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2759:1: ( rule__Architecture__Group__4__Impl rule__Architecture__Group__5 )
            // InternalDSL.g:2760:2: rule__Architecture__Group__4__Impl rule__Architecture__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__Architecture__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:2767:1: rule__Architecture__Group__4__Impl : ( '{' ) ;
    public final void rule__Architecture__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2771:1: ( ( '{' ) )
            // InternalDSL.g:2772:1: ( '{' )
            {
            // InternalDSL.g:2772:1: ( '{' )
            // InternalDSL.g:2773:2: '{'
            {
             before(grammarAccess.getArchitectureAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,12,FOLLOW_2); 
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
    // InternalDSL.g:2782:1: rule__Architecture__Group__5 : rule__Architecture__Group__5__Impl rule__Architecture__Group__6 ;
    public final void rule__Architecture__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2786:1: ( rule__Architecture__Group__5__Impl rule__Architecture__Group__6 )
            // InternalDSL.g:2787:2: rule__Architecture__Group__5__Impl rule__Architecture__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__Architecture__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:2794:1: rule__Architecture__Group__5__Impl : ( ( rule__Architecture__TypeBindingsAssignment_5 )* ) ;
    public final void rule__Architecture__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2798:1: ( ( ( rule__Architecture__TypeBindingsAssignment_5 )* ) )
            // InternalDSL.g:2799:1: ( ( rule__Architecture__TypeBindingsAssignment_5 )* )
            {
            // InternalDSL.g:2799:1: ( ( rule__Architecture__TypeBindingsAssignment_5 )* )
            // InternalDSL.g:2800:2: ( rule__Architecture__TypeBindingsAssignment_5 )*
            {
             before(grammarAccess.getArchitectureAccess().getTypeBindingsAssignment_5()); 
            // InternalDSL.g:2801:2: ( rule__Architecture__TypeBindingsAssignment_5 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_STRING && LA18_0<=RULE_ID)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalDSL.g:2801:3: rule__Architecture__TypeBindingsAssignment_5
            	    {
            	    pushFollow(FOLLOW_21);
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
    // InternalDSL.g:2809:1: rule__Architecture__Group__6 : rule__Architecture__Group__6__Impl rule__Architecture__Group__7 ;
    public final void rule__Architecture__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2813:1: ( rule__Architecture__Group__6__Impl rule__Architecture__Group__7 )
            // InternalDSL.g:2814:2: rule__Architecture__Group__6__Impl rule__Architecture__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__Architecture__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:2821:1: rule__Architecture__Group__6__Impl : ( '}' ) ;
    public final void rule__Architecture__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2825:1: ( ( '}' ) )
            // InternalDSL.g:2826:1: ( '}' )
            {
            // InternalDSL.g:2826:1: ( '}' )
            // InternalDSL.g:2827:2: '}'
            {
             before(grammarAccess.getArchitectureAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
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
    // InternalDSL.g:2836:1: rule__Architecture__Group__7 : rule__Architecture__Group__7__Impl rule__Architecture__Group__8 ;
    public final void rule__Architecture__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2840:1: ( rule__Architecture__Group__7__Impl rule__Architecture__Group__8 )
            // InternalDSL.g:2841:2: rule__Architecture__Group__7__Impl rule__Architecture__Group__8
            {
            pushFollow(FOLLOW_31);
            rule__Architecture__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:2848:1: rule__Architecture__Group__7__Impl : ( '{' ) ;
    public final void rule__Architecture__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2852:1: ( ( '{' ) )
            // InternalDSL.g:2853:1: ( '{' )
            {
            // InternalDSL.g:2853:1: ( '{' )
            // InternalDSL.g:2854:2: '{'
            {
             before(grammarAccess.getArchitectureAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,12,FOLLOW_2); 
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
    // InternalDSL.g:2863:1: rule__Architecture__Group__8 : rule__Architecture__Group__8__Impl rule__Architecture__Group__9 ;
    public final void rule__Architecture__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2867:1: ( rule__Architecture__Group__8__Impl rule__Architecture__Group__9 )
            // InternalDSL.g:2868:2: rule__Architecture__Group__8__Impl rule__Architecture__Group__9
            {
            pushFollow(FOLLOW_31);
            rule__Architecture__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:2875:1: rule__Architecture__Group__8__Impl : ( ( rule__Architecture__ElementsAssignment_8 )* ) ;
    public final void rule__Architecture__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2879:1: ( ( ( rule__Architecture__ElementsAssignment_8 )* ) )
            // InternalDSL.g:2880:1: ( ( rule__Architecture__ElementsAssignment_8 )* )
            {
            // InternalDSL.g:2880:1: ( ( rule__Architecture__ElementsAssignment_8 )* )
            // InternalDSL.g:2881:2: ( rule__Architecture__ElementsAssignment_8 )*
            {
             before(grammarAccess.getArchitectureAccess().getElementsAssignment_8()); 
            // InternalDSL.g:2882:2: ( rule__Architecture__ElementsAssignment_8 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=29 && LA19_0<=30)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalDSL.g:2882:3: rule__Architecture__ElementsAssignment_8
            	    {
            	    pushFollow(FOLLOW_32);
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
    // InternalDSL.g:2890:1: rule__Architecture__Group__9 : rule__Architecture__Group__9__Impl ;
    public final void rule__Architecture__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2894:1: ( rule__Architecture__Group__9__Impl )
            // InternalDSL.g:2895:2: rule__Architecture__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:2901:1: rule__Architecture__Group__9__Impl : ( '}' ) ;
    public final void rule__Architecture__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2905:1: ( ( '}' ) )
            // InternalDSL.g:2906:1: ( '}' )
            {
            // InternalDSL.g:2906:1: ( '}' )
            // InternalDSL.g:2907:2: '}'
            {
             before(grammarAccess.getArchitectureAccess().getRightCurlyBracketKeyword_9()); 
            match(input,13,FOLLOW_2); 
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
    // InternalDSL.g:2917:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2921:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalDSL.g:2922:2: rule__Component__Group__0__Impl rule__Component__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Component__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:2929:1: rule__Component__Group__0__Impl : ( 'Component' ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2933:1: ( ( 'Component' ) )
            // InternalDSL.g:2934:1: ( 'Component' )
            {
            // InternalDSL.g:2934:1: ( 'Component' )
            // InternalDSL.g:2935:2: 'Component'
            {
             before(grammarAccess.getComponentAccess().getComponentKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalDSL.g:2944:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2948:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // InternalDSL.g:2949:2: rule__Component__Group__1__Impl rule__Component__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__Component__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:2956:1: rule__Component__Group__1__Impl : ( ( rule__Component__NameAssignment_1 ) ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2960:1: ( ( ( rule__Component__NameAssignment_1 ) ) )
            // InternalDSL.g:2961:1: ( ( rule__Component__NameAssignment_1 ) )
            {
            // InternalDSL.g:2961:1: ( ( rule__Component__NameAssignment_1 ) )
            // InternalDSL.g:2962:2: ( rule__Component__NameAssignment_1 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_1()); 
            // InternalDSL.g:2963:2: ( rule__Component__NameAssignment_1 )
            // InternalDSL.g:2963:3: rule__Component__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:2971:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2975:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // InternalDSL.g:2976:2: rule__Component__Group__2__Impl rule__Component__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Component__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:2983:1: rule__Component__Group__2__Impl : ( '::' ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2987:1: ( ( '::' ) )
            // InternalDSL.g:2988:1: ( '::' )
            {
            // InternalDSL.g:2988:1: ( '::' )
            // InternalDSL.g:2989:2: '::'
            {
             before(grammarAccess.getComponentAccess().getColonColonKeyword_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalDSL.g:2998:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3002:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // InternalDSL.g:3003:2: rule__Component__Group__3__Impl rule__Component__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Component__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:3010:1: rule__Component__Group__3__Impl : ( ( rule__Component__TypeAssignment_3 ) ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3014:1: ( ( ( rule__Component__TypeAssignment_3 ) ) )
            // InternalDSL.g:3015:1: ( ( rule__Component__TypeAssignment_3 ) )
            {
            // InternalDSL.g:3015:1: ( ( rule__Component__TypeAssignment_3 ) )
            // InternalDSL.g:3016:2: ( rule__Component__TypeAssignment_3 )
            {
             before(grammarAccess.getComponentAccess().getTypeAssignment_3()); 
            // InternalDSL.g:3017:2: ( rule__Component__TypeAssignment_3 )
            // InternalDSL.g:3017:3: rule__Component__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:3025:1: rule__Component__Group__4 : rule__Component__Group__4__Impl ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3029:1: ( rule__Component__Group__4__Impl )
            // InternalDSL.g:3030:2: rule__Component__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:3036:1: rule__Component__Group__4__Impl : ( ';' ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3040:1: ( ( ';' ) )
            // InternalDSL.g:3041:1: ( ';' )
            {
            // InternalDSL.g:3041:1: ( ';' )
            // InternalDSL.g:3042:2: ';'
            {
             before(grammarAccess.getComponentAccess().getSemicolonKeyword_4()); 
            match(input,14,FOLLOW_2); 
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
    // InternalDSL.g:3052:1: rule__Port__Group__0 : rule__Port__Group__0__Impl rule__Port__Group__1 ;
    public final void rule__Port__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3056:1: ( rule__Port__Group__0__Impl rule__Port__Group__1 )
            // InternalDSL.g:3057:2: rule__Port__Group__0__Impl rule__Port__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Port__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:3064:1: rule__Port__Group__0__Impl : ( 'Port' ) ;
    public final void rule__Port__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3068:1: ( ( 'Port' ) )
            // InternalDSL.g:3069:1: ( 'Port' )
            {
            // InternalDSL.g:3069:1: ( 'Port' )
            // InternalDSL.g:3070:2: 'Port'
            {
             before(grammarAccess.getPortAccess().getPortKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalDSL.g:3079:1: rule__Port__Group__1 : rule__Port__Group__1__Impl rule__Port__Group__2 ;
    public final void rule__Port__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3083:1: ( rule__Port__Group__1__Impl rule__Port__Group__2 )
            // InternalDSL.g:3084:2: rule__Port__Group__1__Impl rule__Port__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__Port__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:3091:1: rule__Port__Group__1__Impl : ( ( rule__Port__NameAssignment_1 ) ) ;
    public final void rule__Port__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3095:1: ( ( ( rule__Port__NameAssignment_1 ) ) )
            // InternalDSL.g:3096:1: ( ( rule__Port__NameAssignment_1 ) )
            {
            // InternalDSL.g:3096:1: ( ( rule__Port__NameAssignment_1 ) )
            // InternalDSL.g:3097:2: ( rule__Port__NameAssignment_1 )
            {
             before(grammarAccess.getPortAccess().getNameAssignment_1()); 
            // InternalDSL.g:3098:2: ( rule__Port__NameAssignment_1 )
            // InternalDSL.g:3098:3: rule__Port__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:3106:1: rule__Port__Group__2 : rule__Port__Group__2__Impl rule__Port__Group__3 ;
    public final void rule__Port__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3110:1: ( rule__Port__Group__2__Impl rule__Port__Group__3 )
            // InternalDSL.g:3111:2: rule__Port__Group__2__Impl rule__Port__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Port__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:3118:1: rule__Port__Group__2__Impl : ( '::' ) ;
    public final void rule__Port__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3122:1: ( ( '::' ) )
            // InternalDSL.g:3123:1: ( '::' )
            {
            // InternalDSL.g:3123:1: ( '::' )
            // InternalDSL.g:3124:2: '::'
            {
             before(grammarAccess.getPortAccess().getColonColonKeyword_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalDSL.g:3133:1: rule__Port__Group__3 : rule__Port__Group__3__Impl rule__Port__Group__4 ;
    public final void rule__Port__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3137:1: ( rule__Port__Group__3__Impl rule__Port__Group__4 )
            // InternalDSL.g:3138:2: rule__Port__Group__3__Impl rule__Port__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Port__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:3145:1: rule__Port__Group__3__Impl : ( ( rule__Port__TypeAssignment_3 ) ) ;
    public final void rule__Port__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3149:1: ( ( ( rule__Port__TypeAssignment_3 ) ) )
            // InternalDSL.g:3150:1: ( ( rule__Port__TypeAssignment_3 ) )
            {
            // InternalDSL.g:3150:1: ( ( rule__Port__TypeAssignment_3 ) )
            // InternalDSL.g:3151:2: ( rule__Port__TypeAssignment_3 )
            {
             before(grammarAccess.getPortAccess().getTypeAssignment_3()); 
            // InternalDSL.g:3152:2: ( rule__Port__TypeAssignment_3 )
            // InternalDSL.g:3152:3: rule__Port__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:3160:1: rule__Port__Group__4 : rule__Port__Group__4__Impl ;
    public final void rule__Port__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3164:1: ( rule__Port__Group__4__Impl )
            // InternalDSL.g:3165:2: rule__Port__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:3171:1: rule__Port__Group__4__Impl : ( ';' ) ;
    public final void rule__Port__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3175:1: ( ( ';' ) )
            // InternalDSL.g:3176:1: ( ';' )
            {
            // InternalDSL.g:3176:1: ( ';' )
            // InternalDSL.g:3177:2: ';'
            {
             before(grammarAccess.getPortAccess().getSemicolonKeyword_4()); 
            match(input,14,FOLLOW_2); 
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
    // InternalDSL.g:3187:1: rule__TypeBinding__Group__0 : rule__TypeBinding__Group__0__Impl rule__TypeBinding__Group__1 ;
    public final void rule__TypeBinding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3191:1: ( rule__TypeBinding__Group__0__Impl rule__TypeBinding__Group__1 )
            // InternalDSL.g:3192:2: rule__TypeBinding__Group__0__Impl rule__TypeBinding__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__TypeBinding__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:3199:1: rule__TypeBinding__Group__0__Impl : ( ( rule__TypeBinding__TypeAssignment_0 ) ) ;
    public final void rule__TypeBinding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3203:1: ( ( ( rule__TypeBinding__TypeAssignment_0 ) ) )
            // InternalDSL.g:3204:1: ( ( rule__TypeBinding__TypeAssignment_0 ) )
            {
            // InternalDSL.g:3204:1: ( ( rule__TypeBinding__TypeAssignment_0 ) )
            // InternalDSL.g:3205:2: ( rule__TypeBinding__TypeAssignment_0 )
            {
             before(grammarAccess.getTypeBindingAccess().getTypeAssignment_0()); 
            // InternalDSL.g:3206:2: ( rule__TypeBinding__TypeAssignment_0 )
            // InternalDSL.g:3206:3: rule__TypeBinding__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:3214:1: rule__TypeBinding__Group__1 : rule__TypeBinding__Group__1__Impl rule__TypeBinding__Group__2 ;
    public final void rule__TypeBinding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3218:1: ( rule__TypeBinding__Group__1__Impl rule__TypeBinding__Group__2 )
            // InternalDSL.g:3219:2: rule__TypeBinding__Group__1__Impl rule__TypeBinding__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__TypeBinding__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:3226:1: rule__TypeBinding__Group__1__Impl : ( '=' ) ;
    public final void rule__TypeBinding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3230:1: ( ( '=' ) )
            // InternalDSL.g:3231:1: ( '=' )
            {
            // InternalDSL.g:3231:1: ( '=' )
            // InternalDSL.g:3232:2: '='
            {
             before(grammarAccess.getTypeBindingAccess().getEqualsSignKeyword_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalDSL.g:3241:1: rule__TypeBinding__Group__2 : rule__TypeBinding__Group__2__Impl rule__TypeBinding__Group__3 ;
    public final void rule__TypeBinding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3245:1: ( rule__TypeBinding__Group__2__Impl rule__TypeBinding__Group__3 )
            // InternalDSL.g:3246:2: rule__TypeBinding__Group__2__Impl rule__TypeBinding__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__TypeBinding__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:3253:1: rule__TypeBinding__Group__2__Impl : ( ( rule__TypeBinding__ImplementationAssignment_2 ) ) ;
    public final void rule__TypeBinding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3257:1: ( ( ( rule__TypeBinding__ImplementationAssignment_2 ) ) )
            // InternalDSL.g:3258:1: ( ( rule__TypeBinding__ImplementationAssignment_2 ) )
            {
            // InternalDSL.g:3258:1: ( ( rule__TypeBinding__ImplementationAssignment_2 ) )
            // InternalDSL.g:3259:2: ( rule__TypeBinding__ImplementationAssignment_2 )
            {
             before(grammarAccess.getTypeBindingAccess().getImplementationAssignment_2()); 
            // InternalDSL.g:3260:2: ( rule__TypeBinding__ImplementationAssignment_2 )
            // InternalDSL.g:3260:3: rule__TypeBinding__ImplementationAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:3268:1: rule__TypeBinding__Group__3 : rule__TypeBinding__Group__3__Impl ;
    public final void rule__TypeBinding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3272:1: ( rule__TypeBinding__Group__3__Impl )
            // InternalDSL.g:3273:2: rule__TypeBinding__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:3279:1: rule__TypeBinding__Group__3__Impl : ( ';' ) ;
    public final void rule__TypeBinding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3283:1: ( ( ';' ) )
            // InternalDSL.g:3284:1: ( ';' )
            {
            // InternalDSL.g:3284:1: ( ';' )
            // InternalDSL.g:3285:2: ';'
            {
             before(grammarAccess.getTypeBindingAccess().getSemicolonKeyword_3()); 
            match(input,14,FOLLOW_2); 
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
    // InternalDSL.g:3295:1: rule__SmagsModel__ImportsAssignment_1_2 : ( ruleImport ) ;
    public final void rule__SmagsModel__ImportsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3299:1: ( ( ruleImport ) )
            // InternalDSL.g:3300:2: ( ruleImport )
            {
            // InternalDSL.g:3300:2: ( ruleImport )
            // InternalDSL.g:3301:3: ruleImport
            {
             before(grammarAccess.getSmagsModelAccess().getImportsImportParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:3310:1: rule__SmagsModel__ElementsAssignment_2 : ( ruleSmagsElement ) ;
    public final void rule__SmagsModel__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3314:1: ( ( ruleSmagsElement ) )
            // InternalDSL.g:3315:2: ( ruleSmagsElement )
            {
            // InternalDSL.g:3315:2: ( ruleSmagsElement )
            // InternalDSL.g:3316:3: ruleSmagsElement
            {
             before(grammarAccess.getSmagsModelAccess().getElementsSmagsElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:3325:1: rule__Import__ImportURIAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3329:1: ( ( RULE_STRING ) )
            // InternalDSL.g:3330:2: ( RULE_STRING )
            {
            // InternalDSL.g:3330:2: ( RULE_STRING )
            // InternalDSL.g:3331:3: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // InternalDSL.g:3340:1: rule__MetaArchitecture__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__MetaArchitecture__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3344:1: ( ( ruleEString ) )
            // InternalDSL.g:3345:2: ( ruleEString )
            {
            // InternalDSL.g:3345:2: ( ruleEString )
            // InternalDSL.g:3346:3: ruleEString
            {
             before(grammarAccess.getMetaArchitectureAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:3355:1: rule__MetaArchitecture__TypesAssignment_3 : ( ruleType ) ;
    public final void rule__MetaArchitecture__TypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3359:1: ( ( ruleType ) )
            // InternalDSL.g:3360:2: ( ruleType )
            {
            // InternalDSL.g:3360:2: ( ruleType )
            // InternalDSL.g:3361:3: ruleType
            {
             before(grammarAccess.getMetaArchitectureAccess().getTypesTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:3370:1: rule__MetaArchitecture__ElementsAssignment_6 : ( ruleMetaArchitectureElement ) ;
    public final void rule__MetaArchitecture__ElementsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3374:1: ( ( ruleMetaArchitectureElement ) )
            // InternalDSL.g:3375:2: ( ruleMetaArchitectureElement )
            {
            // InternalDSL.g:3375:2: ( ruleMetaArchitectureElement )
            // InternalDSL.g:3376:3: ruleMetaArchitectureElement
            {
             before(grammarAccess.getMetaArchitectureAccess().getElementsMetaArchitectureElementParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:3385:1: rule__ExternalType__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__ExternalType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3389:1: ( ( ruleEString ) )
            // InternalDSL.g:3390:2: ( ruleEString )
            {
            // InternalDSL.g:3390:2: ( ruleEString )
            // InternalDSL.g:3391:3: ruleEString
            {
             before(grammarAccess.getExternalTypeAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:3400:1: rule__PrimitiveType__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__PrimitiveType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3404:1: ( ( ruleEString ) )
            // InternalDSL.g:3405:2: ( ruleEString )
            {
            // InternalDSL.g:3405:2: ( ruleEString )
            // InternalDSL.g:3406:3: ruleEString
            {
             before(grammarAccess.getPrimitiveTypeAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:3415:1: rule__Variable__TypeAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__Variable__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3419:1: ( ( ( ruleEString ) ) )
            // InternalDSL.g:3420:2: ( ( ruleEString ) )
            {
            // InternalDSL.g:3420:2: ( ( ruleEString ) )
            // InternalDSL.g:3421:3: ( ruleEString )
            {
             before(grammarAccess.getVariableAccess().getTypeTypeCrossReference_0_0()); 
            // InternalDSL.g:3422:3: ( ruleEString )
            // InternalDSL.g:3423:4: ruleEString
            {
             before(grammarAccess.getVariableAccess().getTypeTypeEStringParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:3434:1: rule__Variable__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Variable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3438:1: ( ( ruleEString ) )
            // InternalDSL.g:3439:2: ( ruleEString )
            {
            // InternalDSL.g:3439:2: ( ruleEString )
            // InternalDSL.g:3440:3: ruleEString
            {
             before(grammarAccess.getVariableAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:3449:1: rule__AnonymousVariable__TypeAssignment : ( ( ruleEString ) ) ;
    public final void rule__AnonymousVariable__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3453:1: ( ( ( ruleEString ) ) )
            // InternalDSL.g:3454:2: ( ( ruleEString ) )
            {
            // InternalDSL.g:3454:2: ( ( ruleEString ) )
            // InternalDSL.g:3455:3: ( ruleEString )
            {
             before(grammarAccess.getAnonymousVariableAccess().getTypeTypeCrossReference_0()); 
            // InternalDSL.g:3456:3: ( ruleEString )
            // InternalDSL.g:3457:4: ruleEString
            {
             before(grammarAccess.getAnonymousVariableAccess().getTypeTypeEStringParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:3468:1: rule__Method__ReturnTypeAssignment_0 : ( ruleAnonymousVariable ) ;
    public final void rule__Method__ReturnTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3472:1: ( ( ruleAnonymousVariable ) )
            // InternalDSL.g:3473:2: ( ruleAnonymousVariable )
            {
            // InternalDSL.g:3473:2: ( ruleAnonymousVariable )
            // InternalDSL.g:3474:3: ruleAnonymousVariable
            {
             before(grammarAccess.getMethodAccess().getReturnTypeAnonymousVariableParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:3483:1: rule__Method__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Method__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3487:1: ( ( ruleEString ) )
            // InternalDSL.g:3488:2: ( ruleEString )
            {
            // InternalDSL.g:3488:2: ( ruleEString )
            // InternalDSL.g:3489:3: ruleEString
            {
             before(grammarAccess.getMethodAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:3498:1: rule__Method__ArgsAssignment_3_0 : ( ruleVariable ) ;
    public final void rule__Method__ArgsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3502:1: ( ( ruleVariable ) )
            // InternalDSL.g:3503:2: ( ruleVariable )
            {
            // InternalDSL.g:3503:2: ( ruleVariable )
            // InternalDSL.g:3504:3: ruleVariable
            {
             before(grammarAccess.getMethodAccess().getArgsVariableParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:3513:1: rule__Method__ArgsAssignment_3_1_1 : ( ruleVariable ) ;
    public final void rule__Method__ArgsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3517:1: ( ( ruleVariable ) )
            // InternalDSL.g:3518:2: ( ruleVariable )
            {
            // InternalDSL.g:3518:2: ( ruleVariable )
            // InternalDSL.g:3519:3: ruleVariable
            {
             before(grammarAccess.getMethodAccess().getArgsVariableParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:3528:1: rule__ComponentType__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ComponentType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3532:1: ( ( ruleEString ) )
            // InternalDSL.g:3533:2: ( ruleEString )
            {
            // InternalDSL.g:3533:2: ( ruleEString )
            // InternalDSL.g:3534:3: ruleEString
            {
             before(grammarAccess.getComponentTypeAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:3543:1: rule__PortType__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__PortType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3547:1: ( ( ruleEString ) )
            // InternalDSL.g:3548:2: ( ruleEString )
            {
            // InternalDSL.g:3548:2: ( ruleEString )
            // InternalDSL.g:3549:3: ruleEString
            {
             before(grammarAccess.getPortTypeAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:3558:1: rule__PortType__ElementsAssignment_4 : ( rulePortTypeElement ) ;
    public final void rule__PortType__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3562:1: ( ( rulePortTypeElement ) )
            // InternalDSL.g:3563:2: ( rulePortTypeElement )
            {
            // InternalDSL.g:3563:2: ( rulePortTypeElement )
            // InternalDSL.g:3564:3: rulePortTypeElement
            {
             before(grammarAccess.getPortTypeAccess().getElementsPortTypeElementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:3573:1: rule__RoleModel__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RoleModel__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3577:1: ( ( ruleEString ) )
            // InternalDSL.g:3578:2: ( ruleEString )
            {
            // InternalDSL.g:3578:2: ( ruleEString )
            // InternalDSL.g:3579:3: ruleEString
            {
             before(grammarAccess.getRoleModelAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:3588:1: rule__RoleModel__SlotsAssignment_3_1 : ( ruleRoleModelSlot ) ;
    public final void rule__RoleModel__SlotsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3592:1: ( ( ruleRoleModelSlot ) )
            // InternalDSL.g:3593:2: ( ruleRoleModelSlot )
            {
            // InternalDSL.g:3593:2: ( ruleRoleModelSlot )
            // InternalDSL.g:3594:3: ruleRoleModelSlot
            {
             before(grammarAccess.getRoleModelAccess().getSlotsRoleModelSlotParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:3603:1: rule__RoleModel__SlotsAssignment_3_2_1 : ( ruleRoleModelSlot ) ;
    public final void rule__RoleModel__SlotsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3607:1: ( ( ruleRoleModelSlot ) )
            // InternalDSL.g:3608:2: ( ruleRoleModelSlot )
            {
            // InternalDSL.g:3608:2: ( ruleRoleModelSlot )
            // InternalDSL.g:3609:3: ruleRoleModelSlot
            {
             before(grammarAccess.getRoleModelAccess().getSlotsRoleModelSlotParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:3618:1: rule__RoleModel__InitializationAssignment_5 : ( ruleCompositionOperator ) ;
    public final void rule__RoleModel__InitializationAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3622:1: ( ( ruleCompositionOperator ) )
            // InternalDSL.g:3623:2: ( ruleCompositionOperator )
            {
            // InternalDSL.g:3623:2: ( ruleCompositionOperator )
            // InternalDSL.g:3624:3: ruleCompositionOperator
            {
             before(grammarAccess.getRoleModelAccess().getInitializationCompositionOperatorParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:3633:1: rule__RoleModelSlot__TypeAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__RoleModelSlot__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3637:1: ( ( ( ruleEString ) ) )
            // InternalDSL.g:3638:2: ( ( ruleEString ) )
            {
            // InternalDSL.g:3638:2: ( ( ruleEString ) )
            // InternalDSL.g:3639:3: ( ruleEString )
            {
             before(grammarAccess.getRoleModelSlotAccess().getTypeComponentTypeCrossReference_1_0()); 
            // InternalDSL.g:3640:3: ( ruleEString )
            // InternalDSL.g:3641:4: ruleEString
            {
             before(grammarAccess.getRoleModelSlotAccess().getTypeComponentTypeEStringParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:3652:1: rule__RoleModelSlot__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RoleModelSlot__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3656:1: ( ( ruleEString ) )
            // InternalDSL.g:3657:2: ( ruleEString )
            {
            // InternalDSL.g:3657:2: ( ruleEString )
            // InternalDSL.g:3658:3: ruleEString
            {
             before(grammarAccess.getRoleModelSlotAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:3667:1: rule__BindOperator__ToAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__BindOperator__ToAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3671:1: ( ( ( ruleEString ) ) )
            // InternalDSL.g:3672:2: ( ( ruleEString ) )
            {
            // InternalDSL.g:3672:2: ( ( ruleEString ) )
            // InternalDSL.g:3673:3: ( ruleEString )
            {
             before(grammarAccess.getBindOperatorAccess().getToPortTypeCrossReference_3_0()); 
            // InternalDSL.g:3674:3: ( ruleEString )
            // InternalDSL.g:3675:4: ruleEString
            {
             before(grammarAccess.getBindOperatorAccess().getToPortTypeEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:3686:1: rule__BindOperator__SlotAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__BindOperator__SlotAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3690:1: ( ( ( ruleEString ) ) )
            // InternalDSL.g:3691:2: ( ( ruleEString ) )
            {
            // InternalDSL.g:3691:2: ( ( ruleEString ) )
            // InternalDSL.g:3692:3: ( ruleEString )
            {
             before(grammarAccess.getBindOperatorAccess().getSlotRoleModelSlotCrossReference_5_0()); 
            // InternalDSL.g:3693:3: ( ruleEString )
            // InternalDSL.g:3694:4: ruleEString
            {
             before(grammarAccess.getBindOperatorAccess().getSlotRoleModelSlotEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:3705:1: rule__Architecture__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Architecture__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3709:1: ( ( ruleEString ) )
            // InternalDSL.g:3710:2: ( ruleEString )
            {
            // InternalDSL.g:3710:2: ( ruleEString )
            // InternalDSL.g:3711:3: ruleEString
            {
             before(grammarAccess.getArchitectureAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:3720:1: rule__Architecture__TypeAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Architecture__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3724:1: ( ( ( ruleEString ) ) )
            // InternalDSL.g:3725:2: ( ( ruleEString ) )
            {
            // InternalDSL.g:3725:2: ( ( ruleEString ) )
            // InternalDSL.g:3726:3: ( ruleEString )
            {
             before(grammarAccess.getArchitectureAccess().getTypeMetaArchitectureCrossReference_3_0()); 
            // InternalDSL.g:3727:3: ( ruleEString )
            // InternalDSL.g:3728:4: ruleEString
            {
             before(grammarAccess.getArchitectureAccess().getTypeMetaArchitectureEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:3739:1: rule__Architecture__TypeBindingsAssignment_5 : ( ruleTypeBinding ) ;
    public final void rule__Architecture__TypeBindingsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3743:1: ( ( ruleTypeBinding ) )
            // InternalDSL.g:3744:2: ( ruleTypeBinding )
            {
            // InternalDSL.g:3744:2: ( ruleTypeBinding )
            // InternalDSL.g:3745:3: ruleTypeBinding
            {
             before(grammarAccess.getArchitectureAccess().getTypeBindingsTypeBindingParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:3754:1: rule__Architecture__ElementsAssignment_8 : ( ruleArchitectureElement ) ;
    public final void rule__Architecture__ElementsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3758:1: ( ( ruleArchitectureElement ) )
            // InternalDSL.g:3759:2: ( ruleArchitectureElement )
            {
            // InternalDSL.g:3759:2: ( ruleArchitectureElement )
            // InternalDSL.g:3760:3: ruleArchitectureElement
            {
             before(grammarAccess.getArchitectureAccess().getElementsArchitectureElementParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:3769:1: rule__Component__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Component__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3773:1: ( ( ruleEString ) )
            // InternalDSL.g:3774:2: ( ruleEString )
            {
            // InternalDSL.g:3774:2: ( ruleEString )
            // InternalDSL.g:3775:3: ruleEString
            {
             before(grammarAccess.getComponentAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:3784:1: rule__Component__TypeAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Component__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3788:1: ( ( ( ruleEString ) ) )
            // InternalDSL.g:3789:2: ( ( ruleEString ) )
            {
            // InternalDSL.g:3789:2: ( ( ruleEString ) )
            // InternalDSL.g:3790:3: ( ruleEString )
            {
             before(grammarAccess.getComponentAccess().getTypeComponentTypeCrossReference_3_0()); 
            // InternalDSL.g:3791:3: ( ruleEString )
            // InternalDSL.g:3792:4: ruleEString
            {
             before(grammarAccess.getComponentAccess().getTypeComponentTypeEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:3803:1: rule__Port__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Port__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3807:1: ( ( ruleEString ) )
            // InternalDSL.g:3808:2: ( ruleEString )
            {
            // InternalDSL.g:3808:2: ( ruleEString )
            // InternalDSL.g:3809:3: ruleEString
            {
             before(grammarAccess.getPortAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:3818:1: rule__Port__TypeAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Port__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3822:1: ( ( ( ruleEString ) ) )
            // InternalDSL.g:3823:2: ( ( ruleEString ) )
            {
            // InternalDSL.g:3823:2: ( ( ruleEString ) )
            // InternalDSL.g:3824:3: ( ruleEString )
            {
             before(grammarAccess.getPortAccess().getTypePortTypeCrossReference_3_0()); 
            // InternalDSL.g:3825:3: ( ruleEString )
            // InternalDSL.g:3826:4: ruleEString
            {
             before(grammarAccess.getPortAccess().getTypePortTypeEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:3837:1: rule__TypeBinding__TypeAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__TypeBinding__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3841:1: ( ( ( ruleEString ) ) )
            // InternalDSL.g:3842:2: ( ( ruleEString ) )
            {
            // InternalDSL.g:3842:2: ( ( ruleEString ) )
            // InternalDSL.g:3843:3: ( ruleEString )
            {
             before(grammarAccess.getTypeBindingAccess().getTypeTypeCrossReference_0_0()); 
            // InternalDSL.g:3844:3: ( ruleEString )
            // InternalDSL.g:3845:4: ruleEString
            {
             before(grammarAccess.getTypeBindingAccess().getTypeTypeEStringParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
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
    // InternalDSL.g:3856:1: rule__TypeBinding__ImplementationAssignment_2 : ( ruleEString ) ;
    public final void rule__TypeBinding__ImplementationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3860:1: ( ( ruleEString ) )
            // InternalDSL.g:3861:2: ( ruleEString )
            {
            // InternalDSL.g:3861:2: ( ruleEString )
            // InternalDSL.g:3862:3: ruleEString
            {
             before(grammarAccess.getTypeBindingAccess().getImplementationEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
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