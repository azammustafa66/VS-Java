import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n; 
        System.out.print("Enter a integer: ");
        n=sc.nextInt();
        int original=n;
        sc.close();
        int r,sum=0;
        while(n!=0) {
            r=n%10;
            sum+=r;
            n/=10;
        }
        System.out.println("The sum of digits of "+original+" is "+sum);
    }
}
