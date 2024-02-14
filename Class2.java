class Car{
    int wheels;
    {
        wheels=4;
    }
    String company;
    String model;
    String fuelType;
    int seatCapacity;
    public Car(String company, String model, String fuelType, int seatCapacity){
        this.company=company;
        this.model=model;
        this.fuelType=fuelType;
        this.seatCapacity=seatCapacity;
    }
    void printDetails(){
        System.out.println("Car Details");
        System.out.println("Company: "+company+"\nModel: "+model+"\nFuel Type: "+fuelType+"\nWheels: "+wheels+"\nSeat Capacity: "+seatCapacity);
    }
}
public class Class2 {
    public static void main(String[] args){
        Car c1=new Car("Tata","Safari","Petrol",7);
        c1.printDetails();
    }
}