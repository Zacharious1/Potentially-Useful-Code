import java.util.Scanner;
public class TimesTables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to multiply by: ");
        int a = sc.nextInt();
        System.out.print("Enter a number you wish to multiply to: ");
        int b = sc.nextInt();
        int[] table = new int[b];
        for (int i = 0; i < table.length; i++) {
            table[i] = a * (i+1);
            System.out.println(a + " x " + (i+1) + " = " + table[i]);
        }
    }
}
