import java.util.Scanner;
public class calci {
    public static void main(String[] args) {
        float a,b,res; char op;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: \n");
        a=sc.nextFloat();
        System.out.print("Enter second number: \n");
        b=sc.nextFloat();
        System.out.println("Enter an operator(+,-,*,/,%): ");
        op=sc.next().charAt(0);
        sc.close();

        switch(op) {
            case '+' : res=a+b;
                       System.out.println(a+"+"+b+"="+res);
                       break;
            case '-' :  if (a>b) {
                        res=a-b;
                        System.out.println(a+"-"+b+"="+res);
                        break;
            }
            else {
                        res=b-a;
                        System.out.println(b+"-"+a+"="+res);
            }
            case '*' : res=a*b;
                        System.out.print(a+"*"+b+"="+res);
                        break;
            case '/' : res=a/b;
                        System.out.println(a+"/"+b+"="+res);
                        break;
            case '%' : res=a%b;
                        System.out.println(a+"%"+b+"="+res);
                        break;  
            default: System.out.println("Invalid Operator!!!");                                              
        }
    }
}
