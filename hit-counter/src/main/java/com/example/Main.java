package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int totalPages = 2;
        Helper06 helper = new Helper06();
        Solution pageCounterService = new Solution();
        pageCounterService.init(totalPages, helper);
        pageCounterService.incrementVisitCount(0);
        pageCounterService.incrementVisitCount(1);
        pageCounterService.incrementVisitCount(1);
        pageCounterService.incrementVisitCount(1);
        pageCounterService.incrementVisitCount(0);
        System.out.println(pageCounterService.getVisitCount(0));
        System.out.println(pageCounterService.getVisitCount(1));
    }
}