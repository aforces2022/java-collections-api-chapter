package com.zorba.collection.Map;

import java.util.Comparator;

public class NameDescComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {

        String n1= p1.getName();
        String n2= p2.getName();

        return - n1.compareTo(n2);

       //- "A".compareTo("Z");
    }
}
