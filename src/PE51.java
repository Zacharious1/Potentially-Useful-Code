public class PE51 {
    public static int sumNumbers(int n) {
        if (n == 1) {
            return 1;
        }
        return sumNumbers(n - 1) + n;
    }
}
