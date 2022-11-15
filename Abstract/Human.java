package com.tns.Abstract;
// if u make a class as an abstract u cannot create an object of an class

abstract class Men{
	//if u don't want to define method , make it abstract
	public abstract void act();   //we can also declare a method by using abstract keyword its called abstract method
	public void sleeps() {
		
	}
}

class Women extends Men //whenever a method extends abstract we need to define that method compulsarily
{
	public void act() {  //its necessary to mention the method whose class is obj
		
	}
}
public class Human {

	public static void main(String[] args) {
		Men obj=new Women(); //see here its showing an error ie once u make class as an abstract that means no one can create an object of that class
		
	}

}
