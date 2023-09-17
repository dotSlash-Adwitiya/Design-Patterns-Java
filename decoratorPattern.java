

interface Burger {
  public double cost();
  public String name();
}

class VegBurger implements Burger {

  @Override
  public double cost() {
    return 59.0;
  }
  @Override
  public String name() {
    return "Vegetable Burger";
  }

}

interface BurgerDecorator{

  //* Cost increased by 10Rs after Decorating the burger with Cheese ! */
  double cost(Burger burger);

  String addCheese(Burger burger);
}

class BurgerDecoratorImple implements BurgerDecorator    {

    @Override
    public double cost(Burger burger) {
        return burger.cost();
    }

    @Override
    public String addCheese(Burger burger) {
        //* Add additional charges for the cheese */
        double costWithCheese = burger.cost() + 10; 
        return "cheese added to the " + burger.name() + ", Total Cost: " + costWithCheese + "/-";
    }
}

public class decoratorPattern {
  public static void main(String[] args) {
      Burger burger1 = new VegBurger();
      Burger burger2 = new VegBurger();
      
      BurgerDecorator burgerWithCheese = new BurgerDecoratorImple(); 
      System.out.print(burgerWithCheese.addCheese(burger1));

      System.out.print("\nCost of the burger2 without cheese : " + burgerWithCheese.cost(burger2));
  }
}
