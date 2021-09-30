import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        long average = 0;
        int count = 0;
        while(true){
            count++;
            System.out.println("Enter number: ");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt) {
                int number = scanner.nextInt();

                sum += number;
                average = Math.round((double) sum/count);

            } else break;

            }

        System.out.println("SUM = " + sum + " AVG = " + average);

    }
}
