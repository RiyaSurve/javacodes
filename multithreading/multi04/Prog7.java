/*Including exceptions in main and Thread class*/


class ThreadDemo extends Thread{

	public void run(){

		for(int i=0;i<3;i++){

			try{
				sleep(2000);
			} catch(InterruptedException ie){  //Telling thread 0 to wait

			}

			System.out.println("Child thread");	

		}

	}

}

class Demo{

	public static void main(String[] args) {

		ThreadDemo th = new ThreadDemo();
		th.start();

		for(int i=0;i<3;i++){

			try{

			th.sleep(2000);  //telling the main thread to wait.

			} catch (InterruptedException ie){
			}
			System.out.println("Parent Thread");
		}


	}

}
