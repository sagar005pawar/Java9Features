package com.streamAPIimprovement;

import java.util.List;  
import java.util.stream.Collectors;  
import java.util.stream.Stream;  
public class StreamExample {  
    public static void main(String[] args) {  
        List<Integer> list   
        = Stream.of(1,2,3,4,5,6,7,8,9,10)  
                .takeWhile(i -> (i % 2 == 0)).collect(Collectors.toList());     
    System.out.println(list);  
    }  
}
