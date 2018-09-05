package com.metro.javaalgoritm;

public class SelectionSort {

    public static void main(String args[]) {
        int arr[] = {64, 25, 12, 22, 11};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.selectionSort(arr);
        selectionSort.printArray(arr);

    }

    public void selectionSort(int arr[]){
        int n = arr.length; // 64, 25, 12, 22, 11
        for (int i =0;i<n-1;i++){ // i =0
            int min_index= i; // min_index = i = 0
            for(int j = i + 1;j< n;j ++) { // j = 1, 2, 3, 4
                if (arr[j] < arr[min_index]) { //
                    System.out.println("arr["+ j +"]" + " value :" + arr[j] + " < arr["+ min_index +"] : " + arr[min_index]+"\n");
                    min_index = j;
                }
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
    }

    // Prints the array
    public void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}
