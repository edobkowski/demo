package com.example.demo;

import lombok.extern.apachecommons.CommonsLog;

import java.util.List;

@CommonsLog
public final class MyClass {
    private static  String s;


    public int add(int a, int b) {
        return a+b;
    }

    public int foo1() {
        return 1;
    }

    public int foo2() {
        return 2;
    }

    public int foo3() {
        return 3;
    }

    public int foo4() {
        return 4;
    }

    private int foo5() {
        String s = "dupa8";
        if (s == "dupa8")
            return 1;
        return 0;
    }
    private int foo6() {
        String s = "dupa8";
        if (s == "dupa8")
            return 1;
        return 0;
    }
    private int foo7() {
        String s = "dupa8";
        if (s == "dupa8")
            return 1;
        return 0;
    }
    public int foo8() {
        String s = "dupa8";
        if (s.equals("dupa8"))
            return 1;
        return 0;
    }

    private void doNothing() {

    }

    static public String st = null;

    private void method(int i) {
        i = 1;
        switch(i) {
            case 1:
                System.out.println("dupa8");
        }
        while(true);
    }

    public void doSomething(String [] strings) {
        for (int i = 0; i < strings.length; i--) { // Noncompliant;
            String string = strings[i];  // ArrayIndexOutOfBoundsException when i reaches -1
            //...
        }
    }

    public void doSth(boolean b) {
        if (b) {  // Noncompliant
            doOneMoreThing();
        } else {
            doOneMoreThing();
        }
    }

    public String [] getStringArray(List<String> strings) {
        return (String []) strings.toArray();  // Noncompliant; ClassCastException thrown
    }

    private void doOneMoreThing() {
    }
}
