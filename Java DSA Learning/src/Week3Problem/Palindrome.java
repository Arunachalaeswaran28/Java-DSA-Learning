package Week3Problem;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0, even = 0;
        int temp = n;
        while(temp>0){
            int ld = temp%10;
            sum = 10*sum+ld;
            temp=temp/10;
        }
        System.out.println(sum);
        if(sum == n){
            System.out.println("The Given number was palindrome");
        }else{
            System.out.println("The Given number was not palindrome");
        }
        System.out.println(Integer.MAX_VALUE);
    }
}
