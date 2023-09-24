
//* Template */
interface Template {
  public void performTask1();
  public void performTask2();
}

//* Concrete implementations - 1 */
class ConcreteImple implements Template{
  public void performTask1() {
    System.out.println("This is task 1 ");
  }

  public void performTask2() {
    System.out.println("This is task 2 ");
  }
}

public class TemplateDesignGeeksForGeeks {
  public static void main(String args[]) {
      Template temp = new ConcreteImple();
      temp.performTask1();
      temp.performTask2();
  }
}
