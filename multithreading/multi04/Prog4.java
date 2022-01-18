
/* Creating thread using Runnable Interface 
 * Step 1: Create object of the class which is implementing Runnable interface.
 * Step 2:Create an obj of Thread class and pass the obj name of upper class as a parameter.
 * Whenever we create an object of Thread class default constructor is called inside which
 * thread initialization takes place.
 * NOw,Thread class also has a parameterized constructor in which we can pass the obj of
 * other class.So we will create an object of upper class which implements runnable interface and 
 * pass that object as a parameter to our Thread class.
 * And then with THread class obj call the start method.In this manner we create a thread using 
 * Runnable interface
 * */
class ThreadDemo implements Runnable{

	public void run(){
	
	System.out.println("ThreadName = " + Thread.currentThread().getName());
	System.out.println("In run method!!");
	
	}



}

class Demo{

	public static void main(String [] args){
	
	ThreadDemo th = new ThreadDemo();
	Thread t = new Thread(th);

	t.start();

	System.out.println("ThreadName = " + Thread.currentThread().getName());
	System.out.println("In main method!!");
	
	}


}
