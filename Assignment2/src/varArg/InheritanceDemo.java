//inheritence is fetching the class from other code by using "extends Class_name " keyword for example
package varArg;

class Calculator   //superClass     
{
	public int add(int i, int j)
	{
		return i+j;
	}
}
class CalcAdv  extends Calculator //subclass
{
//	public int add(int i, int j)  //instead of writing add code two time we can fetch the data from super class only 
//	{
//		return i+j;
//	}
	public int sub(int i, int j)
	{
		return i-j;
	}
}
class CalcVeryAdv extends CalcAdv   //this is a multi-level inheritance
{
	public int mul(int i, int j)
	{
		return i*j;
	}
}

public class InheritanceDemo {        //this is a single inheritance

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalcVeryAdv cl = new CalcVeryAdv();   
		int result1 = cl.add(4,6);
		int result2 = cl.sub(4,6);
		int result3 = cl.mul(4,6);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);

	}
}
//note java does not support multiple inheritance
