package com.max;

public class FindMaximum {

public static void main(String[] args) {
		
	String name1 = "Apple";
	String name2 = "Peach";
	String name3 = "Banana";
	String maximum = testMax(name1,name2,name3);
	System.out.println("Maximum String is : "+maximum);
	}

	public static String testMax(String num1, String num2, String num3) {
		
		String maximumNumber = num1;
		if(num2.compareTo(maximumNumber) > 0 )
		{
			maximumNumber = num2;
		}
		if(num3.compareTo(maximumNumber) > 0 )
		{
			maximumNumber = num3;
		}
		return maximumNumber;
	}
}