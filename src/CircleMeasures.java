/*public class CircleMeasures extends ApproximatePi 
{

	static double pi = Math.PI;
	static double radius = 5.5;
	static double circumference;
	static double area;



	public static void main(String[] args) 
	{

		circumference = (2.0 * radius * pi);
		area = (radius * radius * pi);


		System.out.println("Circumference is: " + circumference);
		System.out.println("Area is: " + area);

	}
}
//Help Received: None
*/

//More advanced way

import java.lang.Math;
import java.util.Scanner;

public class CircleMeasures extends ApproximatePi 
{
	static Scanner sc = new Scanner(System.in);
	static double size;
	static double pi = Math.PI;
	static double circumference;
	static double area;



	public static void main(String[] args) 
	{
		System.out.print("Enter Radius of First Circle: ");
		size=sc.nextDouble();
		circumference = (2.0 * size * pi);
		area = (size * size * pi);

		System.out.println("The Circumference of the First Circle is: " + circumference);
		System.out.println("The Area of the First Circle is: " + area);
		System.out.println();
		System.out.print("Enter Radius of Second Circle: ");
		size=sc.nextDouble();
		circumference = (2.0 * size * pi);
		area = (size * size * pi);

		System.out.println("The Circumference  of Second Circle is: " + circumference);
		System.out.println("The Area of the Second Circle is: " + area);

	}

}

//HELP RECIEVED: Help on how to use/import scanner from Uncle Dyke Mr. Van Leer
 //Help importing math class from Mr. Van Leer 
  
 

/*public class CircleMeasures
	{
		public static void main(String[] args)
		{
		int radius = 20;
		double area = 3.142 * radius * radius;
		System.out.println("Area of the circle with radius = " + radius + " is " + area);
	
			radius = 10;
			area = 3.142 * radius * radius;
			System.out.println("Area of the circle with radius = " + radius + " is " + area);
	
	
		}
	}
*/