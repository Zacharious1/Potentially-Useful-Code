public class RecursionExamples {
    public static int sumNumbers(int n) {
        if (n == 1) {
            return 1;
        }
        return sumNumbers(n - 1) + n;
    }

    public static int fib(int n) {
        if(n<2)
            return n;
        return (fib(n - 1) + fib(n - 2));
    }

    public static int exponent(int n, int m) {
        if (n == 1) {
            return 1;
        }
        if (m == 0) {
            return 1;
        }
        if (m == 1) {
            return n;
        }
        return exponent(n, m - 1) * n;
    }

    public static int nBang(int n) {
        if (n < 2) {
            return 1;
        }
        return n * nBang(n - 1);
    }

    public static void test(int x) {
        if (x > 0 && x < 10) {
            System.out.println(x + " ");
            test(x + 1);
        }
    }
    public static void main(String[] args) {
        System.out.println(sumNumbers(7));
        System.out.println(exponent(10, 4));
        System.out.println(fib(9));
        System.out.print(nBang(3));
        test(6);
    }

}

