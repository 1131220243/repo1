package com.itcast.exception;

public class Demo07 {
    public static void main(String[] args) {
        Demo06 r = new Demo06();
        Thread thread = new Thread(r);
        thread.start();
    }
}
