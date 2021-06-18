package com.codegym;

public class Main {

    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.add(1);
        list.add(5);
        list.add(1,8);
        list.add(0,9);
        list.add(7);
        list.add(7);
        list.add(7);
        list.add(7);
        list.add(7);
        list.add(7);
        list.add(9);
        System.out.println(list);
    }
}
