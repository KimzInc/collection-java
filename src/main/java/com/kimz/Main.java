package com.kimz;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //List<String> list = new ArrayList<>();
        Collection<String> list = new ArrayList<>();
        String[] names = {"Peter", "Jane", "Ken", "Rogers", "Duncan", "Kelvin"};

      list.addAll(Arrays.asList(names));

        System.out.println(list);

        list.add("Gary");
        list.addAll(Arrays.asList("George", "Fred", "Grace"));

        System.out.println(list);
        System.out.println("Gary is in the list? "+ list.contains("Gary"));

        list.removeIf(s -> s.charAt(0) =='G');
        System.out.println(list);

        System.out.println("Gary is in the list? "+ list.contains("Gary"));
    }
}