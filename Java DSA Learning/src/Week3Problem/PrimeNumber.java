package Week3Problem;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n =  sc.nextInt();
//        for(int i=2;i<=n;i++){
//            int flag = 0;
//            for(int j =2;j<i;j++){
//                if(i%j==0){
//                    flag =1;
//                }
//            }
//            if(flag==0){
//                System.out.println(i);
//            }
//        }
        System.out.println(isPrime(10));
    }
    static boolean isPrime(int n) {
        // code here
        int flag = 0;
        if(n>1){
            for(int i = 2;i<n;i++){
                if(n%i==0){
                    flag =1;
                    break;
                }
            }
            if(flag==0){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}
