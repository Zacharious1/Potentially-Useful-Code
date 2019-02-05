//Help Received: none
import java.util.Scanner;
public class TwoHighestScores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");

        int numberOfStudents = sc.nextInt();
        System.out.print("Enter first student and score: ");
        String highest = sc.next();
        int highestScore = sc.nextInt();

        System.out.print("Enter second student and score: ");
        String second = sc.next();
        int secondScore = sc.nextInt();

        if (highestScore < secondScore) {
            String temp = highest;
            highest = second;
            second = temp;
            int tempScore = highestScore;
            highestScore = secondScore;
            secondScore = tempScore;
        }


        System.out.print("Enter third student and score: ");
        String current = sc.next();
        int currentScore = sc.nextInt();

        if (currentScore > highestScore) {
            secondScore = highestScore;
            second = highest;
            highest = current;
            highestScore = currentScore;
            numberOfStudents -= 3;
        }
            while (numberOfStudents != 0) {
                numberOfStudents--;
                if (currentScore > highestScore) {
                    secondScore = highestScore;
                    second = highest;
                    highest = current;
                    highestScore = currentScore;
                }
                System.out.print("Enter next Students name and score: ");
                current = sc.next();
                currentScore = sc.nextInt();
            }
            System.out.println(highest + " " + highestScore);
            System.out.println(second + " " + secondScore);

    }
}
