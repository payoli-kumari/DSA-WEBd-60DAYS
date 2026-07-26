import java.util.Scanner;

public class if_else3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year:");
        int n = sc.nextInt();
        if (n%4==0) {
            System.out.println("The entered year is leap year");
        }
        else
         {
            System.out.println("Not leap year");
            
        }
    }
}
