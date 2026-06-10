package Array;

import java.util.Scanner;

public class LongestConsIncreSubArr {
    //A consecutive increasing subarray is a continuous part of an array where each element is greater than the 
    // previous element.
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size od the array :");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("enter the elements of the array :");
           for(int i=0;i<n;i++){
    arr[i] = sc.nextInt();
    }
    int maxlen = 1;
    int curlen = 1;
     
     for(int i=1;i<n;i++){
        if(arr[i] > arr[i-1])
            curlen++;
        
        else
            curlen = 1;
        if(maxlen > curlen)
            maxlen = curlen;
     }
     System.out.println("the longest conscutive increasing aubarray = "+ maxlen);
    }
}
