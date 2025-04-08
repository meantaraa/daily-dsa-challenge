import java.util.*;

public class IterativeSearch {

    public static int binarysearch(int[] nums, int target) {

        int n = nums.length;
        int low = 0;
        int high = n-1;

        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] == target) return mid;
            else if (target > nums[mid]) low = mid+1;
            else high = mid -1;
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter the target element to search: ");
        int target = sc.nextInt();

        int result = binarysearch(nums, target);

        if(result == -1) System.out.println("Element not found in the array.");
        else System.out.println("Element found at index: " + result);

        sc.close();
    }
    
}