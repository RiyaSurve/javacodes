/*Scenario 3: What if we overload run() method*/

class ThreadDemo extends Thread{

	public void run(){
	
	System.out.println("ThreadName = " + Thread.currentThread().getName());

	for(int i=0;i<3;i++){
	
		System.out.println("In run method");
	
	}
	}


//overloaded run method
	public void run(int n){
		
	
	System.out.println("ThreadName = " + Thread.currentThread().getName());

	for(int i=0;i<3;i++){
	
		System.out.println("In overloaded run method"); //This will be runned by main 
	//	method because we can only explicitly call the run method if we are overloading
	//	it
		
	
	}
		
	}
	
	


}

class Demo{

public static void main(String[] args){

	ThreadDemo th = new ThreadDemo();
	th.start();
	th.run(1);

	
	System.out.println("ThreadName = " + Thread.currentThread().getName());

	for(int i=0;i<3;i++){
	
		System.out.println("In main method");
	
	}

	


}


}
