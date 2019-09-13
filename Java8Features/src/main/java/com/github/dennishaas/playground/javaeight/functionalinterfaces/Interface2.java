package com.github.dennishaas.playground.javaeight.functionalinterfaces;
@FunctionalInterface
public interface Interface2 {

    void method();

    default void log(String str){
        System.out.println("I2 logging: " + str);
    }
}
