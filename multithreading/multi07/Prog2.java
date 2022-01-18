import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

// import java.util.concurrent.*;

class ThreadDemo implements Runnable {

	String worknum = null;

	ThreadDemo(String worknum){
	
		this.worknum = worknum;
	
	}

public void run(){


	System.out.println(Thread.currentThread().getName()+"startTask" + worknum);

	System.out.println(Thread.currentThread().getName() + "Endtask" + worknum);



}


}

class Demo{
	
	public static void main(String[] args){
	
	ExecutorService es = Executors.newFixedThreadPool(10);

	for(int i=0;i<10;i++){
	
	ThreadDemo work = new ThreadDemo(""+i);

	es.execute(work);
	
	}
	es.shutdown();
	
	}

}

