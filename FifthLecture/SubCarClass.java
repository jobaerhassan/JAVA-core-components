package FifthLecture;

public class SubCarClass extends CarClass {
	private float chargeInBattery;
	final float chargeConPersec = 1;
	private String colorsString;
	public SubCarClass() {
		super();
		
	}
	public SubCarClass(String manu,String model, String key, int cc, int fuel,int charge,String color) {
		super(manu, model, key, cc, fuel);
		chargeInBattery = charge;
		colorsString=color;
	}
	public SubCarClass(String manu,String model, String key,int year,  int cc, int fuel,int charge,String color) {
		this(manu, model, key, cc, fuel, charge, color);
		manufacturingYear = year;
	}
	public float getChargeInBattery() {
		return chargeInBattery;
	}
	public void setChargeInBattery(float chargeInBattery) {
		this.chargeInBattery = chargeInBattery;
	}
	public String getColorsString() {
		return colorsString;
	}
	public void consumpedCharge(int time)
	{
		chargeInBattery-=chargeConPersec*time;
	}
	public void setColorsString(String colorsString) {
		this.colorsString = colorsString;
	}
	@Override
	public void printAllInfo()
	{
		super.printAllInfo();
		System.out.println("color of the car : " +getColorsString());
//		anotherCar.consumpedCharge(30);
		System.out.println("Charge in battery : " +getChargeInBattery());
		System.out.println("\n\n");
	}
}
