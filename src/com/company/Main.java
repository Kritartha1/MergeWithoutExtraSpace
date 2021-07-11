package com.company;


//Initial Template for Java

import java.util.*;
import java.io.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        long arr1[]={1,5,7,12,78};
        long arr2[]={2,6,8,13,67};
        merge(arr1,arr2,5,5);
        for(int i=0;i<5;i++){
            System.out.println(arr1[i]);
        }
        for(int i=0;i<5;i++){
            System.out.println(arr2[i]);
        }


    }
    public static void merge(long arr1[], long arr2[], int n, int m)
    {
        int i = 0, j = 0;
        long temp = 0;

        while (i < n && j < m) {
            if (arr1[i] > arr2[j]) {
                temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
                Arrays.sort(arr2);
                i++;
            } else {
                i++;
            }
        }
    }
}

