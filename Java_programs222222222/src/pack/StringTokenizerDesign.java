package pack;

import java.io.*;
import java.util.*;

// a=b#c#d=t#e#r#t#m=p#y#w#s#d#F=i#q#e#r#T=m#h#m#w


public class StringTokenizerDesign 
{
  public static void main(String args[ ]) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String str = null;
	ArrayList keyList = new ArrayList();
	ArrayList valList = new ArrayList();
	System.out.println("Enter String");
    str = br.readLine();
    StringTokenizer st = new StringTokenizer(str,"=");

	while(st.hasMoreTokens())
    {
    	String tok = st.nextToken();
        if(tok.indexOf("#") > -1 && st.hasMoreTokens())
        {
           String val = tok.substring(0,tok.lastIndexOf("#"));
           System.out.println("val------>"+ val);
           String key = tok.substring(tok.lastIndexOf("#")+1);
           System.out.println("key--@@@@---->"+ key);
           keyList.add(key);
           valList.add(val);
        }else
        {
        	if(!st.hasMoreTokens())
        	{
        		valList.add(tok);
        	}else
        	{
        	    keyList.add(tok);
        	}
        }
    }

     for(int i=0;i<keyList.size();i++)
     {
       String key = (String)keyList.get(i);
       String val = (String)valList.get(i);
       System.out.println(key + " : " + val);
     }
  }
 }
