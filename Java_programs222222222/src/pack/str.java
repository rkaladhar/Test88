package pack;

import java.util.*;

class str
{
  public static void main(String args[ ])
  {
    String str = "eg Tomcat";
    StringTokenizer st = new StringTokenizer(str);
    while(st.hasMoreTokens())
    {
		String tok = st.nextToken().trim();
		if(tok.equals(" "))
		{
			continue;
		}
		System.out.println(tok);
	}
  }
}