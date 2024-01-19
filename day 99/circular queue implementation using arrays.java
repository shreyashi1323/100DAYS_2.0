package queues;

public class circularQueue {
    public static class cqa{
        int front = -1;
        int rear = -1;
        int size = 0;
        int[] arr = new int[8];

        public void add(int val) throws Exception {
            if (size == arr.length) {
                throw new Exception("Queue is full");
            } else if (size == 0) {
                front = rear = 0;
                arr[0] = val;
            } else if (rear == arr.length - 1) {
                rear = 0;
                arr[rear] = val;
            } else {
                arr[++rear] = val;
            }
            size++;
        }

        public int remove() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            } else {
                int val = arr[front];
                if (front == arr.length - 1) {
                    front = 0;
                } else {
                    front++;
                }
                size--;
                return val;
            }
        }

        public int peek() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            } else {
                return arr[front];
            }
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public void display() {
            if (size == 0) {
                System.out.println("Queue is empty");
            } else if (front <= rear) {
                for (int i = front; i <= rear; i++) {
                    System.out.print(arr[i] + " ");
                }
            } else { // rear < front
                for (int i = front; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }

                for (int i = 0; i <= rear; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        cqa q = new cqa();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();
        q.remove();
        q.display();
    }
}
