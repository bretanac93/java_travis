public class Main implements Runnable {

	private int nsv = 100;
	
	public static void main(String[] args) {
		
		Main ts = new Main();

		Thread t1 = new Thread(ts);
		Thread t2 = new Thread(ts);
		Thread t3 = new Thread(ts);

		t1.start();
		t2.start();
		t3.start();
	}

	public void run() {
		nsv += 100;
		System.out.println("Value: " + nsv);
	}
}
