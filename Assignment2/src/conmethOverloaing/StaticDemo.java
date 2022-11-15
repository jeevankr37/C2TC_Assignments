package conmethOverloaing;
class Emp
{
	int eid;
	int salary;
	static String ceo;  //static is used to call all the objects 
	
	// we can also use static variable like this also:
	/*static {
		ceo="Larry";
		System.out.println("in Static");
	}*/ // this type can be work only for constructors not for methods
	
	public void show() {                 //for printing the values  we use method
		System.out.println(eid+";"+salary+";"+ceo );
	}
}

public class StaticDemo {
	public static void main(String[] args) {
		Emp Jeevan = new Emp();
		Jeevan.eid=29;
		Jeevan.salary=50000;
		Jeevan.ceo="Navin";
		
		Emp Arjun = new Emp();
		Arjun.eid=29;
		Arjun.salary=50000;
		Arjun.ceo="Navin";
		
		Arjun.ceo="Arya"; //here im changing the ceo of arjun , but in the result we want both jeevan and arjun's ceo will be change but it will chaneg only arjun's ceo for to cahange both the objs ceo we use static keyword in line 6 
		
		Jeevan.show();
		Arjun.show();
	}

}

//we can only access static variable inside the static method