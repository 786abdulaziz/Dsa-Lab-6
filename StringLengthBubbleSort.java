/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sorting;

/**
 *
 * @author JUNAID COMPUTER
 */
import java.util.Arrays;
public class StringLengthBubbleSort {
      public static void sortByLength(String[] strings) {
        int n = strings.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (strings[j].length() > strings[j + 1].length()) {
                    // Swap elements
                    String temp = strings[j];
                    strings[j] = strings[j + 1];
                    strings[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void printArray(String[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        String[] strings = {"apple", "pie", "banana", "cat"};

        System.out.println("Original array:");
        printArray(strings);

        sortByLength(strings);

        System.out.println("Sorted array:");
        printArray(strings);
    }
}


    
