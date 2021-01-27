//Help Received: none
public class StopwatchRun {
    public static void main(String[] args) {
        Stopwatch test = new Stopwatch();
        double[] unsorted = new double[100000];
        for (int i = 0; i < unsorted.length; i++) {
            unsorted[i] = Math.random();
        }
        test.start();
        selectionSort(unsorted);
        test.stop();
        System.out.print(test.getElapsedTime());
    }
    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            double currentMin = list[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
}
