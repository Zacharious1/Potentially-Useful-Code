public class BinarySearch {
    public static void main(String[] args) {
        int[] list = {2, 3, 7, 10, 11, 45, 50, 60, 66, 69, 70, 79};
        int index = binarySearch(list, 11);
        System.out.println("index = " + index);
    }
    public static int binarySearch(int[] a, int key) {
        int low = 0;
        int high = a.length-1;
        while (low <= high) {
            int mid = (low+high) / 2;
            if (key < a[mid]) {
                high = mid - 1;
            }
            else if (key == a[mid])
                return mid;
            else low = mid + 1;
        }
        return -1;
    }
}
