import java.util.Scanner;

public class BTdemo {
    public static void main(String[] args) {
        BinaryTree<String> bst = new BinaryTree<>();
        Scanner scanner = new Scanner(System.in);

        while (true){
            bst.print();
            String alphabet = scanner.next();
            switch (alphabet){

                case "e":
                    System.out.println("The New Word will be = ");
                    String word = scanner.next();
                    bst.add(word);
                    break;

                case "l":
                    System.out.println("The deleted Word will be = ");
                    String lWord = scanner.next();
                    bst.remove(lWord);
                    break;

                case  "m":
                    System.out.println("The deleted Word will be = ");
                    String sWord = scanner.next();
                    bst.remove(sWord);

                    System.out.println("The New Word will be = ");
                    String aword = scanner.next();
                    bst.add(aword);
                    break;

                case "z":
                    System.out.println("__Preorder__");
                    bst.preorderTraversal();
                    System.out.println();
                    System.out.println("Inorder");

                    bst.inorderTraversal();
                    System.out.println();
                    break;

                case "p":
                    bst.finish();
                    break;

            }
            }
        }
    }
