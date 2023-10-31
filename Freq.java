import java.util.*;
class Freq{
 public static void main(String args[]){
 	String str;
 	char ch;
 	int count=0;
 	int strlen;
 	Scanner sc = new Scanner(System.in);
 	System.out.print("Enter the string:");
 	str = sc.nextLine();
 	System.out.print("\nEnter the character:");
 	ch = sc.next().charAt(0);
 	strlen = str.length();
 	for(int i=0;i<strlen;i++){
 		if(str.charAt(i)==ch){
 			count++;
 		}
 	}
 	System.out.println("frequency of "+ch+" in "+str+" is: "+count);
 }
}
