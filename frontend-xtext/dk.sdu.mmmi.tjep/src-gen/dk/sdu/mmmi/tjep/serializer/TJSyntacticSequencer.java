package dk.sdu.mmmi.tjep.serializer;

import com.google.inject.Inject;
import dk.sdu.mmmi.tjep.services.TJGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class TJSyntacticSequencer extends AbstractSyntacticSequencer {

	protected TJGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Scenario___AssertKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (TJGrammarAccess) access;
		match_Scenario___AssertKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getScenarioAccess().getAssertKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getScenarioAccess().getLeftCurlyBracketKeyword_5_1()), new TokenAlias(false, false, grammarAccess.getScenarioAccess().getRightCurlyBracketKeyword_5_3()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Scenario___AssertKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q.equals(syntax))
				emit_Scenario___AssertKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('assert' '{' '}')?
	 */
	protected void emit_Scenario___AssertKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
