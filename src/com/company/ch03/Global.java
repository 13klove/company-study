package com.company.ch03;

import com.company.ch07.Speakable;

public class Global {

    public static String ip = "127.0.0.1";
    public static int port = 7070;
    public String change;

    public Global(int age) {
        System.out.println("age"+age);
    }

    public Global() {

    }

    static {
        port = 8080;
        //change = "abc";
    }

    {
        System.out.println("zzzzzzzzzzz");
    }

}
