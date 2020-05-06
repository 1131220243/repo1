package com.itcast.statics;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Demo04 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(97);
        PrintStream ps = new PrintStream("01_Exception\\ps.txt");
        System.setOut(ps);
        System.out.println(97);
    }
}
