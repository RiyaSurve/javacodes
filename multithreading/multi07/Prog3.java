import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

class ThreadDemo implements Runnable{

	String worknum = null;

	ThreadDemo(String worknum){

		this.worknum = worknum;
	
	
	}

	public void run(){
	System.out.println(Thread.currentThread().getName() + "startTask" + worknum);
	
	workAssign();

	System.out.println(Thread.currentThread().getName() + "EndTask" + worknum);
	}

	void workAssign(){
	
	try{
	
		Thread.sleep(3000);
	
	}catch (InterruptedException ie){
	
	}
}
}

class Demo{

public static void main(String[] args){

	ExecutorService es = Executors.newFixedThreadPool(10);

	for(int i=0;i<30;i++){
	
	ThreadDemo work = new ThreadDemo("" +i);
	
	es.execute(work);
	
	}

	es.shutdown();

}
}
