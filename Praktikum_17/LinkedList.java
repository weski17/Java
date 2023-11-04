import java.util.Scanner;

public class LinkedList <T extends String> {
    private static class Node<T extends String> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    private int size;
    private Node<T> head;
    //private Node <T> tail;
    private boolean control ;

    public LinkedList() {
        head = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    private Node<T> getNode(int index) {
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    private boolean isEmpty() {
        boolean out = false;
        if (size <= 0) {
            out = true;
        }
        return out;
    }


    public void add(T item) {
        Node<T> adding = new Node<T>(item);
        if (size == 0) {
            adding.next = head;
            head = adding;
            size++;


        } else {
            deleteDoppelt(item);
            if (control) {
                adding.next = head;
                head = adding;
                size++;
                sort();
            }
            else {
                System.out.println("Kann nicht gespeichert werden denn ist verdoppelt");
            }
        }
        control = true;

    }
    private Node<T> findafter(T item){
        Node <T> node = null;
        for (int i = 0 ; i < size; i++ ){
            if (getNode(i).data.contains(item)){
                node = getNode(i+1);
            }
        }
        return node;}
    private Node<T> findBefore(T item){
        Node <T> node = null;
        for (int i = 0 ; i < size; i++ ){
            if (getNode(i).data.contains(item)){
                node = getNode(i-1);
            }
        }
        return node;}

    private Node<T> findNode(T item){
        Node <T> node = null;
        for (int i = 0 ; i < size; i++ ){
            if (getNode(i).data.contains(item)){
               node = getNode(i);
            }
        }
        return node;
    }
    private void deleteDoppelt( T item){
        for (int i = 0 ; i < size ; i++){
            T current =  getNode(i).data;
            if (current.contains(item)){
            control = false;
            }
        }
    }

    private void predecessor_successor(T item) throws IndexOutOfBoundsException {
        Node<T> before = findBefore(item);
        Node<T> after = findafter(item);
       if (findBefore(item)==null){
           System.out.println("predecessor : ___" + " successor : " + after.data);
       }
       if (findafter(item) == null){
           System.out.println("predecessor: " + before.data + " successor : ___" );
       }else {
           System.out.println("predecessor: " + before.data + " , successor : " + after.data);
       }
    }

    private void revomveElemnt(T item) {
       if(isEmpty()){
           System.out.println("Es kann nichts entfernt werden, denn ist leer");
       }
       else {
        T toReturn = null;
        if (size == 0) {
             toReturn = head.data;
             head = head.next;
        } else {
            Node<T> before = findBefore(item);
            toReturn = before.next.data;
            before.next = before.next.next;
        }
        size--;
    }
    }


    public void deleteList() {
        Node<T> current;
        while (this.head != null) {
            current = head;
            head = null;
            this.head = current.next;
            deleteList();

        }
    }

    public String zeigen() {
        String out = "";
        Node<T> current = head;
        while (current != null) {
            out += current.data;
            current = current.next;
            if (current != null) {
                out += " ==> ";
            }
        }
        if (size == 0) {
            out = "is still empty";
        }
        return out;
    }

    private void end() {
        System.err.println("Programm wird beendet");
        System.exit(1);
    }

    private void get(int index) {
        if ((index < 0) || index >= size) {
            throw new IndexOutOfBoundsException(":(");
        }
        System.out.println(getNode(index).data);
    }
    private void changeItem (T item,T newItem){
        if(isEmpty()){
            System.out.println("Liste ist noch leer");
        }
        else {
        Node <T> current = findNode(item);
        current.data = newItem;
    }
    }

    private T set(int index, T item) {
        if ((index < 0) || index >= size) {
            throw new IndexOutOfBoundsException(":(");
        }
        Node<T> target = getNode(index);
        T oldData = target.data;
        target.data = item;
        return oldData;
    }
    private void sort(){
        if(size > 0){
       int wordSize = getNode(0).data.length();
       for (int i = 0 ; i < size; i++){
           for (int j = 0 ; j < size-1 ; j++){
               int currentSize = getNode(j).data.length();
               int nextOneSize = getNode(j+1).data.length();
               if(currentSize > nextOneSize){
               String temp = getNode(j).data;
               getNode(j).data = getNode(j+1).data;
               getNode(j+1).data = (T) temp;
               }
           }
       }
        }
    }

    public static void printMenu() {
        System.out.println("N = neue Liste anlegen");
        System.out.println("L = Liste Loeschen");
        System.out.println("Z = Liste zeigen");
        System.out.println("e = Element hinter einem anderen einfügen");
        System.out.println("s = Element suchen und Vorgänger und Nachfolger anzeigen");
        System.out.println("l = Element löschen");
        System.out.println("m = Element modifizieren");
        System.out.println("p = Programm beenden");
    }
    public static void main(String[] args) {
        LinkedList<String> list = null;
        Scanner scanner = new Scanner(System.in);
        String eingabe;

        while (true) {
            printMenu();
            eingabe = scanner.nextLine();

            if (eingabe.contains("N")) {
                list = new LinkedList<>();
                System.out.println("Liste wurde erstellt");
            }
            if (eingabe.contains("L")) {
                if (list != null) {
                    list.deleteList();
                    System.out.println("Liste wurde geloescht");
                } else {
                    System.out.println("List doesn´t exist yet");
                }
            }
            if (eingabe.contains("Z")) {
                if (list != null) {
                    System.out.println(list.zeigen());
                } else {
                    System.out.println("List doesn´t exist yet");
                }
            }
            if (eingabe.contains("e")) {
                if (list != null) {
                    System.out.println("Item = ");
                    String input = scanner.next();
                    list.add(input);

                } else {
                    System.out.println("List doesn´t exist yet");
                }
            }
            if (eingabe.contains("p")) {
                if (list != null) {
                    list.end();
                } else {
                    System.out.println("List doesn´t exist yet");
                }
            }
            if (eingabe.contains("s")) {
                if (list != null) {
                    System.out.println("Item Name = ");
                    String item = scanner.next();
                    list.predecessor_successor(item);
                } else {
                    System.out.println("List doesn´t exist yet");
                }
            }
            if (eingabe.contains("m")) {
                if (list != null) {
                    System.out.println("Old Item = ");
                    String input = scanner.next();
                    System.out.println("New Item = ");
                    String item = scanner.next();
                    list.changeItem(input,item);
                    list.sort();
                } else {
                    System.out.println("List doesn´t exist yet");
                }
            }
            if (eingabe.contains("l")) {
                if (list != null) {
                    System.out.println("New Item = ");
                    String input = scanner.next();
                    list.revomveElemnt(input);
                } else {
                    System.out.println("List doesn´t exist yet");
                }
            }
                System.out.println();


        }
    }
}
