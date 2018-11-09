package collection;

import java.util.*;
public class ArrayListTest {
	public static void main(String[] args)
	{
	int i = 0;	
	
	StudentDetails stu1= new StudentDetails(97,"x","ece");
	StudentDetails stu2= new StudentDetails(98,"y","csc");
	StudentDetails stu3= new StudentDetails(99,"z","bio");
	

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
	
	
		
	}
	
}
