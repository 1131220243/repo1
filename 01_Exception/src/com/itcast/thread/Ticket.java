package com.itcast.thread;

public class Ticket implements Runnable {

    private int tickets = 100;

    Object object = new Object();

    @Override
    public  void run() {

        while (true) {

            if (tickets > 0) {

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                String name = Thread.currentThread().getName();
                System.out.println("当前窗口是"+name +"还有票的张数"+tickets--);

            }

        }
    }

    public static void main(String[] args) {

        Ticket ticket = new Ticket();
        Thread thread1 = new Thread(ticket, "窗口1");
        Thread thread2 = new Thread(ticket, "窗口2");
        Thread thread3 = new Thread(ticket, "窗口3");
        thread1.start();
        thread2.start();
        thread3.start();


    }



}
