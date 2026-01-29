package Week5;

import java.util.Scanner;

public class BinarySearch {
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
        int value = Bsearch(a,target,n);
        if(value==-1){
            System.out.println("The give number was not found in the given array");
        }else{
            System.out.println("The number found "+ a[value]);
        }
    }
//Binary search using iterative
// Function to perform Binary Search on sorted array
    public static int Bsearch(int[] a,int target,int n){
        int low = 0;
        int high = n-1;
        int mid;
        // Keep searching until low crosses high
        while(low<=high){
            mid= (low+high)/2; // Find the middle index
            if(a[mid]==target){// Target found
                return mid;
            }else if(a[mid]<target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return -1;
    }
}
