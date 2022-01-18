
/* Creating first  thread from main  and second thread from the first thread.
 * This is one of the method of creating Multiple Threads. */
class NewThreadDemo extends Thread{

	public void run(){

		System.out.println("In second thread created by the first thread");
		System.out.println("ThreadName = " + Thread.currentThread().getName());

	}


}

class ThreadDemo extends Thread{

	public void run(){

		System.out.println("In first thread created from main");
		System.out.println("ThreadName = " + Thread.currentThread().getName());

		NewThreadDemo nw = new NewThreadDemo();
		nw.start();

	}



}

class Demo{

	public static void main(String [] args){

		ThreadDemo th1 = new ThreadDemo();
		th1.start();

		System.out.println("ThreadName = " + Thread.currentThread().getName());

	}


}
