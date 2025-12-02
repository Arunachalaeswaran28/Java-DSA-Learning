package Week2_Excersise_problem.Part2;

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while (n>0){
            int ld = n%10;
            n=n/10;
            System.out.println(ld);
            count = count + 1;
        }
        System.out.println(count);
    }
}
