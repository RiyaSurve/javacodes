/*What if both threads throw join on each other.
 * Then at this case Deadlock scenario happens.That is both the threads are waiting for each other So we should never write both joins .
 * No output because both the threads are waiting for each other to complete which is never going
 * to happen.Thus we need to kill the process.by ctrl c*/

class MyThread extends Thread{

	static Thread mainThread = null;

	public void run(){


		try{

		mainThread.join();

		}catch (InterruptedException ie){
		
		}
		

		for(int i=0;i<3;i++){
			
			System.out.println("Child Thread!!");
		
		}
	

	}

}

class Demo{

	public static void main(String[] args) throws InterruptedException{
	
	MyThread mt = new MyThread();
	mt.start();

	MyThread.mainThread = Thread.currentThread();

	mt.join();

	for(int i = 0;i<3;i++){
	
	System.out.println("Parent Thread");
	}
	
	}

}
