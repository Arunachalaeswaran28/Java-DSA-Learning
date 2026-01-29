package Week4.Recursion;

import java.util.Scanner;

public class RecursionBasic1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printN(n);
    }
    public static void printN(int n){
        if(n ==0){
            return;
        }else{
            System.out.print(n + " ");
            printN(n-1);
        }
        System.out.println();
        System.out.print(n+ " Done ");
    }
}
