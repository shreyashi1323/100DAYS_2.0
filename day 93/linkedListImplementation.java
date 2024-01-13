package linked_list;

public class implementation_of_LL {
    public static class Node{
        int data;
       Node next;
        Node(int data){
            this.data= data;
        }
    }

    public static class linkedList{
        Node head = null;
        Node tail;
        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head==null){
                head = temp;
                tail = temp;
            }
            else{
                tail.next = temp;
                tail= temp;
            }

        }

        void display(){
            Node temp = head;
            while(head!= null){
                System.out.print(head.data+" ");
                head= head.next;
            }
        }

        int size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

    }
    public static void main(String[] args) {
         linkedList ll = new linkedList();
         ll.insertAtEnd(9);
         ll.insertAtEnd(4);
        ll.insertAtEnd(8);
        ll.insertAtEnd(6);
        ll.insertAtEnd(0);

         ll.display();
        System.out.println("size of ll is: ");
        System.out.println(ll.size());


    }
}
