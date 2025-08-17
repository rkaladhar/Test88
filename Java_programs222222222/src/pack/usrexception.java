package pack;

class MyException extends Exception
   {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String msg = "";
     int marks;

    public MyException()
     {
     }

     public MyException(String str)
      {
         super(str);
      }
     public String toString()
      {
         if(marks <= 40)
         msg = "You have failed";
         if(marks > 40)
         msg = "You have Passed";

         return msg;

     }
}


public class usrexception
    {
     public static void main(String args[])
         {
         usrexception t = new usrexception();
         t.dd();
     }
     public void dd()
         {
         try
             {
             int i=0;
             if( i < 40)
             throw new MyException();
         }
         catch(MyException ee1)
             {
             System.out.println("my ex"+ee1);
         }
     }
}