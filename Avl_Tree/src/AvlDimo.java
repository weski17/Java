import java.util.Scanner;

public class AvlDimo {
    public static void main(String[] args) {
     Tree<String> tree = new AvlTree<>();
        Scanner scanner = new Scanner(System.in);

        while (true){
            tree.print();
            String alphabet = scanner.next();
            switch (alphabet){

                case "e":
                    System.out.println("The New Word will be = ");
                    String word = scanner.next();
                    tree.insert(word);
                    break;

                case "l":
                    System.out.println("The deleted Word will be = ");
                    String lWord = scanner.next();
                    tree.delete(lWord);
                    break;

                case  "m":
                    System.out.println("The deleted Word will be = ");
                    String sWord = scanner.next();
                    tree.delete(sWord);

                    System.out.println("The New Word will be = ");
                    String aword = scanner.next();
                    tree.insert(aword);
                    break;

                case "z":
                    System.out.println("__Preorder__");
                   tree.traverse();
                    break;

                case "p":
                   tree.finish();
                    break;

            }
        }
    }
    }
