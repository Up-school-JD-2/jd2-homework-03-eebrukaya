package org.java.project.tahminoyunu;

import java.util.Scanner;

public class SayiTahminOyunu {

    public static void main(String[] args) {

        int[] count = new int[2];
        int[] kullaniciTahmini = new int[2];
        boolean ilkKullaniciDurum = true, ikinciKullaniciDurum = true;
        double randomWithRange = randomWithRange(0, 100);
        randomWithRange = Math.ceil(randomWithRange);

        while (ilkKullaniciDurum || ikinciKullaniciDurum) {
            Scanner scanner = new Scanner(System.in);
            if (ilkKullaniciDurum) {
                System.out.print("0 ile 100 arasında bir tam sayı giriniz: ");
                kullaniciTahmini[0] = scanner.nextInt();
                count[0]++;
                if (kullaniciTahmini[0] == randomWithRange) {
                    ilkKullaniciDurum = false;
                }
            }
            if (ikinciKullaniciDurum) {
                System.out.print("0 ile 100 arasında bir tam sayı giriniz: ");
                kullaniciTahmini[1] = scanner.nextInt();
                count[1]++;
                if (kullaniciTahmini[1] == randomWithRange) {
                    ikinciKullaniciDurum = false;
                }
            }
        }

        if (count[0] < count[1]) {
            System.out.println("1. kullanıcının tahmin sayısı: " + count[0] + "\n"
                    + "2. kullanıcının tahmin sayısı: " + count[1] + "\n" + "Kazanan 1. Kullanıcı !");
        } else if (count[1] < count[0]) {
            System.out.println("1. kullanıcının tahmin sayısı: " + count[0] + "\n"
                    + "2. kullanıcının tahmin sayısı: " + count[1] + "\n" + "Kazanan 2. Kullanıcı !");
        } else {
            System.out.println("1. kullanıcının tahmin sayısı: " + count[0] + "\n"
                    + "2. kullanıcının tahmin sayısı: " + count[1] + "\n" + "Berabere!");
        }
    }

    static double randomWithRange(int min, int max) {
        double range = (max - min) + 1;
        return (Math.random() * range) + min;
    }

}
