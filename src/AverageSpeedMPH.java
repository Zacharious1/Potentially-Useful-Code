public class AverageSpeedMPH 
{
	static double Kilos = 14.0;
	static double Miles = Kilos / 1.6;
	static double Mins = 45;
	static double Secs = 30;
	static double SecsInMin =  60 * Mins;
	static double Time = Secs + SecsInMin;
	static double TotalTime = Time / 3600;
	static double AvgMph;

	public static void main(String[] args) 
	{
		AvgMph = (Miles / TotalTime);
		System.out.println(AvgMph);
	}

}
//Help Received: None