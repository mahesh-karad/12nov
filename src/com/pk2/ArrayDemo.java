package com.pk2;

import javax.swing.JFrame;

public class ArrayDemo extends JFrame{

	public ArrayDemo() {
	setVisible(true);
	setSize(300,300);
	}
	public static void main(String[] args) {
	ArrayDemo a= new ArrayDemo();
		int arr[][]= {{3,2},{6,7}};
	
	for(int i=0;i<2;i++)
	{   System.out.println("");
		for(int j=0;j<2;j++)
			System.out.print("\t "+arr[i][j]);
	}
	}

}
