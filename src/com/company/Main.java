package com.company;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int[] items = {7, 5, 6, 4, 2, 3, 7, 5};//물건
        ArrayList<Bin> arr = new ArrayList<>();

        Fit ff = new NextFit();
        for (int i=0; i<items.length; i++) {
            ff.fit(arr, new Item(items[i]));
        }

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}
