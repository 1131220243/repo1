package com.itcast.statics;



import java.io.*;

public class Demo02 {
    public static void main(String[] args) throws IOException {

//        FileOutputStream fos = new FileOutputStream("01_Exception\\b.txt");
//        fos.write(97);
//        fos.write(98);
//        fos.write("xxxxx".getBytes());
//        fos.close();

        FileInputStream fis = new FileInputStream("01_Exception\\b.txt");
        int len;
        byte[] bytes = new byte[2];
        while ((len = fis.read(bytes)) != -1) {
            System.out.println(new String(bytes));
        }


    }

}
