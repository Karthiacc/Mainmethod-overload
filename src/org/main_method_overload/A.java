package org.main_method_overload;

public class A {
public static void main(String[] args) {
	System.out.println("main method--A");
	B.main(args);
}
}
