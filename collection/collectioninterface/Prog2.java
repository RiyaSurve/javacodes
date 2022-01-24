/*As in previous all examples we passed built in class objects to ArrayList .Now we will pass
 * userdefined class objects to ArrayList*/

import java.util.*;

class ITCompany{

	String cname = null;
	int empNo;

	ITCompany(String cname,int empNo){

		this.cname = cname;
		this.empNo = empNo;

	}

	void info(){

		System.out.println("Company name: "+cname+ " and Total Employees: "+empNo);

	}
}

class Demo{

	public static void main(String[] args){

		ArrayList al = new ArrayList();
		al.add(new ITCompany("Microsoft",500));
		al.add(new ITCompany("Google",400));
		al.add(new ITCompany("Amazon",200));

		/*System.out.println(al); //If we print this we will get
		  [ITCompany@76ed5528, ITCompany@2c7b84de, ITCompany@3fee733d]*/

		//Thus we make use of ListIterator

		ListIterator litr = al.listIterator();
		while(litr.hasNext()){

			ITCompany obj =	(ITCompany)litr.next();  //Typecasting it into our user de									fined class.			
			obj.info();
		}


	}

}
