package Array;

import java.util.Scanner;

public class SmallestArrEle {
    public static void main(String[] args) {
        
        System.out.println("enter the size of the array");

Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
       System.out.println("Enter Elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int smallest = arr[0];
        for(int i=1;i<n;i++){
             if(arr[i] < smallest){
                smallest = arr[i];
             }
        }
        System.out.println("Smallest Element = " + smallest);
        sc.close();
    }
}
