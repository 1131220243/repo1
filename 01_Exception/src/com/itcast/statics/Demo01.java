package com.itcast.statics;

import java.io.File;

public class Demo01 {

    public static void main(String[] args) {
        System.out.println(getSum(5));
        File file = new File("aaa.txt");
        System.out.println(file.delete());
        b(1);
    }

    public static int getSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n+getSum(n-1);
    }
    public static void b(int i){
        System.out.println(i);
        if (i==50000000){
            return ;
        }
        b(i++);
    }





    static {
        System.out.println("haha3");
    }
    public static void getMessage(){
        System.out.println("haha2");
    }


}
