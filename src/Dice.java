import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Die one = new Die();
        Die two = new Die();

        while (true) {
            System.out.print("Roll? (Y/N)");
            String a = sc.nextLine();
            a = a.toUpperCase();
            if (a.equals("Y")) {
                one.roll();
                two.roll();

                if (one.getRolled() + two.getRolled() == 7) {
                    System.out.println(one.getRolled());
                    System.out.println(two.getRolled());
                    System.out.println("Craps!");
                } else if (one.getRolled() == 6 && two.getRolled() == 6) {
                    System.out.println(one.getRolled());
                    System.out.println(two.getRolled());
                    System.out.println("Box Cars!");
                } else if (one.getRolled() == 1 && two.getRolled() == 1) {
                    System.out.println(one.getRolled());
                    System.out.println(two.getRolled());
                    System.out.println("Snake Eyes!");
                } else {
                    System.out.println(one.getRolled());
                    System.out.println(two.getRolled());
                }
            }

            if (a.equals("N")) {
                System.out.println("Thanks for playing!");
                System.exit(0);
            }
        }
    }
}
