import java.util.Scanner;
public class Parkir11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi;
        double total = 0;
do {
    System.out.println("Masukkan jenis kendaraan (1:mobil,2:motor,0:keluar):");
    jenis = sc.nextInt();
    if (jenis == 1 || jenis == 2){
        System.out.println("Masukan durasi paekir (jam):");
        durasi = sc.nextInt();
        if (jenis == 1){
            total += durasi *3000;
        } else {
            total += durasi *2000;
        }
    } else if (jenis !=0){
        System.out.println("Jenis kendaraan tidak valid.");
    }
} while (jenis !=0);
System.out.println("Total pendapatan perkir Rp " + total);
    }
}