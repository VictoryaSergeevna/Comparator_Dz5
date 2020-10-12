package com.company;

import java.util.Comparator;

public class SortedByName implements Comparator<Product> {
    public int compare(Product pr1, Product pr2)
    {
        String name1 = pr1.getName();
        String name2 = pr2.getName();

        return name1.compareTo(name2);
    }
}
