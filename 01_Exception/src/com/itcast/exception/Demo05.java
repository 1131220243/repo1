package com.itcast.exception;

import java.util.Objects;

public class Demo05 {

    public static void main(String[] args) {

        method(null);


        System.out.println();
        System.out.println();

    }

    public static  Object  method(Object s) {
        Objects.requireNonNull(s, "字符串不能为空");

        return s;
    }



}
