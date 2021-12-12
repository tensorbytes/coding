package week17;

/**
 * @Description
 * @Author weiyu
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2021/12/12 0012
 */
public class BinarySearch_35 {


    class Solution {
        public int searchInsert(int[] nums, int target) {
            int left = 0, right = nums.length - 1;
            int mid = 0;
            while (left <= right) {
                mid = (right + left) / 2;
                if (target == nums[mid]) {
                    return mid;
                } else if (target > nums[mid]) {
                    left = mid + 1;
                } else {
                    right = mid -1;
                }
            }
            return nums[mid]>target?mid:mid + 1;
        }

    }
}