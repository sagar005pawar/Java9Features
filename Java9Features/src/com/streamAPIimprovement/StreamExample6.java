package com.streamAPIimprovement;

import java.util.stream.Stream;  
  
public class StreamExample6 {  
    public static void main(String[] args) {  
        Stream.iterate(1, i -> i <= 10, i -> i*3)  
        .forEach(System.out::println);  
    }  
}
