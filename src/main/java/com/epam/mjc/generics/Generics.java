package com.epam.mjc.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {

    //TODO: Refactor Method-1
    public List boxingMethod(String name) {
        List <String>  firstList = new ArrayList <>();
        firstList.add(name);
        List <String>  secondList = new  ArrayList <>();
        secondList.add(String.valueOf(firstList));
        return secondList;
    }

    //TODO: Refactor Method-2
    public <T> Object genericMethod(Object data) {

        return data;
    }

    //TODO: Refactor Method-3
    public  void cloneMethod(List consumer, List producer) {
        List<List> firstList = new ArrayList<>();
        firstList.add(consumer);
        consumer.addAll(producer);
    }

}
