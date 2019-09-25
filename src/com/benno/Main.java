package com.benno;

    /*
    NAMA        : BENNO ALIF ANGGARA
    KELAS       : IF1
    NIM         : 10118024
    Deskripsi   : Implementasi Formatting
     */

public class Main {

    public static void main(String[] args) {
        int i = 3456764;
        int iMinus = -i;
        System.out.println("i : " + i);
        System.out.printf("%%d : %d%n", i);
        System.out.printf("%%10d : %10d%n", i);
        System.out.printf("%%+10d : %+10d&n", i);
        System.out.printf("%%+10d : %+10d&n", iMinus);
        System.out.printf("%%,10d : %,10d%n", i);
        System.out.printf("%%-10d : %-10d%n", i);
        double f = 5675482.982;
        System.out.println("f : " + f);
        System.out.printf("%%f : %f%n", f);
        System.out.printf("%%.2f : %.2f%n", f);
        System.out.printf("%%12.2f : %12.2f%n", f);
        System.out.printf("%%,12.2f : %,12.2f%n", f);
    }
}
