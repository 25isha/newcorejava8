package thread;

class Multhithread extends Thread{
	
	public void run() {
		System.out.println("Running thread name"+ this.currentThread().getName());
		System.out.println("Running thread Priority"+ this.currentThread().getPriority());
		//System.out.println();
	}
}

public class MultiThread {

	public static void main(String[] args) {
		Multhithread m= new Multhithread();
		m.setName("First Thread");
		m.setPriority(Thread.MIN_PRIORITY);
		//System.out.println();
		Multhithread m1= new Multhithread();
		m1.setName("Second Thread");		
		m1.setPriority(Thread.MAX_PRIORITY);
		//System.out.println();
		Multhithread m2= new Multhithread();
		m2.setName("Third Thread");
		m2.setPriority(Thread.NORM_PRIORITY);
		m.start();
		m1.start();
		m2.start();
		
	}

}
