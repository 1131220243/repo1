package com.itcast.thread;

public class Demo01 {
    public static void main(String[] args) {
        MyThread my = new MyThread("haha");
        my.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("ssss");
        }

    }
}
