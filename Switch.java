// The program is used to predict your routine, most commonly using routine of bodybuliders.
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
		System.out.println("what is your gym routine?");
		System.out.println("1.Monday");
		System.out.println("2.Tuesday");
		System.out.println("3.Wednesday");
		System.out.println("4.Thursday");
		System.out.println("5.Friday");
		System.out.println("6.Saturday");
		System.out.println("7.Sunday");
		System.out.println("Enter your choice:");
		
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		switch(a) {
		case 1:
			System.out.println("1.Monday:"
					+ "chest and trisup");
			break;
			
		case 2:
			System.out.println("2.Tuesday:"
					+ "Back and Biscep");
			break;
			
		case 3:
			System.out.println("3.Wednesday"
					+ "leg and shoulder");
			break;
		case 4:
			System.out.println("4.Thursday:"
					+ "chest and trisup");
			break;
			
		case 5:
			System.out.println("5.Friday:"
					+ "Back and Biscep");
			break;
			
		case 6:
			System.out.println("6.saturday:"
					+ "leg and shoulder");
			break;	
		case 7:
			System.out.println("rest day:");
			break;
		default :
			System.out.println("invalid selection...");
			break;
		}in.close();
	

	}

    
}
