package com.company;

public class Main {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
        Arr arr1 = new Arr(arr);

        arr1.printArr();
        arr1.push(5);
        arr1.printArr();
    }
}
