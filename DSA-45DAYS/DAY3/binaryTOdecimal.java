import java.util.Scanner;
public class binaryTOdecimal{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a binary-number:");
    int binary_num=sc.nextInt();
    
    int ans=0;
    int pw=1;  //2^0=1;pw=power of 2

    while(binary_num>0){
        int unit_digit=binary_num %10;
        ans +=(unit_digit*pw);
        binary_num /=10;
        pw *=2;
    }
        System.out.println(ans);

    }
    
}