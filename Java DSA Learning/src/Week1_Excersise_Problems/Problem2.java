package Week1_Excersise_Problems;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int value1 = sc.nextInt();
        int value2 =  sc.nextInt();
        int value3 =  sc.nextInt();
        if(value1+value2+value3 ==  180){
            System.out.println("Triangle can be formed");
        }else{
            System.out.println("Triangle cannot  be formed");
        }

    }
}
