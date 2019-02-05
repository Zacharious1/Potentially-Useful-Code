//Help Received: None
import java.util.Scanner;

public class AssignGradesOnCurve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = sc.nextInt();
        int[] grades = new int[students];
        int max = 0;
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Enter grade for student number " + (i + 1) + " then press enter: ");
            grades[i] = sc.nextInt();
        }
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > max)
            max = grades[i];
        }
        for (int i = 0; i < grades.length; i++) {
            if ((max - grades[i]) >= 0 && (max - grades[i]) < 11) {
                System.out.println("Student " + (i+1) + ", with a score of " + grades[i] + ", earned a A" );
            }
            else if ((max - grades[i]) >= 11 && (max - grades[i]) < 21) {
                System.out.println("Student " + (i+1) + ", with a score of " + grades[i] + ", earned a B" );
            }
            else if ((max - grades[i]) >= 21 && (max - grades[i]) < 31) {
                System.out.println("Student " + (i+1) + ", with a score of " + grades[i] + ", earned a C" );
            }
            else if ((max - grades[i]) >= 31 && (max - grades[i]) < 41) {
                System.out.println("Student " + (i+1) + ", with a score of " + grades[i] + ", earned a D" );
            }

        }

    }
}
