//Help Received: none
public class AddElementsInsideArray {
    public static int[] collapse(int[] a) {
        int[] collapsedArray = new int[(a.length/2)];
        int count = 0;
            for (int i = 0; i < a.length-1; i += 2) {
                collapsedArray[count] = a[i] + a[i + 1];
                count++;
            }
        return collapsedArray;
    }
}
