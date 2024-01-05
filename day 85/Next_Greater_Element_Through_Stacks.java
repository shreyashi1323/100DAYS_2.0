import java.util.*;
class Balanced_braces {
    public static void main(String[] args) {
        int [] arr = {1,5,3,2,1,6,3,4};
        int [] res = new int[arr.length];
        Stack<Integer>st = new Stack<>();
        int n = arr.length;
        res[n-1]=-1;
        st.push(arr[n-1]);
        for(int i =n-2;i>=0;i--){

           while( st.size()>0 && st.peek()<arr[i] )
               st.pop();

           if(st.size()==0) res[i] = -1;
           else res[i] = st.peek();
           st.push(arr[i]);
        }
        
        System.out.print(Arrays.toString(res));

    }}
