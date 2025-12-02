package Week2_Excersie_problem.Part1;

import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j = n-i+1; j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
