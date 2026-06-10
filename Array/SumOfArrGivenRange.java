package Array;

import java.util.Scanner;

public class SumOfArrGivenRange {
    public static void main(String[] args) {
        System.out.println("enter the Size of the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
         System.out.println("enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the starting point for sum");
        int l = sc.nextInt();
        System.out.println("enter the ending point for sum");
        int r = sc.nextInt();
        int sum = 0;
        
        for(int i=l;i<r;i++){
            sum += arr[i];
        }
        System.out.println("sum = "+sum);
    }
}
