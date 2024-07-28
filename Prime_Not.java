import java.util.Scanner;

public class Prime_Not {
    	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n=in.nextInt();
		int f=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				f++;
				
			}
		}
		if(f==2) {
			System.out.println("The given number"+n+"is a prime number.");
		}
		else {
			System.out.println("the given"+n+"is not a prime number");
			
		}in.close();

}
}