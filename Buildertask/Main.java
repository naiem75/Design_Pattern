package tasks.task3_builder;

public class Main {
  public static void main(String[] args) {
    BurgerBuilder builder = new BurgerBuilder("Classic Burger");

    Burger burger = builder
            .addLettuce()
            .addTomato()
            .addCheese()
            .build();

    System.out.println(burger.getDescription());
  }
}