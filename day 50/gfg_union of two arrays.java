class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
        int c[]= new int [100000];
        int j=0;
        for(int i=0;i<n;i++) c[i]=a[i];
        for(int i=n;i<m+n;i++) c[i]=b[j++];
        Arrays.sort(c,0,n+m);
        
        int count=1;
        for(int i=1;i<n+m;i++){
            if(c[i]!=c[i-1]) count++;
        }
        
        return count;
    }
}
