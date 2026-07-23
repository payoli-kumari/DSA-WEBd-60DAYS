import java.util.Scanner;

public class if_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        System.out.println(n);
        if (n%2==0) {
            System.out.println("the number is even");
        }
        if (n%2 != 0) {
            System.out.println("the number is odd");
            
        }

        
    }
}
