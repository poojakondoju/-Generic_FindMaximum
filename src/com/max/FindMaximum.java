package com.max;

public class FindMaximum {

public static void main(String[] args) {
		
		Float num1 = 8.6f;
		Float num2 = 5.9f;
		Float num3 = 1.3f;
		Float maximumNum = testMax(num1,num2,num3);
		System.out.println("Maximum number is : "+maximumNum);
	}

	public static Float testMax(Float num1, Float num2, Float num3) {
		
		Float maximumNumber = num1;
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