import java.util.Scanner;
public class BodyTemperature
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int bodyTemperature = sc.nextInt();

		if (bodyTemperature < 96)
			System.out.print("Hypothermia");

		if (bodyTemperature >= 96 && bodyTemperature < 99)
			System.out.print("Normal Status");

		if (bodyTemperature >= 99 && bodyTemperature < 100)
			System.out.print("Inhibition of digestive process");

		if (bodyTemperature >= 100 && bodyTemperature < 102)
			System.out.print("Increased bacteria count");

		if (bodyTemperature >= 102 && bodyTemperature < 104)
			System.out.print("Bacteriastatic");

		if (bodyTemperature >= 104 && bodyTemperature < 107)
			System.out.print("Rik of dehydration");

		if (bodyTemperature > 107)
			System.out.print("Normal cell death");
	}
}