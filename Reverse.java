import java.util.Scanner;

public class Reverse {
    public static void main(String args[]) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the Number:");
	int n=in.nextInt();
	int reverse=0,rem;
	while(n!=0) {
		rem=n%10;//3 4
		reverse =(reverse*10)+rem;//0*10=0+3=3;30+
		n=n/10;//
	}
	System.out.println("Reserved Number:"+reverse);
	in.close();
}
    
}
