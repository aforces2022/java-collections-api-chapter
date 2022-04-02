package com.zorba.collection.Map;

import java.util.Comparator;

public class RatingCustomized implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        Integer i1 = o1.getRating();
        Integer i2 = o2.getRating();
        //return -i1.compareTo(i2);  //desc
        //return i1.compareTo(i2);   //asc
        //return -1;                 // reverse  of insertion order
        //return 1;                  // insertion order
        return 0;                   // only 1st element

        // 4 5 7 9 3
    }

   /* @Override
    public String toString() {
        return "RatingCustomized{}";
    }*/
}
