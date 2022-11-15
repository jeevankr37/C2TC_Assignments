package conmethOverloaing; //consturctor overloading
class Casio
{
	int num1;
	int num2;
	String operation;
	
	public Casio()
	{
		num1=0; // in constructor if we don't assign the value in the main fun then it will take default values 
		num2=0; // which are given here
		operation="nothing";
	}
	public Casio(int i)
	{
		num1=i;
		num2=0;
		operation="nothing";
	}
	public Casio(int i, int j)
	{
		num1=i;
		num2=j;
		operation="nothing";
	}
	public Casio(int i, int j, String op)
	{
		num1=i;
		num2=j;
		operation=op;
	}
}



public class constructorOverloading {
	public static void main(String[] args) {
	Casio obj = new Casio(5,4);

}
}
