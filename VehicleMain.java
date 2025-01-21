class Vehicle {
    protected int wheels;
    protected int speed;

    public Vehicle(int wheels, int speed) {
        this.wheels = wheels;
        this.speed = speed;
    }

    public void displayInfo() {
        System.out.println("Number of wheels: " + wheels);
        System.out.println("Speed: " + speed);
    }
}

class Car extends Vehicle {
    private int passengers;

    public Car(int wheels, int speed, int passengers) {
        super(wheels, speed);
        this.passengers = passengers;
    }

    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of passengers: " + passengers);
    }
}

class Truck extends Vehicle {
    private int loadLimit;

    public Truck(int wheels, int speed, int loadLimit) {
        super(wheels, speed);
        this.loadLimit = loadLimit;
    }

    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Load limit: " + loadLimit);
    }
}

public class VehicleMain {
    public static void main(String[] args) {
        Car car = new Car(4, 120, 5);
        Truck truck = new Truck(6, 80, 1000);

        System.out.println("Car Information:");
        car.displayInfo();
        System.out.println("\nTruck Information:");
        truck.displayInfo();

        if (car.speed > truck.speed) {
            System.out.println("\nCar is faster than the Truck.");
        } else if (car.speed < truck.speed) {
            System.out.println("\nTruck is faster than the Car.");
        } else {
            System.out.println("\nBoth Car and Truck have the same speed.");
        }
    }
}
