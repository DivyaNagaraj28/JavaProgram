package collection;

import java.util.ArrayList;
import java.util.Collections;


public class ComparableMain {

	public static void main(String[] args) {
		ArrayList<SortComparable> s=new ArrayList<>();	
		s.add(new SortComparable(1009,"divya",15000,"ece"));
		s.add(new SortComparable(1004,"mohan",16000,"acc"));
		s.add(new SortComparable(1007,"vivek",15000,"manage"));
		s.add(new SortComparable(1002,"vicky",18000,"tech"));
		s.add(new SortComparable(1008,"kanchu",15000,"recep"));
		Collections.sort(s);

		for(SortComparable ec:s)
		{
			System.out.println(ec);
		}


	}



}
