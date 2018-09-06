
class Message implements Runnable{
		
	@Override
	public void run()
	{
		System.out.println("Hello, how are you?");
	}
}
public class TestRunnableInterface {
	
	public static void main(String[] args) {
		Message msg = new Message();
		//msg.run();
		Thread t = new Thread(msg);
		t.start();

	}

}
