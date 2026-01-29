package Week4.Recursion;

import java.util.Scanner;

public class powerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(power(n,value));
    }
    public static int power(int n,int value){
        if(n==0){
            return 1;
        }else{
            return value * power(n-1,value);
        }
    }
}
