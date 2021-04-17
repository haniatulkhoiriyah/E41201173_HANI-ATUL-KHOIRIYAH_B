/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;
import java.util.*;
/**
 *
 * @author ACER
 */
public class SelectionSort {
    public static void selsort(int[] arr) {
        int a = arr.length; 
        for (int i = 0; i < a; i++) {
            int min = i; 
            System.out.println("Iterasi "+(i+1));
            for (int j = i+1; j < a; j++) {
                System.out.println("Bandingkan "+ arr[min] +" dengan " +arr[j]);
                if (arr[j] < arr[min]) {
                    System.out.println(arr[min] + " lebih besar dari " + arr[j]);
                    min = j;
                } 
            }
           
        int temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,60,35,2,45,320,5}; 
        System.out.println("Elemen sebelum selection sort: " +
                Arrays.toString(arr));
        selsort(arr);
        System.out.println("Element setelah selection sort: " +
                Arrays.toString(arr));
    }
}
