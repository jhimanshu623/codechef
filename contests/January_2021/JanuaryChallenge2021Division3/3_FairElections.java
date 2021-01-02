/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int solve(int n,int m,int[] arr1,int[] arr2)
    {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int sum1=0,sum2=0;
        for(int i=0;i<n;i++)
            sum1+=arr1[i];
        for(int i=0;i<m;i++)
            sum2+=arr2[i];
        
        int ans=0,i=0,j=m-1;
        while(i<arr1.length && j>=0 && sum1<=sum2)
        {
            int diff=arr2[j]-arr1[i];
            if(diff<=0)
                break;
            sum1+=diff;
            sum2-=diff;
            ans++;
            i++;
            j--;
        }
        if(sum1<=sum2)
            return -1;
        return ans;
    }

	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
            int m=sc.nextInt();
            int[] arr1=new int[n];
            int[] arr2=new int[m];
            for(int i=0;i<n;i++)
                arr1[i]=sc.nextInt();
            for(int i=0;i<m;i++)
                arr2[i]=sc.nextInt();
            System.out.println(solve(n, m, arr1, arr2));
		}
	}
}
