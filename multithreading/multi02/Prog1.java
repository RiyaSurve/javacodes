class ThreadDemo extends Thread{

	public void run(){
	
		//thread 0
		System.out.println("THread name = " +Thread.currentThread().getName());
		for(int i=0;i<3;i++){
		
			System.out.println("Biencaps");
		
		}
	
	}

}


class Prog1{
	
	public static void main(String[] args){
	
	ThreadDemo th = new ThreadDemo();
	th.start();

	System.out.println("Thread name = " +Thread.currentThread().getName());
	//main
	
	for(int i=0;i<3;i++){
	
		System.out.println("Core2Web");	
	}

	
	}


}
