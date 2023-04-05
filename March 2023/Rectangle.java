/*Create a class named 'Rectangle' with two data members 'length' and 'breadth' and 
two methods to print the area and perimeter of the rectangle respectively. 
Its constructor having parameters for length and breadth is used to initialize length and breadth
 of the rectangle.
Print the area and perimeter of a rectangle */
class RectangleInfo
{
	int length, breadth; //data members
	
	void  areaOfRectangle()  //method to print area of rectangle
	{
		int area= length*breadth;
		System.out.println("Area of Rectangle is :"+area);
	}
	
	void perimeterOfRectangle() //method to print perimeter of rectangle
	{
		int perimeter= 2*length+2*breadth;
		System.out.println("Perimeter of Rectangle is :"+perimeter);
	
	}
	
	public RectangleInfo (int length, int breadth) // constructor having parameters for length and breadth is used to initialize length and breadth
	{
		 this.length= length;
		 this.breadth=breadth;
	}
	
}
class Rectangle
{
	public static void main(String args[])
	{
		RectangleInfo r1= new RectangleInfo(5, 9); // object created of RectangleInfo
		r1.areaOfRectangle();
		r1.perimeterOfRectangle();
	}
} 

