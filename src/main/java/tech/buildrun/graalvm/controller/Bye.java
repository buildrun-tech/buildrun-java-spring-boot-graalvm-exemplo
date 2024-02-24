package tech.buildrun.graalvm.controller;

public class Bye implements MyMessage{
    @Override
    public String say() {
        return "Bye!";
    }
}
