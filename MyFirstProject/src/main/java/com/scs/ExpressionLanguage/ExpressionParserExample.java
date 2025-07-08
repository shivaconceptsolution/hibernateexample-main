package com.scs.ExpressionLanguage;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
public class ExpressionParserExample {

	public static void main(String[] args) {
		ExpressionParser parser = new SpelExpressionParser();
		StandardEvaluationContext context = new StandardEvaluationContext();
		context.setVariable("a",1000);
		context.setVariable("b",2000);
		Expression exp= parser.parseExpression("#a + #b");
		Integer data = exp.getValue(context,Integer.class);
		System.out.print(data);
		

	}

}
