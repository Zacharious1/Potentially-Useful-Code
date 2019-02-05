//Help Received: none
import java.util.Scanner;

public class InitializeAndPopulateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int index = 0;
//    This one takes user input and prints contents, as well as sums all values
        /*for (int i = 0; i < a.length; i++) {
            System.out.println("Enter number " + (i+1));
            a[i] = sc.nextInt();
            if (a[i] > max){
            max = a[i];
            index = i;
            }
            sum += a[i];

            System.out.println(a[i]);
        }*/

//    This one populates with random numbers between 0 and 10 and prints contents, as well as sums all values
        /*for (int i = 0; i < a.length; i++) {
            a[i] = (1 + (int)  (Math.random() * 10));
            sum += a[i];
            if (a[i] > max){
            max = a[i];
            index = i;
            }
            System.out.println(a[i]);
        }*/

        System.out.println("The sum is: " + sum);
        System.out.println("The max value is: " + max);
        System.out.println("The max value's smallest index is: " + index);

    }


}
