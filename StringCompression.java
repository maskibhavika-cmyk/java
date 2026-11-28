

public class StringCompression {
    public static void main(String[] args) {

        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};

        int count = 1;

        String result = "";

        for (int i = 0; i < chars.length; i++) {

            if (i + 1 < chars.length && chars[i] == chars[i + 1]) {
                count++;
            }

            else {
                result = result + chars[i];

                if (count > 1) {
                    result = result + count;
                }

                count = 1;
            }
        }

        System.out.println(result);
    }
}
