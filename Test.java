package com.hc.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	
	
	
	public static void main(String args[])
	{
		int i = 1;
		while(i<=10)
		{    
			i=i+1;
			//System.out.println(i);
			i=i+1;
		}
		
		//disadvantage of while loop is it will produce infinite loop if we fail to give increment data
	//System.out.println("************");
	
	//print 10 to -10
	for(int j=10;j>=-10;j--)
	{
		//System.out.println(j);
	}
	
	
	//incremental and decremental operator
	
	int k=1;
	int l= k++;  //post increment
	
	System.out.println(k);
	System.out.println(l);
	
	System.out.println("************");
	int a =1;
	int b=++a;  //pre-increment
	
	System.out.println("************");
	System.out.println(a);
	System.out.println(b);
	
	
	System.out.println("************");
	int y= 2;
	int z= y--; //post decrement
	System.out.println(y);  //1
	System.out.println(z);  //2
	
	
	System.out.println("************");
	int ab = 2;
	int ac = --ab; //pre-decrement
	System.out.println(ab);  
	System.out.println(ac);  
	
	
	for(int s = 0; s <= 5; s++ )
    {
        System.out.println("s = " + s );
    }

    System.out.println("s after the loop = " + s );
	}


	

}

