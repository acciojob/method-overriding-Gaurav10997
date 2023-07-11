package com.driver;

public class Main {
class A {
    public String meth() {
        return "Invoking method from class A";
    }
}

class B extends A {
    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}

public class Main {
    public static void main(String[] args) {
        A objA = new A();
        System.out.println(objA.meth()); // Task 3: Invoking method from class A

        B objB = new B();
        System.out.println(objB.meth()); // Task 5: Method is overridden in Extended class B
    }
}
}