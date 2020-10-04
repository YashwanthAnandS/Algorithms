package com.yash.Searching.LinearSearch;

/*
You have been given an array of size N consisting of integers. In addition you have been given an element M you need to find and print the index of the first and last occurrence of this element M in the array if it exists in it, otherwise print -1.

Input Format:

The first line consists of 2 integers N and M denoting the size of the array and the element to be searched for in the array respectively . The next line contains N space separated integers denoting the elements of of the array.

Output Format

Print a single integer denoting the index of the last occurrence of integer M in the array if it exists, otherwise print -1.

SAMPLE INPUT
5 1
1 2 3 4 1
SAMPLE OUTPUT
First index found at 0
Last index found at 4
 */


import java.util.Scanner;

public class FirstLastOccurence {
    public static void linearSearchFirstLastIndex(int arr[],int n, int x)
    {

        int first = -1, last = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x && first == -1) {
                first = i;
            }

            //Assign value at last index
            if (arr[i] == x && first != -1) {
                last = i;
            }
        }
            System.out.println("First index found at " + first);
            System.out.println("Last index found at " + last);

    }

    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();

        }
        int x = scan.nextInt();
        scan.close();

       linearSearchFirstLastIndex(arr, size, x);

    }
}
