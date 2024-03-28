import java.util.LinkedList;

public class TaskList1 {
    private LinkedList<Task> daftarTugas;

    // Konstruktor untuk inisialisasi LinkedList
    public TaskList1() {
        daftarTugas = new LinkedList<>();
    }

    // Metode untuk menambahkan tugas ke dalam daftar
    public void tambahTugas(Task tugas) {
        daftarTugas.add(tugas);
    }

    // Metode untuk menghapus tugas dari daftar berdasarkan indeks
    public void hapusTugas(int index) {
        if (index >= 0 && index < daftarTugas.size()) {
            daftarTugas.remove(index);
        } else {
            System.out.println("Indeks tugas tidak valid.");
        }
    }

    // Metode untuk menampilkan daftar tugas
    public void tampilkanDaftarTugas() {
        if (daftarTugas.isEmpty()) {
            System.out.println("Daftar tugas kosong.");
        } else {
            System.out.println("Daftar Tugas:");
            for (int i = 0; i < daftarTugas.size(); i++) {
                System.out.println("Tugas " + (i+1) + ":\n" + daftarTugas.get(i));
            }
        }
    }
        public static void main(String[] args) {
            // Membuat objek TaskList
            TaskList taskList = new TaskList();
    
            // Menambahkan beberapa tugas ke dalam daftar
            taskList.tambahTugas(new Task("Membuat makalah", "Persiapan untuk kumpul makalah"));
            taskList.tambahTugas(new Task("Menyelesaikan laporan", "Laporan mingguan harus diserahkan hari ini"));
    
            // Menampilkan daftar tugas
            taskList.tampilkanDaftarTugas();
    
            // Menghapus tugas pertama dari daftar
            taskList.hapusTugas(0);
    
            // Menampilkan daftar tugas setelah penghapusan
            taskList.tampilkanDaftarTugas();
        }
}
