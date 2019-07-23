import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int x = s.nextInt();
		
		A a = new A() ;
		int c = 0;
		
		while (x >9) {
			c = a.add(x);
			x = c;
			
		}
		System.out.println(c); 
		
		 
	}

}
class A{
	
	 int add (int z) 
	 {
		 int r = 0;
		 while (z!=0)
		   {
				int y = z % 10;
				r = r + y;
				z /=10;
		    }
		 return r;
	 }
}