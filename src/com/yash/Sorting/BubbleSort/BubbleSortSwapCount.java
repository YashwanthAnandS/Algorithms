package com.yash.Sorting.BubbleSort;

import java.util.Scanner;

public class BubbleSortSwapCount {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();

        int n = input.nextInt();
        int i = 0;
        int swap = 0;
        int[] arr = new int[n];
        for (i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println(totalBubbleSortSwaps(arr,m));
    }

    static int totalBubbleSortSwaps(int[] array, int M) {
        int size = array.length;
        int var = 0;
        int totalSwaps = 0;
        //Write your code here
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    totalSwaps++;
                }
            }
        }
        return totalSwaps;
    }
}
