package com.example.test;

import org.junit.jupiter.api.Test;

public class Switch {

    /**
     * java12
     */
    public static void main(String[] args) {
        Color color = Color.BLACK;
        
        switch (color) {
            case RED ->System.out.println("red");
            case BLACK -> System.out.println("black");       
            case GREEN, YELLOW -> System.out.println("other");
            default -> {
                System.out.println("err");
                throw new IllegalArgumentException("err");
            }
        }
    }

    /**
     * java12
     */
    @Test
    public void test2() {
        Color color = Color.BLACK;
        
        int i = switch (color) {
            case RED -> 1;
            case BLACK -> 2;
            case GREEN, YELLOW -> 0;
            default -> {
                System.out.println();
                throw new IllegalArgumentException("");
            }
        };

        System.out.println(i);
    }


    /**
     * java13 yield关键字返回
     * yield会停止执行switch的后续
     */
    @Test
    public void test3() {
        Color color = Color.BROWN;

        int i = switch (color) {
            case RED -> 1;
            case BLACK -> 2;
            case GREEN, YELLOW -> 0;
            default -> {
                System.out.println();
                yield 7;
            }
        };

        System.out.println(i);
    }



    /**
     * java13 yield关键字返回 
     * 
     */
    @Test
    public void test4() {
        String color = "red";

        int i = switch (color) {
            case "red" : yield 100;
            case "green" : yield  200;
            default : yield 7000;
        };

        System.out.println(i);
    }


    enum Color {
        RED,
        YELLOW,
        BLACK,
        GREEN,
        BROWN
    }
    
}




