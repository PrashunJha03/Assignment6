package overloading;


class Vehicle
{
	String vehicleNumber;
	String brand;
	double rentPerDay;
	
//	Vehicle(String vehicleNumber, String brand, double rentPerDay)
//	{
//		this.vehicleNumber = vehicleNumber;
//		this.brand = brand;
//		this.rentPerDay = rentPerDay;
//	}
	
	double calculateRent(int days)
	{
		return rentPerDay * days;
	}
	
	void displayDetails()
	{
		System.out.println("Vehicle Number : "+ vehicleNumber);
		System.out.println("Brand : "+ brand);
		System.out.println("Rent Per Day : "+ rentPerDay);
	}
}


class Car extends Vehicle
{
	int numberOfSeats;
	double insuranceCharge;
	
//	Car(String vehicleNumber, String brand, double rentPerDay, int numberOfSeats, double insuranceCharge )
//	{
//		super(vehicleNumber, brand, rentPerDay);
//		
//		this.numberOfSeats = numberOfSeats;
//		this.insuranceCharge = insuranceCharge;
//	}
	
	@Override
	double calculateRent(int days)
	{
		double amount = (rentPerDay * days ) + insuranceCharge;
		return amount;
	}
	
	void displayDetails()
	{
		super.displayDetails();
		System.out.println("Number of Seats : " + numberOfSeats);
		System.out.println("Insurance Charge : "+ insuranceCharge);
	}
 }


class Bike extends Vehicle
{
	int helmetCount;
	double maintenanceCharge;
	
//	Bike(String vehicleNumber, String brand, double rentPerDay, int helmetCount, double maintenanceCharge )
//	{
//		super(vehicleNumber, brand, rentPerDay);
//		
//		this.helmetCount = helmetCount;
//		this.maintenanceCharge = maintenanceCharge;
//	}
//	
	@Override
	double calculateRent(int days)
	{
		double amount = (rentPerDay * days ) + maintenanceCharge;
		return amount;
		
	}
	void displayDetails()
	{
		super.displayDetails();
		System.out.println("Number of Helmets : " + helmetCount);
		System.out.println("Maintenance Charge : "+ maintenanceCharge);
	}
}




public class VehicleRentalSystem {
	public static void main(String[] args) {
		
		Car c = new Car();
		
		c.vehicleNumber= "BR 10A 6789";
		c.brand = "Toyota";
		c.rentPerDay = 1000;
		c.numberOfSeats = 6;
		c.insuranceCharge = 500;
		int carDays = 2;
		
		
		System.out.println("-----------Car Details-------------");
		c.displayDetails();
		System.out.println("Number of Days : "+ carDays);
		System.out.println("Total Rent : "+ c.calculateRent(carDays));
		
		
		
		
		Bike b = new Bike();
		
		b.vehicleNumber = "BR 10 0001";
		b.brand = "Kawasaki";
		b.rentPerDay = 5000;
		b.helmetCount = 2;
		b.maintenanceCharge = 500;
		int bikeDays = 5;
		
		System.out.println("\n-----------Bike Details-------------");
		b.displayDetails();
		System.out.println("Number of Days : "+ bikeDays);
		System.out.println("Total Rent : "+ b.calculateRent(bikeDays));
		
		
		
	}

}
