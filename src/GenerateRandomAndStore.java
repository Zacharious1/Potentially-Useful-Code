public class GenerateRandomAndStore {
    public static void main(String[] args) {
        int[] myArr = new int[10];
        double sum = 0.0;
        double average = 0.0;
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = ((int) (1 + Math.random() * 10));
            sum += myArr[i];
            average = sum / myArr.length-1;
            System.out.print(myArr[i] + " ");
        }
        System.out.print("sum = " + sum);
        System.out.print("average = " + average);
    }
}
