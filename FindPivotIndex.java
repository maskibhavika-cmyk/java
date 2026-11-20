class FindPivotIndex {
    public static void main(String[] args) {

        int[] nums = {1, 7, 3, 6, 5, 6};

        int totalSum = 0;

        for (int i = 0; i < nums.length; i++) {
            totalSum = totalSum + nums[i];
        }

        int leftSum = 0;

        for (int i = 0; i < nums.length; i++) {

            int rightSum = totalSum - leftSum - nums[i];

            if (leftSum == rightSum) {
                System.out.println(i);
                return;
            }

            leftSum = leftSum + nums[i];
        }

        System.out.println(-1);
    }
}