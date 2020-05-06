package com.itcast.thread;

public class Demo02 {
    public static void main(String[] args) {

        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("xxx" + i);
                }
            }
        };
        new Thread(r).start();

        for (int i = 0; i < 20; i++) {
            System.out.println("yyy"+i);
        }



    }
}
