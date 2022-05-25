package com.zorba.collection.Map;

import java.util.*;
import java.util.stream.Collectors;

public class ComparatorProductex {
    public static void main(String[] args) {

        Product p1 = new Product(10.0,5,"flashdrive");
        Product p2 = new Product(12.0,3,"pendrive");
        Product p3 = new Product(14.0,6,"Ram");
        Product p4 = new Product(16.0,8,"Harddisk");
        Product p5 = new Product(9.0,4,"flopy disk");
        Product p6 = new Product(10.0,4,"flopy disk1");


        //desc order wrt rating
        TreeSet descRatingTreeSet = new TreeSet(new RatingDescComparator());
        descRatingTreeSet.add(p1);
        descRatingTreeSet.add(p2);
        descRatingTreeSet.add(p3);
        descRatingTreeSet.add(p4);
        descRatingTreeSet.add(p5);

        //System.out.println(descRatingTreeSet);//p4,p3,p1,p5,p2

        //desc order wrt name
        TreeSet descNameTreeSet = new TreeSet(new NameDescComparator());
        descNameTreeSet.add(p1);
        descNameTreeSet.add(p2);
        descNameTreeSet.add(p3);
        descNameTreeSet.add(p4);
        descNameTreeSet.add(p5);


        //desc order wrt amout with duplicate
        TreeSet descAmountTreeSet = new TreeSet(new ProductAmountDescComparator());
        descAmountTreeSet.add(p1);
        descAmountTreeSet.add(p2);
        descAmountTreeSet.add(p3);
        descAmountTreeSet.add(p4);
        descAmountTreeSet.add(p5);
        descAmountTreeSet.add(p6);

        //System.out.println(descAmountTreeSet);

        //customised order wrt rating
        TreeSet custAmountTreeSet = new TreeSet(new RatingCustomized());
        custAmountTreeSet.add(p1);
        custAmountTreeSet.add(p2);
        custAmountTreeSet.add(p3);
        custAmountTreeSet.add(p4);
        custAmountTreeSet.add(p5);
        custAmountTreeSet.add(p6);

        System.out.println(custAmountTreeSet);
        System.out.println(custAmountTreeSet.comparator());

        List<Product> productList = new ArrayList<>();//100

        TreeSet<Product> treeSet = new TreeSet<>(new ProductAmountDescComparator());
        treeSet.addAll(productList);


       /* TreeSet set = new TreeSet();
        set.add(new StringBuilder("A"));
        set.add(new StringBuilder("B"));
        set.add(new StringBuilder("D"));
        set.add(new StringBuilder("F"));
        set.add(new StringBuilder("I"));*/









    }
}
