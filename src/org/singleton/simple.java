package org.singleton;


public class simple {
	public static void main(String[] args) {
		sample object = sample.getObject();
		System.out.println(System.identityHashCode(object));
	
		sample object2 = sample.getObject();
		System.out.println(System.identityHashCode(object2));
	}
}
