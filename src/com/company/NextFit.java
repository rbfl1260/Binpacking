package com.company;

import java.util.ArrayList;

public class NextFit implements Fit{
    public void fit(ArrayList<Bin> arr, Item item) {
        for(int i=0;i<arr.size();i++) {
            Bin bin = arr.get(i);
            if(bin.checkNF(item)) {
                bin.updateNF(item);
                return;
            }
            else
            {
                bin.updateNFELSE(item);
            }
        }
       Bin c = new Bin();
       c.updateNF(item);
       arr.add(c);
    }
}