package com.hc.testcases;

public class TwodimensionalArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a[][] = new String[2][4];
		
		System.out.println(a.length); //total number of rows
		System.out.println(a[0].length); //total number of columns
		
		 a[0][0] = "HC ABROAD";
		 a[0][1] = "HC INDONESIA";
		 a[0][2] = "HC Australia";
		 a[0][3] = "HC Singapore";
		 
		 
		 for(int i=0;i<=a.length;i++)
		 {
			 for(int j=0;j<=a[0].length;j++)
			 {
				 System.out.println(a[i][j]);
				 
			 }
		 }
		
	}

}
