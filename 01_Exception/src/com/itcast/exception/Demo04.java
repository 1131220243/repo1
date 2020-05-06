package com.itcast.exception;

public class Demo04 {

    private static String[] names = {"zhangsan", "lisi", "wangwu"};

    public static void main(String[] args) {

        regist("haha");

    }

    public static void regist(String name) {

        for (String n : names) {
            if (name.equals(n)) {
                throw new RegistException("这个名字已经存在了");
            }
        }
        System.out.println("注册成功");


    }




}
