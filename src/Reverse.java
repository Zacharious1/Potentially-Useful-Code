public class Reverse {
    public static void main(String[] args) {
        int[] list1 = new int[10];
        int[] list2 = new int[10];
        int key = 15;
        initialize(list1);
        printArray(list1);
        System.out.println(linearSearch(list1, key));
    }
    public static int[] reverseArray(int[] y) {
        int[] b = new int[y.length];
        for (int i = 0, j = y.length - 1; j >= 0; i++, j--) {
            b[j] = y[i];

        }
        return b;
    }
    public static void printArray(int[] y) {
        for (int i = 0; i < y.length; i++) {
            System.out.print(y[i] + " ");
        }
    }

    public static int linearSearch(int[] x, int key) {
        int index = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] == key)
                return i;
        }
        return -1;
    }

    public static void initialize(int[] x) {
        for (int i = 0; i < x.length; i++) {
            x[i] = 1 + (int) (Math.random() * 20);
        }

    }
}
