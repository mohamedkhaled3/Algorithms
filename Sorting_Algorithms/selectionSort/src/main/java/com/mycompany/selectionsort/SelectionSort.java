
package com.mycompany.selectionsort;

/**
 * https://www.geeksforgeeks.org/java-program-for-selection-sort/
 * Time Complexity: O(N^2) 
 * Auxiliary Space: O(1).
 */
public class SelectionSort {
    // 1:- هدور علي اصغر عنصر واطلعه فوق بعدين الف تاني لوجود العنصر الي بعده
void sort(int arr[])
    {
        int n = arr.length;
 
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
 
            // Swap the found minimum element with the first element          
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
 
    // Prints the array
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
 
    // Driver code to test above
    public static void main(String args[])
    {
        SelectionSort ob = new SelectionSort();
        int arr[] = {8,6,9,4};
        ob.sort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}
