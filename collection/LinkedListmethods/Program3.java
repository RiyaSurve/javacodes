/* Passing user defined object to LinkedList */
import java.util.*;

class BigBazaar{

	String product = null;
	float price;

	BigBazaar(String product,float price){

		this.product = product;
		this.price = price;
	}

	void info(){

		System.out.println("Product: "+ product + " " + "Price: " +price);

	}
}
class Demo{

	public static void main(String[] args){

		LinkedList li = new LinkedList();
		li.add(new BigBazaar("Gahoo",45.5f));
		li.add(new BigBazaar("Tandool",50.0f));
		li.add(new BigBazaar("Bajari",60.50f));
		li.add(new BigBazaar("Jwari",55.50f));

		Iterator itr = li.iterator();
		while(itr.hasNext()){

			BigBazaar obj = (BigBazaar)itr.next();
			obj.info();

		}
	}


}
