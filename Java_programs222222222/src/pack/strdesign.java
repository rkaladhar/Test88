package pack;
import java.io.*;

class strdesign
{
public static void main(String args[ ]) throws IOException
{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int i,j,n;

	String str = " " ;


	System.out.println("Enter the number for string");

	for(i=0;i<str.length();i++)
	{
		str = br.readLine();
	}

	// loop for top pyramid of the diamond

	for (i = str.length(); i > 0; i--)
	{

	  for (j = i; j >= 0; j--)
	  {
			System.out.print(str);

	  }

	  for (j = i; j < str.length(); j++)
	  {
			System.out.print(" ");
	  }

	  for (j = i; j <= str.length(); j++)
	  {
			System.out.print(" ");
	  }

	  for (j = i; j > 0; j--)
	  {
			System.out.print(str);
	  }


		System.out.println();


	}

// loop for bottom pyramid of the diamond


	/*for (i = n; i >= 0; i--) {
		for (j = i; j < n; j++) {
			System.out.print("*");
		}

		for (j = i; j > 0; j--) {
			System.out.print(" ");
		}

		for (j = i; j >= 0; j--) {
			System.out.print(" ");
		}

		for (j = i; j < n; j++) {
			System.out.print("*");
		}



		System.out.println();

	}*/

}


}




/*
 Program output:
 ------*------
 -----***-----
 ----*****----
 ---*******---
 --*********--
 -***********-
 *************
 -***********-
 --*********--
 ---*******---
 ----*****----
 -----***-----
 ------*------

*/