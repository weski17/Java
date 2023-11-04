public class StackTest {
    public static void main(String[] args) {
    StackAdapter stacker = new StackAdapter();

        System.out.println(stacker.empty());
    System.out.println(stacker.push("Wael"));
    stacker.push(22);
    stacker.push("Eskeif");
    stacker.push(2000);
    System.out.println(stacker.pop());
    System.out.println(stacker.peek());
    System.out.println(stacker.empty());
    }
}
