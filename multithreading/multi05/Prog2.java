/*Child Thread tells main thread until and unless your execution is not completed I will not 
 * execute myself even if there is sleep .So How do we do that.
 * * 
Program of  Join and sleep of threads and until and unless main Thread Execution completes child
thread will not execute*/


class MyThread extends Thread {

	static Thread mainThread = null;

	public void run(){

				 /*main.join . So now child thread tells main thread.Main
				      Thread I have applied join on you.So I will execute only
				      when your complete execution happens*/

		for(int i=0;i<3;i++){

			try{	
				mainThread.join();
				sleep(2000);
			}catch(InterruptedException ie){

			}
			System.out.println("Child Thread");
		}

	}
}

class JoinThread{

	public static void main(String[] args) throws InterruptedException{

		MyThread mt = new MyThread();
		mt.start();

	//	Thread.currentThread(); main

		 MyThread.mainThread = Thread.currentThread(); /*copying name of main thread to
							    static variable of Thread class.
							    As it is static we can call it
							    directly by class name*/

		for(int i=0;i<3;i++){

			mt.sleep(2000);
			System.out.println("Parent Thread");

		}

	}


}
