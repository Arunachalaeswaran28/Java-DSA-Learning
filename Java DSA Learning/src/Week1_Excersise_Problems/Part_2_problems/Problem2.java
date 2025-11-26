package Week1_Excersise_Problems.Part_2_problems;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i = 1;x*i<=1000; i++){
            System.out.println(x*i);
        }
    }
}
