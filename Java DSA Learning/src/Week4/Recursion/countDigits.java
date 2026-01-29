package Week4.Recursion;

import java.util.Scanner;

public class countDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println(countDigit(n));
    }
    public static int countDigit(int n){
        if(n%10!=n){
            return 1+countDigit(n/10);
        }else{
            return 1;
        }
    }
}
