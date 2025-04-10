// import java.util.Scanner;
// import java.util.ArrayList;

// public class SortOs1s2s {
//     public static void main(ArrayList<Integer> arr, int n){
//         int cnt0 = 0; 
//         int cnt1 = 0;
//         int cnt2 = 0;

//         for(int i=0; i<n; i++){
//             if(arr.get(i) == 0){
//                 cnt0++;
//             }else if(arr.get(i) == 1){
//                 cnt1++;
//             }else{
//                 cnt2++;
//             }
//         }

//         for(int i=0; i<cnt0; i++){
//             arr.set(i,0);
//         }
//         for(int i=cnt0; i<cnt0+cnt1; i++){
//             arr.set(i,1);
//         }
//         for(int i=cnt0+cnt1; i<n; i++){
//             arr.set(i, 2);
//         }
//     }

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of elements in the array: ");
//         int n = sc.nextInt();
//         ArrayList<Integer> arr = new ArrayList<>();

//         System.out.println("Enter the elements of the array (0, 1, 2): ");
//         for(int i=0; i<n; i++){
//             arr.add(sc.nextInt());
//         }

//         main(arr, n);

//         System.out.println("Sorted array: " + arr);
//         sc.close();
//     }
    
// }

import java.util.*;

public class SortOs1s2s {   
    public static void sortArray(ArrayList<Integer> arr, int n){
        int low=0;
        int mid=0;
        int high = n-1;

        while(mid<=high){
            if(arr.get(mid)==0){
                Collections.swap(arr, low, mid);
                low++;
                mid++;
            }else if(arr.get(mid)==1){
                mid++;
            }else{
                Collections.swap(arr, mid, high);
                high--;
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        System.out.println("Enter the elements of the array (0, 1, 2): ");
        for(int i=0; i<n; i++){
            arr.add(sc.nextInt());
        }

        sortArray(arr, n);

        System.out.println("Sorted array: " + arr);
        sc.close();
    }
}