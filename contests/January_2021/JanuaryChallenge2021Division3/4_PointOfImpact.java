/* package codechef; // don't place package name! */

import java.util.*;

import javax.lang.model.util.ElementScanner6;

import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void solve(int n,int k,int px,int py)
    {
        if(px==py)
        {
            System.out.println(n+" "+n);
            return;
        }
        int x,y;
        int units=Math.min(n-px,n-py);
        x=px+units;
        y=py+units;
        k--;
        k=k%4;
        while(k-->0)
        {
            int yd=0,xd=0;
            if(y==n)
            {
                yd=-1;
                xd=(x-px>0)?1:-1;
            }
            else if(y==0)
            {
                yd=1;
                xd=(x-px>0)?1:-1;
            }
            else if(x==n)
            {
                xd=-1;
                yd=(y-py>0)?1:-1;
            }
            else if(x==0)
            {
                xd=1;
                yd=(y-py>0)?1:-1;
            }

            if(xd==1 && yd==1)
            {
                units=Math.min(n-x,n-y);
                px=x;
                py=y;
                x+=units;
                y+=units;
            }
            else if(xd==1 && yd==-1)
            {
                units=Math.min(n-x,y-0);
                px=x;
                py=y;
                x+=units;
                y-=units;
            }
            else if(xd==-1 && yd==1)
            {
                units=Math.min(x-0,n-y);
                px=x;
                py=y;
                x-=units;
                y+=units;
            }
            else if(xd==-1 && yd==-1)
            {
                units=Math.min(x-0,y-0);
                px=x;
                py=y;
                x-=units;
                y-=units;
            }
        }
        System.out.println(x+" "+y);
    }

	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int k=sc.nextInt();
		    int x=sc.nextInt();
            int y=sc.nextInt();
            solve(n, k, x, y);
		}
	}
}
