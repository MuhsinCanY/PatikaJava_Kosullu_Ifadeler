package KosulluIfadeler;
import java.util.Scanner;
public class SinifiGecmeDurumu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mat,fiz,kim,toplam,k=3;

        System.out.print("Notlarınızı girin \nMatemakik : ");
        mat = input.nextInt();
        if(mat<0 || mat>100){
            k--;
            mat=0;
        }

        System.out.print("Fizik : ");
        fiz = input.nextInt();
        if(fiz<0 || fiz>100){
            k--;
            fiz = 0;
        }

        System.out.println("Kimya : ");
        kim = input.nextInt();
        if(kim<0 || kim>100){
            k--;
            kim=0;
        }

        toplam = mat + fiz + kim;
        double ort = toplam / k;

        System.out.println("Ortalamanız : " + ort);

        if(ort<55){
            System.out.println("Sınıfta Kaldın...");
        }else{
            System.out.println("Sınıfı Geçtin...");
        }
    }
}
