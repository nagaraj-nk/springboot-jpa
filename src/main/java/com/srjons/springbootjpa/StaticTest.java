package com.srjons.springbootjpa;

import java.util.ArrayList;
import java.util.List;

public class StaticTest {
    public static List<Double> list = new ArrayList<>();

    public void populateList() {
        for (int i = 0; i < 10000000; i++) {
            list.add(Math.random());
        }
        System.out.println("debug point 2");
    }

    public static void main(String[] args) {
        System.out.println("debug point 1");
        new StaticTest().populateList();
        System.out.println("debug point 3");
    }
}