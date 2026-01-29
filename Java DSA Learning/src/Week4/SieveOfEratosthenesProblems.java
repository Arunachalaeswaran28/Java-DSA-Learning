package Week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SieveOfEratosthenesProblems {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Please Enter the starting range");
        int rangeStart = sc.nextInt();
        System.out.println("Please Enter the last element of the rage");
        int lastRange = sc.nextInt();
        int sum = sumofPrime(rangeStart,lastRange);
        System.out.println("Sum of all prime Numbers :"+sum);
    }

    public static int sumofPrime(int f, int l){
        int sum =0;
        int[] prime =  new int[l+1];
        ArrayList<Integer> primeList = new ArrayList<>();
        for(int i =0 ; i<=l; i++){
            prime[i] = 1;
        }
        for(int i =2; i<=Math.sqrt(l);i++){
            if(prime[i]==1){
                for(int j = i*i;j<=l;j=j+i){
                    prime[j]=0;
                }
            }
        }
        for(int i = f; i<=l; i++){
            if(prime[i]==1){
                for(int j = i*i;j<=l;j=j+i){
                    prime[j]=0;
                }
            }
        }

        for(int i = f; i<=l;i++){
            if(prime[i] == 1){
                primeList.add(i);
            }
        }
        int[] primeArray = primeList.stream()
                .mapToInt(i -> i)
                .toArray();
        System.out.println("Prime numbers between given range :"+Arrays.toString(primeArray));
        for(int n:primeArray){
            sum = sum+n;
        }
        return sum;
    }
}
