package com.company;

public class Bin {
    public int capacity = 10;   // 총 용량
    public int currentCapacity = 0;        // 현재 용량
    public int remainCapacity = 10; // 남은 용량


    //FirstFit
    public boolean check(Item item) {
        return remainCapacity >= item.weight;
    }

    public void update(Item item) {
        currentCapacity += item.weight;
        remainCapacity = capacity - currentCapacity;
    }
    //NextFit
    public boolean checkNF(Item item){
        return remainCapacity>=item.weight;
    }

    public int updateNF(Item item){
        currentCapacity =currentCapacity+item.weight;
        return remainCapacity = capacity - currentCapacity;
    }

    public int updateNFELSE(Item item)
    {
     return remainCapacity=remainCapacity-item.weight;
    }

    public String toString() {
        return "Bin{currentCapacity=" + currentCapacity +
                ", remainCapacity=" + remainCapacity +
                '}';
    }
}
