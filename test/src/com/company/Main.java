package com.company;

public class Main {

    public static void main(String[] args) {
        double[] array = {1, 2.5, 6, 3.6, 4, 3};
        System.out.println("Max là: "+findMax(array) +", vị trí: "+findIndex(array, findMax(array)));
    }

    public static double findMax(double[] arr) {
        double max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int findIndex(double[] arr, double element) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                index = i;
            }
        }
        return index;
    }

    public static int findMaxIndex(double[] arr) {
        double max = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        return index;
    }

    public static String findMaxAndIndex(double[] arr) {
        double max = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        return "Giá trị lớn nhất là '" + max + "', nằm ở vị trí thứ " + index;
    }
}
