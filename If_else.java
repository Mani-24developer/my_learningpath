//The program is coming to tell about the leap year calculation.
import java.util.*;
public class If_else {
    public static void main(String[] args) {
		int year;
		System.out.println("Enter the year:");
		Scanner in=new Scanner(System.in);
		year=in.nextInt();
		if(year%4==0||(year%100==0&&year%400==0)) {
			System.out.println("Year"+year+"is a leap year");
		
		}else {
			System.out.println("Not a leap year");
			
		}in.close();
		
		

	}
    
}
