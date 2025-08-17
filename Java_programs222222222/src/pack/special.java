package pack;

import java.io.*;

public class special
{
    public static void main(String args[]) throws IOException
    {
       special s=new special();
       s.RepeatChars();
       s.SpecialChars();
    }

    public void RepeatChars() throws IOException
    {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String chrs;

        System.out.println("Enter the string");
        chrs = br.readLine();

        int count=0;

        for(int i=0;i<chrs.length();i++)
        {
            count=0;
            for(int j=0;j<i;j++)
            {
                if(chrs.charAt(i)==chrs.charAt(j) )
                {
                    count++;
                }
            }
            if(count>0)
            {

                System.out.println(chrs.substring(i,i+1)+" - "+count);
            }
            else
            {
                System.out.println(chrs.substring(i,i+1)+" - "+count);
            }
        }

    }

    public void SpecialChars() throws IOException
    {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String chrs;

        System.out.println("Enter the string");
        chrs = br.readLine();

        for(int i=0;i<chrs.length();i++)
        {
            char  ch=chrs.charAt(i);
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch>='0' && ch<='9'))
            {

            }
            else
            {
                System.out.println("Special characters "+ch+" Found");
            }
        }
    }

}
