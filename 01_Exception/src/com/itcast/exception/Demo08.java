package com.itcast.exception;

public class Demo08 {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i % 10 == 0) {
                        System.out.println("这是一个10秒"+i);
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("这是第"+i+"秒");
                }
            }
        };
        Thread thread = new Thread(r);
        thread.start();
    }
}
