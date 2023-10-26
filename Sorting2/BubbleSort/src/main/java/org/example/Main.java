package org.example;
public class Main {

     private final static int f = 10;
    public static int printPowerOf2(int n) {
        int i = 0;
        while (i < n) {
            System.out.println(Math.pow(2, i));
            i++;
        }
        return i;

    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        System.out.println(printPowerOf2(5));
        System.out.println(f);

        A a = new A();
        a.print();
    }

    public static class A {
        public void print() {
            System.out.println(f);
            printPowerOf2(5);
        }
    }




}