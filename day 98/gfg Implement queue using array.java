
class MyQueue {

    int front, rear, size;
	int arr[] = new int[100005];

    MyQueue()
	{
		front=0;
		rear=-1;
		size=0;
	}
	
	//Function to push an element x in a queue.
	void push(int val)
	{
	    if(rear==arr.length-1){
	        return;
	    }
	    if(front==-1){
	        front=rear=0;
	        arr[0]=val;
	    }
	    else{
	        arr[++rear]= val;
	    }
	    size++;
	} 

    //Function to pop an element from queue and return that element.
	int pop()
	{
		// Your code here
		if(size==0){
		    return -1;
		}
		int x = arr[front++];
		size--;
		return x;
	} 
}
