import java.util.Scanner;

public class largerof3nums {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         System.out.println("Enter 1st number:");
        int a = sc.nextInt();

        System.out.println("Enter 2nd number:");
        int b = sc.nextInt();

       System.out.println("Enter 3rd number:");
       int c = sc.nextInt();
       if(a>b && a>c){
        System.out.println(a+"is largest:");
       }
        else if(b>c && b>a){
        System.out.println(b+"is largest:");
    }
       else if (c>b && c>a){
        System.out.println(c+"is largest:");
    }
}
}
