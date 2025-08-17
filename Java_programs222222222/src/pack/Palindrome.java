package pack;

import java.io.*;

public class Palindrome {
    public static void main(String[] args) throws IOException {
        String str = "";
        int flag = 1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter String");
        str = br.readLine();
        char c[] = str.toCharArray();

        for (int i = 0; i < c.length; i++) {
            int j = c.length - i - 1;
            if (c[i] != c[j]) {
                flag = 0; // Set flag if mismatch found
                break;
            }
        }

        if (flag == 1) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
