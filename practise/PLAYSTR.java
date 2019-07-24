/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PLAYSTR
{
	//Playing with Strings Problem Code: PLAYSTR
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int N,T=0;
	    String R,S, result;
	    try{
	        if(sc.hasNextInt())
	   	    T=sc.nextInt();
		while(T-->0)
		{  
		  	 N=sc.nextInt();
		    S=sc.next();
		    R=sc.next();
		    VerifyString(R,S);
		 }
		 }
		catch(Exception e)
		{
		   System.out.println("error occured");
		}
	}
/*Using Buffered reader
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 	    
try{
		T = Integer.parseInt(br.readLine());
		}catch(Exception e){}

while(T-->0)
		
{  		  	
N=Integer.parseInt(br.readLine());		    
S=br.readLine();
		    
R=br.readLine();
VerifyString(R,S);	
}	
*/    
	        
	
	
	public static void VerifyString(String A, String B)
	{
	    char test[]=A.toCharArray(); 	//Storing string to character array
        Arrays.sort(test);				//sorting array
        char test1[]=B.toCharArray();	//Storing string to character array
        Arrays.sort(test1);				//sorting array
        if(Arrays.equals(test,test1))	//comparing arrays for eqaulity using Arrays.equals( ) method
               System.out.println("YES");
        else
                System.out.println("NO");
	}
}	
/* counting the number of 1's or 0's in both strings and if equal return yes else no
Public static void VerifyString(String R, String S,int N)
{
int count1=0;
			
int count2=0;

for(int i=0;i<N;i++)
			
{
				
if(R.charAt(i)=='1')
		//if(R.charAt(i)=='0')
		
count1++;

if(S.charAt(i)=='1')
		//if(S.charAt(i)=='0')		
count2++;

}
	
if(count1==count2)            //if(( count1 == count2 )&& ( n-count1 == n-count2 ))
  
  System.out.println("YES");

else

System.out.println("NO");
}
	
}
