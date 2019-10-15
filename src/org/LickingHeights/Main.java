package org.LickingHeights;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        String aName = theName("Tim");
        System.out.println(aName);
        int a,b;
        a=5;
        b=6;
        int answer = multiply(a,b);
        System.out.println(answer);
        int c,d;
        c=5;
        d=9;
        double answer2 =divide(c,d);
        System.out.println(answer2);
    }

    public static String theName(String name){
        return "Hello " + name;

        }

        public static int multiply(int a,int b) {
            return a*b;
    }
    public static int divide(int c,int d) {
        return c/d;
    }

    }
