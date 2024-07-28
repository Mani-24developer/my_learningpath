// The program had been done by  using if else case.A normal condition statement had been executed.
import java.util.*;


public class Income {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your monthly salary");
		int income=sc.nextInt();
		
		
		if (income>=50000) {
			
			System.out.println("you are able to manage yourself ");
			
		}
		else {
			System.out.println("you are not able to manage yourself ");
		}
		sc.close();

	}

}
