public class Main {
    public static void main(String[] args) {
        int numStudents = 5;
        double[][] studentMarks = new double[numStudents][4];
        double[] totalMarks = new double[numStudents];
        boolean[] qualified = new boolean[numStudents];
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1));
            studentMarks[i] = canner.getStudentMarks(); // Get marks from canner.java
            
            // Calculate total out of 60%
            totalMarks[i] = studentMarks[i][0] + studentMarks[i][1] + studentMarks[i][2] + studentMarks[i][3];

            // Check qualification (must have at least 30% of 60)
            qualified[i] = totalMarks[i] >= (0.3 * 60);
            
            // Append results to be displayed
            result.append("Student ").append(i + 1).append(": Total Marks = ")
                  .append(totalMarks[i]).append("/60, ")
                  .append(qualified[i] ? "Qualified" : "Not Qualified")
                  .append("\n");
        }

        // Display the results using JOptionPane
        pan.displayResult(result.toString());
    }
}
