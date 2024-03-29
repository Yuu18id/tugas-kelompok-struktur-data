import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        TaskList taskList = null;
        TaskList1 taskList1 = null;
        Stack stack = null;
        boolean jalan = true;
        Scanner scanner = new Scanner(System.in);
        boolean strukturDipilih = false;
        String[] strukturData = { "LinkedList", "Stack", "Queue" };
        String strukturTerpilih = "Tidak Ada";
        byte pilihan = 0;
        while (jalan) {
            System.out.println("\nAplikasi Pengelolaan Tugas - Kelompok 5");
            System.out.println("Struktur Data : " + strukturTerpilih);
            System.out.println("Menu:");
            if (strukturDipilih) {
                System.out.println("1. Ganti Struktur Data");    
            } else {
                System.out.println("1. Pilih Struktur Data");
            }
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Tambah Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Keluar");
            System.out.print("Pilih : ");
            try {
                pilihan = scanner.nextByte();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("\nInput tidak valid!");
                scanner.nextLine();
                continue;
            }
            switch (pilihan) {
                case 1:
                    System.out.println("\nPilih Struktur Data");
                    if (strukturDipilih) {
                        System.out.println("\nGanti Struktur Data");
                        System.out.println("PERINGATAN! DATA TUGAS DARI STRUKTUR DATA SEBELUMNYA AKAN TERHAPUS");    
                    } else {
                        System.out.println("\nPilih Struktur Data");
                    }
                    System.out.println("1. Linked List");
                    System.out.println("2. Stack");
                    System.out.println("3. Queue");
                    System.out.print("Pilih : ");
                    try {
                        byte pilihStruktur = scanner.nextByte();
                        scanner.nextLine();
                        if (pilihStruktur == 1) {
                            strukturDipilih = true;
                            strukturTerpilih = strukturData[0];
                            taskList1 = new TaskList1();
                            taskList1.tambahTugas(new Task("Membuat makalah", "Deskripsi membuat makalah"));
                            taskList1.tambahTugas(new Task("Menyelesaikan laporan", "Deskripsi menyelesaikan laporan"));
                        } else if (pilihStruktur == 2) {
                            strukturDipilih = true;
                            strukturTerpilih = strukturData[1];
                            stack = new Stack(100);
                            stack.push(new Task("Menyelesaikan tugas harian", "Deskripsi tugas harian"));
                            stack.push(new Task("Membuat logbook harian", "Deskripsi logbook harian"));
                            stack.push(new Task("Mengerjakan proyek tugas akhir", "Deskripsi proyek tugas akhir"));
                        } else if (pilihStruktur == 3) {
                            strukturDipilih = true;
                            strukturTerpilih = strukturData[2];
                            taskList = new TaskList();
                            taskList.addTask(new Task("Menyelesaikan tugas harian", "Deskripsi tugas harian"));
                            taskList.addTask(new Task("Membuat logbook harian", "Deskripsi logbook harian"));
                            taskList.addTask(
                                    new Task("Mengerjakan proyek tugas akhir", "Deskripsi proyek tugas akhir"));
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
                    } else if (strukturTerpilih == strukturData[0]) {
                        taskList1.tampilkanDaftarTugas();
                    } else if (strukturTerpilih == strukturData[1]) {
                        stack.printStack();
                    } else if (strukturTerpilih == strukturData[2]) {
                        taskList.displayTasks();
                    }
                    break;
                case 3:
                    if (!strukturDipilih) {
                        System.out.println("\nPilih Struktur Data terlebih dahulu!");
                    } else {
                        System.out.print("Masukkan Judul Tugas\t\t: ");
                            String judul = scanner.nextLine();
                            System.out.print("Masukkan Deskripsi Tugas\t: ");
                            String deskripsi = scanner.nextLine();
                        if (strukturTerpilih == strukturData[0]) {
                            
                            Task task = new Task(judul, deskripsi);
                            taskList1.tambahTugas(task);
                        } else if (strukturTerpilih == strukturData[1]) {
                            Task task = new Task(judul, deskripsi);
                            stack.push(task);
                        } else if (strukturTerpilih == strukturData[2]) {
                            Task task = new Task(judul, deskripsi);
                            taskList.addTask(task);
                        }
                    }

                    break;
                case 4:
                    if (!strukturDipilih) {
                        System.out.println("\nPilih Struktur Data terlebih dahulu!");
                    } else if (strukturTerpilih == strukturData[0]) {
                        System.out.print("Masukkan index data : ");
                        byte hapusIndex = scanner.nextByte();
                        scanner.nextLine();
                        taskList1.hapusTugas(hapusIndex);
                    } else if (strukturTerpilih == strukturData[1]) {
                        stack.pop();
                    } else if (strukturTerpilih == strukturData[2]) {
                        taskList.removeTask();
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
