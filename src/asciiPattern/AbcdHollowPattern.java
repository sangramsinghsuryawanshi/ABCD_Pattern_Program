package asciiPattern;

import java.util.Scanner;

public class AbcdHollowPattern 
{
	AbcdHollowPattern(int n)
	{
		int ascii=65;
		int ascii1=66;
		for(int i=1;i<=n;i++)
		{
			int as=ascii;
			for(int k=i;k<=n;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				if(j==1 || i==n)
				{
					System.out.print((char)(as++)+" ");
				}
				else if(i==j)
				{
					System.out.print((char)(ascii1++)+" ");
				}
				else
				{
				System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n number: ");
		int n = sc.nextInt();
		System.out.println("\n---------------------");
		AbcdHollowPattern a = new AbcdHollowPattern(n);
	}

}
