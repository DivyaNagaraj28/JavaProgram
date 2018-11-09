package collection;

import java.util.*;
public class ArrayListTest {
	public static void main(String[] args)
	{
	int i = 0;	
	
	StudentDetails stu1= new StudentDetails(97,"div","ece");
	StudentDetails stu2= new StudentDetails(98,"moh","csc");
	StudentDetails stu3= new StudentDetails(99,"kan","bio");
	

	ArrayList<StudentDetails> ar = new ArrayList<>();
	ar.add(stu1);
	ar.add(stu2);
	ar.add(stu3);
	ar.remove(stu3);
	

	for(StudentDetails val : ar)
	{
		System.out.println(val.id);
		System.out.println(val.Name);
		System.out.println(val.dept);
	}
	
	Iterator<StudentDetails> fetch =ar.iterator();
	while(fetch.hasNext())
	{
		StudentDetails store = fetch.next();
		i++;
		System.out.println("stu" + i);
		System.out.println("id num::" +store.id);
		System.out.println("stu name::" +store.Name);
		System.out.println("stu dept::" +store.dept);
		System.out.println("-----------------");
		
		
	}
	ArrayList<Integer> ar1 = new ArrayList<>();
	ar1.add(45);
	ar1.add(55);
	ar1.add(65);
	ar1.remove(2);
	
	for(Integer val : ar1)
	{
		System.out.println(val);
	}
	}
}
