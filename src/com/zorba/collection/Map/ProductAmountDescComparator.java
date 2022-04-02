package com.zorba.collection.Map;

import java.util.Comparator;

public class ProductAmountDescComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        double d1 = o1.getAmount();
        double d2 = o2.getAmount();
        if(d1<d2){
            return +3;
        }else{
            return -6;
        }

        //4 4
    }
}
