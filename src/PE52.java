//Help Received: Stack Overflow; was not submitted with Programming Eval 5 https://stackoverflow.com/questions/19590242/finding-max-value-in-an-array-using-recursion
public class PE52 {
    private static int findLargestInArray(int[] arr,int pos) {
        if(pos == (arr.length-1)) {
            return arr[pos];
        } else {
            return Math.max(arr[pos], findLargestInArray(arr, pos+1));
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 40, 8, 8, 6, 10};
        System.out.println(findLargestInArray(a, 0));
    }
}
