import java.util.Scanner;

public class nestedifelse1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n");
        int n = sc.nextInt();

        if (n % 15 != 0 && (n % 3 == 0 || n % 5 == 0)) {
            System.out.println("The number is divisible by 3 or 5 but not 15");
        } else {
            System.out.println("Not matching the required condition");
        }
    }
}