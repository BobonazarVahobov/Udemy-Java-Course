public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int num1, int num2) {
        int gcd = 0;
        if (num1 < 10 || num2 < 10)
            return -1;

        int minNum = Math.min(num1, num2);

        for (int i = minNum; i >= 1; i--) {
            if ((num2 % i == 0) && (num1 % i == 0)) {
                gcd = i;
                return gcd;

            }
        }
        return gcd;
    }

}
