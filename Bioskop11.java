import java.util.Scanner;
public class Bioskop11 {  
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalTiketTerjual = 0;
        double totalPenjualan = 0;
        int hargaTiket = 50000;
        int jumlahTiket;
        double diskon = 0;
        double subtotal;
    while (true) {
        System.out.println("Masukkan jumlah tiket yang di beli (ketuk 0 untuk selesai)");
        jumlahTiket = sc.nextInt() ;
        if (jumlahTiket< 0 ) {
            System.out.println("INput tidak valid,masukkan jumlah tiket yang benar ");
        }
    if (jumlahTiket == 0){
        break;
    }
    subtotal = jumlahTiket *hargaTiket;
    subtotal = 0;
    if (jumlahTiket> 10) {
        diskon = 0.15;
    } else if (jumlahTiket > 4) {
        diskon = 0.10 ;
    }
    double totalBayar = subtotal - (subtotal*diskon);
    totalTiketTerjual += jumlahTiket ;
    totalPenjualan += totalBayar ;
    System.out.println("Total yang harus dibayar : RP"+totalBayar);
      }
      System.out.println ("\n-- Rekap Penjualan Tiket Hari ini __");
      System.out.println ("Total tiket terjual :" + totalTiketTerjual);
      System.out.println ("Total pendapatan penjualan : Rp"+totalPenjualan);
    }
}

    