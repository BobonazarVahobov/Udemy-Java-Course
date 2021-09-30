public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {

        if (number < 0)
            return -1;
        int count = 0;
        int countEven = 0;

        while (number != 0) {
            count = number % 10;
            number /= 10;

            if (count % 2 == 0) {
                countEven += count;
            }
        }

        return countEven;
    }
}
