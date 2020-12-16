package projebmg;

import java.util.ArrayList;
import java.util.Scanner;

public class Projebmg {

    public static void main(String[] args) {
        while (1 == 1) {

            Scanner scan = new Scanner(System.in);

            int secim;

            System.out.println("*************************************");
            System.out.println("Menü:");
            System.out.println("Kullanıcı kaydı yapmak için 1 e basınız.");
            System.out.println("Ürün kaydı yapmak için 2 ye basınız.");
            System.out.println("Kategori kaydı yapmak için 3 e basınız.");
            System.out.println("Satış kaydı yapmak için 4 e basınız.");
            System.out.println("Çıkış yapmak istiyorsanız 0 a basınız.");

            secim = scan.nextInt();
            switch (secim){
            case 1:
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
            break;
            //*****************************************************************
            case 2:
                Scanner scan1 = new Scanner(System.in);

            System.out.println("Kaç ürün gireceksiniz? ");
            int k = scan1.nextInt();

            ArrayList<String> urunler = new ArrayList<String>();
            System.out.println("Lütfen ürün bilgisini birleşik giriniz!");
            System.out.println("Ürünün adını giriniz:  ");
            for (int i = 0; i < k; i++) {
                urunler.add(scan1.next());
            }
            System.out.println("Ürün Listesi ");
            for (int j = 0; j < k; j++) {
                System.out.println(urunler.get(j));
            }
            System.out.println("Nereye ürün eklemek istiyorsunuz?");
            int ara1 = scan1.nextInt();
            System.out.println("Listeye Hangi Ürünü Eklemek İstiyorsunuz? ");
            String eleman1 = scan1.next();

            urunler.add(ara1 - 1, eleman1);
            System.out.println("Listenin Son Hali :");
            for (int j = 0; j < urunler.size(); j++) {
                System.out.println(urunler.get(k));
            }

            System.out.println("Listedeki Kaçıncı Ürünü Silmek İstiyorsunuz ?");

            int sil1 = scan1.nextInt();
            urunler.remove(sil1 - 1);

            System.out.println("Listenin " + sil1 + (". Elemanı Silindi"));
            System.out.println("Listenin Son Hali :");
            for (int j = 0; j < urunler.size(); j++) {
                System.out.println(urunler.get(k));
            }
            break;
            //***********************************************************
            case 3:
                Scanner scan2 = new Scanner(System.in);

            System.out.println("Kaç kategori gireceksiniz? ");
            int m = scan2.nextInt();

            ArrayList<String> kategoriler = new ArrayList<String>();
            System.out.println("Lütfen kategori bilgisini birleşik giriniz!");
            System.out.println("Kategori adını giriniz:  ");
            for (int i = 0; i < m; i++) {
                kategoriler.add(scan2.next());
            }
            System.out.println("Kategori Listesi ");
            for (int j = 0; j < m; j++) {
                System.out.println(kategoriler.get(j));
            }
            System.out.println("Nereye kategori eklemek istiyorsunuz?");
            int ara2 = scan2.nextInt();
            System.out.println("Listeye Hangi Kategoriyi Eklemek İstiyorsunuz? ");
            String eleman2 = scan2.next();

            kategoriler.add(ara2 - 1, eleman2);
            System.out.println("Listenin Son Hali :");
            for (int j = 0; j < kategoriler.size(); j++) {
                System.out.println(kategoriler.get(m));
            }

            System.out.println("Listedeki Kaçıncı Kategoriyi Silmek İstiyorsunuz ?");

            int sil2 = scan2.nextInt();
            kategoriler.remove(sil2 - 1);

            System.out.println("Listenin " + sil2 + (". Elemanı Silindi"));
            System.out.println("Listenin Son Hali :");
            for (int j = 0; j < kategoriler.size(); j++) {
                System.out.println(kategoriler.get(m));
            }
                break;
            //***********************************************************
            case 4:
                Scanner scan3 = new Scanner(System.in);

            System.out.println("Kaç Satış gireceksiniz? ");
            int z = scan3.nextInt();

            ArrayList<String> satislar = new ArrayList<String>();
            System.out.println("Lütfen satış bilgisini birleşik giriniz!");
            System.out.println("Satışın adını giriniz:  ");
            for (int i = 0; i < z; i++) {
                satislar.add(scan3.next());
            }
            System.out.println("Satış Listesi ");
            for (int j = 0; j < z; j++) {
                System.out.println(satislar.get(j));
            }
            System.out.println("Nereye satış eklemek istiyorsunuz?");
            int ara3 = scan3.nextInt();
            System.out.println("Listeye Hangi Satışı Eklemek İstiyorsunuz? ");
            String eleman3 = scan3.next();

            satislar.add(ara3 - 1, eleman3);
            System.out.println("Listenin Son Hali :");
            for (int j = 0; j < satislar.size(); j++) {
                System.out.println(satislar.get(z));
            }

            System.out.println("Listedeki Kaçıncı Satışı Silmek İstiyorsunuz ?");

            int sil3 = scan3.nextInt();
            satislar.remove(sil3 - 1);

            System.out.println("Listenin " + sil3 + (". Elemanı Silindi"));
            System.out.println("Listenin Son Hali :");
            for (int j = 0; j < satislar.size(); j++) {
                System.out.println(satislar.get(z));
            }
                break;
            
            default:
                System.out.println("Çıkış....");
                break;
        }
        }
    }
    }
