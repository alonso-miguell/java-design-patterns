package com.iluwatar.visitor.shapes;

public interface Shape {
  void move(int x, int y);
  void draw();

  // we need an accept method for passing the visitor
  String accept(Visitor visitor);
}