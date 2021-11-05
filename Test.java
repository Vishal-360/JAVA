package Abstraction;

public class Test extends Shape {
	
	Test(){
		System.out.println("Test class constructor");
	}
	

	public static void main(String[] args) {
		
		/*Shape s=new Test();
		s.drawing();
		s.fill();*/
		
		Test t=new Test();
	

	}

	@Override
	void drawing() {
		System.out.println("Shape----drawing");
		
	}

}
