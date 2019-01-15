package com.company;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;


public class Array {
    List strList = new ArrayList();
    public void createArray() {
        Random rand = new Random () ;
        for (int i=0; i <10; i++) {
            strList.add(rand.nextInt(10));
        }
    }
}
