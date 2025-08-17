package pack;


import java.io.*;

class loop
{
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   int i,j,k,n;
   public void samp()
   {
     do
    	{

		  try
  	      {

	    		System.out.println("Enter the number for n");
			    n = Integer.parseInt(br.readLine());
			    if(n == 999)
			    {
		   	      System.exit(0);
		   	      //break;
		        }
			    for(i=1;i<=n;i++)
          	    {
	            	for(j=i;j<n;j++)
		      	 	{
 		    	 	  System.out.print(" ");
		    	 	}
		    	 	for(k=1;k<=i;k++)
	        	 	{
		    	 	   System.out.print(" *");
		    	 	}
		    	 	   System.out.println();
	      		}
	      		for(i=n;i>=1;i--)
	      		{
					for(j=i;j<n;j++)
					{
						System.out.print(" ");
					}
					for(k=i;k>=1;k--)
					{
						System.out.print(" *");
					}
					    System.out.println();
				}
			}catch(Exception e)
			{
			   System.out.println("Exception Occured: " + e);
    		}
    	  }while(n != 999);
    }
}
class loop1
{
	public static void main(String args[ ])
	{
		loop l = new loop();
		l.samp();
	}
}
