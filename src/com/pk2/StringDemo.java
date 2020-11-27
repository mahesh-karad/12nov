package com.pk2;

public class StringDemo {
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public void add(float a,int b)
	{
		System.out.println(a+b);
	}
	public void add(int a,float b)
	{
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
	    StringDemo sd= new StringDemo();
	    sd.add(11,22);
	    sd.add(12,12.12f);
	}

}
