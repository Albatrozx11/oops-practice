import java.util.*;
class Compare
{
	public static void main(String args[])
	{
		System.out.print("Enter the numbers to be compared: ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		if(num1 > num2)
		{
			System.out.println(num1+" is greater than "+num2);
		}else if(num1 < num2)
		{
			System.out.println(num1+" is less than "+num2);
		}else
		{
			System.out.println(num1+" is equal to "+num2);
		}
	}
}
