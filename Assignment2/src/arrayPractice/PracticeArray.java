package arrayPractice; //sum of 5 array values
//
//public class PracticeArray {
//
//	public static void main(String[] args) {
//		float marks[]= {12.5f,13.2f,96.3f,56.3f,65.5f};
//		float sum=0;
//		for(float element:marks) {
//			sum = sum+element;
//		}
//		System.out.println("the value of sum is: "+ sum);
//	}
//
//}

//write a prgm to find out whether given integer is present in an array or not

//public class PracticeArray {
//	public static void main(String[] args) {
//		int number[]= {5,7,6,9,2,1,4,6};
//		int num=5;
//		boolean isInArray=false;
//		for(int element:number) {
//			if(num==element) {
//				isInArray=true;
//			}
//		}
//		if(isInArray) {
//			System.out.println("this number is present in the array");
//
//		}
//		else {
//			System.out.println("this numberis mot present in the array");
//
//		}
//
//}
//}

//calculate the average marks from an array containing marks of all students in physics using for each loop

//public class PracticeArray {
//
//	public static void main(String[] args) {
//		float marks[]= {12.5f,13.2f,96.3f,56.3f,65.5f};
//		float sum=0;
//		for(float element:marks) {
//			sum = sum+element;
//		}
//		System.out.println("the value of sum is: "+ sum/marks.length);
//
//	}
//	}

//create a java program to add two matrices of size 2*3

/*public class PracticeArray {

	public static void main(String[] args) {
		int m1[][]= {{1,2,3},
				     {4,5,6}};
		int m2[][]= {{8,2,3},
				     {6,5,5}};
		int result[][]= {{0,0,0},
				         {0,0,0}};
		
		for(int i=0;i<m1.length;i++) {
			for(int j=0;j<m1[i].length;j++) {
				result[i][j]=m1[i][j] + m2[i][j];
				System.out.print(result[i][j]+ " ");
				
			}
			System.out.println("");
		}
	}}*/

//java program to reverse an array
public class PracticeArray {

	public static void main(String[] args) {
		int arr[]= {5,6,46,9,23,8,5,3,2,4};
//		int l = arr.length;
//		int n = Math.floorDiv(l,2);
//		int temp;
//		
//		for(int i=0;i<n;i++) {
//			temp = arr[i];
//			arr[i]=arr[l-i-1];
//			arr[l-i-1]=temp;
//		}
//		for(int element:arr) {
//			System.out.println(element+ " ");
//		}
//	}}

//write a java prog to find max element in an array;
int max = 26;
for(int e:arr) {
	if(e<max) {
		max=e;
	}
}
System.out.println("the value of max element in this array is:"+ max);


	}}














