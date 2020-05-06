package com.itcast.exception;

public class Demo02 {
    public static final String[] names = {"zhangsan" ,"lisi" ,"wangwu"};

    public static void main(String[] args) {

        try {
            checkName("zhangsan");

        } catch (RegistException e) {
            e.printStackTrace();
        }


    }

    public static void checkName(String name) {

        for (String s : names) {
            try {
                if (name.equals(s)) {
                    System.out.println("登录成功");
                }
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }

    }
}
