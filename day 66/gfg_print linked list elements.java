class Solution
{
    
    void display(Node head)
    {
        Node temp=head;
        while(temp!=null){
             System.out.print(temp.data+" ");
            temp=temp.next;
           
        }
    }
}
