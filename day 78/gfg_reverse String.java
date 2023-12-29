class Solution {
    static String revStr(String S) {
        // code here
        char [] chara = S.toCharArray();
        for(int j = chara.length-1,i=0;i<j;i++,j--){
            char temp = chara[i];
            chara[i] = chara[j];
            chara[j] = temp;
        }
        String rev = new String(chara); 
        return rev;
    }
}
