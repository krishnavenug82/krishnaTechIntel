package exceptionExample.overrideException;

import java8.lamdaExpression.LambdaExpressionEx;

public class classA extends classB {

	public void display() throws IllegalArgumentException {

	}

	public void welcome() throws LambdaExpressionEx {

		throw new LambdaExpressionEx("Throw new exception");}
	

	public int consumer() {

		return 1;
	}
}
