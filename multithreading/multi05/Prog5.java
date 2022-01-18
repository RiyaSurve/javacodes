/* Program of join .
 * Using join in child Thread applying on main Thread and thus ensuring the child Thread execution takes place only when Parent Thread execution takes place completely.
 * Thus main thread execution will happen first and only then child Thread execution will happen
 * */

class MyThread extends Thread{

	static Thread mainThread = null;

	public void run(){

		try{

		mainThread.join();

		}catch(InterruptedException ie){

		}	

		for(int i=0;i<3;i++){
	
		System.out.println("Child Thread");
		}
	}
}

class Demo{

	public static void main(String[]  args) {
	
	MyThread mt = new MyThread();
	mt.start();

	MyThread.mainThread = Thread.currentThread();


	for(int i=0;i<3;i++){

	System.out.println("Parent Thread");
	}
	
	}

}
