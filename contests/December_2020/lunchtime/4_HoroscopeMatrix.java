/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */


// using O(n2) space
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        int n=sc.nextInt();
	        int m=sc.nextInt();
	        HashMap<Integer,HashMap<Integer,Integer>> map=new HashMap<>();
	        int[][] mat=new int[n][m];
	        HashSet<Integer> nod=new HashSet<>();
	        for(int i=0;i<n;i++)
	        {
	            for(int j=0;j<m;j++)
	            {
	                int val=sc.nextInt();
	                mat[i][j]=val;
	                if(!map.containsKey(j-i))
	                    map.put(j-i,new HashMap<Integer,Integer>());
	                map.get(j-i).put(val,map.get(j-i).getOrDefault(val,0)+1);
	                if(map.get(j-i).size()>1)
	                    nod.add(j-i);
	            }
	        }
	        int nq=sc.nextInt();
	        while(nq-->0)
	        {
	            int x=sc.nextInt()-1;
	            int y=sc.nextInt()-1;
	            int v=sc.nextInt();
	            int val=mat[x][y];
	            map.get(y-x).put(val,map.get(y-x).get(val)-1);
	            map.get(y-x).put(v,map.get(y-x).getOrDefault(v,0)+1);
	            if(map.get(y-x).get(val)==0)
	                map.get(y-x).remove(val);
	            mat[x][y]=v;
	            if(map.get(y-x).size()==1)
	            {
	                if(nod.contains(y-x))
	                    nod.remove(y-x);
	            }
	            else
	                nod.add(y-x);
	            if(nod.size()==0)
	                System.out.println("Yes");
	            else
	                System.out.println("No");
	        }
	    }
	}
}



// using O(1) space
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[][] mat=new int[n][m];
            int count=0;  // for counting different elements at diagonal
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    mat[i][j]=sc.nextInt();
                    if(i>0 && j>0)
                    {
                        if(mat[i][j]!=mat[i-1][j-1])
                            count++;
                    }
                }
            }
            int q=sc.nextInt();
            while(q-->0)
            {
                int x=sc.nextInt()-1;
                int y=sc.nextInt()-1;
                int v=sc.nextInt();
                
                if(mat[x][y]!=v)
                {
                    if(x-1>=0 && y-1>=0 && v==mat[x-1][y-1] && mat[x][y]!=mat[x-1][y-1])
                        count--;
                    if(x+1<n && y+1<m && v==mat[x+1][y+1] && mat[x][y]!=mat[x+1][y+1])
                        count--;
                    if(x-1>=0 && y-1>=0 && v!=mat[x-1][y-1] && mat[x][y]==mat[x-1][y-1])
                        count++;
                    if(x+1<n && y+1<m && v!=mat[x+1][y+1] && mat[x][y]==mat[x+1][y+1])
                        count++;
                }
                mat[x][y]=v;
                System.out.println((count==0)?"Yes":"No");
            }
		}
	}
}
