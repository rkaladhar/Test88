package pack;

import java.io.*;

public class rev {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException
    {
        String strInv = null, word;
        System.out.print("Enter a word : ");
        word = br.readLine();
        strInv = invert(word);

        System.out.println(strInv);
    }

    public static String invert(String s) {
        String temp = "";
        for (int i = s.length() - 1; i >= 0; i--)
            temp += s.charAt(i);
        return temp;
    }
}
