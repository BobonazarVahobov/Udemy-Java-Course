public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if(bigCount < 0 || smallCount < 0 || goal < 0) return false;

        if(goal > (bigCount*5) + smallCount)
            return false;

        return (smallCount >= goal % 5);

    }
}
