package com.company.ch02;

public class DevConstruct {

    private String name;
    private int age;

    public DevConstruct(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void DevConstructMethod() {
        DevConstruct dev = new DevConstruct("", 12);
        //DevConstruct dev2 = new DevConstruct();
    }

}
