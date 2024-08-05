package asciiPattern;

import java.util.Scanner;

public class PatternSeventeenAscii 
{

	PatternSeventeenAscii(int n)
	{
		int a=65;
		for(int i=1;i<=n;i++)
		{
			int ascii=a;
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int j=n;j>=i;j--)
			{
				System.out.print((char)(ascii++)+"");
			}
			a++;
			System.out.println();
		}
		int as=70;
		for(int i=1;i<=n;i++)
		{
			int ascii=as;
			for(int k=n;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(ascii++)+"");
			}
			as--;
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
		PatternSeventeenAscii p = new PatternSeventeenAscii(n);
	}

}