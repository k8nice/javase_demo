package com.nice.demo;

import java.util.Arrays;

public class SortDemo {
    public static void main(String[] args) {
        int[] arr = {7,5,9,3,2,6,1};
        arr =	insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] insertSort(int arr[]) {
        for(int i = 0; i<arr.length-1; i++)
        {
            int index = i;
            for(int num =arr.length-1; num >i; num-- ) {
                if(arr[i]<arr[num])
                {
                    index = num;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        return arr;
    }
}
