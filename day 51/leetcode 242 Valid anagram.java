class Solution {
    public boolean isAnagram(String s, String t) {
        s.toLowerCase();
        t.toLowerCase();


        if(s.length()==t.length()){
           char [] charArr1=s.toCharArray();
           char [] charArr2=t.toCharArray();

               Arrays.sort(charArr1);
               Arrays.sort(charArr2);

             
        return Arrays.equals(charArr1, charArr2); // Moved the condition inside the block
        }

        return false;

          
    }
}
