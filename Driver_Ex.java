package jang12;

public class Driver_Ex 
{
	public static void main(String[] args) 
	{
		Driver11 driver = new Driver11();
		
		Bus11 bus = new Bus11();
		Taxi11 taxi = new Taxi11();
		
		driver.drive(bus);
		driver.drive(taxi);
	}

}
