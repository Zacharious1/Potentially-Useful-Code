//Help Received: none
import java.util.Scanner;
public class HighestAndLowest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number between 1 and 100: ");
        int max = 0;
        int min = 0;
        int[] fiddy = new int[50];
        for (int i = 0; i < 50; i++) {
            fiddy[i] = (1+ (int) (Math.random() * 100));
        }
        for (int i = 0; i < 50; i++) {
            if (fiddy[i] > max)
                max = fiddy[i];
            if (fiddy[i] < min)
                min = fiddy[i];
        }
        System.out.println("The max is: " + max);
        System.out.println("The min is: " + min);
    }
}
