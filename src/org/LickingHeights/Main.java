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
    }

    public static String theName(String name){
        return "Hello " + name;

        }

        public static int multiply(int a,int b) {
            return a*b;
    }


    }
