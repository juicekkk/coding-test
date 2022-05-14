package elevenst;

class Solution {

    public int solution(int N) {
        int sum = digitSum(N);
        int result = 0;

        int targetSum = Integer.MIN_VALUE;
        for (int i = N; i <= 50000; i++) {
            targetSum = digitSum(N);
            if (targetSum == sum) {
                result = i;
                break;
            }

        }

        return result;
    }

    public static int digitSum(int N) {
        int digitSum = 0;
        while (N != 0) {
            digitSum += N % 10;
            N /= 10;
        }
        return digitSum;
    }
}