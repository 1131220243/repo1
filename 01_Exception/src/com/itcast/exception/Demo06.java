package com.itcast.exception;

public class Demo06 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {

            if (i % 10 == 0) {
                System.out.println("这是一个十秒");
            }
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
