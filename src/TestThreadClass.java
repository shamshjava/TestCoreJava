class Message1 extends Thread{
		
	@Override
	public void run()
	{
		System.out.println("Hi, how are you?");
	}
}
public class TestThreadClass {

	public static void main(String[] args) {
		Message1 msg = new Message1();
		//msg.run();
		msg.start();

	}

}
