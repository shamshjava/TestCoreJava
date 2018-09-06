	
	class Greeting{
		public void syaHello() {
			System.out.println("Hello");
		}
	}
	
	class India{
		
		Greeting g = new Greeting() {
			public void syaHello() {
				System.out.println("Hi");
			}
		};
	}
	public class TestAnonymousClass {
		public static void main(String[] args) {

		India in = new India();
		in.g.syaHello();
	}

}
