import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSum {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++)
            a.add(sc.nextInt());
    }

    public static double sum(ArrayList<Double> list) {
        double sum = 0.0;
        for (Double l : list) {
            sum += l;
        }
        return sum;
    }
}
