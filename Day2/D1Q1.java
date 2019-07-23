public class D1Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Var v = new Var(6);
		System.out.println("Value of variable is " + v.getA());
	}

}

class Var{
	
	private int a;
	
	Var(int a)
	{
		this.a = a;
	}
	

	public int getA() {
		return a;
	}

	
	
}