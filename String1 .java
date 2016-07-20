# sugapackage string;

import java.util.Scanner;

class String1 {
	public static void main (String1 args[]) 
{
System.out.println("enter the string:");
java.lang.String str ;
Scanner s=new Scanner(System.in);
str=s.nextLine();
StringBuffer sb=new StringBuffer(str);
sb.reverse();
java.lang.String str1=sb.toString();

System.out.println(" reverse string is:"+str1);
}
}
n
