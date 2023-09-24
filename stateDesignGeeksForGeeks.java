
interface State {
  public void changeState(Car car);
}

class ConcreteState1 implements State {
  Car car;
  public void changeState(Car car) {
      System.out.println("Car is Started");
      car.setState(this);	
  }
  public String toString() {
    return "Start State";
  }
}

class ConcreteState2 implements State {
  Car car;
  public void changeState(Car car) {
      System.out.println("Car is Stopped");
      car.setState(this);	
  }

  public String toString() {
    return "Stopped State";
  }
}

class Car {
  private State state;

  public void setState(State state) {
    this.state = state;
  }

  public State getState() {
    return this.state;
  }

}


public class stateDesignGeeksForGeeks {
    public static void main(String args[]) {
      Car car = new Car();
      State startState = new ConcreteState1();
      startState.changeState(car); 

      State stopState = new ConcreteState2();
      stopState.changeState(car); 
    }
}
