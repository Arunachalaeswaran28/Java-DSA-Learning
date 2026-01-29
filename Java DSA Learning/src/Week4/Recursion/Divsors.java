package Week4.Recursion;

import java.util.Scanner;

public class Divsors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        divisor(n,i);
    }
    public static void divisor(int n, int i){
        if(i>n){
            return;
        }else if(n%i == 0){
            System.out.print(i+ " ");
        }
        divisor(n,i+1);

    }
}
