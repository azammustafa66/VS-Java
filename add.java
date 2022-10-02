import java.util.Scanner;
public class add {
        public static void main(String[] args) {
            float num1, num2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        num1 = sc.nextFloat();
        
        System.out.println("Enter Second Number: ");
        num2 = sc.nextFloat();
        
        sc.close();
        sum = num1 + num2;
        System.out.println("Sum of these numbers: "+sum);
    }
}