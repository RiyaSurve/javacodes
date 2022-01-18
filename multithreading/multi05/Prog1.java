/*Main Thread tells child thread until and unless your execution is not completed I will not 
 * execute myself even if there is sleep 
 * Program using join and sleep both and applying join on child thread from main thread which
 * tells that unless and until child execution takes place completely main thread will not execute itself*/


class MyThread extends Thread {

	public void run(){

		for(int i=0;i<3;i++){

			try{
				sleep(2000);
			}catch(InterruptedException ie){

			}
			System.out.println("Child Thread");
		}

	}
}

class JoinThread{

	public static void main(String[] args) throws InterruptedException{

		MyThread mt = new MyThread();
		mt.start();

		mt.join();//This line will be executed my main Thread.Thus main thread tells child thread
		//I will wait till your complete execution happens 


		for(int i=0;i<3;i++){

			mt.sleep(2000);
			System.out.println("Parent Thread");

		}

	}


}
