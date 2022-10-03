import java.util.*;
public class transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j,r,c;
        System.out.println("Enter number of rows: ");
        r=sc.nextInt();
        System.out.println("Enter number of coloumn: ");
        c=sc.nextInt();
           int a[][]=new int[r][c];
           System.out.println("Enter the elements: ");   
        for(i=0;i<r;i++) {
            for(j=0;j<c;j++) {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("The original matrix is : ");
        for(i=0;i<r;i++) {
            for(j=0;j<c;j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println("Transpose is : ");
        for(i=0;i<c;i++) {
            for(j=0;j<r;j++) {
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
    }
}

