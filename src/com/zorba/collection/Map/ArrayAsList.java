package com.zorba.collection.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayAsList {
    public static void main(String[] args) {
        String[] s= {"A","Z","B"};
        List l = Arrays.asList(s);
        System.out.println(l);
        l.set(1,"z");
        System.out.println(l);

    }
}
