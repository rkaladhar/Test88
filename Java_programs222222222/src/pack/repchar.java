import java.io.*;
import java.lang.*;

public class repchar
{
	public static void main(String[] args)
	{
		String string = " ";
		int count = 1;
		boolean repeatedChars = true;

		System.out.println("Please enter a string: ");
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(input);

		try
		{
			string = reader.readLine();
		}catch(IOException ioe)
		{
			System.out.println("IO error");
			System.exit(1);
		}

		string = string.toLowerCase();

		for(int i = 97; count <= string.length(); i++)
		{
			char character = (char)i;
			int firstIndex = string.indexOf(character);
			int lastIndex = string.lastIndexOf(character);

			if(firstIndex == lastIndex)
			{
				repeatedChars = false;
			}
					count++;
		}

		if(repeatedChars == true)
		{
			System.out.println("There were repeated characters in the string");
		}
		else
		{
			System.out.println("There were no repeated characters in the string");
		}
	}
}
