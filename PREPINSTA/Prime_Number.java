
import java.util.Scanner;
public class Prime_Number {
	public static void main(String[]args)
	{
		int count=0;
		System.out.print("enter your number:");
		Scanner x = new Scanner(System.in);
		int num = x.nextInt();
		
		if(num<2)
		{
			System.out.println("not a prime number");
		}
		else
            {
			for(int i=1;i<=num;i++)
			{
				if(num%i == 0)
			    		count++;
			}
		}

		if (count ==2)
			System.out.println("prime number");
  		else
			System.out.println("not a prime number");
			x.close();
	}
         



    
}
