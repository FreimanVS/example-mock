package com.vfreiman.lessons.testing.mock.injection;

public class A {
    private SomeInterface someInterface;

    public A(SomeInterface someInterface) {
        this.someInterface = someInterface;
    }

    public String method() {
        return "Method A " + (someInterface.methodInterface());
    }
}
