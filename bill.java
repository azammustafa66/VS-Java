import java.util.*;
public class bill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double unit,amt,sur=0; String Name;
        System.out.print("Enter your name: ");
        Name=sc.next();
        System.out.println("Enter units consumed: ");
        unit=sc.nextInt();
        sc.close();
        if(unit==0) {
            amt=100;
        }
        else if(unit>0&&unit<=200) {
            amt=unit*0.8+100;
        }
        else if(unit>200&&unit<=300) {
            amt=100+(200*0.8)+(unit-200)*0.9;
        }
        else {
            amt=100+(200*0.8)+(100*0.9)+(unit-300)*1;
        }
        if(amt>400) {
            sur=amt*0.15;
            amt+=sur;
        }
        System.out.format("Hi Mr/Mrs.%s your bill amount is Rs. %.2f/- with surcharge of %.2f/- included",Name,amt,sur);
    }
}
