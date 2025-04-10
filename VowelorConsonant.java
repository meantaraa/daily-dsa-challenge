// import java.util.Scanner;

// public class VowelorConsonant {
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter a character: ");
//         char ch = sc.next().toLowerCase().charAt(0);

//         if(ch >= 'a' && ch <= 'z'){
//             if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
//                 System.out.println("It is a vowel.");
//             }else{
//                 System.out.println("It is a consonant.");
//             }
//         }else{
//             System.out.println("It is not an alphabet.");
//         }
//         sc.close();
//     }   
// }

import java.util.Scanner;

public class VowelorConsonant {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);

        if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                System.out.println("It is a vowel.");
            }else{
                System.out.println("It is a consonant.");
            }
        }else{
            System.out.println("It is not an alphabet.");
        }
        sc.close();
    }   
}