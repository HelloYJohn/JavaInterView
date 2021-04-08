package com.xxdr;
import java.lang.ref.SoftReference;
import java.util.Scanner;

/**
 * @ClassName T01_SoftReference
 * @Description modify VM args -Xms1M -Xmx10M -XX:+PrintGCDetails
 * @Author John Yuan
 * @Date 4/8/21 9:25 AM
 * @Version 1.0
 */

class T01_SoftReference {
    public static void main(String[] args) {
        SoftReference<byte[]> sr = new SoftReference<>(new byte[1024*1024*5]);
        System.out.println(sr.get());
        System.gc();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        byte[] b = new byte[1024*1024*5];
        System.out.println(sr.get());
        Scanner scanner = new Scanner(System.in);
        scanner.next();
    }
}

