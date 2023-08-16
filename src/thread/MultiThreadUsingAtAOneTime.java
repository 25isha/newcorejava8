package thread;

class ThreadFirst implements Runnable{ // Runnable is interface.....in here we using implement we have to define 3 class than program will run

	@Override
	public void run() {
		System.out.println("Enter First Thread: ");
		for(int i = 0;i<5;i++){
			System.out.println(i);
		}
		
		
	}
	
}

class ThreadSecond extends Thread{
	
	public void run() {
		System.out.println("Enter Second Thread: ");
		for ( int i=5;i<=10;i++){
			System.out.println(i);
		}
		
	}
	
}

class ThreadThird extends Thread{
	
	public void run() {
		int num=1;
		System.out.println("Enter Third Thread: ");
		for (int i=1;i<=10;i++){
			System.out.println(num*i);
		}
	
	}
}
public class MultiThreadUsingAtAOneTime {

	public static void main(String[] args) {
		ThreadFirst tf= new ThreadFirst();
		Thread t= new Thread(tf);
		t.start();
		ThreadSecond tf1=new ThreadSecond();
		tf1.start();
		ThreadThird tf2 = new ThreadThird();
		tf2.start();

	}

}
