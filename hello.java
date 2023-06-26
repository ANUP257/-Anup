package basic;
import java.util.Scanner;

public class hello {
	
	 public static void moveZeroes(int[] nums) {
	        int n = nums.length;
	        int left = 0; // Pointer for non-zero elements

	        // Iterate through the array
	        for (int i = 0; i < n; i++) {
	            if (nums[i] != 0) {
	                // If the current element is non-zero, swap it with the element at the left pointer
	                int temp = nums[i];
	                nums[i] = nums[left];
	                nums[left] = temp;
	                left++;
	            }
	        }
	    }

	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user for the length of the array
	        System.out.print("Enter the length of the array: ");
	        int length = scanner.nextInt();

	        int[] nums = new int[length];

	        // Prompt the user to enter the elements of the array
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < length; i++) {
	            nums[i] = scanner.nextInt();
	        }

	        // Call the moveZeroes function
	        moveZeroes(nums);

	        // Print the resulting array
	        System.out.println("Resulting array:");
	        for (int num : nums) {
	            System.out.print(num + " ");
	        }
	    }
	}
