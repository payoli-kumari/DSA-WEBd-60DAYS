import java.util.Scanner;

public class sidesoftriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter first number"); 
        int a =sc.nextInt();

       System.out.println( "Enter second number"); 
        int b =sc.nextInt();

       System.out.println( "Enter third number"); 
        int c =sc.nextInt();

        if((a+b)>c && (a+c)>b && (b+c)>a){
            System.out.println("Valid Triangle");
        }
        else{
            System.out.println("Invalid Triangle");
        }
   }
}
