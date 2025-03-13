import java.util.Scanner;

public class canner {
    public static void main(String[] args) {
        double[] marks = getStudentMarks();
        System.out.println("Marks entered: Test 1 = " + marks[0] + ", Test 2 = " + marks[1] +
                           ", Assignments = " + marks[2] + ", Quizzes = " + marks[3]);
    }

    public static double[] getStudentMarks() {
        Scanner input = new Scanner(System.in);
        double[] marks = new double[4];

        System.out.println("Enter marks for Test 1:");
        marks[0] = input.nextDouble();
        
        System.out.println("Enter marks for Test 2:");
        marks[1] = input.nextDouble();
        
        System.out.println("Enter marks for Assignments:");
        marks[2] = input.nextDouble();
        
        System.out.println("Enter marks for Quizzes:");
        marks[3] = input.nextDouble();
        
        return marks;
    }
}
