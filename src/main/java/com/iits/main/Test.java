package com.iits.main;

import java.util.function.Consumer;

//Since from JDK 1.8version onwards they have introduced
//some thing called as FunctionalInterface,Lambda Expression, Stream API,Method Reference,Optional etc..
@FunctionalInterface
interface A{
String m(String msg);//public abstract void m();
default void log1() {
	System.out.println("log1");
}
static void log2() {
	System.out.println("log2");
}
}
//Lambda Expression: A function without name,return type is called as labmda expression
/*
    ()->{ 
    
    }
 
 */
//Since from JDK 1.8v onwards they have added java.util.function.*;
public class Test {
	public static void main(String[] args) {
	   Consumer<String> consumer=(input)->{
		   System.out.println(input);
	   };
	   
	   consumer.accept("Hi");
	
	}

}
