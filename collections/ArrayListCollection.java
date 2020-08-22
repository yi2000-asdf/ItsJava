package ru.itsjava.collections;

import java.io.IOException;
import java.util.*;

public class ArrayListCollection {
    public static void main(String[] args) throws IOException {

        ArrayList<Object> list = new ArrayList<>();
        list.add("a");
        list.add("d");
        list.add("m");

        list.add("A");
        list.add("b");
        list.add("c");

        list.add("5");

        list.sort(Collections.reverseOrder());


        System.out.println(list.contains("m"));

        for (Object o:list){
            System.out.println(o);

        }

        System.out.println(list.size());
        //list.add(0, "the zero line");
        //list.clear();
        for (int i = 0; i < list.size(); i++) {
            //System.out.println(list.get(i));
            int ii = 0;

//            try {
//                Object val1 = list.get(i);
//                ii = Integer.getInteger((String) val1);
//            } catch (NullPointerException e) {
//                ii = 2;
//
//            } finally {
//
//            }
//
//            System.out.println(ii);

            System.out.println(list.get(i));
        }

    }

}
