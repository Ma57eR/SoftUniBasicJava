package CodingBat.Logic;

import java.util.*;

public class in1To10 {
    public static void main(String[] args) {
        /*The first line contains an integer,  (the number of test cases).

        The  subsequent lines each describe a test case in the form of  space-separated integers:
        The first integer specifies the condition to check for 1 ( for Odd/Even,  2 for Prime, or 3 for Palindrome). The second integer denotes the number to be checked.
*/      int target = 6;
        int[] nums = new int[3];
        nums[0] = 3;
        nums[1] = 2;
        nums[2] = 3;
        int[] arr = new int[2];
        for(int i = 0; i < nums.length-1; i++){
                for (int j = i+1; j < nums.length; j++) {

            if(nums[i] + nums[j] == target){
                arr[0] = i;
                arr[1] = j;
                break;
            }
            }
        }
    }
}
