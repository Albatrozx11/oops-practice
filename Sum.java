import java.util.*;
class Sum{
	public static void main(String args[])
	{
		System.out.print("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for(int i=0;i<=n;i++)
		{
			sum += i;
		}
		System.out.println("Sum = "+sum);
	}
}
