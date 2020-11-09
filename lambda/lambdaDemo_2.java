package com.lambda.expression;


interface Addition{
	
	int mul(int a,int b);
}
public class lambdaDemo_2 {

	public static void main(String[] args) {
	
		
	Addition x= ( a,  b)->{
		
	return a+b;
	};
	
	System.out.println(x.mul(10, 9));
	}

	

	

}
