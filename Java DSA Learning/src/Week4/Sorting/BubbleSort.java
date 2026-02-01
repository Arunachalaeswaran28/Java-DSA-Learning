package Week4.Sorting;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Please Enter the limit of the elements in aray");
        int n = sc.nextInt();
        int[] array =  new int[n];
        int max3 = -1;
        for (int i =0;i<n;i++){
            System.out.println("Please enter the number");
            array[i] = sc.nextInt();
        }
   //Bubble sorting
        for(int i =0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1]=temp;
                }
            }
        }

        for(int i =0; i<n;i++){
            System.out.print(array[i]+ " ");
        }
    }



}
