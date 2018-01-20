// Generated from AdvancedCalculator.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AdvancedCalculatorParser}.
 */
public interface AdvancedCalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AdvancedCalculatorParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(AdvancedCalculatorParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AdvancedCalculatorParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(AdvancedCalculatorParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link AdvancedCalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParens(AdvancedCalculatorParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link AdvancedCalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParens(AdvancedCalculatorParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code num}
	 * labeled alternative in {@link AdvancedCalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNum(AdvancedCalculatorParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code num}
	 * labeled alternative in {@link AdvancedCalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNum(AdvancedCalculatorParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link AdvancedCalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(AdvancedCalculatorParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link AdvancedCalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(AdvancedCalculatorParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulDiv}
	 * labeled alternative in {@link AdvancedCalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(AdvancedCalculatorParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulDiv}
	 * labeled alternative in {@link AdvancedCalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(AdvancedCalculatorParser.MulDivContext ctx);
}