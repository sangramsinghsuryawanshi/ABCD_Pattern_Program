package asciiPattern;

import java.util.Scanner;

public class PatternSixteenAscii 
{
	PatternSixteenAscii(int n)
	{
		for(int i=1;i<=n;i++)
		{
			int ascii=65;
			for(int k=n;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(ascii++)+" ");
			}
			System.out.println();
		}
		for(int i=2;i<=n;i++)
		{
			int ascii=65;
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int j=n;j>=i;j--)
			{
				System.out.print((char)(ascii++)+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n numer: ");
		int n= sc.nextInt();
		System.out.println("\n----------------------");
		PatternSixteenAscii p = new PatternSixteenAscii(n);
	}

}
