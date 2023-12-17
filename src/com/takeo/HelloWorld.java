package com.takeo; 
import java.time.LocalDate;
import java.lang.reflect.InvocationTargetException;
public class HelloWorld {
	public static void main(String... args) {
		System.out.println("HelloWorld from New York on "+LocalDate.now()); 
		A a = null;
		try {
			a = (A)Class.forName("com.takeo."+args[0]).getDeclaredConstructor().newInstance();
		}
		catch(IllegalArgumentException | InvocationTargetException | NoSuchMethodException |SecurityException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(a); 
	}	
}
