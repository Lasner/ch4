/**
 * Created by Lauri on 21.10.2016.
 */
public class ch4 {
    static int aasta = 2016;
    static int kuupäev = 21;
    static String päev = "Reede";
    static String kuu = "Oktoober";

    public static void newLine() {
        System.out.println();
    }

    public static void printAmerican(int aasta, int kuupäev, String päev, String kuu) {
        System.out.print(päev + ", " + kuu + " " + kuupäev + ", " + aasta);
    }

    public static void printEuropean(int aasta, int kuupäev, String päev, String kuu) {
        System.out.print(päev + " " + kuupäev + " " + kuu + " " + aasta);
    }

    public static void main(String[] args) {
        System.out.print("Kuupäev ameerika formaadis: ");
        newLine();
        printAmerican(aasta, kuupäev, päev, kuu);
        newLine();
        System.out.println("Kuupäev euroopa formaadis:");
        printEuropean(aasta, kuupäev, päev, kuu);
    }
}
