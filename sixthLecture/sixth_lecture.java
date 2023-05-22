package sixthLecture;

import FifthLecture.*;

public class sixth_lecture {
	
	public static void main(String[] args) {

//		SubCarClass aSubCar= new SubCarClass("Nissan","uradhura","abcd",2011,1000,10,100,"green");
//		CarClass aCar= new CarClass("MITSUBISHI","Lancer","poiu",2500,20,2013);
//		aCar.printAllInfo();
//		aSubCar.manufacturerName="fucking beach";
////		aSubCar.EngineCC=200000;
//		System.out.println("\n\n");
//		aSubCar.printAllInfo();
		AnotherSubCar sixthLectureCar=new AnotherSubCar("Hero","Glamour","hrro",125,14);
		sixthLectureCar.printAllInfo();
		sixthLectureCar.addAmountOfFuel(12);
		System.out.println("Fuel : "+sixthLectureCar.presentAmountOfFuel());
		System.out.println("Model Name : "+sixthLectureCar.getCarModelName());
		System.out.println("Year : " +sixthLectureCar.getManufacturingYear());
	}
	
}
