import java.util.Arrays;

class SumEvenAfterQueries {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};

        int[][] queries = {
            {1, 0},
            {-3, 1},
            {-4, 0},
            {2, 3}
        };

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {

            int val = queries[i][0];
            int index = queries[i][1];

            nums[index] = nums[index] + val;

            int sum = 0;

            for (int j = 0; j < nums.length; j++) {

                if (nums[j] % 2 == 0) {
                    sum = sum + nums[j];
                }
            }

            ans[i] = sum;
        }

        System.out.println(Arrays.toString(ans));
    }
}