class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String S)
    {
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i<S.length();i++){
            char ch = S.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57){
                st.push(ascii-48);
            }
            else{
                int s1 = st.pop();
                int s2 = st.pop();
                if(ch=='+') st.push(s2+s1);
                if(ch=='-') st.push(s2-s1);
                if(ch=='*') st.push(s2*s1);
                 if(ch=='/') st.push(s2/s1);
                
            }
            
        }
        return st.peek();
    }
}
