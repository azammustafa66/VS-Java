import java.util.*;
public class reverse {
    public static void main(String[] args) {
        int n,rev=0,r;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        n=sc.nextInt();
        sc.close();
        int original=n;
        while (n!=0) {
             r=n%10;
             rev=(rev*10)+r;
             n=n/10;
        }
        System.out.println("The reverse of given number is "+rev);
        if(original==rev) {
                System.out.println("The given number is palindrome");
        }
        else {
            System.out.println("The given number is not palindrome");
        }
    }
}

