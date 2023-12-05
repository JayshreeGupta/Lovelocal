
import java.util.*;
// import java.util.ArrayList;
// import java.util.List;

public class Main {
    public static List<Integer> majorityElements(int[] nums) {
        List<Integer> result = new ArrayList<>();

        if (nums == null || nums.length == 0) {
            return result;
        }

        int candidate1 = 0, candidate2 = 0, count1 = 0, count2 = 0;

        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;
 for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            }
        }

        int n = nums.length;

        if (count1 > n / 3) {
            result.add(candidate1);
        }
        if (count2 > n / 3 && candidate1 != candidate2) {
            result.add(candidate2);
        }

        return result;
    }

      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the size of the array: ");
            int size = sc.nextInt();

            int[] nums = new int[size];

            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < size; i++) {
                nums[i] = sc.nextInt();
            }

            System.out.println("Result: " + majorityElements(nums));
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please provide valid integers.");
        } finally {
            sc.close();
    }
 }
}