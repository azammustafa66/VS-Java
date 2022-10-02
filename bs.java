import java.util.*;
public class bs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int array[],first,last,mid,search,n,i;
        System.out.println("Enter the size of array: ");
        n=sc.nextInt();
        array=new int[n];
        System.out.format("Enter %d elements in ascending order: ",n);
        for(i=0;i<n;i++) {
            array[i]=sc.nextInt();
        }
        System.out.println("Enter search value: ");
        search=sc.nextInt();
        sc.close();
        first=0; last=n-1; mid=(first+last)/2;
        if(first>last)
        System.out.println("Invalid!!!");
        else {
        while(first<=last) {
                if(search==array[mid]) {
                System.out.format("%d found at index %d\n",search,mid+1);
                break;
                } else if (search>array[mid]) {
                    last=mid-1;
                    mid=(first+last)/2;
                } else {
                    first=mid+1;
                }
            }
        }    
    }
}
