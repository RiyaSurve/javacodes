import java.util.*;
class CovidCount{

	String day = null;
	int count;

	CovidCount(String day,int count){

		this.day = day;
		this.count = count;

	}

	void info(){

		System.out.println("Count of "+day+ ": "+count);
	}

}

class Demo{

	public static void main(String[] args){

		ArrayList al = new ArrayList();
		al.add(new CovidCount("Monday",2000));
		al.add(new CovidCount("Tuesday",4000));
		al.add(new CovidCount("Wednesday",6000));

		Iterator itr = al.iterator();
		while(itr.hasNext()){

			CovidCount obj = (CovidCount)itr.next();
			obj.info();

		}


	}

}
