package com.iluwatar.command;

import java.util.ArrayDeque;
import java.util.Deque;

// This one plays the Invoker role
// Stores and triggers commands. Never reads the order content.
public class Waiter {

  private final Deque<Command> orderHistory = new ArrayDeque<>();

  public void takeOrder(Command command) {
    orderHistory.push(command);
    command.execute();
  }

  public void undoLastOrder() {
    if (!orderHistory.isEmpty()) {
      orderHistory.pop().undo();
    }
  }
}