class Solution {
    public int removeElement(int[] nums, int val) {
        int element = 0;
        for (int count = 0; count < nums.length; count++) {
            if (nums[count] != val) {
                nums[element] = nums[count];
                element++;
            }

        }
        return element;
    }
}