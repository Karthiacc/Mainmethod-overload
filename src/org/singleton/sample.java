package org.singleton;

public class sample {
private sample() {
}
static sample object;
	
 public static sample getObject() {
	 if (object==null){
		System.out.println("before object creation"+" "+System.identityHashCode(object));
		object=new sample();
		System.out.println("after object creation"+" "+System.identityHashCode(object));
		
		
	}
	return object;
}

private void add() {
	System.out.println("hi");
}
public void minu() {
	System.out.println("hgfg");
}
public static void main(String[] args) {
	sample s=getObject();
	s.add();
	s.minu();
	System.out.println(System.identityHashCode(s));
}
}
