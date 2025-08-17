package pack;

class th1 implements Runnable
 {
   Thread t = null;
   String str = null;

   public th1(String str)
   {
   	this.str = str;
     t = new Thread(this,str);
     //System.out.println("Thread Name: " + t);
     t.start();
   }
	public void run()
	{

		for(int j=0;j<100;j++)
		{

			try
			{
				System.out.println("Thread name--->" + t + "<--_>"+j);
				Thread.sleep(1000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}

	    }
	}
 }
public class thread1
{
	public static void main(String args[])
	{
		th1 t1 = new th1("One");
		th1 t2 = new th1("Two");
	}
}
