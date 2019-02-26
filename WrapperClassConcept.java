package com.hc.testcases;

public class WrapperClassConcept {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x = "100";
		int i = Integer.parseInt(x);
		
		System.out.println(i);
		
		
		String y = "12.12";
		double j = Double.parseDouble(y);
		
		System.out.println(y);
		
		
		String z = "true";
		boolean k = Boolean.parseBoolean(z);
		
		System.out.println(k);
		
		//int to string conversion
		
		int l = 200;
		String str = String.valueOf(l);
		System.out.println(str);

	}

}
