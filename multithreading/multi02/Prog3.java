class ThreadDemo extends Thread{

	public void gun(){
	
		//main
		System.out.println("THread name = " +Thread.currentThread().getName());
		for(int i=0;i<3;i++){
		
			System.out.println("Biencaps");
		
		}
	
	}

}


class Prog3{
	
	public static void main(String[] args){
	
	ThreadDemo th = new ThreadDemo();
	th.start();
	th.gun();

	System.out.println("Thread name = " +Thread.currentThread().getName());
	//main
	
	for(int i=0;i<3;i++){
	
		System.out.println("Core2Web");	
	}

	
	}


}
