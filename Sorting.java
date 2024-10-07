/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sorting;

/**
 *
 * @author JUNAID COMPUTER
 */
public class Sorting {
   
public void BubleSort(int [] arr){
    
    for(int i=0;i<arr.length-1;i++){
    for(int j=0;j<arr.length-i-1;j++){
    if(arr[j]>arr[j+1]){
    int temp = arr[j];
    arr[j]=arr[j+1];
    arr[j+1]=temp;
    }
    }
    }
    
    for(int i= 0;i<arr.length;i++){
        System.out.print(arr[i] + ",");
    }
    

}
   
    

 public static void main(String[] args) {
     Sorting s1=new Sorting();
     int array[]={5,3,1,6,2,4};
     s1.BubleSort(array);
        
 }   }