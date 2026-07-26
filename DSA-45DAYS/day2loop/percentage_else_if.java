//if else if ladder
import java.util.Scanner;
public class percentage_else_if{
   public static void main(String[] var0) {
      Scanner sc  = new Scanner(System.in);
      System.out.println("Enter percentage:");
      int n = sc.nextInt();   //n->percentage

      if(n>90){
         System.out.println("Excellent");
      }
       else if  (n>80){
         System.out.println("very good");
       }
        else if  (n>70){
         System.out.println("good");
        }
          else if  (n>60){
         System.out.println("can do better");
       }
         else if  (n>50){
         System.out.println("average marks");
       }
         else if  (n>40){
         System.out.println("below average");
       }
        else {
         System.out.println("fail");
      }

   }
}
