package com.max.idea;

public class Main {
    public static void main(String[] args) {
        int[] Arr = {1, 2, 3, 4, 5};

        int l = Arr.length - 1;
        int t=Arr[l];
        Arr[l]=Arr[0];
        Arr[0]=t;

        int m=(Arr.length % 2) + (Arr.length / 2) -1;
        int sm=Arr[0]+Arr[m];
        System.out.printf("%d", sm);
    }
}
