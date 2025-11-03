import java.util.Scanner;

public class ekspedisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double biaya = 0, volume, panjang, tinggi, lebar, jarak, berat, biayaakhir = 0;
        System.out.println("Masukan jarak: ");
        jarak = input.nextDouble();

        System.out.println("Masukan panjang sisi paket: ");
        panjang = input.nextDouble();
        System.out.println("Masukan tinggi sisi paket: ");
        tinggi = input.nextDouble();
        System.out.println("Masukan lebar sisi paket: ");
        lebar = input.nextDouble();
        System.out.println("Masukan berat paket dalam kg: ");
        berat = input.nextDouble();
        volume = panjang * tinggi * lebar;

        if (jarak <= 10) {
            biaya = 4250 * berat;
        } else {
            biaya = 6000 * berat;
        }
        if (volume >= 100) {
            biayaakhir = biaya + 50000;
        }

        else {
            biayaakhir = biaya;
        }

        System.out.println("Total biaya akhir: Rp. " + biayaakhir);
        input.close();
    }
}
