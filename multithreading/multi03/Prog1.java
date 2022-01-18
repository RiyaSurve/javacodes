//Normal code
//Scenario 1

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

		System.out.println("Thread name = "+Thread.currentThread().getName());

		for(int i=0;i<3;i++){

			System.out.println("Core2Web");

		}

	}


}
