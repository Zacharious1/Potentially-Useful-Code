/*public class RectangleMeasure
{
	static double perimeter;
	static double area;
	static double length = 4.5;
	static double Width = 7.9;



	public static void main(String[] args) 
	{
		perimeter = ((2.0 * length) + (2.0 * Width));
		area = (length * Width);

		System.out.println("Perimeter is: " + perimeter);
		System.out.println("Area is: " + area);
		
	}
}
*/
//Help Received: None


import java.util.Scanner;

//more complex solution with user-inputed values
//Help Received: Mr. Van Leer helped me learn how to use scanner utility


public class RectangleMeasure 
{
	static Scanner sc = new Scanner(System.in);
	static double Length;
	static double Width;

	static double perimeter;
	static double area;
	public static void main(String[] args)
	{
		System.out.println("Enter length then press Enter: ");
		Length=sc.nextDouble();
		System.out.println("Enter Width then press Enter: ");
		Width=sc.nextDouble();

		perimeter = (2.0 * Length + 2.0 * Width);
		area = (Length * Width);


		System.out.println("Perimeter is: " + perimeter);
		System.out.println("Area is: " + area);
	}
}

/*import java.util.Scanner;

public class RectangleMeasure 
{
	public static void main(String[] args)
	{
		Scanner Input = new Scanner(System.in);
		int Length = Input.nextInt();
		int Breadth = Input.nextInt();
		int area = Length * Breadth;
		System.out.println("Area of Rectangle = " + area);		
}
}
*/