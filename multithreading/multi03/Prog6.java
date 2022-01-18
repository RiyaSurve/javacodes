//Setting and getting priority of thread

class ThreadDemo extends Thread {
	public void run(){

		System.out.println("THreadName = " + Thread.currentThread().getName());
		System.out.println("THreadPrority = " + Thread.currentThread().getPriority());
		for(int i=0;i<3;i++){

			System.out.println("Core2Web");
		}

	}



}

class Demo {


	public static void main(String[] args){

		ThreadDemo th = new ThreadDemo();
		th.start();
		th.setName("Riya Thread"); //changing name of default thread to thread Riya
		th.setPriority(7);//setting priority of new Thread as 7

		
		Thread.currentThread().setName("Main new");//changing name of main thread
		System.out.println("Thread name = "+Thread.currentThread().getName());

		//changing the priority of main Thread
		Thread.currentThread().setPriority(8);
		System.out.println("Thread Priority of main = " +Thread.currentThread().getPriority());

		for(int i=0;i<3;i++){

			System.out.println("Core2Web");

		}

	}


}
