public class TeenNumberChecker {
    public static boolean hasTeen(int num1, int num2, int num3){
        if((num1 > 12 && num1 < 20) || (num2 > 12 && num2 < 20) || (num3 > 12 && num3 < 20)){
         return true;
        } else
            return false;
    }

    public static boolean isTeen(int number){
        if(number > 12 && number < 20){
            return true;
        } else
            return false;
    }
}
