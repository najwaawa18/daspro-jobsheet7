import java.util.Scanner;
public class Tugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000;
        int totalTiket = 0;
        int tiket;
        double totalPenjualan = 0;
        double totalHarga;

        System.out.print("Masukkan Jumlah Pelanggan Hari Ini: ");
        int jumlahPelanggan = sc.nextInt();

        for (int i = 1; i <= jumlahPelanggan; i++) {
            while (true) {
                System.out.print("Masukkan jumlah tiket yang dibeli oleh pelanggan ke-" + i + ":");
                tiket = sc.nextInt();

                if (tiket < 0) {
                    System.out.println("Jumlah tiket tidak valid! Silahkan masukkan ulang.");                
                } else {
                    break;
                }              
            }
            totalHarga = tiket * hargaTiket;

            if (tiket > 10) {
                totalHarga *= 0.85;
            } else if (tiket > 4) {
                totalHarga *= 0.90;               
            }
        System.out.println("Total harga untuk pelanggan ke-" + i + ": Rp " + totalHarga);
        totalTiket += tiket;
        totalPenjualan += totalHarga;
        } 
        System.out.println("\n=== LAPORAN PENJUALAN HARIAN ===");
        System.out.println("Total tiket terjual : " + totalTiket);
        System.out.println("Total Penjualan   : " + totalPenjualan);
    } 
}
