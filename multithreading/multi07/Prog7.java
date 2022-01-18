class ThreadDemo extends Thread{

ThreadDemo(ThreadGroup tg,String name){

	super(tg,name);
}

public void run(){

System.out.println(Thread.currentThread().getName());




}

}




class Demo{

public static void main(String[] args){

	ThreadGroup tg = new ThreadGroup("ParentGroup");

	ThreadDemo t1 = new ThreadDemo(tg,"One");
	ThreadDemo t2 = new ThreadDemo(tg,"Two");
	ThreadDemo t3 = new ThreadDemo(tg,"Three");
       		
	System.out.println(tg.activeCount());

	t1.start();
	t2.start();
	t3.start();

	 
	System.out.println(tg.activeCount());

}


}


