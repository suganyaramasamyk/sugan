# sugan

public class Numberreverse {
public static void main(String[] args) {
	int i;
	int rev = 0 ;
	int n=1324;
	int length=String.valueOf(n).length();
	for(i=0;i<length;i++)
	{
		rev=n%10;
		n=n/10;
		System.out.println(" thr reverse number is:  "+rev);	
	}

}

}
