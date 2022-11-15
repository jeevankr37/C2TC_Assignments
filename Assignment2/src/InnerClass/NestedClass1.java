package InnerClass;


class Outer
{
	int a;
	public void show() {
		
	}
	class Inner //inner class or nested class
	{
		public void display() {
			System.out.println("hello g1");
		}
	}
}

public class NestedClass1 {
	public static void main(String[] args) {
		Outer obj=new Outer();
		//for calling the nested class we have to use outer class because it belongs to outer class
		Outer.Inner obj1=obj.new Inner();//we use class name as outer and obj for object name while calling inner class
		obj1.display();
	}

}
