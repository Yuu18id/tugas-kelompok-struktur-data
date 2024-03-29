import java.util.LinkedList;
import java.util.Queue;

public class TaskList {
    private Queue<Task> tasks;

    public TaskList() {
        this.tasks = new LinkedList<>();
    }

    public void addTask(Task task) {
        tasks.offer(task);
        System.out.println("Berhasil menambahkan tugas!");
    }

    public void removeTask() {
        if (tasks.isEmpty()) {
            System.out.println("Tidak ada tugas yang dapat dihapus.");
        } else {
            Task removedTask = tasks.poll();
            System.out.println("Tugas berhasil dihapus!");
        }
    }

    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Daftar tugas kosong.");
        } else {
            System.out.println("Daftar Tugas:");
            int i = 1;
            for (Task task : tasks) {
                
                System.out.println("Tugas " + (i++) + "\n" +task);
            }
        }
    }

    public static void main(String[] args) {
        TaskList taskList = new TaskList();

        taskList.addTask(new Task("Menyelesaikan tugas harian", "Deskripsi tugas harian"));
        taskList.addTask(new Task("Membuat logbook harian", "Deskripsi logbook harian"));
        taskList.addTask(new Task("Mengerjakan proyek tugas akhir", "Deskripsi proyek tugas akhir"));

        taskList.removeTask();

        taskList.displayTasks();
    }
}
