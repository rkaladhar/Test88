
package pack;
  import java.util.*;


  class hash22
  {
     public static void main(String args[ ])
      {
        Hashtable ht0 = new Hashtable();
	Hashtable ht = new Hashtable();
	Hashtable ht1 = new Hashtable();
	Hashtable ht2 = new Hashtable();
	Hashtable ht3 = new Hashtable();
	Hashtable ht4 = new Hashtable();

	Hashtable htt = new Hashtable();
	Hashtable htt1 = new Hashtable();
	Hashtable htt2 = new Hashtable();

	ht1.put("Window size" , new Integer(1));
	ht1.put("Number of crossings" , new Integer(1));

	ht2.put("Window size" , new Integer(2));
	ht2.put("Number of crossings" , new Integer(2));

	ht3.put("Window size" , new Integer(6));
	ht3.put("Number of crossings" , new Integer(4));

	ht4.put("Window size" , new Integer(12));
	ht4.put("Number of crossings" , new Integer(9));

	ht.put("immediate", ht1);
	ht.put("shortterm", ht2);
	ht.put("standard", ht3);
	ht.put("longterm", ht4);

	htt1.put("Window size" , new Integer(5));
	htt1.put("Number of crossings" , new Integer(5));

	htt2.put("Window size" , new Integer(24));
	htt2.put("Number of crossings" , new Integer(20));

	htt.put("medium", htt1);
	htt.put("high", htt2);

	ht0.put("PRE-DEFINED", ht);
	ht0.put("USER-DEFINED", htt);


	Hashtable ht00 = new Hashtable();
	Hashtable htt0 = new Hashtable();
	Hashtable ht11 = new Hashtable();
	Hashtable ht22 = new Hashtable();
	Hashtable ht33 = new Hashtable();
	Hashtable ht44 = new Hashtable();

	Hashtable httt = new Hashtable();
	Hashtable htt11 = new Hashtable();
	Hashtable htt22 = new Hashtable();

	ht11.put("Window size" , new Integer(3));
	ht11.put("Number of crossings" , new Integer(3));

	ht22.put("Window size" , new Integer(7));
	ht22.put("Number of crossings" , new Integer(7));

	ht33.put("Window size" , new Integer(6));
	ht33.put("Number of crossings" , new Integer(6));

	ht44.put("Window size" , new Integer(14));
	ht44.put("Number of crossings" , new Integer(10));

	htt0.put("immediate", ht11);
	htt0.put("shortterm", ht22);
	htt0.put("standard", ht33);
	htt0.put("longterm", ht44);

	htt11.put("Window size" , new Integer(15));
	htt11.put("Number of crossings" , new Integer(15));

	htt22.put("Window size" , new Integer(34));
	htt22.put("Number of crossings" , new Integer(30));

	httt.put("medium", htt11);
	httt.put("high", htt22);

	ht0.put("PRE-DEFINED", ht);
	ht0.put("USER-DEFINED", htt);

	ht00.put("PRE-DEFINED",htt0);
	ht00.put("USER-DEFINED",httt);

	Hashtable hash11 = new Hashtable();
	hash11.put("manager-1",ht0);
	hash11.put("manager-2",ht00);


	Set s = hash11.keySet();
	Iterator itr = s.iterator();
	String key =  " ";
	Hashtable hash22 = null;
	while(itr.hasNext())
	{

	   key =  (String)itr.next();
	   //System.out.println("key----------->" + key);
	   hash22 = (Hashtable)hash11.get(key);
   	}

    s = hash22.keySet();
    Iterator itr1 = s.iterator();
	while(itr1.hasNext())
	{
		String key1 = (String)itr1.next();
		System.out.println("key1----------->" + key1);
	}


  }
}