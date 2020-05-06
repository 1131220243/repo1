package com.itcast.exception;

public class Demo03 {

    public static void main(String[] args)throws RuntimeException {
        int[] arr = {2, 3, 3};
        int index = 3;
        getElement(arr, index);
        System.out.println("haha");
    }

    public static int getElement(int[] arr, int index) {
        int element = arr[index];
        return element;
    }


}
