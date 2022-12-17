/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.bubble_sort;

/**
 * https://www.geeksforgeeks.org/bubble-sort/
 *  Time Complexity: O(N^2)
 *  Auxiliary Space: O(1)
 */
public class Bubble_Sort {
    void sort (int arr[]){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
    }
    }
    public static void main(String[] args) {
        Bubble_Sort obj = new Bubble_Sort();
        int arr [] = {6,8,4,2};
        System.out.println("Array before sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        System.out.println("Array After sort");
        obj.sort(arr);
        for (int i = 0; i < arr.length; i++) {         
             System.out.print(arr[i]+" ");
        }
    }
}
