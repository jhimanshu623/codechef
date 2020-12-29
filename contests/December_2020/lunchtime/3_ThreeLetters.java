/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			String str=sc.next();
			int[] freq=new int[26];
			for(int i=0;i<str.length();i++)
				freq[str.charAt(i)-'a']++;
			int p=0;
			for(int i=0;i<26;i++)
				p+=freq[i]/2;
			int ans=Math.min(str.length()/3,p);
			System.out.println(ans);
		}
	}
}
