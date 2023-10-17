import java.util.*;
class Palindrome
{
	public static void main(String args[])
	{
		int d;
		int r=0;
		System.out.print("Enter the number to be checked: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n = num;
		while(n>0){
			d = n%10;
			r = (r*10) + d;
			n = n/10;
		}
		if(r==num){
			System.out.print(num+" is a palindrome");
		}else{
			System.out.print(num+" is not a palindrome");
		}
	}
}
