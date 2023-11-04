
public class AvlTree < E extends Comparable<E>> implements Tree<E> {
    private Node<E> root;


    private static class Node<E> {
        private E data;
        private Node<E> rightChild;
        private Node<E> leftChild;
        // The default upon of a new Node is 1 when a node is created or inserted
        private int height = 1;

        public Node(E getItem) {
            this.data = getItem;
        }

        public void setHeight(int height) {
            this.height = height;
        }
    }

    private int balance(Node<E> node) {
        return node != null
                // The Height of the left subtree minus The Height of the Right subtree
                ? height(node.leftChild) - height(node.rightChild)
                : 0;
    }

    public AvlTree() {
        this.root = null;
    }

    private void updateHeight(Node<E> node) {
        int maxHeight = Math.max(
                height(node.leftChild),
                height(node.rightChild)
        );
        node.height = (maxHeight + 1);
    }

    /**
     * Check if the Node is different than null then it return the node´s height
     * and if the node is equal to null it will return Zero, which is the height of every null Node
     * return node´s height
     */

    private int height(Node<E> node) {
        return node != null ? node.height : 0;
    }

    @Override
    public void insert(E date) {
        root = insert(date, root);
    }

    private Node<E> insert(E data, Node<E> node) {
        if (node == null) {
            return new Node<>(data);
        }
        if (data.compareTo(node.data) < 0) {
            node.leftChild = insert(data, node.leftChild);
        } else if (data.compareTo(node.data) > 0) {
            node.rightChild = insert(data, node.rightChild);
        } else {
            return node;
        }
        updateHeight(node);
        return applyRotation(node);

    }

    @Override
    public void delete(E date) {
        root = delete(date, root);
    }

    private Node<E> delete(E date, Node<E> node) {
        if(root == null){
            return null;
        }
        if(date.compareTo(node.data)< 0 ){
            node.leftChild = delete(date,node.leftChild);
        } else if (date.compareTo(node.data) > 0) {
            node.rightChild = delete(date,node.rightChild);
        }
        else {
            if(node.rightChild == null && node.leftChild == null){
            return null;
        }
        else if (node.leftChild != null && node.rightChild == null) {
            return node.leftChild;
        }
        else if (node.leftChild == null && node.rightChild != null) {
            return node.rightChild;
        }else {
            Node<E> current = node.leftChild;
            while (current.rightChild != null){
                current = current.rightChild;
            }
            node.data = current.data;
            node.leftChild =  delete(node.data,node.leftChild);
            return node;
           }
        }
        updateHeight(node);
        return applyRotation(node);
    }


    @Override
    public void traverse() {
        preorderDimo(root);
    }

    @Override
    public boolean isEmpty(E data) {
        return contains(this.root, data);
    }

    private Node<E> applyRotation(Node<E> node) {
        // Calculate the Balance,
        int balance = balance(node);
        // Left-Heavy
        if (balance > 1) {
            // Left Child is Negative
            if (balance(node.leftChild) < 0) {
                node.leftChild = rotateleft(node.leftChild);
            }

            return rotateRight(node);

        }
        //Right-Heavy
        if (balance < -1) {
            // Right Child is Positive
            if (balance(node.rightChild) > 0) {
                node.rightChild = rotateRight(node.rightChild);
            }

            return rotateleft(node);
        }
        return node;
    }

    private Node<E> rotateleft(Node<E> node) {
        Node<E> rightNode = node.rightChild;
        Node<E> centerNode = rightNode.leftChild;
        rightNode.leftChild = node;
        node.rightChild = centerNode;
        updateHeight(node);
        updateHeight(rightNode);
        return rightNode;
    }

    private Node<E> rotateRight(Node<E> node) {
        Node<E> leftNode = node.leftChild;
        Node<E> centerNode = leftNode.rightChild;
        leftNode.rightChild = node;
        node.leftChild = centerNode;
        updateHeight(node);
        updateHeight(leftNode);
        return leftNode;
    }

    public int getNodeHeight(Node<E> node) {
        if (node == null) {
            return -1; // Höhe eines leeren Knotens ist -1
        } else {
            int leftHeight = getNodeHeight(node.leftChild);
            int rightHeight = getNodeHeight(node.rightChild);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
        private void preorderDimo (Node < E > root) {
            if (root != null) {
                if (root.leftChild != null && root.rightChild != null) {
                    System.out.print(root.data + "(" + getNodeHeight(root)+", "+balance(root) + ")" + " : " + root.leftChild.data + "(" + getNodeHeight(root.leftChild) +", "+balance(root.leftChild)+ ")," + root.rightChild.data + "(" + getNodeHeight(root.rightChild)+", "+balance(root.rightChild) + ")");
                } else if (root.leftChild != null && root.rightChild == null) {
                    System.out.print(root.data + "(" + getNodeHeight(root)+ ", "+balance(root) + ")" + " : " + root.leftChild.data + "(" + getNodeHeight(root.leftChild) +balance(root.leftChild)+ ", Null");
                } else if (root.leftChild == null && root.rightChild != null) {
                    System.out.print(root.data + "(" + getNodeHeight(root) +", "+balance(root)+ ")" + " : " + "Null, " + root.rightChild.data + "(" + getNodeHeight(root.rightChild)+", "+balance(root.rightChild) + ")");
                } else {
                    System.out.println(root.data + "(" + getNodeHeight(root)+", "+balance(root) + ") : " + " Null, Null");
                }
                System.out.println();
                preorderDimo(root.leftChild);
                preorderDimo(root.rightChild);
            }
        }

        private boolean contains (Node<E> root, E data){
            if (root == null) {
                return false;
            }
            int comparison = data.compareTo((E) root.data);
            if (comparison == 0) {
                return true;
            } else if (comparison > 0) {
                return contains(root.leftChild, data);
            } else {
                return contains(root.rightChild, data);
            }

        }
        @Override
    public void print(){
        System.out.println("e = Einfuegen");
        System.out.println("l = Loeschen");
        System.out.println("m = Modifizieren");
        System.out.println("z = Baum-Zeigen");
        System.out.println("p = Programm-Beenden");
    }

    @Override
    public void finish() {
        System.err.println("Das Programm wird beendet");
        System.exit(1);
    }
}
