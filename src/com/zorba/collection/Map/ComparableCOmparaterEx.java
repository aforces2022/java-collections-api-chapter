package com.zorba.collection.Map;

import java.util.TreeSet;

public class ComparableCOmparaterEx {
    public static void main(String[] args) {
        TreeSet set = new TreeSet(new SBCOmparater());
        set.add(new StringBuilder("hello"));
        set.add(new StringBuilder("hi"));
        System.out.println(set);
    }
}
