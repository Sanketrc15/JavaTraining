import java.util.* ;
public class Q1 
{

	public static void main(String...args) 
	{
		// int x = 5004;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int x = s.nextInt();
		 int r = 0;
		while (x!=0)
		{
			int y = x%10;
			r = r *10 + y;
			x /=10;
			
		}
		
		while(r != 0)
		{	
			int num = r % 10 ;
			r = r / 10 ;
			
				
		switch (num)
		{
			case 1:
			{
				System.out.print("One ");
				break;
			}
		
			case 2:
			{
				System.out.print("Tw0 ");
				break;
			}
			
			case 3:
			{
				System.out.print("Three ");
				break;
			}
			
			case 4:
			{
				System.out.print("Four ");
				break;
			}
			
			case 5:
			{
				System.out.print("Five ");
				break;
			}
			
			case 6:
			{
				System.out.print("Six ");
				break;
			}
			
			case 7:
			{
				System.out.print("Seven ");
				break;
			}
			
			case 8:
			{
				System.out.print("Eight ");
				break;
			}
		
			case 9:
			{
				System.out.print("Nine ");
				break;
			}
			
			default:
			{
				System.out.print("Zero ");
				break;
			}
		
			}
		}
	}
}
