package com.pk;

public class MyDate {
    private int day,month,year;
    public MyDate()
    {
    	day=17;
    	month=11;
    	year=2020;
    }
    public MyDate(int day,int month,int year)
    {
    	this.day=day;
    	this.month=month;
    	this.year=year;
    }
    int getDay()
    {
    	return day;
    }
    void setDay(int day)
    {
    	this.day=day;
    }
    
    
    @Override
	public String toString() {
		return "MyDate [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	public void display()
    {
    	System.out.println("\n "+day+"/"+month+"/"+year);
    }
	@Override
	protected void finalize() throws Throwable {
	System.out.println("m in finalize");
	}
	public static void main(String[] args) {
	MyDate m1= new MyDate();
    m1=null;
    System.gc();
    //this is new code
	}

}
