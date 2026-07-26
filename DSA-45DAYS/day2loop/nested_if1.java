import java.util.Scanner;

public class nested_if1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        if(n%5==0){
            if(n%3==0){
                System.out.println("the number is divisible by 3 & 5");
            }else{
                System.out.println("not divisible");
            }
        else{
          System.out.println("not divisible");
        }
    }
  }
}
