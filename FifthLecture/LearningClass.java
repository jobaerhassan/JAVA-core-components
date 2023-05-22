package FifthLecture;

import sixthLecture.AnotherSubClass;

public class LearningClass {

	static private CarClass ourCar = new CarClass(); 
	static private CarClass ourAnotherCar;
	static private SubCarClass anotherCar;
	public static void main(String[] args) {
		ourAnotherCar = new CarClass("Toyota", "alion", "qwerty", 1000, 30);
//		System.out.println(ourAnotherCar.manufacturerName);
//		System.out.println(ourAnotherCar.modelName);
//		System.out.println(ourCar.matchPassword("qq"));
////		ourAnotherCar.
//		
//		System.out.println("\n\n");
//		ourAnotherCar.fuelComsumped(5);
//		System.out.println(ourAnotherCar.fuelAmount);
		anotherCar = new SubCarClass("mazda", "7 series", "abcd", 1000, 50, 100, "green");
//		System.out.println(anotherCar.presentAmountOfFuel());
//		anotherCar.fuelComsumped(30);
//		System.out.println(anotherCar.presentAmountOfFuel());
//		System.out.println(anotherCar.getChargeInBattery());
//		anotherCar.consumpedCharge(30);
//		System.out.println(anotherCar.getChargeInBattery());
		
		
		CarClass newcar=new CarClass("toyota","hiace","050",1200,80);
		SubCarClass newsubCar= new SubCarClass("Marcedes","Benz","abcd",3000, 200,100,"grey");
		ourAnotherCar.printAllInfo();
		anotherCar.printAllInfo();
		newcar.printAllInfo();
		newsubCar.printAllInfo();
		AnotherSubClass anSub=new AnotherSubClass();
	
	}

}
