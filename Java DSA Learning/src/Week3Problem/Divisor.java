package Week3Problem;

import java.util.Scanner;

public class Divisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 2; i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.println(i);
                if(n/i!=i){
                    System.out.println(n/i);
                }
            }
        }
        int count = countDivisors(10);
        System.out.println(count);
    }
    static int countDivisors(int n) {
        // code here
        int count = 0;

        for (int i = 1; i <= Math.sqrt(n); i++) {
            int k = n / i;

            if (n % i == 0) {
                if (i % 3 == 0) {
                    count++;
                    // System.out.println(i);
                }
                if (k % 3 == 0 && k != i) {
                    // System.out.println(k);
                    count++;
                }
            }
        }
        return count;
    }
}
