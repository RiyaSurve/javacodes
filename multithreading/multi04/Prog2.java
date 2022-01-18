
/* Creating Two Threads from main
 * As we are creating multiple threads from main .All created threads will override the same 
 * run() method  */
class ThreadDemo extends Thread{

	public void run(){
	
	
	System.out.println("ThreadName = " + Thread.currentThread().getName());
	
	}



}

class Demo{

	public static void main(String [] args){
	
	ThreadDemo th1 = new ThreadDemo();
	th1.start();

	System.out.println("ThreadName = " + Thread.currentThread().getName());

	ThreadDemo th2 = new ThreadDemo();
	th2.start();
	}


}
