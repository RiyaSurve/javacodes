class DaemonDemo extends Thread{


	public void run(){
	
	for(int i=0;i<5000;i++){

		try{
		
		Thread.sleep(5000);
		}

		catch(InterruptedException ie){
		
		
		}
	
	System.out.println(Thread.currentThread().getName());
	
	}
	
	
	}
}

class Demo{

public static void main(String[] args)throws Exception {

	DaemonDemo dt1 = new DaemonDemo();
	DaemonDemo dt2 = new DaemonDemo();
	DaemonDemo dt3 = new DaemonDemo();

	dt1.start();
	dt1.setDaemon(true);

	dt2.start();
	dt3.start();


}
}



