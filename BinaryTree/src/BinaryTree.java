public class BinaryTree< E extends Comparable<E>>{
    private int size;
    private Node<E> root;

    public BinaryTree(){
        }

    public static class Node <E> {
        private E item;
        private Node<E> left;
        private Node<E> right;

        public Node(E newItem, Node<E> newLeft, Node<E> newRight) {
            this.item = newItem;
            this.left = newLeft;
            this.right = newRight;
        }
    }

        public boolean contains(E item){
            return contains(this.root,item);
        }
        private boolean contains(Node<E> root, E item){
        if(root == null) {
          return false;
        }
        int comparison = item.compareTo((E) root.item);
        if (comparison == 0) {
            return true;
        }
        else if (comparison > 0){
            return contains(root.left,item);
        }
        else {
            return contains(root.right,item);
        }

        }
        public void add(E item){
        this.root = add(this.root,item);
        size++;
        }

    private Node<E> add(Node<E> root, E item) {

    if (root == null){
        return new Node(item,null,null);
    }
    int comparison = item.compareTo(root.item);
    if(comparison == 0 ){
        return root;
    }
    if (comparison > 0){
       root.right = add(root.right,item);
       return root;
    }
    else  {
       root.left = add(root.left,item);
       return root;
    }
     }

    public void remove(E item){
        this.root = this.remove(this.root,item);
        size--;
    }
    private Node<E> remove(Node<E> root, E item){
        if(root == null){
            return null;
        }
        int comparison = item.compareTo(root.item);

        if (comparison < 0 ){
            root.left = remove(root.left,item);
            return null;
        }
        else if (comparison > 0) {
            root.right = remove(root.right,item);
            return root;
        }
        else {
            if(root.right == null && root.left == null){
                return null;
            }
           else if (root.left != null && root.right == null) {
                return root.left;
            }
           else if (root.left == null && root.right != null) {
                return root.right;
            }
           else {
               Node<E> current = root.left;
               while (current.right != null){
                   current = current.right;
               }
               root.item = current.item;
              root.left = remove(root.left,root.item);
              return root;
            }

        }
    }

    public void preorderTraversal() {
        preorderDimo(root);
    }

    private void preorder(Node root) {
        if (root != null) {
            System.out.println();
            System.out.print(root.item +"(" + getNodeHeight(root)+")"+ " :");
            preorder(root.left);
            preorder(root.right);
        }
    }
    private void preorderDimo(Node root) {
        if (root != null) {
            if (root.left != null && root.right != null){
                System.out.print(root.item +"(" + getNodeHeight(root)+")"+ " : "+root.left.item+"("+getNodeHeight(root.left)+"),"+root.right.item+"("+getNodeHeight(root.right)+")");
            }
            else if (root.left != null && root.right == null){
                System.out.print(root.item +"(" + getNodeHeight(root)+")"+ " : "+root.left.item+"("+getNodeHeight(root.left)+", Null");
            }
           else if (root.left == null && root.right != null){
                System.out.print(root.item +"(" + getNodeHeight(root)+")"+ " : "+"Null, "+root.right.item+"("+getNodeHeight(root.right)+")");
            }
            else  {
                System.out.println(root.item+ "("+getNodeHeight(root)+") : " +" Null, Null");
            }
            System.out.println();
            preorderDimo(root.left);
            preorderDimo(root.right);
        }
    }
    public void inorderTraversal() {
        inorder(root);
    }

    private void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.item + " ");
            inorder(root.right);
        }
    }

    /**
     *
     * In der Methode getNodeHeight überprüfen wir zuerst, ob der übergebene Knoten null ist. In diesem Fall geben wir -1 zurück,
     * da die Höhe eines leeren Knotens -1 ist.
     *
     * Wenn der Knoten nicht null ist, rufen wir rekursiv die Methode getNodeHeight für den linken und rechten Teilbaum des Knotens auf und
     * speichern die jeweiligen Höhen in den Variablen leftHeight und rightHeight.
     * Die Höhe des Knotens ist dann das Maximum zwischen leftHeight und rightHeight plus 1,
     * um die Höhe der aktuellen Ebene zu berücksichtigen.
     * @return
     */
    public int getNodeHeight(Node node) {
        if (node == null) {
            return -1; // Höhe eines leeren Knotens ist -1
        } else {
            int leftHeight = getNodeHeight(node.left);
            int rightHeight = getNodeHeight(node.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }


        public void finish(){
            System.err.println("Programm wird Beendet");
            System.exit(1);
        }

        public void print(){
            System.out.println("e = Einfuegen");
            System.out.println("l = Loeschen");
            System.out.println("m = Modifizieren");
            System.out.println("z = Baum-Zeigen");
            System.out.println("p = Programm-Beenden");
        }
    }