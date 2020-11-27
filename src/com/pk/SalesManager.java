package com.pk;

public class SalesManager extends Manager {
    private int bonus;
    
    
	public SalesManager() {
		super();
	}


	public SalesManager(int id, String name, float salary, MyDate jd, int hours, int rate, int bonus) {
		super(id, name, salary, jd, hours, rate);
		this.bonus = bonus;
	}


	@Override
	public String toString() {
		return super.toString()+"SalesManager [bonus=" + bonus + "]";
	}
	/*
	 * public void calsal() { System.out.println("salesmanager salary"); }
	 */

	public static void main(String[] args) {
	Employee sm= new SalesManager();
	System.out.println(sm);
    sm.calsal();
	}

}
