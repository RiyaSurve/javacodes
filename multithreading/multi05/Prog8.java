/*Using yield method in child Thread and giving the main Thread a slice of time to execute first.
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
		

		for(int i=0;i<3;i++){
		
		System.out.println("ParentThread");
		}
	
	}

}
