package asciiPattern;

import java.util.Scanner;

public class PatternTweentyAscii 
{
	PatternTweentyAscii(int n)
	{
		int a1=64;
		for(int i=1;i<=n;i++)
		{
			int ascii=65;
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(ascii++)+"");
			}
			int a=a1;
			for(int k=1;k<=i-1;k++)
			{
				System.out.print((char)(a--)+"");
			}
			a1++;
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
		PatternTweentyAscii p = new PatternTweentyAscii(n);
	}

}