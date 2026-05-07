package com.iluwatar.command;

// Holds the receiver reference + everything needed to do the job
public class OrderDishCommand implements Command {

  private final Kitchen kitchen;   // receiver
  private final String dish;       // parameter baked in at creation time

  public OrderDishCommand(Kitchen kitchen, String dish) {
    this.kitchen = kitchen;
    this.dish = dish;
  }

  @Override
  public void execute() {
    kitchen.prepareDish(dish);
  }

  @Override
  public void undo() {
    kitchen.cancelDish(dish);
  }
}
