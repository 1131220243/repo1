package com.itcast.thread;

public class MyThread extends Thread {

    public MyThread(String msg) {
        super(msg);
    }

    @Override
    public void run() {
        for (int i = 1; i <20; i++){
            System.out.println(i);
        }

    }
}
