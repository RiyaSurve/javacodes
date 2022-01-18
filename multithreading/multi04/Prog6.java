
/* Using the sleep method in main  method.
 * Sleep method is of THread class which throws Interrupted EXception 
 * Using this method we can control the threads.
 *
 * Scenario 1: If we try to do th.sleep  inside ThreadDEmo class it gives error as it cannot 
 * find th symbol.
 *
 * Scenario 2:If we write only sleep(2000) it shows  Interrupted exception needs to be thrown
 * or caught.
 *
 * Scenario 3: If we do public void run() throws InterruptedException{} then also it gives 
 * errror because it tells run() method of runnable interface does not throw exception
 * internally.So who are we to throw that???
 * So the sleep method should be written in try catch block 
 */
class ThreadDemo extends Thread{

	// Sc 3Public void run() throws InterruptedException {}

	public void run(){

	
	System.out.println("In run method!!");
	System.out.println("ThreadName = " + Thread.currentThread().getName());	
	//Sc 2: th.sleep // Cannot find symbol
//	Sc 3: sleep(2000); Throws interrupted exception

	for(int i=0;i<3;i++){


	try{
		sleep(2000);
	} catch(InterruptedException ie){
	}
	
	System.out.println("Child Thread");
	
	}



	}



}

class Demo{

	public static void main(String [] args){
	
	ThreadDemo th = new ThreadDemo();
	th.start();

	System.out.println("In main method!!");
	System.out.println("ThreadName = " + Thread.currentThread().getName());



	}


}
