//Help Received: None
import java.util.Scanner;
public class WindChillTemperature
{
    static Scanner sc = new Scanner(System.in);
    static double temperatureOutside;
    static double windSpeed;
    static double windChillTemperature;

    public static void main(String[] args)
    {
        System.out.print("Enter a temperature in Fahrenheit between -58F and 41F: ");
            temperatureOutside = sc.nextDouble();
        System.out.print("Enter wind speed greater than or equal to 2mph: ");
            windSpeed = sc.nextDouble();
        if (temperatureOutside < -58 || temperatureOutside > 41)
        {
            do {
                System.out.print("Error: Temperature must be between -58 and 41! Please enter a temperature between -58 and 41: ");
                    temperatureOutside = sc.nextDouble();
            } while (temperatureOutside < -58 || temperatureOutside > 41);
        }

        if (windSpeed < 2.0)
        {
            do {
                System.out.print("Error: Wind speed must be at least 2mph! Please enter a speed greater than or equal to 2mph: ");
                windSpeed = sc.nextDouble();
            } while (windSpeed < 2.0);
        }

        windChillTemperature = 35.74 + (0.6215 * temperatureOutside) - 35.75 * (Math.pow(windSpeed, 0.16))
                    + (0.4275 * temperatureOutside * Math.pow(windSpeed, 0.16));

        System.out.print("The wind chill index is " + windChillTemperature);
    }
}