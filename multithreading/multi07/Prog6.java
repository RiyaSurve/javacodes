/*Crearting thread using newSingleThreadExecutor
 * In newSingleThreadExecutor only one thread will manage all the tasks.
 * We dont have to pass parameter. */

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

class ThreadDemo implements Runnable{

	String worknum = null;

	ThreadDemo(String worknum){
	
		this.worknum = worknum;
	
	}

	public void run(){

		System.out.println(Thread.currentThread().getName()+"start task" + worknum);
		System.out.println();
		System.out.println(Thread.currentThread().getName()+"endTask"+ worknum);
	}

}

class Demo {

	public static void main(String[] args){
	
	ExecutorService es = Executors.newSingleThreadExecutor();
	
	

	for(int i=0;i<10;i++){

	ThreadDemo work = new ThreadDemo(""+i);
	es.execute(work);
	}

	es.shutdown(); /*If we dont use shutdown then ThreadPool with active threads remain as it 			  is. ctrl c kill the process.In big applications like Twitter the 
			server never shuts down otherwise all threads will be no more.And then
			who will handle the continous coming taks.*/
	}


}
