package com.privateInterface;

interface Sayable{  
    default void say() {  
        saySomething(); // Calling private method  
        sayPolitely(); //  Calling private static method  
    }  
    // Private method inside interface  
    private void saySomething() {  
        System.out.println("Hello... I'm private method");  
    }  
    // Private static method inside interface  
    private static void sayPolitely() {  
        System.out.println("I'm private static method");  
    }  
}  
public class PrivateInterface2 implements Sayable {  
    public static void main(String[] args) {  
        Sayable s = new PrivateInterface2();  
        s.say();  
    }  
}
