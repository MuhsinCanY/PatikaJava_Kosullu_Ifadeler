package KosulluIfadeler;
import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        double n1,n2;
        int select;
        Scanner inp = new Scanner(System.in);

        System.out.print("1.Sayı : ");
        n1 = inp.nextDouble();
        System.out.print("2.Sayı : ");
        n2 = inp.nextDouble();

        System.out.print("1-Toplama \n2-Çıkartma \n3-Çarpma \n4-Bölme \nSeçiminiz :");

        select = inp.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplam : " + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkartma : " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpma : " + (n1 * n2));
                break;
            case 4:
                if (n2 == 0) {
                    System.out.println("Tanımsız");
                } else {
                    System.out.println("Bölme : " + (n1 / n2));
                }
                break;
            default:

                System.out.println("Yanlış Seçim Yaptınız.");

        }
    }
}
