class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int freqElement = 0; //also called candidate due to the "Voting"

        // Boyer-Moore Voting Algorithm
        // if an element is greater than n/2 than it has the most element
        // count is incremented based on how many times a freqElement is seen
        // and decremented if it is not the same element being checked.
        for (int num : nums) {
            if (count == 0) {
                freqElement = num;
            }
            count += (num == freqElement)? 1 : -1;
        }

        // Return the freqElement
        return freqElement;
    }
}