class GfG
{
	boolean isBinary(String str)
	{
	  //Your code here
	  int n = str.length();
	  char[] charArray = str.toCharArray();
	  for(int i=0;i<n;i++){
	      if(charArray[i]!='1' && charArray[i]!='0')
	      return false;
	  }
	  
	  return true;
	}
}
