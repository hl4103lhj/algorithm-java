package com.hlql.study.algorithm.selectionSort;

/**
 * @author Tom.He
 * @project algorithm-java
 * @package com.hlql.study.algorithm.selectSort
 * @date 2020-05-29 18:28
 * @Description
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {1, 12, 3, 12, 3, 12, 4, 124, 0, 1, 23, 4, 1, 1, 2341, 1, 8};

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
        int minIndex;
        for (int i = 0; i < arr.length; i++) {
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                arr[i] = arr[i] ^ arr[minIndex];
                arr[minIndex] = arr[minIndex] ^ arr[i];
                arr[i] = arr[i] ^ arr[minIndex];
            }
            //tmp = arr[i];
            //arr[i] = arr[minIndex];
            //arr[minIndex] = tmp;
        }
    }

    public static void descSort(int[] arr) {
        int minIndex, tmp;
        for (int i = 0; i < arr.length; i++) {
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] < arr[j]) {
                    minIndex = j;
                }
            }

            tmp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tmp;
        }
    }
}
