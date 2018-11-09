package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicates {

	public static void main(String[] args) {
		List<Integer> list= new ArrayList<>();
		list.add(3);
		list.add(5);
		list.add(2);
		list.add(5);
		list.add(3);
		list.add(1);
		Set<Integer> set = new HashSet<>(list);
		System.out.println("number"+"\t"+"occurence");
		System.out.println("======"+"\t"+"==========");

		for(Integer obj :set)
		{

			System.out.println(obj+"\t\t"+Collections.frequency(list, obj));
		}

	}

}
