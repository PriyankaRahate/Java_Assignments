package day2;
import java.util.Scanner;
public class Numword {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int num=sc.nextInt();
		if(num<=1)
		{
			System.out.println("one");
		}
		else if(num<=10)
		{
			System.out.println("ten");
		}
	else if(num<=100)
	{
		System.out.println("hundred");
	}
	else if (num<=1000)
	{
		System.out.println("thousand");
	}
	sc.close();
		// TODO Auto-generated method stub

	}

}

