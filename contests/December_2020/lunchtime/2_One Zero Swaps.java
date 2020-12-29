import java.util.*;
import java.lang.*;
import java.io.*;

// O(n2 solution)
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        int n=sc.nextInt();
	        char[] s=sc.next().toCharArray();
	        char[] p=sc.next().toCharArray();
	        
	        int i=0;
	        for(;i<n;i++)
	        {
	            if(s[i]!=p[i])
	            {
	                if(s[i]=='0' || i==n-1)
                    {
                        System.out.println("No");
                        break;
                    }
                    else
                    {
                        int j=i+1;
                        while(j<n && s[j]!='0')
                            j++;
                        if(j==n)
                        {
                            System.out.println("No");
                            break;
                        }
                        else
                        {
                            s[i]='0';
                            s[j]='1';
                        }
                    }
	            }
	        }
	        if(i==n)
	            System.out.println("Yes");
	        
	    }
	}
}


// O(n) solution using prefix sum
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        int n=sc.nextInt();
	        char[] s=sc.next().toCharArray();
	        char[] p=sc.next().toCharArray();
	        
            int psd=0;  // prefix sum difference
            int i=0;
	        for(;i<n;i++)
	        {
                if(s[i]=='1')
                    psd++;
                if(p[i]=='1')
                    psd--;
                if(psd<0)
                    break;
            }
            if(i==n && psd==0)
                System.out.println("Yes");
            else
                System.out.println("No");
	    }
	}
}
