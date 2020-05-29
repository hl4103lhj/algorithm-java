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

    }

    public static void descSort(int[] arr) {
        
    }

}
