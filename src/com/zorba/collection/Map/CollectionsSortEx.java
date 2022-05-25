package com.zorba.collection.Map;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSortEx {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add("J");
        l.add("A");
        l.add("Z");
        l.add("B");
        l.add("I");
        l.add("K");

        System.out.println(l);
        Collections.sort(l);
        System.out.println(l);
        Collections.sort(l,new DescStringComp());
        System.out.println(l);
    }
}
