package Week3Problem;

import java.util.Scanner;

public class NumberSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0, seriesTerm = 0;
        for(int i = 1; i<=n; i++){
            sum = sum + i;
//            seriesTerm = seriesTerm+sum;

        }
        System.out.println(sum);
    }

    public int sumofFirstnaturalNumbers(int n){
        int sum =0;
        int sumSeries = 0;
        for(int i =1; i<=n;i++){
            sum = sum+i;
            sumSeries = sumSeries+sum;
        }
        return sumSeries;
    }

    public int sumofODdNaturalNumber(int n){
        int sum = 0;
        int sumOdd = 0;
        for(int i =1; i<=(2*n-1);i=i+2){
            sum = sum+i;
            sumOdd = sumOdd+sum;
        }
        return sumOdd;
    }
}
