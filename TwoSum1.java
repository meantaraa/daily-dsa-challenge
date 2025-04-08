// import java.util.Scanner;

// public class Twosum1 {
//     public static String twoSum(int[] arr, int n, int target) {
//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 if (arr[i] + arr[j] == target) {
//                     return "YES";
//                 }
//             }
//         }
//         return "NO";
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the number of elements in the array: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];
//         System.out.println("Enter the elements of the array: ");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.println("Enter the target sum: ");
//         int target = sc.nextInt();

//         String result = twoSum(arr, n, target);
//         System.out.println("Result: " + result);

//         sc.close();
//     }
// }

// import java.util.*;

// public class TwoSum1 {
//     public static String twoSum(int n, int[] arr, int target) {
//         HashMap<Integer, Integer> mpp = new HashMap<>();

//         for (int i = 0; i < n; i++) {
//             int num = arr[i];
//             int moreNeeded = target - num;
//             if (mpp.containsKey(moreNeeded)) {
//                 return "YES";
//             }
//             mpp.put(num, i);
//         }
//         return "NO";
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the number of elements in the array: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];
//         System.out.println("Enter the elements of the array: ");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.println("Enter the target sum: ");
//         int target = sc.nextInt();

//         String result = twoSum(n, arr, target);
//         System.out.println("Result: " + result);

//         sc.close();
//     }
// }

import java.util.*;

public class TwoSum1 {

    public static String twoSum(int n, int[] arr, int target) {

        Arrays.sort(arr);
        int left = 0;
        int right = n - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return "YES";
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target sum: ");
        int target = sc.nextInt();

        String result = twoSum(n, arr, target);
        System.out.println("Result: " + result);

        sc.close();
    }
}