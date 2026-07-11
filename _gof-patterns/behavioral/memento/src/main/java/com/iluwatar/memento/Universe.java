package com.iluwatar.memento;

import lombok.extern.slf4j.Slf4j;
import java.util.Stack;

/**
 * This class acts as a caretaker
 */
@Slf4j
public class Universe {
  private final Stack<StarMemento> undo = new Stack<>();
  private final Stack<StarMemento> redo = new Stack<>();
  private final Star star;

  Universe(Star star) {
    this.star = star;
  }

  public void passTime() {
    undo.push(star.getMemento());
    redo.clear();

    star.timePasses();
    LOGGER.info("passTime --> {}", star.toString());
  }

  public void reverseTime() {
    if (undo.empty()) return;

    redo.push(star.getMemento());
    star.setMemento(undo.pop());
    LOGGER.info("reverseTime --> {}", star.toString());
  }

  public void redoTime() {
    if (redo.empty()) return;

    undo.push(star.getMemento());
    star.setMemento(redo.pop());
    LOGGER.info("redoTime --> {}", star.toString());
  }
}