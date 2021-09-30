public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int lastDigit = 0;
        int num = number;
        while(number != 0){
            lastDigit = number % 10;
            reverse *= 10;
            System.out.println("Reverse = " + reverse);
            reverse += lastDigit;
            System.out.println("Reverse = " + reverse);
            number /= 10;
        }
        if(num == reverse){
            return true;
        }

        return false;

    }
}
