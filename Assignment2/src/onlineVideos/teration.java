//package onlineVideos;
//
//public class teration {
//	public static void main(String[] args) {
//		int i;
//		for(i=0;i<=10;i++)
//		System.out.println("Hello");
//	}
//
//}
//we can also write this code in while loop;
//package onlineVideos;
//public class teration {
//	public static void main(String[] args) {
//		int i=1; //initialization 
//		while(i<=5) { //condition 
//			System.out.println("Hello");
//			i++; //increment or decrement
//		}
//	}
//}
//by using do while loop : do while is used to print the condition must be printed atleast once;
//for ex 
package onlineVideos;
//public class teration{
//	public static void main(String[] args) {
//		int i=3;
//		do {
//			System.out.println("Hai");
//			i++;
//		}while(i<=2); {
//			System.out.println("Terminate");
//		}
//	}
//}
/* to print this type of star pattern we are using nested for loops
 * ***
 * ***
 * */
//public class teration{
//	public static void main(String[] args) {
//	for(int i=1;i<=4;i++) {
//		for(int j=1;j<=4;j++) {
//		System.out.print("* ");
//	}
//		System.out.println( );
//	}
//	}
//}

public class teration{
	public static void main(String[] args) {
		int i,j,n=6;
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print( j);
			}
		System.out.print("\n ");
		}
	}
	}