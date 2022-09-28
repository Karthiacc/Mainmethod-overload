package org.Java_program;

public class Fibonacci_series {
public static void main(String[] args) {
	int a=0;
	int b=1;
	System.out.println(a);
	System.out.println(b);
	
	for (int i = 0; i <=10; i++) {
		int c=a+b;
		a=b;
		b=c;
		System.out.println(c);
	}
	
//	iteration
//	c=1		a=1		b=1		<-0
//	c=2		a=1		b=2		<-1
//	c=3		a=2		b=3		<-2
//	c=5		a=3		b=5		<-3
//	c=8		a=5		b=8		<-4
//	c=13	a=8		b=13	<-5
//	c=21	a=13	b=21	<-6
//	c=34	a=21	b=34	<-7
//	c=55	a=34	b=55	<-8
//	c=89	a=55	b=89	<-9
//	c=144	a=89	b=144	<-10
	
	
	
	
}
}
