

package com.mycompany.insertionsort;


 // https://www.geeksforgeeks.org/insertion-sort/
 // Time Complexity: O(N^2) 

public class InsertionSort {
    /*Function to sort array using insertion sort*/
    void sort(int arr[])
    {
        int n = arr.length;             // n = 5 
        for (int i = 1; i < n; ++i) {  // i = 1,2,3,4
            int key = arr[i];         // key = 11, 13, 5, 6 
            int j = i - 1;           // j = 0,1,2,3
 
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            //{ 12, 11, 13, 5, 6 }
            for ( ; j >= 0 && arr[j] > key ; j = j - 1) {  //  key = 11, 13, 5, 6   ; j* = 0,1,2 
                                                           //  arr[0] > 11 - 12 > 11 true * make shifting
                                                           //  arr[1] > 13 - 11 > 13 false
                                                           //  arr[2] > 5  - 13 > 5  true * make shifting
          // true make shifting  j+1 = 1,2,3 , j* = 0,1,2                                           
                arr[j + 1] = arr[j];                      // arr[1] = arr[0]  - 11 = 12           
                                                         //  {11,12,...}
            }
            // false 
            arr[j + 1] = key;       // j + 1 = 1,2,3,4 - key =  11, 13, 5, 6 
                                    // arr[1]= 11  - 11 = 11 && 13 = 13 && 6 = 6

        }
    }
 
    /* A utility function to print array of size n*/
    static void printArray(int arr[])
    {
        int n = arr.length; // 5 
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " "); // arr[i] = { 12, 11, 13, 5, 6 }
 
        System.out.println();
    }
 
    // Driver method
    public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6 };
 
        InsertionSort ob = new InsertionSort();
        ob.sort(arr);
 
        printArray(arr);
    }
}; 
/* 
Output
5 6 11 12 13 
Time Complexity: O(N^2) 
Auxiliary Space: O(1)
 */
