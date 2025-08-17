package pack;

public class Pyramid {
 public static void main(String[] args) {
	 int i,j,k,n=5;
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
			for(k=i;k>=1;k--)
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
}
 
}
