import java.util.*;
class StrPal{
	public static void main(String args[]){
	String str;
	int flag=0;
	int strlen;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the string:");
	str = sc.nextLine();
	strlen=str.length();
	char[] strarr = new char[strlen];
	for(int i=0;i<strlen;i++){
		strarr[i] = str.charAt(i);
	}
	int start=0;
	int end=strlen-1;
	while(start<end){
		if(strarr[start]!=strarr[end]){
			flag=1;
			break;
		}
		start++;
		end--;
	}
	if(flag==1){
		System.out.print(str+" is not a palindrome");
	}else{
		System.out.print(str+" is a palindrome");
	}
	}
}
