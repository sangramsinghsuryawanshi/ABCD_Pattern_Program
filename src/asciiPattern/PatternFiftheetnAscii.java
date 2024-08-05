package asciiPattern;

import java.util.Scanner;

public class PatternFiftheetnAscii 
{
	PatternFiftheetnAscii(int n)
	{
		
		for(int i=1;i<=n;i++)
		{
			int ascii=65;
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++)
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
		PatternFiftheetnAscii p = new PatternFiftheetnAscii(n);
	}

}
