package sixthLecture;

import FifthLecture.CarClass;
import FifthLecture.SubCarClass;

public class AnotherSubCar extends CarClass implements CarInterface{
		public AnotherSubCar()
		{
			super();
		}
		public AnotherSubCar(String name)
		{
			super(name);
		}
		public AnotherSubCar(String manu, String model, String key, int cc, float fuel)
		{
			super(manu, model, key, cc, fuel);
		}
		public AnotherSubCar(String manu, String model, String key, int cc, float fuel,int year)//polymorphism
		{
			this(manu, model, key, cc, fuel);
			manufacturingYear=year;
		}

		@Override
		public void driveCar(int drivingTimeInSecond) {
			// TODO Auto-generated method stub
			runForSeconds(drivingTimeInSecond);
			
			
		}

		@Override
		public void addAmountOfFuel(int amount) {
			// TODO Auto-generated method stub
			addFuel(amount);
		}

		@Override
		public int getManufacturingYear() {
			// TODO Auto-generated method stub
			return manufacturingYear;
		}

		@Override
		public String getCarModelName() {
			// TODO Auto-generated method stub
			return getModelName();
		}
		
}
