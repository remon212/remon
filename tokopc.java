import java.util.Scanner;

public class tokopc{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukan nama barang");
        String namabarang = input.nextLine();
        System.out.println( "harga barang");
        double hargabarang = input.nextDouble();
        System.out.println("jumlah beli");
        double jumlahbeli = input.nextDouble();
        double total = hargabarang*jumlahbeli;
        double dislon = 0.1*total;
        System.out.println("masukan pembayaran:");
        double bayar=input.nextDouble();
        double kembalian = bayar -(total-dislon);
        System.out.println("total:" +total);
        System.out.println("doskon:" + bayar);
        System.out.println("bayar:" + bayar);
        System.out.println("kembalian" + kembalian);




    }
}