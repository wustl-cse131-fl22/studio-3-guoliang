package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Input n");
		int n=in.nextInt();
		boolean[] prime=new boolean[n];		
		for(int i=2;i<=n;i++) 
		{
			double k=Math.sqrt(i);
			int a=1;
			for(int j=2;j<=k;j++)
			{
				if(i%j==0)
				{
					a=a+1;					
				}
			}
			if(a>1)
			{
				prime[i-2]=false;
			}
			else
			{
				prime[i-2]=true;
			}
			
			
			
		}
		for(int i=2;i<=n;i++)
		{
			if(prime[i-2])
			{
			System.out.println(i);
			}
		
			
		}
			
				
		

	}

}
