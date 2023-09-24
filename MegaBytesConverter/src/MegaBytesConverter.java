public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int kiloBytesRemainder = (kiloBytes % 1024);
        int megaBytes = (kiloBytes - kiloBytesRemainder) / 1024;

        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = "
                                + megaBytes + " MB and "
                                + kiloBytesRemainder + " KB");
        }
    }

//    public static void main(String[] args) {
//        printMegaBytesAndKiloBytes(5000);
//    }
}
