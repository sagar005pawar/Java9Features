package com.safeVarargsAnnotation;

import java.util.ArrayList;  
import java.util.List;

public class SafeVar{  
    private void display(List<String>... products) { // Not using @SaveVarargs  
        for (List<String> product : products) {  
            System.out.println(product);  
        }  
    }  
    public static void main(String[] args) {  
        SafeVar p = new SafeVar();  
        List<String> list = new ArrayList<String>();  
        list.add("Laptop");  
        list.add("Tablet");  
        p.display(list);  
    }     
} 
