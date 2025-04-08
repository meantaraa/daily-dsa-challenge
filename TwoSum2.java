// import java.util.*;

// public class TwoSum2 {
//     public static int[] twoSum(int n, int[] arr, int target) {
//         int[] ans = new int[2];
//         ans[0] = ans[1] = -1;

//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 if (arr[i] + arr[j] == target) {
//                     ans[0] = i;
//                     ans[1] = j;
//                     return ans; 
//                 }
//             }
//         }
//         return ans;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the size of the array: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];
//         System.out.println("Enter the elements of the array:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.print("Enter the target sum: ");
//         int target = sc.nextInt();

//         int[] result = twoSum(n, arr, target);

//         if (result[0] != -1) {
//             System.out.println("Indices of the two numbers are: " + result[0] + " and " + result[1]);
//         } else {
//             System.out.println("No two numbers found with the given target sum.");
//         }

//         sc.close();
//     }
// }

import java.util.*;

public class TwoSum2 {

    public static int[] twoSum(int n, int[] arr, int target) {

        int[] ans = new int[2];
        ans[0] = ans[1] = -1;

        HashMap<Integer, Integer> mpp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int moreNeeded = target - num;
            if (mpp.containsKey(moreNeeded)) {
                ans[0] = mpp.get(moreNeeded);
                ans[1] = i;
                return ans;
            }

            mpp.put(arr[i], i);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();

        int[] result = twoSum(n, arr, target);

        if (result[0] != -1) {
            System.out.println("Indices of the two numbers are: " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No two numbers found with the given target sum.");
        }

        sc.close();
    }
}
