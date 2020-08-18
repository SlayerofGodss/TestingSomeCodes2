import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Ters Çevirmek İStediğiniz Sayıyı Girin: ");
        int sayi1 = reader.nextInt();
        int tersi = 0;
        int yedek = sayi1;
        while (sayi1 != 0) {
            int basamak = sayi1 % 10;
            tersi = tersi * 10 + basamak;
            sayi1 /= 10;
        }
        //System.out.println("Sayının         :" + yedek);
        System.out.println("Sayının Tersi: " + tersi);
    }
}
