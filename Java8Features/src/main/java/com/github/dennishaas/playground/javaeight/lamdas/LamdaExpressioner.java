package com.github.dennishaas.playground.javaeight.lamdas;

public class LamdaExpressioner {

    public static void main(String[] args){
        LamdaExpressioner e = new LamdaExpressioner();
        e.doIt();
    }


    public void doIt(){
        AFunctionalInterface u = (s) ->{
            System.out.println(s);
        };

        u.print("Hello");
    }
}
