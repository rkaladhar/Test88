package pack;


class revp
{
  public static void main(String args[ ])
  {
    String str = "I am kaladhar";
    String str1[ ] = str.split(" ");
    for(String s :  str1) {
    	System.out.println(s);
    }
   	for(int j=str1.length-1;j>=0;j--)
	{
		 System.out.print(str1[j] + " ");
    }
  }
}