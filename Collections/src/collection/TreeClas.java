package collection;

public class TreeClas implements Comparable<TreeClas> {
	
	int id;
	String name;
	String dept;
	TreeClas(int id,String name,String dept)
	{
	this.id=id;
	this.name=name;
	this.dept=dept;
	}
	@Override
	public String toString()
	{
		return name + " " + dept + " " + id ;
	}
	@Override
	public int compareTo(TreeClas o) {
	 System.out.println(this.id + " "+ o.id);
	return Integer.compare(this.id,o.id);

	}

}
