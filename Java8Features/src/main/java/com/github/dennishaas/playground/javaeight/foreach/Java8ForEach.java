package com.github.dennishaas.playground.javaeight.foreach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Java8ForEach {

    public static void main(String[] args ){

        //create sample List
        List<Integer> listOfIntegers = new ArrayList<>();
        for (int i = 0; i < 10 ; i++){
            listOfIntegers.add(i);
        }

        //traverse classical using iterator
        Iterator<Integer> iterator = listOfIntegers.iterator();
        while (iterator.hasNext()){
            Integer i = iterator.next();
            System.out.println(("Iterator Value:" + i));
        }

        //traversing through forEach method with anonymous clas
        listOfIntegers.forEach(new Consumer<Integer>(){

            @Override
            public void accept(Integer integer) {
                System.out.println("forEachAnonymous class Value:" + integer);
            }
        });
        MyConsumer action = new MyConsumer();
        listOfIntegers.forEach(action);



    }
}

class MyConsumer implements Consumer<Integer>{

    @Override
    public void accept(Integer integer) {
        System.out.println("Consumer impl Value: " + integer);
    }
}