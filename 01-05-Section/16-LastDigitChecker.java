public class LastDigitChecker {
    public static boolean hasSameLastDigit(int x, int y, int z){
        if(x < 10 || x > 999 || y < 10 || y > 999 || z < 10 || z > 999)
            return false;
        return ((x % 10 == y % 10) || (x % 10 == z % 10) || (y % 10 == z % 10));
    }
}
