package com.max;

public class FindMaximum<T extends Comparable<T>> {
	/*
	 * Find Maximum Problem using Generic.
	 */
	
	//Global variables
	T x, y, z;
	
	public FindMaximum( T x, T y, T z) {
		//Assigning values
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public T maximum() {
		//calling tsetMax method
		return FindMaximum.testMax(x, y, z);
	}

public static void main(String[] args) {
	//Local variables.
	Integer num1 = 9;
	Integer num2 = 8;
	Integer num3 = 5;
	
	Float number1 = 2.3f;
	Float number2 = 5.1f;
	Float number3 = 3.9f;
		
	String name1 = "Apple";
	String name2 = "Banana";
	String name3 = "Peach";
	
	/*
	 * Calling constructor through object creation.
	 * Calling maximum method through object reference variable.
	 */
	FindMaximum<Integer> printMaxInteger = new FindMaximum<Integer>(num1, num2, num3);
	printMaxInteger.maximum();
		
	FindMaximum<Float> printMaxFloat = new FindMaximum<Float>(number1, number2, number3);		
	printMaxFloat.maximum();
	
	FindMaximum<String> printMaxString = new FindMaximum<String>(name1, name2, name3);
	printMaxString.maximum();
	
	}

	/*
	 * Generic method to find the maximum value.
	 */
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
	
	/*
	 * Printing the maximum value
	 */
	public static <T> void printMax(T x, T y, T z, T maximum) {
		System.out.printf("Max of %s, %s and %s is %s \n", x, y, z, maximum);
	}
}