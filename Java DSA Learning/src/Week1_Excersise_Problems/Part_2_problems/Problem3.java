package Week1_Excersise_Problems.Part_2_problems;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = sc.next();
        String lastName =  sc.next();
        int n = sc.nextInt();
        for(int i =0; i<n;i++){
            System.out.println(firstName + lastName);
        }
    }
}
