package pack;

public class Design {
	public static void main(String[] args) {
		int i, j = 0;
		char ch = 'A';
		// int count = 1;
		int n = 60;
		for (ch = 65; ch >= 65 && ch <= 68; ch++) {
			for (char ch1 = 65; ch1 <= ch; ch1++) {
				System.out.print(ch1 + " ");
			}
			System.out.println();
		}
		System.out.println("<-----------------------[[[Backward]]]-------------------------------------->");

		for (i = 1; i < n+1; i++) {
			// Inner loop to print numbers in reverse
			for (j = n; j >= n-i; j--) {
				System.out.print(j + " ");
			}
			// Move to the next line after each row
			System.out.println();
		}

		System.out.println("<--------------------------{{{{Backward}}}}----------------------------------->");

		for (i = 0; i < n; i++) {
			int y=1;
			for (j = i; j > 0; j--) {
				System.out.print(y+ " ");
				y++;
			}
			System.out.println();
		}
		System.out.println("<---------------  [[[Reverse]]]---------------------------------------------->");
		for (i = n; i > 0; i--) {
			for (j = i; j > 0; j--) {
				System.out.print(i +" ");
			}
			System.out.println();
		}
		System.out.println("<-----------------------[[[[[[[[[[[Reverse]]]]]]]]-------------------------------------->");
		;
		for (i = 1; i <= n; i++) {
			// Print leading spaces
			for (j = n - i; j > 0; j--) {
				System.out.print("  ");
			}
			// Print numbers
			for (j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("<--------------------@@@@@@---------------------------------->");
		for (i = 0; i < n; i++) {
			// int y=1;
			for (j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (j = 0; j < n - i; j++) {
				System.out.print((i + 1));
				// y++;
			}
			System.out.println();
		}

		System.out.println("<------------------------------------------------------------->");
		for (i = 0; i < n; i++) {
			char y = 'A';
			for (j = i; j < i; j++) {
				System.out.print(" ");
			}
			for (j = 0; j < n - i; j++) {
				System.out.print(((char) (y + i)));

			}
			System.out.println();

		}
		System.out.println("<------------------------------------------------------------->");
		for (i = 0; i < n; i++) {
			int y = 1;
			for (j = i; j < n; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print(" " + y);
				y++;
			}
			System.out.println();

		}
		System.out.println("<--------------------- [[[[[Pyramid]]]]---------------------------------------->");
		for (i = 0; i < n; i++) {
			int y = 1;
			for (j = n - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (j = 0; j < i + 1; j++) {
				System.out.print(y + " ");
				y++;
			}
			for (j = i; j > 0; j--) {
				System.out.print(j + " ");
				// y--;
			}
			System.out.println();
		}
		for(i=n;i>=1;i--)
  		{
			int y=1;
			for(j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--)
			{
				System.out.print(y+" ");
				y++;
			}
			for (j = i; j > 0; j--) {
				System.out.print(j + " ");
				// y--;
			}
			    System.out.println();
		}
		System.out.println("<---------------------[[[[Hollow Diamond Pattern]]]]---------------------------------------->");
		for (i = 0; i < n; i++) {
			for (j = 0; j < (n - i - 1); j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			if (i != 0) {
				for (j = 0; j < (2 * i - 1); j++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}
		for (i = 0; i < n - 1; i++) {
			for (j = 0; j < i + 2; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			if (i != n - 2) {
				for (j = 0; j < 2 * (n - i) - 5; j++) {
					System.out.print(" ");
				}
				System.out.print("*");

			}
			System.out.println();
		}
		System.out.println(
				"<---------------------[[[[Butterfly Pattern]]]]---------------------------------------->");
		for (i = 0; i < n; i++) {
			for (j = 0; j < i; j++) {
				System.out.print("*");
			}
			for (j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			for (j = n - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
		for (i = n; i >0; i--) {
			for (j = i; j > 0; j--) {
				System.out.print("*");
			}
		 
			for (j = n - i; j > 0; j--) {
				System.out.print("  ");
			}
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println(
				"<---------------------[[[[*  Pyramid]]]]---------------------------------------->");
		for (i = 0; i < n; i++) {
			int y = 1;
			for (j = n - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (j = 0; j < i + 1; j++) {
				System.out.print(" "+y);
				y++;
			}
			for (j = i; j > 0; j--) {
				System.out.print(" "+y);
				 y--;
			}
			System.out.println();
		}
		for(i=n;i>=1;i--)
  		{
			int y=1;
			for(j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--)
			{
				System.out.print(" "+y);
				y++;
			}
			for (j = i; j >0; j--) {
				System.out.print(" "+y);
				 y--;
			}
			    System.out.println();
		}
		
	}

}
