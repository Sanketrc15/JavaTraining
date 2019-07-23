import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number");
		int x = s.nextInt();
		System.out.println("Enter the first number");
		int y = s.nextInt();
		int c = 0;
		while(y!=0)
		{
			c = x + c;
			--y;
		}
		System.out.println(c);
	}

}
