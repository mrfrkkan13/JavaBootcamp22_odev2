package reCApDemo_CLasses;

public class DortIslem {
    public static int topla(int... sayi){
        int toplam=0;
        for(int sayilar:sayi){
            toplam=toplam+sayilar;
            }
        return toplam;
    }

    public static int cikar(int sayi1,int sayi2){
        return (sayi1-sayi2);
    }

    public static int carp(int sayi1,int sayi2){
        return (sayi1*sayi2);
    }

    public static int bol(int sayi,int sayi2){
        if(sayi2==0){
            System.out.println("hatalı sayı girişi");
        }
        return (sayi/sayi2);
    }
}
