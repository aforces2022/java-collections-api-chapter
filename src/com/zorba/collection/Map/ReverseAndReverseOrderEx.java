package com.zorba.collection.Map;

import sun.security.krb5.internal.crypto.Des;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ReverseAndReverseOrderEx {
    public static void main(String[] args) {
        //reverse
        //reverseOrder
        ArrayList l = new ArrayList();
        l.add(15);
        l.add(10);
        l.add(20);
        l.add(5);
        //Collections.sort(l);
        System.out.println("before reverse :"+l);
        Collections.reverse(l);
        System.out.println("after reverse :"+l);
        Comparator c = Collections.reverseOrder(new DescStringComp());
        ArrayList slist = new ArrayList();
        slist.add("B");
        slist.add("A");
        slist.add("X");
        slist.add("F");
        slist.add("I");
        System.out.println(slist);
        System.out.println("---------");
        //Collections.sort(slist,c);
        Collections.sort(slist,new DescStringComp());

        System.out.println(slist);
    }
}
