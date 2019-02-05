//Help Received: none
public class SumSeriesWithRoots {
    public static void main(String[] args) {
    double total = 0;
    for (double i = 1.0; i < 625; i++) {
        double numerator = 1;
        double j = i + 1.0;
        double denominator = Math.sqrt(i) + Math.sqrt(j);
        total += (numerator / denominator);

        }
        System.out.println(total);
    }
}
