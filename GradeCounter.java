import java.util.Scanner;

public class GradeCounter {
   public static void main(String[] args) {
   Scanner scnr = new Scanner(System.in);
   double totalGrades = 0;
   int gradeCount = 0;
   double average = 0;
   System.out.println("Enter a grade or enter -1 to exit.");
   double gradeAdded = scnr.nextDouble();
   while (gradeAdded != -1) {
      gradeCount += 1;
      totalGrades += gradeAdded;
      average = totalGrades/gradeCount;
      System.out.println("Enter another grade or enter -1 to exit.");
      gradeAdded = scnr.nextDouble();
      }
      System.out.println("The average score is " + average + ".");
    }
}