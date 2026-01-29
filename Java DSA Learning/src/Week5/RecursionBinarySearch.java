package Week5;

import java.util.Scanner;

public class RecursionBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the limit of an array");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i =0; i<n;i++){
            System.out.println("Please enter the number upto th limit of "+n);
            a[i]=sc.nextInt();
        }
        System.out.println("Please enter the target number to find");
        int target = sc.nextInt();
        int value = recSearch(a,0,n-1,target);
        if(value == -1){
            System.out.println("The given value "+ target + " was not found");
        }else {
            System.out.println("The give value "+ target +" was found in the array which index was "+value);
        }
    }
    public static int recSearch(int[] a, int low, int high,int target){
        int mid = (low+high)/2;
        if(low>high){
            return -1;
        }
        if(a[mid]==target){
            return mid;
        }else if(a[mid]>target){
            return recSearch(a,low,mid-1,target);
        }
        return recSearch(a,low+1,high,target);
    }
}

