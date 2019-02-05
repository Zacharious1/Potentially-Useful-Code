//Help Received: None
public class AverageSpeedKMH 
{
	static double Miles = 24;
	static double Kilos = 1.6 * Miles;
	static double Mins = 40;
	static double Secs = 35;
	static double SecsInHour = 3600;
	static double SecsInMin =  60 * Mins;
	static double Time = Secs + SecsInHour + SecsInMin; //Total time in seconds
	static double TotalTime = Time / 3600; //Converts time in seconds into time in hours
	static double AvgKMH;

	public static void main(String[] args) 
	{
		AvgKMH = (Kilos / TotalTime);
		System.out.println(AvgKMH);
	}

}

