public class Solution {
    public int reverse(int x) {
        // Initialize a long variable to store the reversed integer
        long res = 0;

        // Continue the loop until x becomes 0
        while (x != 0) {
            // In each iteration, multiply the current result by 10 and add the last digit
            // of x
            res = res * 10 + x % 10;
            // Remove the last digit from x
            x /= 10;
        }

        // Check if the reversed integer is within the range of int
        if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
            // If it's not, return 0
            return 0;
        }
        // If it is, return the result as an int
        return (int) res;
    }
}