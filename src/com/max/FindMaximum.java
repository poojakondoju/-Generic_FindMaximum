package com.max;

public class FindMaximum {

public static void main(String[] args) {
		
		Integer num1 = 2;
		Integer num2 = 5;
		Integer num3 = 3;
		Integer maximumNum = testMax(num1,num2,num3);
		System.out.println("Maximum number is : "+maximumNum);
	}

	public static Integer testMax(Integer num1, Integer num2, Integer num3) {
		
		Integer maximumNumber = num1;
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