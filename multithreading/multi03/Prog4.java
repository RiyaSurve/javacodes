/*Scenario 4:What if we override start() method 
 *
 * It will not go override the run() method by new thread because we havent called internal
 * start()
 * method.We have explicitly overrided our start method() So execution will be done by main
 * thread*/



class ThreadDemo extends Thread {


 	public void run(){

		System.out.println("THreadName = " + Thread.currentThread().getName());

		for(int i=0;i<3;i++){

			System.out.println("Biencaps");
		}

	}

	public void start(){
	
	System.out.println("In start method of us");
	System.out.println(Thread.currentThread().getName());
	}



}

class Demo {


	public static void main(String[] args){

		ThreadDemo th = new ThreadDemo();
		th.start();

		System.out.println("Thread name = "+Thread.currentThread().getName());

		for(int i=0;i<3;i++){

			System.out.println("Core2Web");

		}

	}


}
