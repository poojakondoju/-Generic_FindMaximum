package com.max;

public class FindMaximum<T extends Comparable<T>> {
T x, y, z;
	
	public FindMaximum( T x, T y, T z) {
		//super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public T maximum() {
		return FindMaximum.testMax(x, y, z);
	}

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
	
	FindMaximum<Integer> printMaxInteger = new FindMaximum<Integer>(num1, num2, num3);
	printMaxInteger.maximum();
	
	FindMaximum<Float> printMaxFloat = new FindMaximum<Float>(number1, number2, number3);	
	printMaxFloat.maximum();
	
	FindMaximum<String> printMaxString = new FindMaximum<String>(name1, name2, name3);
	printMaxString.maximum();
	
	}

	public static <T extends Comparable<T>> T testMax(T x, T y, T z) {
		
		T max = x;
		if(y.compareTo(max) > 0 ) {
			max = y;
		}
		if(z.compareTo(max) > 0 ) {
			max = z;
		}
		printMax(x, y, z, max);
		return max;
	}
	

	public static <T> void printMax(T x, T y, T z, T maximum) {
		System.out.printf("Max of %s, %s and %s is %s \n", x, y, z, maximum);
	}
}
