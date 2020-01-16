package com.example.demo;

import lombok.extern.apachecommons.CommonsLog;

@CommonsLog
public final class MyClass {

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
    private void anotherFuckedUpMethod() {
        System.out.println("dupa8");
    }

    private void anotherFuckedUpMethod2() {
        int j = 0;
        for (int i = 0; i<10; j++) {

        }
    }

    public void unusedMethod() {
        int i = 5;
        i += 1;
        log.info(i);
    }


    public void vulnerableMethod() throws ClassNotFoundException {
        String className = System.getProperty("messageClassName");
        Class clazz = Class.forName(className);  // Noncompliant
    }

    private void anotherFuckedUpMethod3() {
        int j = 0;
        for (int i = 0; i<10; j++) {

        }
    }

    private int calculateSth(int i) {
        if (i == 2) {
            return 2;
        } else {
            if (i == 3) {
                return 3;
            } else {
                if (i == 4) {
                    return 4;
                } else if (i == 5 && i == 1) {
                } else if (i < 6) {
                    System.out.println("OMG");
                } else if (i > 6) {
                    System.out.println("More if statements!");
                } else if (i == 100) {
                    System.out.println("It doesn't make any sense");
                }
            }
        }

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

    private void doOneMoreThing() {
    }
}
