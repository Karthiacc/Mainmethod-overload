package org.test;

import java.util.ArrayList;
import java.util.List;

public class Sample extends Pojo_class {
public static void main(String[] args) {
	Sample s=new Sample();
	s.setId(10);
	s.setName("hbgvdshbj");

	Sample s2=new Sample();
	s2.setId(20);
	s2.setName("asdfd");

	Sample s3=new Sample();
	s3.setId(30);
	s3.setName("dfg");

	Sample s4=new Sample();
	s4.setId(40);
	s4.setName("dsfddfd");

List<Sample>l=new ArrayList<>();
l.add(s);
l.add(s2);
l.add(s3);
l.add(s4);

for (int i = 0; i < l.size(); i++) {
	Sample sample = l.get(i);
	
	int id = sample.getId();
	System.out.println(id);
	
	String name = sample.getName();
	System.out.println(name);



}






}
}
