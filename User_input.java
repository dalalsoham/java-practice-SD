import java.util.*;

public class User_input
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("What is your name? ");
		String name=sc.nextLine();
		System.out.println("What is your age? ");
		int age=sc.nextInt();

		//here change here we also write sc.nextLine()
		sc.nextLine();		
		System.out.println("What is your fav food? ");
		String food=sc.nextLine();
		
		System.out.println("Hello "+name);
		System.out.println("You are "+age+" years old");
		System.out.println("You like "+food);
	}
}