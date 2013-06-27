package dk.sdu.mmmi.tjep.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import dk.sdu.mmmi.tjep.services.TJGrammarAccess;
import dk.sdu.mmmi.tjep.tJ.AnnotatedExpr;
import dk.sdu.mmmi.tjep.tJ.BinOp;
import dk.sdu.mmmi.tjep.tJ.Clazz;
import dk.sdu.mmmi.tjep.tJ.Condition;
import dk.sdu.mmmi.tjep.tJ.Constant;
import dk.sdu.mmmi.tjep.tJ.Constructor;
import dk.sdu.mmmi.tjep.tJ.Dynamic;
import dk.sdu.mmmi.tjep.tJ.DynamicValue;
import dk.sdu.mmmi.tjep.tJ.Field;
import dk.sdu.mmmi.tjep.tJ.FieldAssign;
import dk.sdu.mmmi.tjep.tJ.Instantiation;
import dk.sdu.mmmi.tjep.tJ.LiftExp;
import dk.sdu.mmmi.tjep.tJ.LocalAssign;
import dk.sdu.mmmi.tjep.tJ.Method;
import dk.sdu.mmmi.tjep.tJ.MethodCall;
import dk.sdu.mmmi.tjep.tJ.ObjectOp;
import dk.sdu.mmmi.tjep.tJ.Parameter;
import dk.sdu.mmmi.tjep.tJ.Primitive;
import dk.sdu.mmmi.tjep.tJ.Program;
import dk.sdu.mmmi.tjep.tJ.Return;
import dk.sdu.mmmi.tjep.tJ.Scenario;
import dk.sdu.mmmi.tjep.tJ.SingleExpr;
import dk.sdu.mmmi.tjep.tJ.Static;
import dk.sdu.mmmi.tjep.tJ.TJPackage;
import dk.sdu.mmmi.tjep.tJ.This;
import dk.sdu.mmmi.tjep.tJ.VarDecl;
import dk.sdu.mmmi.tjep.tJ.VarRef;
import dk.sdu.mmmi.tjep.tJ.While;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class TJSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TJGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == TJPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case TJPackage.ANNOTATED_EXPR:
				if(context == grammarAccess.getAnnotatedExprRule() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getMultiplicationRule()) {
					sequence_AnnotatedExpr(context, (AnnotatedExpr) semanticObject); 
					return; 
				}
				else break;
			case TJPackage.BIN_OP:
				if(context == grammarAccess.getAdditionRule()) {
					sequence_Addition(context, (BinOp) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getArithExpRule() ||
				   context == grammarAccess.getExprRule()) {
					sequence_ArithExp(context, (BinOp) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getMultiplicationRule()) {
					sequence_ArithExp_Multiplication(context, (BinOp) semanticObject); 
					return; 
				}
				else break;
			case TJPackage.CLAZZ:
				if(context == grammarAccess.getClazzRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Clazz(context, (Clazz) semanticObject); 
					return; 
				}
				else break;
			case TJPackage.CONDITION:
				if(context == grammarAccess.getConditionRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_Condition(context, (Condition) semanticObject); 
					return; 
				}
				else break;
			case TJPackage.CONSTANT:
				if(context == grammarAccess.getBaseExpRule() ||
				   context == grammarAccess.getConstantRule()) {
					sequence_Constant(context, (Constant) semanticObject); 
					return; 
				}
				else break;
			case TJPackage.CONSTRUCTOR:
				if(context == grammarAccess.getConstructorRule() ||
				   context == grammarAccess.getMemberRule()) {
					sequence_Constructor(context, (Constructor) semanticObject); 
					return; 
				}
				else break;
			case TJPackage.DYNAMIC:
				if(context == grammarAccess.getBTRule()) {
					sequence_BT(context, (Dynamic) semanticObject); 
					return; 
				}
				else break;
			case TJPackage.DYNAMIC_VALUE:
				if(context == grammarAccess.getBaseExpRule() ||
				   context == grammarAccess.getDynamicValueRule()) {
					sequence_DynamicValue(context, (DynamicValue) semanticObject); 
					return; 
				}
				else break;
			case TJPackage.FIELD:
				if(context == grammarAccess.getFieldRule() ||
				   context == grammarAccess.getMemberRule()) {
					sequence_Field(context, (Field) semanticObject); 
					return; 
				}
				else break;
			case TJPackage.FIELD_ASSIGN:
				if(context == grammarAccess.getFieldAssignRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_FieldAssign(context, (FieldAssign) semanticObject); 
					return; 
				}
				else break;
			case TJPackage.INSTANTIATION:
				if(context == grammarAccess.getInstantiationRule()) {
					sequence_Instantiation(context, (Instantiation) semanticObject); 
					return; 
				}
				else break;
			case TJPackage.LIFT_EXP:
				if(context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getLiftExpRule() ||
				   context == grammarAccess.getMultiplicationRule()) {
					sequence_LiftExp(context, (LiftExp) semanticObject); 
					return; 
				}
				else break;
			case TJPackage.LOCAL_ASSIGN:
				if(context == grammarAccess.getLocalAssignRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_LocalAssign(context, (LocalAssign) semanticObject); 
					return; 
				}
				else break;
			case TJPackage.METHOD:
				if(context == grammarAccess.getMemberRule() ||
				   context == grammarAccess.getMethodRule()) {
					sequence_Method(context, (Method) semanticObject); 
					return; 
				}
				else break;
			case TJPackage.METHOD_CALL:
				if(context == grammarAccess.getObjectOpRule()) {
					sequence_ObjectOp(context, (MethodCall) semanticObject); 
					return; 
				}
				else break;
			case TJPackage.OBJECT_OP:
				if(context == grammarAccess.getObjectOpAccess().getMethodCallTargetAction_0_5_1()) {
					sequence_ObjectOp_MethodCall_0_5_1(context, (ObjectOp) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getObjectOpAccess().getMethodCallTargetAction_1_5_1()) {
					sequence_ObjectOp_MethodCall_1_5_1(context, (ObjectOp) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getObjectOpRule()) {
					sequence_ObjectOp(context, (ObjectOp) semanticObject); 
					return; 
				}
				else break;
			case TJPackage.PARAMETER:
				if(context == grammarAccess.getParameterRule()) {
					sequence_Parameter(context, (Parameter) semanticObject); 
					return; 
				}
				else break;
			case TJPackage.PRIMITIVE:
				if(context == grammarAccess.getPrimitiveRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Primitive(context, (Primitive) semanticObject); 
					return; 
				}
				else break;
			case TJPackage.PROGRAM:
				if(context == grammarAccess.getProgramRule()) {
					sequence_Program(context, (Program) semanticObject); 
					return; 
				}
				else break;
			case TJPackage.RETURN:
				if(context == grammarAccess.getReturnRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_Return(context, (Return) semanticObject); 
					return; 
				}
				else break;
			case TJPackage.SCENARIO:
				if(context == grammarAccess.getScenarioRule()) {
					sequence_Scenario(context, (Scenario) semanticObject); 
					return; 
				}
				else break;
			case TJPackage.SINGLE_EXPR:
				if(context == grammarAccess.getSingleExprRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_SingleExpr(context, (SingleExpr) semanticObject); 
					return; 
				}
				else break;
			case TJPackage.STATIC:
				if(context == grammarAccess.getBTRule()) {
					sequence_BT(context, (Static) semanticObject); 
					return; 
				}
				else break;
			case TJPackage.THIS:
				if(context == grammarAccess.getAnnotatedExprRule() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getMultiplicationRule()) {
					sequence_AnnotatedExpr(context, (This) semanticObject); 
					return; 
				}
				else break;
			case TJPackage.VAR_DECL:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getVarDeclRule()) {
					sequence_VarDecl(context, (VarDecl) semanticObject); 
					return; 
				}
				else break;
			case TJPackage.VAR_REF:
				if(context == grammarAccess.getBaseExpRule() ||
				   context == grammarAccess.getVarRefRule()) {
					sequence_VarRef(context, (VarRef) semanticObject); 
					return; 
				}
				else break;
			case TJPackage.WHILE:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getWhileRule()) {
					sequence_While(context, (While) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         lhs=Multiplication 
	 *         (
	 *             (
	 *                 op='+' | 
	 *                 op='-' | 
	 *                 op='$+' | 
	 *                 op='?+' | 
	 *                 op='$-' | 
	 *                 op='?-'
	 *             ) 
	 *             rhs=Addition
	 *         )?
	 *     )
	 */
	protected void sequence_Addition(EObject context, BinOp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((bt=BT? exp=ObjectOp) | (bt=BT? exp=Instantiation))
	 */
	protected void sequence_AnnotatedExpr(EObject context, AnnotatedExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (bt=BT?)
	 */
	protected void sequence_AnnotatedExpr(EObject context, This semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         lhs=Addition 
	 *         (
	 *             (
	 *                 op='<' | 
	 *                 op='>' | 
	 *                 op='==' | 
	 *                 op='$<' | 
	 *                 op='?<' | 
	 *                 op='$>' | 
	 *                 op='?>' | 
	 *                 op='$==' | 
	 *                 op='?=='
	 *             ) 
	 *             rhs=ArithExp
	 *         )?
	 *     )
	 */
	protected void sequence_ArithExp(EObject context, BinOp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             lhs=BaseExp 
	 *             (
	 *                 (
	 *                     op='*' | 
	 *                     op='/' | 
	 *                     op='$*' | 
	 *                     op='?*' | 
	 *                     op='$/' | 
	 *                     op='?/'
	 *                 ) 
	 *                 rhs=Multiplication
	 *             )?
	 *         ) | 
	 *         (
	 *             lhs=Addition 
	 *             (
	 *                 (
	 *                     op='<' | 
	 *                     op='>' | 
	 *                     op='==' | 
	 *                     op='$<' | 
	 *                     op='?<' | 
	 *                     op='$>' | 
	 *                     op='?>' | 
	 *                     op='$==' | 
	 *                     op='?=='
	 *                 ) 
	 *                 rhs=ArithExp
	 *             )?
	 *         )
	 *     )
	 */
	protected void sequence_ArithExp_Multiplication(EObject context, BinOp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Dynamic}
	 */
	protected void sequence_BT(EObject context, Dynamic semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Static}
	 */
	protected void sequence_BT(EObject context, Static semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID variant=INT? base=[Clazz|ID] members+=Member*)
	 */
	protected void sequence_Clazz(EObject context, Clazz semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (bt=BT? cond=Expr thenBody+=Statement* elseBody+=Statement*)
	 */
	protected void sequence_Condition(EObject context, Condition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_Constant(EObject context, Constant semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TJPackage.Literals.CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TJPackage.Literals.CONSTANT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConstantAccess().getValueINTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (bt=BT? clazz=[Clazz|ID] (params+=Parameter params+=Parameter*)? body+=Statement*)
	 */
	protected void sequence_Constructor(EObject context, Constructor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=[Type|ID] name=ID)
	 */
	protected void sequence_DynamicValue(EObject context, DynamicValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TJPackage.Literals.DYNAMIC_VALUE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TJPackage.Literals.DYNAMIC_VALUE__TYPE));
			if(transientValues.isValueTransient(semanticObject, TJPackage.Literals.DYNAMIC_VALUE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TJPackage.Literals.DYNAMIC_VALUE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDynamicValueAccess().getTypeTypeIDTerminalRuleCall_2_0_1(), semanticObject.getType());
		feeder.accept(grammarAccess.getDynamicValueAccess().getNameIDTerminalRuleCall_4_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((bt=BT? object=ID name=ID rhs=Expr) | (bt=BT? name=ID rhs=Expr))
	 */
	protected void sequence_FieldAssign(EObject context, FieldAssign semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (bt=BT? final?='final'? type=[Type|ID] name=ID)
	 */
	protected void sequence_Field(EObject context, Field semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=[Clazz|ID] variant=INT? (argument+=Expr argument+=Expr*)?)
	 */
	protected void sequence_Instantiation(EObject context, Instantiation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     exp=Expr
	 */
	protected void sequence_LiftExp(EObject context, LiftExp semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TJPackage.Literals.LIFT_EXP__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TJPackage.Literals.LIFT_EXP__EXP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLiftExpAccess().getExpExprParserRuleCall_1_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (bt=BT? name=ID rhs=Expr)
	 */
	protected void sequence_LocalAssign(EObject context, LocalAssign semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         bt=BT? 
	 *         type=[Type|ID] 
	 *         name=ID 
	 *         variant=INT? 
	 *         (params+=Parameter params+=Parameter*)? 
	 *         body+=Statement*
	 *     )
	 */
	protected void sequence_Method(EObject context, Method semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (target=ObjectOp_MethodCall_0_5_1 (argument+=Expr argument+=Expr*)?) | 
	 *         target=ObjectOp_MethodCall_0_5_1 | 
	 *         (target=ObjectOp_MethodCall_1_5_1 (argument+=Expr argument+=Expr*)?) | 
	 *         target=ObjectOp_MethodCall_1_5_1
	 *     )
	 */
	protected void sequence_ObjectOp(EObject context, MethodCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (object=ID qualifier=[Clazz|ID]? name=ID variant=INT?)
	 */
	protected void sequence_ObjectOp_MethodCall_0_5_1(EObject context, ObjectOp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (qualifier=[Clazz|ID]? name=ID variant=INT?)
	 */
	protected void sequence_ObjectOp_MethodCall_1_5_1(EObject context, ObjectOp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((object=ID qualifier=[Clazz|ID]? name=ID variant=INT?) | (qualifier=[Clazz|ID]? name=ID variant=INT?))
	 */
	protected void sequence_ObjectOp(EObject context, ObjectOp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (bt=BT? type=[Type|ID] name=ID)
	 */
	protected void sequence_Parameter(EObject context, Parameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Primitive(EObject context, Primitive semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TJPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TJPackage.Literals.TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrimitiveAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (pkgname=ID scenarios+=Scenario* types+=Type*)
	 */
	protected void sequence_Program(EObject context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (bt=BT? exp=Expr)
	 */
	protected void sequence_Return(EObject context, Return semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID target+=Statement* assertion+=Statement*)
	 */
	protected void sequence_Scenario(EObject context, Scenario semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (bt=BT? exp=Expr)
	 */
	protected void sequence_SingleExpr(EObject context, SingleExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (bt=BT? type=[Type|ID] variant=INT? name=ID)
	 */
	protected void sequence_VarDecl(EObject context, VarDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (bt=BT? name=ID)
	 */
	protected void sequence_VarRef(EObject context, VarRef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (bt=BT? cond=Expr body+=Statement*)
	 */
	protected void sequence_While(EObject context, While semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
