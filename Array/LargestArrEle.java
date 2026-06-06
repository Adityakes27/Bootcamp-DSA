package Array;

import java.util.Scanner;

public class LargestArrEle {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter elements of the array");
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int Largest = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i] > Largest){
                Largest = arr[i];
            }

        }
        System.out.println("largest Element = " +Largest);
    }
}
