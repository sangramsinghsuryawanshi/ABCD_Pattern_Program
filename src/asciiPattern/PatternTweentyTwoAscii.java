package asciiPattern;

import java.util.Scanner;

public class PatternTweentyTwoAscii 
{
	PatternTweentyTwoAscii(int n)
	{
		int a1=65;
		int a2=70;
		for(int i=1;i<=n;i++)
		{
			int ascii=a1;
			for(int j=i;j<=n-1;j++)
			{
				System.out.print((char)(ascii++)+"");
			}
			int asc=a2;
			for(int k=n;k>=i;k--)
			{
				System.out.print((char)(asc--)+"");
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
		PatternTweentyTwoAscii p = new PatternTweentyTwoAscii(n);
	}

}

