package Array;

import java.util.*;

public class DiffBtnFirstLastEleArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        
        int Arr[] = new int[n];

        for(int i=0;i<n;i++){
            Arr [i] = sc.nextInt();
        }
     int diff = Arr[n-1] - Arr[0];

     System.out.println("Difference = " +diff);
    }
}
