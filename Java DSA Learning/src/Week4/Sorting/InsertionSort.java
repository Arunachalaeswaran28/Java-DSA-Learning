package Week4.Sorting;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key;
        System.out.println("Please Enter the limit ");
        int n = sc.nextInt();
        int[] sort = new int[n];
        for(int i =0; i<n; i++){
            System.out.println("Please Enter the number");
            sort[i]=sc.nextInt();

        }

//        Insertion sort
        for(int i = 1; i<n;i++){
            key = sort[i];
            int j = i-1;
            while(j >= 0 && key < sort[j]){
                sort[j+1]=sort[j];
                j--;
            }
            sort[j+1]=key;
        }

        for(int i =0;i<n;i++){
            System.out.print(sort[i]+" ");
        }
    }
}
