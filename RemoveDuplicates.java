class Solution {

    public static int removeDuplicates(int[] nums) {
        int k = 1;   // first element is always unique

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String args[]) {
        int[] nums = {1,1,2};

        int k = removeDuplicates(nums);

        System.out.println("k = " + k);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}