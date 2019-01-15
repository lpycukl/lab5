package com.company;
import java.util.HashMap;
import java.util.Random;


public class Name {
    HashMap<Integer,String> a = new HashMap<Integer,String>();
    Random rand = new Random ();
    public void mapping () {
        for (int i = 0; i<15; i++) {
            a.put(i,random_name());
        }

    }

    public String random_name() {
        String name = "abcdefghijkmnopqrstuvwxyz";
        String names = "";
        for (int i = 0; i < rand.nextInt(10); i ++) {
            names += name.charAt(rand.nextInt(10));
        }
        return names;

    }
    public void outall() {
        System.out.println(a.values());
    }

    public void out (int number) {
        System.out.println(a.get(number));
    }
}
