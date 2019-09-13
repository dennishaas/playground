package com.github.dennishaas.playground.javaeight.functionalinterfaces;
@FunctionalInterface
public interface Interface1 {

    void firstMethod(String str);

    default void log(String str){
        System.out.println("I1 logging: " + str);
    }

    static void print(String str){
        System.out.println("Printing " +str);
    }

    //if you try to overrid Object methods you get a compile error
    //Default method overrides a member of java.lang.Object
    /*
    default String toString(){
        return "1";
    }*/
}
