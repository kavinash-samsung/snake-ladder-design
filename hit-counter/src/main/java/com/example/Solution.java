package com.example;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

// use helper.print("") or helper.println("") for printing logs else logs will not be visible.
public class Solution implements Q06WebpageVisitCounterInterface {
    private Helper06 helper;
    private ArrayList<AtomicInteger> pageCounter;
    public Solution(){

    }

    public void init(int totalPages, Helper06 helper){
        this.helper=helper;
        this.pageCounter = new ArrayList<>();
        for(int i=0;i<totalPages;i++){
            this.pageCounter.add(new AtomicInteger(0));
        }
        helper.println("restaurant rating module initialized");
    }

    // increment visit count for pageIndex by 1
    public void incrementVisitCount(int pageIndex) {
        this.pageCounter.get(pageIndex).incrementAndGet();
    }

    // return total visit count for a given page
    public int getVisitCount(int pageIndex) {
        return this.pageCounter.get(pageIndex).get();
    }
}




