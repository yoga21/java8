package com.lambda.expression;

interface Multiply{
	//lambda expression single input parameter
	
	void mul(int a);
}

public class LambdaDemo_1 {

	public static void main(String[] args) {
	
		//lambda expression
		
		Multiply m=( a)->System.out.println("multiply="+" "+a);
		

m.mul(5);
	}


}
