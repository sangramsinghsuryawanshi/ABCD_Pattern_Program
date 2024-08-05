package asciiPattern;

import java.util.Scanner;

public class PatternNineteenAscii 
{
	PatternNineteenAscii(int n)
	{
		int a=70;
		for(int i=1;i<=n;i++)
		{
			int ascii=a;
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(ascii++)+" ");
			}
			a--;
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
		PatternNineteenAscii p = new PatternNineteenAscii(n);
	}

}
