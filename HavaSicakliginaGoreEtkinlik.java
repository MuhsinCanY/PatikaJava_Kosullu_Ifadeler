package KosulluIfadeler;
import java.util.Scanner;
public class HavaSicakliginaGoreEtkinlik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double heat;
        boolean t = true;


        while(t) {
            System.out.print("Sıcaklık Giriniz : ");
            heat = input.nextDouble();

            if (heat > 25) {
                System.out.println("Yüzme yapabilirsiniz.");
            } else if (heat > 15) {
                System.out.println("Piknik yapabilirsiniz.");
            } else if (heat > 10) {
                System.out.println("Yüzme yapabilirsiniz veya Sinemaya gidebilirsiniz.");
            } else {
                System.out.println("Kayak yapabilirsiniz.");
            }
        }
    }
}
