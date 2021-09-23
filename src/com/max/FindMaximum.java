package com.max;

public class FindMaximum {

public static void main(String[] args) {
	
	Integer num1 = 9;
	Integer num2 = 8;
	Integer num3 = 5;
	
	Float number1 = 2.3f;
	Float number2 = 5.1f;
	Float number3 = 3.9f;
		
	String name1 = "Apple";
	String name2 = "Banana";
	String name3 = "Peach";
	
	Integer maxInteger = testMax(num1, num2, num3);
	System.out.println("Maximum Integer is : "+maxInteger);
	
	Float maxFloat = testMax(number1, number2, number3);
	System.out.println("MAx Float is :"+maxFloat);
	
	String maxString = testMax(name1,name2,name3);
	System.out.println("Maximum String is : "+maxString);
	}

	public static <T extends Comparable<T>> T testMax(T x, T y, T z) {
		
		T max = x;
		if(y.compareTo(max) > 0 )
		{
			max = y;
		}
		if(z.compareTo(max) > 0 )
		{
			max = z;
		}
		return max;
	}
}