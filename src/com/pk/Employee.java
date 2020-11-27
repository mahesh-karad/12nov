package com.pk;

public class Employee {
    private int id;
    private String name;
    private float salary;
    private MyDate jd;
    int count;
    public Employee()
    {
    	count++;
    }
    public Employee(int id,String name,float salary,MyDate jd)
    {
    	this.id=id;
    	this.name=name;
    	this.salary=salary;
    	this.jd=jd;
    }
    
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + jd+ "]";
	}
	
	public void calsal()
	{
		System.out.println("employee salary");
	}
	public static void main(String[] args) {
	
	Employee e1= new Employee();
	Employee e2= new Employee();
	Employee e3= new Employee();
	
	System.out.println(e3.count);

	}

}
