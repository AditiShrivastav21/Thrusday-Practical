/*Write a program in java showing overloading of Add method with 2 and 3 parameters.
In the user passes 2 values method with 2 parameter should be called if he passes 3 values method with 3 parameters should be called*/



class OverLoad
{
	int add(int no1, int no2) //method to add two numbers
	{
		return no1+no2;
	}
	int add(int no1, int no2, int no3) //method to add three numbers
	{
		return no1+no2+no3;
	}
}
class OverAdd
{
	public static void main(String args[])
	{
		OverLoad o1=new OverLoad (); // class object is created
		int result2=o1.add(5, 6); // addTwo method is called 
		System.out.println("Addition of two numbers:"+result2); 
		int result3=o1.add(8,9,4); //addThree method is called
		System.out.println("Addition of three numbers:"+result3);
		
		
	}
}