import java.util.Scanner;
public class DisplayTIme
{
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of seconds: ");
int numberOfSeconds = sc.nextInt();
int minutes = numberOfSeconds / 60;
int remainingSeconds = numberOfSeconds % 60;
System.out.println("minutes = " + minutes + " seconds = " + remainingSeconds);



}




}
