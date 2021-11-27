import java.util.Arrays;

public class Test22 {
    public static void main(String[] args) {
        char[] chars = "abccbd".toCharArray();

        int[] C = new int[]{0,1,2,3,4,5};
        int n = chars.length;
        int j = 0;
        int k = 0;

        int sum = 0;

        for (int i = 1; i < n; i++) {

            if (chars[j] != chars[i]) {
                j++;
                chars[j] = chars[i];

            } else {
                if (C[k] < C[i])
                    sum = sum + C[k];
                else
                    sum = sum + C[i];
            }
            k++;
        }
        System.out.println(Arrays.copyOfRange(chars, 0, j + 1));
        System.out.println(sum);
    }
}
