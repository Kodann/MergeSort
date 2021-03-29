package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> mass = new ArrayList<>();
        mass.add(5);
        mass.add(2);
        mass.add(4);
        mass.add(6);
        mass.add(1);
        mass.add(3);
        mass.add(2);
        mass.add(6);
        Sort s = new Sort(mass);
        System.out.println(s.toString());
        s.Sort(0, mass.size() - 1);
        System.out.println(s.toString());

    }
}
