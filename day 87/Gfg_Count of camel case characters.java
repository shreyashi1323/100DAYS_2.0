class Sol
{
    int countCamelCase (String s)
    {
        // your code here  
        int count=0;
        char c []= s.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i]>='A' && c[i]<='Z'){
                count++;
            }
        }
        
        return count;
    }
}
