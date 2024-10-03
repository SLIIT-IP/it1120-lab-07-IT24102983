import java.util.Scanner;

public class IT24102983Lab7Q1A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalSubjects = 4;
        double totalMarks = 0;

        // Input marks for four subjects
        for (int i = 1; i <= totalSubjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            totalMarks += input.nextDouble();
        }

        // Calculate average
        double average = totalMarks / totalSubjects;
        System.out.println("Average is :" +average);

        // Display grade based on average
        if (average >= 75 && average <= 100) {
            System.out.println("Grade: Distinction");
        } else if (average >= 50 && average < 75) {
            System.out.println("Grade: Credit");
        } else if (average >= 0 && average < 50) {
            System.out.println("Grade: Fail");
        } else {
            System.out.println("Invalid marks entered.");
        }

        
    }
}
