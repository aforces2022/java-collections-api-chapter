package com.zorba.collection.Map;

import java.util.Arrays;

public class ArraysEx {
    public static void main(String[] args) {
        int[] a ={10,30,4,8,50};
        for (int i:a) {
            System.out.print(i+"   ");
        }
        Arrays.sort(a);
        System.out.println();
        for (int i:a) {
            System.out.print(i+"   ");
        }
        System.out.println();


        System.out.println(Arrays.binarySearch(a,10));


        System.out.println();
        String[] sa = {"B","G","A","X","Z","S"};
        for (String i:sa) {
            System.out.print(i+"   ");
        }
        System.out.println();
        Arrays.sort(sa, new DescStringComp());
        for (String i:sa) {
            System.out.print(i+"   ");
        }

    }
}
