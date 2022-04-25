package com.company;

import java.util.Arrays;

public class Arr {

    private int[] arr;
    private int length;

    public Arr(int[] arr) {
        this.arr = arr;
        this.length = arr.length;
    }

    public void push(int value){

        int[] arr1 = new int[length + 1];
        for (int i = 0;i < this.length ;i++){
            arr1[i] = arr[i];

        }
        arr1[length] = value;
        this.arr = arr1;
        this.length++;
    }

    public void printArr(){

        System.out.println(Arrays.toString(this.arr));
    }
}
