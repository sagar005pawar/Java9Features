package com.streamAPIimprovement;

import java.util.stream.Stream;  
  
public class StreamExample5 {  
    public static void main(String[] args) {  
        Stream<Integer> val   
        = Stream.ofNullable(null);     
    val.forEach(System.out::println);  
    }  
}
