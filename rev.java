import java.util.*;
class rev{
	public static void main(String args[]){
		String str;
		int strlen;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string:");
		str = sc.nextLine();
		strlen = str.length();
		char[] ch = new char[strlen];
		for(int i=0;i<strlen;i++){
			ch[i] = str.charAt(i);
		}
		
		int start=0;
		int end=strlen-1;
		char temp;
		while(start<end){
			temp = ch[start];
			ch[start] = ch[end];
			ch[end] = temp;
			
			start++;
			end--;
		}
		System.out.print("\nThe reversed string is:\t");
		for(int i=0;i<strlen;i++){
			System.out.print(ch[i]);
		}
		System.out.print("\n");
	}
}
