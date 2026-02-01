package Week5;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the limit of an array");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i =0; i<n;i++){
            System.out.println("Please enter the number upto th limit of "+n);
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int value = getSecondLargest(a);
        if(value == -1){
            System.out.println("There was no seconnd largest element in the given array "+ Arrays.toString(a));
        }else{
            System.out.println("The second largest element in the given array was "+ value);
        }
    }
    public static int getSecondLargest(int[] arr) {
//        Second largest
        int n = arr.length;
        int max1 = -1;
        int max2 =-1;
        for(int i =0; i<n;i++){
            if(arr[i]>max1){
                max1 = arr[i];
            }
        }

        for(int i =0; i<n; i++){
            if(arr[i]>max2 && arr[i]!=max1){
                max2 = arr[i];
            }
        }
        return max2;
    }
}
