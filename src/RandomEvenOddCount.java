//Help Received: none
public class RandomEvenOddCount {
    public static void main(String[] args) {
        int evens = 0;
        int odds = 0;
        int zeros = 0;
        int[] numbers = new int[100];
        int[] counter = new int[10];

        for (int i = 0; i < numbers.length; i++) {
           numbers[i] = (int) (Math.random() * 10);
           counter[numbers[i]]++;

        }
        for (int i = 0; i < counter.length; i++) {
            System.out.println(i + " = " + counter[i]);
        }

    }
}
