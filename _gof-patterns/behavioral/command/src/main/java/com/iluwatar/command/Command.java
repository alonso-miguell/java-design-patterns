package com.iluwatar.command;

// The contract every order slip must honour
public interface Command {
  void execute();
  void undo();      // the big GoF bonus — you can cancel orders
}
