package com.tns.Abstract;

interface Abc
{
	void show();
}
class Xyz implements Abc
{

	@Override
	public void show() {
		System.out.println("anything");
		
	}
	
}
public class Interface {
	public static void main(String [] args) {  
		Abc obj = new Xyz();          //to create the obj of an interface by implementing the class
		obj.show();
	}

}
