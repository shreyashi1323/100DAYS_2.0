class Compute {
    
    public void rotate(int arr[], int n)
    {
        int start=0;
        int end=n-2;
        
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        
       int start1=0;
        int end1=n-1;
        
        while(start1<end1){
            int temp=arr[start1];
            arr[start1]=arr[end1];
            arr[end1]=temp;
            start1++;
            end1--;
        }
    }
}
