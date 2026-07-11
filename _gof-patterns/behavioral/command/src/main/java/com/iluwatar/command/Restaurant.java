package com.iluwatar.command;

// Plays the Client role
// Knows the concrete classes. Creates commands. Configures the invoker.
public class Restaurant {

  public static void main(String[] args) {
    Kitchen kitchen = new Kitchen();               // receiver
    Waiter waiter = new Waiter();                  // invoker

    Command pasta = new OrderDishCommand(kitchen, "Pasta Carbonara");
    Command steak = new OrderDishCommand(kitchen, "Ribeye Steak");

    waiter.takeOrder(pasta);   // Kitchen: preparing Pasta Carbonara
    waiter.takeOrder(steak);   // Kitchen: preparing Ribeye Steak

    waiter.undoLastOrder();    // Kitchen: cancelling Ribeye Steak
  }
}