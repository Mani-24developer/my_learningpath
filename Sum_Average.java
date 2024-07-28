import java.util.Scanner;

public class Sum_Average {
    public static void main(String[]args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the limit:");
		int n=in.nextInt();
		int sum=0,a;
		for(int i=1;i<=n;i++) {
			System.out.println("enter the Number"+i+":");
			a=in.nextInt();
			sum=sum+a;
			
		}
		System.out.println("The sum of the given number is :"+sum);
		System.out.println("The average of a given number is:"+sum/n);
		in.close();
	}
}
