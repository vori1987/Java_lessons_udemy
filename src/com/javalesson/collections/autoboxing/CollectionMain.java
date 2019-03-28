package com.javalesson.collections.autoboxing;

import java.util.Arrays;
import java.util.LinkedList;

public class CollectionMain {
    public static void main(String[] args) {
//        List<Integer> list = new LinkedList<>();
//        list.add(Integer.valueOf(1));



        String[] colors = {"Yellow", "Green", "Blue"};
        LinkedList<String> ll = new LinkedList<>(Arrays.asList(colors));
        ll.add("Black");

        colors = ll.toArray(new String[ll.size()]);

        for (int i = 0; i<colors.length; i++){
            System.out.println(colors[i]);
        }
    }
}
