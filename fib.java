import java.util.Scanner;

public class fib {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=in.nextInt();
        int a=0; int b=1; int i;
        for(i=1;i<=n;i++) {
          // System.out.print(a+" "); // print here to get fib terms put i=0 to get fib number series
            int temp=b;
            b+=a;
            a=temp;
            
        }
        //System.out.print(a+" "); //print here to get fib number
    }
    
}
