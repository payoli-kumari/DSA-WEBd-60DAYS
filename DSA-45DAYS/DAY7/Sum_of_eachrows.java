 import java.util.Scanner;
public class Sum_of_eachrows{
static void Rowsum(int [][] arr){
    for(int i=0;i<arr.length;i++){
        int Sum=0;
        for(int j=0;j<arr[i].length;j++){
            Sum +=arr[i][j];
        }
        System.out.println("Sum of row" +(i+1)+ "=" +Sum);
    }
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number of rows:");
    int rows = sc.nextInt();

     System.out.println("Enter number of columns:");
    int columns = sc.nextInt();

    int [][]arr=new int[rows][columns];
    System.out.println("Enter array elements:");

    for (int i=0;i<rows;i++){
        for (int j=0;  j<columns;j++){
            arr[i][j]=sc.nextInt();
        }
    }
      Rowsum(arr);
   }
}


/* (Richest customer wealth similar concept)
class Solution {
    public int maximumWealth(int[][] accounts) {

        int maxWealth = 0;

        for (int i = 0; i < accounts.length; i++) {

            int sum = 0;

            for (int j = 0; j < accounts[i].length; j++) {
                sum = sum + accounts[i][j];
            }

            if (sum > maxWealth) {
                maxWealth = sum;
            }
        }

        return maxWealth;
    }
}
*/