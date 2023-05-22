package FifthLecture;

public class CarClass {
		public String manufacturerName;
		private String modelName;
		private String carKeyValue;
		final public float amountOfFuelConsumedPerSecond = 0.2f;
		int EngineCC;
//		public float carWeight;
		public float fuelAmount;
		int enginefuel = 10;
		
		
		
		//protected variable
		
		
		
		protected int manufacturingYear;
		public CarClass() {
			manufacturerName=new String("fuck");
			modelName=new String();
			carKeyValue = "qq";
			EngineCC=0;
//			carWeight=0;
			fuelAmount=0;  
			manufacturingYear=0;
		}
		public CarClass(String name)
		{
			manufacturerName=new String(name);
			modelName=new String();
			EngineCC=0;
//			carWeight=0;
			fuelAmount=0;
			manufacturingYear=0;
		}
		public CarClass(String manu, String model, String key, int cc, float fuel)
		{
			manufacturerName=manu;
			modelName=model;
			carKeyValue=key;
			EngineCC=cc;
			fuelAmount=fuel;
			manufacturingYear=0;
		}
		public CarClass(String manu, String model, String key, int cc, float fuel,int year)//polymorphism
		{
			this(manu, model, key, cc, fuel);
			manufacturingYear=year;
		}
		public String getManufacturerName()
		{
			return manufacturerName;
		}
		public void addFuel(float fuelAmount)
		{
			this.fuelAmount+= fuelAmount;
		}
		public void  runForSeconds(int time) {
			float usedFuel =time* amountOfFuelConsumedPerSecond;
			fuelAmount -= usedFuel;
		}
		
		public float  presentAmountOfFuel() {
			return fuelAmount;
		}
		public String getModelName()
		{
			return modelName;
		}
		public boolean matchPassword(String userInput)
		{
			return userInput.equals(carKeyValue);
		}
		public void printAllInfo()
		{
			System.out.println("Manufacturer name: "+manufacturerName);
			System.out.println("Fuel Amount is : "+fuelAmount);
			System.out.println("engineCC is : "+EngineCC);
//			anotherCar = new SubCarClass("mazda", "7 series", "abcd", 1000, 50, 100, "green");
//			System.out.println(presentAmountOfFuel());
//			anotherCar.fuelComsumped(30);
			System.out.println("Model name is : " +getModelName());
		}
		public void addAmountOfFuel() {
			// TODO Auto-generated method stub
			
		}
}
