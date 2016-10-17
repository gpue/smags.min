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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'imports'", "'{'", "'}'", "';'", "'MetaArchitecture'", "'with'", "'namespace'", "'Type'", "':'", "'('", "')'", "','", "'ComponentType'", "'provides'", "'PortType'", "'RoleModel'", "'bind'", "'role'", "'to'", "'Architecture'", "'::'", "'Component'", "'Port'", "'='", "'Deployment'", "'val'", "'new'"
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
    // InternalDSL.g:187:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:191:2: ( ( ( rule__Type__Group__0 ) ) )
            // InternalDSL.g:192:2: ( ( rule__Type__Group__0 ) )
            {
            // InternalDSL.g:192:2: ( ( rule__Type__Group__0 ) )
            // InternalDSL.g:193:3: ( rule__Type__Group__0 )
            {
             before(grammarAccess.getTypeAccess().getGroup()); 
            // InternalDSL.g:194:3: ( rule__Type__Group__0 )
            // InternalDSL.g:194:4: rule__Type__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleVariable"
    // InternalDSL.g:203:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalDSL.g:204:1: ( ruleVariable EOF )
            // InternalDSL.g:205:1: ruleVariable EOF
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
    // InternalDSL.g:212:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:216:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalDSL.g:217:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalDSL.g:217:2: ( ( rule__Variable__Group__0 ) )
            // InternalDSL.g:218:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalDSL.g:219:3: ( rule__Variable__Group__0 )
            // InternalDSL.g:219:4: rule__Variable__Group__0
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


    // $ANTLR start "entryRuleMethod"
    // InternalDSL.g:228:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // InternalDSL.g:229:1: ( ruleMethod EOF )
            // InternalDSL.g:230:1: ruleMethod EOF
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
    // InternalDSL.g:237:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:241:2: ( ( ( rule__Method__Group__0 ) ) )
            // InternalDSL.g:242:2: ( ( rule__Method__Group__0 ) )
            {
            // InternalDSL.g:242:2: ( ( rule__Method__Group__0 ) )
            // InternalDSL.g:243:3: ( rule__Method__Group__0 )
            {
             before(grammarAccess.getMethodAccess().getGroup()); 
            // InternalDSL.g:244:3: ( rule__Method__Group__0 )
            // InternalDSL.g:244:4: rule__Method__Group__0
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


    // $ANTLR start "entryRuleTypeUse"
    // InternalDSL.g:253:1: entryRuleTypeUse : ruleTypeUse EOF ;
    public final void entryRuleTypeUse() throws RecognitionException {
        try {
            // InternalDSL.g:254:1: ( ruleTypeUse EOF )
            // InternalDSL.g:255:1: ruleTypeUse EOF
            {
             before(grammarAccess.getTypeUseRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeUse();

            state._fsp--;

             after(grammarAccess.getTypeUseRule()); 
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
    // $ANTLR end "entryRuleTypeUse"


    // $ANTLR start "ruleTypeUse"
    // InternalDSL.g:262:1: ruleTypeUse : ( ( rule__TypeUse__Alternatives ) ) ;
    public final void ruleTypeUse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:266:2: ( ( ( rule__TypeUse__Alternatives ) ) )
            // InternalDSL.g:267:2: ( ( rule__TypeUse__Alternatives ) )
            {
            // InternalDSL.g:267:2: ( ( rule__TypeUse__Alternatives ) )
            // InternalDSL.g:268:3: ( rule__TypeUse__Alternatives )
            {
             before(grammarAccess.getTypeUseAccess().getAlternatives()); 
            // InternalDSL.g:269:3: ( rule__TypeUse__Alternatives )
            // InternalDSL.g:269:4: rule__TypeUse__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TypeUse__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeUseAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeUse"


    // $ANTLR start "entryRulePrimitiveUse"
    // InternalDSL.g:278:1: entryRulePrimitiveUse : rulePrimitiveUse EOF ;
    public final void entryRulePrimitiveUse() throws RecognitionException {
        try {
            // InternalDSL.g:279:1: ( rulePrimitiveUse EOF )
            // InternalDSL.g:280:1: rulePrimitiveUse EOF
            {
             before(grammarAccess.getPrimitiveUseRule()); 
            pushFollow(FOLLOW_1);
            rulePrimitiveUse();

            state._fsp--;

             after(grammarAccess.getPrimitiveUseRule()); 
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
    // $ANTLR end "entryRulePrimitiveUse"


    // $ANTLR start "rulePrimitiveUse"
    // InternalDSL.g:287:1: rulePrimitiveUse : ( ( rule__PrimitiveUse__TypeAssignment ) ) ;
    public final void rulePrimitiveUse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:291:2: ( ( ( rule__PrimitiveUse__TypeAssignment ) ) )
            // InternalDSL.g:292:2: ( ( rule__PrimitiveUse__TypeAssignment ) )
            {
            // InternalDSL.g:292:2: ( ( rule__PrimitiveUse__TypeAssignment ) )
            // InternalDSL.g:293:3: ( rule__PrimitiveUse__TypeAssignment )
            {
             before(grammarAccess.getPrimitiveUseAccess().getTypeAssignment()); 
            // InternalDSL.g:294:3: ( rule__PrimitiveUse__TypeAssignment )
            // InternalDSL.g:294:4: rule__PrimitiveUse__TypeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveUse__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveUseAccess().getTypeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitiveUse"


    // $ANTLR start "entryRuleGenericUse"
    // InternalDSL.g:303:1: entryRuleGenericUse : ruleGenericUse EOF ;
    public final void entryRuleGenericUse() throws RecognitionException {
        try {
            // InternalDSL.g:304:1: ( ruleGenericUse EOF )
            // InternalDSL.g:305:1: ruleGenericUse EOF
            {
             before(grammarAccess.getGenericUseRule()); 
            pushFollow(FOLLOW_1);
            ruleGenericUse();

            state._fsp--;

             after(grammarAccess.getGenericUseRule()); 
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
    // $ANTLR end "entryRuleGenericUse"


    // $ANTLR start "ruleGenericUse"
    // InternalDSL.g:312:1: ruleGenericUse : ( ( rule__GenericUse__Group__0 ) ) ;
    public final void ruleGenericUse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:316:2: ( ( ( rule__GenericUse__Group__0 ) ) )
            // InternalDSL.g:317:2: ( ( rule__GenericUse__Group__0 ) )
            {
            // InternalDSL.g:317:2: ( ( rule__GenericUse__Group__0 ) )
            // InternalDSL.g:318:3: ( rule__GenericUse__Group__0 )
            {
             before(grammarAccess.getGenericUseAccess().getGroup()); 
            // InternalDSL.g:319:3: ( rule__GenericUse__Group__0 )
            // InternalDSL.g:319:4: rule__GenericUse__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GenericUse__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGenericUseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGenericUse"


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


    // $ANTLR start "entryRuleDeployment"
    // InternalDSL.g:653:1: entryRuleDeployment : ruleDeployment EOF ;
    public final void entryRuleDeployment() throws RecognitionException {
        try {
            // InternalDSL.g:654:1: ( ruleDeployment EOF )
            // InternalDSL.g:655:1: ruleDeployment EOF
            {
             before(grammarAccess.getDeploymentRule()); 
            pushFollow(FOLLOW_1);
            ruleDeployment();

            state._fsp--;

             after(grammarAccess.getDeploymentRule()); 
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
    // $ANTLR end "entryRuleDeployment"


    // $ANTLR start "ruleDeployment"
    // InternalDSL.g:662:1: ruleDeployment : ( ( rule__Deployment__Group__0 ) ) ;
    public final void ruleDeployment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:666:2: ( ( ( rule__Deployment__Group__0 ) ) )
            // InternalDSL.g:667:2: ( ( rule__Deployment__Group__0 ) )
            {
            // InternalDSL.g:667:2: ( ( rule__Deployment__Group__0 ) )
            // InternalDSL.g:668:3: ( rule__Deployment__Group__0 )
            {
             before(grammarAccess.getDeploymentAccess().getGroup()); 
            // InternalDSL.g:669:3: ( rule__Deployment__Group__0 )
            // InternalDSL.g:669:4: rule__Deployment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Deployment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeploymentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeployment"


    // $ANTLR start "entryRuleDeploymentOperator"
    // InternalDSL.g:678:1: entryRuleDeploymentOperator : ruleDeploymentOperator EOF ;
    public final void entryRuleDeploymentOperator() throws RecognitionException {
        try {
            // InternalDSL.g:679:1: ( ruleDeploymentOperator EOF )
            // InternalDSL.g:680:1: ruleDeploymentOperator EOF
            {
             before(grammarAccess.getDeploymentOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleDeploymentOperator();

            state._fsp--;

             after(grammarAccess.getDeploymentOperatorRule()); 
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
    // $ANTLR end "entryRuleDeploymentOperator"


    // $ANTLR start "ruleDeploymentOperator"
    // InternalDSL.g:687:1: ruleDeploymentOperator : ( ( rule__DeploymentOperator__Group__0 ) ) ;
    public final void ruleDeploymentOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:691:2: ( ( ( rule__DeploymentOperator__Group__0 ) ) )
            // InternalDSL.g:692:2: ( ( rule__DeploymentOperator__Group__0 ) )
            {
            // InternalDSL.g:692:2: ( ( rule__DeploymentOperator__Group__0 ) )
            // InternalDSL.g:693:3: ( rule__DeploymentOperator__Group__0 )
            {
             before(grammarAccess.getDeploymentOperatorAccess().getGroup()); 
            // InternalDSL.g:694:3: ( rule__DeploymentOperator__Group__0 )
            // InternalDSL.g:694:4: rule__DeploymentOperator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DeploymentOperator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeploymentOperatorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeploymentOperator"


    // $ANTLR start "entryRuleActivateRoleModelOperator"
    // InternalDSL.g:703:1: entryRuleActivateRoleModelOperator : ruleActivateRoleModelOperator EOF ;
    public final void entryRuleActivateRoleModelOperator() throws RecognitionException {
        try {
            // InternalDSL.g:704:1: ( ruleActivateRoleModelOperator EOF )
            // InternalDSL.g:705:1: ruleActivateRoleModelOperator EOF
            {
             before(grammarAccess.getActivateRoleModelOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleActivateRoleModelOperator();

            state._fsp--;

             after(grammarAccess.getActivateRoleModelOperatorRule()); 
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
    // $ANTLR end "entryRuleActivateRoleModelOperator"


    // $ANTLR start "ruleActivateRoleModelOperator"
    // InternalDSL.g:712:1: ruleActivateRoleModelOperator : ( ( rule__ActivateRoleModelOperator__Group__0 ) ) ;
    public final void ruleActivateRoleModelOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:716:2: ( ( ( rule__ActivateRoleModelOperator__Group__0 ) ) )
            // InternalDSL.g:717:2: ( ( rule__ActivateRoleModelOperator__Group__0 ) )
            {
            // InternalDSL.g:717:2: ( ( rule__ActivateRoleModelOperator__Group__0 ) )
            // InternalDSL.g:718:3: ( rule__ActivateRoleModelOperator__Group__0 )
            {
             before(grammarAccess.getActivateRoleModelOperatorAccess().getGroup()); 
            // InternalDSL.g:719:3: ( rule__ActivateRoleModelOperator__Group__0 )
            // InternalDSL.g:719:4: rule__ActivateRoleModelOperator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ActivateRoleModelOperator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActivateRoleModelOperatorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActivateRoleModelOperator"


    // $ANTLR start "entryRuleCreateInstanceOperator"
    // InternalDSL.g:728:1: entryRuleCreateInstanceOperator : ruleCreateInstanceOperator EOF ;
    public final void entryRuleCreateInstanceOperator() throws RecognitionException {
        try {
            // InternalDSL.g:729:1: ( ruleCreateInstanceOperator EOF )
            // InternalDSL.g:730:1: ruleCreateInstanceOperator EOF
            {
             before(grammarAccess.getCreateInstanceOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleCreateInstanceOperator();

            state._fsp--;

             after(grammarAccess.getCreateInstanceOperatorRule()); 
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
    // $ANTLR end "entryRuleCreateInstanceOperator"


    // $ANTLR start "ruleCreateInstanceOperator"
    // InternalDSL.g:737:1: ruleCreateInstanceOperator : ( ( rule__CreateInstanceOperator__InstanceAssignment ) ) ;
    public final void ruleCreateInstanceOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:741:2: ( ( ( rule__CreateInstanceOperator__InstanceAssignment ) ) )
            // InternalDSL.g:742:2: ( ( rule__CreateInstanceOperator__InstanceAssignment ) )
            {
            // InternalDSL.g:742:2: ( ( rule__CreateInstanceOperator__InstanceAssignment ) )
            // InternalDSL.g:743:3: ( rule__CreateInstanceOperator__InstanceAssignment )
            {
             before(grammarAccess.getCreateInstanceOperatorAccess().getInstanceAssignment()); 
            // InternalDSL.g:744:3: ( rule__CreateInstanceOperator__InstanceAssignment )
            // InternalDSL.g:744:4: rule__CreateInstanceOperator__InstanceAssignment
            {
            pushFollow(FOLLOW_2);
            rule__CreateInstanceOperator__InstanceAssignment();

            state._fsp--;


            }

             after(grammarAccess.getCreateInstanceOperatorAccess().getInstanceAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCreateInstanceOperator"


    // $ANTLR start "entryRuleComponentInstance"
    // InternalDSL.g:753:1: entryRuleComponentInstance : ruleComponentInstance EOF ;
    public final void entryRuleComponentInstance() throws RecognitionException {
        try {
            // InternalDSL.g:754:1: ( ruleComponentInstance EOF )
            // InternalDSL.g:755:1: ruleComponentInstance EOF
            {
             before(grammarAccess.getComponentInstanceRule()); 
            pushFollow(FOLLOW_1);
            ruleComponentInstance();

            state._fsp--;

             after(grammarAccess.getComponentInstanceRule()); 
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
    // $ANTLR end "entryRuleComponentInstance"


    // $ANTLR start "ruleComponentInstance"
    // InternalDSL.g:762:1: ruleComponentInstance : ( ( rule__ComponentInstance__Group__0 ) ) ;
    public final void ruleComponentInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:766:2: ( ( ( rule__ComponentInstance__Group__0 ) ) )
            // InternalDSL.g:767:2: ( ( rule__ComponentInstance__Group__0 ) )
            {
            // InternalDSL.g:767:2: ( ( rule__ComponentInstance__Group__0 ) )
            // InternalDSL.g:768:3: ( rule__ComponentInstance__Group__0 )
            {
             before(grammarAccess.getComponentInstanceAccess().getGroup()); 
            // InternalDSL.g:769:3: ( rule__ComponentInstance__Group__0 )
            // InternalDSL.g:769:4: rule__ComponentInstance__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInstance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentInstanceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponentInstance"


    // $ANTLR start "rule__SmagsElement__Alternatives"
    // InternalDSL.g:777:1: rule__SmagsElement__Alternatives : ( ( ruleMetaArchitecture ) | ( ruleArchitecture ) );
    public final void rule__SmagsElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:781:1: ( ( ruleMetaArchitecture ) | ( ruleArchitecture ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            else if ( (LA1_0==30) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDSL.g:782:2: ( ruleMetaArchitecture )
                    {
                    // InternalDSL.g:782:2: ( ruleMetaArchitecture )
                    // InternalDSL.g:783:3: ruleMetaArchitecture
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
                    // InternalDSL.g:788:2: ( ruleArchitecture )
                    {
                    // InternalDSL.g:788:2: ( ruleArchitecture )
                    // InternalDSL.g:789:3: ruleArchitecture
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
    // InternalDSL.g:798:1: rule__MetaArchitectureElement__Alternatives : ( ( ruleComponentType ) | ( rulePortType ) | ( ruleRoleModel ) );
    public final void rule__MetaArchitectureElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:802:1: ( ( ruleComponentType ) | ( rulePortType ) | ( ruleRoleModel ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt2=1;
                }
                break;
            case 25:
                {
                alt2=2;
                }
                break;
            case 26:
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
                    // InternalDSL.g:803:2: ( ruleComponentType )
                    {
                    // InternalDSL.g:803:2: ( ruleComponentType )
                    // InternalDSL.g:804:3: ruleComponentType
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
                    // InternalDSL.g:809:2: ( rulePortType )
                    {
                    // InternalDSL.g:809:2: ( rulePortType )
                    // InternalDSL.g:810:3: rulePortType
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
                    // InternalDSL.g:815:2: ( ruleRoleModel )
                    {
                    // InternalDSL.g:815:2: ( ruleRoleModel )
                    // InternalDSL.g:816:3: ruleRoleModel
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


    // $ANTLR start "rule__TypeUse__Alternatives"
    // InternalDSL.g:825:1: rule__TypeUse__Alternatives : ( ( rulePrimitiveUse ) | ( ruleGenericUse ) );
    public final void rule__TypeUse__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:829:1: ( ( rulePrimitiveUse ) | ( ruleGenericUse ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_STRING && LA3_0<=RULE_ID)) ) {
                alt3=1;
            }
            else if ( (LA3_0==19) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDSL.g:830:2: ( rulePrimitiveUse )
                    {
                    // InternalDSL.g:830:2: ( rulePrimitiveUse )
                    // InternalDSL.g:831:3: rulePrimitiveUse
                    {
                     before(grammarAccess.getTypeUseAccess().getPrimitiveUseParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePrimitiveUse();

                    state._fsp--;

                     after(grammarAccess.getTypeUseAccess().getPrimitiveUseParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:836:2: ( ruleGenericUse )
                    {
                    // InternalDSL.g:836:2: ( ruleGenericUse )
                    // InternalDSL.g:837:3: ruleGenericUse
                    {
                     before(grammarAccess.getTypeUseAccess().getGenericUseParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleGenericUse();

                    state._fsp--;

                     after(grammarAccess.getTypeUseAccess().getGenericUseParserRuleCall_1()); 

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
    // $ANTLR end "rule__TypeUse__Alternatives"


    // $ANTLR start "rule__PortTypeElement__Alternatives_0"
    // InternalDSL.g:846:1: rule__PortTypeElement__Alternatives_0 : ( ( ruleVariable ) | ( ruleMethod ) );
    public final void rule__PortTypeElement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:850:1: ( ( ruleVariable ) | ( ruleMethod ) )
            int alt4=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_ID) ) {
                    int LA4_4 = input.LA(3);

                    if ( (LA4_4==14) ) {
                        alt4=1;
                    }
                    else if ( (LA4_4==20) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 4, input);

                        throw nvae;
                    }
                }
                else if ( (LA4_1==RULE_STRING) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==RULE_ID) ) {
                    int LA4_4 = input.LA(3);

                    if ( (LA4_4==14) ) {
                        alt4=1;
                    }
                    else if ( (LA4_4==20) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 4, input);

                        throw nvae;
                    }
                }
                else if ( (LA4_2==RULE_STRING) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
                }
                break;
            case 19:
                {
                int LA4_3 = input.LA(2);

                if ( (LA4_3==RULE_STRING) ) {
                    int LA4_6 = input.LA(3);

                    if ( (LA4_6==RULE_ID) ) {
                        int LA4_4 = input.LA(4);

                        if ( (LA4_4==14) ) {
                            alt4=1;
                        }
                        else if ( (LA4_4==20) ) {
                            alt4=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA4_6==RULE_STRING) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 6, input);

                        throw nvae;
                    }
                }
                else if ( (LA4_3==RULE_ID) ) {
                    int LA4_7 = input.LA(3);

                    if ( (LA4_7==RULE_ID) ) {
                        int LA4_4 = input.LA(4);

                        if ( (LA4_4==14) ) {
                            alt4=1;
                        }
                        else if ( (LA4_4==20) ) {
                            alt4=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA4_7==RULE_STRING) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 7, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalDSL.g:851:2: ( ruleVariable )
                    {
                    // InternalDSL.g:851:2: ( ruleVariable )
                    // InternalDSL.g:852:3: ruleVariable
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
                    // InternalDSL.g:857:2: ( ruleMethod )
                    {
                    // InternalDSL.g:857:2: ( ruleMethod )
                    // InternalDSL.g:858:3: ruleMethod
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
    // InternalDSL.g:867:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:871:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalDSL.g:872:2: ( RULE_STRING )
                    {
                    // InternalDSL.g:872:2: ( RULE_STRING )
                    // InternalDSL.g:873:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:878:2: ( RULE_ID )
                    {
                    // InternalDSL.g:878:2: ( RULE_ID )
                    // InternalDSL.g:879:3: RULE_ID
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
    // InternalDSL.g:888:1: rule__ArchitectureElement__Alternatives : ( ( ruleComponent ) | ( rulePort ) | ( ruleDeployment ) );
    public final void rule__ArchitectureElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:892:1: ( ( ruleComponent ) | ( rulePort ) | ( ruleDeployment ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt6=1;
                }
                break;
            case 33:
                {
                alt6=2;
                }
                break;
            case 35:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalDSL.g:893:2: ( ruleComponent )
                    {
                    // InternalDSL.g:893:2: ( ruleComponent )
                    // InternalDSL.g:894:3: ruleComponent
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
                    // InternalDSL.g:899:2: ( rulePort )
                    {
                    // InternalDSL.g:899:2: ( rulePort )
                    // InternalDSL.g:900:3: rulePort
                    {
                     before(grammarAccess.getArchitectureElementAccess().getPortParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePort();

                    state._fsp--;

                     after(grammarAccess.getArchitectureElementAccess().getPortParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDSL.g:905:2: ( ruleDeployment )
                    {
                    // InternalDSL.g:905:2: ( ruleDeployment )
                    // InternalDSL.g:906:3: ruleDeployment
                    {
                     before(grammarAccess.getArchitectureElementAccess().getDeploymentParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDeployment();

                    state._fsp--;

                     after(grammarAccess.getArchitectureElementAccess().getDeploymentParserRuleCall_2()); 

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


    // $ANTLR start "rule__DeploymentOperator__Alternatives_0"
    // InternalDSL.g:915:1: rule__DeploymentOperator__Alternatives_0 : ( ( ruleActivateRoleModelOperator ) | ( ruleCreateInstanceOperator ) );
    public final void rule__DeploymentOperator__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:919:1: ( ( ruleActivateRoleModelOperator ) | ( ruleCreateInstanceOperator ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_ID)) ) {
                alt7=1;
            }
            else if ( (LA7_0==36) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDSL.g:920:2: ( ruleActivateRoleModelOperator )
                    {
                    // InternalDSL.g:920:2: ( ruleActivateRoleModelOperator )
                    // InternalDSL.g:921:3: ruleActivateRoleModelOperator
                    {
                     before(grammarAccess.getDeploymentOperatorAccess().getActivateRoleModelOperatorParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleActivateRoleModelOperator();

                    state._fsp--;

                     after(grammarAccess.getDeploymentOperatorAccess().getActivateRoleModelOperatorParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:926:2: ( ruleCreateInstanceOperator )
                    {
                    // InternalDSL.g:926:2: ( ruleCreateInstanceOperator )
                    // InternalDSL.g:927:3: ruleCreateInstanceOperator
                    {
                     before(grammarAccess.getDeploymentOperatorAccess().getCreateInstanceOperatorParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCreateInstanceOperator();

                    state._fsp--;

                     after(grammarAccess.getDeploymentOperatorAccess().getCreateInstanceOperatorParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__DeploymentOperator__Alternatives_0"


    // $ANTLR start "rule__SmagsModel__Group__0"
    // InternalDSL.g:936:1: rule__SmagsModel__Group__0 : rule__SmagsModel__Group__0__Impl rule__SmagsModel__Group__1 ;
    public final void rule__SmagsModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:940:1: ( rule__SmagsModel__Group__0__Impl rule__SmagsModel__Group__1 )
            // InternalDSL.g:941:2: rule__SmagsModel__Group__0__Impl rule__SmagsModel__Group__1
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
    // InternalDSL.g:948:1: rule__SmagsModel__Group__0__Impl : ( () ) ;
    public final void rule__SmagsModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:952:1: ( ( () ) )
            // InternalDSL.g:953:1: ( () )
            {
            // InternalDSL.g:953:1: ( () )
            // InternalDSL.g:954:2: ()
            {
             before(grammarAccess.getSmagsModelAccess().getSmagsModelAction_0()); 
            // InternalDSL.g:955:2: ()
            // InternalDSL.g:955:3: 
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
    // InternalDSL.g:963:1: rule__SmagsModel__Group__1 : rule__SmagsModel__Group__1__Impl rule__SmagsModel__Group__2 ;
    public final void rule__SmagsModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:967:1: ( rule__SmagsModel__Group__1__Impl rule__SmagsModel__Group__2 )
            // InternalDSL.g:968:2: rule__SmagsModel__Group__1__Impl rule__SmagsModel__Group__2
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
    // InternalDSL.g:975:1: rule__SmagsModel__Group__1__Impl : ( ( rule__SmagsModel__Group_1__0 )? ) ;
    public final void rule__SmagsModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:979:1: ( ( ( rule__SmagsModel__Group_1__0 )? ) )
            // InternalDSL.g:980:1: ( ( rule__SmagsModel__Group_1__0 )? )
            {
            // InternalDSL.g:980:1: ( ( rule__SmagsModel__Group_1__0 )? )
            // InternalDSL.g:981:2: ( rule__SmagsModel__Group_1__0 )?
            {
             before(grammarAccess.getSmagsModelAccess().getGroup_1()); 
            // InternalDSL.g:982:2: ( rule__SmagsModel__Group_1__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==11) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDSL.g:982:3: rule__SmagsModel__Group_1__0
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
    // InternalDSL.g:990:1: rule__SmagsModel__Group__2 : rule__SmagsModel__Group__2__Impl ;
    public final void rule__SmagsModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:994:1: ( rule__SmagsModel__Group__2__Impl )
            // InternalDSL.g:995:2: rule__SmagsModel__Group__2__Impl
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
    // InternalDSL.g:1001:1: rule__SmagsModel__Group__2__Impl : ( ( rule__SmagsModel__ElementsAssignment_2 )* ) ;
    public final void rule__SmagsModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1005:1: ( ( ( rule__SmagsModel__ElementsAssignment_2 )* ) )
            // InternalDSL.g:1006:1: ( ( rule__SmagsModel__ElementsAssignment_2 )* )
            {
            // InternalDSL.g:1006:1: ( ( rule__SmagsModel__ElementsAssignment_2 )* )
            // InternalDSL.g:1007:2: ( rule__SmagsModel__ElementsAssignment_2 )*
            {
             before(grammarAccess.getSmagsModelAccess().getElementsAssignment_2()); 
            // InternalDSL.g:1008:2: ( rule__SmagsModel__ElementsAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==15||LA9_0==30) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDSL.g:1008:3: rule__SmagsModel__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__SmagsModel__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalDSL.g:1017:1: rule__SmagsModel__Group_1__0 : rule__SmagsModel__Group_1__0__Impl rule__SmagsModel__Group_1__1 ;
    public final void rule__SmagsModel__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1021:1: ( rule__SmagsModel__Group_1__0__Impl rule__SmagsModel__Group_1__1 )
            // InternalDSL.g:1022:2: rule__SmagsModel__Group_1__0__Impl rule__SmagsModel__Group_1__1
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
    // InternalDSL.g:1029:1: rule__SmagsModel__Group_1__0__Impl : ( 'imports' ) ;
    public final void rule__SmagsModel__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1033:1: ( ( 'imports' ) )
            // InternalDSL.g:1034:1: ( 'imports' )
            {
            // InternalDSL.g:1034:1: ( 'imports' )
            // InternalDSL.g:1035:2: 'imports'
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
    // InternalDSL.g:1044:1: rule__SmagsModel__Group_1__1 : rule__SmagsModel__Group_1__1__Impl rule__SmagsModel__Group_1__2 ;
    public final void rule__SmagsModel__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1048:1: ( rule__SmagsModel__Group_1__1__Impl rule__SmagsModel__Group_1__2 )
            // InternalDSL.g:1049:2: rule__SmagsModel__Group_1__1__Impl rule__SmagsModel__Group_1__2
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
    // InternalDSL.g:1056:1: rule__SmagsModel__Group_1__1__Impl : ( '{' ) ;
    public final void rule__SmagsModel__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1060:1: ( ( '{' ) )
            // InternalDSL.g:1061:1: ( '{' )
            {
            // InternalDSL.g:1061:1: ( '{' )
            // InternalDSL.g:1062:2: '{'
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
    // InternalDSL.g:1071:1: rule__SmagsModel__Group_1__2 : rule__SmagsModel__Group_1__2__Impl rule__SmagsModel__Group_1__3 ;
    public final void rule__SmagsModel__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1075:1: ( rule__SmagsModel__Group_1__2__Impl rule__SmagsModel__Group_1__3 )
            // InternalDSL.g:1076:2: rule__SmagsModel__Group_1__2__Impl rule__SmagsModel__Group_1__3
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
    // InternalDSL.g:1083:1: rule__SmagsModel__Group_1__2__Impl : ( ( rule__SmagsModel__ImportsAssignment_1_2 )* ) ;
    public final void rule__SmagsModel__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1087:1: ( ( ( rule__SmagsModel__ImportsAssignment_1_2 )* ) )
            // InternalDSL.g:1088:1: ( ( rule__SmagsModel__ImportsAssignment_1_2 )* )
            {
            // InternalDSL.g:1088:1: ( ( rule__SmagsModel__ImportsAssignment_1_2 )* )
            // InternalDSL.g:1089:2: ( rule__SmagsModel__ImportsAssignment_1_2 )*
            {
             before(grammarAccess.getSmagsModelAccess().getImportsAssignment_1_2()); 
            // InternalDSL.g:1090:2: ( rule__SmagsModel__ImportsAssignment_1_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_STRING) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDSL.g:1090:3: rule__SmagsModel__ImportsAssignment_1_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__SmagsModel__ImportsAssignment_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalDSL.g:1098:1: rule__SmagsModel__Group_1__3 : rule__SmagsModel__Group_1__3__Impl ;
    public final void rule__SmagsModel__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1102:1: ( rule__SmagsModel__Group_1__3__Impl )
            // InternalDSL.g:1103:2: rule__SmagsModel__Group_1__3__Impl
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
    // InternalDSL.g:1109:1: rule__SmagsModel__Group_1__3__Impl : ( '}' ) ;
    public final void rule__SmagsModel__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1113:1: ( ( '}' ) )
            // InternalDSL.g:1114:1: ( '}' )
            {
            // InternalDSL.g:1114:1: ( '}' )
            // InternalDSL.g:1115:2: '}'
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
    // InternalDSL.g:1125:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1129:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalDSL.g:1130:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalDSL.g:1137:1: rule__Import__Group__0__Impl : ( ( rule__Import__ImportURIAssignment_0 ) ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1141:1: ( ( ( rule__Import__ImportURIAssignment_0 ) ) )
            // InternalDSL.g:1142:1: ( ( rule__Import__ImportURIAssignment_0 ) )
            {
            // InternalDSL.g:1142:1: ( ( rule__Import__ImportURIAssignment_0 ) )
            // InternalDSL.g:1143:2: ( rule__Import__ImportURIAssignment_0 )
            {
             before(grammarAccess.getImportAccess().getImportURIAssignment_0()); 
            // InternalDSL.g:1144:2: ( rule__Import__ImportURIAssignment_0 )
            // InternalDSL.g:1144:3: rule__Import__ImportURIAssignment_0
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
    // InternalDSL.g:1152:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1156:1: ( rule__Import__Group__1__Impl )
            // InternalDSL.g:1157:2: rule__Import__Group__1__Impl
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
    // InternalDSL.g:1163:1: rule__Import__Group__1__Impl : ( ';' ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1167:1: ( ( ';' ) )
            // InternalDSL.g:1168:1: ( ';' )
            {
            // InternalDSL.g:1168:1: ( ';' )
            // InternalDSL.g:1169:2: ';'
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
    // InternalDSL.g:1179:1: rule__MetaArchitecture__Group__0 : rule__MetaArchitecture__Group__0__Impl rule__MetaArchitecture__Group__1 ;
    public final void rule__MetaArchitecture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1183:1: ( rule__MetaArchitecture__Group__0__Impl rule__MetaArchitecture__Group__1 )
            // InternalDSL.g:1184:2: rule__MetaArchitecture__Group__0__Impl rule__MetaArchitecture__Group__1
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
    // InternalDSL.g:1191:1: rule__MetaArchitecture__Group__0__Impl : ( 'MetaArchitecture' ) ;
    public final void rule__MetaArchitecture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1195:1: ( ( 'MetaArchitecture' ) )
            // InternalDSL.g:1196:1: ( 'MetaArchitecture' )
            {
            // InternalDSL.g:1196:1: ( 'MetaArchitecture' )
            // InternalDSL.g:1197:2: 'MetaArchitecture'
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
    // InternalDSL.g:1206:1: rule__MetaArchitecture__Group__1 : rule__MetaArchitecture__Group__1__Impl rule__MetaArchitecture__Group__2 ;
    public final void rule__MetaArchitecture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1210:1: ( rule__MetaArchitecture__Group__1__Impl rule__MetaArchitecture__Group__2 )
            // InternalDSL.g:1211:2: rule__MetaArchitecture__Group__1__Impl rule__MetaArchitecture__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalDSL.g:1218:1: rule__MetaArchitecture__Group__1__Impl : ( ( rule__MetaArchitecture__NameAssignment_1 ) ) ;
    public final void rule__MetaArchitecture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1222:1: ( ( ( rule__MetaArchitecture__NameAssignment_1 ) ) )
            // InternalDSL.g:1223:1: ( ( rule__MetaArchitecture__NameAssignment_1 ) )
            {
            // InternalDSL.g:1223:1: ( ( rule__MetaArchitecture__NameAssignment_1 ) )
            // InternalDSL.g:1224:2: ( rule__MetaArchitecture__NameAssignment_1 )
            {
             before(grammarAccess.getMetaArchitectureAccess().getNameAssignment_1()); 
            // InternalDSL.g:1225:2: ( rule__MetaArchitecture__NameAssignment_1 )
            // InternalDSL.g:1225:3: rule__MetaArchitecture__NameAssignment_1
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
    // InternalDSL.g:1233:1: rule__MetaArchitecture__Group__2 : rule__MetaArchitecture__Group__2__Impl rule__MetaArchitecture__Group__3 ;
    public final void rule__MetaArchitecture__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1237:1: ( rule__MetaArchitecture__Group__2__Impl rule__MetaArchitecture__Group__3 )
            // InternalDSL.g:1238:2: rule__MetaArchitecture__Group__2__Impl rule__MetaArchitecture__Group__3
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
    // InternalDSL.g:1245:1: rule__MetaArchitecture__Group__2__Impl : ( ( rule__MetaArchitecture__Group_2__0 )? ) ;
    public final void rule__MetaArchitecture__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1249:1: ( ( ( rule__MetaArchitecture__Group_2__0 )? ) )
            // InternalDSL.g:1250:1: ( ( rule__MetaArchitecture__Group_2__0 )? )
            {
            // InternalDSL.g:1250:1: ( ( rule__MetaArchitecture__Group_2__0 )? )
            // InternalDSL.g:1251:2: ( rule__MetaArchitecture__Group_2__0 )?
            {
             before(grammarAccess.getMetaArchitectureAccess().getGroup_2()); 
            // InternalDSL.g:1252:2: ( rule__MetaArchitecture__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==16) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDSL.g:1252:3: rule__MetaArchitecture__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MetaArchitecture__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMetaArchitectureAccess().getGroup_2()); 

            }


            }

        }
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
    // InternalDSL.g:1260:1: rule__MetaArchitecture__Group__3 : rule__MetaArchitecture__Group__3__Impl rule__MetaArchitecture__Group__4 ;
    public final void rule__MetaArchitecture__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1264:1: ( rule__MetaArchitecture__Group__3__Impl rule__MetaArchitecture__Group__4 )
            // InternalDSL.g:1265:2: rule__MetaArchitecture__Group__3__Impl rule__MetaArchitecture__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalDSL.g:1272:1: rule__MetaArchitecture__Group__3__Impl : ( '{' ) ;
    public final void rule__MetaArchitecture__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1276:1: ( ( '{' ) )
            // InternalDSL.g:1277:1: ( '{' )
            {
            // InternalDSL.g:1277:1: ( '{' )
            // InternalDSL.g:1278:2: '{'
            {
             before(grammarAccess.getMetaArchitectureAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMetaArchitectureAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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
    // InternalDSL.g:1287:1: rule__MetaArchitecture__Group__4 : rule__MetaArchitecture__Group__4__Impl rule__MetaArchitecture__Group__5 ;
    public final void rule__MetaArchitecture__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1291:1: ( rule__MetaArchitecture__Group__4__Impl rule__MetaArchitecture__Group__5 )
            // InternalDSL.g:1292:2: rule__MetaArchitecture__Group__4__Impl rule__MetaArchitecture__Group__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalDSL.g:1299:1: rule__MetaArchitecture__Group__4__Impl : ( ( rule__MetaArchitecture__TypesAssignment_4 )* ) ;
    public final void rule__MetaArchitecture__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1303:1: ( ( ( rule__MetaArchitecture__TypesAssignment_4 )* ) )
            // InternalDSL.g:1304:1: ( ( rule__MetaArchitecture__TypesAssignment_4 )* )
            {
            // InternalDSL.g:1304:1: ( ( rule__MetaArchitecture__TypesAssignment_4 )* )
            // InternalDSL.g:1305:2: ( rule__MetaArchitecture__TypesAssignment_4 )*
            {
             before(grammarAccess.getMetaArchitectureAccess().getTypesAssignment_4()); 
            // InternalDSL.g:1306:2: ( rule__MetaArchitecture__TypesAssignment_4 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==18) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDSL.g:1306:3: rule__MetaArchitecture__TypesAssignment_4
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__MetaArchitecture__TypesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getMetaArchitectureAccess().getTypesAssignment_4()); 

            }


            }

        }
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
    // InternalDSL.g:1314:1: rule__MetaArchitecture__Group__5 : rule__MetaArchitecture__Group__5__Impl rule__MetaArchitecture__Group__6 ;
    public final void rule__MetaArchitecture__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1318:1: ( rule__MetaArchitecture__Group__5__Impl rule__MetaArchitecture__Group__6 )
            // InternalDSL.g:1319:2: rule__MetaArchitecture__Group__5__Impl rule__MetaArchitecture__Group__6
            {
            pushFollow(FOLLOW_5);
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
    // InternalDSL.g:1326:1: rule__MetaArchitecture__Group__5__Impl : ( '}' ) ;
    public final void rule__MetaArchitecture__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1330:1: ( ( '}' ) )
            // InternalDSL.g:1331:1: ( '}' )
            {
            // InternalDSL.g:1331:1: ( '}' )
            // InternalDSL.g:1332:2: '}'
            {
             before(grammarAccess.getMetaArchitectureAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getMetaArchitectureAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
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
    // InternalDSL.g:1341:1: rule__MetaArchitecture__Group__6 : rule__MetaArchitecture__Group__6__Impl rule__MetaArchitecture__Group__7 ;
    public final void rule__MetaArchitecture__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1345:1: ( rule__MetaArchitecture__Group__6__Impl rule__MetaArchitecture__Group__7 )
            // InternalDSL.g:1346:2: rule__MetaArchitecture__Group__6__Impl rule__MetaArchitecture__Group__7
            {
            pushFollow(FOLLOW_13);
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
    // InternalDSL.g:1353:1: rule__MetaArchitecture__Group__6__Impl : ( '{' ) ;
    public final void rule__MetaArchitecture__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1357:1: ( ( '{' ) )
            // InternalDSL.g:1358:1: ( '{' )
            {
            // InternalDSL.g:1358:1: ( '{' )
            // InternalDSL.g:1359:2: '{'
            {
             before(grammarAccess.getMetaArchitectureAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMetaArchitectureAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
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
    // InternalDSL.g:1368:1: rule__MetaArchitecture__Group__7 : rule__MetaArchitecture__Group__7__Impl rule__MetaArchitecture__Group__8 ;
    public final void rule__MetaArchitecture__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1372:1: ( rule__MetaArchitecture__Group__7__Impl rule__MetaArchitecture__Group__8 )
            // InternalDSL.g:1373:2: rule__MetaArchitecture__Group__7__Impl rule__MetaArchitecture__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__MetaArchitecture__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MetaArchitecture__Group__8();

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
    // InternalDSL.g:1380:1: rule__MetaArchitecture__Group__7__Impl : ( ( rule__MetaArchitecture__ElementsAssignment_7 )* ) ;
    public final void rule__MetaArchitecture__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1384:1: ( ( ( rule__MetaArchitecture__ElementsAssignment_7 )* ) )
            // InternalDSL.g:1385:1: ( ( rule__MetaArchitecture__ElementsAssignment_7 )* )
            {
            // InternalDSL.g:1385:1: ( ( rule__MetaArchitecture__ElementsAssignment_7 )* )
            // InternalDSL.g:1386:2: ( rule__MetaArchitecture__ElementsAssignment_7 )*
            {
             before(grammarAccess.getMetaArchitectureAccess().getElementsAssignment_7()); 
            // InternalDSL.g:1387:2: ( rule__MetaArchitecture__ElementsAssignment_7 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==23||(LA13_0>=25 && LA13_0<=26)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDSL.g:1387:3: rule__MetaArchitecture__ElementsAssignment_7
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__MetaArchitecture__ElementsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getMetaArchitectureAccess().getElementsAssignment_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__MetaArchitecture__Group__8"
    // InternalDSL.g:1395:1: rule__MetaArchitecture__Group__8 : rule__MetaArchitecture__Group__8__Impl ;
    public final void rule__MetaArchitecture__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1399:1: ( rule__MetaArchitecture__Group__8__Impl )
            // InternalDSL.g:1400:2: rule__MetaArchitecture__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MetaArchitecture__Group__8__Impl();

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
    // $ANTLR end "rule__MetaArchitecture__Group__8"


    // $ANTLR start "rule__MetaArchitecture__Group__8__Impl"
    // InternalDSL.g:1406:1: rule__MetaArchitecture__Group__8__Impl : ( '}' ) ;
    public final void rule__MetaArchitecture__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1410:1: ( ( '}' ) )
            // InternalDSL.g:1411:1: ( '}' )
            {
            // InternalDSL.g:1411:1: ( '}' )
            // InternalDSL.g:1412:2: '}'
            {
             before(grammarAccess.getMetaArchitectureAccess().getRightCurlyBracketKeyword_8()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getMetaArchitectureAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaArchitecture__Group__8__Impl"


    // $ANTLR start "rule__MetaArchitecture__Group_2__0"
    // InternalDSL.g:1422:1: rule__MetaArchitecture__Group_2__0 : rule__MetaArchitecture__Group_2__0__Impl rule__MetaArchitecture__Group_2__1 ;
    public final void rule__MetaArchitecture__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1426:1: ( rule__MetaArchitecture__Group_2__0__Impl rule__MetaArchitecture__Group_2__1 )
            // InternalDSL.g:1427:2: rule__MetaArchitecture__Group_2__0__Impl rule__MetaArchitecture__Group_2__1
            {
            pushFollow(FOLLOW_15);
            rule__MetaArchitecture__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MetaArchitecture__Group_2__1();

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
    // $ANTLR end "rule__MetaArchitecture__Group_2__0"


    // $ANTLR start "rule__MetaArchitecture__Group_2__0__Impl"
    // InternalDSL.g:1434:1: rule__MetaArchitecture__Group_2__0__Impl : ( 'with' ) ;
    public final void rule__MetaArchitecture__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1438:1: ( ( 'with' ) )
            // InternalDSL.g:1439:1: ( 'with' )
            {
            // InternalDSL.g:1439:1: ( 'with' )
            // InternalDSL.g:1440:2: 'with'
            {
             before(grammarAccess.getMetaArchitectureAccess().getWithKeyword_2_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMetaArchitectureAccess().getWithKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaArchitecture__Group_2__0__Impl"


    // $ANTLR start "rule__MetaArchitecture__Group_2__1"
    // InternalDSL.g:1449:1: rule__MetaArchitecture__Group_2__1 : rule__MetaArchitecture__Group_2__1__Impl rule__MetaArchitecture__Group_2__2 ;
    public final void rule__MetaArchitecture__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1453:1: ( rule__MetaArchitecture__Group_2__1__Impl rule__MetaArchitecture__Group_2__2 )
            // InternalDSL.g:1454:2: rule__MetaArchitecture__Group_2__1__Impl rule__MetaArchitecture__Group_2__2
            {
            pushFollow(FOLLOW_9);
            rule__MetaArchitecture__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MetaArchitecture__Group_2__2();

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
    // $ANTLR end "rule__MetaArchitecture__Group_2__1"


    // $ANTLR start "rule__MetaArchitecture__Group_2__1__Impl"
    // InternalDSL.g:1461:1: rule__MetaArchitecture__Group_2__1__Impl : ( 'namespace' ) ;
    public final void rule__MetaArchitecture__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1465:1: ( ( 'namespace' ) )
            // InternalDSL.g:1466:1: ( 'namespace' )
            {
            // InternalDSL.g:1466:1: ( 'namespace' )
            // InternalDSL.g:1467:2: 'namespace'
            {
             before(grammarAccess.getMetaArchitectureAccess().getNamespaceKeyword_2_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMetaArchitectureAccess().getNamespaceKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaArchitecture__Group_2__1__Impl"


    // $ANTLR start "rule__MetaArchitecture__Group_2__2"
    // InternalDSL.g:1476:1: rule__MetaArchitecture__Group_2__2 : rule__MetaArchitecture__Group_2__2__Impl ;
    public final void rule__MetaArchitecture__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1480:1: ( rule__MetaArchitecture__Group_2__2__Impl )
            // InternalDSL.g:1481:2: rule__MetaArchitecture__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MetaArchitecture__Group_2__2__Impl();

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
    // $ANTLR end "rule__MetaArchitecture__Group_2__2"


    // $ANTLR start "rule__MetaArchitecture__Group_2__2__Impl"
    // InternalDSL.g:1487:1: rule__MetaArchitecture__Group_2__2__Impl : ( ( rule__MetaArchitecture__NamespaceAssignment_2_2 ) ) ;
    public final void rule__MetaArchitecture__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1491:1: ( ( ( rule__MetaArchitecture__NamespaceAssignment_2_2 ) ) )
            // InternalDSL.g:1492:1: ( ( rule__MetaArchitecture__NamespaceAssignment_2_2 ) )
            {
            // InternalDSL.g:1492:1: ( ( rule__MetaArchitecture__NamespaceAssignment_2_2 ) )
            // InternalDSL.g:1493:2: ( rule__MetaArchitecture__NamespaceAssignment_2_2 )
            {
             before(grammarAccess.getMetaArchitectureAccess().getNamespaceAssignment_2_2()); 
            // InternalDSL.g:1494:2: ( rule__MetaArchitecture__NamespaceAssignment_2_2 )
            // InternalDSL.g:1494:3: rule__MetaArchitecture__NamespaceAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__MetaArchitecture__NamespaceAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getMetaArchitectureAccess().getNamespaceAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaArchitecture__Group_2__2__Impl"


    // $ANTLR start "rule__Type__Group__0"
    // InternalDSL.g:1503:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1507:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // InternalDSL.g:1508:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__1();

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
    // $ANTLR end "rule__Type__Group__0"


    // $ANTLR start "rule__Type__Group__0__Impl"
    // InternalDSL.g:1515:1: rule__Type__Group__0__Impl : ( 'Type' ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1519:1: ( ( 'Type' ) )
            // InternalDSL.g:1520:1: ( 'Type' )
            {
            // InternalDSL.g:1520:1: ( 'Type' )
            // InternalDSL.g:1521:2: 'Type'
            {
             before(grammarAccess.getTypeAccess().getTypeKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__0__Impl"


    // $ANTLR start "rule__Type__Group__1"
    // InternalDSL.g:1530:1: rule__Type__Group__1 : rule__Type__Group__1__Impl rule__Type__Group__2 ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1534:1: ( rule__Type__Group__1__Impl rule__Type__Group__2 )
            // InternalDSL.g:1535:2: rule__Type__Group__1__Impl rule__Type__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Type__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__2();

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
    // $ANTLR end "rule__Type__Group__1"


    // $ANTLR start "rule__Type__Group__1__Impl"
    // InternalDSL.g:1542:1: rule__Type__Group__1__Impl : ( ':' ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1546:1: ( ( ':' ) )
            // InternalDSL.g:1547:1: ( ':' )
            {
            // InternalDSL.g:1547:1: ( ':' )
            // InternalDSL.g:1548:2: ':'
            {
             before(grammarAccess.getTypeAccess().getColonKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__1__Impl"


    // $ANTLR start "rule__Type__Group__2"
    // InternalDSL.g:1557:1: rule__Type__Group__2 : rule__Type__Group__2__Impl rule__Type__Group__3 ;
    public final void rule__Type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1561:1: ( rule__Type__Group__2__Impl rule__Type__Group__3 )
            // InternalDSL.g:1562:2: rule__Type__Group__2__Impl rule__Type__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Type__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__3();

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
    // $ANTLR end "rule__Type__Group__2"


    // $ANTLR start "rule__Type__Group__2__Impl"
    // InternalDSL.g:1569:1: rule__Type__Group__2__Impl : ( ( rule__Type__NameAssignment_2 ) ) ;
    public final void rule__Type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1573:1: ( ( ( rule__Type__NameAssignment_2 ) ) )
            // InternalDSL.g:1574:1: ( ( rule__Type__NameAssignment_2 ) )
            {
            // InternalDSL.g:1574:1: ( ( rule__Type__NameAssignment_2 ) )
            // InternalDSL.g:1575:2: ( rule__Type__NameAssignment_2 )
            {
             before(grammarAccess.getTypeAccess().getNameAssignment_2()); 
            // InternalDSL.g:1576:2: ( rule__Type__NameAssignment_2 )
            // InternalDSL.g:1576:3: rule__Type__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Type__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__2__Impl"


    // $ANTLR start "rule__Type__Group__3"
    // InternalDSL.g:1584:1: rule__Type__Group__3 : rule__Type__Group__3__Impl ;
    public final void rule__Type__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1588:1: ( rule__Type__Group__3__Impl )
            // InternalDSL.g:1589:2: rule__Type__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group__3__Impl();

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
    // $ANTLR end "rule__Type__Group__3"


    // $ANTLR start "rule__Type__Group__3__Impl"
    // InternalDSL.g:1595:1: rule__Type__Group__3__Impl : ( ';' ) ;
    public final void rule__Type__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1599:1: ( ( ';' ) )
            // InternalDSL.g:1600:1: ( ';' )
            {
            // InternalDSL.g:1600:1: ( ';' )
            // InternalDSL.g:1601:2: ';'
            {
             before(grammarAccess.getTypeAccess().getSemicolonKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__3__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // InternalDSL.g:1611:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1615:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalDSL.g:1616:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalDSL.g:1623:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__TypeAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1627:1: ( ( ( rule__Variable__TypeAssignment_0 ) ) )
            // InternalDSL.g:1628:1: ( ( rule__Variable__TypeAssignment_0 ) )
            {
            // InternalDSL.g:1628:1: ( ( rule__Variable__TypeAssignment_0 ) )
            // InternalDSL.g:1629:2: ( rule__Variable__TypeAssignment_0 )
            {
             before(grammarAccess.getVariableAccess().getTypeAssignment_0()); 
            // InternalDSL.g:1630:2: ( rule__Variable__TypeAssignment_0 )
            // InternalDSL.g:1630:3: rule__Variable__TypeAssignment_0
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
    // InternalDSL.g:1638:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1642:1: ( rule__Variable__Group__1__Impl )
            // InternalDSL.g:1643:2: rule__Variable__Group__1__Impl
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
    // InternalDSL.g:1649:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__NameAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1653:1: ( ( ( rule__Variable__NameAssignment_1 ) ) )
            // InternalDSL.g:1654:1: ( ( rule__Variable__NameAssignment_1 ) )
            {
            // InternalDSL.g:1654:1: ( ( rule__Variable__NameAssignment_1 ) )
            // InternalDSL.g:1655:2: ( rule__Variable__NameAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_1()); 
            // InternalDSL.g:1656:2: ( rule__Variable__NameAssignment_1 )
            // InternalDSL.g:1656:3: rule__Variable__NameAssignment_1
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
    // InternalDSL.g:1665:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1669:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // InternalDSL.g:1670:2: rule__Method__Group__0__Impl rule__Method__Group__1
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
    // InternalDSL.g:1677:1: rule__Method__Group__0__Impl : ( ( rule__Method__ReturnTypeAssignment_0 ) ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1681:1: ( ( ( rule__Method__ReturnTypeAssignment_0 ) ) )
            // InternalDSL.g:1682:1: ( ( rule__Method__ReturnTypeAssignment_0 ) )
            {
            // InternalDSL.g:1682:1: ( ( rule__Method__ReturnTypeAssignment_0 ) )
            // InternalDSL.g:1683:2: ( rule__Method__ReturnTypeAssignment_0 )
            {
             before(grammarAccess.getMethodAccess().getReturnTypeAssignment_0()); 
            // InternalDSL.g:1684:2: ( rule__Method__ReturnTypeAssignment_0 )
            // InternalDSL.g:1684:3: rule__Method__ReturnTypeAssignment_0
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
    // InternalDSL.g:1692:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1696:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // InternalDSL.g:1697:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalDSL.g:1704:1: rule__Method__Group__1__Impl : ( ( rule__Method__NameAssignment_1 ) ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1708:1: ( ( ( rule__Method__NameAssignment_1 ) ) )
            // InternalDSL.g:1709:1: ( ( rule__Method__NameAssignment_1 ) )
            {
            // InternalDSL.g:1709:1: ( ( rule__Method__NameAssignment_1 ) )
            // InternalDSL.g:1710:2: ( rule__Method__NameAssignment_1 )
            {
             before(grammarAccess.getMethodAccess().getNameAssignment_1()); 
            // InternalDSL.g:1711:2: ( rule__Method__NameAssignment_1 )
            // InternalDSL.g:1711:3: rule__Method__NameAssignment_1
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
    // InternalDSL.g:1719:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1723:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // InternalDSL.g:1724:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalDSL.g:1731:1: rule__Method__Group__2__Impl : ( '(' ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1735:1: ( ( '(' ) )
            // InternalDSL.g:1736:1: ( '(' )
            {
            // InternalDSL.g:1736:1: ( '(' )
            // InternalDSL.g:1737:2: '('
            {
             before(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalDSL.g:1746:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1750:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // InternalDSL.g:1751:2: rule__Method__Group__3__Impl rule__Method__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalDSL.g:1758:1: rule__Method__Group__3__Impl : ( ( rule__Method__Group_3__0 )? ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1762:1: ( ( ( rule__Method__Group_3__0 )? ) )
            // InternalDSL.g:1763:1: ( ( rule__Method__Group_3__0 )? )
            {
            // InternalDSL.g:1763:1: ( ( rule__Method__Group_3__0 )? )
            // InternalDSL.g:1764:2: ( rule__Method__Group_3__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_3()); 
            // InternalDSL.g:1765:2: ( rule__Method__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_ID)||LA14_0==19) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDSL.g:1765:3: rule__Method__Group_3__0
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
    // InternalDSL.g:1773:1: rule__Method__Group__4 : rule__Method__Group__4__Impl ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1777:1: ( rule__Method__Group__4__Impl )
            // InternalDSL.g:1778:2: rule__Method__Group__4__Impl
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
    // InternalDSL.g:1784:1: rule__Method__Group__4__Impl : ( ')' ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1788:1: ( ( ')' ) )
            // InternalDSL.g:1789:1: ( ')' )
            {
            // InternalDSL.g:1789:1: ( ')' )
            // InternalDSL.g:1790:2: ')'
            {
             before(grammarAccess.getMethodAccess().getRightParenthesisKeyword_4()); 
            match(input,21,FOLLOW_2); 
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
    // InternalDSL.g:1800:1: rule__Method__Group_3__0 : rule__Method__Group_3__0__Impl rule__Method__Group_3__1 ;
    public final void rule__Method__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1804:1: ( rule__Method__Group_3__0__Impl rule__Method__Group_3__1 )
            // InternalDSL.g:1805:2: rule__Method__Group_3__0__Impl rule__Method__Group_3__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalDSL.g:1812:1: rule__Method__Group_3__0__Impl : ( ( rule__Method__ArgsAssignment_3_0 ) ) ;
    public final void rule__Method__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1816:1: ( ( ( rule__Method__ArgsAssignment_3_0 ) ) )
            // InternalDSL.g:1817:1: ( ( rule__Method__ArgsAssignment_3_0 ) )
            {
            // InternalDSL.g:1817:1: ( ( rule__Method__ArgsAssignment_3_0 ) )
            // InternalDSL.g:1818:2: ( rule__Method__ArgsAssignment_3_0 )
            {
             before(grammarAccess.getMethodAccess().getArgsAssignment_3_0()); 
            // InternalDSL.g:1819:2: ( rule__Method__ArgsAssignment_3_0 )
            // InternalDSL.g:1819:3: rule__Method__ArgsAssignment_3_0
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
    // InternalDSL.g:1827:1: rule__Method__Group_3__1 : rule__Method__Group_3__1__Impl ;
    public final void rule__Method__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1831:1: ( rule__Method__Group_3__1__Impl )
            // InternalDSL.g:1832:2: rule__Method__Group_3__1__Impl
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
    // InternalDSL.g:1838:1: rule__Method__Group_3__1__Impl : ( ( rule__Method__Group_3_1__0 )* ) ;
    public final void rule__Method__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1842:1: ( ( ( rule__Method__Group_3_1__0 )* ) )
            // InternalDSL.g:1843:1: ( ( rule__Method__Group_3_1__0 )* )
            {
            // InternalDSL.g:1843:1: ( ( rule__Method__Group_3_1__0 )* )
            // InternalDSL.g:1844:2: ( rule__Method__Group_3_1__0 )*
            {
             before(grammarAccess.getMethodAccess().getGroup_3_1()); 
            // InternalDSL.g:1845:2: ( rule__Method__Group_3_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==22) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDSL.g:1845:3: rule__Method__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Method__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalDSL.g:1854:1: rule__Method__Group_3_1__0 : rule__Method__Group_3_1__0__Impl rule__Method__Group_3_1__1 ;
    public final void rule__Method__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1858:1: ( rule__Method__Group_3_1__0__Impl rule__Method__Group_3_1__1 )
            // InternalDSL.g:1859:2: rule__Method__Group_3_1__0__Impl rule__Method__Group_3_1__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalDSL.g:1866:1: rule__Method__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Method__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1870:1: ( ( ',' ) )
            // InternalDSL.g:1871:1: ( ',' )
            {
            // InternalDSL.g:1871:1: ( ',' )
            // InternalDSL.g:1872:2: ','
            {
             before(grammarAccess.getMethodAccess().getCommaKeyword_3_1_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalDSL.g:1881:1: rule__Method__Group_3_1__1 : rule__Method__Group_3_1__1__Impl ;
    public final void rule__Method__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1885:1: ( rule__Method__Group_3_1__1__Impl )
            // InternalDSL.g:1886:2: rule__Method__Group_3_1__1__Impl
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
    // InternalDSL.g:1892:1: rule__Method__Group_3_1__1__Impl : ( ( rule__Method__ArgsAssignment_3_1_1 ) ) ;
    public final void rule__Method__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1896:1: ( ( ( rule__Method__ArgsAssignment_3_1_1 ) ) )
            // InternalDSL.g:1897:1: ( ( rule__Method__ArgsAssignment_3_1_1 ) )
            {
            // InternalDSL.g:1897:1: ( ( rule__Method__ArgsAssignment_3_1_1 ) )
            // InternalDSL.g:1898:2: ( rule__Method__ArgsAssignment_3_1_1 )
            {
             before(grammarAccess.getMethodAccess().getArgsAssignment_3_1_1()); 
            // InternalDSL.g:1899:2: ( rule__Method__ArgsAssignment_3_1_1 )
            // InternalDSL.g:1899:3: rule__Method__ArgsAssignment_3_1_1
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


    // $ANTLR start "rule__GenericUse__Group__0"
    // InternalDSL.g:1908:1: rule__GenericUse__Group__0 : rule__GenericUse__Group__0__Impl rule__GenericUse__Group__1 ;
    public final void rule__GenericUse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1912:1: ( rule__GenericUse__Group__0__Impl rule__GenericUse__Group__1 )
            // InternalDSL.g:1913:2: rule__GenericUse__Group__0__Impl rule__GenericUse__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__GenericUse__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GenericUse__Group__1();

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
    // $ANTLR end "rule__GenericUse__Group__0"


    // $ANTLR start "rule__GenericUse__Group__0__Impl"
    // InternalDSL.g:1920:1: rule__GenericUse__Group__0__Impl : ( ':' ) ;
    public final void rule__GenericUse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1924:1: ( ( ':' ) )
            // InternalDSL.g:1925:1: ( ':' )
            {
            // InternalDSL.g:1925:1: ( ':' )
            // InternalDSL.g:1926:2: ':'
            {
             before(grammarAccess.getGenericUseAccess().getColonKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getGenericUseAccess().getColonKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenericUse__Group__0__Impl"


    // $ANTLR start "rule__GenericUse__Group__1"
    // InternalDSL.g:1935:1: rule__GenericUse__Group__1 : rule__GenericUse__Group__1__Impl ;
    public final void rule__GenericUse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1939:1: ( rule__GenericUse__Group__1__Impl )
            // InternalDSL.g:1940:2: rule__GenericUse__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GenericUse__Group__1__Impl();

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
    // $ANTLR end "rule__GenericUse__Group__1"


    // $ANTLR start "rule__GenericUse__Group__1__Impl"
    // InternalDSL.g:1946:1: rule__GenericUse__Group__1__Impl : ( ( rule__GenericUse__TypeAssignment_1 ) ) ;
    public final void rule__GenericUse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1950:1: ( ( ( rule__GenericUse__TypeAssignment_1 ) ) )
            // InternalDSL.g:1951:1: ( ( rule__GenericUse__TypeAssignment_1 ) )
            {
            // InternalDSL.g:1951:1: ( ( rule__GenericUse__TypeAssignment_1 ) )
            // InternalDSL.g:1952:2: ( rule__GenericUse__TypeAssignment_1 )
            {
             before(grammarAccess.getGenericUseAccess().getTypeAssignment_1()); 
            // InternalDSL.g:1953:2: ( rule__GenericUse__TypeAssignment_1 )
            // InternalDSL.g:1953:3: rule__GenericUse__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GenericUse__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGenericUseAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenericUse__Group__1__Impl"


    // $ANTLR start "rule__PortTypeElement__Group__0"
    // InternalDSL.g:1962:1: rule__PortTypeElement__Group__0 : rule__PortTypeElement__Group__0__Impl rule__PortTypeElement__Group__1 ;
    public final void rule__PortTypeElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1966:1: ( rule__PortTypeElement__Group__0__Impl rule__PortTypeElement__Group__1 )
            // InternalDSL.g:1967:2: rule__PortTypeElement__Group__0__Impl rule__PortTypeElement__Group__1
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
    // InternalDSL.g:1974:1: rule__PortTypeElement__Group__0__Impl : ( ( rule__PortTypeElement__Alternatives_0 ) ) ;
    public final void rule__PortTypeElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1978:1: ( ( ( rule__PortTypeElement__Alternatives_0 ) ) )
            // InternalDSL.g:1979:1: ( ( rule__PortTypeElement__Alternatives_0 ) )
            {
            // InternalDSL.g:1979:1: ( ( rule__PortTypeElement__Alternatives_0 ) )
            // InternalDSL.g:1980:2: ( rule__PortTypeElement__Alternatives_0 )
            {
             before(grammarAccess.getPortTypeElementAccess().getAlternatives_0()); 
            // InternalDSL.g:1981:2: ( rule__PortTypeElement__Alternatives_0 )
            // InternalDSL.g:1981:3: rule__PortTypeElement__Alternatives_0
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
    // InternalDSL.g:1989:1: rule__PortTypeElement__Group__1 : rule__PortTypeElement__Group__1__Impl ;
    public final void rule__PortTypeElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1993:1: ( rule__PortTypeElement__Group__1__Impl )
            // InternalDSL.g:1994:2: rule__PortTypeElement__Group__1__Impl
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
    // InternalDSL.g:2000:1: rule__PortTypeElement__Group__1__Impl : ( ';' ) ;
    public final void rule__PortTypeElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2004:1: ( ( ';' ) )
            // InternalDSL.g:2005:1: ( ';' )
            {
            // InternalDSL.g:2005:1: ( ';' )
            // InternalDSL.g:2006:2: ';'
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
    // InternalDSL.g:2016:1: rule__ComponentType__Group__0 : rule__ComponentType__Group__0__Impl rule__ComponentType__Group__1 ;
    public final void rule__ComponentType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2020:1: ( rule__ComponentType__Group__0__Impl rule__ComponentType__Group__1 )
            // InternalDSL.g:2021:2: rule__ComponentType__Group__0__Impl rule__ComponentType__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalDSL.g:2028:1: rule__ComponentType__Group__0__Impl : ( () ) ;
    public final void rule__ComponentType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2032:1: ( ( () ) )
            // InternalDSL.g:2033:1: ( () )
            {
            // InternalDSL.g:2033:1: ( () )
            // InternalDSL.g:2034:2: ()
            {
             before(grammarAccess.getComponentTypeAccess().getComponentTypeAction_0()); 
            // InternalDSL.g:2035:2: ()
            // InternalDSL.g:2035:3: 
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
    // InternalDSL.g:2043:1: rule__ComponentType__Group__1 : rule__ComponentType__Group__1__Impl rule__ComponentType__Group__2 ;
    public final void rule__ComponentType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2047:1: ( rule__ComponentType__Group__1__Impl rule__ComponentType__Group__2 )
            // InternalDSL.g:2048:2: rule__ComponentType__Group__1__Impl rule__ComponentType__Group__2
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
    // InternalDSL.g:2055:1: rule__ComponentType__Group__1__Impl : ( 'ComponentType' ) ;
    public final void rule__ComponentType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2059:1: ( ( 'ComponentType' ) )
            // InternalDSL.g:2060:1: ( 'ComponentType' )
            {
            // InternalDSL.g:2060:1: ( 'ComponentType' )
            // InternalDSL.g:2061:2: 'ComponentType'
            {
             before(grammarAccess.getComponentTypeAccess().getComponentTypeKeyword_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalDSL.g:2070:1: rule__ComponentType__Group__2 : rule__ComponentType__Group__2__Impl rule__ComponentType__Group__3 ;
    public final void rule__ComponentType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2074:1: ( rule__ComponentType__Group__2__Impl rule__ComponentType__Group__3 )
            // InternalDSL.g:2075:2: rule__ComponentType__Group__2__Impl rule__ComponentType__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalDSL.g:2082:1: rule__ComponentType__Group__2__Impl : ( ( rule__ComponentType__NameAssignment_2 ) ) ;
    public final void rule__ComponentType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2086:1: ( ( ( rule__ComponentType__NameAssignment_2 ) ) )
            // InternalDSL.g:2087:1: ( ( rule__ComponentType__NameAssignment_2 ) )
            {
            // InternalDSL.g:2087:1: ( ( rule__ComponentType__NameAssignment_2 ) )
            // InternalDSL.g:2088:2: ( rule__ComponentType__NameAssignment_2 )
            {
             before(grammarAccess.getComponentTypeAccess().getNameAssignment_2()); 
            // InternalDSL.g:2089:2: ( rule__ComponentType__NameAssignment_2 )
            // InternalDSL.g:2089:3: rule__ComponentType__NameAssignment_2
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
    // InternalDSL.g:2097:1: rule__ComponentType__Group__3 : rule__ComponentType__Group__3__Impl rule__ComponentType__Group__4 ;
    public final void rule__ComponentType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2101:1: ( rule__ComponentType__Group__3__Impl rule__ComponentType__Group__4 )
            // InternalDSL.g:2102:2: rule__ComponentType__Group__3__Impl rule__ComponentType__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__ComponentType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentType__Group__4();

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
    // InternalDSL.g:2109:1: rule__ComponentType__Group__3__Impl : ( ( rule__ComponentType__Group_3__0 )? ) ;
    public final void rule__ComponentType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2113:1: ( ( ( rule__ComponentType__Group_3__0 )? ) )
            // InternalDSL.g:2114:1: ( ( rule__ComponentType__Group_3__0 )? )
            {
            // InternalDSL.g:2114:1: ( ( rule__ComponentType__Group_3__0 )? )
            // InternalDSL.g:2115:2: ( rule__ComponentType__Group_3__0 )?
            {
             before(grammarAccess.getComponentTypeAccess().getGroup_3()); 
            // InternalDSL.g:2116:2: ( rule__ComponentType__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDSL.g:2116:3: rule__ComponentType__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentType__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentTypeAccess().getGroup_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__ComponentType__Group__4"
    // InternalDSL.g:2124:1: rule__ComponentType__Group__4 : rule__ComponentType__Group__4__Impl ;
    public final void rule__ComponentType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2128:1: ( rule__ComponentType__Group__4__Impl )
            // InternalDSL.g:2129:2: rule__ComponentType__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentType__Group__4__Impl();

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
    // $ANTLR end "rule__ComponentType__Group__4"


    // $ANTLR start "rule__ComponentType__Group__4__Impl"
    // InternalDSL.g:2135:1: rule__ComponentType__Group__4__Impl : ( ';' ) ;
    public final void rule__ComponentType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2139:1: ( ( ';' ) )
            // InternalDSL.g:2140:1: ( ';' )
            {
            // InternalDSL.g:2140:1: ( ';' )
            // InternalDSL.g:2141:2: ';'
            {
             before(grammarAccess.getComponentTypeAccess().getSemicolonKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getComponentTypeAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentType__Group__4__Impl"


    // $ANTLR start "rule__ComponentType__Group_3__0"
    // InternalDSL.g:2151:1: rule__ComponentType__Group_3__0 : rule__ComponentType__Group_3__0__Impl rule__ComponentType__Group_3__1 ;
    public final void rule__ComponentType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2155:1: ( rule__ComponentType__Group_3__0__Impl rule__ComponentType__Group_3__1 )
            // InternalDSL.g:2156:2: rule__ComponentType__Group_3__0__Impl rule__ComponentType__Group_3__1
            {
            pushFollow(FOLLOW_9);
            rule__ComponentType__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentType__Group_3__1();

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
    // $ANTLR end "rule__ComponentType__Group_3__0"


    // $ANTLR start "rule__ComponentType__Group_3__0__Impl"
    // InternalDSL.g:2163:1: rule__ComponentType__Group_3__0__Impl : ( 'provides' ) ;
    public final void rule__ComponentType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2167:1: ( ( 'provides' ) )
            // InternalDSL.g:2168:1: ( 'provides' )
            {
            // InternalDSL.g:2168:1: ( 'provides' )
            // InternalDSL.g:2169:2: 'provides'
            {
             before(grammarAccess.getComponentTypeAccess().getProvidesKeyword_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getComponentTypeAccess().getProvidesKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentType__Group_3__0__Impl"


    // $ANTLR start "rule__ComponentType__Group_3__1"
    // InternalDSL.g:2178:1: rule__ComponentType__Group_3__1 : rule__ComponentType__Group_3__1__Impl rule__ComponentType__Group_3__2 ;
    public final void rule__ComponentType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2182:1: ( rule__ComponentType__Group_3__1__Impl rule__ComponentType__Group_3__2 )
            // InternalDSL.g:2183:2: rule__ComponentType__Group_3__1__Impl rule__ComponentType__Group_3__2
            {
            pushFollow(FOLLOW_20);
            rule__ComponentType__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentType__Group_3__2();

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
    // $ANTLR end "rule__ComponentType__Group_3__1"


    // $ANTLR start "rule__ComponentType__Group_3__1__Impl"
    // InternalDSL.g:2190:1: rule__ComponentType__Group_3__1__Impl : ( ( rule__ComponentType__ProvidesAssignment_3_1 ) ) ;
    public final void rule__ComponentType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2194:1: ( ( ( rule__ComponentType__ProvidesAssignment_3_1 ) ) )
            // InternalDSL.g:2195:1: ( ( rule__ComponentType__ProvidesAssignment_3_1 ) )
            {
            // InternalDSL.g:2195:1: ( ( rule__ComponentType__ProvidesAssignment_3_1 ) )
            // InternalDSL.g:2196:2: ( rule__ComponentType__ProvidesAssignment_3_1 )
            {
             before(grammarAccess.getComponentTypeAccess().getProvidesAssignment_3_1()); 
            // InternalDSL.g:2197:2: ( rule__ComponentType__ProvidesAssignment_3_1 )
            // InternalDSL.g:2197:3: rule__ComponentType__ProvidesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentType__ProvidesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentTypeAccess().getProvidesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentType__Group_3__1__Impl"


    // $ANTLR start "rule__ComponentType__Group_3__2"
    // InternalDSL.g:2205:1: rule__ComponentType__Group_3__2 : rule__ComponentType__Group_3__2__Impl ;
    public final void rule__ComponentType__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2209:1: ( rule__ComponentType__Group_3__2__Impl )
            // InternalDSL.g:2210:2: rule__ComponentType__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentType__Group_3__2__Impl();

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
    // $ANTLR end "rule__ComponentType__Group_3__2"


    // $ANTLR start "rule__ComponentType__Group_3__2__Impl"
    // InternalDSL.g:2216:1: rule__ComponentType__Group_3__2__Impl : ( ( rule__ComponentType__Group_3_2__0 )* ) ;
    public final void rule__ComponentType__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2220:1: ( ( ( rule__ComponentType__Group_3_2__0 )* ) )
            // InternalDSL.g:2221:1: ( ( rule__ComponentType__Group_3_2__0 )* )
            {
            // InternalDSL.g:2221:1: ( ( rule__ComponentType__Group_3_2__0 )* )
            // InternalDSL.g:2222:2: ( rule__ComponentType__Group_3_2__0 )*
            {
             before(grammarAccess.getComponentTypeAccess().getGroup_3_2()); 
            // InternalDSL.g:2223:2: ( rule__ComponentType__Group_3_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==22) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDSL.g:2223:3: rule__ComponentType__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__ComponentType__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getComponentTypeAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentType__Group_3__2__Impl"


    // $ANTLR start "rule__ComponentType__Group_3_2__0"
    // InternalDSL.g:2232:1: rule__ComponentType__Group_3_2__0 : rule__ComponentType__Group_3_2__0__Impl rule__ComponentType__Group_3_2__1 ;
    public final void rule__ComponentType__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2236:1: ( rule__ComponentType__Group_3_2__0__Impl rule__ComponentType__Group_3_2__1 )
            // InternalDSL.g:2237:2: rule__ComponentType__Group_3_2__0__Impl rule__ComponentType__Group_3_2__1
            {
            pushFollow(FOLLOW_9);
            rule__ComponentType__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentType__Group_3_2__1();

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
    // $ANTLR end "rule__ComponentType__Group_3_2__0"


    // $ANTLR start "rule__ComponentType__Group_3_2__0__Impl"
    // InternalDSL.g:2244:1: rule__ComponentType__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__ComponentType__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2248:1: ( ( ',' ) )
            // InternalDSL.g:2249:1: ( ',' )
            {
            // InternalDSL.g:2249:1: ( ',' )
            // InternalDSL.g:2250:2: ','
            {
             before(grammarAccess.getComponentTypeAccess().getCommaKeyword_3_2_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getComponentTypeAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentType__Group_3_2__0__Impl"


    // $ANTLR start "rule__ComponentType__Group_3_2__1"
    // InternalDSL.g:2259:1: rule__ComponentType__Group_3_2__1 : rule__ComponentType__Group_3_2__1__Impl ;
    public final void rule__ComponentType__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2263:1: ( rule__ComponentType__Group_3_2__1__Impl )
            // InternalDSL.g:2264:2: rule__ComponentType__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentType__Group_3_2__1__Impl();

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
    // $ANTLR end "rule__ComponentType__Group_3_2__1"


    // $ANTLR start "rule__ComponentType__Group_3_2__1__Impl"
    // InternalDSL.g:2270:1: rule__ComponentType__Group_3_2__1__Impl : ( ( rule__ComponentType__ProvidesAssignment_3_2_1 ) ) ;
    public final void rule__ComponentType__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2274:1: ( ( ( rule__ComponentType__ProvidesAssignment_3_2_1 ) ) )
            // InternalDSL.g:2275:1: ( ( rule__ComponentType__ProvidesAssignment_3_2_1 ) )
            {
            // InternalDSL.g:2275:1: ( ( rule__ComponentType__ProvidesAssignment_3_2_1 ) )
            // InternalDSL.g:2276:2: ( rule__ComponentType__ProvidesAssignment_3_2_1 )
            {
             before(grammarAccess.getComponentTypeAccess().getProvidesAssignment_3_2_1()); 
            // InternalDSL.g:2277:2: ( rule__ComponentType__ProvidesAssignment_3_2_1 )
            // InternalDSL.g:2277:3: rule__ComponentType__ProvidesAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentType__ProvidesAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentTypeAccess().getProvidesAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentType__Group_3_2__1__Impl"


    // $ANTLR start "rule__PortType__Group__0"
    // InternalDSL.g:2286:1: rule__PortType__Group__0 : rule__PortType__Group__0__Impl rule__PortType__Group__1 ;
    public final void rule__PortType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2290:1: ( rule__PortType__Group__0__Impl rule__PortType__Group__1 )
            // InternalDSL.g:2291:2: rule__PortType__Group__0__Impl rule__PortType__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalDSL.g:2298:1: rule__PortType__Group__0__Impl : ( () ) ;
    public final void rule__PortType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2302:1: ( ( () ) )
            // InternalDSL.g:2303:1: ( () )
            {
            // InternalDSL.g:2303:1: ( () )
            // InternalDSL.g:2304:2: ()
            {
             before(grammarAccess.getPortTypeAccess().getPortTypeAction_0()); 
            // InternalDSL.g:2305:2: ()
            // InternalDSL.g:2305:3: 
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
    // InternalDSL.g:2313:1: rule__PortType__Group__1 : rule__PortType__Group__1__Impl rule__PortType__Group__2 ;
    public final void rule__PortType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2317:1: ( rule__PortType__Group__1__Impl rule__PortType__Group__2 )
            // InternalDSL.g:2318:2: rule__PortType__Group__1__Impl rule__PortType__Group__2
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
    // InternalDSL.g:2325:1: rule__PortType__Group__1__Impl : ( 'PortType' ) ;
    public final void rule__PortType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2329:1: ( ( 'PortType' ) )
            // InternalDSL.g:2330:1: ( 'PortType' )
            {
            // InternalDSL.g:2330:1: ( 'PortType' )
            // InternalDSL.g:2331:2: 'PortType'
            {
             before(grammarAccess.getPortTypeAccess().getPortTypeKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalDSL.g:2340:1: rule__PortType__Group__2 : rule__PortType__Group__2__Impl rule__PortType__Group__3 ;
    public final void rule__PortType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2344:1: ( rule__PortType__Group__2__Impl rule__PortType__Group__3 )
            // InternalDSL.g:2345:2: rule__PortType__Group__2__Impl rule__PortType__Group__3
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
    // InternalDSL.g:2352:1: rule__PortType__Group__2__Impl : ( ( rule__PortType__NameAssignment_2 ) ) ;
    public final void rule__PortType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2356:1: ( ( ( rule__PortType__NameAssignment_2 ) ) )
            // InternalDSL.g:2357:1: ( ( rule__PortType__NameAssignment_2 ) )
            {
            // InternalDSL.g:2357:1: ( ( rule__PortType__NameAssignment_2 ) )
            // InternalDSL.g:2358:2: ( rule__PortType__NameAssignment_2 )
            {
             before(grammarAccess.getPortTypeAccess().getNameAssignment_2()); 
            // InternalDSL.g:2359:2: ( rule__PortType__NameAssignment_2 )
            // InternalDSL.g:2359:3: rule__PortType__NameAssignment_2
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
    // InternalDSL.g:2367:1: rule__PortType__Group__3 : rule__PortType__Group__3__Impl rule__PortType__Group__4 ;
    public final void rule__PortType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2371:1: ( rule__PortType__Group__3__Impl rule__PortType__Group__4 )
            // InternalDSL.g:2372:2: rule__PortType__Group__3__Impl rule__PortType__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalDSL.g:2379:1: rule__PortType__Group__3__Impl : ( '{' ) ;
    public final void rule__PortType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2383:1: ( ( '{' ) )
            // InternalDSL.g:2384:1: ( '{' )
            {
            // InternalDSL.g:2384:1: ( '{' )
            // InternalDSL.g:2385:2: '{'
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
    // InternalDSL.g:2394:1: rule__PortType__Group__4 : rule__PortType__Group__4__Impl rule__PortType__Group__5 ;
    public final void rule__PortType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2398:1: ( rule__PortType__Group__4__Impl rule__PortType__Group__5 )
            // InternalDSL.g:2399:2: rule__PortType__Group__4__Impl rule__PortType__Group__5
            {
            pushFollow(FOLLOW_26);
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
    // InternalDSL.g:2406:1: rule__PortType__Group__4__Impl : ( ( rule__PortType__ElementsAssignment_4 )* ) ;
    public final void rule__PortType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2410:1: ( ( ( rule__PortType__ElementsAssignment_4 )* ) )
            // InternalDSL.g:2411:1: ( ( rule__PortType__ElementsAssignment_4 )* )
            {
            // InternalDSL.g:2411:1: ( ( rule__PortType__ElementsAssignment_4 )* )
            // InternalDSL.g:2412:2: ( rule__PortType__ElementsAssignment_4 )*
            {
             before(grammarAccess.getPortTypeAccess().getElementsAssignment_4()); 
            // InternalDSL.g:2413:2: ( rule__PortType__ElementsAssignment_4 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_STRING && LA18_0<=RULE_ID)||LA18_0==19) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalDSL.g:2413:3: rule__PortType__ElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__PortType__ElementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalDSL.g:2421:1: rule__PortType__Group__5 : rule__PortType__Group__5__Impl ;
    public final void rule__PortType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2425:1: ( rule__PortType__Group__5__Impl )
            // InternalDSL.g:2426:2: rule__PortType__Group__5__Impl
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
    // InternalDSL.g:2432:1: rule__PortType__Group__5__Impl : ( '}' ) ;
    public final void rule__PortType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2436:1: ( ( '}' ) )
            // InternalDSL.g:2437:1: ( '}' )
            {
            // InternalDSL.g:2437:1: ( '}' )
            // InternalDSL.g:2438:2: '}'
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
    // InternalDSL.g:2448:1: rule__RoleModel__Group__0 : rule__RoleModel__Group__0__Impl rule__RoleModel__Group__1 ;
    public final void rule__RoleModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2452:1: ( rule__RoleModel__Group__0__Impl rule__RoleModel__Group__1 )
            // InternalDSL.g:2453:2: rule__RoleModel__Group__0__Impl rule__RoleModel__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalDSL.g:2460:1: rule__RoleModel__Group__0__Impl : ( () ) ;
    public final void rule__RoleModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2464:1: ( ( () ) )
            // InternalDSL.g:2465:1: ( () )
            {
            // InternalDSL.g:2465:1: ( () )
            // InternalDSL.g:2466:2: ()
            {
             before(grammarAccess.getRoleModelAccess().getRoleModelAction_0()); 
            // InternalDSL.g:2467:2: ()
            // InternalDSL.g:2467:3: 
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
    // InternalDSL.g:2475:1: rule__RoleModel__Group__1 : rule__RoleModel__Group__1__Impl rule__RoleModel__Group__2 ;
    public final void rule__RoleModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2479:1: ( rule__RoleModel__Group__1__Impl rule__RoleModel__Group__2 )
            // InternalDSL.g:2480:2: rule__RoleModel__Group__1__Impl rule__RoleModel__Group__2
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
    // InternalDSL.g:2487:1: rule__RoleModel__Group__1__Impl : ( 'RoleModel' ) ;
    public final void rule__RoleModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2491:1: ( ( 'RoleModel' ) )
            // InternalDSL.g:2492:1: ( 'RoleModel' )
            {
            // InternalDSL.g:2492:1: ( 'RoleModel' )
            // InternalDSL.g:2493:2: 'RoleModel'
            {
             before(grammarAccess.getRoleModelAccess().getRoleModelKeyword_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalDSL.g:2502:1: rule__RoleModel__Group__2 : rule__RoleModel__Group__2__Impl rule__RoleModel__Group__3 ;
    public final void rule__RoleModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2506:1: ( rule__RoleModel__Group__2__Impl rule__RoleModel__Group__3 )
            // InternalDSL.g:2507:2: rule__RoleModel__Group__2__Impl rule__RoleModel__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalDSL.g:2514:1: rule__RoleModel__Group__2__Impl : ( ( rule__RoleModel__NameAssignment_2 ) ) ;
    public final void rule__RoleModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2518:1: ( ( ( rule__RoleModel__NameAssignment_2 ) ) )
            // InternalDSL.g:2519:1: ( ( rule__RoleModel__NameAssignment_2 ) )
            {
            // InternalDSL.g:2519:1: ( ( rule__RoleModel__NameAssignment_2 ) )
            // InternalDSL.g:2520:2: ( rule__RoleModel__NameAssignment_2 )
            {
             before(grammarAccess.getRoleModelAccess().getNameAssignment_2()); 
            // InternalDSL.g:2521:2: ( rule__RoleModel__NameAssignment_2 )
            // InternalDSL.g:2521:3: rule__RoleModel__NameAssignment_2
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
    // InternalDSL.g:2529:1: rule__RoleModel__Group__3 : rule__RoleModel__Group__3__Impl rule__RoleModel__Group__4 ;
    public final void rule__RoleModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2533:1: ( rule__RoleModel__Group__3__Impl rule__RoleModel__Group__4 )
            // InternalDSL.g:2534:2: rule__RoleModel__Group__3__Impl rule__RoleModel__Group__4
            {
            pushFollow(FOLLOW_29);
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
    // InternalDSL.g:2541:1: rule__RoleModel__Group__3__Impl : ( ( rule__RoleModel__Group_3__0 )? ) ;
    public final void rule__RoleModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2545:1: ( ( ( rule__RoleModel__Group_3__0 )? ) )
            // InternalDSL.g:2546:1: ( ( rule__RoleModel__Group_3__0 )? )
            {
            // InternalDSL.g:2546:1: ( ( rule__RoleModel__Group_3__0 )? )
            // InternalDSL.g:2547:2: ( rule__RoleModel__Group_3__0 )?
            {
             before(grammarAccess.getRoleModelAccess().getGroup_3()); 
            // InternalDSL.g:2548:2: ( rule__RoleModel__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==20) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDSL.g:2548:3: rule__RoleModel__Group_3__0
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
    // InternalDSL.g:2556:1: rule__RoleModel__Group__4 : rule__RoleModel__Group__4__Impl rule__RoleModel__Group__5 ;
    public final void rule__RoleModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2560:1: ( rule__RoleModel__Group__4__Impl rule__RoleModel__Group__5 )
            // InternalDSL.g:2561:2: rule__RoleModel__Group__4__Impl rule__RoleModel__Group__5
            {
            pushFollow(FOLLOW_30);
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
    // InternalDSL.g:2568:1: rule__RoleModel__Group__4__Impl : ( '{' ) ;
    public final void rule__RoleModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2572:1: ( ( '{' ) )
            // InternalDSL.g:2573:1: ( '{' )
            {
            // InternalDSL.g:2573:1: ( '{' )
            // InternalDSL.g:2574:2: '{'
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
    // InternalDSL.g:2583:1: rule__RoleModel__Group__5 : rule__RoleModel__Group__5__Impl rule__RoleModel__Group__6 ;
    public final void rule__RoleModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2587:1: ( rule__RoleModel__Group__5__Impl rule__RoleModel__Group__6 )
            // InternalDSL.g:2588:2: rule__RoleModel__Group__5__Impl rule__RoleModel__Group__6
            {
            pushFollow(FOLLOW_30);
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
    // InternalDSL.g:2595:1: rule__RoleModel__Group__5__Impl : ( ( rule__RoleModel__InitializationAssignment_5 )* ) ;
    public final void rule__RoleModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2599:1: ( ( ( rule__RoleModel__InitializationAssignment_5 )* ) )
            // InternalDSL.g:2600:1: ( ( rule__RoleModel__InitializationAssignment_5 )* )
            {
            // InternalDSL.g:2600:1: ( ( rule__RoleModel__InitializationAssignment_5 )* )
            // InternalDSL.g:2601:2: ( rule__RoleModel__InitializationAssignment_5 )*
            {
             before(grammarAccess.getRoleModelAccess().getInitializationAssignment_5()); 
            // InternalDSL.g:2602:2: ( rule__RoleModel__InitializationAssignment_5 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==27) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalDSL.g:2602:3: rule__RoleModel__InitializationAssignment_5
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__RoleModel__InitializationAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalDSL.g:2610:1: rule__RoleModel__Group__6 : rule__RoleModel__Group__6__Impl ;
    public final void rule__RoleModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2614:1: ( rule__RoleModel__Group__6__Impl )
            // InternalDSL.g:2615:2: rule__RoleModel__Group__6__Impl
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
    // InternalDSL.g:2621:1: rule__RoleModel__Group__6__Impl : ( '}' ) ;
    public final void rule__RoleModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2625:1: ( ( '}' ) )
            // InternalDSL.g:2626:1: ( '}' )
            {
            // InternalDSL.g:2626:1: ( '}' )
            // InternalDSL.g:2627:2: '}'
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
    // InternalDSL.g:2637:1: rule__RoleModel__Group_3__0 : rule__RoleModel__Group_3__0__Impl rule__RoleModel__Group_3__1 ;
    public final void rule__RoleModel__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2641:1: ( rule__RoleModel__Group_3__0__Impl rule__RoleModel__Group_3__1 )
            // InternalDSL.g:2642:2: rule__RoleModel__Group_3__0__Impl rule__RoleModel__Group_3__1
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
    // InternalDSL.g:2649:1: rule__RoleModel__Group_3__0__Impl : ( '(' ) ;
    public final void rule__RoleModel__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2653:1: ( ( '(' ) )
            // InternalDSL.g:2654:1: ( '(' )
            {
            // InternalDSL.g:2654:1: ( '(' )
            // InternalDSL.g:2655:2: '('
            {
             before(grammarAccess.getRoleModelAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalDSL.g:2664:1: rule__RoleModel__Group_3__1 : rule__RoleModel__Group_3__1__Impl rule__RoleModel__Group_3__2 ;
    public final void rule__RoleModel__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2668:1: ( rule__RoleModel__Group_3__1__Impl rule__RoleModel__Group_3__2 )
            // InternalDSL.g:2669:2: rule__RoleModel__Group_3__1__Impl rule__RoleModel__Group_3__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalDSL.g:2676:1: rule__RoleModel__Group_3__1__Impl : ( ( rule__RoleModel__SlotsAssignment_3_1 ) ) ;
    public final void rule__RoleModel__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2680:1: ( ( ( rule__RoleModel__SlotsAssignment_3_1 ) ) )
            // InternalDSL.g:2681:1: ( ( rule__RoleModel__SlotsAssignment_3_1 ) )
            {
            // InternalDSL.g:2681:1: ( ( rule__RoleModel__SlotsAssignment_3_1 ) )
            // InternalDSL.g:2682:2: ( rule__RoleModel__SlotsAssignment_3_1 )
            {
             before(grammarAccess.getRoleModelAccess().getSlotsAssignment_3_1()); 
            // InternalDSL.g:2683:2: ( rule__RoleModel__SlotsAssignment_3_1 )
            // InternalDSL.g:2683:3: rule__RoleModel__SlotsAssignment_3_1
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
    // InternalDSL.g:2691:1: rule__RoleModel__Group_3__2 : rule__RoleModel__Group_3__2__Impl rule__RoleModel__Group_3__3 ;
    public final void rule__RoleModel__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2695:1: ( rule__RoleModel__Group_3__2__Impl rule__RoleModel__Group_3__3 )
            // InternalDSL.g:2696:2: rule__RoleModel__Group_3__2__Impl rule__RoleModel__Group_3__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalDSL.g:2703:1: rule__RoleModel__Group_3__2__Impl : ( ( rule__RoleModel__Group_3_2__0 )* ) ;
    public final void rule__RoleModel__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2707:1: ( ( ( rule__RoleModel__Group_3_2__0 )* ) )
            // InternalDSL.g:2708:1: ( ( rule__RoleModel__Group_3_2__0 )* )
            {
            // InternalDSL.g:2708:1: ( ( rule__RoleModel__Group_3_2__0 )* )
            // InternalDSL.g:2709:2: ( rule__RoleModel__Group_3_2__0 )*
            {
             before(grammarAccess.getRoleModelAccess().getGroup_3_2()); 
            // InternalDSL.g:2710:2: ( rule__RoleModel__Group_3_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==22) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalDSL.g:2710:3: rule__RoleModel__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__RoleModel__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalDSL.g:2718:1: rule__RoleModel__Group_3__3 : rule__RoleModel__Group_3__3__Impl ;
    public final void rule__RoleModel__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2722:1: ( rule__RoleModel__Group_3__3__Impl )
            // InternalDSL.g:2723:2: rule__RoleModel__Group_3__3__Impl
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
    // InternalDSL.g:2729:1: rule__RoleModel__Group_3__3__Impl : ( ')' ) ;
    public final void rule__RoleModel__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2733:1: ( ( ')' ) )
            // InternalDSL.g:2734:1: ( ')' )
            {
            // InternalDSL.g:2734:1: ( ')' )
            // InternalDSL.g:2735:2: ')'
            {
             before(grammarAccess.getRoleModelAccess().getRightParenthesisKeyword_3_3()); 
            match(input,21,FOLLOW_2); 
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
    // InternalDSL.g:2745:1: rule__RoleModel__Group_3_2__0 : rule__RoleModel__Group_3_2__0__Impl rule__RoleModel__Group_3_2__1 ;
    public final void rule__RoleModel__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2749:1: ( rule__RoleModel__Group_3_2__0__Impl rule__RoleModel__Group_3_2__1 )
            // InternalDSL.g:2750:2: rule__RoleModel__Group_3_2__0__Impl rule__RoleModel__Group_3_2__1
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
    // InternalDSL.g:2757:1: rule__RoleModel__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__RoleModel__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2761:1: ( ( ',' ) )
            // InternalDSL.g:2762:1: ( ',' )
            {
            // InternalDSL.g:2762:1: ( ',' )
            // InternalDSL.g:2763:2: ','
            {
             before(grammarAccess.getRoleModelAccess().getCommaKeyword_3_2_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalDSL.g:2772:1: rule__RoleModel__Group_3_2__1 : rule__RoleModel__Group_3_2__1__Impl ;
    public final void rule__RoleModel__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2776:1: ( rule__RoleModel__Group_3_2__1__Impl )
            // InternalDSL.g:2777:2: rule__RoleModel__Group_3_2__1__Impl
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
    // InternalDSL.g:2783:1: rule__RoleModel__Group_3_2__1__Impl : ( ( rule__RoleModel__SlotsAssignment_3_2_1 ) ) ;
    public final void rule__RoleModel__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2787:1: ( ( ( rule__RoleModel__SlotsAssignment_3_2_1 ) ) )
            // InternalDSL.g:2788:1: ( ( rule__RoleModel__SlotsAssignment_3_2_1 ) )
            {
            // InternalDSL.g:2788:1: ( ( rule__RoleModel__SlotsAssignment_3_2_1 ) )
            // InternalDSL.g:2789:2: ( rule__RoleModel__SlotsAssignment_3_2_1 )
            {
             before(grammarAccess.getRoleModelAccess().getSlotsAssignment_3_2_1()); 
            // InternalDSL.g:2790:2: ( rule__RoleModel__SlotsAssignment_3_2_1 )
            // InternalDSL.g:2790:3: rule__RoleModel__SlotsAssignment_3_2_1
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
    // InternalDSL.g:2799:1: rule__RoleModelSlot__Group__0 : rule__RoleModelSlot__Group__0__Impl rule__RoleModelSlot__Group__1 ;
    public final void rule__RoleModelSlot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2803:1: ( rule__RoleModelSlot__Group__0__Impl rule__RoleModelSlot__Group__1 )
            // InternalDSL.g:2804:2: rule__RoleModelSlot__Group__0__Impl rule__RoleModelSlot__Group__1
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
    // InternalDSL.g:2811:1: rule__RoleModelSlot__Group__0__Impl : ( () ) ;
    public final void rule__RoleModelSlot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2815:1: ( ( () ) )
            // InternalDSL.g:2816:1: ( () )
            {
            // InternalDSL.g:2816:1: ( () )
            // InternalDSL.g:2817:2: ()
            {
             before(grammarAccess.getRoleModelSlotAccess().getRoleModelSlotAction_0()); 
            // InternalDSL.g:2818:2: ()
            // InternalDSL.g:2818:3: 
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
    // InternalDSL.g:2826:1: rule__RoleModelSlot__Group__1 : rule__RoleModelSlot__Group__1__Impl rule__RoleModelSlot__Group__2 ;
    public final void rule__RoleModelSlot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2830:1: ( rule__RoleModelSlot__Group__1__Impl rule__RoleModelSlot__Group__2 )
            // InternalDSL.g:2831:2: rule__RoleModelSlot__Group__1__Impl rule__RoleModelSlot__Group__2
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
    // InternalDSL.g:2838:1: rule__RoleModelSlot__Group__1__Impl : ( ( rule__RoleModelSlot__TypeAssignment_1 ) ) ;
    public final void rule__RoleModelSlot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2842:1: ( ( ( rule__RoleModelSlot__TypeAssignment_1 ) ) )
            // InternalDSL.g:2843:1: ( ( rule__RoleModelSlot__TypeAssignment_1 ) )
            {
            // InternalDSL.g:2843:1: ( ( rule__RoleModelSlot__TypeAssignment_1 ) )
            // InternalDSL.g:2844:2: ( rule__RoleModelSlot__TypeAssignment_1 )
            {
             before(grammarAccess.getRoleModelSlotAccess().getTypeAssignment_1()); 
            // InternalDSL.g:2845:2: ( rule__RoleModelSlot__TypeAssignment_1 )
            // InternalDSL.g:2845:3: rule__RoleModelSlot__TypeAssignment_1
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
    // InternalDSL.g:2853:1: rule__RoleModelSlot__Group__2 : rule__RoleModelSlot__Group__2__Impl ;
    public final void rule__RoleModelSlot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2857:1: ( rule__RoleModelSlot__Group__2__Impl )
            // InternalDSL.g:2858:2: rule__RoleModelSlot__Group__2__Impl
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
    // InternalDSL.g:2864:1: rule__RoleModelSlot__Group__2__Impl : ( ( rule__RoleModelSlot__NameAssignment_2 ) ) ;
    public final void rule__RoleModelSlot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2868:1: ( ( ( rule__RoleModelSlot__NameAssignment_2 ) ) )
            // InternalDSL.g:2869:1: ( ( rule__RoleModelSlot__NameAssignment_2 ) )
            {
            // InternalDSL.g:2869:1: ( ( rule__RoleModelSlot__NameAssignment_2 ) )
            // InternalDSL.g:2870:2: ( rule__RoleModelSlot__NameAssignment_2 )
            {
             before(grammarAccess.getRoleModelSlotAccess().getNameAssignment_2()); 
            // InternalDSL.g:2871:2: ( rule__RoleModelSlot__NameAssignment_2 )
            // InternalDSL.g:2871:3: rule__RoleModelSlot__NameAssignment_2
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
    // InternalDSL.g:2880:1: rule__BindOperator__Group__0 : rule__BindOperator__Group__0__Impl rule__BindOperator__Group__1 ;
    public final void rule__BindOperator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2884:1: ( rule__BindOperator__Group__0__Impl rule__BindOperator__Group__1 )
            // InternalDSL.g:2885:2: rule__BindOperator__Group__0__Impl rule__BindOperator__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalDSL.g:2892:1: rule__BindOperator__Group__0__Impl : ( () ) ;
    public final void rule__BindOperator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2896:1: ( ( () ) )
            // InternalDSL.g:2897:1: ( () )
            {
            // InternalDSL.g:2897:1: ( () )
            // InternalDSL.g:2898:2: ()
            {
             before(grammarAccess.getBindOperatorAccess().getBindOperatorAction_0()); 
            // InternalDSL.g:2899:2: ()
            // InternalDSL.g:2899:3: 
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
    // InternalDSL.g:2907:1: rule__BindOperator__Group__1 : rule__BindOperator__Group__1__Impl rule__BindOperator__Group__2 ;
    public final void rule__BindOperator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2911:1: ( rule__BindOperator__Group__1__Impl rule__BindOperator__Group__2 )
            // InternalDSL.g:2912:2: rule__BindOperator__Group__1__Impl rule__BindOperator__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalDSL.g:2919:1: rule__BindOperator__Group__1__Impl : ( 'bind' ) ;
    public final void rule__BindOperator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2923:1: ( ( 'bind' ) )
            // InternalDSL.g:2924:1: ( 'bind' )
            {
            // InternalDSL.g:2924:1: ( 'bind' )
            // InternalDSL.g:2925:2: 'bind'
            {
             before(grammarAccess.getBindOperatorAccess().getBindKeyword_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalDSL.g:2934:1: rule__BindOperator__Group__2 : rule__BindOperator__Group__2__Impl rule__BindOperator__Group__3 ;
    public final void rule__BindOperator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2938:1: ( rule__BindOperator__Group__2__Impl rule__BindOperator__Group__3 )
            // InternalDSL.g:2939:2: rule__BindOperator__Group__2__Impl rule__BindOperator__Group__3
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
    // InternalDSL.g:2946:1: rule__BindOperator__Group__2__Impl : ( 'role' ) ;
    public final void rule__BindOperator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2950:1: ( ( 'role' ) )
            // InternalDSL.g:2951:1: ( 'role' )
            {
            // InternalDSL.g:2951:1: ( 'role' )
            // InternalDSL.g:2952:2: 'role'
            {
             before(grammarAccess.getBindOperatorAccess().getRoleKeyword_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalDSL.g:2961:1: rule__BindOperator__Group__3 : rule__BindOperator__Group__3__Impl rule__BindOperator__Group__4 ;
    public final void rule__BindOperator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2965:1: ( rule__BindOperator__Group__3__Impl rule__BindOperator__Group__4 )
            // InternalDSL.g:2966:2: rule__BindOperator__Group__3__Impl rule__BindOperator__Group__4
            {
            pushFollow(FOLLOW_35);
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
    // InternalDSL.g:2973:1: rule__BindOperator__Group__3__Impl : ( ( rule__BindOperator__ToAssignment_3 ) ) ;
    public final void rule__BindOperator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2977:1: ( ( ( rule__BindOperator__ToAssignment_3 ) ) )
            // InternalDSL.g:2978:1: ( ( rule__BindOperator__ToAssignment_3 ) )
            {
            // InternalDSL.g:2978:1: ( ( rule__BindOperator__ToAssignment_3 ) )
            // InternalDSL.g:2979:2: ( rule__BindOperator__ToAssignment_3 )
            {
             before(grammarAccess.getBindOperatorAccess().getToAssignment_3()); 
            // InternalDSL.g:2980:2: ( rule__BindOperator__ToAssignment_3 )
            // InternalDSL.g:2980:3: rule__BindOperator__ToAssignment_3
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
    // InternalDSL.g:2988:1: rule__BindOperator__Group__4 : rule__BindOperator__Group__4__Impl rule__BindOperator__Group__5 ;
    public final void rule__BindOperator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2992:1: ( rule__BindOperator__Group__4__Impl rule__BindOperator__Group__5 )
            // InternalDSL.g:2993:2: rule__BindOperator__Group__4__Impl rule__BindOperator__Group__5
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
    // InternalDSL.g:3000:1: rule__BindOperator__Group__4__Impl : ( 'to' ) ;
    public final void rule__BindOperator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3004:1: ( ( 'to' ) )
            // InternalDSL.g:3005:1: ( 'to' )
            {
            // InternalDSL.g:3005:1: ( 'to' )
            // InternalDSL.g:3006:2: 'to'
            {
             before(grammarAccess.getBindOperatorAccess().getToKeyword_4()); 
            match(input,29,FOLLOW_2); 
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
    // InternalDSL.g:3015:1: rule__BindOperator__Group__5 : rule__BindOperator__Group__5__Impl rule__BindOperator__Group__6 ;
    public final void rule__BindOperator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3019:1: ( rule__BindOperator__Group__5__Impl rule__BindOperator__Group__6 )
            // InternalDSL.g:3020:2: rule__BindOperator__Group__5__Impl rule__BindOperator__Group__6
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
    // InternalDSL.g:3027:1: rule__BindOperator__Group__5__Impl : ( ( rule__BindOperator__SlotAssignment_5 ) ) ;
    public final void rule__BindOperator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3031:1: ( ( ( rule__BindOperator__SlotAssignment_5 ) ) )
            // InternalDSL.g:3032:1: ( ( rule__BindOperator__SlotAssignment_5 ) )
            {
            // InternalDSL.g:3032:1: ( ( rule__BindOperator__SlotAssignment_5 ) )
            // InternalDSL.g:3033:2: ( rule__BindOperator__SlotAssignment_5 )
            {
             before(grammarAccess.getBindOperatorAccess().getSlotAssignment_5()); 
            // InternalDSL.g:3034:2: ( rule__BindOperator__SlotAssignment_5 )
            // InternalDSL.g:3034:3: rule__BindOperator__SlotAssignment_5
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
    // InternalDSL.g:3042:1: rule__BindOperator__Group__6 : rule__BindOperator__Group__6__Impl ;
    public final void rule__BindOperator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3046:1: ( rule__BindOperator__Group__6__Impl )
            // InternalDSL.g:3047:2: rule__BindOperator__Group__6__Impl
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
    // InternalDSL.g:3053:1: rule__BindOperator__Group__6__Impl : ( ';' ) ;
    public final void rule__BindOperator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3057:1: ( ( ';' ) )
            // InternalDSL.g:3058:1: ( ';' )
            {
            // InternalDSL.g:3058:1: ( ';' )
            // InternalDSL.g:3059:2: ';'
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
    // InternalDSL.g:3069:1: rule__Architecture__Group__0 : rule__Architecture__Group__0__Impl rule__Architecture__Group__1 ;
    public final void rule__Architecture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3073:1: ( rule__Architecture__Group__0__Impl rule__Architecture__Group__1 )
            // InternalDSL.g:3074:2: rule__Architecture__Group__0__Impl rule__Architecture__Group__1
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
    // InternalDSL.g:3081:1: rule__Architecture__Group__0__Impl : ( 'Architecture' ) ;
    public final void rule__Architecture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3085:1: ( ( 'Architecture' ) )
            // InternalDSL.g:3086:1: ( 'Architecture' )
            {
            // InternalDSL.g:3086:1: ( 'Architecture' )
            // InternalDSL.g:3087:2: 'Architecture'
            {
             before(grammarAccess.getArchitectureAccess().getArchitectureKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalDSL.g:3096:1: rule__Architecture__Group__1 : rule__Architecture__Group__1__Impl rule__Architecture__Group__2 ;
    public final void rule__Architecture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3100:1: ( rule__Architecture__Group__1__Impl rule__Architecture__Group__2 )
            // InternalDSL.g:3101:2: rule__Architecture__Group__1__Impl rule__Architecture__Group__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalDSL.g:3108:1: rule__Architecture__Group__1__Impl : ( ( rule__Architecture__NameAssignment_1 ) ) ;
    public final void rule__Architecture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3112:1: ( ( ( rule__Architecture__NameAssignment_1 ) ) )
            // InternalDSL.g:3113:1: ( ( rule__Architecture__NameAssignment_1 ) )
            {
            // InternalDSL.g:3113:1: ( ( rule__Architecture__NameAssignment_1 ) )
            // InternalDSL.g:3114:2: ( rule__Architecture__NameAssignment_1 )
            {
             before(grammarAccess.getArchitectureAccess().getNameAssignment_1()); 
            // InternalDSL.g:3115:2: ( rule__Architecture__NameAssignment_1 )
            // InternalDSL.g:3115:3: rule__Architecture__NameAssignment_1
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
    // InternalDSL.g:3123:1: rule__Architecture__Group__2 : rule__Architecture__Group__2__Impl rule__Architecture__Group__3 ;
    public final void rule__Architecture__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3127:1: ( rule__Architecture__Group__2__Impl rule__Architecture__Group__3 )
            // InternalDSL.g:3128:2: rule__Architecture__Group__2__Impl rule__Architecture__Group__3
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
    // InternalDSL.g:3135:1: rule__Architecture__Group__2__Impl : ( '::' ) ;
    public final void rule__Architecture__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3139:1: ( ( '::' ) )
            // InternalDSL.g:3140:1: ( '::' )
            {
            // InternalDSL.g:3140:1: ( '::' )
            // InternalDSL.g:3141:2: '::'
            {
             before(grammarAccess.getArchitectureAccess().getColonColonKeyword_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalDSL.g:3150:1: rule__Architecture__Group__3 : rule__Architecture__Group__3__Impl rule__Architecture__Group__4 ;
    public final void rule__Architecture__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3154:1: ( rule__Architecture__Group__3__Impl rule__Architecture__Group__4 )
            // InternalDSL.g:3155:2: rule__Architecture__Group__3__Impl rule__Architecture__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalDSL.g:3162:1: rule__Architecture__Group__3__Impl : ( ( rule__Architecture__TypeAssignment_3 ) ) ;
    public final void rule__Architecture__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3166:1: ( ( ( rule__Architecture__TypeAssignment_3 ) ) )
            // InternalDSL.g:3167:1: ( ( rule__Architecture__TypeAssignment_3 ) )
            {
            // InternalDSL.g:3167:1: ( ( rule__Architecture__TypeAssignment_3 ) )
            // InternalDSL.g:3168:2: ( rule__Architecture__TypeAssignment_3 )
            {
             before(grammarAccess.getArchitectureAccess().getTypeAssignment_3()); 
            // InternalDSL.g:3169:2: ( rule__Architecture__TypeAssignment_3 )
            // InternalDSL.g:3169:3: rule__Architecture__TypeAssignment_3
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
    // InternalDSL.g:3177:1: rule__Architecture__Group__4 : rule__Architecture__Group__4__Impl rule__Architecture__Group__5 ;
    public final void rule__Architecture__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3181:1: ( rule__Architecture__Group__4__Impl rule__Architecture__Group__5 )
            // InternalDSL.g:3182:2: rule__Architecture__Group__4__Impl rule__Architecture__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalDSL.g:3189:1: rule__Architecture__Group__4__Impl : ( ( rule__Architecture__Group_4__0 )? ) ;
    public final void rule__Architecture__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3193:1: ( ( ( rule__Architecture__Group_4__0 )? ) )
            // InternalDSL.g:3194:1: ( ( rule__Architecture__Group_4__0 )? )
            {
            // InternalDSL.g:3194:1: ( ( rule__Architecture__Group_4__0 )? )
            // InternalDSL.g:3195:2: ( rule__Architecture__Group_4__0 )?
            {
             before(grammarAccess.getArchitectureAccess().getGroup_4()); 
            // InternalDSL.g:3196:2: ( rule__Architecture__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==16) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalDSL.g:3196:3: rule__Architecture__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Architecture__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArchitectureAccess().getGroup_4()); 

            }


            }

        }
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
    // InternalDSL.g:3204:1: rule__Architecture__Group__5 : rule__Architecture__Group__5__Impl rule__Architecture__Group__6 ;
    public final void rule__Architecture__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3208:1: ( rule__Architecture__Group__5__Impl rule__Architecture__Group__6 )
            // InternalDSL.g:3209:2: rule__Architecture__Group__5__Impl rule__Architecture__Group__6
            {
            pushFollow(FOLLOW_37);
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
    // InternalDSL.g:3216:1: rule__Architecture__Group__5__Impl : ( '{' ) ;
    public final void rule__Architecture__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3220:1: ( ( '{' ) )
            // InternalDSL.g:3221:1: ( '{' )
            {
            // InternalDSL.g:3221:1: ( '{' )
            // InternalDSL.g:3222:2: '{'
            {
             before(grammarAccess.getArchitectureAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getArchitectureAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
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
    // InternalDSL.g:3231:1: rule__Architecture__Group__6 : rule__Architecture__Group__6__Impl rule__Architecture__Group__7 ;
    public final void rule__Architecture__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3235:1: ( rule__Architecture__Group__6__Impl rule__Architecture__Group__7 )
            // InternalDSL.g:3236:2: rule__Architecture__Group__6__Impl rule__Architecture__Group__7
            {
            pushFollow(FOLLOW_37);
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
    // InternalDSL.g:3243:1: rule__Architecture__Group__6__Impl : ( ( rule__Architecture__TypeBindingsAssignment_6 )* ) ;
    public final void rule__Architecture__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3247:1: ( ( ( rule__Architecture__TypeBindingsAssignment_6 )* ) )
            // InternalDSL.g:3248:1: ( ( rule__Architecture__TypeBindingsAssignment_6 )* )
            {
            // InternalDSL.g:3248:1: ( ( rule__Architecture__TypeBindingsAssignment_6 )* )
            // InternalDSL.g:3249:2: ( rule__Architecture__TypeBindingsAssignment_6 )*
            {
             before(grammarAccess.getArchitectureAccess().getTypeBindingsAssignment_6()); 
            // InternalDSL.g:3250:2: ( rule__Architecture__TypeBindingsAssignment_6 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalDSL.g:3250:3: rule__Architecture__TypeBindingsAssignment_6
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__Architecture__TypeBindingsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getArchitectureAccess().getTypeBindingsAssignment_6()); 

            }


            }

        }
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
    // InternalDSL.g:3258:1: rule__Architecture__Group__7 : rule__Architecture__Group__7__Impl rule__Architecture__Group__8 ;
    public final void rule__Architecture__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3262:1: ( rule__Architecture__Group__7__Impl rule__Architecture__Group__8 )
            // InternalDSL.g:3263:2: rule__Architecture__Group__7__Impl rule__Architecture__Group__8
            {
            pushFollow(FOLLOW_5);
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
    // InternalDSL.g:3270:1: rule__Architecture__Group__7__Impl : ( '}' ) ;
    public final void rule__Architecture__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3274:1: ( ( '}' ) )
            // InternalDSL.g:3275:1: ( '}' )
            {
            // InternalDSL.g:3275:1: ( '}' )
            // InternalDSL.g:3276:2: '}'
            {
             before(grammarAccess.getArchitectureAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getArchitectureAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
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
    // InternalDSL.g:3285:1: rule__Architecture__Group__8 : rule__Architecture__Group__8__Impl rule__Architecture__Group__9 ;
    public final void rule__Architecture__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3289:1: ( rule__Architecture__Group__8__Impl rule__Architecture__Group__9 )
            // InternalDSL.g:3290:2: rule__Architecture__Group__8__Impl rule__Architecture__Group__9
            {
            pushFollow(FOLLOW_39);
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
    // InternalDSL.g:3297:1: rule__Architecture__Group__8__Impl : ( '{' ) ;
    public final void rule__Architecture__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3301:1: ( ( '{' ) )
            // InternalDSL.g:3302:1: ( '{' )
            {
            // InternalDSL.g:3302:1: ( '{' )
            // InternalDSL.g:3303:2: '{'
            {
             before(grammarAccess.getArchitectureAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getArchitectureAccess().getLeftCurlyBracketKeyword_8()); 

            }


            }

        }
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
    // InternalDSL.g:3312:1: rule__Architecture__Group__9 : rule__Architecture__Group__9__Impl rule__Architecture__Group__10 ;
    public final void rule__Architecture__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3316:1: ( rule__Architecture__Group__9__Impl rule__Architecture__Group__10 )
            // InternalDSL.g:3317:2: rule__Architecture__Group__9__Impl rule__Architecture__Group__10
            {
            pushFollow(FOLLOW_39);
            rule__Architecture__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Architecture__Group__10();

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
    // InternalDSL.g:3324:1: rule__Architecture__Group__9__Impl : ( ( rule__Architecture__ElementsAssignment_9 )* ) ;
    public final void rule__Architecture__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3328:1: ( ( ( rule__Architecture__ElementsAssignment_9 )* ) )
            // InternalDSL.g:3329:1: ( ( rule__Architecture__ElementsAssignment_9 )* )
            {
            // InternalDSL.g:3329:1: ( ( rule__Architecture__ElementsAssignment_9 )* )
            // InternalDSL.g:3330:2: ( rule__Architecture__ElementsAssignment_9 )*
            {
             before(grammarAccess.getArchitectureAccess().getElementsAssignment_9()); 
            // InternalDSL.g:3331:2: ( rule__Architecture__ElementsAssignment_9 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=32 && LA24_0<=33)||LA24_0==35) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalDSL.g:3331:3: rule__Architecture__ElementsAssignment_9
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__Architecture__ElementsAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getArchitectureAccess().getElementsAssignment_9()); 

            }


            }

        }
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


    // $ANTLR start "rule__Architecture__Group__10"
    // InternalDSL.g:3339:1: rule__Architecture__Group__10 : rule__Architecture__Group__10__Impl ;
    public final void rule__Architecture__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3343:1: ( rule__Architecture__Group__10__Impl )
            // InternalDSL.g:3344:2: rule__Architecture__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Architecture__Group__10__Impl();

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
    // $ANTLR end "rule__Architecture__Group__10"


    // $ANTLR start "rule__Architecture__Group__10__Impl"
    // InternalDSL.g:3350:1: rule__Architecture__Group__10__Impl : ( '}' ) ;
    public final void rule__Architecture__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3354:1: ( ( '}' ) )
            // InternalDSL.g:3355:1: ( '}' )
            {
            // InternalDSL.g:3355:1: ( '}' )
            // InternalDSL.g:3356:2: '}'
            {
             before(grammarAccess.getArchitectureAccess().getRightCurlyBracketKeyword_10()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getArchitectureAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architecture__Group__10__Impl"


    // $ANTLR start "rule__Architecture__Group_4__0"
    // InternalDSL.g:3366:1: rule__Architecture__Group_4__0 : rule__Architecture__Group_4__0__Impl rule__Architecture__Group_4__1 ;
    public final void rule__Architecture__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3370:1: ( rule__Architecture__Group_4__0__Impl rule__Architecture__Group_4__1 )
            // InternalDSL.g:3371:2: rule__Architecture__Group_4__0__Impl rule__Architecture__Group_4__1
            {
            pushFollow(FOLLOW_15);
            rule__Architecture__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Architecture__Group_4__1();

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
    // $ANTLR end "rule__Architecture__Group_4__0"


    // $ANTLR start "rule__Architecture__Group_4__0__Impl"
    // InternalDSL.g:3378:1: rule__Architecture__Group_4__0__Impl : ( 'with' ) ;
    public final void rule__Architecture__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3382:1: ( ( 'with' ) )
            // InternalDSL.g:3383:1: ( 'with' )
            {
            // InternalDSL.g:3383:1: ( 'with' )
            // InternalDSL.g:3384:2: 'with'
            {
             before(grammarAccess.getArchitectureAccess().getWithKeyword_4_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getArchitectureAccess().getWithKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architecture__Group_4__0__Impl"


    // $ANTLR start "rule__Architecture__Group_4__1"
    // InternalDSL.g:3393:1: rule__Architecture__Group_4__1 : rule__Architecture__Group_4__1__Impl rule__Architecture__Group_4__2 ;
    public final void rule__Architecture__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3397:1: ( rule__Architecture__Group_4__1__Impl rule__Architecture__Group_4__2 )
            // InternalDSL.g:3398:2: rule__Architecture__Group_4__1__Impl rule__Architecture__Group_4__2
            {
            pushFollow(FOLLOW_9);
            rule__Architecture__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Architecture__Group_4__2();

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
    // $ANTLR end "rule__Architecture__Group_4__1"


    // $ANTLR start "rule__Architecture__Group_4__1__Impl"
    // InternalDSL.g:3405:1: rule__Architecture__Group_4__1__Impl : ( 'namespace' ) ;
    public final void rule__Architecture__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3409:1: ( ( 'namespace' ) )
            // InternalDSL.g:3410:1: ( 'namespace' )
            {
            // InternalDSL.g:3410:1: ( 'namespace' )
            // InternalDSL.g:3411:2: 'namespace'
            {
             before(grammarAccess.getArchitectureAccess().getNamespaceKeyword_4_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getArchitectureAccess().getNamespaceKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architecture__Group_4__1__Impl"


    // $ANTLR start "rule__Architecture__Group_4__2"
    // InternalDSL.g:3420:1: rule__Architecture__Group_4__2 : rule__Architecture__Group_4__2__Impl ;
    public final void rule__Architecture__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3424:1: ( rule__Architecture__Group_4__2__Impl )
            // InternalDSL.g:3425:2: rule__Architecture__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Architecture__Group_4__2__Impl();

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
    // $ANTLR end "rule__Architecture__Group_4__2"


    // $ANTLR start "rule__Architecture__Group_4__2__Impl"
    // InternalDSL.g:3431:1: rule__Architecture__Group_4__2__Impl : ( ( rule__Architecture__NamespaceAssignment_4_2 ) ) ;
    public final void rule__Architecture__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3435:1: ( ( ( rule__Architecture__NamespaceAssignment_4_2 ) ) )
            // InternalDSL.g:3436:1: ( ( rule__Architecture__NamespaceAssignment_4_2 ) )
            {
            // InternalDSL.g:3436:1: ( ( rule__Architecture__NamespaceAssignment_4_2 ) )
            // InternalDSL.g:3437:2: ( rule__Architecture__NamespaceAssignment_4_2 )
            {
             before(grammarAccess.getArchitectureAccess().getNamespaceAssignment_4_2()); 
            // InternalDSL.g:3438:2: ( rule__Architecture__NamespaceAssignment_4_2 )
            // InternalDSL.g:3438:3: rule__Architecture__NamespaceAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Architecture__NamespaceAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getArchitectureAccess().getNamespaceAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architecture__Group_4__2__Impl"


    // $ANTLR start "rule__Component__Group__0"
    // InternalDSL.g:3447:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3451:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalDSL.g:3452:2: rule__Component__Group__0__Impl rule__Component__Group__1
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
    // InternalDSL.g:3459:1: rule__Component__Group__0__Impl : ( 'Component' ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3463:1: ( ( 'Component' ) )
            // InternalDSL.g:3464:1: ( 'Component' )
            {
            // InternalDSL.g:3464:1: ( 'Component' )
            // InternalDSL.g:3465:2: 'Component'
            {
             before(grammarAccess.getComponentAccess().getComponentKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalDSL.g:3474:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3478:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // InternalDSL.g:3479:2: rule__Component__Group__1__Impl rule__Component__Group__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalDSL.g:3486:1: rule__Component__Group__1__Impl : ( ( rule__Component__NameAssignment_1 ) ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3490:1: ( ( ( rule__Component__NameAssignment_1 ) ) )
            // InternalDSL.g:3491:1: ( ( rule__Component__NameAssignment_1 ) )
            {
            // InternalDSL.g:3491:1: ( ( rule__Component__NameAssignment_1 ) )
            // InternalDSL.g:3492:2: ( rule__Component__NameAssignment_1 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_1()); 
            // InternalDSL.g:3493:2: ( rule__Component__NameAssignment_1 )
            // InternalDSL.g:3493:3: rule__Component__NameAssignment_1
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
    // InternalDSL.g:3501:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3505:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // InternalDSL.g:3506:2: rule__Component__Group__2__Impl rule__Component__Group__3
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
    // InternalDSL.g:3513:1: rule__Component__Group__2__Impl : ( '::' ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3517:1: ( ( '::' ) )
            // InternalDSL.g:3518:1: ( '::' )
            {
            // InternalDSL.g:3518:1: ( '::' )
            // InternalDSL.g:3519:2: '::'
            {
             before(grammarAccess.getComponentAccess().getColonColonKeyword_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalDSL.g:3528:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3532:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // InternalDSL.g:3533:2: rule__Component__Group__3__Impl rule__Component__Group__4
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
    // InternalDSL.g:3540:1: rule__Component__Group__3__Impl : ( ( rule__Component__TypeAssignment_3 ) ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3544:1: ( ( ( rule__Component__TypeAssignment_3 ) ) )
            // InternalDSL.g:3545:1: ( ( rule__Component__TypeAssignment_3 ) )
            {
            // InternalDSL.g:3545:1: ( ( rule__Component__TypeAssignment_3 ) )
            // InternalDSL.g:3546:2: ( rule__Component__TypeAssignment_3 )
            {
             before(grammarAccess.getComponentAccess().getTypeAssignment_3()); 
            // InternalDSL.g:3547:2: ( rule__Component__TypeAssignment_3 )
            // InternalDSL.g:3547:3: rule__Component__TypeAssignment_3
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
    // InternalDSL.g:3555:1: rule__Component__Group__4 : rule__Component__Group__4__Impl ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3559:1: ( rule__Component__Group__4__Impl )
            // InternalDSL.g:3560:2: rule__Component__Group__4__Impl
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
    // InternalDSL.g:3566:1: rule__Component__Group__4__Impl : ( ';' ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3570:1: ( ( ';' ) )
            // InternalDSL.g:3571:1: ( ';' )
            {
            // InternalDSL.g:3571:1: ( ';' )
            // InternalDSL.g:3572:2: ';'
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
    // InternalDSL.g:3582:1: rule__Port__Group__0 : rule__Port__Group__0__Impl rule__Port__Group__1 ;
    public final void rule__Port__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3586:1: ( rule__Port__Group__0__Impl rule__Port__Group__1 )
            // InternalDSL.g:3587:2: rule__Port__Group__0__Impl rule__Port__Group__1
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
    // InternalDSL.g:3594:1: rule__Port__Group__0__Impl : ( 'Port' ) ;
    public final void rule__Port__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3598:1: ( ( 'Port' ) )
            // InternalDSL.g:3599:1: ( 'Port' )
            {
            // InternalDSL.g:3599:1: ( 'Port' )
            // InternalDSL.g:3600:2: 'Port'
            {
             before(grammarAccess.getPortAccess().getPortKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalDSL.g:3609:1: rule__Port__Group__1 : rule__Port__Group__1__Impl rule__Port__Group__2 ;
    public final void rule__Port__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3613:1: ( rule__Port__Group__1__Impl rule__Port__Group__2 )
            // InternalDSL.g:3614:2: rule__Port__Group__1__Impl rule__Port__Group__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalDSL.g:3621:1: rule__Port__Group__1__Impl : ( ( rule__Port__NameAssignment_1 ) ) ;
    public final void rule__Port__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3625:1: ( ( ( rule__Port__NameAssignment_1 ) ) )
            // InternalDSL.g:3626:1: ( ( rule__Port__NameAssignment_1 ) )
            {
            // InternalDSL.g:3626:1: ( ( rule__Port__NameAssignment_1 ) )
            // InternalDSL.g:3627:2: ( rule__Port__NameAssignment_1 )
            {
             before(grammarAccess.getPortAccess().getNameAssignment_1()); 
            // InternalDSL.g:3628:2: ( rule__Port__NameAssignment_1 )
            // InternalDSL.g:3628:3: rule__Port__NameAssignment_1
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
    // InternalDSL.g:3636:1: rule__Port__Group__2 : rule__Port__Group__2__Impl rule__Port__Group__3 ;
    public final void rule__Port__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3640:1: ( rule__Port__Group__2__Impl rule__Port__Group__3 )
            // InternalDSL.g:3641:2: rule__Port__Group__2__Impl rule__Port__Group__3
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
    // InternalDSL.g:3648:1: rule__Port__Group__2__Impl : ( '::' ) ;
    public final void rule__Port__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3652:1: ( ( '::' ) )
            // InternalDSL.g:3653:1: ( '::' )
            {
            // InternalDSL.g:3653:1: ( '::' )
            // InternalDSL.g:3654:2: '::'
            {
             before(grammarAccess.getPortAccess().getColonColonKeyword_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalDSL.g:3663:1: rule__Port__Group__3 : rule__Port__Group__3__Impl rule__Port__Group__4 ;
    public final void rule__Port__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3667:1: ( rule__Port__Group__3__Impl rule__Port__Group__4 )
            // InternalDSL.g:3668:2: rule__Port__Group__3__Impl rule__Port__Group__4
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
    // InternalDSL.g:3675:1: rule__Port__Group__3__Impl : ( ( rule__Port__TypeAssignment_3 ) ) ;
    public final void rule__Port__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3679:1: ( ( ( rule__Port__TypeAssignment_3 ) ) )
            // InternalDSL.g:3680:1: ( ( rule__Port__TypeAssignment_3 ) )
            {
            // InternalDSL.g:3680:1: ( ( rule__Port__TypeAssignment_3 ) )
            // InternalDSL.g:3681:2: ( rule__Port__TypeAssignment_3 )
            {
             before(grammarAccess.getPortAccess().getTypeAssignment_3()); 
            // InternalDSL.g:3682:2: ( rule__Port__TypeAssignment_3 )
            // InternalDSL.g:3682:3: rule__Port__TypeAssignment_3
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
    // InternalDSL.g:3690:1: rule__Port__Group__4 : rule__Port__Group__4__Impl ;
    public final void rule__Port__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3694:1: ( rule__Port__Group__4__Impl )
            // InternalDSL.g:3695:2: rule__Port__Group__4__Impl
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
    // InternalDSL.g:3701:1: rule__Port__Group__4__Impl : ( ';' ) ;
    public final void rule__Port__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3705:1: ( ( ';' ) )
            // InternalDSL.g:3706:1: ( ';' )
            {
            // InternalDSL.g:3706:1: ( ';' )
            // InternalDSL.g:3707:2: ';'
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
    // InternalDSL.g:3717:1: rule__TypeBinding__Group__0 : rule__TypeBinding__Group__0__Impl rule__TypeBinding__Group__1 ;
    public final void rule__TypeBinding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3721:1: ( rule__TypeBinding__Group__0__Impl rule__TypeBinding__Group__1 )
            // InternalDSL.g:3722:2: rule__TypeBinding__Group__0__Impl rule__TypeBinding__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalDSL.g:3729:1: rule__TypeBinding__Group__0__Impl : ( ( rule__TypeBinding__TypeAssignment_0 ) ) ;
    public final void rule__TypeBinding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3733:1: ( ( ( rule__TypeBinding__TypeAssignment_0 ) ) )
            // InternalDSL.g:3734:1: ( ( rule__TypeBinding__TypeAssignment_0 ) )
            {
            // InternalDSL.g:3734:1: ( ( rule__TypeBinding__TypeAssignment_0 ) )
            // InternalDSL.g:3735:2: ( rule__TypeBinding__TypeAssignment_0 )
            {
             before(grammarAccess.getTypeBindingAccess().getTypeAssignment_0()); 
            // InternalDSL.g:3736:2: ( rule__TypeBinding__TypeAssignment_0 )
            // InternalDSL.g:3736:3: rule__TypeBinding__TypeAssignment_0
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
    // InternalDSL.g:3744:1: rule__TypeBinding__Group__1 : rule__TypeBinding__Group__1__Impl rule__TypeBinding__Group__2 ;
    public final void rule__TypeBinding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3748:1: ( rule__TypeBinding__Group__1__Impl rule__TypeBinding__Group__2 )
            // InternalDSL.g:3749:2: rule__TypeBinding__Group__1__Impl rule__TypeBinding__Group__2
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
    // InternalDSL.g:3756:1: rule__TypeBinding__Group__1__Impl : ( '=' ) ;
    public final void rule__TypeBinding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3760:1: ( ( '=' ) )
            // InternalDSL.g:3761:1: ( '=' )
            {
            // InternalDSL.g:3761:1: ( '=' )
            // InternalDSL.g:3762:2: '='
            {
             before(grammarAccess.getTypeBindingAccess().getEqualsSignKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalDSL.g:3771:1: rule__TypeBinding__Group__2 : rule__TypeBinding__Group__2__Impl rule__TypeBinding__Group__3 ;
    public final void rule__TypeBinding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3775:1: ( rule__TypeBinding__Group__2__Impl rule__TypeBinding__Group__3 )
            // InternalDSL.g:3776:2: rule__TypeBinding__Group__2__Impl rule__TypeBinding__Group__3
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
    // InternalDSL.g:3783:1: rule__TypeBinding__Group__2__Impl : ( ( rule__TypeBinding__ImplementationAssignment_2 ) ) ;
    public final void rule__TypeBinding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3787:1: ( ( ( rule__TypeBinding__ImplementationAssignment_2 ) ) )
            // InternalDSL.g:3788:1: ( ( rule__TypeBinding__ImplementationAssignment_2 ) )
            {
            // InternalDSL.g:3788:1: ( ( rule__TypeBinding__ImplementationAssignment_2 ) )
            // InternalDSL.g:3789:2: ( rule__TypeBinding__ImplementationAssignment_2 )
            {
             before(grammarAccess.getTypeBindingAccess().getImplementationAssignment_2()); 
            // InternalDSL.g:3790:2: ( rule__TypeBinding__ImplementationAssignment_2 )
            // InternalDSL.g:3790:3: rule__TypeBinding__ImplementationAssignment_2
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
    // InternalDSL.g:3798:1: rule__TypeBinding__Group__3 : rule__TypeBinding__Group__3__Impl ;
    public final void rule__TypeBinding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3802:1: ( rule__TypeBinding__Group__3__Impl )
            // InternalDSL.g:3803:2: rule__TypeBinding__Group__3__Impl
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
    // InternalDSL.g:3809:1: rule__TypeBinding__Group__3__Impl : ( ';' ) ;
    public final void rule__TypeBinding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3813:1: ( ( ';' ) )
            // InternalDSL.g:3814:1: ( ';' )
            {
            // InternalDSL.g:3814:1: ( ';' )
            // InternalDSL.g:3815:2: ';'
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


    // $ANTLR start "rule__Deployment__Group__0"
    // InternalDSL.g:3825:1: rule__Deployment__Group__0 : rule__Deployment__Group__0__Impl rule__Deployment__Group__1 ;
    public final void rule__Deployment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3829:1: ( rule__Deployment__Group__0__Impl rule__Deployment__Group__1 )
            // InternalDSL.g:3830:2: rule__Deployment__Group__0__Impl rule__Deployment__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Deployment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Deployment__Group__1();

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
    // $ANTLR end "rule__Deployment__Group__0"


    // $ANTLR start "rule__Deployment__Group__0__Impl"
    // InternalDSL.g:3837:1: rule__Deployment__Group__0__Impl : ( 'Deployment' ) ;
    public final void rule__Deployment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3841:1: ( ( 'Deployment' ) )
            // InternalDSL.g:3842:1: ( 'Deployment' )
            {
            // InternalDSL.g:3842:1: ( 'Deployment' )
            // InternalDSL.g:3843:2: 'Deployment'
            {
             before(grammarAccess.getDeploymentAccess().getDeploymentKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getDeploymentAccess().getDeploymentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group__0__Impl"


    // $ANTLR start "rule__Deployment__Group__1"
    // InternalDSL.g:3852:1: rule__Deployment__Group__1 : rule__Deployment__Group__1__Impl rule__Deployment__Group__2 ;
    public final void rule__Deployment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3856:1: ( rule__Deployment__Group__1__Impl rule__Deployment__Group__2 )
            // InternalDSL.g:3857:2: rule__Deployment__Group__1__Impl rule__Deployment__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Deployment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Deployment__Group__2();

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
    // $ANTLR end "rule__Deployment__Group__1"


    // $ANTLR start "rule__Deployment__Group__1__Impl"
    // InternalDSL.g:3864:1: rule__Deployment__Group__1__Impl : ( ( rule__Deployment__NameAssignment_1 ) ) ;
    public final void rule__Deployment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3868:1: ( ( ( rule__Deployment__NameAssignment_1 ) ) )
            // InternalDSL.g:3869:1: ( ( rule__Deployment__NameAssignment_1 ) )
            {
            // InternalDSL.g:3869:1: ( ( rule__Deployment__NameAssignment_1 ) )
            // InternalDSL.g:3870:2: ( rule__Deployment__NameAssignment_1 )
            {
             before(grammarAccess.getDeploymentAccess().getNameAssignment_1()); 
            // InternalDSL.g:3871:2: ( rule__Deployment__NameAssignment_1 )
            // InternalDSL.g:3871:3: rule__Deployment__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Deployment__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDeploymentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group__1__Impl"


    // $ANTLR start "rule__Deployment__Group__2"
    // InternalDSL.g:3879:1: rule__Deployment__Group__2 : rule__Deployment__Group__2__Impl rule__Deployment__Group__3 ;
    public final void rule__Deployment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3883:1: ( rule__Deployment__Group__2__Impl rule__Deployment__Group__3 )
            // InternalDSL.g:3884:2: rule__Deployment__Group__2__Impl rule__Deployment__Group__3
            {
            pushFollow(FOLLOW_42);
            rule__Deployment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Deployment__Group__3();

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
    // $ANTLR end "rule__Deployment__Group__2"


    // $ANTLR start "rule__Deployment__Group__2__Impl"
    // InternalDSL.g:3891:1: rule__Deployment__Group__2__Impl : ( '{' ) ;
    public final void rule__Deployment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3895:1: ( ( '{' ) )
            // InternalDSL.g:3896:1: ( '{' )
            {
            // InternalDSL.g:3896:1: ( '{' )
            // InternalDSL.g:3897:2: '{'
            {
             before(grammarAccess.getDeploymentAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDeploymentAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group__2__Impl"


    // $ANTLR start "rule__Deployment__Group__3"
    // InternalDSL.g:3906:1: rule__Deployment__Group__3 : rule__Deployment__Group__3__Impl rule__Deployment__Group__4 ;
    public final void rule__Deployment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3910:1: ( rule__Deployment__Group__3__Impl rule__Deployment__Group__4 )
            // InternalDSL.g:3911:2: rule__Deployment__Group__3__Impl rule__Deployment__Group__4
            {
            pushFollow(FOLLOW_42);
            rule__Deployment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Deployment__Group__4();

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
    // $ANTLR end "rule__Deployment__Group__3"


    // $ANTLR start "rule__Deployment__Group__3__Impl"
    // InternalDSL.g:3918:1: rule__Deployment__Group__3__Impl : ( ( rule__Deployment__ScriptAssignment_3 )* ) ;
    public final void rule__Deployment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3922:1: ( ( ( rule__Deployment__ScriptAssignment_3 )* ) )
            // InternalDSL.g:3923:1: ( ( rule__Deployment__ScriptAssignment_3 )* )
            {
            // InternalDSL.g:3923:1: ( ( rule__Deployment__ScriptAssignment_3 )* )
            // InternalDSL.g:3924:2: ( rule__Deployment__ScriptAssignment_3 )*
            {
             before(grammarAccess.getDeploymentAccess().getScriptAssignment_3()); 
            // InternalDSL.g:3925:2: ( rule__Deployment__ScriptAssignment_3 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=RULE_STRING && LA25_0<=RULE_ID)||LA25_0==36) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalDSL.g:3925:3: rule__Deployment__ScriptAssignment_3
            	    {
            	    pushFollow(FOLLOW_43);
            	    rule__Deployment__ScriptAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getDeploymentAccess().getScriptAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group__3__Impl"


    // $ANTLR start "rule__Deployment__Group__4"
    // InternalDSL.g:3933:1: rule__Deployment__Group__4 : rule__Deployment__Group__4__Impl ;
    public final void rule__Deployment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3937:1: ( rule__Deployment__Group__4__Impl )
            // InternalDSL.g:3938:2: rule__Deployment__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Deployment__Group__4__Impl();

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
    // $ANTLR end "rule__Deployment__Group__4"


    // $ANTLR start "rule__Deployment__Group__4__Impl"
    // InternalDSL.g:3944:1: rule__Deployment__Group__4__Impl : ( '}' ) ;
    public final void rule__Deployment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3948:1: ( ( '}' ) )
            // InternalDSL.g:3949:1: ( '}' )
            {
            // InternalDSL.g:3949:1: ( '}' )
            // InternalDSL.g:3950:2: '}'
            {
             before(grammarAccess.getDeploymentAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDeploymentAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group__4__Impl"


    // $ANTLR start "rule__DeploymentOperator__Group__0"
    // InternalDSL.g:3960:1: rule__DeploymentOperator__Group__0 : rule__DeploymentOperator__Group__0__Impl rule__DeploymentOperator__Group__1 ;
    public final void rule__DeploymentOperator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3964:1: ( rule__DeploymentOperator__Group__0__Impl rule__DeploymentOperator__Group__1 )
            // InternalDSL.g:3965:2: rule__DeploymentOperator__Group__0__Impl rule__DeploymentOperator__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__DeploymentOperator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeploymentOperator__Group__1();

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
    // $ANTLR end "rule__DeploymentOperator__Group__0"


    // $ANTLR start "rule__DeploymentOperator__Group__0__Impl"
    // InternalDSL.g:3972:1: rule__DeploymentOperator__Group__0__Impl : ( ( rule__DeploymentOperator__Alternatives_0 ) ) ;
    public final void rule__DeploymentOperator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3976:1: ( ( ( rule__DeploymentOperator__Alternatives_0 ) ) )
            // InternalDSL.g:3977:1: ( ( rule__DeploymentOperator__Alternatives_0 ) )
            {
            // InternalDSL.g:3977:1: ( ( rule__DeploymentOperator__Alternatives_0 ) )
            // InternalDSL.g:3978:2: ( rule__DeploymentOperator__Alternatives_0 )
            {
             before(grammarAccess.getDeploymentOperatorAccess().getAlternatives_0()); 
            // InternalDSL.g:3979:2: ( rule__DeploymentOperator__Alternatives_0 )
            // InternalDSL.g:3979:3: rule__DeploymentOperator__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__DeploymentOperator__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getDeploymentOperatorAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeploymentOperator__Group__0__Impl"


    // $ANTLR start "rule__DeploymentOperator__Group__1"
    // InternalDSL.g:3987:1: rule__DeploymentOperator__Group__1 : rule__DeploymentOperator__Group__1__Impl ;
    public final void rule__DeploymentOperator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:3991:1: ( rule__DeploymentOperator__Group__1__Impl )
            // InternalDSL.g:3992:2: rule__DeploymentOperator__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeploymentOperator__Group__1__Impl();

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
    // $ANTLR end "rule__DeploymentOperator__Group__1"


    // $ANTLR start "rule__DeploymentOperator__Group__1__Impl"
    // InternalDSL.g:3998:1: rule__DeploymentOperator__Group__1__Impl : ( ';' ) ;
    public final void rule__DeploymentOperator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4002:1: ( ( ';' ) )
            // InternalDSL.g:4003:1: ( ';' )
            {
            // InternalDSL.g:4003:1: ( ';' )
            // InternalDSL.g:4004:2: ';'
            {
             before(grammarAccess.getDeploymentOperatorAccess().getSemicolonKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDeploymentOperatorAccess().getSemicolonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeploymentOperator__Group__1__Impl"


    // $ANTLR start "rule__ActivateRoleModelOperator__Group__0"
    // InternalDSL.g:4014:1: rule__ActivateRoleModelOperator__Group__0 : rule__ActivateRoleModelOperator__Group__0__Impl rule__ActivateRoleModelOperator__Group__1 ;
    public final void rule__ActivateRoleModelOperator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4018:1: ( rule__ActivateRoleModelOperator__Group__0__Impl rule__ActivateRoleModelOperator__Group__1 )
            // InternalDSL.g:4019:2: rule__ActivateRoleModelOperator__Group__0__Impl rule__ActivateRoleModelOperator__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__ActivateRoleModelOperator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivateRoleModelOperator__Group__1();

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
    // $ANTLR end "rule__ActivateRoleModelOperator__Group__0"


    // $ANTLR start "rule__ActivateRoleModelOperator__Group__0__Impl"
    // InternalDSL.g:4026:1: rule__ActivateRoleModelOperator__Group__0__Impl : ( ( rule__ActivateRoleModelOperator__RoleModelAssignment_0 ) ) ;
    public final void rule__ActivateRoleModelOperator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4030:1: ( ( ( rule__ActivateRoleModelOperator__RoleModelAssignment_0 ) ) )
            // InternalDSL.g:4031:1: ( ( rule__ActivateRoleModelOperator__RoleModelAssignment_0 ) )
            {
            // InternalDSL.g:4031:1: ( ( rule__ActivateRoleModelOperator__RoleModelAssignment_0 ) )
            // InternalDSL.g:4032:2: ( rule__ActivateRoleModelOperator__RoleModelAssignment_0 )
            {
             before(grammarAccess.getActivateRoleModelOperatorAccess().getRoleModelAssignment_0()); 
            // InternalDSL.g:4033:2: ( rule__ActivateRoleModelOperator__RoleModelAssignment_0 )
            // InternalDSL.g:4033:3: rule__ActivateRoleModelOperator__RoleModelAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ActivateRoleModelOperator__RoleModelAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getActivateRoleModelOperatorAccess().getRoleModelAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivateRoleModelOperator__Group__0__Impl"


    // $ANTLR start "rule__ActivateRoleModelOperator__Group__1"
    // InternalDSL.g:4041:1: rule__ActivateRoleModelOperator__Group__1 : rule__ActivateRoleModelOperator__Group__1__Impl rule__ActivateRoleModelOperator__Group__2 ;
    public final void rule__ActivateRoleModelOperator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4045:1: ( rule__ActivateRoleModelOperator__Group__1__Impl rule__ActivateRoleModelOperator__Group__2 )
            // InternalDSL.g:4046:2: rule__ActivateRoleModelOperator__Group__1__Impl rule__ActivateRoleModelOperator__Group__2
            {
            pushFollow(FOLLOW_44);
            rule__ActivateRoleModelOperator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivateRoleModelOperator__Group__2();

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
    // $ANTLR end "rule__ActivateRoleModelOperator__Group__1"


    // $ANTLR start "rule__ActivateRoleModelOperator__Group__1__Impl"
    // InternalDSL.g:4053:1: rule__ActivateRoleModelOperator__Group__1__Impl : ( '(' ) ;
    public final void rule__ActivateRoleModelOperator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4057:1: ( ( '(' ) )
            // InternalDSL.g:4058:1: ( '(' )
            {
            // InternalDSL.g:4058:1: ( '(' )
            // InternalDSL.g:4059:2: '('
            {
             before(grammarAccess.getActivateRoleModelOperatorAccess().getLeftParenthesisKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getActivateRoleModelOperatorAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivateRoleModelOperator__Group__1__Impl"


    // $ANTLR start "rule__ActivateRoleModelOperator__Group__2"
    // InternalDSL.g:4068:1: rule__ActivateRoleModelOperator__Group__2 : rule__ActivateRoleModelOperator__Group__2__Impl rule__ActivateRoleModelOperator__Group__3 ;
    public final void rule__ActivateRoleModelOperator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4072:1: ( rule__ActivateRoleModelOperator__Group__2__Impl rule__ActivateRoleModelOperator__Group__3 )
            // InternalDSL.g:4073:2: rule__ActivateRoleModelOperator__Group__2__Impl rule__ActivateRoleModelOperator__Group__3
            {
            pushFollow(FOLLOW_44);
            rule__ActivateRoleModelOperator__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivateRoleModelOperator__Group__3();

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
    // $ANTLR end "rule__ActivateRoleModelOperator__Group__2"


    // $ANTLR start "rule__ActivateRoleModelOperator__Group__2__Impl"
    // InternalDSL.g:4080:1: rule__ActivateRoleModelOperator__Group__2__Impl : ( ( rule__ActivateRoleModelOperator__Group_2__0 )? ) ;
    public final void rule__ActivateRoleModelOperator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4084:1: ( ( ( rule__ActivateRoleModelOperator__Group_2__0 )? ) )
            // InternalDSL.g:4085:1: ( ( rule__ActivateRoleModelOperator__Group_2__0 )? )
            {
            // InternalDSL.g:4085:1: ( ( rule__ActivateRoleModelOperator__Group_2__0 )? )
            // InternalDSL.g:4086:2: ( rule__ActivateRoleModelOperator__Group_2__0 )?
            {
             before(grammarAccess.getActivateRoleModelOperatorAccess().getGroup_2()); 
            // InternalDSL.g:4087:2: ( rule__ActivateRoleModelOperator__Group_2__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_STRING && LA26_0<=RULE_ID)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalDSL.g:4087:3: rule__ActivateRoleModelOperator__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ActivateRoleModelOperator__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivateRoleModelOperatorAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivateRoleModelOperator__Group__2__Impl"


    // $ANTLR start "rule__ActivateRoleModelOperator__Group__3"
    // InternalDSL.g:4095:1: rule__ActivateRoleModelOperator__Group__3 : rule__ActivateRoleModelOperator__Group__3__Impl ;
    public final void rule__ActivateRoleModelOperator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4099:1: ( rule__ActivateRoleModelOperator__Group__3__Impl )
            // InternalDSL.g:4100:2: rule__ActivateRoleModelOperator__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActivateRoleModelOperator__Group__3__Impl();

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
    // $ANTLR end "rule__ActivateRoleModelOperator__Group__3"


    // $ANTLR start "rule__ActivateRoleModelOperator__Group__3__Impl"
    // InternalDSL.g:4106:1: rule__ActivateRoleModelOperator__Group__3__Impl : ( ')' ) ;
    public final void rule__ActivateRoleModelOperator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4110:1: ( ( ')' ) )
            // InternalDSL.g:4111:1: ( ')' )
            {
            // InternalDSL.g:4111:1: ( ')' )
            // InternalDSL.g:4112:2: ')'
            {
             before(grammarAccess.getActivateRoleModelOperatorAccess().getRightParenthesisKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getActivateRoleModelOperatorAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivateRoleModelOperator__Group__3__Impl"


    // $ANTLR start "rule__ActivateRoleModelOperator__Group_2__0"
    // InternalDSL.g:4122:1: rule__ActivateRoleModelOperator__Group_2__0 : rule__ActivateRoleModelOperator__Group_2__0__Impl rule__ActivateRoleModelOperator__Group_2__1 ;
    public final void rule__ActivateRoleModelOperator__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4126:1: ( rule__ActivateRoleModelOperator__Group_2__0__Impl rule__ActivateRoleModelOperator__Group_2__1 )
            // InternalDSL.g:4127:2: rule__ActivateRoleModelOperator__Group_2__0__Impl rule__ActivateRoleModelOperator__Group_2__1
            {
            pushFollow(FOLLOW_20);
            rule__ActivateRoleModelOperator__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivateRoleModelOperator__Group_2__1();

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
    // $ANTLR end "rule__ActivateRoleModelOperator__Group_2__0"


    // $ANTLR start "rule__ActivateRoleModelOperator__Group_2__0__Impl"
    // InternalDSL.g:4134:1: rule__ActivateRoleModelOperator__Group_2__0__Impl : ( ( rule__ActivateRoleModelOperator__ArgsAssignment_2_0 ) ) ;
    public final void rule__ActivateRoleModelOperator__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4138:1: ( ( ( rule__ActivateRoleModelOperator__ArgsAssignment_2_0 ) ) )
            // InternalDSL.g:4139:1: ( ( rule__ActivateRoleModelOperator__ArgsAssignment_2_0 ) )
            {
            // InternalDSL.g:4139:1: ( ( rule__ActivateRoleModelOperator__ArgsAssignment_2_0 ) )
            // InternalDSL.g:4140:2: ( rule__ActivateRoleModelOperator__ArgsAssignment_2_0 )
            {
             before(grammarAccess.getActivateRoleModelOperatorAccess().getArgsAssignment_2_0()); 
            // InternalDSL.g:4141:2: ( rule__ActivateRoleModelOperator__ArgsAssignment_2_0 )
            // InternalDSL.g:4141:3: rule__ActivateRoleModelOperator__ArgsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__ActivateRoleModelOperator__ArgsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getActivateRoleModelOperatorAccess().getArgsAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivateRoleModelOperator__Group_2__0__Impl"


    // $ANTLR start "rule__ActivateRoleModelOperator__Group_2__1"
    // InternalDSL.g:4149:1: rule__ActivateRoleModelOperator__Group_2__1 : rule__ActivateRoleModelOperator__Group_2__1__Impl ;
    public final void rule__ActivateRoleModelOperator__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4153:1: ( rule__ActivateRoleModelOperator__Group_2__1__Impl )
            // InternalDSL.g:4154:2: rule__ActivateRoleModelOperator__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActivateRoleModelOperator__Group_2__1__Impl();

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
    // $ANTLR end "rule__ActivateRoleModelOperator__Group_2__1"


    // $ANTLR start "rule__ActivateRoleModelOperator__Group_2__1__Impl"
    // InternalDSL.g:4160:1: rule__ActivateRoleModelOperator__Group_2__1__Impl : ( ( rule__ActivateRoleModelOperator__Group_2_1__0 )* ) ;
    public final void rule__ActivateRoleModelOperator__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4164:1: ( ( ( rule__ActivateRoleModelOperator__Group_2_1__0 )* ) )
            // InternalDSL.g:4165:1: ( ( rule__ActivateRoleModelOperator__Group_2_1__0 )* )
            {
            // InternalDSL.g:4165:1: ( ( rule__ActivateRoleModelOperator__Group_2_1__0 )* )
            // InternalDSL.g:4166:2: ( rule__ActivateRoleModelOperator__Group_2_1__0 )*
            {
             before(grammarAccess.getActivateRoleModelOperatorAccess().getGroup_2_1()); 
            // InternalDSL.g:4167:2: ( rule__ActivateRoleModelOperator__Group_2_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==22) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalDSL.g:4167:3: rule__ActivateRoleModelOperator__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__ActivateRoleModelOperator__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getActivateRoleModelOperatorAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivateRoleModelOperator__Group_2__1__Impl"


    // $ANTLR start "rule__ActivateRoleModelOperator__Group_2_1__0"
    // InternalDSL.g:4176:1: rule__ActivateRoleModelOperator__Group_2_1__0 : rule__ActivateRoleModelOperator__Group_2_1__0__Impl rule__ActivateRoleModelOperator__Group_2_1__1 ;
    public final void rule__ActivateRoleModelOperator__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4180:1: ( rule__ActivateRoleModelOperator__Group_2_1__0__Impl rule__ActivateRoleModelOperator__Group_2_1__1 )
            // InternalDSL.g:4181:2: rule__ActivateRoleModelOperator__Group_2_1__0__Impl rule__ActivateRoleModelOperator__Group_2_1__1
            {
            pushFollow(FOLLOW_9);
            rule__ActivateRoleModelOperator__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivateRoleModelOperator__Group_2_1__1();

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
    // $ANTLR end "rule__ActivateRoleModelOperator__Group_2_1__0"


    // $ANTLR start "rule__ActivateRoleModelOperator__Group_2_1__0__Impl"
    // InternalDSL.g:4188:1: rule__ActivateRoleModelOperator__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__ActivateRoleModelOperator__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4192:1: ( ( ',' ) )
            // InternalDSL.g:4193:1: ( ',' )
            {
            // InternalDSL.g:4193:1: ( ',' )
            // InternalDSL.g:4194:2: ','
            {
             before(grammarAccess.getActivateRoleModelOperatorAccess().getCommaKeyword_2_1_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getActivateRoleModelOperatorAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivateRoleModelOperator__Group_2_1__0__Impl"


    // $ANTLR start "rule__ActivateRoleModelOperator__Group_2_1__1"
    // InternalDSL.g:4203:1: rule__ActivateRoleModelOperator__Group_2_1__1 : rule__ActivateRoleModelOperator__Group_2_1__1__Impl ;
    public final void rule__ActivateRoleModelOperator__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4207:1: ( rule__ActivateRoleModelOperator__Group_2_1__1__Impl )
            // InternalDSL.g:4208:2: rule__ActivateRoleModelOperator__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActivateRoleModelOperator__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__ActivateRoleModelOperator__Group_2_1__1"


    // $ANTLR start "rule__ActivateRoleModelOperator__Group_2_1__1__Impl"
    // InternalDSL.g:4214:1: rule__ActivateRoleModelOperator__Group_2_1__1__Impl : ( ( rule__ActivateRoleModelOperator__ArgsAssignment_2_1_1 ) ) ;
    public final void rule__ActivateRoleModelOperator__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4218:1: ( ( ( rule__ActivateRoleModelOperator__ArgsAssignment_2_1_1 ) ) )
            // InternalDSL.g:4219:1: ( ( rule__ActivateRoleModelOperator__ArgsAssignment_2_1_1 ) )
            {
            // InternalDSL.g:4219:1: ( ( rule__ActivateRoleModelOperator__ArgsAssignment_2_1_1 ) )
            // InternalDSL.g:4220:2: ( rule__ActivateRoleModelOperator__ArgsAssignment_2_1_1 )
            {
             before(grammarAccess.getActivateRoleModelOperatorAccess().getArgsAssignment_2_1_1()); 
            // InternalDSL.g:4221:2: ( rule__ActivateRoleModelOperator__ArgsAssignment_2_1_1 )
            // InternalDSL.g:4221:3: rule__ActivateRoleModelOperator__ArgsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ActivateRoleModelOperator__ArgsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getActivateRoleModelOperatorAccess().getArgsAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivateRoleModelOperator__Group_2_1__1__Impl"


    // $ANTLR start "rule__ComponentInstance__Group__0"
    // InternalDSL.g:4230:1: rule__ComponentInstance__Group__0 : rule__ComponentInstance__Group__0__Impl rule__ComponentInstance__Group__1 ;
    public final void rule__ComponentInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4234:1: ( rule__ComponentInstance__Group__0__Impl rule__ComponentInstance__Group__1 )
            // InternalDSL.g:4235:2: rule__ComponentInstance__Group__0__Impl rule__ComponentInstance__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ComponentInstance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInstance__Group__1();

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
    // $ANTLR end "rule__ComponentInstance__Group__0"


    // $ANTLR start "rule__ComponentInstance__Group__0__Impl"
    // InternalDSL.g:4242:1: rule__ComponentInstance__Group__0__Impl : ( 'val' ) ;
    public final void rule__ComponentInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4246:1: ( ( 'val' ) )
            // InternalDSL.g:4247:1: ( 'val' )
            {
            // InternalDSL.g:4247:1: ( 'val' )
            // InternalDSL.g:4248:2: 'val'
            {
             before(grammarAccess.getComponentInstanceAccess().getValKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getComponentInstanceAccess().getValKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__Group__0__Impl"


    // $ANTLR start "rule__ComponentInstance__Group__1"
    // InternalDSL.g:4257:1: rule__ComponentInstance__Group__1 : rule__ComponentInstance__Group__1__Impl rule__ComponentInstance__Group__2 ;
    public final void rule__ComponentInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4261:1: ( rule__ComponentInstance__Group__1__Impl rule__ComponentInstance__Group__2 )
            // InternalDSL.g:4262:2: rule__ComponentInstance__Group__1__Impl rule__ComponentInstance__Group__2
            {
            pushFollow(FOLLOW_41);
            rule__ComponentInstance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInstance__Group__2();

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
    // $ANTLR end "rule__ComponentInstance__Group__1"


    // $ANTLR start "rule__ComponentInstance__Group__1__Impl"
    // InternalDSL.g:4269:1: rule__ComponentInstance__Group__1__Impl : ( ( rule__ComponentInstance__NameAssignment_1 ) ) ;
    public final void rule__ComponentInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4273:1: ( ( ( rule__ComponentInstance__NameAssignment_1 ) ) )
            // InternalDSL.g:4274:1: ( ( rule__ComponentInstance__NameAssignment_1 ) )
            {
            // InternalDSL.g:4274:1: ( ( rule__ComponentInstance__NameAssignment_1 ) )
            // InternalDSL.g:4275:2: ( rule__ComponentInstance__NameAssignment_1 )
            {
             before(grammarAccess.getComponentInstanceAccess().getNameAssignment_1()); 
            // InternalDSL.g:4276:2: ( rule__ComponentInstance__NameAssignment_1 )
            // InternalDSL.g:4276:3: rule__ComponentInstance__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInstance__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentInstanceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__Group__1__Impl"


    // $ANTLR start "rule__ComponentInstance__Group__2"
    // InternalDSL.g:4284:1: rule__ComponentInstance__Group__2 : rule__ComponentInstance__Group__2__Impl rule__ComponentInstance__Group__3 ;
    public final void rule__ComponentInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4288:1: ( rule__ComponentInstance__Group__2__Impl rule__ComponentInstance__Group__3 )
            // InternalDSL.g:4289:2: rule__ComponentInstance__Group__2__Impl rule__ComponentInstance__Group__3
            {
            pushFollow(FOLLOW_45);
            rule__ComponentInstance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInstance__Group__3();

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
    // $ANTLR end "rule__ComponentInstance__Group__2"


    // $ANTLR start "rule__ComponentInstance__Group__2__Impl"
    // InternalDSL.g:4296:1: rule__ComponentInstance__Group__2__Impl : ( '=' ) ;
    public final void rule__ComponentInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4300:1: ( ( '=' ) )
            // InternalDSL.g:4301:1: ( '=' )
            {
            // InternalDSL.g:4301:1: ( '=' )
            // InternalDSL.g:4302:2: '='
            {
             before(grammarAccess.getComponentInstanceAccess().getEqualsSignKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getComponentInstanceAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__Group__2__Impl"


    // $ANTLR start "rule__ComponentInstance__Group__3"
    // InternalDSL.g:4311:1: rule__ComponentInstance__Group__3 : rule__ComponentInstance__Group__3__Impl rule__ComponentInstance__Group__4 ;
    public final void rule__ComponentInstance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4315:1: ( rule__ComponentInstance__Group__3__Impl rule__ComponentInstance__Group__4 )
            // InternalDSL.g:4316:2: rule__ComponentInstance__Group__3__Impl rule__ComponentInstance__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__ComponentInstance__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInstance__Group__4();

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
    // $ANTLR end "rule__ComponentInstance__Group__3"


    // $ANTLR start "rule__ComponentInstance__Group__3__Impl"
    // InternalDSL.g:4323:1: rule__ComponentInstance__Group__3__Impl : ( 'new' ) ;
    public final void rule__ComponentInstance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4327:1: ( ( 'new' ) )
            // InternalDSL.g:4328:1: ( 'new' )
            {
            // InternalDSL.g:4328:1: ( 'new' )
            // InternalDSL.g:4329:2: 'new'
            {
             before(grammarAccess.getComponentInstanceAccess().getNewKeyword_3()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getComponentInstanceAccess().getNewKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__Group__3__Impl"


    // $ANTLR start "rule__ComponentInstance__Group__4"
    // InternalDSL.g:4338:1: rule__ComponentInstance__Group__4 : rule__ComponentInstance__Group__4__Impl rule__ComponentInstance__Group__5 ;
    public final void rule__ComponentInstance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4342:1: ( rule__ComponentInstance__Group__4__Impl rule__ComponentInstance__Group__5 )
            // InternalDSL.g:4343:2: rule__ComponentInstance__Group__4__Impl rule__ComponentInstance__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__ComponentInstance__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInstance__Group__5();

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
    // $ANTLR end "rule__ComponentInstance__Group__4"


    // $ANTLR start "rule__ComponentInstance__Group__4__Impl"
    // InternalDSL.g:4350:1: rule__ComponentInstance__Group__4__Impl : ( ( rule__ComponentInstance__TypeAssignment_4 ) ) ;
    public final void rule__ComponentInstance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4354:1: ( ( ( rule__ComponentInstance__TypeAssignment_4 ) ) )
            // InternalDSL.g:4355:1: ( ( rule__ComponentInstance__TypeAssignment_4 ) )
            {
            // InternalDSL.g:4355:1: ( ( rule__ComponentInstance__TypeAssignment_4 ) )
            // InternalDSL.g:4356:2: ( rule__ComponentInstance__TypeAssignment_4 )
            {
             before(grammarAccess.getComponentInstanceAccess().getTypeAssignment_4()); 
            // InternalDSL.g:4357:2: ( rule__ComponentInstance__TypeAssignment_4 )
            // InternalDSL.g:4357:3: rule__ComponentInstance__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInstance__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getComponentInstanceAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__Group__4__Impl"


    // $ANTLR start "rule__ComponentInstance__Group__5"
    // InternalDSL.g:4365:1: rule__ComponentInstance__Group__5 : rule__ComponentInstance__Group__5__Impl rule__ComponentInstance__Group__6 ;
    public final void rule__ComponentInstance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4369:1: ( rule__ComponentInstance__Group__5__Impl rule__ComponentInstance__Group__6 )
            // InternalDSL.g:4370:2: rule__ComponentInstance__Group__5__Impl rule__ComponentInstance__Group__6
            {
            pushFollow(FOLLOW_46);
            rule__ComponentInstance__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInstance__Group__6();

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
    // $ANTLR end "rule__ComponentInstance__Group__5"


    // $ANTLR start "rule__ComponentInstance__Group__5__Impl"
    // InternalDSL.g:4377:1: rule__ComponentInstance__Group__5__Impl : ( '(' ) ;
    public final void rule__ComponentInstance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4381:1: ( ( '(' ) )
            // InternalDSL.g:4382:1: ( '(' )
            {
            // InternalDSL.g:4382:1: ( '(' )
            // InternalDSL.g:4383:2: '('
            {
             before(grammarAccess.getComponentInstanceAccess().getLeftParenthesisKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getComponentInstanceAccess().getLeftParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__Group__5__Impl"


    // $ANTLR start "rule__ComponentInstance__Group__6"
    // InternalDSL.g:4392:1: rule__ComponentInstance__Group__6 : rule__ComponentInstance__Group__6__Impl ;
    public final void rule__ComponentInstance__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4396:1: ( rule__ComponentInstance__Group__6__Impl )
            // InternalDSL.g:4397:2: rule__ComponentInstance__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInstance__Group__6__Impl();

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
    // $ANTLR end "rule__ComponentInstance__Group__6"


    // $ANTLR start "rule__ComponentInstance__Group__6__Impl"
    // InternalDSL.g:4403:1: rule__ComponentInstance__Group__6__Impl : ( ')' ) ;
    public final void rule__ComponentInstance__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4407:1: ( ( ')' ) )
            // InternalDSL.g:4408:1: ( ')' )
            {
            // InternalDSL.g:4408:1: ( ')' )
            // InternalDSL.g:4409:2: ')'
            {
             before(grammarAccess.getComponentInstanceAccess().getRightParenthesisKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getComponentInstanceAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__Group__6__Impl"


    // $ANTLR start "rule__SmagsModel__ImportsAssignment_1_2"
    // InternalDSL.g:4419:1: rule__SmagsModel__ImportsAssignment_1_2 : ( ruleImport ) ;
    public final void rule__SmagsModel__ImportsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4423:1: ( ( ruleImport ) )
            // InternalDSL.g:4424:2: ( ruleImport )
            {
            // InternalDSL.g:4424:2: ( ruleImport )
            // InternalDSL.g:4425:3: ruleImport
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
    // InternalDSL.g:4434:1: rule__SmagsModel__ElementsAssignment_2 : ( ruleSmagsElement ) ;
    public final void rule__SmagsModel__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4438:1: ( ( ruleSmagsElement ) )
            // InternalDSL.g:4439:2: ( ruleSmagsElement )
            {
            // InternalDSL.g:4439:2: ( ruleSmagsElement )
            // InternalDSL.g:4440:3: ruleSmagsElement
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
    // InternalDSL.g:4449:1: rule__Import__ImportURIAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4453:1: ( ( RULE_STRING ) )
            // InternalDSL.g:4454:2: ( RULE_STRING )
            {
            // InternalDSL.g:4454:2: ( RULE_STRING )
            // InternalDSL.g:4455:3: RULE_STRING
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
    // InternalDSL.g:4464:1: rule__MetaArchitecture__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__MetaArchitecture__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4468:1: ( ( ruleEString ) )
            // InternalDSL.g:4469:2: ( ruleEString )
            {
            // InternalDSL.g:4469:2: ( ruleEString )
            // InternalDSL.g:4470:3: ruleEString
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


    // $ANTLR start "rule__MetaArchitecture__NamespaceAssignment_2_2"
    // InternalDSL.g:4479:1: rule__MetaArchitecture__NamespaceAssignment_2_2 : ( ruleEString ) ;
    public final void rule__MetaArchitecture__NamespaceAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4483:1: ( ( ruleEString ) )
            // InternalDSL.g:4484:2: ( ruleEString )
            {
            // InternalDSL.g:4484:2: ( ruleEString )
            // InternalDSL.g:4485:3: ruleEString
            {
             before(grammarAccess.getMetaArchitectureAccess().getNamespaceEStringParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMetaArchitectureAccess().getNamespaceEStringParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaArchitecture__NamespaceAssignment_2_2"


    // $ANTLR start "rule__MetaArchitecture__TypesAssignment_4"
    // InternalDSL.g:4494:1: rule__MetaArchitecture__TypesAssignment_4 : ( ruleType ) ;
    public final void rule__MetaArchitecture__TypesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4498:1: ( ( ruleType ) )
            // InternalDSL.g:4499:2: ( ruleType )
            {
            // InternalDSL.g:4499:2: ( ruleType )
            // InternalDSL.g:4500:3: ruleType
            {
             before(grammarAccess.getMetaArchitectureAccess().getTypesTypeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getMetaArchitectureAccess().getTypesTypeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaArchitecture__TypesAssignment_4"


    // $ANTLR start "rule__MetaArchitecture__ElementsAssignment_7"
    // InternalDSL.g:4509:1: rule__MetaArchitecture__ElementsAssignment_7 : ( ruleMetaArchitectureElement ) ;
    public final void rule__MetaArchitecture__ElementsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4513:1: ( ( ruleMetaArchitectureElement ) )
            // InternalDSL.g:4514:2: ( ruleMetaArchitectureElement )
            {
            // InternalDSL.g:4514:2: ( ruleMetaArchitectureElement )
            // InternalDSL.g:4515:3: ruleMetaArchitectureElement
            {
             before(grammarAccess.getMetaArchitectureAccess().getElementsMetaArchitectureElementParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleMetaArchitectureElement();

            state._fsp--;

             after(grammarAccess.getMetaArchitectureAccess().getElementsMetaArchitectureElementParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaArchitecture__ElementsAssignment_7"


    // $ANTLR start "rule__Type__NameAssignment_2"
    // InternalDSL.g:4524:1: rule__Type__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Type__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4528:1: ( ( RULE_ID ) )
            // InternalDSL.g:4529:2: ( RULE_ID )
            {
            // InternalDSL.g:4529:2: ( RULE_ID )
            // InternalDSL.g:4530:3: RULE_ID
            {
             before(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__NameAssignment_2"


    // $ANTLR start "rule__Variable__TypeAssignment_0"
    // InternalDSL.g:4539:1: rule__Variable__TypeAssignment_0 : ( ruleTypeUse ) ;
    public final void rule__Variable__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4543:1: ( ( ruleTypeUse ) )
            // InternalDSL.g:4544:2: ( ruleTypeUse )
            {
            // InternalDSL.g:4544:2: ( ruleTypeUse )
            // InternalDSL.g:4545:3: ruleTypeUse
            {
             before(grammarAccess.getVariableAccess().getTypeTypeUseParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeUse();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getTypeTypeUseParserRuleCall_0_0()); 

            }


            }

        }
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
    // InternalDSL.g:4554:1: rule__Variable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4558:1: ( ( RULE_ID ) )
            // InternalDSL.g:4559:2: ( RULE_ID )
            {
            // InternalDSL.g:4559:2: ( RULE_ID )
            // InternalDSL.g:4560:3: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Method__ReturnTypeAssignment_0"
    // InternalDSL.g:4569:1: rule__Method__ReturnTypeAssignment_0 : ( ruleTypeUse ) ;
    public final void rule__Method__ReturnTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4573:1: ( ( ruleTypeUse ) )
            // InternalDSL.g:4574:2: ( ruleTypeUse )
            {
            // InternalDSL.g:4574:2: ( ruleTypeUse )
            // InternalDSL.g:4575:3: ruleTypeUse
            {
             before(grammarAccess.getMethodAccess().getReturnTypeTypeUseParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeUse();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getReturnTypeTypeUseParserRuleCall_0_0()); 

            }


            }

        }
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
    // InternalDSL.g:4584:1: rule__Method__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Method__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4588:1: ( ( ruleEString ) )
            // InternalDSL.g:4589:2: ( ruleEString )
            {
            // InternalDSL.g:4589:2: ( ruleEString )
            // InternalDSL.g:4590:3: ruleEString
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
    // InternalDSL.g:4599:1: rule__Method__ArgsAssignment_3_0 : ( ruleVariable ) ;
    public final void rule__Method__ArgsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4603:1: ( ( ruleVariable ) )
            // InternalDSL.g:4604:2: ( ruleVariable )
            {
            // InternalDSL.g:4604:2: ( ruleVariable )
            // InternalDSL.g:4605:3: ruleVariable
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
    // InternalDSL.g:4614:1: rule__Method__ArgsAssignment_3_1_1 : ( ruleVariable ) ;
    public final void rule__Method__ArgsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4618:1: ( ( ruleVariable ) )
            // InternalDSL.g:4619:2: ( ruleVariable )
            {
            // InternalDSL.g:4619:2: ( ruleVariable )
            // InternalDSL.g:4620:3: ruleVariable
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


    // $ANTLR start "rule__PrimitiveUse__TypeAssignment"
    // InternalDSL.g:4629:1: rule__PrimitiveUse__TypeAssignment : ( ruleEString ) ;
    public final void rule__PrimitiveUse__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4633:1: ( ( ruleEString ) )
            // InternalDSL.g:4634:2: ( ruleEString )
            {
            // InternalDSL.g:4634:2: ( ruleEString )
            // InternalDSL.g:4635:3: ruleEString
            {
             before(grammarAccess.getPrimitiveUseAccess().getTypeEStringParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPrimitiveUseAccess().getTypeEStringParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveUse__TypeAssignment"


    // $ANTLR start "rule__GenericUse__TypeAssignment_1"
    // InternalDSL.g:4644:1: rule__GenericUse__TypeAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__GenericUse__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4648:1: ( ( ( ruleEString ) ) )
            // InternalDSL.g:4649:2: ( ( ruleEString ) )
            {
            // InternalDSL.g:4649:2: ( ( ruleEString ) )
            // InternalDSL.g:4650:3: ( ruleEString )
            {
             before(grammarAccess.getGenericUseAccess().getTypeTypeCrossReference_1_0()); 
            // InternalDSL.g:4651:3: ( ruleEString )
            // InternalDSL.g:4652:4: ruleEString
            {
             before(grammarAccess.getGenericUseAccess().getTypeTypeEStringParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGenericUseAccess().getTypeTypeEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getGenericUseAccess().getTypeTypeCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenericUse__TypeAssignment_1"


    // $ANTLR start "rule__ComponentType__NameAssignment_2"
    // InternalDSL.g:4663:1: rule__ComponentType__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ComponentType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4667:1: ( ( ruleEString ) )
            // InternalDSL.g:4668:2: ( ruleEString )
            {
            // InternalDSL.g:4668:2: ( ruleEString )
            // InternalDSL.g:4669:3: ruleEString
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


    // $ANTLR start "rule__ComponentType__ProvidesAssignment_3_1"
    // InternalDSL.g:4678:1: rule__ComponentType__ProvidesAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__ComponentType__ProvidesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4682:1: ( ( ( ruleEString ) ) )
            // InternalDSL.g:4683:2: ( ( ruleEString ) )
            {
            // InternalDSL.g:4683:2: ( ( ruleEString ) )
            // InternalDSL.g:4684:3: ( ruleEString )
            {
             before(grammarAccess.getComponentTypeAccess().getProvidesPortTypeCrossReference_3_1_0()); 
            // InternalDSL.g:4685:3: ( ruleEString )
            // InternalDSL.g:4686:4: ruleEString
            {
             before(grammarAccess.getComponentTypeAccess().getProvidesPortTypeEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponentTypeAccess().getProvidesPortTypeEStringParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getComponentTypeAccess().getProvidesPortTypeCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentType__ProvidesAssignment_3_1"


    // $ANTLR start "rule__ComponentType__ProvidesAssignment_3_2_1"
    // InternalDSL.g:4697:1: rule__ComponentType__ProvidesAssignment_3_2_1 : ( ( ruleEString ) ) ;
    public final void rule__ComponentType__ProvidesAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4701:1: ( ( ( ruleEString ) ) )
            // InternalDSL.g:4702:2: ( ( ruleEString ) )
            {
            // InternalDSL.g:4702:2: ( ( ruleEString ) )
            // InternalDSL.g:4703:3: ( ruleEString )
            {
             before(grammarAccess.getComponentTypeAccess().getProvidesPortTypeCrossReference_3_2_1_0()); 
            // InternalDSL.g:4704:3: ( ruleEString )
            // InternalDSL.g:4705:4: ruleEString
            {
             before(grammarAccess.getComponentTypeAccess().getProvidesPortTypeEStringParserRuleCall_3_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponentTypeAccess().getProvidesPortTypeEStringParserRuleCall_3_2_1_0_1()); 

            }

             after(grammarAccess.getComponentTypeAccess().getProvidesPortTypeCrossReference_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentType__ProvidesAssignment_3_2_1"


    // $ANTLR start "rule__PortType__NameAssignment_2"
    // InternalDSL.g:4716:1: rule__PortType__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__PortType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4720:1: ( ( ruleEString ) )
            // InternalDSL.g:4721:2: ( ruleEString )
            {
            // InternalDSL.g:4721:2: ( ruleEString )
            // InternalDSL.g:4722:3: ruleEString
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
    // InternalDSL.g:4731:1: rule__PortType__ElementsAssignment_4 : ( rulePortTypeElement ) ;
    public final void rule__PortType__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4735:1: ( ( rulePortTypeElement ) )
            // InternalDSL.g:4736:2: ( rulePortTypeElement )
            {
            // InternalDSL.g:4736:2: ( rulePortTypeElement )
            // InternalDSL.g:4737:3: rulePortTypeElement
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
    // InternalDSL.g:4746:1: rule__RoleModel__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RoleModel__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4750:1: ( ( ruleEString ) )
            // InternalDSL.g:4751:2: ( ruleEString )
            {
            // InternalDSL.g:4751:2: ( ruleEString )
            // InternalDSL.g:4752:3: ruleEString
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
    // InternalDSL.g:4761:1: rule__RoleModel__SlotsAssignment_3_1 : ( ruleRoleModelSlot ) ;
    public final void rule__RoleModel__SlotsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4765:1: ( ( ruleRoleModelSlot ) )
            // InternalDSL.g:4766:2: ( ruleRoleModelSlot )
            {
            // InternalDSL.g:4766:2: ( ruleRoleModelSlot )
            // InternalDSL.g:4767:3: ruleRoleModelSlot
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
    // InternalDSL.g:4776:1: rule__RoleModel__SlotsAssignment_3_2_1 : ( ruleRoleModelSlot ) ;
    public final void rule__RoleModel__SlotsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4780:1: ( ( ruleRoleModelSlot ) )
            // InternalDSL.g:4781:2: ( ruleRoleModelSlot )
            {
            // InternalDSL.g:4781:2: ( ruleRoleModelSlot )
            // InternalDSL.g:4782:3: ruleRoleModelSlot
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
    // InternalDSL.g:4791:1: rule__RoleModel__InitializationAssignment_5 : ( ruleCompositionOperator ) ;
    public final void rule__RoleModel__InitializationAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4795:1: ( ( ruleCompositionOperator ) )
            // InternalDSL.g:4796:2: ( ruleCompositionOperator )
            {
            // InternalDSL.g:4796:2: ( ruleCompositionOperator )
            // InternalDSL.g:4797:3: ruleCompositionOperator
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
    // InternalDSL.g:4806:1: rule__RoleModelSlot__TypeAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__RoleModelSlot__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4810:1: ( ( ( ruleEString ) ) )
            // InternalDSL.g:4811:2: ( ( ruleEString ) )
            {
            // InternalDSL.g:4811:2: ( ( ruleEString ) )
            // InternalDSL.g:4812:3: ( ruleEString )
            {
             before(grammarAccess.getRoleModelSlotAccess().getTypeComponentTypeCrossReference_1_0()); 
            // InternalDSL.g:4813:3: ( ruleEString )
            // InternalDSL.g:4814:4: ruleEString
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
    // InternalDSL.g:4825:1: rule__RoleModelSlot__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RoleModelSlot__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4829:1: ( ( ruleEString ) )
            // InternalDSL.g:4830:2: ( ruleEString )
            {
            // InternalDSL.g:4830:2: ( ruleEString )
            // InternalDSL.g:4831:3: ruleEString
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
    // InternalDSL.g:4840:1: rule__BindOperator__ToAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__BindOperator__ToAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4844:1: ( ( ( ruleEString ) ) )
            // InternalDSL.g:4845:2: ( ( ruleEString ) )
            {
            // InternalDSL.g:4845:2: ( ( ruleEString ) )
            // InternalDSL.g:4846:3: ( ruleEString )
            {
             before(grammarAccess.getBindOperatorAccess().getToPortTypeCrossReference_3_0()); 
            // InternalDSL.g:4847:3: ( ruleEString )
            // InternalDSL.g:4848:4: ruleEString
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
    // InternalDSL.g:4859:1: rule__BindOperator__SlotAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__BindOperator__SlotAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4863:1: ( ( ( ruleEString ) ) )
            // InternalDSL.g:4864:2: ( ( ruleEString ) )
            {
            // InternalDSL.g:4864:2: ( ( ruleEString ) )
            // InternalDSL.g:4865:3: ( ruleEString )
            {
             before(grammarAccess.getBindOperatorAccess().getSlotRoleModelSlotCrossReference_5_0()); 
            // InternalDSL.g:4866:3: ( ruleEString )
            // InternalDSL.g:4867:4: ruleEString
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
    // InternalDSL.g:4878:1: rule__Architecture__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Architecture__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4882:1: ( ( ruleEString ) )
            // InternalDSL.g:4883:2: ( ruleEString )
            {
            // InternalDSL.g:4883:2: ( ruleEString )
            // InternalDSL.g:4884:3: ruleEString
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
    // InternalDSL.g:4893:1: rule__Architecture__TypeAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Architecture__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4897:1: ( ( ( ruleEString ) ) )
            // InternalDSL.g:4898:2: ( ( ruleEString ) )
            {
            // InternalDSL.g:4898:2: ( ( ruleEString ) )
            // InternalDSL.g:4899:3: ( ruleEString )
            {
             before(grammarAccess.getArchitectureAccess().getTypeMetaArchitectureCrossReference_3_0()); 
            // InternalDSL.g:4900:3: ( ruleEString )
            // InternalDSL.g:4901:4: ruleEString
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


    // $ANTLR start "rule__Architecture__NamespaceAssignment_4_2"
    // InternalDSL.g:4912:1: rule__Architecture__NamespaceAssignment_4_2 : ( ruleEString ) ;
    public final void rule__Architecture__NamespaceAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4916:1: ( ( ruleEString ) )
            // InternalDSL.g:4917:2: ( ruleEString )
            {
            // InternalDSL.g:4917:2: ( ruleEString )
            // InternalDSL.g:4918:3: ruleEString
            {
             before(grammarAccess.getArchitectureAccess().getNamespaceEStringParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getArchitectureAccess().getNamespaceEStringParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architecture__NamespaceAssignment_4_2"


    // $ANTLR start "rule__Architecture__TypeBindingsAssignment_6"
    // InternalDSL.g:4927:1: rule__Architecture__TypeBindingsAssignment_6 : ( ruleTypeBinding ) ;
    public final void rule__Architecture__TypeBindingsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4931:1: ( ( ruleTypeBinding ) )
            // InternalDSL.g:4932:2: ( ruleTypeBinding )
            {
            // InternalDSL.g:4932:2: ( ruleTypeBinding )
            // InternalDSL.g:4933:3: ruleTypeBinding
            {
             before(grammarAccess.getArchitectureAccess().getTypeBindingsTypeBindingParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeBinding();

            state._fsp--;

             after(grammarAccess.getArchitectureAccess().getTypeBindingsTypeBindingParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architecture__TypeBindingsAssignment_6"


    // $ANTLR start "rule__Architecture__ElementsAssignment_9"
    // InternalDSL.g:4942:1: rule__Architecture__ElementsAssignment_9 : ( ruleArchitectureElement ) ;
    public final void rule__Architecture__ElementsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4946:1: ( ( ruleArchitectureElement ) )
            // InternalDSL.g:4947:2: ( ruleArchitectureElement )
            {
            // InternalDSL.g:4947:2: ( ruleArchitectureElement )
            // InternalDSL.g:4948:3: ruleArchitectureElement
            {
             before(grammarAccess.getArchitectureAccess().getElementsArchitectureElementParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleArchitectureElement();

            state._fsp--;

             after(grammarAccess.getArchitectureAccess().getElementsArchitectureElementParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architecture__ElementsAssignment_9"


    // $ANTLR start "rule__Component__NameAssignment_1"
    // InternalDSL.g:4957:1: rule__Component__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Component__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4961:1: ( ( ruleEString ) )
            // InternalDSL.g:4962:2: ( ruleEString )
            {
            // InternalDSL.g:4962:2: ( ruleEString )
            // InternalDSL.g:4963:3: ruleEString
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
    // InternalDSL.g:4972:1: rule__Component__TypeAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Component__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4976:1: ( ( ( ruleEString ) ) )
            // InternalDSL.g:4977:2: ( ( ruleEString ) )
            {
            // InternalDSL.g:4977:2: ( ( ruleEString ) )
            // InternalDSL.g:4978:3: ( ruleEString )
            {
             before(grammarAccess.getComponentAccess().getTypeComponentTypeCrossReference_3_0()); 
            // InternalDSL.g:4979:3: ( ruleEString )
            // InternalDSL.g:4980:4: ruleEString
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
    // InternalDSL.g:4991:1: rule__Port__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Port__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:4995:1: ( ( ruleEString ) )
            // InternalDSL.g:4996:2: ( ruleEString )
            {
            // InternalDSL.g:4996:2: ( ruleEString )
            // InternalDSL.g:4997:3: ruleEString
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
    // InternalDSL.g:5006:1: rule__Port__TypeAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Port__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5010:1: ( ( ( ruleEString ) ) )
            // InternalDSL.g:5011:2: ( ( ruleEString ) )
            {
            // InternalDSL.g:5011:2: ( ( ruleEString ) )
            // InternalDSL.g:5012:3: ( ruleEString )
            {
             before(grammarAccess.getPortAccess().getTypePortTypeCrossReference_3_0()); 
            // InternalDSL.g:5013:3: ( ruleEString )
            // InternalDSL.g:5014:4: ruleEString
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
    // InternalDSL.g:5025:1: rule__TypeBinding__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__TypeBinding__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5029:1: ( ( ( RULE_ID ) ) )
            // InternalDSL.g:5030:2: ( ( RULE_ID ) )
            {
            // InternalDSL.g:5030:2: ( ( RULE_ID ) )
            // InternalDSL.g:5031:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeBindingAccess().getTypeTypeCrossReference_0_0()); 
            // InternalDSL.g:5032:3: ( RULE_ID )
            // InternalDSL.g:5033:4: RULE_ID
            {
             before(grammarAccess.getTypeBindingAccess().getTypeTypeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeBindingAccess().getTypeTypeIDTerminalRuleCall_0_0_1()); 

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
    // InternalDSL.g:5044:1: rule__TypeBinding__ImplementationAssignment_2 : ( ruleEString ) ;
    public final void rule__TypeBinding__ImplementationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5048:1: ( ( ruleEString ) )
            // InternalDSL.g:5049:2: ( ruleEString )
            {
            // InternalDSL.g:5049:2: ( ruleEString )
            // InternalDSL.g:5050:3: ruleEString
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


    // $ANTLR start "rule__Deployment__NameAssignment_1"
    // InternalDSL.g:5059:1: rule__Deployment__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Deployment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5063:1: ( ( ruleEString ) )
            // InternalDSL.g:5064:2: ( ruleEString )
            {
            // InternalDSL.g:5064:2: ( ruleEString )
            // InternalDSL.g:5065:3: ruleEString
            {
             before(grammarAccess.getDeploymentAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDeploymentAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__NameAssignment_1"


    // $ANTLR start "rule__Deployment__ScriptAssignment_3"
    // InternalDSL.g:5074:1: rule__Deployment__ScriptAssignment_3 : ( ruleDeploymentOperator ) ;
    public final void rule__Deployment__ScriptAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5078:1: ( ( ruleDeploymentOperator ) )
            // InternalDSL.g:5079:2: ( ruleDeploymentOperator )
            {
            // InternalDSL.g:5079:2: ( ruleDeploymentOperator )
            // InternalDSL.g:5080:3: ruleDeploymentOperator
            {
             before(grammarAccess.getDeploymentAccess().getScriptDeploymentOperatorParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDeploymentOperator();

            state._fsp--;

             after(grammarAccess.getDeploymentAccess().getScriptDeploymentOperatorParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__ScriptAssignment_3"


    // $ANTLR start "rule__ActivateRoleModelOperator__RoleModelAssignment_0"
    // InternalDSL.g:5089:1: rule__ActivateRoleModelOperator__RoleModelAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__ActivateRoleModelOperator__RoleModelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5093:1: ( ( ( ruleEString ) ) )
            // InternalDSL.g:5094:2: ( ( ruleEString ) )
            {
            // InternalDSL.g:5094:2: ( ( ruleEString ) )
            // InternalDSL.g:5095:3: ( ruleEString )
            {
             before(grammarAccess.getActivateRoleModelOperatorAccess().getRoleModelRoleModelCrossReference_0_0()); 
            // InternalDSL.g:5096:3: ( ruleEString )
            // InternalDSL.g:5097:4: ruleEString
            {
             before(grammarAccess.getActivateRoleModelOperatorAccess().getRoleModelRoleModelEStringParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActivateRoleModelOperatorAccess().getRoleModelRoleModelEStringParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getActivateRoleModelOperatorAccess().getRoleModelRoleModelCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivateRoleModelOperator__RoleModelAssignment_0"


    // $ANTLR start "rule__ActivateRoleModelOperator__ArgsAssignment_2_0"
    // InternalDSL.g:5108:1: rule__ActivateRoleModelOperator__ArgsAssignment_2_0 : ( ( ruleEString ) ) ;
    public final void rule__ActivateRoleModelOperator__ArgsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5112:1: ( ( ( ruleEString ) ) )
            // InternalDSL.g:5113:2: ( ( ruleEString ) )
            {
            // InternalDSL.g:5113:2: ( ( ruleEString ) )
            // InternalDSL.g:5114:3: ( ruleEString )
            {
             before(grammarAccess.getActivateRoleModelOperatorAccess().getArgsComponentInstanceCrossReference_2_0_0()); 
            // InternalDSL.g:5115:3: ( ruleEString )
            // InternalDSL.g:5116:4: ruleEString
            {
             before(grammarAccess.getActivateRoleModelOperatorAccess().getArgsComponentInstanceEStringParserRuleCall_2_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActivateRoleModelOperatorAccess().getArgsComponentInstanceEStringParserRuleCall_2_0_0_1()); 

            }

             after(grammarAccess.getActivateRoleModelOperatorAccess().getArgsComponentInstanceCrossReference_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivateRoleModelOperator__ArgsAssignment_2_0"


    // $ANTLR start "rule__ActivateRoleModelOperator__ArgsAssignment_2_1_1"
    // InternalDSL.g:5127:1: rule__ActivateRoleModelOperator__ArgsAssignment_2_1_1 : ( ( ruleEString ) ) ;
    public final void rule__ActivateRoleModelOperator__ArgsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5131:1: ( ( ( ruleEString ) ) )
            // InternalDSL.g:5132:2: ( ( ruleEString ) )
            {
            // InternalDSL.g:5132:2: ( ( ruleEString ) )
            // InternalDSL.g:5133:3: ( ruleEString )
            {
             before(grammarAccess.getActivateRoleModelOperatorAccess().getArgsComponentInstanceCrossReference_2_1_1_0()); 
            // InternalDSL.g:5134:3: ( ruleEString )
            // InternalDSL.g:5135:4: ruleEString
            {
             before(grammarAccess.getActivateRoleModelOperatorAccess().getArgsComponentInstanceEStringParserRuleCall_2_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActivateRoleModelOperatorAccess().getArgsComponentInstanceEStringParserRuleCall_2_1_1_0_1()); 

            }

             after(grammarAccess.getActivateRoleModelOperatorAccess().getArgsComponentInstanceCrossReference_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivateRoleModelOperator__ArgsAssignment_2_1_1"


    // $ANTLR start "rule__CreateInstanceOperator__InstanceAssignment"
    // InternalDSL.g:5146:1: rule__CreateInstanceOperator__InstanceAssignment : ( ruleComponentInstance ) ;
    public final void rule__CreateInstanceOperator__InstanceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5150:1: ( ( ruleComponentInstance ) )
            // InternalDSL.g:5151:2: ( ruleComponentInstance )
            {
            // InternalDSL.g:5151:2: ( ruleComponentInstance )
            // InternalDSL.g:5152:3: ruleComponentInstance
            {
             before(grammarAccess.getCreateInstanceOperatorAccess().getInstanceComponentInstanceParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentInstance();

            state._fsp--;

             after(grammarAccess.getCreateInstanceOperatorAccess().getInstanceComponentInstanceParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateInstanceOperator__InstanceAssignment"


    // $ANTLR start "rule__ComponentInstance__NameAssignment_1"
    // InternalDSL.g:5161:1: rule__ComponentInstance__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__ComponentInstance__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5165:1: ( ( ruleEString ) )
            // InternalDSL.g:5166:2: ( ruleEString )
            {
            // InternalDSL.g:5166:2: ( ruleEString )
            // InternalDSL.g:5167:3: ruleEString
            {
             before(grammarAccess.getComponentInstanceAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponentInstanceAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__NameAssignment_1"


    // $ANTLR start "rule__ComponentInstance__TypeAssignment_4"
    // InternalDSL.g:5176:1: rule__ComponentInstance__TypeAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__ComponentInstance__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:5180:1: ( ( ( ruleEString ) ) )
            // InternalDSL.g:5181:2: ( ( ruleEString ) )
            {
            // InternalDSL.g:5181:2: ( ( ruleEString ) )
            // InternalDSL.g:5182:3: ( ruleEString )
            {
             before(grammarAccess.getComponentInstanceAccess().getTypeComponentCrossReference_4_0()); 
            // InternalDSL.g:5183:3: ( ruleEString )
            // InternalDSL.g:5184:4: ruleEString
            {
             before(grammarAccess.getComponentInstanceAccess().getTypeComponentEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponentInstanceAccess().getTypeComponentEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getComponentInstanceAccess().getTypeComponentCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__TypeAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000040008800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000040008002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000006802000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000006800002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000280030L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000080030L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000082030L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000080032L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000006800000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000101000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000008002000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000B00002000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000B00000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000001000002030L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000001000000032L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000200030L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000200000L});

}