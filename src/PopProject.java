//Help Received: None
public class PopProject 
{
	static double InitialPop = 312032486; //From book
	static double FinalPop; 
	static double second = 1;
	static double minute = 60 * second; //Used to find year
	static double hour = 60 * minute; //Used to find year
	static double day = 24 * hour; //Used to find year
	static double year = 365 * day;
	static double baby = 0;
	static double death = 0;
	static double immigrant = 0;
	static int Year; //Used as a counter in Printed line
	static double SecinYear = (year / second); //Number of seconds in a year
	public static void main(String[] args) 
	{
		baby = SecinYear / 7.0;
		death = SecinYear / 13.0;
		immigrant = SecinYear / 45.0;

		Year++; //Increases the year counter for use in output
		FinalPop = InitialPop + (baby + immigrant - death); //adds the initial population to the sum of all babies, immigrants, and deaths in a year. 
		InitialPop = FinalPop; //Changes the initial population to match the previously calculated final population, to be used in next years calculation.  
		System.out.println("Year " + Year + ": " + FinalPop); //Prints "Year" (year number from counter) : (Whatever the final population is)

		Year++;
		FinalPop = InitialPop + (baby + immigrant - death);
		InitialPop = FinalPop;
		System.out.println("Year " + Year + ": " + FinalPop);

		Year++;
		FinalPop = InitialPop + (baby + immigrant - death);
		InitialPop = FinalPop;
		System.out.println("Year " + Year + ": " + FinalPop);

		Year++;
		FinalPop = InitialPop + (baby + immigrant - death);
		InitialPop = FinalPop;
		System.out.println("Year " + Year + ": " + FinalPop);

		Year++;
		FinalPop = InitialPop + (baby + immigrant - death);
		InitialPop = FinalPop;
		System.out.println("Year " + Year + ": " + FinalPop);
	}		
}