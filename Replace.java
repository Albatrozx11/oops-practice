import java.util.*;
class Replace{
	public static void main(String args[]){
		String str;
		char ch1;
		char ch2;
		int strlen;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string:");
		str = sc.nextLine();
		System.out.print("\nEnter character to be replaced:");
		ch1 = sc.next().charAt(0);
		System.out.print("\nEnter new character:");
		ch2 = sc.next().charAt(0);
		strlen = str.length();
		char[] strarr = new char[strlen];
		for(int i=0;i<strlen;i++){
			strarr[i] = str.charAt(i);
		}
		for(int i=0;i<strlen;i++){
			if(strarr[i]==ch1){
				strarr[i] = ch2;
			}
		}
		System.out.print("String with replaced character is:");
		for(int i=0;i<strlen;i++){
			System.out.print(strarr[i]);
		}
		System.out.print("\n");
	}
}
