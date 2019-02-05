public class ArrayExamples {

    public static void initialize(int[] x) {
        for (int i = 0; i < x.length; i++) {
            x[i] = 1 + (int) (Math.random() * 10000);
        }

    }

    public static int sum(int[] z) {
        int sum = 0;
        for (int i = 0; i < z.length; i++) {
            sum += z[i];
        }
        return sum;
    }

    public static int largest(int[] w) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < w.length; i++) {
            if (w[i] > max) {
                max = w[i];
            }
        }
        return max;
    }
    public static int smallestIndex(int[] x) {
        int smallest = -1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < x.length; i++) {
            if (x[i] > max) {
                max = x[i];
                smallest = i;
            }
        }
        return smallest;
    }

    public static void printArray(int[] y) {
        for (int i = 0; i < y.length; i++) {
            System.out.print(y[i] + " ");
        }
    }


    public static void main(String[] args) {
        int[] list = new int[10];

        int[] list2 = new int[10];

        //list2 = list;
        for (int i = 0; i < list.length; i++) {
            list2[i] = list[i];
        }


        initialize(list);
        printArray(list);
        System.out.println("The sum is " + sum(list));
        System.out.println("The max is " + largest(list) + " and its index is " + smallestIndex(list));
        printArray(list2);
        System.out.println("The sum is " + sum(list2));
        System.out.println("The max is " + largest(list2) + " and its index is " + smallestIndex(list2));


    }
}
