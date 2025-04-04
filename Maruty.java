import java.util.Scanner;
class Vehicle {
	int mileage;
	double price;
	Vehicle(int mileage, double price) {
		this.mileage=mileage;
		this.price=price;
	}
}
class Car extends Vehicle {
	double own_cost;
	String warranty;
	int capacity;
	String fuel;
	Car(int mileage, double price, double own_cost, String warranty, int capacity, String fuel){
		super(mileage, price);
		this.own_cost=own_cost;
		this.warranty=warranty;
		this.capacity=capacity;
		this.fuel=fuel;
	}
}
class Maruty extends Car {
	String model;
	Maruty(int mileage, double price, double own_cost, String warranty, int capacity, String fuel, String model){
	super(mileage, price, own_cost, warranty, capacity, fuel);

	this.model=model;
	}
	void display(){
		System.out.println("Mileage    :"+mileage);
		System.out.println("Price      :"+price);
		System.out.println("Owner cost :"+own_cost);
		System.out.println("Warranty   :"+warranty);
		System.out.println("Capacity   :"+capacity);
		System.out.println("Fuel Type  :"+fuel);
		System.out.println("Model      :"+model);
}
	public static void main(String args[]){
		System.out.println("\nEnter the number of Maruty cars:");
		Scanner sc1 = new Scanner(System.in);
		int num = sc1.nextInt();
		Maruty[] marutycars = new Maruty[num];

		for (int i = 0; i < num; i++){
			Scanner sc = new Scanner(System.in);
			System.out.println("\nEnter the detaiils of Maruty cars:");
			System.out.println("\nMileage         :");
			int mileage = sc.nextInt();
			System.out.println("\nPrice	      :");
			double price = sc.nextDouble();
			System.out.println("\nOwner cost      :");
			double own_cost = sc.nextDouble();
			System.out.println("\nwarranty        :");
			String warranty = sc.next();
			System.out.println("\nCapacity        :");
			int capacity = sc.nextInt();
			System.out.println("\nFuel Type       :");
			String fuel = sc.next();
			System.out.println("\nModel of the car:");
			String model = sc.next();
			marutycars[i] = new Maruty(mileage,price,own_cost,warranty,capacity,fuel,model);
	}
	
	System.out.println("\n *********** Information about maruty Cars**********");
	for(int i = 0; i < num; i++)
		marutycars[i].display();
}
	
	
	

}	