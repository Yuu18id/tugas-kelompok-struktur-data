import java.util.LinkedList;
import java.util.Queue;

public class TaskList {
    private Queue<String> tasks;

    public TaskList() {
        this.tasks = new LinkedList<>();
    }

    public void addTask(String task) {
        tasks.offer(task); 
        System.out.println("Tugas \"" + task + "\" ditambahkan.");
    }

    public void removeTask() {
        if (tasks.isEmpty()) {
            System.out.println("Tidak ada tugas yang dapat dihapus.");
        } else {
            String removedTask = tasks.poll(); 
            System.out.println("Tugas \"" + removedTask + "\" dihapus.");
        }
    }

    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Tidak ada tugas dalam daftar.");
        } else {
            System.out.println("Daftar Tugas:");
            for (String task : tasks) {
                System.out.println("- " + task);
            }
        }
    }

    public static void main(String[] args) {
        TaskList taskList = new TaskList();

        taskList.addTask("Menyelesaikan tugas harian");
        taskList.addTask("Membuat logbook harian");
        taskList.addTask("Mengerjakan proyek tugas akhir");

        taskList.displayTasks();

        taskList.removeTask();

        taskList.displayTasks();
    }
}
