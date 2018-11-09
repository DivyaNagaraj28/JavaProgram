package collection;

public class SortComparable implements Comparable<SortComparable> {
	
	int reg_no;
	String name;
	int Salary;
	String dept;
	
	SortComparable(int reg_no,String name,int Salary,String dept)
	{

		this.reg_no=reg_no;
		this.name=name;
		this.Salary=Salary;
		this.dept=dept;
	}
	@Override
	public String toString(){
		return "registration number is::" +reg_no +" "+ "employee name::"+name+" "+"Salary per month ::"+Salary+" "+"Belongs to::"+dept;
	}
	


	@Override
	public int compareTo(SortComparable o) {
        
		return Integer.compare(this.reg_no,o.reg_no);

	}
	
	//only once i can override this method in a class
	
/*	@Override
	public int compareTo(SortComparable o) {
        
		return dept.compareTo(o.dept);
	}*/
}