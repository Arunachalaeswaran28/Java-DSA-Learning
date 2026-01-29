package Week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] prime = new int[n + 1];

//        // Step 1: Initialize all elements as 1 (prime)
//        for (int i = 0; i <= n; i++) {
//            prime[i] = 1;
//        }
//
//        // Step 2: 0 and 1 are not prime
//        prime[0] = 0;
//        prime[1] = 0;
//
//        // Step 3: Apply Sieve of Eratosthenes
//        for (int p = 2; p * p <= n; p++) {
//            if (prime[p] == 1) {
//                for (int multiple = p * p; multiple <= n; multiple += p) {
//                    prime[multiple] = 0;
//                }
//            }
//        }
//
//        // Step 4: Print prime numbers
//        System.out.println("Prime numbers up to " + n + ":");
//        for (int i = 2; i <= n; i++) {
//            if (prime[i] == 1) {
//                System.out.print(i + " ");
//            }
//        }
//
//        sc.close();

        ArrayList<Integer> primeList = new ArrayList<>();
        for(int i =0 ; i<n; i++){
            prime[i] = 1;
        }

        for(int i = 2; i<=Math.sqrt(n); i++){
            if(prime[i]==1){
                for(int j = i*i;j<=n;j=j+i){
                    prime[j]=0;
                }
            }
        }

        for(int i = 2; i<=n;i++){
            if(prime[i] == 1){
                primeList.add(i);
            }
        }
        int[] primeArray = primeList.stream()
                .mapToInt(i -> i)
                .toArray();
        System.out.println(Arrays.toString(primeArray));
    }

}
