package Week1_Excersise_Problems;

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the  number word and char with spaces");
        int num = sc.nextInt();
        String word = sc.next();
        char letter = sc.next().charAt(0);

        System.out.println(num);
        System.out.println(word);
        System.out.println(letter);

    }
}
