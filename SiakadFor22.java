import java.util.Scanner;
public class SiakadFor22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100;
        int lulus = 0, tidakLulus = 0;

        for (int i = 1; i <= 10; i++) {
           System.out.print("Masukkan nilai mahasiswa ke-" + i + ":"); 
           nilai = sc.nextDouble();
           if (nilai > tertinggi) {
               tertinggi = nilai; 
           }
           if (nilai < terendah) {
               terendah = nilai;
           }
           if (nilai >= 60) {
            lulus++;
           } else {
            tidakLulus++;
           }
        }

        System.out.println("Nilai tertinggi\t\t\t: " + tertinggi);
        System.out.println("Nilai terendah\t\t\t: " + terendah);
        System.out.println("Jumlah Mahasiswa Lulus\t\t: " + lulus);
        System.out.println("Jumlah Mahasiswa Tidak Lulus\t: " + tidakLulus);
    }
}