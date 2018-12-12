class Hello
{
	static int addition(int number1,int number2)
	{
		int sumOfTwoNumbers=number1+number2;
		return sumOfTwoNumbers;	
	}

	static int subtraction(int number1,int number2)
	{
		int subtract=number1-number2;
		return subtract;	
	}
	static int multiplication(int number1,int number2)
	{
		int multiply=number1*number2;
		return multiply;	
	}
	static float division(float number1,float number2)
	{
		float divide=number1/number2;
		return divide;	
	}
	public static void main(String[] args)
	{			
		int sum=addition(10,20);
		int subtract=subtraction(30,10);
		float multiply=multiplication(40,20);
		float divide=division(9.0f,2.0f);
		System.out.println("sum of two numbers:"+sum);
	        System.out.println("subtraction of two numbers:"+subtract);
	        System.out.println("multiplication of two numbers"+multiply);
	        System.out.println("Division of two numbers:"+divide);
    	}
}