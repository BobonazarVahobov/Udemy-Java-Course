public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int megaBytes, remainingKiloBytes;
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            megaBytes = kiloBytes / 1024;
            remainingKiloBytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " +
                    megaBytes + " MB and " + remainingKiloBytes + " KB");
        }
    }
}
