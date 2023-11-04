import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aufgabe1_ListeStack {

    public static void main(String[] args){



        operation();
    }

    public static void operation(){
        List<String> list = new ArrayList<>();
        GenericStack<String> genList = new GenericStack<>(list);
        System.out.println("Chose one of the following Operations:\n" +
                "a - push: add one objekt\n" +
                "b - pop: remove the uppermost objekt\n" +
                "c - top: shows the uppermost objekt\n" +
                "d - isEmpty: return if the list empty\n" +
                "f - finish: ends the programm");
        boolean repeat = true;
        while (repeat) {
            Scanner Scanner = new Scanner(System.in);
            String scan = Scanner.nextLine();

            if (scan.equals("a")) {
                System.out.println("Enter your String: ");
                try {
                    String push = Scanner.nextLine();
                    genList.push(String.valueOf(push));
                }
                catch (Exception e){
                    System.out.println("Something went wrong.");
                }


            }
            if (scan.equals("b")) {
                System.out.println(genList.pop() + " deleted");
            }
            if (scan.equals("c")) {
                try {
                    System.out.println("uppermost objekt is :" + genList.top());
                    genList.top();
                }catch (RuntimeException e){
                    System.out.println("Stack is empty");
                }

            }
            if (scan.equals("d")) {
                System.out.println(genList.isEmpty());
            }
            if (scan.equals("f")) {
                repeat = false;
            }
            System.out.println("new enter: ");
        }


    }

}
