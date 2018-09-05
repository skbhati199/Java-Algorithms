package com.metro.javaalgoritm;

public class MyBubbleSort {

    public static void main(String args[]) {
        System.out.println("args =");
        MyBubbleSort myBubbleSort = new MyBubbleSort();
        int [] array = {1,4,-5,2, 15, 43,56,67,30};
        myBubbleSort.bubbleSort(array);
        myBubbleSort.print(array);
    }

    private void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i=0; i<n-1;i++){
            for(int j= 0;j<n- i-1;j++){
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    private void print(int[] arr){
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}
