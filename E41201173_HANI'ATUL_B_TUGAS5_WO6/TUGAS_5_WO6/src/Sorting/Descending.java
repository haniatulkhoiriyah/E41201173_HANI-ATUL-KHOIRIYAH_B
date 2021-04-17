/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

/**
 *
 * @author ACER
 */
public class Descending {
     static void desc(int[] list) {
        int i, j, temp = 0;
        int x = list.length;
        for (i = 0; i < x; i++) {
            for (j = 1; j < (x -i); j++) {
                if (list[j-1] < list[j]) {
                    temp = list[j-1];
                    list[j-1] = list[j];
                    list[j] = temp;
                }
            }
        }
        
    }
    public static void main(String[] args) {
        int list[] = {3,60,35,2,45,320,5};
        System.out.println("Array Sebelum Bubble Sort: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
        
        desc(list);
        System.out.println("Array sesudah Bubble Sort Descending: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
