package asciiPattern;

import java.util.Scanner;

public class PatternTweentyOneAscii 
{
	PatternTweentyOneAscii(int n)
	{
		int a1=65;
		int a2=65;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n-1;j++)
			{
				System.out.print((char)a1+"");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print((char)a2+"");
			}
			a2++;
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
		PatternTweentyOneAscii p = new PatternTweentyOneAscii(n);
	}

}
