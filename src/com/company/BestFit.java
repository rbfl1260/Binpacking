package com.company;

import java.util.ArrayList;

public class BestFit implements Fit{
    public void fit(ArrayList<Bin> arr, Item item) {
        for(int i=0;i<arr.size();i++) {
            Bin bin = arr.get(i);


            if (bin.checkBF(item)) {
                bin.min = bin.remainCapacity - item.weight;
            }
            if (bin.min == bin.capacity + 1) {
                bin.remainCapacity = bin.capacity - item.weight;

            }
            else {
                bin.remainCapacity-=item.weight;
            }
        }

        Bin b = new Bin();
        b.update(item);
        arr.add(b);

    }
}
