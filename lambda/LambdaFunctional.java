package com.lambda.expression;



///-------------------------------------------------------------------------------	
	//This is not functional interface because here 2 abstract method.
	//functional interface have only one abstract method
	
//	interface add{
//		
//		void m1();
//		
//		void m2();
//	}
	
	//----------------------------------------------------------------------------
	
	
	//it is not compulsory to add anotation but we must be use @FunctionalInterface
	
	//Invalid '@FunctionalInterface' annotation; LambdaFunctional.add is not a functional interface
//	@FunctionalInterface
//	interface add{
//		
//		void m1();
//		
//		Void m2();
//		
//		
//	}
//	
//-----------------------------------------------------------------------------------	
	
	
interface add{
	
	void m1();
}
public class LambdaFunctional  {
	

	


	public static void main(String[] args)  {
		
		
		add a=() -> System.out.println("Addition take place");
					
		a.m1();		
	}

	//to reduce the code lenght in applicaton


}
