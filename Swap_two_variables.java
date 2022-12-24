public class Swap_two_variables
{
	public static void main(String[] args)
	{
		String x="Water";
		String y="Red-water";

		String temp;

		temp=x;
		x=y;
		y=temp;

		System.out.println("x: "+x);
		System.out.println("y: "+y);
	}
}