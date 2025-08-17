package pack;

 class th implements Runnable
 {
	Thread tt = null;
   	String str = null;
   	boolean b = false;

   public th(String str,boolean b)
   {
   	 this.str = str;
   	 this.b = b;
     tt = new Thread(this,str);
     tt.setDaemon(true);
     tt.start();
   }
	public void run()
	{
		if(!b)
		{
		  for(int j=0;j<10;j++)
		  {
			try
			{
				System.out.println("Thread name--->" + tt + "<----->"+j);
				Thread.sleep(1000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		  }
		}else
		{
			for(int j=10;j>=1;j--)
			{
			  try
			  {
				System.out.println("Thread name--->" + tt + "<---->"+j);
				Thread.sleep(1000);
			  }catch(Exception e1)
			   {
				 e1.printStackTrace();
			   }
			}
		}

    }
}

 public class thread3
 {
	public static void main(String args[])
	{

		try
		{
			while(true)
			{
				th t1 = new th("One",false);
				th t2 = new th("Two",true);

				t1.tt.setPriority(17);
				t2.tt.setPriority(6);

				try
				{
					t1.tt.join();
					t2.tt.join();
				}
				catch(InterruptedException e)
				{
					System.out.println("Exception Occured: " + e);
				}

				try
				{
					Thread.currentThread().sleep(10*1000);
				}
				catch(Exception e)
				{}

			}
		}catch(Exception e)
		{
           e.printStackTrace();
   		}
	}
}
