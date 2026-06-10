package Array;

import java.util.Scanner;

public class CountFreqInArray {
    public static void main(String[] args) {
        System.out.println("enter the size of the Array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int freq[] = new int[10];
        System.out.println("enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        for(int i=0;i<n;i++){
            if(freq[i] > 0){
                System.err.println(i+" -> "+ freq[i]);
            }
        }
    }
}
