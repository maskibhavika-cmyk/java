
class SecondSmallestNumber {
    public static void main(String[] args) {

        int arr[] = {10, 5, 20, 3, 8};

        int smallest = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < smallest) {
                second = smallest;
                smallest = arr[i];
            }
            else if (arr[i] < second && arr[i] != smallest) {
                second = arr[i];
            }
        }

        System.out.println(second);
    }
}
