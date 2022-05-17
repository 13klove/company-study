package com.company.ch07;

public interface Speakable {

    double PI = 3.14;
    double ZEROPOINT = -275.15;
    void sayHello();

    void up();
    void down();

    public default void common() {
        System.out.println("전기 연결");
    }

    public static void common(String brand) {
        System.out.println("brand: "+brand);
    }

}
