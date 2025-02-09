package com.collectionFactoryMethods;

import java.util.Set;  
public class FactoryMethodsExample3 {  
    public static void main(String[] args) {  
        Set<String> set = Set.of("Java","JavaFX","Spring","Hibernate","JSP");  
        for(String l:set) {  
            System.out.println(l);  
        }  
    }  
}
