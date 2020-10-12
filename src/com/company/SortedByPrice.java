package com.company;
import java.util.Comparator;
public class SortedByPrice implements Comparator<Product> {
    public int compare(Product pr1, Product pr2)
    {
        float price1 = pr1.getPrice();
        float price2 = pr2.getPrice();

        if (price1 > price2) {
            return 1;
        } else if (price1 < price2) {
            return -1;
        } else {
            return 0;
        }
    }
}
