/*
 * Nama:Moh.arif prasetyo
 * Nim : 23215043
 * Prodi : Teknik Informatika
 */
package pertemuan5;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class GantiKata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input kalimat dari pengguna
        System.out.println("====Program Mengganti Kata====");
        System.out.print("Masukkan Kalimat: ");
        String kalimat = scanner.nextLine();

        // Meminta kata yang ingin diganti
        System.out.print("Ganti Kata: ");
        String gantiKata = scanner.nextLine();

        // Meminta kata pengganti
        System.out.print("Menjadi Kata: ");
        String menjadiKata = scanner.nextLine();

        // Mengganti kata dalam kalimat
        String kalimatBaru = kalimat.replace(gantiKata, menjadiKata);

        // Menampilkan hasil
        System.out.println("====Hasil Formatting====");
        System.out.println("Kalimat awal : " + kalimat);
        System.out.println("Kalimat baru : " + kalimatBaru);

        scanner.close();
    }
}
