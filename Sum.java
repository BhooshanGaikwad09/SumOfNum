package bg;


	import java.util.Scanner;
	public class Sum {
	
	    public static void main(String arg[])
	     {
	        Scanner sc;
		sc=new Scanner(System.in);
		int num,rem,sum=0,number;
		System.out.println("enter a number:   ");
		num=sc.nextInt();
	 	number=num;
		while(num!=0)
		{
		rem=num%10;
		sum+=rem;
		num=num/10;

		}
		System.out.println("addition of all digits of  "+ number +" is "+sum);
	      }
	}

