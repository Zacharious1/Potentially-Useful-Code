//Help Received: none
import java.util.Scanner;
public class SearchArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number between 1 and 100: ");
        int test = sc.nextInt();
        boolean flag = false;
        int[] fiddy = new int[50];
        for (int i = 0; i < 50; i++) {
            fiddy[i] = (1+ (int) (Math.random() * 100));
        }
        for (int i = 0; i < 50; i++) {
            if (fiddy[i] == test) {
                System.out.println("The number " + test + " is found on our system.");
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println("The number " + test + " is NOT found on our system.");
    }
}
