/* Program of join .
 * Using join in main Thread applying on Child Thread and thus ensuring the main Thread execution takes place only when child Thread execution takes place completely.
 * 
 * Same code as Prog3 just handling the InterruptedException in main using try catch */

class MyThread extends Thread{

	public void run(){

		for(int i=0;i<3;i++){
	
		System.out.println("Child Thread");
		}
	}
}

class Demo{

	public static void main(String[]  args){
	
	MyThread mt = new MyThread();
	mt.start();

	for(int i=0;i<3;i++){

	try{
	mt.join();
	} catch (InterruptedException ie){

	}
	
	System.out.println("Parent Thread");
	}
	
	}

}
