package asciiPattern;

import java.util.Scanner;

public class PatternTweentyThreeAscii 
{

	PatternTweentyThreeAscii(int n)
	{
		int a1=65;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(a1)+" ");
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
		PatternTweentyThreeAscii p = new PatternTweentyThreeAscii(n);
	}

}

