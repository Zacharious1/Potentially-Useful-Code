public class SelectionSort {
    public static void main(String[] args) {

    }
    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int currentMin = 0;
            int currentMinIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < currentMin) {
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
