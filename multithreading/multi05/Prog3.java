/* Program of join .
 * Using join in main Thread applying on Child Thread and thus ensuring the main Thread execution takes place only when child Thread execution takes place completely. */

class MyThread extends Thread{

	public void run(){

		for(int i=0;i<3;i++){
	
		System.out.println("Child Thread");
		}
	}
}

class Demo{

	public static void main(String[]  args) throws InterruptedException{
	
	MyThread mt = new MyThread();
	mt.start();
//	mt.join();We can write it here or inside for also or we can also use join() twice

	for(int i=0;i<3;i++){
	
	mt.join();
	System.out.println("Parent Thread");
	}
	
	}

}
