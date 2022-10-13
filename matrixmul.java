import java.util.Scanner;

public class matrixmul {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j,k,r1,c1,r2,c2;
        System.out.println("Enter rows and coloumns of first matrix: ");
        r1=sc.nextInt(); c1=sc.nextInt();
        System.out.println("Enter rows and coloumns of second matrix: ");
        r2=sc.nextInt(); c2=sc.nextInt();
        if(c1!=r2) {
            System.out.println("Matrix multiplication not possible");
            } else {
                int[][] a = new int[r1][c1];
                int[][] b = new int[r2][c2];
                int[][] m = new int[r1][c2];
                System.out.println("Enter elements of first matrix: ");
                for (i = 0; i < r1; i++) {
                    for (j = 0; j < c1; j++) {
                        a[i][j] = sc.nextInt();
                    }
                }
                System.out.println("Enter elements of second matrix: ");
                for (i = 0; i < r2; i++) {
                    for (j = 0; j < c2; j++) {
                        b[i][j] = sc.nextInt();
                    }
                }
                sc.close();
                System.out.println("Multiply of two matrix is: ");
                for (i = 0; i < r1; i++) {
                    for (j = 0; j < c2; j++) {
                        m[i][j] = 0;
                        for (k = 0; k < r1; k++) {
                            m[i][j] += a[i][k] * b[k][j];
                        }
                        System.out.print(m[i][j] + " ");
                    }
                    System.out.println();
                }
        }
    }
}
