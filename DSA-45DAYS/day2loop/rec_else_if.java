import java.util.Scanner;

public class rec_else_if{
   public static void main(String[] var0) {
      Scanner sc  = new Scanner(System.in);
      System.out.println("Enter length:");
      int length = sc.nextInt();

      System.out.println("Enter breadth:");
      int breadth = sc.nextInt();
      int area= length*breadth;
      int perimeter=2* (length+breadth);

      if (area>perimeter) {
         System.out.println("Area is greater than perimeter");
      }

      else if  (area<perimeter){
         System.out.println("perimeter is greater than area");
      }
         
      else {
         System.out.println("perimeter is equal to area");
      }

   }
}
