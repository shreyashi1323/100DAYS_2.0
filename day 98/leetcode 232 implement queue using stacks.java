class MyQueue {
      int front , rear,  size;
      int arr[]= new int [100];
    public MyQueue() {
       rear =-1;
        front =0;
       size =0; 
    }
    
    public void push(int val) {
        if(rear == arr.length-1){
            return;
        }
        if(front ==-1){
            front = rear = 0;
        }
        else{
            arr[++rear]=val;
        }
        size++;
    }
    
    public int pop() {
        if(size==0){
            return -1;
        }
        else{
            int x = arr[front++];
            size--;
            return x;
        }
    }
    
    public int peek() {
        if(size==0){
            return -1;
        }
        return arr[front];
    }
    
    public boolean empty() {
        if(size==0)
        return true;
        else return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
