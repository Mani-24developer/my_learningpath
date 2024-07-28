public class N_Armstrong {
    public static void main(String args[]) {
        int d1,d2,d3,result,temp;
        for(int number=100;number<=999;number++) {
            temp=number;
            d3=temp%10;
            temp=temp/10;
            d2=temp%10;
            temp=temp/10;
            d1=temp%10;
            result=(d1*d1*d1)+(d2*d2*d2)+(d3*d3*d3);
            if(result==number) {
                System.out.println(number+"is a armstrong number.");
            }
        }
        
    }
}
