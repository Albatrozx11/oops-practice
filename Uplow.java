import java.util.*;
class Uplow{
	public static void main(String args[]){
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string:");
		str = sc.nextLine();
		System.out.print("uppercase: "+str.toUpperCase()+"\n"+"lowercase: "+str.toLowerCase());
	}
}
