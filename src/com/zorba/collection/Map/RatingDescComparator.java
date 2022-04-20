package com.zorba.collection.Map;

import java.util.Comparator;

public class RatingDescComparator  implements Comparator<Product>{

    @Override
    public int compare(Product o1, Product o2) {

        int r1 = o1.getRating();
        int r2 = o2.getRating();
        //Integer.valueOf(r1).compareTo(Integer.valueOf(r2));
        if(r1<r2){
            return +2;
        }/*else if(r1>r2){
            return -5;
        }else{
            return 0;
        }*/
        else{
            return -5;
        }

    }
}
