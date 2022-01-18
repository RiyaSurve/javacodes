/*Using yield method*/

class MyThread extends Thread{

	public void run(){
	
	for(int i=0;i<3;i++){
	
		System.out.println("Child Thread");
	
	}
	}

}

class Demo{
	public static void main(String[] args){
	
		MyThread mt = new MyThread();
		mt.start();
		mt.yield();

		for(int i=0;i<3;i++){
		
		System.out.println("ParentThread");
		}
	
	}

}
