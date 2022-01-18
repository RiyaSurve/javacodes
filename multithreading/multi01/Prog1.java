/*getName method and currentTHread method belongs to lang package.So when writing these methods even if we dont write extends,it wont give error
 * Re return type of getName() is String.Also THread 
 class belongs to lang package.
 start method belongs to thread class thus we need to extend Thread classs.
 And as for calling start function we need tro create an object.This tells us 
 that start () method of thread class is static.Thus we need to create object
 of our class to call it.
 Also start method is inside Thread class i.e it is defined inside Thread class.
 So to use that method we need to extend that thread class.*/

class Prog1 extends Thread 
{

	public void run(){
	
		System.out.println("The run method!!!");
		String name = Thread.currentThread().getName();
		System.out.println("Thread name = " + name );
	
	}

public static void main(String[] args){

	Prog1 thread1 = new Prog1();
	thread1.start();
	System.out.println("Multithreading");
	String threadname = Thread.currentThread().getName(); 
	//class.method().method() is called method chaining
	
	System.out.println("ThreadName = " + threadname);

}




}
