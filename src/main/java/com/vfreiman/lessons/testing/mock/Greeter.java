package com.vfreiman.lessons.testing.mock;

public class Greeter {

    private SomeObject obj;

    public Greeter() {}

    public Greeter (SomeObject obj) {
        this.obj = obj;
    }

    public final String greet(final String name) {
        if (name == null) {
            return "Hello, Anonymous!";
        }
        return "Hello, " + name + "!";
    }

    public String getString() {
        if (obj.isFlag()) {
            return "TRUE FLAG";
        } else {
            return "FALSE FLAG";
        }
    }
}