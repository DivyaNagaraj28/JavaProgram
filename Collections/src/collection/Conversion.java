package collection;
import java.util.*;
public class Conversion {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add("Divya");
		list.add("studying");
		list.add("in");
		list.add("niit");
		System.out.println(list);
		list.add("259");
		list.add("148");
		list.add("3");
        System.out.println(list);
        
        for(Object val:list)
        {
        
        	if(val instanceof String)
        	{
        		String name = (String)val;
        	    System.out.println(name);
        	}
        	else
        	{
        		Integer num = (Integer)val;
        		System.out.println(num);
        	}
        }
		
		
	}

}
