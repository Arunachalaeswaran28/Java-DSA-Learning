package Week1_Excersise_Problems;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int size = sc.nextInt();
        switch (size) {
            case 29 -> System.out.println("Small");
            case 30 -> System.out.println("Medium");
            case 38 -> System.out.println("Large");
            case 42 -> System.out.println("XLarge");
            default -> System.out.println("Invalid");
        }
    }
}
