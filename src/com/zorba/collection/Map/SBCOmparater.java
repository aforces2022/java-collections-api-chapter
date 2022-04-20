package com.zorba.collection.Map;

import java.util.Comparator;

public class SBCOmparater implements Comparator<StringBuilder> {
    @Override
    public int compare(StringBuilder o1, StringBuilder o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();
        return -s1.compareTo(s2);
    }
}
