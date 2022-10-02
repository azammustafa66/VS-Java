import java.util.*;
import java.lang.Math;
public class quad {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a,b,c,d,r1,r2,i1,i2;
        System.out.println("Enter co-efficients a,b & c: ");
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        sc.close();
        d=(b*b)-(4*a*c);
        if(a==0||b==0||c==0) {
            System.out.println("Operation cannot be performed");
        }
        else if(d>0) {
            System.out.println("Roots are real & distinct");
            r1=(-b+Math.sqrt(d))/(2*a);
            r2=(-b-Math.sqrt(d))/(2*a);
            System.out.format("Root1=%.4f & Root2=%.4f",r1,r2);
        } else if(d==0) {
            System.out.println("Roots are equal");
            r1=r2=-b/(2*a);
            System.out.format("Root1=%.4f & Root2=%.4f",r1,r2);
        } else {
            System.out.println("Roots are real & imaginary");
            r1=r2=-b/(2*a);
            i1=i2=Math.sqrt(-d)/(2*a);
            System.out.format("Root1=%.4f+i%.4f & Root2=%.4f-i%.4f\n",r1,i1,r2,i2);
        }
    }
}

