/* Complex solution with ability to input own string
 * 
import java.util.Scanner;
public class CountLetters 
{
	static Scanner Scan  = new Scanner(System.in);
	static String Phrase;


 	public static void main(String[] args)
{
 		System.out.println("Insert text here: ");
 		String Phrase=Scan.nextLine();
 		System.out.println(Phrase.length());
}
}
 */
//Used google to see how to use scanner with a string (nextLine() command) 

//simple solution

public class CountLetters
{
	static String str = "A cadet will not lie, cheat, steal, nor tolerate those who do";
	public static void main(String[] args)
	{
		System.out.println("The string has " + str.length() + " letters.");
	}
}
//Help Received: None

