
/*If we call start method again it gives RunTime exception as IllegalThreadState Exception
 * because once created thread and started cannot go back again in the same state.
 * If you want to use the start method again then create another thread and then call the start
 * method */
class ThreadDemo extends Thread{

	public void run(){
	
	System.out.println("In run method!!");
	
	}



}

class Demo{

	public static void main(String [] args){
	
	ThreadDemo th = new ThreadDemo();
	th.start();

	System.out.println("In main method!!");
//	th.start();
	}


}
