package Week4.Recursion;

import java.util.Scanner;

public class countZeros {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countZero(n));
    }
    public static int countZero(int n){
        if(n%10==n){
            if(n==0){
                return 1;
            }else{
                return 0;
            }
        }
        else if(n%10==0){
            return 1+ countZero(n/10);
        }else{
            return countZero(n/10);
        }
    }
}
