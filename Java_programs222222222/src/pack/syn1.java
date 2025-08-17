package pack;

class c
{
        public static synchronized void display(int i)
	    {

	            	System.out.print("[" + i);
				  		try
				  		{
				  			Thread.sleep(1000);
				  		}catch(Exception e)
				  		{
				  			e.printStackTrace();
				  		}
					     System.out.println("]");

	    }
}

class b implements Runnable
{
	Thread t;
	String str = null;
	c cc;
	int i;

	public b(c cc,String str,int i)
	{
		this.i = i;
		this.str = str;
    	//cc.i = i;
    	t = new Thread(this,str);
    	System.out.println("Thread name--------->" + t);
		t.start();
	}

    public void run()
	{

		  cc.display(i);

	}

}

class syn1
{
	public static void main(String args[])
	{
		c cc = new c();
		b b1 = new b(cc,"one",18);
		b b2 = new b(cc,"Two",1);
	}
}


