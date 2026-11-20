import java.util.Arrays;

class LargestPerimeterTriangle {

    public static int largestPerimeter(int[] nums) {

        Arrays.sort(nums);

        for (int i = nums.length - 1; i >= 2; i--) {

            if (nums[i] < nums[i - 1] + nums[i - 2]) {

                return nums[i] + nums[i - 1] + nums[i - 2];
            }
        }

        return 0;
    }

    public static void main(String[] args) {

        int[] nums = {3, 6, 2, 3};

        System.out.println(largestPerimeter(nums));
    }
}