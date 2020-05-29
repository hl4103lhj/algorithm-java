package com.hlql.study.algorithm.insertionSort;

/**
 * @author Tom.He
 * @project algorithm-java
 * @package com.hlql.study.algorithm.insertionSort
 * @date 2020-05-29 18:51
 * @Description
 */
public class InsertionSort {

    public static void main(String[] args) {
        //int[] arr = {1231234123, 1, 12, 3, 12, 3, 12, 4, 124, 0, 1, 23, 4, 1, 1, 2341, 1, 8};
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

        Integer[] arr1 = {1231234123, 1, 12, 3, 12, 3, 12, 4, 124, 0, 1, 23, 4, 1, 1, 2341, 1, 8};
        sort(arr1);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + ",");
        }
    }

    public static <T extends Comparable<? super T>> void sort(T[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int prevIndex = i - 1;
            T current = arr[i];
            while (prevIndex >= 0 && arr[prevIndex].compareTo(current) > 0) {
                arr[prevIndex + 1] = arr[prevIndex];
                prevIndex--;
            }
            arr[prevIndex + 1] = current;
        }
    }

    public static void ascSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int prevIndex = i - 1;
            int current = arr[i];
            while (prevIndex >= 0 && arr[prevIndex] > current) {
                arr[prevIndex + 1] = arr[prevIndex];
                prevIndex--;
            }
            arr[prevIndex + 1] = current;
        }
    }

    public static void descSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int prevIndex = i - 1;
            int current = arr[i];
            while (prevIndex >= 0 && arr[prevIndex] < current) {
                arr[prevIndex + 1] = arr[prevIndex];
                prevIndex--;
            }
            arr[prevIndex + 1] = current;
        }
    }
}
