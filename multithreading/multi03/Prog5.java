//Setting name of the thread and changing name of the main thread

class ThreadDemo extends Thread {
	public void run(){

		System.out.println("THreadName = " + Thread.currentThread().getName());

		for(int i=0;i<3;i++){

			System.out.println("Core2Web");
		}

	}



}

class Demo {


	public static void main(String[] args){

		ThreadDemo th = new ThreadDemo();
		th.start();
		th.setName("Riya Thread"); //changing default name of thread0 as thread Riya

		
		Thread.currentThread().setName("Main new");//changing name of main thread
		System.out.println("Thread name = "+Thread.currentThread().getName());

		for(int i=0;i<3;i++){

			System.out.println("Core2Web");

		}

	}


}
