package collection;

public class SortComparator {

	int reg_no;
	String name;
	int Salary;
	String dept;
	

	SortComparator(int reg_no,String name,int Salary,String dept)
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
	
}
