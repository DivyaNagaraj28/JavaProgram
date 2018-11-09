package collection;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class TreeMain {
	public static void main(String args[])
	{
	
		TreeSet<TreeClas> obj = new TreeSet<>();
		obj.add(new TreeClas(7,"divya","ece"));
        obj.add(new TreeClas(8,"apple","acc"));
        obj.add(new TreeClas(5,"monday","main"));
        obj.add(new TreeClas(4,"tue","main"));
        obj.add(new TreeClas(2,"fri","main"));
        obj.add(new TreeClas(9,"sat","main"));
        obj.add(new TreeClas(1,"sun","main"));
        
       
      //Collections.sort(obj); 
     
       for(TreeClas val:obj)
        {
        	System.out.println(val);
        }
		
		
		
		
		
	}

}
