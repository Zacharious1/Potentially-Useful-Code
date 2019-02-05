//Help Received: none
import java.util.Scanner;
public class VMIID {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your VMI ID (excluding dashes): ");
        String id = sc.nextLine();


        if (id.length() > 10 || id.length() < 10) {
            System.out.println("INVALID ID!!!!");
            System.exit(0);
        }
        char one = id.charAt(0);
        char two = id.charAt(1);
        char three = id.charAt(2);
        char four = id.charAt(3);
        char five = id.charAt(4);
        char six = id.charAt(5);
        char seven = id.charAt(6);
        char eight = id.charAt(7);
        char nine = id.charAt(8);
        char ten = id.charAt(9);

        boolean oneFlag = (one >= 'A' && one <= 'Z');
        boolean twoFlag = (two >= 'A' && two <= 'Z');
        boolean threeFlag = (three >= 'A' && three <= 'Z');
        boolean fourFlag = (four >= '0' && four <= '9');
        boolean fiveFlag = (five >= '0' && five <= '9');
        boolean sixFlag = (six >= '0' && six <= '9');
        boolean sevenFlag = (seven >= '0' && seven <= '9');
        boolean eightFlag = (eight >= '0' && eight <= '9');
        boolean nineFlag = (nine >= '0' && nine <= '9');
        boolean tenFlag = (ten >= 'a' && ten <= 'z');

        if (oneFlag && twoFlag && threeFlag && fourFlag && fiveFlag && sixFlag && sevenFlag && eightFlag && nineFlag && tenFlag) {
            System.out.print("Valid VMI ID");
        } else {
            System.out.println("INVALID ID!!!!");
            System.exit(0);
        }




    }
}
