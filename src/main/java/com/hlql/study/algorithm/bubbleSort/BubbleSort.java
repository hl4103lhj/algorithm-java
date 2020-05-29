package com.hlql.study.algorithm.bubbleSort;

/**
 * @author Tom.He
 * @project algorithm-java
 * @package com.hlql.study.algorithm.bubbleSort
 * @date 2020-05-29 17:55
 * @Description
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 0, 1, 234, 12, 3, 1, 23, 4, 132, 513, 2};

        ascSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }

        System.out.println("\r\n------------ desc");

        descSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }

    public static void ascSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    arr[i] = arr[i] ^ arr[j];
                    arr[j] = arr[j] ^ arr[i];
                    arr[i] = arr[i] ^ arr[j];
                    //int tmp = arr[i];
                    //arr[i] = arr[j];
                    //arr[j] = tmp;
                }
            }
        }
    }

    public static void descSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    arr[i] = arr[i] ^ arr[j];
                    arr[j] = arr[j] ^ arr[i];
                    arr[i] = arr[i] ^ arr[j];
                }
            }
        }
    }
}
