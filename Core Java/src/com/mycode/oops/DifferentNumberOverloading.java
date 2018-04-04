package com.mycode.oops;

public class DifferentNumberOverloading {

	public int add(int a, int b) {

		int sum = a + b;

		return sum;
	}

	/*public float add(int a, float b) {

		float sum = a + b;

		return sum;
	}

	public float add(float a, int b) {

		float sum = a + b;

		return sum;
	}*/
	
	public long add(long a, int b) {

		long sum = a + b;

		return sum;
	}
	
	public long add(int a, long b) {

		long sum = a + b;

		return sum;
	}
	
	public long add(long a, long b) {

		long sum = a + b;

		return sum;
	}
	
	/*public double add(double a, int b) {

		double sum = a + b;

		return sum;
	}
	
	public double add(int a, double b) {

		double sum = a + b;

		return sum;
	}
	
	public double add(double a, double b) {

		double sum = a + b;

		return sum;
	}*/
	

}
