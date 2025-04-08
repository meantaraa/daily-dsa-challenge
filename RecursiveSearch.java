import java.util.Scanner;

public class RecursiveSearch {
    public static int binarySearch(int[] nums, int low, int high, int target) {
        if (low > high) return -1;

        int mid = (low + high) / 2;
        if (nums[mid] == target) return mid;
        else if (target > nums[mid]) 
            return binarySearch(nums, mid + 1, high, target);
        else 
            return binarySearch(nums, low, mid - 1, target);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter " + n + " sorted integers:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("Enter the target value to search: ");
        int target = scanner.nextInt();

        int result = binarySearch(nums, 0, nums.length - 1, target);

        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found in the array.");
        }

        scanner.close();
    }
}
