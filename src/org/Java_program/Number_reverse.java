package org.Java_program;

public class Number_reverse {
public static void main(String[] args) {
	int num=1234567890;
	int rev=0;
	
	while (num>0) {
		
		int n=num%10;
		
		rev=(rev*10)+n;
		
		num/=10;
	
	}
	System.out.println(rev);
}
}
