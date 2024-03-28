import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        boolean jalan = true;
        Scanner scanner = new Scanner(System.in);
        boolean strukturDipilih = false;
        String[] strukturData = {"LinkedList", "Stack", "Queue"};
        String strukturTerpilih = "Tidak Ada";
        byte pilihan = 0;
        while (jalan) {
            System.out.println("\nAplikasi Pengelolaan Tugas - Kelompok 5");
            System.out.println("Menu:");
            System.out.println("Struktur Data : " + strukturTerpilih);
            System.out.println("1. Pilih Struktur Data");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Tambah Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Keluar");
            System.out.print("Pilih : ");
            try {
                pilihan = scanner.nextByte();
            } catch (InputMismatchException e) {
                System.out.println("\nInput tidak valid!");
                scanner.nextLine();
                continue;
            }
            switch (pilihan) {
                case 1:
                    System.out.println("\nPilih Struktur Data");
                    System.out.println("1. Linked List");
                    System.out.println("2. Stack");
                    System.out.println("3. Queue");
                    try {
                        byte pilihStruktur = scanner.nextByte();
                        if (pilihStruktur == 1) {
                            strukturDipilih = true;
                            strukturTerpilih = strukturData[0];
                            System.out.println("Aku LinkedList");
                        } else if (pilihStruktur == 2) {
                            strukturDipilih = true;
                            strukturTerpilih = strukturData[1];
                            System.out.println("Aku Stack");
                        } else if (pilihStruktur == 3) {
                            strukturDipilih = true;
                            strukturTerpilih = strukturData[2];
                            System.out.println("Aku Queue");
                        } else {
                            System.out.println("Input tidak valid!");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Input tidak valid!");
                    }
                    break;
                case 2:
                    if (!strukturDipilih) {
                        System.out.println("\nPilih Struktur Data terlebih dahulu!");
                    } else {
                        System.out.println("\nAku tampil " + strukturTerpilih);
                    }
                    break;
                case 3:
                    if (!strukturDipilih) {
                        System.out.println("\nPilih Struktur Data terlebih dahulu!");
                    } else {
                        System.out.println("\nAku tambah " + strukturTerpilih);
                    }
                    break;
                case 4:
                    if (!strukturDipilih) {
                        System.out.println("\nPilih Struktur Data terlebih dahulu!");
                    } else {
                        System.out.println("\nAku hapus " + strukturTerpilih);
                    }
                    break;
                case 5:
                    jalan = false;
                    System.out.println("\nTerima Kasih!");
                    break;
                default:
                    System.out.println("Input tidak valid!");
                    break;
            }
        }
        scanner.close();
    }
}
