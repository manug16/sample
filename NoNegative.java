import java.util.Scanner;
public class NoNegative {

   public static void main(String[] args) {
   Scanner scnr = new Scanner(System.in);
   System.out.println("Choose a value.");
   double value = scnr.nextDouble();
   if (value >= 0) {
   System.out.println("The square root of the given value is " + Math.sqrt(value) + ".");
   } else { 
   System.out.println("The square root of the given value is a nonreal answer.");
   }
   return;
   }
}