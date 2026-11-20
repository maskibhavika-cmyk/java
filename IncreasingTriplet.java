class IncreasingTriplet {
    public static boolean increasingTriplet(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                for (int k = j + 1; k < nums.length; k++) {

                    if (nums[i] < nums[j] && nums[j] < nums[k]) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] nums = {2, 1, 5, 0, 4, 6};

        System.out.println(increasingTriplet(nums));
    }
}