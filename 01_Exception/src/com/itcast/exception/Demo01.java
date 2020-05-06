package com.itcast.exception;

import java.io.FileNotFoundException;
import java.util.Objects;

public class Demo01 {
    public static void main(String[] args) throws FileNotFoundException {
        read("b.txt");
    }


    public static void read(String fileName) throws FileNotFoundException {
        if (fileName.equals("a.txt")) {
            throw new FileNotFoundException("文件找不到");
        }



    }




}
