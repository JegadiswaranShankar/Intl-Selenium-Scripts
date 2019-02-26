package com.hc.testcases;

public class ArrayConcepts {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i[] = new int[6];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		i[4] = 50;
		i[5] = 65;
		
		
		System.out.println(i[4]);
		System.out.println(i.length);
		
		
		for(int j=0;j<i.length;j++)
		{
			System.out.println(i[j]);
		}
		
		
		//String array, String is a class
		
		String s[] = new String[2];
		s[0] = "Jegadiswaran";
		s[1] = "Shankar";
		
		System.out.println(s.length);
		System.out.println(s[0]);
		
		
		Object ob[] = new Object[4];
		
		ob[0] = "Name";
		ob[1] = 27;
		ob[2] = 10.23;
		ob[3] = "Address";
		System.out.println(ob[2]);
		System.out.println(ob.length);
		
		for(int k=0;k<ob.length;k++)
		{
			System.out.println(ob[k]);
		}
		
		

	}

}
