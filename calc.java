import java.util.Scanner;

public class calc {
public static void main(String[] args) {
    Scanner calcscanner1 = new Scanner(System.in);
    System.out.println("1. Sayıyı giriniz: ");
    double sayi1 = calcscanner1.nextDouble();
    System.out.println("2.Sayıyı giriniz:  ");  
    double sayi2 = calcscanner1.nextDouble();
    calc machine = new calc();
    System.out.println("Hangi işlemi yapmak istediğinizi seçiniz:  ");
    System.out.println("1-> Toplama");
    System.out.println("2 -> Çıkarma");
    System.out.println("3 -> Çarpma");
    System.out.println("4 -> Bölme");
    int islem = calcscanner1.nextInt();
    
    if (islem == 1){
        double sonuc = machine.topla(sayi1, sayi2);
        System.out.println("Sonuç: "+sonuc);
    }
    if (islem == 2){
        double sonuc = machine.cikar(sayi1,sayi2);
        System.out.println("Sonuç:"+sonuc);
    }
    if (islem == 3){
        double sonuc = machine.carp(sayi1,sayi2);
        System.out.println("Sonuç:"+sonuc);
    }
    if (islem == 4){
        double sonuc = machine.bol(sayi1,sayi2);
        System.out.println("Sonuç:"+sonuc);
    }
    calcscanner1.close();
    }
public double topla(double sayi1, double sayi2){
    return sayi1+sayi2;
}
public double cikar(double sayi1, double sayi2){
    return sayi1-sayi2;
}
public double carp(double sayi1, double sayi2){
    return sayi1*sayi2;
}
public double bol(double sayi1, double sayi2){
     if (sayi2 == 0){
        System.err.println("Sıfıra bölme yapılamaz!!");
        return Double.NaN;
    }
    return sayi1/sayi2;
}
}