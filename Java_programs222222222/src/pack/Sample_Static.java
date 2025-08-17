package pack;

import java.io.FileNotFoundException;
import java.io.IOException;

class A2 {
	void display2() {
		System.out.println("Display2 - A2 class");
	}
	 void display() throws Exception{
		System.out.println("Static method in - AA class");
	}
}

class B2 extends A2 {
	 void display() throws FileNotFoundException {
		System.out.println("Static method in - BB class");
	}
}

public class Sample_Static {
	public static void main(String[] args) throws Exception{
		A2 b = new B2();
		b.display();
		b.display2();
		

	}
}
