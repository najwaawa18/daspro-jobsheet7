import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int jenis, durasi, total = 0;

      int tarifParkirmotor = 2000;
      int tarifParkirmobil = 3000;


    do {
        System.out.print("Masukkan jenis kendaraan (1=Mobil, 2=Motor, 0=Keluar): ");
        jenis = sc.nextInt();

        if (jenis == 0) {
            break;
        }

        if (jenis !=1 && jenis !=2) {
            System.out.println("Jenis kendaraan tidak valid!");
            continue;
        }

        System.out.print("Masukkan durasi parkir (jam): ");
        durasi = sc.nextInt();

        if (durasi > 5) {
            total += 12500;
        } else if (jenis == 1 ) {
            total += durasi * tarifParkirmobil;
        } else if (jenis == 2 ) {
            total += durasi * tarifParkirmotor;
        }
    } while (true);
    
    System.out.println("Total Pembayaran parkir hari ini: Rp " + total);
    }
    
}
