package collection;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Comparator;


public class ComparatorMain {

	public static void main(String[] args) {
		  ArrayList<SortComparator> obj=new ArrayList<>();	
		    obj.add(new SortComparator(1009,"divya",15000,"ece"));
		    obj.add(new SortComparator(1004,"mohan",16000,"acc"));
		    obj.add(new SortComparator(1007,"vivek",15000,"manage"));
		    obj.add(new SortComparator(1002,"vicky",18000,"tech"));
		    obj.add(new SortComparator(1008,"kanchu",15000,"recep"));
		    
		   
		     Collections.sort(obj,( o1, o2) -> 
			    {           
			    	return o1.reg_no<o2.reg_no?-1:1;
			     });
		     
		     
		     for(SortComparator c:obj)
		     {
		     	System.out.println(c);
		     }
		       

	}

}
