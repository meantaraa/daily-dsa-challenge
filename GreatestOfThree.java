import java.util.*;

public class GreatestOfThree {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = sc.nextInt();

        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        System.out.println( "Enter the third number: ");
        int c = sc.nextInt();

        if(a==b && b==c){
            System.out.println("All numbers are equal.");
        }else if(a>=b && a>=c){
            System.out.println("The greatest number is" + a);
        }else if(b>=a && b>=c){
            System.out.println("The graetest number is: " + b);
        }else{
            System.out.println("The greatest number is: " + c);
        }
        sc.close();
    }
    
}
