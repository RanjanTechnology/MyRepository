package com.ocjp.oops;

public class CarTest {

	public static void main(String[] args) {
		System.out.println("BMW");
		Car car1 = new BMWCar();
		car1.colour();
		car1.engin();
		car1.model();
		
		System.out.println("HUNDA");
		Car car2= new HundaCity();
		car2.colour();
		car2.engin();
		car2.model();
	}

}
