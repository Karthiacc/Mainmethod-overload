package org.main_method_overload;

public class Sample {

	public static void main(String[] args) {
		System.out.println("main method-----1");
		main("abcd");
		main(10);
		main(10, 20);
		main(98765434567876543l);
	}
	public static void main(String args) {
		System.out.println("main method-----2");
	}
	public static void main(int a) {
		System.out.println("main method----3");
	}
	public static void main(int a, int b) {
		System.out.println("main method-----4");
	}
	public static void main(Long a) {
		System.out.println("main method-----5");
	}
}
