//Help Received: none
public class SearchArrayForSeries {
    public static boolean contains(int[] list1, int[] list2) {
        String key = "";
        String message = "";
        for (int i = 0; i < list2.length; i++) {
            key += list2[i];
        }
        for (int j = 0; j < list1.length; j++) {
            message += list1[j];
        }
        return (message.contains(key));

    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 3, 2, 1};
        int[] b = {2, 3, 4};
        System.out.println(contains(a, b));

    }

}
