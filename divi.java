import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int num;
	Scanner in=new Scanner(System.in);
	System.out.println("enter a number");
	num=in.nextInt();
	if(num%13==0)
	{
		System.out.println(num+"is divisible by 13");
	}
	else
	{
		System.out.println(num+"is not divisible by 13");
	}
	}
}
