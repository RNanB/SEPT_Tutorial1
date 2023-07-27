package org.example;

public class Main {
    static int[] bubbleSort(int[] inputArray) {
        int n = inputArray.length;
        int[] sortedArray = inputArray.clone();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (sortedArray[j] > sortedArray[j + 1]) {
                    int temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = temp;
                }
            }
        }

        return sortedArray;
    }

    static void printArray(int[] array) {
        System.out.print('[');
        boolean first = true;

        for (int i = 0; i < array.length; i++) {
            if (!first) {
                System.out.print(", ");
            } else {
                first = false;
            }
            System.out.print(array[i]);
        }

        System.out.println(']');
    }


    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[][] arrays = {
            {70, 61, 72, 83, 38},
            {7, 2, 76, 4, 99},
            {28, 9, 13, 78, 19},
            {68, 84, 41, 62, 18},
            {37, 57, 40, 13, 50}
        };

        for (int i = 0; i < arrays.length; i++) {
            printArray(bubbleSort(arrays[i]));
        }
    }
}