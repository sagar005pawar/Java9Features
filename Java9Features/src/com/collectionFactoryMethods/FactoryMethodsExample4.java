package com.collectionFactoryMethods;

import java.util.Map;  
public class FactoryMethodsExample4 {  
    public static void main(String[] args) {  
        Map<Integer,String> map = Map.of(101,"JavaFX",102,"Hibernate",103,"Spring MVC");  
        for(Map.Entry<Integer, String> m : map.entrySet()){    
            System.out.println(m.getKey()+" "+m.getValue());  
        }  
    }  
}
