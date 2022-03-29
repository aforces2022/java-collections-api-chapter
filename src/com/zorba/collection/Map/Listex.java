package com.zorba.collection.Map;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Listex {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.addElement(10);
        vector.add(20);
        vector.add(2,30);
        vector.add(null);
        vector.add(20);
        System.out.println(vector);

    }
}
