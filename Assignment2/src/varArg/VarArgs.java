package varArg;

class Calc{
public int add(int ... n) {  // here by using 3 dots we can give as many variable values in the main function
	int sum=0;
	for(int i : n) {
		sum = sum+i;
	}
	return sum;
	}
}
public class VarArgs {
	public static void main(String[] args) {
		Calc obj=new Calc();
		System.out.println(obj.add(4,5,6,78,65)); // here we can give as many vlaues we can
	}

}
