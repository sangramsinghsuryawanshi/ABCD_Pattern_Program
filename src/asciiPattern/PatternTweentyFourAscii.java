package asciiPattern;

import java.util.Scanner;

public class PatternTweentyFourAscii 
{
	PatternTweentyFourAscii(int n)
	{
		char a='J';
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=n-7;j++)
			{
				System.out.print((char)(a)+" ");
				break;
			}
		}
		char a1='A';
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i-1;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=n-5;j++)
			{
				System.out.print((char)(a1)+" ");
				break;
			}
		}
		char a2='V';
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i-2;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=n-3;j++)
			{
				System.out.print((char)(a2)+" ");
				break;
			}
		}
		char a3='A';
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i-3;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=n;j++)
			{
				System.out.print((char)(a3)+" ");
				break;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n number: ");
		int n=sc.nextInt();
		System.out.println("\n---------------------");
		PatternTweentyFourAscii p = new PatternTweentyFourAscii(n);
	}

}
