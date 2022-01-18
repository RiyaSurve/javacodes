/*Daemon threads are helping threads.
 *They are present along with the user defined threads and its priority is 
 less.
 BY doing command jps -v we can see which process are currently running and
 by this command we get the process id of our program.
 For eg 6643 Demo

 Now,By entering command jstack 6643 we can see our actual program running
 and all the number of threads running and their name
 Those threads after whom #DaemonThread is written are called as Daemon threads
 in our program.Eg Finalizer,Compiler Thread,Signal Dispatcher,Reference 
 Handler etc.

 We can also see our user defined thread created as Thread 0 ,Thread1,
 However there are some threads which are Helping threads but are not Daemon
 Threads and whose priority is equal to our Thread.
 One such Eg of this Thread is DestroyJavaVM thread.

 We can make our user defined Thread as Daemon Thread by using the method 
 setDaemon(true).
 But it is usually adviced not to do so because this decreases the priority of
 our thread which is of no use.

 *
 * */


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

public static void main(String[] args){

	DaemonDemo dt1 = new DaemonDemo();
	DaemonDemo dt2 = new DaemonDemo();
	
	dt1.setDaemon(true);
	dt1.start();
	dt2.start();
}


}
