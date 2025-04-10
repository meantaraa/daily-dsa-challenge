import java.util.*;

public class SumOfNum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the start number: ");
        int start = sc.nextInt();
        
        System.out.println("Enter the end number: ");
        int end = sc.nextInt();

        int sum=0;

        for(int i=start; i<=end; i++){
            sum=sum+i;
        }

        sc.close();
        
        System.out.println("The sum is: " + sum);
    }
}
