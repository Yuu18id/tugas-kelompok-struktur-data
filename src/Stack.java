public class Stack {
    // Atribut Stack
    int max, top;
    String[] arr;

    // Constructor Stack
    public Stack(int maxSize) {
        this.max = maxSize;
        this.arr = new String[maxSize];
        this.top = -1;
    }

    // Cek apakah tugas telah penuh
    boolean isFull() {
        return (max - 1 == top);
    }

    // Cek apakah tugas kosong
    boolean isEmpty() {
        return (top == -1);
    }

    // Melihat tugas terakhir yang ditambahkan
    void peek() {
        System.out.println("Tugas terakhir : " + arr[top]);
    }

    // Menambahkan tugas
    void push(String value) {
        if (isFull()) {
            System.out.println("Gagal menambahkan tugas karena list tugas telah penuh");
        } else {
            top++;
            arr[top] = value;
            System.out.println(value + " telah ditambahkan dalam tugas");
        }
    }

    // Menghapus tugas paling baru
    void pop() {
        if (isEmpty()) {
            System.out.println("Gagal menghapus tugas karena tidak ada tugas yang tersedia");
        } else {
            top--;
        }
    }

    // Mencetak hasil ke konsol
    void printStack() {
        // Cek apakah tugas kosong atau tidak
        // Kalau kosong tampilkan pesan pada konsol
        if (isEmpty()) {
            System.out.println("Hore!!! Tidak ada tugas yang tersedia. Kamu bisa bersantai sejenak");
        } else {
            System.out.println("Jumlah maksimal tugas : " + max);
            System.out.println("Tugas yang tersedia : ");
            for (int i = 0; i <= top; i++) {
                System.out.println((i + 1) + ". " + arr[i]);
            }
            // Tampilkan tugas terbaru 
            peek();
        }
    }
}
