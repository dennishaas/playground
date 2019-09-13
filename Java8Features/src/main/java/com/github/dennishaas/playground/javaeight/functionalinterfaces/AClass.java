package com.github.dennishaas.playground.javaeight.functionalinterfaces;


public class AClass implements Interface1,Interface2 {


    @Override
    public void firstMethod(String str) {

    }


    @Override
    public void method() {

    }

    //My class will not compile without having its own implementation of log()
    //The compiler wouldn't be able to choose which implementation to use
    @Override
    public void log(String str) {
        System.out.println("MyClass logging" +str);
        Interface1.print("abc");
    }

    public static void main(String[] args){
        AClass aObject = new AClass();
        aObject.log("123");
    }
}
