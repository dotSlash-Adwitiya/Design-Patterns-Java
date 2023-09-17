//* Generalized entity
interface Vehicle {
  abstract public void drive();
}

//* Concrete class that provides implementation
class Car implements Vehicle {
  @Override
  public void drive() {
    System.out.println("Driving a Car");
  }
}

//* Concrete class that provides implementation
class Bike implements Vehicle {
  @Override
  public void drive() {
    System.out.println("Driving a Bike");
  }
}

//* Factory
interface VehicleFactory {
  public Vehicle createVehicle();
}

//* Factory for entity 1
class CarFactory implements VehicleFactory{
  @Override
  public Vehicle createVehicle() {
    return new Car();
  }
}

//* Factory for entity 2
class BikeFactory implements VehicleFactory{
  @Override
  public Vehicle createVehicle() {
    return new Bike();
  }
}


public class factoryPattern {
  public static void main(String[] args) {
    //* Step-1 Get a new carFactory */
    VehicleFactory carFactory = new CarFactory();
    VehicleFactory bikeFactory = new BikeFactory();
    
    //* Fetch a Car and a Bike from both factories */
    Vehicle car = carFactory.createVehicle();
    Vehicle bike = bikeFactory.createVehicle();

    //* Call the drive methods */
    car.drive();
    bike.drive();

  }
}