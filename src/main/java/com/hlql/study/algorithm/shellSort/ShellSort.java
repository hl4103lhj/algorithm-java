package com.hlql.study.algorithm.shellSort;

/**
 * @author Tom.He
 * @project algorithm-java
 * @package com.hlql.study.algorithm.shellSort
 * @date 2020-05-29 19:06
 * @Description
 */
public class ShellSort {

    public static void main(String[] args) {
        //int[] arr = {1, 12, 3, 12, 3, 12, 4, 124, 0, 1, 23, 4, 1, 1, 2341, 1, 8};
        //
        //ascSort(arr);
        //for (int i = 0; i < arr.length; i++) {
        //    System.out.print(arr[i] + ",");
        //}
        //
        //System.out.println("\r\n------------ desc");
        //
        //descSort(arr);
        //for (int i = 0; i < arr.length; i++) {
        //    System.out.print(arr[i] + ",");
        //}

        Integer[] arr1 = {1, 12, 3, 12, 3, 12, 4, 124, 0, 1, 23, 4, 1, 1, 2341, 1, 8};
        sort(arr1);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + ",");
        }
    }

    public static <T extends Comparable<? super T>> void sort(T[] arr) {
        int j;
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                T tmp = arr[i];
                for (j = i; j >= gap && tmp.compareTo(arr[j - gap]) > 0; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = tmp;
            }
        }
    }

    public static void ascSort(int[] arr) {
        int j;
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                int tmp = arr[i];
                for (j = i; j >= gap && tmp > arr[j - gap]; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = tmp;
            }
        }
    }

    public static void descSort(int[] arr) {
        int j;
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                int tmp = arr[i];
                for (j = i; j >= gap && tmp < arr[j - gap]; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = tmp;
            }
        }
    }

}
