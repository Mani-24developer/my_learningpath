//The program is used to check whether the given number is a armstrong number or not.
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the 3-digit Number:");
		int number=in.nextInt();
		int temp=number;
		int d1,d2,d3;
		d3=temp%10;
		temp=temp/10;
		d2=temp%10;
		temp=temp/10;
		d1=temp%10;
		int result=(d1*d1*d1)+(d2*d2*d2)+(d3*d3*d3);
		if(result==number) {
			System.out.println(number+"is a armstrong number.");
		}
		else {
			System.out.println(number+"is not a armstrong number.");
			
		}in.close();

	}
    
}
