package conmethOverloaing; //example of constructors and method overloading;
class Casio //casio is class
{
	public void add(int i, int j) { //multiple methods
		System.out.println(i+j);
	}
	public void add(int i, int j,int k) {
		System.out.println(i+j);
	}
	public void add(double i, double j) {
		System.out.println(i+j);
	}
}



public class MethodOverloadingDemo {

	public static void main(String[] args) {
		Casio obj=new Casio(); //new Casio()- it means  the  calling of methods
		obj.add(5,8); //calling of first constructor
		obj.add(4,4,5); // calling of 2nd 
		obj.add(7.2, 8.6); //calling of third constructor

	}

}
