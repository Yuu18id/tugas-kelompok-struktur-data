public class App {
    public static void main(String[] args) throws Exception {
        Stack stack = new Stack(7);
        stack.push("Sate Ayam");
        stack.push("Sate Kambing");
        stack.push("Sate Sapi");
        stack.printStack();
        stack.pop();
        stack.printStack();
    }
}
