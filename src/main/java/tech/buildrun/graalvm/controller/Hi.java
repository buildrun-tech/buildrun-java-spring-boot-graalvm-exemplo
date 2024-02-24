package tech.buildrun.graalvm.controller;

public class Hi implements MyMessage {


    @Override
    public String say() {
        return "Hi!";
    }
}
