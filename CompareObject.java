package com.basicJavaProgram;

public class CompareObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//testing 1 parameter
		Car maruti = new Car("Maruti");
		maruti.run();
		Car honda = new Car("Honda");
		honda.run();
		
		//testing 2 parameter constructor
		Car marutiWithPrice = new Car("Maruti", 40000.00);
		marutiWithPrice.run();
		
		Car hondaWithPrice = new Car("Honda", 70000.00);
		hondaWithPrice.run();
	}
	
}
class Car
{
	String name;
	double price;
	
	//Constructor 1 parameter
	public Car(String name)
	{
		this.name = name;
		System.out.println("1 parameter constructor is called");
		System.out.println("Car name is "+this.name);
	}
	public Car(String name, double price)
	{
		this.name = name;
		this.price = price;
		System.out.println("2 parameter constructor is called");
		System.out.println("Car name is:"+this.name+"Car price is: "+this.price);
	}
	void run() {
		System.out.println(name+" Car is running");
	}
}
