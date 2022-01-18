class ThreadDemo extends Thread{

	//As there is no run method overrided it not go inside this block only
	public void gun(){
	

		System.out.println("THread name = " +Thread.currentThread().getName());
		for(int i=0;i<3;i++){
		
			System.out.println("Biencaps");
		
		}
	
	}

}


class Prog2{
	
	public static void main(String[] args){
	
	ThreadDemo th = new ThreadDemo();
	th.start();
	
	//main
	System.out.println("Thread name = " +Thread.currentThread().getName());

	
	for(int i=0;i<3;i++){
	
		System.out.println("Core2Web");	
	}

	
	}


}
