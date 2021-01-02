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
		    int n=sc.nextInt();
            String str=sc.next();
            StringBuilder ans=new StringBuilder();
            int num=0;
            for(int i=0;i<n;i++)
            {
                if(i%4==0){
                    num=0;
                    num+=8*(str.charAt(i)-'0');
                }
                else if(i%4==1)
                    num+=4*(str.charAt(i)-'0');
                else if(i%4==2)
                    num+=2*(str.charAt(i)-'0');
                else{
                    num+=1*(str.charAt(i)-'0');
                    ans.append((char)(num+'a'));
                }
            }
            System.out.println(ans);
		}
	}
}
