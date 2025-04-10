import java.util.*;

public class SumOfDigits {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;

        while(n > 0){
            int ld = n%10;
            sum = sum + ld;
            n = n/10;
        }

        sc.close();

        System.out.println("Sum of the digits: " + sum);
    } 
}
