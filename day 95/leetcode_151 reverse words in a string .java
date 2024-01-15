class Solution {
    public String reverseWords(String s) {
        Stack <String> st = new Stack<>();
        String[] words = s.split("\\s+");
        for(String word : words){
            st.push(word);
        }
        StringBuilder reversedString = new StringBuilder();
        while (!st.empty()) {
            reversedString.append(st.peek()).append(" ");
            st.pop();
        }

        return reversedString.toString().trim();
    
    }
}
