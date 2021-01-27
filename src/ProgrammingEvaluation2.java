//Help Received: Liam Walker helped with logic
import java.util.Scanner;
public class ProgrammingEvaluation2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();
        int[][] scores = new int[numberOfStudents][];
        String[] names = new String[numberOfStudents];
        double[] average = new double[numberOfStudents];
        char letter = 0;
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter student " + (i + 1) + "'s name");
            names[i] = sc.next();

            System.out.println("Enter  " + names[i] + "'s number of classes");
            int numberOfClasses = sc.nextInt();
            scores[i] = new int[numberOfClasses];

            System.out.println("Enter  " + names[i] + "'s grades for their " + scores[i].length + " classes");
            for (int j = 0; j < scores[i].length; j++)
                scores[i][j] = sc.nextInt();

            double studentTotalScore = 0;
            for (int j = 0; j < scores[i].length; j++)
                studentTotalScore += scores[i][j];
            average[i] = studentTotalScore / scores[i].length;

            if (average[i] >= 90) {
                letter = 'A';
            } else if (average[i] >= 80) {
                letter = 'B';
            } else if (average[i] >= 70) {
                letter = 'C';
            } else if (average[i] >= 60) {
                letter = 'D';
            } else {
                letter = 'F';
            }
        }
        for (int j = 0; j < numberOfStudents; j++) {
            System.out.println(names[j] + " has a grade of " + letter + " with an average of " + average[j]);
        }
    }
}