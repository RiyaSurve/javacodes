public class Sununiverse{

	static int gardenArea = 2000;
	static int waterTank = 1000;
	int TV = 1;


	static void gardenArea(){

		System.out.println(gardenArea);

	}

	void waterTank(){
		System.out.println(waterTank);
	}


	void TV(){

		System.out.println(TV);
	}


	public static void main(String[] args){

		System.out.println("Main method!!");
		System.out.println(gardenArea);
		System.out.println(waterTank);
		//	System.out.println(TV); //error

		Sununiverse F101 = new Sununiverse();
		System.out.println(F101.TV);
		F101.TV();

		gardenArea();

		System.out.println("Changing Values!!!");
		F101.TV = 0;
		F101.TV();//0
		


	}




}	
