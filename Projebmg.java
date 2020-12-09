package projebmg;

import java.util.ArrayList;
import java.util.Scanner;

public class Projebmg {

    public static void main(String[] args) {

        
        Scanner klavye = new Scanner(System.in);

        System.out.println("Kaç kişi gireceksiniz? ");
        int n = klavye.nextInt();

        ArrayList<String> kullanicilar = new ArrayList<String>();
        System.out.println("Lütfen isim-soyisim bilgisini birleşik giriniz!");
        System.out.println("İsim Soyisim giriniz:  ");
        for (int i = 0; i < n; i++) {
            kullanicilar.add(klavye.next());
        }
        System.out.println("Kullanıcı Listesi ");
        for (int j = 0; j < n; j++) {
            System.out.println(kullanicilar.get(j));
        }
        System.out.println("Nereye kullanıcı eklemek istiyorsunuz?");
        int ara = klavye.nextInt();
        System.out.println("Listeye Kimi Eklemek İstiyorsunuz? ");
        String eleman = klavye.next();

        kullanicilar.add(ara - 1, eleman);
         System.out.println("Listenin Son Hali :");
        for (int k = 0; k < kullanicilar.size(); k++) {
            System.out.println(kullanicilar.get(k));
        }


        System.out.println("Listedeki Kaçıncı Elemanı Silmek İstiyorsunuz ?");

        int sil = klavye.nextInt();
        kullanicilar.remove(sil - 1);

        System.out.println("Listenin " + sil + (". Elemanı Silindi"));
        System.out.println("Listenin Son Hali :");
        for (int k = 0; k < kullanicilar.size(); k++) {
            System.out.println(kullanicilar.get(k));
        }

       
    }

}
