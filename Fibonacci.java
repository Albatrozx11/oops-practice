import java.util.*;
class Fibonacci {
	public static void main(String args[]){
		int n;
		int i;
		int a = 0, b=1, c=0;
		System.out.print("Enter the limit:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.print("Fibonacci series: ");
		System.out.print("0\t");
		for(i=1;i<n;i++){
			c = a+b;
			a = b;
			b =c;
			System.out.print(a+"\t");
		}
		System.out.println("");
		

	}
}

