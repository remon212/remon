import java.util.Scanner;

public class Suhu{
    public static void main(String[] args) {
        Scanner input = new scanner(System.in);
        System.out.println("Masukan Nilai Celcius: ");
        double NilaiCelcius = input.nextDouble();
        System.out.println("1.Reamur");
        System.out.println("2.Fahrenheit");
        System.out.println("Pilih yang akan dikonversi: ");
        int Pilihan = input.nextInt();

        double hasil;
        switch(Pilihan){
            case 1:
                hasil = 0.8 * NilaiCelcius;
                System.out.println("Nilai Reamur" +NilaiCelcius);
            case 2:
            //ulangi pakek rumus fahrenheit
        }

    }
}