package KosulluIfadeler;
import java.util.Objects;
import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String user , pass;

        System.out.println("Kullanıcı adı ");
        user = inp.nextLine();
        System.out.println("Parola ");
        pass = inp.nextLine();

        if(user.equals("pat") && pass.equals("123")){
            System.out.println("Giriş yapıldı");
        }else {
            System.out.println("Giriş yapılamadı");
            if(!pass.equals("123") && user.equals("pat")){
                System.out.println("Sıfırlamak istermisin evet-y hayır-n");
                //int ve string inputlarının arka arkaya gelmesinden kaynaklanan sorunu öğrendim ve çözdüm
                String karar = inp.nextLine();
                if(karar.equals("y")){
                    System.out.println("yeni şifre girin");
                    String newpass = inp.nextLine();
                    if(newpass.equals("123")){
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    }else{
                        System.out.println("Şifre oluşturuldu");
                        pass=newpass;
                    }
                }
            }
        }
    }
}
