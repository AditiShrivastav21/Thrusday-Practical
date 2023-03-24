class Calculator_Data 
{
    int add(int a, int b) //method to add
	{
        return a + b;
    }

    int sub(int a, int b) //method to substract
	{
        return a - b;
    }

    int multiply(int a, int b) //method to multiply
	{
        return a * b;
    }
	
	int div (int a, int b) // method to divide
	{
		return a/b;
	}
}

class Calculator 
{
    public static void main(String args[])
	{
        Calculator_Data c1 = new Calculator_Data();
        int resultadd = c1.add(5, 8);
        System.out.println("Addition: " + resultadd);
		int resultsub = c1.sub(689, 98);
        System.out.println("Substraction: " + resultsub);
		int resultmul = c1.multiply(5, 8);
        System.out.println("Multiplication: " + resultmul);
		int resultdiv = c1.div(90, 9);
        System.out.println("Addition: " + resultdiv);
    }
}
