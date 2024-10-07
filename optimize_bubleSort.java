/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sorting;

/**
 *
 * @author JUNAID COMPUTER
 */
public class optimize_bubleSort {
        public static void earlyStopBubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false; // Flag to track swaps
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) { // No swaps, array is sorted
                break;
            }
        }
    }

 public static void main(String[] args) {
     optimize_bubleSort s1=new optimize_bubleSort();
     int array[]={5,3,1,6,2,4};
     s1.earlyStopBubbleSort(array);
        
 }   
}

