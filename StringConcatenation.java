package com.hc.testcases;

public class StringConcatenation {
	
	
	public static void main(String args[])
	{
		int a = 100;
		int b =200;
		
		String x = "hello";
		String y = "world";
		
		double c = 10.33;
		double d = 11.25;
		
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+a+b+y);
		System.out.println(a+x+b+y);
		System.out.println(c+d);
		System.out.println(x+y+c+d);
		System.out.println(x+y+(c+d));
		
		
	}

}
