package pack;

class Sample {
	

	public  Sample() {
		System.out.println(A.y+ " "+new B().i);
	}
	
	static class A {
		private static int y = 10;
		public static void sample2() {
			System.out.println("Sample class A i/nner class sample2 static method" + y);
		}
	}

	class B extends A {
		private  int i = 20;

		public  void sample3() {
			System.out.println("Sample class B inner class sample3 static method" + i);
		}
	}
}

public class OuterClass {
	public static void main(String[] args) {
		Sample.B s = new Sample().new B();
		Sample.B.sample2();
		s.sample3();
	 	//System.out.println(s.);

	}
}
