class Ets{
	protected void on() {
		System.out.println("The device is ON");
	}
	
	void off() {
		System.out.println("The device is OFF");
	}
	
	void damaged() {
		System.out.println("The device is Damaged");
	}
}

class Tv extends Ets{
	protected void t()
	{
		System.out.println("Tv called");
	}
}

class Fridge extends Ets{
	private void r()
	{
		System.out.println("Fridge called");
	}
}

class Radio extends Ets{
	void r()
	{
		System.out.println("Radio call");
	}
}
public class D1Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tv t1 = new Tv();
		Fridge f1 = new Fridge();
		Radio r1 = new Radio();
		t1.on();
		r1.off();
		f1.damaged();
		r1.r();

	}

}
