import java.util.Scanner;

public class RingBufferQueue {
        private int[] buffer;
        private int front; // Index des ersten Elements in der Queue
        private int rear; // Index des letzten Elements in der Queue
        private int size; // Anzahl der Elemente in der Queue

        public RingBufferQueue(int capacity) {
            buffer = new int[capacity];
            front = 0;
            rear = -1;
            size = 0;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public boolean isFull() {
            return size == buffer.length;
        }

        public void enqueue(int item) {
            if (isFull()) {
                System.out.println("Die Queue ist voll. Das Element kann nicht hinzugefügt werden.");
                return;
            }

            rear = (rear + 1) % buffer.length;
            buffer[rear] = item;
            size++;
        }

        public int dequeue() {
            if (isEmpty()) {
                System.out.println("Die Queue ist leer. Es kann kein Element entfernt werden.");
                return -1;
            }

            int item = buffer[front];
            front = (front + 1) % buffer.length;
            size--;
            return item;
        }

        public void printQueue() {
            if (isEmpty()) {
                System.out.println("Die Queue ist leer.");
                return;
            }

            System.out.print("Queue: ");
            int count = 0;
            int index = front;
            for(int i = 0 ; i < size; i++){
                System.out.print(buffer[i]+" ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            RingBufferQueue queue = new RingBufferQueue(5);
            Scanner scanner = new Scanner(System.in);
            int choice = 0;
            int element;

            while (choice != 4) {
                System.out.println("1. Element hinzufügen");
                System.out.println("2. Element entfernen");
                System.out.println("3. Queue anzeigen");
                System.out.println("4. Beenden");
                System.out.print("Wählen Sie eine Option: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Geben Sie das Element ein: ");
                        element = scanner.nextInt();
                        queue.enqueue(element);
                        break;
                    case 2:
                        int removedElement = queue.dequeue();
                        if (removedElement != -1) {
                            System.out.println("Entferntes Element: " + removedElement);
                        }
                        break;
                    case 3:
                        queue.printQueue();
                        break;
                    case 4:
                        System.out.println("Programm wird beendet.");
                        break;
                    default:
                        System.out.println("Ungültige Option. Bitte wählen Sie erneut.");
                        break;
                }
            }
            scanner.close();
        }
    }


