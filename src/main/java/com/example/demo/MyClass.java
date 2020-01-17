package com.example.demo;

import lombok.extern.apachecommons.CommonsLog;

import java.util.List;

@CommonsLog
public final class MyClass {
    static public String s;

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
    private int foo8() {
        String s = "dupa8";
        if (s == "dupa8")
            return 1;
        return 0;
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
