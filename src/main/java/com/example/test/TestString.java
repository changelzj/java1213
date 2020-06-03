package com.example.test;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestString {
    
    @Test
    public void test() {
        String transform = "hello".transform(s -> s += " world").transform(String::trim);
        Boolean b = transform.transform(String::isBlank);
        System.out.println(transform);
    }
    
    @Test
    public void test2() {
        List<String> list = Arrays.asList(" java", " c++", " golang", "     python");
        List<String> list2 = new ArrayList<>();
        
        list.forEach(e -> e.transform(String::strip)
                .transform((s -> "hello " + s))
                .transform(list2::add));
        System.out.println(list2);
    }

    /**
     * 补空格
     */
    @Test
    public void indent() {
        System.out.println("hello c++".indent(5));
        System.out.println("hello c++\n hello java\nhello golang".indent(5));
    }
    
}
