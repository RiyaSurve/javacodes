
/* Using the sleep method in main  method.
 * Sleep method is of THread class which throws Interrupted EXception 
 * Using this method we can control the threads.*/
class ThreadDemo extends Thread{

	public void run(){
	
	System.out.println("In run method!!");
	System.out.println("ThreadName = " + Thread.currentThread().getName());	
	}



}

class Demo{

	public static void main(String [] args) throws InterruptedException{
	
	ThreadDemo th = new ThreadDemo();
	th.start();

	System.out.println("In main method!!");
	th.sleep(2000); //2 sec
	System.out.println("ThreadName = " + Thread.currentThread().getName());



	}


}
