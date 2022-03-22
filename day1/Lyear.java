package day1;
import java.util.Scanner;
public class Lyear {
	public static void main(String[] args) 
	{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter year: ");
				int y=sc.nextInt();
				if(y%4==0)
				{
					System.out.println("This is leap year");
				}
				else
					if(y%400==0)
					{
						System.out.println("This is Leap Year");
					}
					else
						if(y%100!=0)
						{
							System.out.println("This is leap year");
						}
						else
						{
							System.out.println("Not leap year");
						}
				sc.close();
						
				}
				
			
		

	}


