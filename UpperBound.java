import java.util.*;

public class UpperBound {

    public int upperBound(int[] arr, int n, int x) {
        int low = 0;
        int high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the value of target element: ");
        int x = sc.nextInt();

        Arrays.sort(arr); 

        UpperBound lb = new UpperBound();
        int result = lb.upperBound(arr, n, x);

        if (result == n) {
            System.out.println("No element greater than or equal to " + x + " found.");
        } else {
            System.out.println("The first element greater than or equal to " + x + " is at index: " + result);
        }
        sc.close();
    }
}

