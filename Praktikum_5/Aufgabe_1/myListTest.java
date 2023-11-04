public class myListTest {
    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.addToList(0, 1);
        myList.addToList(1, 2);
        myList.addToList(2, 7);
        myList.addToList(3,90);
        myList.addToList(4, 21);
        myList.addToList(5,7);
        myList.addToList(6,2);
        myList.addToList(7,-1);
        myList.addToList(8,8);
        myList.addToList(9,19);

        System.out.println("___addToList___");
        myList.print(myList.getArray());
        System.out.println();
        System.out.println("___removeFromList___");
        myList.removeFromList(3);
        myList.print(myList.getArray());
        System.out.println();
        System.out.println("___removeDuplicates___");
        System.out.println(myList.removeDuplicates());
        System.out.println("___sortlist___");
        myList.sortList();
        myList.print(myList.getArray());
        System.out.println();
        System.out.println("___kompizahl___");
        myList.kompizahl(10);

    }
}