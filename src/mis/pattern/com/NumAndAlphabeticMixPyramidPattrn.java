/*
 *      1
      A 2 B
    C 3 D 4 E
  F 5 G 6 H 7 I
J 8 K 9 L 0 M 1 N
 */
package mis.pattern.com;

import java.util.Scanner;

public class NumAndAlphabeticMixPyramidPattrn 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number: ");
		int n= sc.nextInt();
		System.out.println("-------------------");
		int ascii=65;
		int r=1;
		for(int i=1;i<=n;i+=2)
		{
			for(int k=n;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				if(i==1)
				{
					System.out.print(r+++" ");
				}
				else 
				{
					if(j%2==0)
					{
						System.out.print(r+++" ");
						if(r==10)
						{
							r=0;
						}
					}
					else
					{
						System.out.print(((char)ascii++)+" ");
					}
				}
			}
			System.out.println();
		}
	}

}
