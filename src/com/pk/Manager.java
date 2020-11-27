package com.pk;

public class Manager extends Employee{
    private int hours;
    private int rate;
    public Manager()
    {
    	
    }
    public Manager(int id,String name,float salary,MyDate jd,int hours,int rate)
    {
    	super(id,name,salary,jd);
    	this.hours=hours;
    	this.rate=rate;
    }
    
	@Override
	public String toString() {
		return super.toString()+"Manager [hours=" + hours + ", rate=" + rate + "]";
	}
	/*
	 * public void calsal() { System.out.println("manager salary"); }
	 */
	
	public static void main(String[] args) {
    Manager m= new Manager(202,"Mahesh",9876543221.98f,new MyDate(17,11,2020),100,100);
    System.out.println(m);
	}

}
