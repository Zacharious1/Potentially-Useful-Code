import java.util.Random;

public class Utility {
    public static void main(String[] args) {
        Random test = new Random(1000);
        for (int i = 0; i < 51; i++)
            System.out.println(test.nextInt(100));
    }
}
