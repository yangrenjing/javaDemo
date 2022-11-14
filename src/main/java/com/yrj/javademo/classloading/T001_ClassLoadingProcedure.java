package com.yrj.javademo.classloading;

public class T001_ClassLoadingProcedure {
    public static void main(String[] args) {
        System.out.println(T.count);
    }
}

class T {
    /* 这两行代码调换顺序后，结果不一样 */
    public static int count = 2;
    public static T t = new T();

    private T() {
        count ++;
    }
}
