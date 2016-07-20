import java.util.*;
public class weekdays{
public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);
	System.out.println(" Enter the days:");
	String days;
	days=s.nextLine();
	
	
	switch ("days") {
	case "monday":
		System.out.println(" monday is working day. ");
		break;
	case "tuesday":
		System.out.println("tuesday is working day. ");
		break;
	case "Wenday":
		System.out.println("Wenday is working day. ");
		break;
	case "thusday":
		System.out.println("thusday is working day. ");
		break;
	case "Friday":
		System.out.println("Friday is working day. ");
		break;
	case "Saturday":
		System.out.println("Saturday is working day. ");
		break;
	case "Sunday":
		System.out.println("sunday is Holiday day. ");
		break;
		
		
	}
}
}
