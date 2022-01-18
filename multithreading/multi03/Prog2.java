/*Scenario 2:What if we dont call start() method and directly call run() method
 *
 * By doing this thread is born but not actually in work because we havent called our start method.
 * And that start method is responsible for giving the thread the responsibility to override
 * the run() method which we have defined.Thus no error and our main thread only will run 2
 * for loops.New thread will only be created and not used*/

class ThreadDemo extends Thread {
	public void run(){

		System.out.println("THreadName = " + Thread.currentThread().getName());

		for(int i=0;i<3;i++){

			System.out.println("Biencaps");
		}

	}



}

class Demo {


	public static void main(String[] args){

		ThreadDemo th = new ThreadDemo();
		th.run();

		System.out.println("Thread name = "+Thread.currentThread().getName());

		for(int i=0;i<3;i++){

			System.out.println("Core2Web");

		}

	}


}
