package array;

//we can also create array of an object

public class ArrayDemo {

	public static void main(String[] args) {
		int nums[]=new int[4]; //declaring an 1D array
		//we can also declare an array like this also for example:
		//int nums[]= {45,56,13,42};
		nums[0]=45;
		nums[1]=56;
		nums[2]=13;
		nums[3]=42;
		
		for(int i=0;i<=3;i++) {
			System.out.println(nums[i]);//printing an array elements
		}
	}

}
