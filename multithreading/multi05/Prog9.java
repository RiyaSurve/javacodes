/*What if both threads use yield.
 * Obviously mixing of output is going to happen.
 * And mixing of output happens by obvious when we use multiThreading.So yield method is not
 * used much.
 * Yield method doesnot throw Exception*/

class MyThread extends Thread{

	static Thread mainThread = null;

	public void run(){

		mainThread.yield();
	
	for(int i=0;i<3;i++){
	
		System.out.println("Child Thread");
	
	}
	}

}

class Demo{
	public static void main(String[] args){
	
		MyThread mt = new MyThread();
		mt.start();

		MyThread.mainThread = Thread.currentThread();

		mt.yield();
		

		for(int i=0;i<3;i++){
		
		System.out.println("ParentThread");
		}
	
	}

}
